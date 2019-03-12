<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>demo</title>
<%@include file="/resources/js/common.js"%>
</head>
<body>
	<ul id="demo"></ul>
<script>
$(function() {
	$.ajax({
		url : '/api/demo',
		type: "GET",
		contentType: "application/json",
		success: function (data) {
			console.log("data: ", data);
			var res = data.response;
			var str = "";
			
			$.each(res, function(idx, value) {
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