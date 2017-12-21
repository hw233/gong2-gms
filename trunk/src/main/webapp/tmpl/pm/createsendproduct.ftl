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
					<@spring.message "gms.wjgl.wjgl"/> <small><@spring.message "gms.wjgl.fasongwupin"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-6">
			   		<form id="mainform" class="register-form" action="?module=sendProduct&action=dosendproduct" method="post">
			   			<input type="hidden"  value=${srm.id} name="data[id]" >
			   			
						<div class="form-group">
							<label class="control-label "><@spring.message "gms.yysj.qudao"/>:</label>
							<select id="oprGroupSel" name="data[oprGroup]" class="select2 form-control " sval="${srm.oprGroup?default("")}">
								<option value='anzhuo+iosyy'>安卓+越狱</option>
							</select> 
						</div>
						<div class="form-group">
							<label class="control-label "><@spring.message "gms.yysj.fuwuqi"/>:</label>
							<select id="serverIdSel" name="data[serverId]" class="select2 form-control " sval="${srm.serverId?default("0")}"></select>
						</div>
						
						<div class="form-group">
							<label class="control-label "><@spring.message "gms.aqgl.toUser"/>:</label>
							<div class="input-icon">
								<input id="touserId"  name="data[toUser]" class="form-control placeholder-no-fix" type="text" value="${srm.toUser!('')}" >
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label "><@spring.message "gms.wjgl.productId"/>: </label>
							<div class="input-icon">
								<input id="productId" name="data[productId]" class="form-control placeholder-no-fix" type="text" value="${srm.productId!('')}" >
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.wjgl.beizhu"/>：</label>
							<div class="input-icon">
								<textarea class="form-control maxlength-handler required" rows="5" name="data[beiZhu]" maxlength="1000">${srm.beiZhu!('')}</textarea>
							</div>
						</div>
				
						<div class="form-actions">
							<input type="button" value="<@spring.message "gms.wjgl.baocun"/>" class="btn" id="doaddsrmbtn" >
         					<input type="button" onclick="location.replace('?module=sendProduct&amp;action=sendProductList');" value="<@spring.message "gms.wjgl.fanhui"/>" class="btn">
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
</script>
</@js>
</@workbench>
</#escape>