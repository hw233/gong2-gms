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
					<@spring.message "gms.youxi.yysj"/> <small><@spring.message "gms.youxi.zytj"/></small>
				</h3>
				<@navBar />
				<!-- END PAGE TITLE & BREADCRUMB-->
			</div>
		</div>
		<!-- END PAGE HEADER-->
		
		<!-- BEGIN PAGE CONTENT-->
		<form id="mainform" actionlist="?module=resall&action=resalllist" actionexport="?module=resall&action=resallexport" method="post">
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
				
				<div class="col-md-1" style="text-align:right;">
					<select id="type" name="type" class="bs-select form-control" >
					    <option value="0" <#if type=="0">selected</#if>>All</option>
					    <option value="1" <#if type=="1">selected</#if>><@spring.message "gms.youxi.chanchu"/></option>
					    <option value="2" <#if type=="2">selected</#if>><@spring.message "gms.youxi.chanru"/></option>
					</select>
				</div>
				
				<div class="col-md-1" style="text-align:right;">
					<input type="text" class="form-control maxlength-handler" id="approach" name="approach" maxlength="100" placeholder="<@spring.message "gms.youxi.tujing"/>" value=${approach} >
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
												<th><@spring.message "gms.yysj.riqi"/></th>
												<th><@spring.message "gms.youxi.leixing"/></th>
												<th><@spring.message "gms.youxi.tujing"/></th>
												<th><@spring.message "gms.youxi.ziyuanid"/></th>
												<th><@spring.message "gms.youxi.zymc"/></th>
												<th><@spring.message "gms.youxi.shuliang"/></th>
											</tr>
										</thead>
							
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list datas as dt>
							                <tr class="${(dt_index%2 == 0)?string("odd", "even")}">
							                	<td>${FsGameGmsUtils.formatDate(dt.createTime!0, "yyyy-MM-dd")}</td>
							                    <td>${spring.f_message(FsGameGmsUtils.getResType(dt.type))}</td>
							                    <td>${spring.f_message(FsGameGmsUtils.getResApproach(dt.resId, dt.approach))}</td>
							                    <td>${dt.resId?default("0")}</td>
							                    <td>${spring.f_message(FsGameGmsUtils.getResName(dt.resId))}</td>
							                    <td>${dt.num?default("0")}</td>
							            	</tr>
							            </#list>
										</tbody>
									</table>
								</div>
								<@pageNav page=page url_pattern='?module=resall&action=resalllist&curPage=$$_NO_$$' />
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
       GameStats.initResAllItem();
    });
</script>
</@js>
</@workbench>
</#escape>