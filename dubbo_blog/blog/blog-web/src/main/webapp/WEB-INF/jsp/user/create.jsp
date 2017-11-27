<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<jsp:include page="/common/header2.jsp"></jsp:include>
<div>
<div class="layui-container layui-main">
	<div class="layui-fluid">
	
		<!-- 大左栏 -->
		<div class="layui-nav layui-nav-tree layui-nav-side" style="width:12%;" lay-filter="nav2" id="nav2Id">
			<li class="layui-nav-item" ><a href="javascript:toSmall();"><i class="layui-icon">&#xe603</i></a></li>
			<li class="layui-nav-item" ><a href="javascript:;">首页</a></li>
			<li class="layui-nav-item"><a href="javascript:;">java</a>
				<dl class="layui-nav-child">
					<dd><a href="javascript:;">java基础</a></dd>
					<dd><a href="javascript:;">javaSE</a></dd>
					<dd><a href="javascript:;">javaEE</a></dd>
				</dl>
			</li>
			<li class="layui-nav-item"><a href="javascript:;">java Web</a></li>
			<li class="layui-nav-item"><a href="javascript:;">database</a></li>
			<li class="layui-nav-item"><a href="javascript:;">ui</a></li>
		</div>
		<!-- 图标左栏 -->
		<div class="layui-nav layui-nav-tree layui-nav-side " style="width:6%;display: none;" lay-filter="nav3" id="nav3Id">
			<li class="layui-nav-item" ><a href="javascript:toLarge();"><i class="layui-icon">&#xe602</i></a></li>
			<li class="layui-nav-item" ><a href="javascript:;"><i class="layui-icon">&#xe68e;</i></a></li>
			<li class="layui-nav-item"><a href="javascript:;"><i class="layui-icon">&#xe68e;</i></a>
				<dl class="layui-nav-child">
					<dd><a href="javascript:;"><i class="layui-icon">&#xe68e;</i></a></dd>
					<dd><a href="javascript:;"><i class="layui-icon">&#xe68e;</i></a></dd>
					<dd><a href="javascript:;"><i class="layui-icon">&#xe68e;</i></a></dd>
				</dl>
			</li>
			<li class="layui-nav-item"><a href="javascript:;"><i class="layui-icon">&#xe68e;</i></a></li>
			<li class="layui-nav-item"><a href="javascript:;"><i class="layui-icon">&#xe68e;</i></a></li>
			<li class="layui-nav-item"><a href="javascript:;"><i class="layui-icon">&#xe68e;</i></a></li>
		</div>
		<div class="layui-row">
			<div class="layui-col-md1">
				&nbsp;
			</div>
	
			<div class="layui-col-md11">
				<div class="layui-row">
					<div class="layui-col-md9">
						<div class="layui-anim layui-anim-fadein">
						<div class="layui-carousel layui-col-md-offset" lay-filter="test1" id="carousel">
							<div carousel-item>
								<div><img alt="" src="${basePath}/images/default.jpg"></div>
								<div><img alt="" src="${basePath}/images/default.jpg"></div>
								<div><img alt="" src="${basePath}/images/default.jpg"></div>
								<div><img alt="" src="${basePath}/images/default.jpg"></div>
								<div><img alt="" src="${basePath}/images/default.jpg"></div>
								<div><img alt="" src="${basePath}/images/default.jpg"></div>
							</div>
						</div>
						</div>
					</div>
					<div class="layui-col-md3">
						<div class="layui-anim layui-anim-scale">
							<div class="" id="nowDate"></div>
						</div>
					</div>
				</div>
				<hr class="layui-bg-blue " >
				<div class="layui-row">
				<div class="layui-field-title" style="font-size:bold 20px;"><button class="layui-btn layui-btn-small">ONE SENTENCE</button></div>
				<ul class="layui-timeline">
					<li class="layui-timeline-item">
						<i class="layui-icon layui-timeline-axis">&#xe6af;</i>
						<div class="layui-timeline-content layui-text">你可以否定我，却打败不了我</div>
					</li>
					<li class="layui-timeline-item">
						<i class="layui-icon layui-timeline-axis">&#xe6af;</i>
						<div class="layui-timeline-content layui-text">2017-11-5</div>
					</li>
				</ul>
					<div class="layui-col-md4 ">
						<div class="layui-title"><button class="layui-btn layui-btn-small">Java <i class="layui-icon">&#xe602;</i></button></div>
						<div class="layui-coolapse" style="width:80%;">
							<div class="layui-colla-item">
								<h2 class="layui-colla-title"><a href="javascript:showContent();"><i class="layui-icon">&#xe602;<span>java基础篇</span></i></a></h2>
								<div class="layui-colla-content" id="showId"><!-- 需要一个auto id来控制，后台编号 -->
									<ul class="layui-elip">
										<li>1</li>
										<li>1</li>
									</ul>
								</div>
							</div>
							<div class="layui-colla-item">
								<h2 class="layui-colla-title"><a href="javascript:showContent();"><i class="layui-icon">&#xe602;<span>java基础篇</span></i></a></h2>
								<div class="layui-colla-content" >
									<ul>
										<li>1</li>
										<li>1</li>
										<li>1</li>
									</ul>
								</div>
							</div>
							<div class="layui-colla-item">
								<h2 class="layui-colla-title"><a href="javascript:showContent();"><i class="layui-icon">&#xe602;<span>java基础篇</span></i></a></h2>
								<div class="layui-colla-content">
									<ul>
										<li>1</li>
										<li>1</li>
										<li>1</li>
									</ul>
								</div>
							</div>
						</div>
							<div id="laypage1"></div>
					</div>
					
					<div class="layui-col-md4">
						<div class="layui-title"><button class="layui-btn layui-btn-small">Java Web <i class="layui-icon">&#xe602;</i></button></div>
						<div class="layui-coolapse" style="width:80%;">
							<div class="layui-colla-item">
								<h2 class="layui-colla-title"><a href="javascript:showContent();"><i class="layui-icon">&#xe602;<span>java基础篇</span></i></a></h2>
								<div class="layui-colla-content" id="showId">
									<ul>
										<li>1</li>
										<li>1</li>
										<li>1</li>
									</ul>
								</div>
							</div>
							<div class="layui-colla-item">
								<h2 class="layui-colla-title"><a href="javascript:showContent();"><i class="layui-icon">&#xe602;<span>java基础篇</span></i></a></h2>
								<div class="layui-colla-content" >
									<ul>
										<li>1</li>
										<li>1</li>
										<li>1</li>
									</ul>
								</div>
							</div>
							<div class="layui-colla-item">
								<h2 class="layui-colla-title"><a href="javascript:showContent();"><i class="layui-icon">&#xe602;<span>java基础篇</span></i></a></h2>
								<div class="layui-colla-content">
									<ul>
										<li>1</li>
										<li>1</li>
										<li>1</li>
									</ul>
								</div>
							</div>
						</div>
							<div id="laypage2"></div>
					</div>
					<div class="layui-col-md4 ">
						<div class="layui-title"><button class="layui-btn layui-btn-small">Database <i class="layui-icon">&#xe602;</i></button></div>
						<div class="layui-coolapse" style="width:80%;">
							<div class="layui-colla-item">
								<h2 class="layui-colla-title"><a href="javascript:showContent();"><i class="layui-icon">&#xe602;<span>java基础篇</span></i></a></h2>
								<div class="layui-colla-content" id="showId">
									<ul>
										<li>1</li>
										<li>1</li>
										<li>1</li>
									</ul>
								</div>
							</div>
							<div class="layui-colla-item">
								<h2 class="layui-colla-title"><a href="javascript:showContent();"><i class="layui-icon">&#xe602;<span>java基础篇</span></i></a></h2>
								<div class="layui-colla-content" >
									<ul>
										<li>1</li>
										<li>1</li>
										<li>1</li>
									</ul>
								</div>
							</div>
							<div class="layui-colla-item">
								<h2 class="layui-colla-title"><a href="javascript:showContent();"><i class="layui-icon">&#xe602;<span>java基础篇</span></i></a></h2>
								<div class="layui-colla-content">
									<ul>
										<li>1</li>
										<li>1</li>
										<li>1</li>
									</ul>
								</div>
							</div>
						</div>
							<div id="laypage3"></div>
					</div>
				</div>
				<hr class="layui-bg-green">
				<div class="layui-row">
					<div class="layui-col-md12">
						<div class="layui-tab">
							<ul class="layui-tab-title">
								<li class="layui-this">作品一</li>
								<li class="layui-this">作品二</li>
								<li class="layui-this">作品三</li>
								<li class="layui-this">作品四</li>
							</ul>
							<div class="layui-tab-content layui-show">
								<div class="layui-tab-item">内容一
									<div class="layui-anim layui-anim-down"></div>
									<ul class="">
										<li>1</li>
										<li>1</li>
										<li>1</li>
										<li>1</li>
									</ul>
									
								</div>
								<div class="layui-tab-item">内容二
									<div class="layui-anim layui-anim-up">
										aaaaaaaaaaaaaaaa
									</div>
								</div>
								<div class="layui-tab-item">内容三
									<div class="layui-anim layui-anim-up">
										<div id="photo3" class="layer-photos-demo">
											<img layer-src="${basePath}/images/default.jpg" alt="${basePath}/images/default.jpg" src="作品2">
											<img layer-src="${basePath}/images/default.jpg" alt="${basePath}/images/default.jpg" src="作品2">
											<img layer-src="${basePath}/images/default.jpg" alt="${basePath}/images/default.jpg" src="作品2">
										</div>
									</div>
								</div>
								<div class="layui-tab-item">内容四
									<div id="photo4" class="layer-photos">
									
									</div>
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</div>
<script>
var layer,element,carousel,form,laypage;

layui.use(['layer','form','element','carousel','laypage','laydate'],
		function(){
	var $ = layui.$;
	
	layer = layui.layer,
	element = layui.element,
	carousel = layui.carousel,
	laypage = layui.laypage,
	laydate = layui.laydate,
	form = layui.form;
	
	layer.msg("layui demo");
	carousel.render({
		elem:'#carousel',//-->lay-filter
		width:'90%',
		arrow:'always',
		//anim:'auto'
		interval:'3000'
		
	});
	//移除日历的footer  --false
//	$(".layui-laydate-footer").hide();
	
	carousel.on('change(test1)',//test1为lay-filter="test1"
			function(obj){
		layer.msg(obj.index+","+obj.prevIndex+obj.item);
	});
	laydate.render({
		elem:'#nowDate',
		//type:'datetime',
		//range:true,
		showButtom:false,
		position:'static',
		theme:'molv',
		height:'70px',
		calendar:true,
		btns:['now'],
		mark:{
			'2017-06-10':'作者小刚生日',
			'2017-11-5':'本站开发...ing'
		}
	});
	//
	laypage.render({
		elem:'laypage1',//-->id
		count:30,//列表总数
		limit:6//一页6条
	});
	laypage.render({
		elem:'laypage2',//-->id
		count:30,//列表总数
		limit:6//一页6条
	});
	laypage.render({
		elem:'laypage3',//-->id
		count:30,//列表总数
		limit:6//一页6条
	});
	//photo3
	layer.photos({
		photos:'#photo3',
		anim:5
	});
	/* var json = '{"title":"title","id":"1","start":0,"data":[{"alt":"photo1","pid":666,"src":"${basePath}/images/default.jpg","thumb":"缩略图地址"}]}';
	layer.photos({
		photos:json,
		elem:'#photo4',
		anim:5,
		
	}); */
	
});
 
function toSmall(){
	layer.msg("toleft");
	$("#nav2Id").hide();
	$("#nav3Id").show();
}
function toLarge(){
	layer.msg("toLarge");
	$("#nav3Id").hide();
	$("#nav2Id").show();
}
function showContent(){
	$('#showId').toggleClass("layui-show");
}


</script>