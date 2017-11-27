<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<title>Tree Demo</title>
<jsp:include page="/common/header.jsp" flush="true"/>
<div class="layui-main">
	<div class="layui-container">
		<div class="layui-fluid">
		</div>
	</div>
</div>
<script>
var layer="";
layui.use(['layer','form','tree'],function(){
	layer = layui.layer,
	tree = layui.tree,
	form = layui.form;
	var $ = layui.$;
	
	
	
});

</script>
<jsp:include page="/common/footer.jsp" flush="true"/>