<#include "/lib/const.ftl">
<!DOCTYPE html>
<html>
<head>
	<title>我的宫廷-后台登录</title>
	<meta http-equiv="Content-type" content="text/html;charset=utf-8"/>
	<meta name="keywords" content="关键字"/>
	<meta name="description" content="网页描述"/>
	<meta name="author" content="hadoit"/>
	<meta name="version" content="1.0"/>
	
	<link href="${pluginsRoot}/font-awesome/css/font-awesome.min.css"  rel="stylesheet" type="text/css"/>
	<link href="${pluginsRoot}/bootstrap/css/bootstrap.min.css"  rel="stylesheet" type="text/css"/>
	<link href="${pluginsRoot}/uniform/css/uniform.default.css"  rel="stylesheet" type="text/css"/>
	<link rel="stylesheet" type="text/css" href="${pluginsRoot}/select2/select2.css" />
	<link rel="stylesheet" type="text/css" href="${pluginsRoot}/select2/select2-metronic.css" />
	<link href="${cssRoot}/style-metronic.css" rel="stylesheet" type="text/css"/>
	<link href="${cssRoot}/style.css" rel="stylesheet" type="text/css"/>
	<link href="${cssRoot}/style-responsive.css" rel="stylesheet" type="text/css"/>
	<link href="${cssRoot}/plugins.css" rel="stylesheet" type="text/css"/>
	<link href="${cssRoot}/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
	<link href="${cssRoot}/pages/login.css" rel="stylesheet" type="text/css"/>
	<link href="${cssRoot}/custom.css" rel="stylesheet" type="text/css"/>
</head>


<body class="login">
<!-- BEGIN LOGO -->
<div class="logo">
	<a href="#" >
		<img src="${imgRoot}/logo-big.png" alt=""/>
	</a>
</div>
<!-- END LOGO -->
<!-- BEGIN LOGIN -->
<div class="content">
	<!-- BEGIN LOGIN FORM -->
	<form class="login-form" action="${basePath}/login" method="post">
		<h3 class="form-title">Login to your account</h3>
		<input type="hidden" value="${redirect?default("")}" name="redirect" />
		<div class="alert alert-danger display-hide">
			<button class="close" data-close="alert"></button>
			<span>
				 Enter any username and password.
			</span>
		</div>
		<div class="form-group">
			<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
			<label class="control-label visible-ie8 visible-ie9">Username</label>
			<div class="input-icon">
				<i class="fa fa-user"></i>
				<input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="Username" name="username"/>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label visible-ie8 visible-ie9">Password</label>
			<div class="input-icon">
				<i class="fa fa-lock"></i>
				<input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="Password" name="passwd"/>
			</div>
		</div>
		<div class="form-actions">
			<button type="submit" class="btn green pull-right">
			Login <i class="m-icon-swapright m-icon-white"></i>
			</button>
		</div>
	</form>
	<!-- END LOGIN FORM -->
</div>
<!-- END LOGIN -->
<!-- BEGIN COPYRIGHT -->
<div class="copyright">
	 2014 &copy; Hadoit.
</div>
<!-- END COPYRIGHT -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
	<script src="${pluginsRoot}/respond.min.js"></script>
	<script src="${pluginsRoot}/excanvas.min.js"></script> 
	<![endif]-->
<script src="${pluginsRoot}/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${pluginsRoot}/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<script src="${pluginsRoot}/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${pluginsRoot}/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="${pluginsRoot}/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="${pluginsRoot}/jquery.blockui.min.js" type="text/javascript"></script>
<script src="${pluginsRoot}/jquery.cokie.min.js" type="text/javascript"></script>
<script src="${pluginsRoot}/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="${pluginsRoot}/jquery-validation/dist/jquery.validate.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${pluginsRoot}/select2/select2.min.js" ></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="${jsRoot}/core/app.js" type="text/javascript"></script>
<script src="${jsRoot}/custom/login.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
	jQuery(document).ready(function() {     
	  App.init();
	  Login.init();
	});
</script>
</html>
