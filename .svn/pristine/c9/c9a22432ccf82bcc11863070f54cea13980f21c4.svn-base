<#include "/lib/workbench.ftl"/>
<#include "/lib/pageNav.ftl">

<#escape x as x?html>
<@workbench>

<div class="page-content-wrapper">
	<div class="page-content">
			<!-- BEGIN PAGE HEADER-->
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN PAGE TITLE & BREADCRUMB-->
					<h3 class="page-title">
					<@spring.message "gms.tool.itemlist"/> <small><@spring.message "gms.tool.playinfo"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-6">
			   		<form id="mainform" class="register-form" action="?module=playeritem&action=playinfo&oprGroup=${oprGroup}&serverId=${serverId}&accountName=${accountName}&username=${userName}&dbID=${dbID}&id=${id}" method="post">
			   			<input type="hidden"  value= name="data[id]" >
			   			<#list datas as dt>
						<div class="form-group">
							<label class="control-label ">角色名:</label>
							<input id="roleName"   name="roleName" class="form-control placeholder-no-fix" type="text" value="${dt.roleName}" >
						</div>
						<div class="form-group">
							<label class="control-label ">渠道:</label>
							<input id="touserId"  readonly="true" name="" class="form-control placeholder-no-fix" type="text" value="${oprGroup}" >
						</div>
						<div class="form-group">
							<label class="control-label ">区服:</label>
							<input id="touserId"  readonly="true" name="" class="form-control placeholder-no-fix" type="text" value="${serverId}" >
						</div>
						<#if userDetails.userName=="gongadmin"|| userDetails.userName=="panzelin2">
						<div class="form-group">
							<label class="control-label ">等级:</label>
							<input id="lv"   name="lv" class="form-control placeholder-no-fix" type="text" value="${dt.lv}" >
						</div>
						<#else>
						<div class="form-group">
							<label class="control-label ">等级:</label>
							<input id="lv"    readonly="true" name="lv" class="form-control placeholder-no-fix" type="text" value="${dt.lv}" >
						</div>
						</#if>
						<#if userDetails.userName=="gongadmin"|| userDetails.userName=="panzelin2">
						<div class="form-group">
							<label class="control-label ">vip等级:</label>
							<input id="vipLv"   name="vipLv" class="form-control placeholder-no-fix" type="text" value="${dt.vipLv}" >
						</div>
						<#else>
						<div class="form-group">
							<label class="control-label ">vip等级:</label>
							<input id="vipLv"  readonly="true" name="vipLv" class="form-control placeholder-no-fix" type="text" value="${dt.vipLv}" >
						</div>
						</#if>
						<#if userDetails.userName=="gongadmin"|| userDetails.userName=="panzelin2">
						<div class="form-group">
							<label class="control-label ">经验值:</label>
							<input id="exp"   name="exp" class="form-control placeholder-no-fix" type="text" value="${dt.exp}" >
						</div>
						<#else>
						<div class="form-group">
							<label class="control-label ">经验值:</label>
							<input id="exp"  readonly="true"  name="exp" class="form-control placeholder-no-fix" type="text" value="${dt.exp}" >
						</div>
						</#if>
						<#if userDetails.userName=="gongadmin"|| userDetails.userName=="panzelin2">
						<div class="form-group">
							<label class="control-label ">银两:</label>
							<input id="money"   name="money" class="form-control placeholder-no-fix" type="text" value="${dt.money}" >
						</div>
						<#else>
						<div class="form-group">
							<label class="control-label ">银两:</label>
							<input id="money"  readonly="true"  name="money" class="form-control placeholder-no-fix" type="text" value="${dt.money}" >
						</div>
						</#if>
						 <#if userDetails.userName=="gongadmin"|| userDetails.userName=="panzelin2">
						 <div class="form-group">
							<label class="control-label ">元宝:</label>
							<input id="gold"   name="gold" class="form-control placeholder-no-fix" type="text" value="${dt.gold}" >
						</div>
						 <#else>
						  <div class="form-group">
							<label class="control-label ">元宝:</label>
							<input id="gold"   readonly="true" name="gold" class="form-control placeholder-no-fix" type="text" value="${dt.gold}" >
						</div>
						 </#if>
						  <#if userDetails.userName=="gongadmin"|| userDetails.userName=="panzelin2">
						 <div class="form-group">
							<label class="control-label ">闲置元宝:</label>
							<input id="freeGold"   name="freeGold" class="form-control placeholder-no-fix" type="text" value="${dt.freeGold}" >
						</div>
						 <#else>
						  <div class="form-group">
							<label class="control-label ">闲置元宝:</label>
							<input id="freeGold"   readonly="true" name="freeGold" class="form-control placeholder-no-fix" type="text" value="${dt.freeGold}" >
						</div>
						 </#if>
						</#list>
						<div class="form-actions">
							<input type="button" value="<@spring.message "gms.wjgl.baocun"/>" class="btn" id="btnajax" >
         					<input type="button" onclick="location.replace('?module=playeritem&action=playlist');" value="<@spring.message "gms.wjgl.fanhui"/>" class="btn">
						</div>
						
					</form>
				</div>
			</div>
			<!-- END PAGE CONTENT-->
	</div>
</div>

<@js>
<script type="text/javascript" src="${pluginsRoot}/jquery.input-ip-address-control-1.0.min.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${jsRoot}/core/app.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript" src="${jsRoot}/custom/pm.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript">
	jQuery(document).ready(function() {    
       App.init();
       PlayerManager.sendproduct();
    });
    $('#btnajax').click(function(){
     var url=$('#mainform').attr('action');
     $('#mainform').submit();
     alert("提交成功");
    })
   
</script>
</@js>
</@workbench>
</#escape>