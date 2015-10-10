<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="http://code.jquery.com/jquery-1.10.2.min.js" type="text/javascript" ></script>
            <script type="text/javascript">
            var info = $('#info').val();
                                            var clientId = $("#positions option:selected").val();
            								alert(info);
                				function addUser() {

                                var info = $('#info').val();
                                var clientId = $("#positions option:selected").val();
								alert(info);
                                $.ajax({
                                    type: "POST",
                                    url: "${pageContext.request.contextPath}/user/addajax.htm",
                                    data: "username=" + name+"&positionid="+positionid+"&groupid="+groupid,
                                    success: function(response){
                                        $('#info').html(response);
                                        $('#name').val('');

                                    },
                                    error: function(e){
                                        alert('Error: ' + e);
                                    }
                                });
                            }
                            function deleteUser(id){

                                $.ajax({
                                    type: "POST",
                                    url: "${pageContext.request.contextPath}/user/deleteajax.htm",
                                    data: "clientid=" + 3,
                                    success: function(response){
                                        $('#info').html(response);

                                    },
                                    error: function(e){
                                        alert('Error: ' + e);
                                    }
                                });
                            }
            </script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Task</title>
</head>
<body>
<h1>Client Data</h1>
<form:form action="client.do" method="POST" commandName="client">
	<table>
		<tr>
			<td>Info</td>
			<td><form:input path="info"/></td>
			<td colspan="2">
				<input id = "test" type = "submit" name="action" value="Add" />
			</td>



		</tr>
	</table>
</form:form>
<br>
<table border="1" width="400">
	<th>Information</th>
	<c:forEach items="${clientList}" var="client">
		<tr>
			<td>${client.info}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>