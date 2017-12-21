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
					<@spring.message "gms.dhmgl.dhmgl"/> <small><@spring.message "gms.dhmgl.libaoleixing"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-6">
			   		<form id="mainform" class="register-form" action="?module=cate&action=docatecreate" method="post">
			   			<input type="hidden"  value=${data.id} name="data[id]" >
			   			<div class="form-group">
							<label class="control-label "><@spring.message "gms.dhmgl.lblxdmwy"/>:</label>
							<div class="input-icon">
								<input  class="form-control placeholder-no-fix required" type="text" name="data[giftType]" value="${data.giftType!('')}" maxlength="50" size="50">
							</div>
						</div>
						
						<div class="form-group" >
							<label class="control-label "><@spring.message "gms.dhmgl.lbmc"/>:</label>
							<div class="input-icon">
								<input  class="form-control placeholder-no-fix required" type="text" name="data[giftName]" value="${data.giftName!('')}" maxlength="50" size="50">
							</div>
						</div>
						
						<div class="form-group" >
							<label class="control-label "><@spring.message "gms.dhmgl.lbidqueding"/></label>
							<div class="input-icon">
								<input  class="form-control placeholder-no-fix required" type="text" name="data[giftId]" value="${data.giftId!('')}" maxlength="50" size="50">
							</div>
						</div>
						
						<div class="form-group" >
							<label class="control-label "><@spring.message "gms.dhmgl.lbms"/>:</label>
							<div class="input-icon">
								<input  class="form-control placeholder-no-fix" type="text" name="data[giftDesc]" value="${data.giftDesc!('')}" maxlength="100" size="100">
							</div>
						</div>

						<div class="form-actions">
							<input type="button" value="<@spring.message "gms.yysj.tijiao"/>" class="btn" id="addcatebtn" name="addcatebtn">
         					<input type="button" onclick="location.replace('?module=cate&amp;action=catelist');" value="<@spring.message "gms.wjgl.fanhui"/>" class="btn">
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
<script type="text/javascript" src="${jsRoot}/custom/cpm.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript">
	jQuery(document).ready(function() {    
       App.init();
       CouponManager.initCateCreate();
    });
</script>
</@js>
</@workbench>
</#escape>