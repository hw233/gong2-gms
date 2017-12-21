<#include "/lib/workbench.ftl"/>

<#escape x as x?html>
<@workbench>

<div class="page-content-wrapper">
	<div class="page-content">
			<!-- BEGIN PAGE HEADER-->
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN PAGE TITLE & BREADCRUMB-->
					<h3 class="page-title">
					<@spring.message "gms.aqgl.anquanguanli"/> <small><@spring.message "gms.fwqgl.qudaoliebiao"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<form id="mainform" method="post">
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN EXAMPLE TABLE PORTLET-->
					<div class="portlet box" id="portlet_1">
						<div class="portlet-body">
							<div class="table-toolbar">
								<div class="btn-group">
									<button id="addoprgroupbtn" class="btn green">
									<@spring.message "gms.fwqgl.zengjiaqudao"/> <i class="fa fa-plus"></i>
									</button>
								</div>
							</div>
							
							
							<div id="sample_editable_1_wrapper" class="dataTables_wrapper"
								role="grid">
								
								<div class="table-scrollable">
								
									<table
										class="table table-striped table-hover table-bordered dataTable"
										id="sample_editable_1" aria-describedby="sample_editable_1_info">
										<thead>
											<tr class="heading" role="row">
												<th><@spring.message "gms.aqgl.mingchen"/></th>
												<th><@spring.message "gms.yysj.qudao"/></th>
												<th><@spring.message "gms.fwqgl.qudaobiaoshi"/></th>
							                    <th><@spring.message "gms.fwqgl.rzfwqdz"/></th>
							                    <th><@spring.message "gms.wjgl.cjsj"/></th>
							                    <th><@spring.message "gms.fwqgl.zhicezhuangtai"/></th>
							                    <th><@spring.message "gms.fwqgl.caozuo"/></th>
											</tr>
										</thead>
							
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list srvs as srv>
							                <tr class="${(srv_index%2 == 0)?string("odd", "even")}">
							                	<td>${srv.name?default("")}</td>
							                    <td>${srv.oprGroup?default("")}</td>
							                    <td>${srv.oprMatchStr?default("")}</td>
							                    <td>${srv.loginUrl?default("")}</td>
							                    <td>${FsGameGmsUtils.formatDate(srv.createTime, "yyyy-M-d HH:mm")}</td>
							                    <td><#if srv.registerState> <@spring.message "gms.fwqgl.kaifangzhuce" /> <#else> <@spring.message "gms.fwqgl.guanbizhuce" /> </#if></td>
							                    <td>
							                    	<a href="javascript:if(confirm('Please confirm again!')){$('#mainform').attr('action','sm?module=oprgroup&action=deloprgroup&id=${srv.id}');$('#mainform').submit();}"><@spring.message "gms.wjgl.shanchu"/></a>&nbsp;
							                    	<a href="sm?module=oprgroup&action=oprgroupcreate&id=${srv.id}"><@spring.message "gms.wjgl.bianji"/></a>&nbsp;
							                    	<a href="javascript:if(confirm('Please confirm again!')){$('#mainform').attr('action','sm?module=oprgroup&action=openregister&id=${srv.id}');$('#mainform').submit();}"><@spring.message "gms.fwqgl.kaifangzhuce"/></a>&nbsp;
							                    	<a href="javascript:if(confirm('Please confirm again!')){$('#mainform').attr('action','sm?module=oprgroup&action=closeregister&id=${srv.id}');$('#mainform').submit();}"><@spring.message "gms.fwqgl.guanbizhuce"/></a>&nbsp;
							                    	<#if srv.openShiming> <a href="javascript:if(confirm('Please confirm again!')){$('#mainform').attr('action','sm?module=oprgroup&action=closeshiming&id=${srv.id}');$('#mainform').submit();}"><@spring.message "gms.tool.closeshiming" /></a> <#else><a href="javascript:if(confirm('Please confirm again!')){$('#mainform').attr('action','sm?module=oprgroup&action=openshiming&id=${srv.id}');$('#mainform').submit();}"><@spring.message "gms.tool.openshiming" /></a>  </#if>&nbsp;
							                    	<#if srv.openShingmingshow> <a href="javascript:if(confirm('Please confirm again!')){$('#mainform').attr('action','sm?module=oprgroup&action=closeshimingshow&id=${srv.id}');$('#mainform').submit();}"><@spring.message "gms.tool.shimingnotshow" /></a> <#else><a href="javascript:if(confirm('Please confirm again!')){$('#mainform').attr('action','sm?module=oprgroup&action=openshimingshow&id=${srv.id}');$('#mainform').submit();}"><@spring.message "gms.tool.shimingshow" /></a>  </#if>
							                    </td>
							                </tr>
							            </#list>
										</tbody>
									</table>
								</div>
							</div>
							
						</div>
					</div>
					<!-- END EXAMPLE TABLE PORTLET-->
				</div>
			</div>
			</form>
			<!-- END PAGE CONTENT-->
	</div>
</div>

<@js>
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="${pluginsRoot}/select2/select2.min.js?${jsTag}" ></script>
<script type="text/javascript" src="${pluginsRoot}/data-tables/jquery.dataTables.js?${jsTag}" ></script>
<script type="text/javascript" src="${pluginsRoot}/data-tables/DT_bootstrap.js?${jsTag}" ></script>
<!-- END PAGE LEVEL PLUGINS -->

<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="${jsRoot}/core/app.js?${jsTag}" ></script>
<script src="${jsRoot}/custom/sm.js?${jsTag}"></script>
<!-- END BODY -->

<script type="text/javascript">
	jQuery(document).ready(function() {
       App.init();
       ServerManager.initOprGroupList();
    });
</script>
</@js>
</@workbench>
</#escape>