<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title><spring:message code="404"/></title>
</head>
<body>
<div class="layui-main">
    <div class="layui-container">
    <div class="layui-fluid">
        <div class="layui-col-md12">
            <div class="">
                <h3><strong>404</strong></h3><br>
                <img src="/images/error/404.png">
            </div>
        </div>
    </div>
    </div>
</div>
</body>
</html>