<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<title>登录页面</title>
<jsp:include page="/common/header.jsp" flush="true"/>
<div class="layui-main">
	<div class="layui-container">
		<div class="layui-fluid">
			<div class="layui-row">
				<div class="layui-col-md4">&nbsp;</div>
				<div class="layui-col-md4">
					<div class="layui-row">
					<form class="layui-form layui-form-pane" method="post" action="${basePath}/sso/login">
					<div class="layui-col-md10">
						<div class="layui-title" style="font-size: 18px;"><i class="layui-icon">&#xe756;</i>个人账号</div>
						<hr class="layui-bg-gray">
						<div class="layui-form-item" >
							<label class="layui-form-label">用户名${user}：</label>
							<div class="layui-input-block">
								<input type="text" class="layui-input" required name="username" placeholder="输入你的名字" autocomplete="off">
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">密码：</label>
							<div class="layui-input-block">
								<input type="password" class="layui-input" required name="password" placeholder="输入你的密码" autocomplete="off">
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">是否加密</label>
							<div class="layui-input-block">
								<input type="radio" name="level" value="0" title="否">
								<input type="radio" name="level" value="1" title="是">
							</div>
						</div>
						<div class="layui-form-item">
							<div class="layui-input-block">
								<button class="layui-btn" id="save" lay-submit lay-filter="submitFt">登录</button>
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

    form.on('submit(submitFt)',function(data){
        var json = JSON.stringify(data.field);

        layer.alert(json);
        $.ajax({
            url:"${basePath}/sso/login",
            type:'POST',
            dataType:'json',
			contentType:'application/json',
            data:{"json":json},
            success:function(text){
                layer.alert(text);
            },
            error:function(error){
                layer.msg(error);
            }
        });
        //return true;
    });

	//ajax2save('submitFt',['name','password'],'${basePath}/user/login');
});

</script>
<jsp:include page="/common/footer.jsp" flush="true"/>