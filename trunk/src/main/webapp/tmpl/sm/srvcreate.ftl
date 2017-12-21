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
					<@spring.message "gms.aqgl.tianjiafuwuqi"/> <small><@spring.message "gms.aqgl.tianjiafuwuqi"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-6">
			   		<form id="mainform" class="register-form" action="?module=srv&action=dosrvcreate" method="post">
			   			<input type="hidden"  value=${si.id} name="data[id]" >
			   			<div class="form-group">
							<label class="control-label "><@spring.message "gms.fwqgl.fuwuqiid"/>:</label>
							<div class="input-icon">
								<input  <#if si.serverId gt 0> readonly="readonly" </#if>  class="form-control placeholder-no-fix required number" type="text" name="data[serverId]" value="<#if si.serverId==0 ><#else>${si.serverId}</#if>" maxlength="6" size="6">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label "><@spring.message "gms.fwqgl.quhao"/>:</label>
							<div class="input-icon">
								<input  <#if si.serverId gt 0> readonly="readonly" </#if> class="form-control placeholder-no-fix required number" type="text" name="data[zone]" value="<#if si.zone==0 ><#else>${si.zone}</#if>" maxlength="6" size="6">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.aqgl.mingchen"/>：</label>
							<div class="input-icon">
								<input  name="data[serverName]" class="form-control placeholder-no-fix required" type="text" value="${si.serverName!('')}" maxlength="50" size="50">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.fwqgl.qudaozu"/>：</label>
							<div class="input-icon">
								<select <#if si.serverId gt 0> disabled="disabled" </#if> id="srvOprGroupSel" name=data[oprGroup] class="bs-select form-control required" >
								    <#list ogl as og>
								    	<option value="${og.oprGroup}" <#if og.oprGroup=="${si.oprGroup!('')}">selected</#if>>${og.name}</option>
								    </#list>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.fwqgl.qudaobiaoshi"/></label>
							<div class="input-icon">
								<input id="srvOprMatchStr" readonly="readonly" name="data[oprMatchStr]" class="form-control placeholder-no-fix required" value="${si.oprMatchStr!('')}" maxlength="10000" size="100">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.fwqgl.dizhi"/>：</label>
							<div class="input-icon">
								<input  name="data[ip]" class="form-control placeholder-no-fix required" type="text" value="${si.ip!('')}" maxlength="20" size="20">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.fwqgl.duankou"/>：</label>
							<div class="input-icon">
								<input name="data[port]" class="form-control placeholder-no-fix required" value="${si.port!('')}" maxlength="5" size="5">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.fwqgl.guanlidizhi"/>：</label>
							<div class="input-icon">
								<input name="data[adminIp]" class="form-control placeholder-no-fix required" value="${si.adminIp!('')}" >
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.fwqgl.guanliduankou"/>：</label>
							<div class="input-icon">
								<input name="data[adminPort]" class="form-control placeholder-no-fix required" value="${si.adminPort!('')}" maxlength="5" size="5">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.fwqgl.shifouxinfu"/>：</label>
							<select name="data[newSrv]" class="select2 form-control">
								<option <#if si.newSrv> selected </#if> value="true">YES</option>
								<option  <#if !si.newSrv> selected </#if> value="false">NO</option>
							</select>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.tool.isPush"/>：</label>
							<select name="data[isPush]" class="select2 form-control">
								<option <#if si.isPush==1> selected </#if> value="1"><@spring.message "gms.tool.Push"/></option>
								<option  <#if si.isPush==0> selected </#if> value="0"><@spring.message "gms.tool.noPush"/></option>
							</select>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.fwqgl.guanfutishi"/>：</label>
							<div class="input-icon">
								<input name="data[closedDesc]" class="form-control placeholder-no-fix" value="${si.closedDesc!('')}" maxlength="200" size="50">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.common.kjlx"/>：</label>
							<select name="data[visibleType]" class="select2 form-control">
								<option <#if si.visibleType==0> selected </#if> value="0"><@spring.message "gms.common.qwkj"/></option>
								<option <#if si.visibleType==1> selected </#if> value="1"><@spring.message "gms.common.bfwlkj"/></option>
								<option <#if si.visibleType==2> selected </#if> value="2"><@spring.message "gms.common.bukejian"/></option>
							</select>
						</div>
						<div class="form-actions">
							<input type="button" value="<@spring.message "gms.yysj.tijiao"/>" class="btn" id="addsrvbtn" name="addsrvbtn">
         					<input type="button" onclick="location.replace('?module=srv&amp;action=srvlist');" value="<@spring.message "gms.wjgl.fanhui"/>" class="btn">
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
       ServerManager.initCreate();
    });
</script>
</@js>
</@workbench>
</#escape>