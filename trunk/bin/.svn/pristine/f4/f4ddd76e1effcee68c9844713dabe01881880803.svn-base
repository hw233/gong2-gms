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
					<@spring.message "gms.youxi.yysj"/> <small><@spring.message "gms.youxi.pgzzcx"/></small>
				</h3>
				<@navBar />
				<!-- END PAGE TITLE & BREADCRUMB-->
			</div>
		</div>
		<!-- END PAGE HEADER-->
		
		<!-- BEGIN PAGE CONTENT-->
		<form id="mainform" action="?module=applepurchase&action=applepurchaselist" method="post">
			<input type="hidden" id="currPage" value="${page.curPage!(1)}"  />
			<div class="row">
				<div class="col-md-2" style="text-align:right;">
					<input type="text" class="form-control maxlength-handler" id="gbId" name="gbId" maxlength="100" placeholder="<@spring.message "gms.wjgl.wjid"/>" value=${gbId} >
				</div>	
				
				<div class="col-md-2" style="text-align:right;">
					<input type="text" class="form-control maxlength-handler" id="userName" name="userName" maxlength="100" placeholder="<@spring.message "gms.wjgl.dfmc"/>" value=${userName} >
				</div>
				<div class="col-md-2" style="text-align:right;">
					<input type="text" class="form-control maxlength-handler" id="accountName" name="accountName" maxlength="100" placeholder="<@spring.message "gms.wjgl.zhanghao"/>" value=${accountName} >
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
												<th><@spring.message "gms.fwqgl.fuwuqiid"/></th>
												<th><@spring.message "gms.wjgl.zhanghao"/></th>
												<th><@spring.message "gms.wjgl.wjid"/></th>
												<th><@spring.message "gms.wjgl.jiaoseming"/></th>
												<th><@spring.message "gms.wjgl.productId"/></th>
												<th><@spring.message "gms.youxi.ddid"/></th>
												<th><@spring.message "gms.wjgl.cjsj"/></th>
											</tr>
										</thead>
							
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list datas as dt>
							                <tr class="${(dt_index%2 == 0)?string("odd", "even")}">
							                	<td>${dt.serverId?default("-")}</td>
							                	<td>${dt.accountName?default("-")}</td>
							                	<td>${dt.gbId?default("-")}</td>
							                	<td>${dt.roleName?default("-")}</td>
							                	<td>${dt.productId?default("-")}</td>
							                	<td>${dt.transactionId?default("")}</td>
							                	<td>${FsGameGmsUtils.formatDate(dt.createTime!0, "yyyy-MM-dd HH:mm:ss")}</td>
							            	</tr>
							            </#list>
										</tbody>
									</table>
								</div>
								<@pageNav page=page url_pattern='?module=applepurchase&action=applepurchaselist&curPage=$$_NO_$$' />
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
       	PlayerManager.initApplePurchase();
    });
    
</script>
</@js>
</@workbench>
</#escape>