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
					<@spring.message "gms.dhmgl.dhmgl"/> <small><@spring.message "gms.dhmgl.pici"/></small>
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
									<button id="addbatchbtn" class="btn green">
									<@spring.message "gms.dhmgl.zengjiapici"/> <i class="fa fa-plus"></i>
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
												<th><@spring.message "gms.dhmgl.pici"/></th>
												<th><@spring.message "gms.dhmgl.dhms"/></th>
							                    <th><@spring.message "gms.dhmgl.yjhs"/></th>
							                    <th><@spring.message "gms.dhmgl.libaoleixing"/></th>
							                    <th><@spring.message "gms.dhmgl.syqd"/></>
							                    <th><@spring.message "gms.wjgl.chuangjianriqi"/></>
							                    <th><@spring.message "gms.fwqgl.zhuangtai"/></>
							                    <th><@spring.message "gms.fwqgl.caozuo"/></th>
											</tr>
										</thead>
							
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list datas as data>
							                <tr class="${(data_index%2 == 0)?string("odd", "even")}">
							                    <td>${data.batchCode?default("")}</td>
							                    <td>${data.count?default("")}</td>
							                    <td>${data.useCount?default("")}</td>
							                    <td>${FsGameGmsUtils.getCouponGiftName(data.giftType?default(""))}</td>
							                    <td>${data.oprGroup?default("")}--${data.opr?default("")}</td>
							                    <td>${FsGameGmsUtils.formatDate(data.createTime, "yyyy-M-d HH:mm")}</td>
							                    <td><#if data.enable gt 0> <span ><@spring.message "gms.dhmgl.yiqiyong"/></span> <#else> <span ><@spring.message "gms.dhmgl.jinyong"/></span> </#if></td>
							                    <td>
							                    	<a name="batch_en" idVal="${data.id}" href="#">Enable</a>&nbsp;
							                    	<a name="batch_dis" idVal="${data.id}" href="#">Disable</a>&nbsp;
							                    	<a href="cpm?module=batch&action=batchexport&id=${data.id}" target="_blank"><@spring.message "gms.yysj.daochu"/></a>&nbsp;
							                    	<a name="batch_del" idVal="${data.id}" href="#"><@spring.message "gms.wjgl.shanchu"/></a>&nbsp;
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
<script src="${jsRoot}/custom/cpm.js?${jsTag}"></script>
<!-- END BODY -->

<script type="text/javascript">
	jQuery(document).ready(function() {
       App.init();
       CouponManager.initBatchList();
    });
</script>
</@js>
</@workbench>
</#escape>