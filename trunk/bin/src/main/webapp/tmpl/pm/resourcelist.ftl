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
					<@spring.message "gms.wjgl.wjgl"/> <small><@spring.message "gms.wjgl.yhbdcx"/></small>
				</h3>
				<@navBar />
				<!-- END PAGE TITLE & BREADCRUMB-->
			</div>
		</div>
		<!-- END PAGE HEADER-->
		
		<!-- BEGIN PAGE CONTENT-->
		<form id="mainform" action="?module=resource&action=resourcelist" method="post">
			<input type="hidden" id="currPage" value="${page.curPage!(1)}"  /> 
			<div class="row">
				
				<div class="col-md-1" style="text-align:right;">
					<select id="rtType" name="rtType" class="bs-select form-control" >
					    <option value="80001" <#if rtType=="80001">selected</#if>><@spring.message "gms.wjgl.yinliang"/></option>
					    <option value="80002" <#if rtType=="80002">selected</#if>><@spring.message "gms.wjgl.yuanbao"/></option>
					    <option value="80003" <#if rtType=="80003">selected</#if>><@spring.message "gms.youxi.jinyan"/></option>
					    <option value="80004" <#if rtType=="80004">selected</#if>><@spring.message "gms.wjgl.ltjf"/></option>
					    <option value="80005" <#if rtType=="80005">selected</#if>><@spring.message "gms.wjgl.zbsp"/></option>
					    <option value="80006" <#if rtType=="80006">selected</#if>><@spring.message "gms.wjgl.vipjifeng"/></option>
					    <option value="80008" <#if rtType=="80008">selected</#if>><@spring.message "gms.wjgl.wjjfx"/></option>
					    <option value="80009" <#if rtType=="80009">selected</#if>><@spring.message "gms.wjgl.qsyp"/></option>
					    <option value="80010" <#if rtType=="80010">selected</#if>><@spring.message "gms.wjgl.fcyp"/></option>
					    <option value="80011" <#if rtType=="80011">selected</#if>><@spring.message "gms.wjgl.yzyp"/></option>
					    <option value="80012" <#if rtType=="80012">selected</#if>><@spring.message "gms.wjgl.jxyyp"/></option>
					    <option value="80013" <#if rtType=="80013">selected</#if>><@spring.message "gms.wjgl.nd"/></option>
					    <option value="80014" <#if rtType=="80014">selected</#if>><@spring.message "gms.wjgl.frd"/></option>
					    <option value="80015" <#if rtType=="80015">selected</#if>><@spring.message "gms.wjgl.ml"/></option>
					    <option value="80016" <#if rtType=="80016">selected</#if>><@spring.message "gms.wjgl.jinzhuan"/></option>
					    <option value="80017" <#if rtType=="80017">selected</#if>><@spring.message "gms.wjgl.paixijinzhuan"/></option>
					    <option value="80018" <#if rtType=="80018">selected</#if>><@spring.message "gms.wjgl.yhd"/></option>
					    <option value="80019" <#if rtType=="80019">selected</#if>><@spring.message "gms.wjgl.eaz"/></option>
					    <option value="80020" <#if rtType=="80020">selected</#if>><@spring.message "gms.wjgl.shilizhi"/></option>
					    <option value="80021" <#if rtType=="80021">selected</#if>><@spring.message "gms.wjgl.swvalue"/></option>
					    <option value="80023" <#if rtType=="80024">selected</#if>><@spring.message "gms.wjgl.zbspvalue"/></option>
					    <option value="80024" <#if rtType=="80024">selected</#if>><@spring.message "gms.wjgl.lfbvalue"/></option>
					    <option value="80026" <#if rtType=="80026">selected</#if>><@spring.message "gms.wjgl.ryzvalue"/></option>
					</select>
				</div>
				
				<div class="col-md-3">
					<div class="input-group" id="defaultrange">
						<input type="text" class="form-control" value="${qryVal?default("")}" id="qryVal" name="qryVal">
						<span class="input-group-btn">
							<button class="btn default date-range-toggle" type="button"><i class="fa fa-calendar"></i></button>
						</span>
					</div>
				</div>
				
				<div class="col-md-2" style="text-align:right;">
					<input type="text" class="form-control maxlength-handler" id="gbId" name="gbId" maxlength="100" placeholder="<@spring.message "gms.wjgl.wjid"/>" value=${gbId} >
				</div>	
				
				<div class="col-md-2" style="text-align:right;">
					<input type="text" class="form-control maxlength-handler" id="roleName" name="roleName" maxlength="100" placeholder="<@spring.message "gms.wjgl.dfmc"/>" value=${roleName} >
				</div>	
				<div class="col-md-3">
					<@spring.message "gms.yysj.qudao"/>:&nbsp;<select id="oprGroupSel" name="oprGroup" class="select2 " sval="${oprGroup}"></select> 
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					<@spring.message "gms.yysj.fu"/>:&nbsp;<select id="serverIdSel" name="serverId" class="select2 " sval="${serverId}"></select>
				</div>
				<div class="col-md-1" style="text-align:right;">
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
												<#if rtType=="80001">
													<th><@spring.message "gms.wjgl.zhanghao"/></th>
													<th><@spring.message "gms.wjgl.jiaoseming"/></th>
													<th><@spring.message "gms.wjgl.jsid"/></th>
													<th><@spring.message "gms.wjgl.gaibianzhi"/></th>
													<th><@spring.message "gms.wjgl.zuixinzhi"/></th>
													<th><@spring.message "gms.wjgl.czlx"/></th>
													<th><@spring.message "gms.wjgl.czsj"/></th>
												<#elseif rtType=="80002">
													<th><@spring.message "gms.wjgl.zhanghao"/></th>
													<th><@spring.message "gms.wjgl.jiaoseming"/></th>
													<th><@spring.message "gms.wjgl.jsid"/></th>
													<th><@spring.message "gms.wjgl.zsyb"/><@spring.message "gms.wjgl.gaibianzhi"/></th>
													<th><@spring.message "gms.wjgl.zsyb"/><@spring.message "gms.wjgl.dangqianzhi"/></th>
													<th><@spring.message "gms.wjgl.czyb"/><@spring.message "gms.wjgl.gaibianzhi"/></th>
													<th><@spring.message "gms.wjgl.czyb"/><@spring.message "gms.wjgl.dangqianzhi"/></th>
													<th><@spring.message "gms.wjgl.descripe"/></th>
													<th>sourceId1</th>
													<th>sourceId2</th>
													<th><@spring.message "gms.wjgl.czlx"/></th>
													<th><@spring.message "gms.wjgl.czsj"/></th>
												<#elseif rtType=="80003">
													<th><@spring.message "gms.wjgl.zhanghao"/></th>
													<th><@spring.message "gms.wjgl.jiaoseming"/></th>
													<th><@spring.message "gms.wjgl.jsid"/></th>
													<th><@spring.message "gms.wjgl.gaibianzhi"/></th>
													<th><@spring.message "gms.wjgl.jiudengji"/></th>
													<th><@spring.message "gms.wjgl.dengjicha"/></th>
													<th><@spring.message "gms.wjgl.czlx"/></th>
													<th><@spring.message "gms.wjgl.czsj"/></th>
												<#elseif rtType=="0">
													<th><@spring.message "gms.wjgl.zhanghao"/></th>
													<th><@spring.message "gms.wjgl.jiaoseming"/></th>
													<th><@spring.message "gms.wjgl.jsid"/></th>
													<th><@spring.message "gms.wjgl.wupingmobanid"/></th>
													<th><@spring.message "gms.wjgl.wupingshuliang"/></th>
													<th><@spring.message "gms.wjgl.wupingshiliid"/></th>
													<th><@spring.message "gms.wjgl.czlx"/></th>
													<th><@spring.message "gms.wjgl.czsj"/></th>
												<#else>
													<th><@spring.message "gms.wjgl.zhanghao"/></th>
													<th><@spring.message "gms.wjgl.jiaoseming"/></th>
													<th><@spring.message "gms.wjgl.jsid"/></th>
													<th><@spring.message "gms.wjgl.gaibianzhi"/></th>
													<th><@spring.message "gms.wjgl.zuixinzhi"/></th>
													<th><@spring.message "gms.wjgl.czlx"/></th>
													<th><@spring.message "gms.wjgl.czsj"/></th>
												</#if>
											</tr>
										</thead>
							
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list datas as dt>
							                <tr class="${(dt_index%2 == 0)?string("odd", "even")}">
							                	<#if rtType=="80001">
							                		<td>${dt.accountName?default("")}</td>
								                	<td>${dt.roleName?default("")}</td>
								                	<td>${dt.gbId?default("")}</td>
								                	<td>${dt.delta?default("")}</td>
							                		<td>${dt.oldMoney + dt.delta?default("")}</td>
							                		<td>${spring.f_message(FsGameGmsUtils.getResApproach(rtType?number, dt.sourceType))}</td>
							                		<td>${FsGameGmsUtils.formatDate(dt.createTime!0, "yyyy-MM-dd HH:mm:ss")}</td>
							                	<#elseif rtType=="80002">
							                		<td>${dt.accountName?default("")}</td>
								                	<td>${dt.roleName?default("")}</td>
								                	<td>${dt.gbId?default("")}</td>
								                	<td>${dt.freeGoldDelta?default("")}</td>
								                	<td>${dt.oldFreeGold + dt.freeGoldDelta?default("")}</td>
								                	<td>${dt.goldDelta?default("")}</td>
							                		<td>${dt.oldGold + dt.goldDelta?default("")}</td>
							                		<td>${dt.describe1?default("")}</td>
							                		<td>${FsGameGmsUtils.getMallItemName(dt.sourceId1)}</td>						        
							                		<td>${dt.sourceId2?default("")}</td>
							                		<td>${spring.f_message(FsGameGmsUtils.getResApproach(rtType?number, dt.sourceType))}</td>
							                		<td>${FsGameGmsUtils.formatDate(dt.createTime!0, "yyyy-MM-dd HH:mm:ss")}</td>
							                	<#elseif rtType=="80003">
							                		<td>${dt.accountName?default("")}</td>
								                	<td>${dt.roleName?default("")}</td>
								                	<td>${dt.gbId?default("")}</td>
								                	<td>${dt.expDelta?default("")}</td>
								                	<td>${dt.oldLv?default("")}</td>
								                	<td>${dt.lvDelta?default("")}</td>
							                		<td>${spring.f_message(FsGameGmsUtils.getResApproach(rtType?number, dt.sourceType))}</td>
							                		<td>${FsGameGmsUtils.formatDate(dt.createTime!0, "yyyy-MM-dd HH:mm:ss")}</td>
												<#elseif rtType=="0">
							                		<td>${dt.accountName?default("")}</td>
								                	<td>${dt.roleName?default("")}</td>
								                	<td>${dt.gbId?default("")}</td>
								                	<td>${dt.itemTemplateId?default("")}</td>
								                	<td>${dt.delta?default("")}</td>
								                	<td>${dt.itemInstId?default("")}</td>
							                		<td>${spring.f_message(FsGameGmsUtils.getResApproach(rtType?number, dt.sourceType))}</td>
							                		<td>${FsGameGmsUtils.formatDate(dt.createTime!0, "yyyy-MM-dd HH:mm:ss")}</td>
							                	<#else>
							                		<td>${dt.accountName?default("")}</td>
								                	<td>${dt.roleName?default("")}</td>
								                	<td>${dt.gbId?default("")}</td>
								                	<td>${dt.delta?default("")}</td>
							                		<td>${dt.oldVal + dt.delta?default("")}</td>
							                		<td>${spring.f_message(FsGameGmsUtils.getResApproach(rtType?number, dt.sourceType))}</td>
							                		<td>${FsGameGmsUtils.formatDate(dt.createTime!0, "yyyy-MM-dd HH:mm:ss")}</td>
							                	</#if>
							            	</tr>
							            </#list>
										</tbody>
									</table>
								</div>
								<@pageNav page=page url_pattern='?module=resource&action=resourcelist&curPage=$$_NO_$$' />
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
<script type="text/javascript" src="${jsRoot}/custom/pm.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript">
	jQuery(document).ready(function() {    
       	App.init();
       	PlayerManager.init();
    });
    
</script>
</@js>
</@workbench>
</#escape>