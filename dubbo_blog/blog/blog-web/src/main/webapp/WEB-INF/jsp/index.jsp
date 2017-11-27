<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<style>
	iframe{margin-left:10px;}
</style>
<jsp:include page="/common/header.jsp" flush="true"/>
 <!-- 
<blockquote class="layui-elem-quote ">
	<div class="layui-title">个人主页
	
		<div class="">
			<ul style="text-align: right;">
			<i class="layui-icon"><a href="javascript:userLogin();"><button class="layui-btn">登录</button></a></i>
			<i class="layui-icon"><a href="javascript:userRegister();"><button class="layui-btn">注册</button></a></i>
			<i class="layui-icon"><a href="javascript:;">&#xe715;</a></i>
			<i class="layui-icon"><a href="javascript:;">&#xe600;</a></i>
			<i class="layui-icon"><a href="javascript:;">&#xe6fc;</a></i>
			<i class="layui-icon"><a href="javascript:;">&#xe614;</a></i>
			<i class="layui-icon"><a href="javascript:;">&#xe615;</a></i>
			<i class="layui-icon"><a href="javascript:;">&#xe641;</a></i>
			</ui>
		</div>
	</div>
</blockquote> -->

<hr class="layui-bg-blue">
<iframe src="${basePath}/blog/index" frameborder="0" id="mainContent" style="width:100%; height:1000px;"></iframe>

<script>
layui.use(['layer','form','element','carousel'],
		function(){
	var layer = layui.layer,
	element = layui.element,
	carousel = layui.carousel,
	form = layui.form;
	
	layer.msg("layui demo");
	carousel.render({
		elem:'#carousel',
		width:'100%',
		arrow:'always',
		//anim:'auto'
		interval:'3000'
		
	});
	carousel.on('change(test1)',//test1为lay-filter="test1"
			function(obj){
		layer.msg(obj.index+","+obj.prevIndex+obj.item);
	});
});
</script>
<jsp:include page="/common/footer.jsp" flush="true"/>