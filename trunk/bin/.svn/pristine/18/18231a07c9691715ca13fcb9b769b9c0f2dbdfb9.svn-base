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
					<@spring.message "gms.fwqgl.kaifugongju"/> <small><@spring.message "gms.fwqgl.kaifugongju"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-6" id="serverConfigData">
				</div>
			</div>
			
			<div class="row" style="margin-left:20px">
				<@spring.message "gms.yysj.qudao"/>:&nbsp;<select id="oprGroupSel" name="oprGroup" class="select2 " sval=""></select> 
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
				<@spring.message "gms.yysj.fu"/>:&nbsp;<select id="serverIdSel" name="serverId" class="select2 " sval="0"></select>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="button" value="<@spring.message "gms.fwqgl.kaiqidenglu"/>" class="btn green" id="openSrv" name="openSrv">
				<input type="button" value="<@spring.message "gms.fwqgl.guanbidenglu"/>" class="btn purple" id="closeSrv" name="closeSrv">
				<input type="button" value="<@spring.message "gms.fwqgl.shujucunchu"/>" class="btn purple" id="flushData" name="flushData">
				<input type="button" value="<@spring.message "gms.fwqgl.tingfu"/>" class="btn red" id="stopSrv" name="stopSrv">
				<input type="button" value="<@spring.message "gms.fwqgl.szzgzx"/>" class="btn purple" id="setupMax" name="setupMax" onclick="$('#responsive').modal();">
				<input type="button" value="<@spring.message "gms.fwqgl.regenxing"/>" class="btn green" id="hotfix" name="hotfix">
				<input type="button" value="<@spring.message "gms.fwqgl.shubanben"/>" class="btn green" id="refreshVersion" name="refreshVersion">
				<input type="button" value="<@spring.message "gms.fwqgl.tbkfsj"/>" class="btn yellow" id="forceSyncZstData" name="forceSyncZstData">
			</div>
			
			<div id="responsive" class="modal fade" tabindex="-1" data-width="380">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title"><@spring.message "gms.fwqgl.szzgzx"/></h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<div class="col-md-6">
							<p>
								<input id="maxVal" class="form-control" type="text" maxlength="20" size="20">
							</p>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" data-dismiss="modal" class="btn btn-default"><@spring.message "gms.fwqgl.guanbi"/></button>
					<button type="button" class="btn blue" id="saveMax"><@spring.message "gms.wjgl.baocun"/></button>
				</div>
			</div>
			<!-- END PAGE CONTENT-->
	</div>
</div>

<@js>
<script type="text/javascript" src="${pluginsRoot}/bootstrap-modal/js/bootstrap-modalmanager.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${pluginsRoot}/bootstrap-modal/js/bootstrap-modal.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${pluginsRoot}/jquery.input-ip-address-control-1.0.min.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${jsRoot}/core/app.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript" src="${jsRoot}/custom/sm.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript">	
	jQuery(document).ready(function() {    
       App.init();
       ServerManager.initTools();
    });
</script>
</@js>
</@workbench>
</#escape>