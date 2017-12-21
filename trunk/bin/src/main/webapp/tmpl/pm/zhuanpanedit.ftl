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
					<@spring.message "gms.tool.zhuanpanname"/> <small><@spring.message "gms.tool.zhuanpan"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-6">
			   		<form id="mainform" class="register-form" action="?module=player&action=zhuanpanedit&oprGroup=${oprGroup}&serverId=${serverId}&accountName=${accountName}&username=${userName}&dbID=${dbID}&id=${id}" method="post">
			   			<input type="hidden"  value= name="data[id]" >
			   			<#list datas as dt>
						<div class="form-group">
							<label class="control-label ">角色名:</label>
							<input id="touserId"  readonly="true" name="" class="form-control placeholder-no-fix" type="text" value="${dt.roleName}" >
						</div>
						<div class="form-group">
							<label class="control-label ">渠道:</label>
							<input id="touserId"  readonly="true" name="" class="form-control placeholder-no-fix" type="text" value="${oprGroup}" >
						</div>
						<div class="form-group">
							<label class="control-label ">区服:</label>
							<input id="touserId"  readonly="true" name="" class="form-control placeholder-no-fix" type="text" value="${serverId}" >
						</div>
						<div class="form-group">
							<label class="control-label ">消耗的转盘次数:</label>
							<input id="touserId"  readonly="true" name="" class="form-control placeholder-no-fix" type="text" value="<#if dt.zhuanPanCount?exists><#else>${dt.zhuanPanCount?default("")}</#if>" >
						</div>
						<div class="form-group">
							<label class="control-label ">充值转盘配置:</label>
							<div class="form-group">
                            <textarea id="touserId"   name="zhuanPanCZ" class="form-control placeholder-no-fix" >${dt.zhuanPanCZ?default("")}</textarea>
							</div>
						</div>	
						<div class="form-group">
							<label class="control-label ">消费转盘配置:</label>
							<div class="form-group">
								<textarea id="touserId"   name="zhuanPanXF" class="form-control placeholder-no-fix" >${dt.zhuanPanXF?default("")}</textarea>
							</div>
						</div>
						</#list>
						<div class="form-actions">
							<input type="button" value="<@spring.message "gms.wjgl.baocun"/>" class="btn" id="btnajax" >
         					<input type="button" onclick="location.replace('?module=player&action=playerlist');" value="<@spring.message "gms.wjgl.fanhui"/>" class="btn">
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