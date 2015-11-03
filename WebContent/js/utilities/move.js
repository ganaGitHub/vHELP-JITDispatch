		function loadXMLDoc()
		{
			var xmlhttp;
			var urls="";
			if(window.XMLHttpRequest)
				{
				xmlhttp=new XMLHttpRequest();
				}
			else
				{
				xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
				}
			
			if (xmlhttp.readyState==4)
				{
					
				}
		}
		
		function initialize() {			
			var map = new google.maps.Map(document.getElementById("map"), {
			  center: {lat: 17.439054, lng: 78.381234},
			  zoom: 17,
			  mapTypeId: google.maps.MapTypeId.ROADMAP
			});
			
			getDirections(map);
		}

		function moveMarker(map, marker, latlng) {
			marker.setPosition(latlng);
			map.panTo(latlng);
		}

		function autoRefresh(map, pathCoords) {
			var i, route, marker;
			
			route = new google.maps.Polyline({
				path: [],
				geodesic : true,
				strokeColor: '#FF0000',
				strokeOpacity: 1.0,
				strokeWeight: 2,
				editable: false,
				map:map
			});
			
			marker=new google.maps.Marker({map:map, icon:"Repair.png"});

							
				setTimeout(function(coords) {
					route.getPath().push(coords);
					moveMarker(map, marker, coords);
				}, 3000 , pathCoords[i]);			
		}
		
		function getDirections(map) {
			var directionsService = new google.maps.DirectionsService();
			
			var start = new google.maps.LatLng(17.439054,78.381234);
			var end = new google.maps.LatLng(17.441389,78.380565);

			var request = {
				origin:start,
				destination:end,
				travelMode: google.maps.TravelMode.DRIVING
			};
			directionsService.route(request, function(result, status) {
				if (status == google.maps.DirectionsStatus.OK) {
					autoRefresh(map, result.routes[0].overview_path);
				}
			});
		}

		google.maps.event.addDomListener(window, 'load', initialize);
