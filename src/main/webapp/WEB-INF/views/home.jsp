<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Room Viewer</title>
	<link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/home.css"/>" >
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="jumbotron text-center">
	  <h3>Room Viewer</h3>
	</div>
	<div class="container">
		<form class="form-inline">
			 <div class="form-group">
	          <div class="col-sm-10">
	            <select  name="floorNo" id="floorNo" class="form-control">
	              <option value="">Please select a floor</option>
	              <option value="1">1st Floor</option>
	              <option value="2">2nd Floor</option>
	            </select>
	          </div>
	        </div>
			 <button class="btn btn-primary regBtn">Submit</button>
    	</form>
	</div>

    <div class="container">
    	<canvas id="myCanvas" width="1000" height="380"></canvas>
    	<div id="myLegend"></div> 	
    </div>
 	<script type="text/javascript" src="<spring:url value="/resources/js/index.js"/>"></script>
    <script>
	    $('document').ready(function(){
	    	var t = [];
	    	$('.regBtn').click(function(e){
	    		e.preventDefault();
	    		var url = "<spring:url value="/rooms/"/>";
	    		var floorNo = $('#floorNo').val();
	    		url = url + floorNo;
	    		$.get(url, {}, function(response){
	    			document.getElementById('myLegend').innerHTML = "<div><span style='display:inline-block;width:20px;background-color:#99ccff;'>&nbsp;</span> High>60% &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style='display:inline-block;width:20px;background-color:#ffcc99;'>&nbsp;</span> Medium30-60%%&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style='display:inline-block;width:20px;background-color:#99ff99;'>&nbsp;</span> Low<30%</div>";
	    			var ctx = document.getElementById('myCanvas').getContext('2d');
	    			for(i=0; i<response.length; i++) {
	    				if(response[i].occupancyPercent == 0) {
		    				ctx.clearRect(response[i].xpos,
	    							 response[i].ypos,
	    							 response[i].width,
	    							 response[i].height);
	    				} else {
	    					if(response[i].occupancyPercent <= 30){
	    						ctx.fillStyle = "#99ff99";
	    					} else if(response[i].occupancyPercent >= 40 && response[i].occupancyPercent <= 60){
	    						ctx.fillStyle = "#ffcc99";
	    					} else {
	    						ctx.fillStyle = "#99ccff";
	    					}
	    					ctx.fillRect(response[i].xpos,
	    							 response[i].ypos,
	    							 response[i].width,
	    							 response[i].height);
	    					
	    				    region = {x: response[i].xpos, y: response[i].ypos, w: response[i].width, h: response[i].height};

	    					// create a tool-tip instance:
	    					 t[i] = new ToolTip(ctx.canvas, region, "Occupancy percent:"+response[i].occupancyPercent+"%", 150, 3000);
	    				}

	    			}
	    			
	    		})
	    	});
	    });
    </script>
</body>
</html>