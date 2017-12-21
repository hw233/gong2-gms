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
					SQL EXECUTER <small>SQL EXECUTER</small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="tab-pane" id="tab_meta">
					<div class="form-body">
						<div class="form-group">
							 <small style="color:red">请慎用! PLS Cautious!</small>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label">content:</label>
							<div class="col-md-10">
								<textarea class="form-control maxlength-handler" rows="5" id="sqlContent" maxlength="1000"></textarea>
								<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group" style="text-align:right">
							SRVNAME:&nbsp;<select id="serverNameSel" name="serverName" class="select2 ">
								<option value="login" >login</option>
								<option value="game" >game</option>
								<option value="global" >global</option>
								<option value="logdb" >logdb</option>
								<option value="gms" >gms</option>
							</select> 
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
							OPRGROUP:&nbsp;<select id="oprGroupSel" name="oprGroup" class="select2 " sval=""></select> 
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
							SERVERID:&nbsp;<select id="serverIdSel" name="serverId" class="select2 " sval="0"></select>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="button" value="<@spring.message "gms.fwqgl.zhixing"/>" class="btn green" id="executeSql" name="executeSql">
						</div>
						
					</div>
				</div>
			</div>
			
			
			
			<div class="row" >				
				<div id="sample_editable_1_wrapper" class="dataTables_wrapper"
					role="grid">
					<div class="table-scrollable">
						<table
							class="table table-striped table-hover table-bordered dataTable"
							id="sqlResult" aria-describedby="sample_editable_1_info">
						</table>
					</div>
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
       ServerManager.initSql();
    });
</script>
</@js>
</@workbench>
</#escape>