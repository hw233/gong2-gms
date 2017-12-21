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
					<@spring.message "gms.aqgl.anquanguanli"/> <small><#if oprg.id gt 0><@spring.message "gms.wjgl.bianji"/><@spring.message "gms.yysj.qudao"/><#else><@spring.message "gms.aqgl.tianjiaqudao"/></#if></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-6">
			   		<form id="mainform" class="register-form" action="?module=oprgroup&action=dooprgroupcreate" method="post">
			   			<input type="hidden"  value=${oprg.id} name="data[id]" >
			   			<div class="form-group">
							<label class="control-label "><@spring.message "gms.aqgl.mingchen"/>:</label>
							<div class="input-icon">
								<input  class="form-control placeholder-no-fix required" type="text" name="data[name]" value="${oprg.name!('')}" maxlength="50" size="50">
							</div>
						</div>
			   			<div class="form-group">
							<label class="control-label "><@spring.message "gms.yysj.qudao"/>:</label>
							<div class="input-icon">
								<input  class="form-control placeholder-no-fix required" type="text" name="data[oprGroup]" value="${oprg.oprGroup!('')}" maxlength="50" size="50">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.fwqgl.qudaobiaoshi"/></label>
							<div class="input-icon">
								<input id="oprMatchStrId" name="data[oprMatchStr]" class="form-control placeholder-no-fix required" value="${oprg.oprMatchStr!('')}" maxlength="10000" size="100">
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label "><@spring.message "gms.fwqgl.rzfwqdz"/>:</label>
							<div class="input-icon">
								<input  class="form-control placeholder-no-fix required" type="text" name="data[loginUrl]" value="${oprg.loginUrl!('')}" maxlength="200" size="200">
							</div>
						</div>
						<div class="form-actions">
							<input type="button" value="<@spring.message "gms.yysj.tijiao"/>" class="btn" id="addoprgroupbtn" name="addoprgroupbtn">
         					<input type="button" onclick="location.replace('?module=oprgroup&amp;action=oprgrouplist');" value="<@spring.message "gms.wjgl.fanhui"/>" class="btn">
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
<script type="text/javascript" src="${jsRoot}/custom/sm.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript">
	jQuery(document).ready(function() {    
       App.init();
       ServerManager.initOprGroupCreate();
    });
</script>
</@js>
</@workbench>
</#escape>