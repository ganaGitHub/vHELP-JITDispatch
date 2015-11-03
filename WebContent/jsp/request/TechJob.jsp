<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="java.util.Hashtable" %>

<%! private static Logger logger = Logger.getLogger("JITDispatch"); %> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> vHELP - JIT Dispatch </title>
        <style type="text/css">@import url(<%=request.getContextPath()%>/css/common/common.css);</style>
		<style type="text/css">@import url(<%=request.getContextPath()%>/css/request/request.css);</style>
		<script src="http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=false" type="text/javascript"></script>
        <script src="https://maps.googleapis.com/maps/api/js?v=3.exp&amp;libraries=geometry"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/request/request.js"></script>
       		 <% 
    			String LatLongStr = (String) session.getAttribute("LatLongStr");
    			String[] latlong = null;
    			if ((LatLongStr != null) && (!LatLongStr.isEmpty()))
    				latlong = LatLongStr.split(",");
    			System.out.println("LatLongStr: " + LatLongStr);
    		%>
 <script>
	var slat,slong,tlat,tlong;
	var i, route, marker, flag;
	function loadXMLDoc(map)
	{
	 	//alert("Start");
		var xmlhttp;		
		
		var urls="/vHELP-JITDispatch/TechAction?param=init&ajax=1&rand=" + Math.random();
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
				if (xmlhttp.responseText != "STOP")
					{
						var x = xmlhttp.responseText.split(",");
						flag = x[0];
						slat = x[1];
						slong = x[2];
						tlat=x[3];
						tlong=x[4];
						autoRefresh(map);						
					}
				else
					{
						return;
					}
				
	}
	
	function init()
	{
		
		var map = new google.maps.Map(document.getElementById("map"), {
	 		  center: {lat: <%out.write(latlong[0]);%>, lng: <%out.write(latlong[1]);%>},
	 		  zoom: 17,
	 		  mapTypeId: google.maps.MapTypeId.ROADMAP
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
		//alert(<%out.write(latlong[2]);%> + "," +<%out.write(latlong[3]);%>);
		var usercoords = new google.maps.LatLng( <%out.write(latlong[2]);%>,<%out.write(latlong[3]);%>);
		var usermarker=new google.maps.Marker({map:map, icon:"images/help.png"});
		marker=new google.maps.Marker({map:map, icon:"images/Repair.png"});
		usermarker.setPosition(usercoords);
		<% if (request.getAttribute("NOAJAX") == null){ %>
			loadXMLDoc(map);
			<%} else {%>
			  var coords = new google.maps.LatLng( <%out.write(latlong[0]);%>,<%out.write(latlong[1]);%>);
			  marker.setPosition(coords);
			<%}%>
	}
	
	
	function moveMarker(map, marker, latlng) {
		marker.setPosition(latlng);
		map.panTo(latlng);
	}
	
	function autoRefresh(map) {
			
			setTimeout(function() {
				var coords = new google.maps.LatLng(slat,slong);
				route.getPath().push(coords);
				moveMarker(map, marker,coords);
				if (flag=="START")
					loadXMLDoc(map);
			}, 3000);
			
	}
	

	google.maps.event.addDomListener(window, 'load',init );
 </script>        
    </head>
    <body>
    	<form name="techJobForm">
    		
	        <jsp:include flush="true" page="../../jsp/common/menuHeader.jsp"></jsp:include>
    		<div id="fileSelectDiv">
		        <table align="center" border="0" cellpadding="10px">
	                <tr>		              
	                    <td>
	                            <%
	                            if((LatLongStr != null) && (!LatLongStr.isEmpty()))
                                {
	                            %>
	                            <input type = "button" id="jobID" name="jobName" value="Job Completed" onClick="jobDone();"/>
	                            
	                              <div id="map" style="width: 921px; height: 329px;"></div>	                              
	                              	                            
	                            <%
                                }
	                            else
	                            {
	                            %>
	                            You have no pending requests
	                            <%
	                            }
	                            %>
	                    </td>
	                </tr>
			    </table>
		    </div>
            
            <br>
        </form>
		<jsp:include flush="true" page="../../jsp/common/footer.jsp"></jsp:include>
    </body>
</html>