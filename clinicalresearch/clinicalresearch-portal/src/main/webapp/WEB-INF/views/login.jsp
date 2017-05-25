<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
    uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>

<html>

<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>临床研究平台 | 登录 </title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<meta content="" name="description"/>
<!-- BEGIN GLOBAL MANDATORY STYLES -->

<link href="assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link href="assets/admin/pages/css/login-soft.css" rel="stylesheet" type="text/css"/>
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME STYLES -->
<link href="assets/global/css/components-md.css" id="style_components" rel="stylesheet" type="text/css"/>

<link rel="shortcut icon" href="favicon.ico"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-md login">
<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
<div class="bgbox">
	<div class="htitle">
		<h1>会话式临床科研</h1>
	   <h3 class="ltitle">专业灵活 &nbsp;&nbsp;精确快捷</h3>
	</div>
</div>
<!-- END SIDEBAR TOGGLER BUTTON -->
<!-- BEGIN LOGIN -->
<div class="content">
	
	<!-- BEGIN LOGIN FORM -->
	<form class="login-form" action="<%=request.getContextPath() %>/entryHome" method="post">
		<img src="img/bg/biglogo.png" alt="" class="logo"/>
		
		<form role="form">
								<div class="form-body">
									
									
									<div class="form-group">
										<label for="form_control_1">用户名</label>
										<input type="text" class="form-control" id="form_control_1" placeholder="用户名" name="userId">
										
									</div>
									<div class="form-group">
										<label for="form_control_1">密码</label>
										<input type="password" class="form-control" id="form_control_2" placeholder="密码" name="password">
										<input type="hidden" id="loginStatus" name="loginStatus" value="300">
									</div>
									
								</div>
								<div class="forget-form">
									<div class="alert alert-danger display-hide">
										<button class="close" data-close="alert"></button>
										<span>请输入账号和密码! </span>					
									</div>
								</div>
								<div class="form-actions noborder">
									<button type="submit" class="btn green pull-right small">
			登录 </i>
			</button>
									
								</div>
							</form>


</div>
<div class="bottom">
	<div class="row" style="padding-left: 12%;padding-right: 12%;">
		<div class="col-md-4">
			<div class="borgray"></div>
			<div class="cont-info">
				<img src="img/bg/icon_dl01.png"/><br>
				<h3>专业的医疗数据分析</h3><br>
				<h6>灵活易用的大数据分析解决方案<br>获取深度洞察力</h6>
			</div>
		</div>
		<div class="col-md-4">
			<div class="borgray"></div>
			<div class="cont-info">
				<img src="img/bg/icon_dl02.png"/><br>
				<h3>强大的统计学处理技术</h3><br>
				<h6>智能高效的数据统计处理<br>高可信度 高质量</h6>
			</div>
		</div>
		<div class="col-md-4">
			<div class="borgray"></div>
			<div class="cont-info">
				<img src="img/bg/icon_dl03.png"/><br>
				<h3>多模式一体化科研平台</h3><br>
				<h6>自助式取数 多模式融和<br/>一站解决</h6>
			</div>
		</div>
	</div>
</div>
<!-- END LOGIN -->
<!-- BEGIN COPYRIGHT -->
<div class="copyright"> 
	 <span>Copyright &copy; 2016 Goodwill All rights reserved.</span>
</div>
<!-- END COPYRIGHT -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->

<script src="assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>

<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="assets/global/plugins/jquery-validation/js/jquery.validate.min.js" type="text/javascript"></script>

<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="assets/global/scripts/metronic.js" type="text/javascript"></script>
<script src="assets/admin/layout/scripts/layout.js" type="text/javascript"></script>
<script src="assets/admin/layout/scripts/demo.js" type="text/javascript"></script>
<script src="assets/admin/pages/scripts/login-soft.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
jQuery(document).ready(function() {     
  Metronic.init(); // init metronic core components
Layout.init(); // init current layout
  Login.init();
  Demo.init();
      
});
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>

