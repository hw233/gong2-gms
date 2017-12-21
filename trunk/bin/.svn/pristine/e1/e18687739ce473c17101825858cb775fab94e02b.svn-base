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
					<@spring.message "gms.youxi.yysj"/> <small><@spring.message "gms.youxi.daojufenxi"/></small>
				</h3>
				<@navBar />
				<!-- END PAGE TITLE & BREADCRUMB-->
			</div>
		</div>
		<!-- END PAGE HEADER-->
		
		<!-- BEGIN PAGE CONTENT-->
		<form id="mainform" actionlist="?module=itemstats&action=itemstatslist" method="post">
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
				
				<div class="col-md-2" style="text-align:right;">
					<select id="itemId" name="itemId" class="bs-select form-control" >
					    <option value="0" <#if itemId==0>selected</#if>>All</option>
					    <#list itemIdOption as ii>
					     	<option value="${ii}" <#if itemId==ii>selected</#if>>${FsGameGmsUtils.getItemName(ii)}</option>
		                </#list>
					</select>
				</div>
				
				<div class="col-md-4">
                    <@spring.message "gms.yysj.qudao"/>:&nbsp;<select id="oprGroupSel" name="oprGroup" class="select2 " sval="${oprGroup}"></select> 
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                    <@spring.message "gms.yysj.fu"/>:&nbsp;<select id="serverIdSel" name="serverId" class="select2 " sval="${serverId}"></select>
                </div>
				
				<div class="col-md-3" style="text-align:right;">
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
												<th><@spring.message "gms.yysj.riqi"/></th>
												<th><@spring.message "gms.yysj.qudao"/></th>
												<th><@spring.message "gms.yysj.fu"/></th>
												<th><@spring.message "gms.wjgl.wuping"/></th>
												<th><@spring.message "gms.youxi.goumaishuliang"/></th>
												<th><@spring.message "gms.youxi.goumairenshu"/></th>
												<th><@spring.message "gms.youxi.xtzssl"/></th>
												<th><@spring.message "gms.youxi.xtzsrs"/></th>
												<th><@spring.message "gms.youxi.zongchanchu"/></th>
												<th><@spring.message "gms.youxi.huoderenshu"/></th>
											</tr>
										</thead>
							
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list datas as dt>
							                <tr class="${(dt_index%2 == 0)?string("odd", "even")}">
							                	<td>${FsGameGmsUtils.formatDate(dt.createTime!0, "yyyy-MM-dd")}</td>
							                	<td>${dt.oprGroup?default("-")}</td>
							                    <td>${dt.serverId?default("-")}</td>
							                    <td>${FsGameGmsUtils.getItemName(dt.itemId?default("0"))}</td>
							                    <td>${dt.buyCount?default("0")}</td>
							                    <td>${dt.buyUserCount?default("0")}</td>
							                    <td>${dt.sysCount?default("0")}</td>
							                    <td>${dt.sysUserCount?default("0")}</td>
							                    <td>${dt.totalCount?default("0")}</td>
							                    <td>${dt.totalUserCount?default("0")}</td>
							            	</tr>
							            </#list>
										</tbody>
									</table>
								</div>
								<@pageNav page=page url_pattern='?module=itemstats&action=itemstatslist&curPage=$$_NO_$$' />
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
<script type="text/javascript" src="${jsRoot}/custom/gs.js?${jsTag}" charset="utf-8"></script> 

<script type="text/javascript">
	jQuery(document).ready(function() {    
       App.init();
       GameStats.initItemStats();
    });
</script>
</@js>
</@workbench>
</#escape>