<#include "/lib/const.ftl">
<!DOCTYPE html>
<html>
<head>
	<title>我的宫廷-后台登录</title>
	<meta http-equiv="Content-type" content="text/html;charset=utf-8"/>
	<meta name="keywords" content="我的宫廷"/>
	<meta name="description" content="我的宫廷"/>
	<meta name="author" content="果动游戏"/>
	<meta name="version" content="1.0"/>
	<#include "/lib/layui-css.ftl">
	<link type="text/css" rel="stylesheet" href="${layRoot}/css/login.css?${cssTag}" charset="utf-8"/>
	<#include "/lib/layui-js.ftl">
</head>
<body>
<div class="layui-canvs">
</div>
<!-- BEGIN LOGIN -->
<script src="${layRoot}/vue.min.js" type="text/javascript"></script>
<div class="layui-layout layui-layout-login">
	<!-- BEGIN LOGIN FORM -->
	<h1>
		 <strong>果动数据后台管理</strong>
		 <em>Management System</em>
		 <div id="clock">
    		<p class="date">{{ date }}</p>
    		<p class="time">{{ time }}</p>
       </div>
	</h1>
	
	<form class="layui-form" action="${basePath}/login" method="post">
		<input type="hidden" value="${redirect?default("")}" name="redirect" />
	<div class="layui-user-icon larry-login">
		 <input type="text" autocomplete="off" placeholder="用户名" name="username" class="login_txtbx"/>
	</div>
	<div class="layui-pwd-icon larry-login">
		 <input type="password" autocomplete="off" placeholder="密码" name="passwd" class="login_txtbx"/>
	</div>
    <div class="layui-submit larry-login">
    	<input type="submit" value="立即登陆" class="submit_btn"/>
    </div>
    <div class="layui-login-text">
    	<p>© 2017-2020 果动游戏 版权所有</p>
    </div>
	</form>
	<!-- END LOGIN FORM -->
</div>
<script src="${layRoot}/layui.all.js" type="text/javascript"></script>
<script src="${pluginsRoot}/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${layRoot}/js/login.js" type="text/javascript"></script>
<script src="${layRoot}/js/jparticle.jquery.js" type="text/javascript"></script>
<script src="${layRoot}/js/login-server.js"></script>
<script src="${layRoot}/js/clock.js"></script>
<!-- END LOGIN -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
	<![endif]-->
</body>
</html>
