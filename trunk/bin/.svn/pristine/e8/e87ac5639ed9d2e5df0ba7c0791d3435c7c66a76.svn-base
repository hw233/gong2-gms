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
					<@spring.message "gms.yysj.yysj"/> <small><@spring.message "gms.yysj.qjtj"/></small>
				</h3>
				<@navBar />
				<!-- END PAGE TITLE & BREADCRUMB-->
			</div>
		</div>
		<!-- END PAGE HEADER-->
		
		<!-- BEGIN PAGE CONTENT-->
		<form id="mainform" actionlist="?module=global&action=globallist" actionexport="?module=global&action=globalexport" method="post">
			<input type="hidden" id="currPage" value="${page.curPage!(1)}"  />
			<div class="row">
				<div class="col-md-3">
					<div class="input-group" id="defaultrange">
						<input type="text" class="form-control" value="${qryVal?default("")}" id="qryVal" name="qryVal">
						<span class="input-group-btn">
							<button class="btn default date-range-toggle" type="button"><i class="fa fa-calendar"></i></button>
						</span>
					</div>
				</div>
				<div class="col-md-4">
					<@spring.message "gms.yysj.qudao"/>:&nbsp;<select id="oprGroupSel" name="oprGroup" class="select2 " sval="${oprGroup}"></select> 
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					<@spring.message "gms.yysj.fu"/>:&nbsp;<select id="serverIdSel" name="serverId" class="select2 " sval="${serverId}"></select>
				</div>
				<div class="col-md-3" style="text-align:right;">
					<input type="button" value="<@spring.message "gms.yysj.tijiao"/>" class="btn green" id="searchbtn" name="searchbtn">
					<input type="button" value="<@spring.message "gms.yysj.daochu"/>" class="btn green" id="exporterbtn" name="exporterbtn">
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
												<th><@spring.message "gms.yysj.qdmc"/></th>
												<th><@spring.message "gms.yysj.fuwuqi"/></th>
												<th><@spring.message "gms.yysj.leijizhanghao"/></th>
												<th><@spring.message "gms.yysj.srhyzh"/></th>
												<th><@spring.message "gms.yysj.qrhyzh"/></th>
												<th><@spring.message "gms.yysj.ljffzhs"/></th>
							                    <th><@spring.message "gms.yysj.fufeilv"/></th>
							                    <th><@spring.message "gms.yysj.ljffje"/></th>
							                    <th><@spring.message "gms.yysj.arpuzhi"/></th>
											</tr>
										</thead>
							
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list datas as dt>
							                <tr class="${(dt_index%2 == 0)?string("odd", "even")}">
							                	<td>${dt.oprGroup?default("")}</td>
							                	<td>${dt.serverId?default("")}</td>
							                    <td>${dt.totalRegCount?default("")}</td>
							                    <td>${dt.loginCount3?default("-")}</td>
							                    <td>${dt.loginCount7?default("-")}</td>
							                    <td>${dt.totalChargeUserCount?default("")}</td>
							                    <td>${dt.chargeRate?string("0.##%")}</td>
							                    <td>
							                    <#if FsGameGmsUtils.inZone('tw')> 
													${(dt.rmbTotalChargeAmount*5)/10}
							                    <#else>
							                    	${(dt.rmbTotalChargeAmount)/10}
							                    </#if>
							                    </td>
							                    <td>
							                    <#if FsGameGmsUtils.inZone('tw')> 
							                    	${(dt.arpu*5)?string("0.##")}
							                    <#else>
							                    	${dt.arpu?string("0.##")}
							                    </#if>
							                    
							                    </td>
							                </tr>
							            </#list>
										</tbody>
									</table>
								</div>
								<@pageNav page=page url_pattern='?module=global&action=globallist&curPage=$$_NO_$$' />
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
<script type="text/javascript" src="${pluginsRoot}/bootstrap-datepicker/js/bootstrap-datepicker.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${pluginsRoot}/bootstrap-timepicker/js/bootstrap-timepicker.min.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${pluginsRoot}/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${pluginsRoot}/bootstrap-daterangepicker/moment.min.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${pluginsRoot}/bootstrap-daterangepicker/daterangepicker.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${jsRoot}/core/app.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript" src="${jsRoot}/custom/opt.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript">
	jQuery(document).ready(function() {    
       App.init();
       OperationManager.init();
    });
</script>
</@js>
</@workbench>
</#escape>