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
					<@spring.message "gms.fwqgl.jiaobenzhixing"/> <small><@spring.message "gms.fwqgl.jiaobenzhixing"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<input type="hidden"  value="" id="scriptId" >
				<div class="tab-pane" id="tab_meta">
					<div class="form-body">
						<div class="form-group">
							<label class="col-md-2 control-label"><@spring.message "gms.fwqgl.biaoti"/>:</label>
							<div class="col-md-10">
								<input type="text" class="form-control maxlength-handler" id="scriptTitle" maxlength="100" placeholder="">
								<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label"><@spring.message "gms.wjgl.neirong"/>:</label>
							<div class="col-md-10">
								<textarea class="form-control maxlength-handler" rows="500" id="scriptContent" maxlength="1000000"></textarea>
								<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group" style="text-align:right">
							<@spring.message "gms.yysj.qudao"/>:&nbsp;<select id="oprGroupSel" name="oprGroup" class="select2 " sval=""></select> 
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
							<@spring.message "gms.yysj.fu"/>:&nbsp;<select id="serverIdSel" name="serverId" class="select2 " sval="0"></select>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="button" value="<@spring.message "gms.fwqgl.zhixing"/>" class="btn green" id="runScript" name="runScript">
							<input type="button" value="<@spring.message "gms.wjgl.baocun"/>" class="btn green" id="saveScript" name="saveScript">
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label"><@spring.message "gms.fwqgl.shuchuneirong"/>:</label>
							<div class="col-md-10">
								<div id="scriptResult"></div>
							</div>
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
							id="sample_editable_1" aria-describedby="sample_editable_1_info">
							<thead>
								<tr class="heading" role="row">
									<th><@spring.message "gms.fwqgl.bianhao"/></th>
				                    <th><@spring.message "gms.fwqgl.biaoti"/></th>
				                    <th><@spring.message "gms.wjgl.neirong"/></th>
				                    <th><@spring.message "gms.fwqgl.chuangjianren"/></th>
				                    <th><@spring.message "gms.wjgl.cjsj"/></th>
				                    <th><@spring.message "gms.fwqgl.caozuo"/></th>
								</tr>
							</thead>
				
							<tbody role="alert" aria-live="polite" aria-relevant="all">
							<#list scripts as sp>
				                <tr class="${(sp_index%2 == 0)?string("odd", "even")}">
				                    <td>${sp.id}</td>
				                    <td id="t_${sp.id}">${sp.title?default("")}</td>
				                    <td id="c_${sp.id}">${sp.content?default("")}</td>
				                    <td>${sp.createName?default("")}</td>
				                    <td>${FsGameGmsUtils.formatDate(sp.createTime, "yyyy年M月d日 HH:mm")}</td>
				                    <td>
				                    	<a name="scriptDel" href="#" idVal="${sp.id}"><@spring.message "gms.wjgl.shanchu"/></a>&nbsp;
				                    	<a name="scriptLoad" href="#" idVal="${sp.id}"><@spring.message "gms.fwqgl.jiazai"/></a>&nbsp;
				                    </td>
				                 </tr>
				            </#list>
							</tbody>
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
       ServerManager.initScripts();
    });
</script>
</@js>
</@workbench>
</#escape>