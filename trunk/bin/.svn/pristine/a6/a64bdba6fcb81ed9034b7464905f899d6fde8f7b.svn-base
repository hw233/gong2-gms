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
					<@spring.message "gms.dhmgl.dhmgl"/> <small><@spring.message "gms.dhmgl.duihuanma"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			

			<!-- BEGIN PAGE CONTENT-->
			<form id="mainform" actionlist="?module=coupon&action=couponlist" method="post">
				<div class="row">
					<div class="col-md-2" style="text-align:right;">
						<input type="text" class="form-control maxlength-handler" id="couponCode" name="couponCode" maxlength="100" placeholder="<@spring.message "gms.dhmgl.duihuanma"/>" value=${couponCode} >
					</div>
					<div class="col-md-2">
	                    <@spring.message "gms.yysj.qudao"/>:&nbsp;<select id="srvOprGroupSel" name="oprGroup" class="select2" >
								    <#list ogl as og>
								    	<option value="${og.oprGroup}" <#if og.oprGroup=="${oprGroup!('')}">selected</#if>>${og.name}</option>
								    </#list>
								</select>
	                </div>
					<div class="col-md-2" style="text-align:right;">
						<input type="button" value="<@spring.message "gms.yysj.tijiao"/>" class="btn green" id="searchbtn" name="searchbtn">
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
	                                                <th><@spring.message "gms.dhmgl.pici"/></th>
	                                                <th><@spring.message "gms.dhmgl.duihuanma"/></th>
	                                                <th><@spring.message "gms.dhmgl.lbid"/></th>
	                                                <th><@spring.message "gms.dhmgl.libaoleixing"/></th>
	                                                <th><@spring.message "gms.dhmgl.sfqy"/></>
	                                                <th><@spring.message "gms.dhmgl.duihuanren"/></th>
	                                                <th><@spring.message "gms.dhmgl.dhfwq"/></th>
	                                                <th><@spring.message "gms.dhmgl.duihuanshijian"/></th>
	                                            </tr>
	                                        </thead>
								
											<tbody role="alert" aria-live="polite" aria-relevant="all">
												<#list datas as data>
		                                            <tr class="${(data_index%2 == 0)?string("odd", "even")}">
		                                                <td>${data.batchCode?default("")}</td>
		                                                <td>${data.couponCode?default("")}</td>
		                                                <td>${data.giftId?default("")}</td>
		                                                <td>${FsGameGmsUtils.getCouponGiftName(data.giftType)?default("")}</td>
		                                                <td>
									                        <#if data.enable==1>
									                            Enable
									                        <#else>
									                            Disable
									                        </#if>  
									                    </td>
		                                                <td>${data.claimUser?default("")}</td>
		                                                <td>
									                        <#if data.claimServerId gt 0>
									                            ${data.claimServerId}<@spring.message "gms.yysj.fu"/>
									                        </#if>  
									                    </td>
		                                                <td>${FsGameGmsUtils.formatDate(data.claimTime, "yyyy-M-d HH:mm")}</td>
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
       CouponManager.initCouponList();
    });
</script>
</@js>
</@workbench>
</#escape>