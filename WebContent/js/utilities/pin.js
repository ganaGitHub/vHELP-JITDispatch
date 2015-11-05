var contentstring = [];
var regionlocation = [];
var markers = [];
var marker;
var iterator = 0;
var areaiterator = 0;
var map;
var infowindow = [];
var flag = "START";
geocoder = new google.maps.Geocoder();
var slat,slong;
var route;
		
$(document).ready(function () {
	setTimeout(function() { initialize(); }, 400);
});

function loadXMLDoc()
{
 	var xmlhttp;
 	//alert("Hei");
	
	var urls="/vHELP-JITDispatch/CreateRequestAction?param=ajax&rand=" + Math.random();
	if(window.XMLHttpRequest)
		{
		xmlhttp=new XMLHttpRequest();
		}
	else
		{
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
			xmlhttp.open("GET",urls,false);
			xmlhttp.send();
			//alert(xmlhttp.responseText);
			
			if (flag=="START" && xmlhttp.responseText != "STOP")
				{
				//alert("Hai");
					var x = xmlhttp.responseText.split(",");
					flag=x[0];
					slat = x[1];
					slong = x[2];
					//setTechLocations("Ajax," + slat + "," + slong + ",1", "1");
					document.getElementById("sTechnicianLatLongListID").value = "Ajax," + slat + "," + slong + ",1";
					document.getElementById("technicianLatLongListLengthID").value = "1";
					setTimeout(function() { autoRefresh(); }, 3000);
				}
			else
				{
				flag="STOP";
				//alert("TEST");
					//return;
					drop();
				}
						
}
			


function initialize() {
	//alert("INIT");
	var technicianLatLongList = document.getElementById("sTechnicianLatLongListID").value;
	// alert("technicianLatLongList: " + technicianLatLongList);
	
	var technicianLatLongListLength = document.getElementById("technicianLatLongListLengthID").value;
	// alert("technicianLatLongListLength: " + technicianLatLongListLength);
	
	var sUserName = document.getElementById("sUserNameID").value;
	// alert("sUserName: " + sUserName);
	
	infowindow = [];
	markers = [];
	setTechLocations(technicianLatLongList, technicianLatLongListLength);
	iterator = 0;
	areaiterator = 0;
	region = new google.maps.LatLng(regionlocation[areaiterator].split(',')[0], regionlocation[areaiterator].split(',')[1]);
	map = new google.maps.Map(document.getElementById("Map"), { 
		zoom: 17,
		mapTypeId: google.maps.MapTypeId.ROADMAP,
		center: region,
	});
	route = new google.maps.Polyline({
		path: [],
		geodesic : true,
		strokeColor: '#FF0000',
		strokeOpacity: 1.0,
		strokeWeight: 2,
		editable: false,
		map:map
	});
	addUserMarker();
	if (technicianLatLongListLength == "1")
	{
		marker=new google.maps.Marker({map:map, icon:"images/Repair.png"});
		usermarker=new google.maps.Marker({map:map, icon:"images/help.png"});
		var userLatLongStr = document.getElementById("userLatLongStrID").value;
		var userLatLongStrArray = userLatLongStr.split(",");
		//alert("userLatLongStr: " + userLatLongStr);
		
	    var templat = userLatLongStrArray[0];
	    var templong = userLatLongStrArray[1];
	    var temp_latLng = new google.maps.LatLng(templat, templong);
	    usermarker.setPosition(temp_latLng);
		//map.markers[0].setMap(null);
		loadXMLDoc();
	}
	else
		drop();	
}

function setTechLocations(technicianLatLongList, technicianLatLongListLength) {
	var technicianLatLongArray = technicianLatLongList.split(",");
	var technicianLatLongArrayLength = technicianLatLongArray.length;
	
	//alert("Pleasse");
	var j = 0;
	for (var i = 0; i < technicianLatLongArrayLength; i = i + 4) {
	    contentstring[j] = technicianLatLongArray[i];
	    regionlocation[j] = technicianLatLongArray[i + 1] + ", " + technicianLatLongArray[i + 2];
	    //alert("contentstring[" + j + "]: " + contentstring[j]);
	    //alert("regionlocation[" + j + "]: " + regionlocation[j]);
	    j++;
	 }	
}

function moveMarker(latlng) {
	marker.setPosition(latlng);
	map.panTo(latlng);
}

function autoRefresh() {
	//alert("Pleasse2");
		setTimeout(function() {
			var coords = new google.maps.LatLng(slat,slong);
			route.getPath().push(coords);
			moveMarker(coords);
			if (flag=="START")
				loadXMLDoc();
		}, 3000);
}
	   
function drop() {
	//alert("Pleasse1");
	for (var i = 0; i < contentstring.length; i++) {
		setTimeout(function() {
			addMarker();
		}, 800);
	}
	
	

}

function addUserMarker() {
	var userLatLongStr = document.getElementById("userLatLongStrID").value;
	var userLatLongStrArray = userLatLongStr.split(",");
	// alert("userLatLongStr: " + userLatLongStr);
	
    var templat = userLatLongStrArray[0];
    var templong = userLatLongStrArray[1];
    var temp_latLng = new google.maps.LatLng(templat, templong);
    markers.push(new google.maps.Marker(
    {
                    position: temp_latLng,
                    map: map,
                    icon: 'images/help.png',
                    draggable: false
    }));                                          
}

function addMarker() {
	var address = contentstring[areaiterator];
	//var icons = 'http://maps.google.com/mapfiles/ms/icons/red-dot.png';
	var templat = regionlocation[areaiterator].split(',')[0];
	var templong = regionlocation[areaiterator].split(',')[1];
	var temp_latLng = new google.maps.LatLng(templat, templong);
	markers.push(new google.maps.Marker(
	{
		position: temp_latLng,
		map: map,
		icon: 'images/Repair.png',
		draggable: false
	}));            
	iterator++;
	info(iterator);
	areaiterator++;
}

function info(i) {
	infowindow[i] = new google.maps.InfoWindow({
		content: contentstring[i - 1]
	});
	infowindow[i].content = contentstring[i - 1];
	google.maps.event.addListener(markers[i - 1], 'click', function() {
		for (var j = 1; j < contentstring.length + 1; j++) {
			infowindow[j].close();
		}
		infowindow[i].open(map, markers[i - 1]);
	});
}