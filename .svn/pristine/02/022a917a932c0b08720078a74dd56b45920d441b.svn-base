<#include "/lib/workbench.ftl"/>
<#include "/lib/pageNav.ftl">

<#escape x as x?html>
<@workbench>
<link rel="stylesheet" type="text/css" href="${pluginsRoot}/media/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${pluginsRoot}/media/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${pluginsRoot}/media/h-ui.admin/css/style.css" />
<div class="page-content-wrapper">
	<div class="page-content">
		<!-- BEGIN PAGE HEADER-->
		<div class="row">
			<div class="col-md-12">
				<!-- BEGIN PAGE TITLE & BREADCRUMB-->
				<h3 class="page-title">
					<@spring.message "gms.wjgl.wjgl"/> <small><@spring.message "gms.wjgl.wjwpgl"/></small>
				</h3>
				<@navBar />
				<!-- END PAGE TITLE & BREADCRUMB-->
			</div>
		</div>
		<!-- END PAGE HEADER-->
		
		<!-- BEGIN PAGE CONTENT-->
		
		<form id="mainform" action="?module=playeritem&action=playlist" method="post">
			
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN EXAMPLE TABLE PORTLET-->
					<div class="portlet box" id="portlet_1">
						<div class="portlet-body">
							<div id="sample_editable_1_wrapper" class="dataTables_wrapper"
								role="grid">
								<div class="mt-20 portlet-body">
									<table
										class="table table-border table-bordered table-bg table-hover table-sort"
										id="sample_editable_1" aria-describedby="sample_editable_1_info">
										<thead>
											<tr class="text-c" role="row">
												<th><@spring.message "gms.tool.itemlist.itemname"/></th>
												<th><@spring.message "gms.tool.itemlist.templateid"/></th>
												<th><@spring.message "gms.tool.itemlist.count"/></th>
												<th><@spring.message "gms.tool.itemlist.itemtype"/></th>
												<th><@spring.message "gms.tool.itemlist.createTime"/></th>
												<th><@spring.message "gms.tool.itemlist.order"/></th>
											</tr>
										</thead>
							
										<tbody id="pageman" role="alert" aria-live="polite" aria-relevant="all">
										<#list datas as dt>
							                <tr class="text-c">
							                	<td>${dt.itemname?default("")}</td>
						                        <td>${dt.templateId?default("")}</td>
                                                 <td>${dt.count?default("")}</td>
                                                 <td>${dt.itemtype?default("")}</td>
                                                 <td>${FsGameGmsUtils.formatDate(dt.createTime!0, "yyyy-MM-dd HH:mm:ss")}</td>
							                	<td class="td-manage">
							                	<a style="text-decoration:none" class="btn btn-danger radius" name="" onClick="return confirm('确定删除?');" href="?module=playeritem&action=itemlist&oprGroup=${oprGroup}&serverId=${serverId}&accountName=${accountName}&id=${id}&dbID=${dbID}&itemid=${dt.id}"><@spring.message "gms.tool.itemlist.del"/></a>
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
<script type="text/javascript" src="${jsRoot}/core/app.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${jsRoot}/custom/pm.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript">
	jQuery(document).ready(function() {    
       	App.init();
       	PlayerManager.init();
    });
    
</script>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${pluginsRoot}/media/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pluginsRoot}/media/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pluginsRoot}/media/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="${pluginsRoot}/media/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pluginsRoot}/media/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="${pluginsRoot}/media/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${pluginsRoot}/media/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$('.table-sort').dataTable({
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	  {"orderable":false,"aTargets":[0,4]}// 制定列不参与排序
	]
});
</script>
</@js>
</@workbench>
</#escape>