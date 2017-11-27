<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<title>注册页面</title>
<jsp:include page="/common/header.jsp" flush="true"/>
<div class="layui-main">
	<div class="layui-container">
		<div class="layui-fluid">
			<div class="layui-row">
				<div class="layui-col-md4">&nbsp;</div>
				<div class="layui-col-md4">
					<div class="layui-row">
					<form class="layui-form layui-form-pane" action="">
					<div class="layui-col-md10">
						<div class="layui-title" style="font-size: 18px;"><i class="layui-icon">&#xe756;</i>个人账号</div>
						<hr class="layui-bg-gray">
						<div class="layui-form-item" >
							<label class="layui-form-label">用户名：</label>
							<div class="layui-input-block">
								<input type="text" class="layui-input" required name="name" placeholder="输入你的名字" autocomplete="off">
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">密码：</label>
							<div class="layui-input-block">
								<input type="password" class="layui-input" required name="password" placeholder="输入你的密码" autocomplete="off">
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">手机号码：</label>
							<div class="layui-input-block">
								<input type="tel" class="layui-input" required name="tel" placeholder="输入你的电话号码" autocomplete="off">
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">个人邮箱：</label>
							<div class="layui-input-block">
								<input type="email" class="layui-input" required name="address" placeholder="输入你的个人邮箱" autocomplete="off">
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">是否加密</label>
							<div class="layui-input-block">
								<input type="radio" name="level" value="0" title="否">
								<input type="radio" name="level" value="1" title="是" checked>
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">个人博客格言：</label>
							<div class="layui-input-block">
								<textarea  name="des" placeholder="请输入你的格言" class="layui-textarea"></textarea>
							</div>
						</div>
						<div class="layui-form-item">
							<div class="layui-input-block">
								<button class="layui-btn" lay-submit lay-filter="submitFt">注册</button>
								<button class="layui-btn layui-btn-primary" lay-reset lay-filter="reSetFt">重置</button>
							</div>
						</div>
						</div>
					</form>
					</div>
				</div>
				<div class="layui-col-md4">&nbsp;</div>
			</div>
		</div>
	</div>
</div>
<script>
var layer="";
layui.use(['layer','form'],function(){
	layer = layui.layer,
	form = layui.form;
	var $ = layui.$;
	layer.msg("layui demo");
	//注册
	ajax2save('submitFt','${basePath}/user/create');
	
});
</script>
<jsp:include page="/common/footer.jsp" flush="true"/>