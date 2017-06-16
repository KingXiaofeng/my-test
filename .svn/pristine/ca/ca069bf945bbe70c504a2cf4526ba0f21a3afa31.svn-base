<%@ page contentType="text/html; charset=utf-8" isErrorPage="true"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>错误</title>
</head>
<body>
<% Exception e = null != exception ? (Exception) exception : (Exception)request.getAttribute("ex"); %>
<h2>错误: <%= e.getClass().getSimpleName()%></h2>
<hr />
<h5>错误描述：</h5>
<%= e.getMessage()%>
<h5>错误信息：</h5>
<pre>
<% e.printStackTrace(new java.io.PrintWriter(out)); %>
</pre>
</body>
</html>