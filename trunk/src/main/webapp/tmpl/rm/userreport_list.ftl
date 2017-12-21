<#include "/lib/workbench.ftl"/>
<#include "/lib/pageNav.ftl">
<script type="text/javascript" src="${pluginsRoot}/media/dropzone.js?${jsTag}" charset="utf-8"></script>
<#escape x as x?html>
<@workbench>

<div class="page-content-wrapper">
	<div class="page-content">
		<!-- BEGIN PAGE HEADER-->
		<div class="row">
			<div class="col-md-12">
				<!-- BEGIN PAGE TITLE & BREADCRUMB-->
				<h3 class="page-title">
					<@spring.message "gms.youxi.yysj"/> <small><@spring.message "gms.youxi.pgzzcx"/></small>
				</h3>
				<@navBar />
				<!-- END PAGE TITLE & BREADCRUMB-->
			</div>
		</div>
		<!-- END PAGE HEADER-->
		<div class="row-fluid">
					<div class="span12">
					<p>
							<span class="label label-important">NOTE:</span>&nbsp;
							请将要查询excel数据，填充到0列,我们将会对0列的数据进行填充
						</p>
						<form action="/gonggms/api/account/postFile" class="dropzone dz-clickable" id="my-awesome-dropzone">
						<div class="dz-default dz-message" data-dz-message="">
						<span>Drop files here to upload</span>
						</div>
						</form>
					</div>
				</div>
	    <div class="row-fluid">
						<!-- END SAMPLE TABLE PORTLET-->
					</div>
					<div class="span6">
						<!-- BEGIN BORDERED TABLE PORTLET-->
						<div class="portlet box yellow">
							<div class="portlet-title">
								<div class="caption"><i class="icon-coffee"></i>报表下载</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"></a>
									<a href="#portlet-config" data-toggle="modal" class="config"></a>
									<a href="javascript:;" class="reload"></a>
									<a href="javascript:;" class="remove"></a>
								</div>
							</div>
							<div class="portlet-body">
								<table class="table table-bordered table-hover">
									<thead>
										<tr>
											<th>编号</th>
											<th>文件名称</th>
											<th>生成时间</th>
											<th>下载</th>
										</tr>
									</thead>
									<tbody id="report_list">
									<tr>
									<td colspan=4>
									暂无报表可以下载
									</td>
									</tr>
									</tbody>
								</table>
							</div>
						</div>
						<!-- END BORDERED TABLE PORTLET-->
					</div>
				</div>
		<!-- END PAGE CONTENT-->
	</div>
</div>

<@js>
<script type="text/javascript" src="${jsRoot}/core/app.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${jsRoot}/custom/pm.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript">
	jQuery(document).ready(function() {    
       	App.init();
    });
    
</script>
</@js>
</@workbench>
</#escape>