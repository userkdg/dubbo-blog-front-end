<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>My Personal Blog</title>
	<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="${basePath}/js/bootstrap-3.3.7/dist/css/bootstrap.min.css" >
	<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
	<link rel="stylesheet" href="${basePath}/js/bootstrap-3.3.7/dist/css/bootstrap-theme.min.css" >
	<link rel="stylesheet" href="${basePath}/js/layui-v2.1.6/layui/css/layui.css" >
	
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="${basePath}/js/jquery-3.2.1/jquery-3.2.1.min.js"></script>
	<script src="${basePath}/js/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="${basePath}/js/layui-v2.1.6/layui/layui.js"></script>
	<!-- 主页main的js -->
	<script src="${basePath}/js/index.js"></script>
	<script type="text/javascript">var BASE_PATH='${basePath}'</script>
	<script>
		layui.use(['layer'],function(layer){
			$('#testTip1').on('mouseover',function(){
				var that = this;
				layer.tips('地图定位','#testTip1',{
					tips:[1,'#c00'],
					anim:5,
					time:1000
				});
			});
			$('#testTip2').on('mouseover',function(){
				var that = this;
				layer.tips('播放音乐','#testTip2',{
					tips:[1,'#c00'],
					anim:5,
					time:1000
				});
			});
			$('#testTip3').on('mouseover',function(){
				var that = this;
				layer.tips('收藏本页','#testTip3',{
					tips:[1,'#c00'],
					anim:5,
					time:1000
				});
			});
			$('#testTip4').on('mouseover',function(){
				var that = this;
				layer.tips('个人设置','#testTip4',{
					tips:[1,'#c00'],
					anim:5,
					time:1000
				});
			});
			$('#testTip5').on('mouseout',function(){
				var that = this;
				layer.tips('百度一下','#testTip5',{
					tips:[1,'#c00'],
					anim:5,
					time:1000
				});
			});
			$('#testTip6').on('mouseover',function(){
				var that = this;
				layer.tips('分享网址','#testTip6',{
					tips:[1,'#c00'],
					anim:5,
					time:1000
				});
			});
		});
	 
		
	</script>
	<style type="text/css">
		body{margin-top:3px;}
	</style>
  </head>
  <body>
  <div class="layui-fluid">
  <blockquote class="layui-elem-quote">
	<div class="layui-title" style="font-family: sans-serif important 30px;"><a href="javascript:toPages('index');">博客主页</a>
	
		<div class="">
			<ul style="text-align: right;" >
			<i class="layui-icon"><a href="javascript:toPages('tree','treeDemo');"><button class="layui-btn">Tree研究</button></a></i>
			<i class="layui-icon"><a href="javascript:userLogin();"><button class="layui-btn">登录</button></a></i>
			<!-- <i class="layui-icon" id="tipWin"><a href="javascript:userLogin2();"><button class="layui-btn">弹窗登录</button></a></i> -->
			<i class="layui-icon"><a href="javascript:userRegister();"><button class="layui-btn">注册</button></a></i>
			<i class="layui-icon"><a href="javascript:;"><button class="layui-btn">赞赏</button></a></i>
			<i class="layui-icon" id="testTip1"><a href="javascript:;">&#xe715;</a></i>
			<i class="layui-icon" id="testTip2"><a href="javascript:;">&#xe600;</a></i>
			<i class="layui-icon" id="testTip3"><a href="javascript:;">&#xe6fc;</a></i>
			<i class="layui-icon" id="testTip4"><a href="javascript:;">&#xe614;</a></i>
			<i class="layui-icon" id="testTip5"><a href="javascript:;">&#xe615;</a></i>
			<i class="layui-icon" id="testTip6"><a href="javascript:;">&#xe641;</a></i>
			</ui>
		</div>
	</div>
</blockquote>
</div>

