<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.min.js" ></script>
</head>
<body>
  First name: <input id="msg" type="text" name="fname"><br>
<button id="mybutton" type="button">Click Me!</button>
<script>
$( document ).ready(function() {
    console.log( "ready!" );
    $('#mybutton').unbind().click(function(){
    	var abc = $('#msg').val();
    	console.log('abc is '+abc);
    	$.get( "producerservlet",{val:abc}, function( data ) {
    		  alert( "Load was performed."+data);
    		});
    });
});
</script>
</body>
</html>