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
					<@spring.message "gms.aqgl.anquanguanli"/> <small><@spring.message "gms.aqgl.tianjiayonghu"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-6">
			   		<form id="mainform" class="register-form" action="?module=sec&action=doseccreate" method="post">
			   			<input type="hidden"  value=${si.id} name="data[id]" >
			   			<div class="form-group">
							<label class="control-label "><@spring.message "gms.wjgl.zhanghao"/>:</label>
							<div class="input-icon">
								<input  class="form-control placeholder-no-fix required" type="text" name="data[account]" value="${si.account!('')}" maxlength="50" size="50">
							</div>
						</div>
						
						<div class="form-group" <#if si.id gt 0>style="display:none"</#if> >
							<label class="control-label "><@spring.message "gms.aqgl.mima"/>:</label>
							<div class="input-icon">
								<input  class="form-control placeholder-no-fix required" type="text" name="data[password]" value="${si.password!('')}" maxlength="50" size="50">
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label "><@spring.message "gms.aqgl.jiaose"/>:</label>
							<div class="input-icon">
								<select name=data[roleType] class="bs-select form-control" >
								    <option value="admin" <#if si.roleType=="admin">selected</#if>><@spring.message "gms.aqgl.guanliyuan"/></option>
								    <option value="data" <#if si.roleType=="data">selected</#if>><@spring.message "gms.aqgl.cksj"/></option>
								    <option value="kf" <#if si.roleType=="kf">selected</#if>><@spring.message "gms.aqgl.kefu"/></option>
								    <option value="yw" <#if si.roleType=="yw">selected</#if>><@spring.message "gms.aqgl.yunwei"/></option>
								    <option value="chengxu" <#if si.roleType=="chengxu">selected</#if>><@spring.message "gms.aqgl.chengxu"/></option>
								    <option value="yunying" <#if si.roleType=="yunying">selected</#if>><@spring.message "gms.aqgl.yunying"/></option>
								    <option value="anquan" <#if si.roleType=="anquan">selected</#if>><@spring.message "gms.aqgl.anquan"/></option>
								    <option value="shichang" <#if si.roleType=="shichang">selected</#if>><@spring.message "gms.aqgl.shichang"/></option>
								</select>
							</div>
						</div>
						
						<div class="form-actions">
							<input type="button" value="<@spring.message "gms.yysj.tijiao"/>" class="btn" id="addsecbtn" name="addsecbtn">
         					<input type="button" onclick="location.replace('?module=sec&amp;action=seclist');" value="<@spring.message "gms.wjgl.fanhui"/>" class="btn">
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
<script type="text/javascript" src="${jsRoot}/custom/se.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript">
	jQuery(document).ready(function() {    
       App.init();
       SecurityManager.initCreate();
    });
</script>
</@js>
</@workbench>
</#escape>