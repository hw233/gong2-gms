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
					<@spring.message "gms.wjgl.wjgl"/> <small><@spring.message "gms.wjgl.tianjiagundongxiaoxi"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-6">
			   		<form id="mainform" class="register-form" action="?module=roll&action=dorollcreate" method="post">
			   			<input type="hidden"  value=${dt.id} name="data[id]" >
			   			<div class="form-group">
							<label class="control-label "><@spring.message "gms.yysj.qudao"/>:</label>
							<select id="oprGroupSel" name="data[oprGroup]" class="select2 form-control " sval="${dt.oprGroup?default("")}">
								<option value='anzhuo+iosyy'>安卓+越狱</option>
							</select> 
						</div>
						<div class="form-group">
							<label class="control-label "><@spring.message "gms.yysj.fuwuqi"/>:</label>
							<select id="serverIdSel" name="data[serverId]" class="select2 form-control " sval="${dt.serverId?default("0")}"></select>
						</div>
			   			<div class="form-group">
							<label class="control-label "><@spring.message "gms.wjgl.neirong"/>:</label>
							<div class="input-icon">
								<textarea class="form-control maxlength-handler" rows="5" name="data[content]" maxlength="1000">${dt.content!('')}</textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label "><@spring.message "gms.wjgl.meitiandingshi"/>：</label>
							<input  name="data[dayHour]" class="required number" value="${dt.dayHour}" maxlength="2" size="6"><@spring.message "gms.wjgl.shi"/>：
							<input  name="data[dayMinute]" class="required number"  value="${dt.dayMinute}" maxlength="2" size="6"><@spring.message "gms.wjgl.feng"/>，<@spring.message "gms.wjgl.bofangyici"/>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.wjgl.xunhuanmeige"/>：</label>
								<input  name="data[repeatInterval]" class="placeholder-no-fix required" type="text" value="${dt.repeatInterval!('')}" maxlength="10" size="10">
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.wjgl.youxiaoshijian"/>：</label>
							<input type="text"  value="${FsGameGmsUtils.formatDate(dt.startTime?default(0), 'yyyy-MM-dd HH:mm')}" id="tp_startTime" name="data[startTime]">
							<@spring.message "gms.wjgl.zhi"/>
							<input type="text"  value="${FsGameGmsUtils.formatDate(dt.endTime?default(0), 'yyyy-MM-dd HH:mm')}" id="tp_endTime" name="data[endTime]">
						</div>
						<div class="form-group">
							<label style="color: red;"><@spring.message "gms.wjgl.mtdsxhmg"/></label>
						</div>
						<div class="form-actions">
							<input type="button" value="<@spring.message "gms.yysj.tijiao"/>" class="btn" id="addrollbtn" name="addrollbtn">
         					<input type="button" onclick="location.replace('?module=roll&amp;action=rolllist');" value="<@spring.message "gms.wjgl.fanhui"/>" class="btn">
						</div>
					</form>
				</div>
			</div>
			<!-- END PAGE CONTENT-->
	</div>
</div>

<@js>
<script type="text/javascript" src="${pluginsRoot}/jquery-ui-timepicker/jquery-ui-timepicker-addon.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${jsRoot}/core/app.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript" src="${jsRoot}/custom/pm.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript">
	jQuery(document).ready(function() {    
       App.init();
       PlayerManager.initRoll();
    });
</script>
</@js>
</@workbench>
</#escape>