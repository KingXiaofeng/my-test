<%@ page contentType="text/html; charset=utf-8"%>="form"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>403</title>
</head>
<body>
<c:if test="${requestHeader == 'ajax'}">
    <h5 style="padding-bottom: 10px;">没有权限！</h5>
</c:if>
<c:if test="${requestHeader != 'ajax'}">
<% Exception e = (Exception)request.getAttribute("ex"); %>
<h2>错误: <%= e.getClass().getSimpleName()%></h2>
<hr />
<h5>错误描述：</h5>
<p><%= e.getMessage()%></p>
</c:if>
</body>
</html>