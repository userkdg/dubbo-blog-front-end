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
	
  </head>
  <body>
  
