<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
     String path = request.getContextPath();
     String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<body>
	<div>
		<form action="/logger/insertlog" method="post">
			用户名：<input type="text" name="username"/><br>
			密　码：<input type="text" name="password"/><br>
			<input type="submit" name="submit" value="登陆" />
		</form>
	</div>
</body>
</html>
