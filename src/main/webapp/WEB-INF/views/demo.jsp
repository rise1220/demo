<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>demo</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="/resources/test.js"></script>
</head>
<body>
	<ul id="demo"></ul>
<script>
$(function() {
	$.ajax({
		url : '/ajax/demo',
		type: "GET",
		contentType: "application/json",
		success: function (data) {
			console.log("data: ", data);
			
			var str = "";
			
			$.each(data, function(idx, value) {
				console.log("idx: ", idx);
				console.log("value.user_name: ", value.user_name);
				
				str += "<li>";
				str += value.user_name;
				str += "</li>";
			});
			
			$('#demo').html(str);
		}
	});
});
</script>
</body>
</html>