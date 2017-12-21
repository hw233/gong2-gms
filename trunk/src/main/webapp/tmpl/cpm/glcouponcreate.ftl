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
					<@spring.message "gms.dhmgl.dhmgl"/> <small><@spring.message "gms.dhmgl.qddhm"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-6">
			   		<form id="mainform" class="register-form" action="?module=glcoupon&action=doglcouponcreate" method="post">
			   			<input type="hidden"  value=${data.id} name="data[id]" >
						<div class="form-group" >
							<label class="control-label "><@spring.message "gms.dhmgl.duihuanma"/>:</label>
							<div class="input-icon">
								<input  class="form-control placeholder-no-fix required" type="text" <#if data.id &gt; 0>readonly="true"</#if> name="data[couponCode]" value="${data.couponCode!('')}" maxlength="50" size="50">
							</div>
						</div>
						<div class="form-group" >
							<label class="control-label "><@spring.message "gms.dhmgl.lbidqueding"/>:</label>
							<div class="input-icon">
								<input  class="form-control placeholder-no-fix required" type="text" name="data[giftId]" value="${data.giftId!('')}" maxlength="50" size="50">
							</div>
						</div>
						
						<div class="form-group" >
							
							<div class="input-icon">
								<#if data.id &gt; 0>
									<@spring.message "gms.yysj.qudao"/>:&nbsp;<input  class="form-control placeholder-no-fix required" type="text" readonly="true" name="data[oprGroup]" value="${data.oprGroup!('')}">
									
									<@spring.message "子渠道"/>:&nbsp;<input  class="form-control placeholder-no-fix required" type="text" readonly="true" name="data[opr]" value="${data.opr!('')}">
								<#else>
									<@spring.message "gms.yysj.qudao"/>:&nbsp;<select id="qd_oprGroupSel" name="data[oprGroup]" class="select2 " sval="${data.oprGroup!('')}"></select> 
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
									<@spring.message "子渠道"/>:&nbsp;<select id="qd_oprSel" name="data[opr]" class="select2 " sval="${data.opr!('')}"></select>
								</#if>
							</div>
						</div>
						
						<div class="form-actions">
							<input type="button" value="<@spring.message "gms.yysj.tijiao"/>" class="btn" id="addglobalcouponbtn" name="addglobalcouponbtn">
         					<input type="button" onclick="location.replace('?module=glcoupon&amp;action=glcouponlist');" value="<@spring.message "gms.wjgl.fanhui"/>" class="btn">
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
       CouponManager.initGlobalCouponCreate();
    });
</script>
</@js>
</@workbench>
</#escape>