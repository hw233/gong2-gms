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
					<@spring.message "gms.dhmgl.dhmgl"/> <small><@spring.message "gms.dhmgl.qddhm"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			

			<!-- BEGIN PAGE CONTENT-->
			<form id="mainform" actionlist="?module=glcoupon&action=glcouponlist" method="post">
				<div class="table-toolbar">
					<div class="btn-group">
						<button id = "addGlobalCouponBtn"  class="btn green">
							<@spring.message "gms.dhmgl.zjqddhm"/><i class="fa fa-plus"></i>
						</button>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<!-- BEGIN EXAMPLE TABLE PORTLET-->
						<div class="portlet box" id="portlet_1">
							<div class="portlet-body">
								<div id="sample_editable_1_wrapper" class="dataTables_wrapper"
									role="grid">
									<div class="table-scrollable">
										<table
											class="table table-striped table-hover table-bordered dataTable"
											id="sample_editable_1" aria-describedby="sample_editable_1_info">
											<thead>
	                                            <tr class="heading" role="row">
	                                                <th><@spring.message "gms.dhmgl.duihuanma"/></th>
	                                                <th><@spring.message "gms.dhmgl.lbid"/></th>
	                                                <th><@spring.message "gms.yysj.qudao"/></th>
	                                                <th><@spring.message "子渠道"/></th>
	                                                <th><@spring.message "gms.dhmgl.sfqy"/></>
	                                                <th><@spring.message "gms.wjgl.cjsj"/></th>
	                                                <th><@spring.message "gms.fwqgl.caozuo"/></th>
	                                            </tr>
	                                        </thead>
								
											<tbody role="alert" aria-live="polite" aria-relevant="all">
												<#list datas as data>
		                                            <tr class="${(data_index%2 == 0)?string("odd", "even")}">
		                                                <td>${data.couponCode?default("")}</td>
		                                                <td>${data.giftId?default("")}</td>
		                                                <td>${data.oprGroup?default("")}</td>
		                                                <td>${data.opr?default("")}</td>
		                                                <td>
									                        <#if data.enable==1>
									                            Enable
									                        <#else>
									                            Disable
									                        </#if>  
									                    </td>
		                                                <td>${FsGameGmsUtils.formatDate(data.createTime, "yyyy年M月d日 HH:mm")}</td>
		                                                <td>
		                                                	<a name="glcoupon_en" idVal="${data.id}" href="#">Enable</a>&nbsp;
							                    			<a name="glcoupon_dis" idVal="${data.id}" href="#">Disable</a>&nbsp;
		                                                	<a href="javascript:if(confirm('Please confirm again!')){$('#mainform').attr('action','cpm?module=glcoupon&action=delglcoupon&id=${data.id}');$('#mainform').submit();}"><@spring.message "gms.wjgl.shanchu"/></a>&nbsp;
							                    			<a href="cpm?module=glcoupon&action=glcouponcreate&id=${data.id}"><@spring.message "gms.wjgl.bianji"/></a>&nbsp;
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
       CouponManager.initGlobalCouponList();
    });
</script>
</@js>
</@workbench>
</#escape>