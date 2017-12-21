<#include "/lib/const.ftl">
<#-- 左侧多级菜单数配置, 节点命名来自<@spring.message "gms.yysj.fu"/>务端的m1/m2参数, 
		数组<@spring.message "gms.wjgl.neirong"/>[0]->菜单左侧小图标, [1]->菜单<@spring.message "gms.aqgl.mingchen"/>, [2]->菜单连接-->
		
		
<#assign keyInfo = {"dashboard": ["fa-home", "gms.common.zong_lan", "${basePath}/dashboard"], 
    "opt": ["fa-home", "gms.yysj.yysj", "javascript:;"], 
        <#--"global": ["fa-home", "gms.yysj.qjtj", "${basePath}/opt?module=global&action=globallist"],
        "reg": ["fa-home", "gms.yysj.drtj", "${basePath}/opt?module=reg&action=reglist"], -->
        "charge": ["fa-home", "gms.yysj.fufeitongji", "${basePath}/opt?module=charge&action=chargelist"], 
        "online": ["fa-home", "gms.yysj.sszxcx", "${basePath}/opt?module=online&action=onlinelist"], 
        "retention": ["fa-home", "gms.yysj.liucuntongji", "${basePath}/opt?module=retention&action=retentionlist"],
        "churn": ["fa-home", "gms.yysj.liushitongji", "${basePath}/opt?module=churn&action=churnlist"],
        "realcharge": ["fa-home", "gms.yysj.jrsscz", "${basePath}/opt?module=realcharge&action=realcharge"],
    "gs": ["fa-home", "gms.youxi.yysj", "javascript:;"], 
        "resall": ["fa-home", "gms.youxi.zytj", "${basePath}/gs?module=resall&action=resalllist"],
        "csmbehv": ["fa-home", "gms.youxi.xfxwtj", "${basePath}/gs?module=csmbehv&action=csmbehvlist"],
        "itemstats": ["fa-home", "道具分析", "${basePath}/gs?module=itemstats&action=itemstatslist"],
        "goldstats": ["fa-home", "元宝分析", "${basePath}/gs?module=goldstats&action=goldstatslist"],
    "pm": ["fa-home", "gms.wjgl.wjgl", "javascript:;"], 
        "player": ["fa-home", "gms.wjgl.yhjccx", "${basePath}/pm?module=player&action=playerlist"],
        "resource": ["fa-home", "gms.wjgl.yhbdcx", "${basePath}/pm?module=resource&action=resourcelist"],
        "item": ["fa-home", "gms.wjgl.wpbdcx", "${basePath}/pm?module=item&action=itemlist"],
        "chargerecd": ["fa-home", "gms.wjgl.czjlcx", "${basePath}/pm?module=chargerecd&action=chargerecdlist"],
        "reward": ["fa-home", "gms.wjgl.ffgl", "${basePath}/pm?module=reward&action=rewardlist"],
        "roll": ["fa-home", "gms.wjgl.gdxxgl", "${basePath}/pm?module=roll&action=rolllist"],
        "passnotice": ["fa-home", "gms.aqgl.gonggaoshenhe", "${basePath}/pm?module=passnotice&action=passnoticelist"],
        "criticallog": ["fa-home", "gms.wjgl.jinbaoxinxi", "${basePath}/pm?module=criticallog&action=criticalloglist"],
        "feedback": ["fa-home", "gms.wjgl.wanjiafankui", "${basePath}/pm?module=feedback&action=feedbacklist"],
        "sendProduct": ["fa-home", "gms.wjgl.fasongwupin", "${basePath}/pm?module=sendProduct&action=sendProductList"],
        "liaotian": ["fa-home", "gms.wjgl.ltjk", "${basePath}/pm?module=liaotian&action=index"],
        "notice": ["fa-home", "gms.fwqgl.zjgg", "${basePath}/pm?module=notice&action=addnotice"],
        "newnotice": ["fa-home", "gms.fwqgl.newnotice", "${basePath}/pm?module=newnotice&action=noticelist"],
        "applepurchase": ["fa-home", "gms.youxi.pgzzcx", "${basePath}/pm?module=applepurchase&action=applepurchaselist"],
    "sm": ["fa-home", "gms.fwqgl.fwqgl", "javascript:;"], 
        "oprgroup": ["fa-home", "gms.fwqgl.qudaoliebiao", "${basePath}/sm?module=oprgroup&action=oprgrouplist"],
        "srv": ["fa-home", "gms.fwqgl.fwqlb", "${basePath}/sm?module=srv&action=srvlist"],
        "scripts": ["fa-home", "gms.fwqgl.jiaobenzhixing", "${basePath}/sm?module=scripts&action=scriptslist"],
        "tools": ["fa-home", "gms.fwqgl.kaifugongju", "${basePath}/sm?module=tools&action=toolslist"],
        "sql": ["fa-home", "gms.fwqgl.zhixing", "${basePath}/sm?module=sql&action=executesql"],
    "se": ["fa-home", "gms.aqgl.anquanguanli", "javascript:;"], 
        "sec": ["fa-home", "gms.aqgl.yonghuliebiao", "${basePath}/se?module=sec&action=seclist"],
        "passreward": ["fa-home", "gms.aqgl.fafangshenhe", "${basePath}/se?module=passreward&action=passrewardlist"],
        "productnotice": ["fa-home", "gms.aqgl.wupinshenhe", "${basePath}/se?module=productnotice&action=productnoticelist"],
    "cpm": ["fa-home", "gms.dhmgl.dhmgl", "javascript:;"], 
        "cate": ["fa-home", "gms.dhmgl.libaoleixing", "${basePath}/cpm?module=cate&action=catelist"],
        "batch": ["fa-home", "gms.dhmgl.pici", "${basePath}/cpm?module=batch&action=batchlist"],
        "coupon": ["fa-home", "gms.dhmgl.duihuanma", "${basePath}/cpm?module=coupon&action=couponlist"],
        "glcoupon": ["fa-home", "gms.dhmgl.qddhm", "${basePath}/cpm?module=glcoupon&action=glcouponlist"],
    "rm": ["fa-home", "gms.rm.list", "javascript:;"], 
        "userreport": ["fa-home", "gms.rm.user", "${basePath}/rm?module=userreport&action=list"]
    }>

<#-- 左侧多级菜单父子关系数据-->
<#assign menuTree = {"dashboard":[], 
	"opt":["online", "realcharge"],<#--["global", "reg", "online", "realcharge"], -->
	"gs":["resall", "csmbehv", "itemstats", "goldstats"],<#--["realtime", "resall", "csmbehv"], -->
	"pm":["player", "resource", "chargerecd", "item", "reward", "roll", "passnotice", "criticallog", "feedback", "sendProduct", "liaotian", "applepurchase"],
	"sm":["oprgroup", "srv", "scripts", "tools", "sql"],
	"se":["sec", "passreward", "productnotice"],
	"cpm":["cate", "batch", "coupon", "glcoupon"],
	"rm":["userreport"]
	}>

<#macro html>
<!DOCTYPE html>
<html>
<#nested>
</html>
</#macro>

<#macro head>
  <head>
  	<title>我的宫廷-<@spring.message "gms.wjgl.gm"/>S</title>
	<meta http-equiv="Content-type" content="text/html;charset=utf-8"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta name="keywords" content="关键字"/>
	<meta name="description" content="网页描述"/>
	<meta name="author" content="hadoit"/>
	<meta name="version" content="1.0"/>
	<#include "/lib/corecss.ftl">
	<#nested />
  </head>
</#macro>

<#macro sideBar>
	<#assign m1 = FsGameGmsUtils.getPathInfoNoHead(springMacroRequestContext["requestUri"], springMacroRequestContext["pathToServlet"])>
	<#assign m2 = (RequestParameters["module"])!"">
	<#if userDetails?? && userDetails.roles?size gt 0>
		<#assign resList = FsGameGmsUtils.getResListFromRole(userDetails.roles[0])>
	</#if>
	<#list menuTree?keys as key>
		<#if spring.contains(resList?default([]), key)>
			<#assign ki = keyInfo[key]>
			<#assign rootNode = (key=="dashboard")>
			<#assign startFlag = rootNode?string("start", "")>
			<#assign activeFlag1 = (m1==key)?string("active", "")>
			<#assign openFlag = (m1==key)?string("open", "")>
			<#assign childs = menuTree[key]>
			
			<li class="${startFlag} ${activeFlag1}">
				<a href="${ki[2]}" >
					<i class="fa ${ki[0]}"></i>
					<span class="title">
						<@spring.message ki[1]/>
					</span>
					<#if !rootNode>
						<#if m1==key>
						<span class="selected"></span>
						</#if>
						<span class="arrow ${openFlag}"></span>
					</#if>
				</a>
				
				<#if (childs?size>0)>
				<ul class="sub-menu">
					<#list childs as cld>
					<#assign activeFlag2 = (m2==cld)?string("active", "")>
					
					<#assign childKi = keyInfo[cld]>
					<li class="${activeFlag2}">
						<a href="${childKi[2]}" >
							<i class="fa ${childKi[0]}"></i>
							<@spring.message childKi[1]/>
						</a>
					</li>
					</#list>
				</ul>
				</#if>
			</li>
		</#if>
	</#list>
</#macro>

<#macro navBar>
	<ul class="page-breadcrumb breadcrumb">
		<li>
			<i class="fa fa-home"></i>
			<span>
				Home
			</span>
			<i class="fa fa-angle-right"></i>
		</li>
		
		<#assign m1 = FsGameGmsUtils.getPathInfoNoHead(springMacroRequestContext["requestUri"], springMacroRequestContext["pathToServlet"])>
		<#assign m2 = (RequestParameters["module"])!"">
		<#assign m1Right = (m1=="")?string("", "fa-angle-right")>
		<#if (m1 != "")>
		<li>
			<span>
				<@spring.message keyInfo[m1][1]/>
			</span>
			<i class="fa ${m1Right}"></i>
		</li>
		</#if>
		
		<#if (m2 != "")>
		<li>
			<span>
				<@spring.message keyInfo[m2][1]/>
			</span>
		</li>
		</#if>
	</ul>
</#macro>


<#macro body>
	<body class="page-header-fixed">
		<div class="header navbar navbar-fixed-top">
			<!-- BEGIN TOP NAVIGATION BAR -->
			<div class="header-inner">
				<!-- BEGIN LOGO -->
				<a class="navbar-brand" href="#" >
					<img src="${imgRoot}/logo.png" alt="logo" class="img-responsive"/>
				</a>
				
				<a class="navbar-brand" href="#" >
					<h3 style="color:red;margin-top:0px;padding-bottom:0px">
					<#if FsGameGmsUtils.inZone('tw')> 
                    	台湾
                    <#elseif FsGameGmsUtils.inZone('yn')>
                    	越南
                    <#else>
                    	中国
                    </#if>
					</h3>
				</a>
				
				<a href="javascript:;" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<img src="assets/img/menu-toggler.png" tppabs="assets/img/menu-toggler.png" alt=""/>
				</a>
				<!-- END LOGO -->
				<!-- BEGIN RESPONSIVE MENU TOGGLER -->
				<!-- END RESPONSIVE MENU TOGGLER -->
				<!-- BEGIN TOP NAVIGATION MENU -->
				<ul class="nav navbar-nav pull-right">
					<!-- BEGIN SRV SELECT DROPDOWN -->
					<!-- END SRV SELECT DROPDOWN -->
					
					<!-- BEGIN USER LOGIN DROPDOWN -->
					<li class="dropdown user">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
							<img alt="" src="${imgRoot}/avatar1_small.jpg" />
							<span class="username">
								 <#if userDetails?has_content>${userDetails.userName?default("")}</#if>
							</span>
							<i class="fa fa-angle-down"></i>
						</a>
						<ul class="dropdown-menu">
							<li>
								<a onclick="$('#changepassword').modal();" >
									<i class="fa fa-arrows"></i> <@spring.message "gms.common.xiugaimima"/>
								</a>
							</li>
							<li>
								<a href="javascript:location.replace('${basePath}/logout')" >
									<i class="fa fa-key"></i> Log Out
								</a>
							</li>
						</ul>
					</li>
					<!-- END USER LOGIN DROPDOWN -->
				</ul>
				<!-- END TOP NAVIGATION MENU -->
			</div>
			<!-- END TOP NAVIGATION BAR -->
		</div>
		
		<div class="clearfix">
		</div>
		
		<div id="changepassword" class="modal fade" tabindex="-1" data-width="380">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title"><@spring.message "gms.common.xiugaimima"/></h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<div class="col-md-6">
							<label class="control-label"><@spring.message "gms.common.dangqianmima"/>：</label>
							<p>
								<input id="oldpassword" class="form-control" type="password" maxlength="20" size="20">
							</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<label class="control-label"><@spring.message "gms.common.xinnmima"/>：</label>
							<p>
								<input id="newpassword" class="form-control" type="password" maxlength="20" size="20">
							</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<label class="control-label"><@spring.message "gms.aqgl.querenxinnmima"/>：</label>
							<p>
								<input id="newpassword2" class="form-control" type="password" maxlength="20" size="20">
							</p>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" data-dismiss="modal" class="btn btn-default"><@spring.message "gms.fwqgl.guanbi"/></button>
					<button type="button" class="btn blue" id="saveNewPassword"><@spring.message "gms.wjgl.baocun"/></button>
				</div>
			</div>
		
		
		<div class="page-container">
			<!-- BEGIN page-sidebar -->
			<div class="page-sidebar-wrapper">
				<div class="page-sidebar navbar-collapse collapse">
					<!-- BEGIN SIDEBAR MENU -->
					<ul class="page-sidebar-menu" data-auto-scroll="true" data-slide-speed="200">
						<li class="sidebar-toggler-wrapper">
							<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
							<div class="sidebar-toggler hidden-phone">
							</div>
							<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
						</li>
						
						<@sideBar />
					</ul>
					<!-- END SIDEBAR MENU -->
				</div>
			</div>
			
			<!-- BEGIN page-content -->
			<#nested />
			<!-- END page-content -->
		</div>
		<!-- END page-sidebar -->
		
		<!-- BEGIN FOOTER -->
		<div class="footer">
			<div class="footer-inner">
				 2014 &copy; Hadoit.
			</div>
			<div class="footer-tools">
				<span class="go-top">
					<i class="fa fa-angle-up"></i>
				</span>
			</div>
		</div>
		<!-- END FOOTER -->
	</body>
 </#macro>

<#macro workbench>
<@html>
<@head></@head>
<@body>
	<#nested />
</@body>
</@html>
</#macro>

<#macro js>
<#include "/lib/corejs.ftl">
<#nested />
</#macro>

<#function slim str len>
	<#if str?length lt 10>
		<#return str?default("")>
	<#else>
		<#if len gt str?length>
			<#assign __len = str?length>
		<#else>
			<#assign __len = len>
		</#if>
		<#return (str[0..__len-1]?default("")) + "...">
	</#if>
</#function>