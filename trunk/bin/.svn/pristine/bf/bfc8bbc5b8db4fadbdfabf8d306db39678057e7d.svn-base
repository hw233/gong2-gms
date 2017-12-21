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
					<@spring.message "gms.aqgl.anquanguanli"/> <small><@spring.message "gms.aqgl.yonghuliebiao"/></small>
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
									<button id="addsecbtn" class="btn green">
									<@spring.message "gms.aqgl.zengjiayonghu"/> <i class="fa fa-plus"></i>
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
												<th>id</th>
							                    <th><@spring.message "gms.wjgl.zhanghao"/></th>
							                    <!-- <th><@spring.message "gms.aqgl.mima"/></th> -->
							                    <th><@spring.message "gms.aqgl.jiaose"/></th>
							                    <th><@spring.message "gms.wjgl.cjsj"/></th>
							                    <th></th>
											</tr>
										</thead>
							
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list srvs as srv>
							                <tr class="${(srv_index%2 == 0)?string("odd", "even")}">
							                    <td>${srv.id?default("")}</td>
							                    <td>${srv.account?default("")}</td>
							                    <!-- <td>${srv.password?default("")}</td> -->
							                    <td>${spring.f_message(FsGameGmsUtils.getSecurityTypeInfo(srv.roleType)?default(""))}</td>
							                    <td>${FsGameGmsUtils.formatDate(srv.createTime, "yyyy-M-d HH:mm")}</td>
							                    <td>
							                    	<a href="javascript:if(confirm('Please confirm again!')){$('#mainform').attr('action','se?module=sec&action=delsec&id=${srv.id}');$('#mainform').submit();}"><@spring.message "gms.wjgl.shanchu"/></a>&nbsp;
							                    	<a href="se?module=sec&action=seccreate&id=${srv.id}"><@spring.message "gms.wjgl.bianji"/></a>&nbsp;
							                    </td>
							                </tr>
							            </#list>
										</tbody>
									</table>
								</div>
								<@pageNav page=page url_pattern='?module=sec&action=seclist&curPage=$$_NO_$$' />
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
<script src="${jsRoot}/custom/se.js?${jsTag}"></script>
<!-- END BODY -->

<script type="text/javascript">
	jQuery(document).ready(function() {
       App.init();
       SecurityManager.initList();
    });
</script>
</@js>
</@workbench>
</#escape>