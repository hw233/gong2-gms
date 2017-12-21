<#include "/lib/workbench.ftl"/>

<#escape x as x?html>
<@workbench>
<div class="page-content-wrapper">

	<div class="page-content">
		<!-- BEGIN PAGE HEADER-->
		<!-- BEGIN PAGE HEADER-->
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN PAGE TITLE & BREADCRUMB-->
					<h3 class="page-title">
					<@spring.message "gms.fwqgl.fwqlb"/> <small><@spring.message "gms.fwqgl.fwqlb"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
		<div class="row-fluid">

					<div class="span6">

						<!-- BEGIN SAMPLE TABLE PORTLET-->

						<div class="portlet box blue">

							<div class="portlet-title">

								<div class="caption"><i class="icon-cogs"></i>Simple Table</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body">

								<table class="table table-hover">

									<thead>

										<tr>

											<th>#</th>

											<th>First Name</th>

											<th>Last Name</th>

											<th class="hidden-480">Username</th>

											<th>Status</th>

										</tr>

									</thead>

									<tbody>

										<tr>

											<td>1</td>

											<td>Mark</td>

											<td>Otto</td>

											<td class="hidden-480">makr124</td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr>

											<td>2</td>

											<td>Jacob</td>

											<td>Nilson</td>

											<td class="hidden-480">jac123</td>

											<td><span class="label label-info">Pending</span></td>

										</tr>

										<tr>

											<td>3</td>

											<td>Larry</td>

											<td>Cooper</td>

											<td class="hidden-480">lar</td>

											<td><span class="label label-warning">Suspended</span></td>

										</tr>

										<tr>

											<td>3</td>

											<td>Sandy</td>

											<td>Lim</td>

											<td class="hidden-480">sanlim</td>

											<td><span class="label label-danger">Blocked</span></td>

										</tr>

									</tbody>

								</table>

							</div>

						</div>

						<!-- END SAMPLE TABLE PORTLET-->

					</div>

					
		
		
		
		
		
		
		
		
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
<script src="${jsRoot}/custom/pm.js?${jsTag}"></script>
<!-- END BODY -->

<script type="text/javascript">
	jQuery(document).ready(function() {
       App.init();
       PlayerManager.initAddNoticeList();
    });
</script>
</@js>
</@workbench>
</#escape>