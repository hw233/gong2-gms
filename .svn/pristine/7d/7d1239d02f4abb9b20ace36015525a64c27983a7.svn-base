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
					<@spring.message "gms.wjgl.wjgl"/> <small><@spring.message "gms.wjgl.yonghuxingxi"/></small>
				</h3>
				<@navBar />
				<!-- END PAGE TITLE & BREADCRUMB-->
			</div>
		</div>
		<!-- END PAGE HEADER-->
		
		<!-- BEGIN PAGE CONTENT-->
		<form id="mainform" action="?module=playeraccount&action=accountlist" method="post">
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
				<div class="col-md-2" style="text-align:right;">
				<select id="vipLv" name="vipLv" class="select2">
				<option value="99" <#if vipLv==99>selected</#if>>选择会员等级</option>
				<option value="0"<#if vipLv==0>selected</#if>>vip0</option>
				<option value="1"<#if vipLv==1>selected</#if>>vip1</option>
				<option value="2"<#if vipLv==2>selected</#if>>vip2</option>
				<option value="3"<#if vipLv==3>selected</#if>>vip3</option>
				<option value="4"<#if vipLv==4>selected</#if>>vip4</option>
				<option value="5"<#if vipLv==5>selected</#if>>vip5</option>
				<option value="6"<#if vipLv==6>selected</#if>>vip6</option>
				<option value="7"<#if vipLv==7>selected</#if>>vip7</option>
				<option value="8"<#if vipLv==8>selected</#if>>vip8</option>
				<option value="9"<#if vipLv==9>selected</#if>>vip9</option>
				<option value="10"<#if vipLv==10>selected</#if>>vip10</option>
				<option value="11"<#if vipLv==11>selected</#if>>vip11</option>
				<option value="12"<#if vipLv==12>selected</#if>>vip12</option>
				<option value="13"<#if vipLv==13>selected</#if>>vip13</option>
				<option value="14"<#if vipLv==14>selected</#if>>vip14</option>
				<option value="15"<#if vipLv==15>selected</#if>>vip15</option>
				<option value="16"<#if vipLv==16>selected</#if>>vip16</option>
				<option value="17"<#if vipLv==17>selected</#if>>vip17</option>
				<option value="18"<#if vipLv==18>selected</#if>>vip18</option>
				</select>
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
												<th><@spring.message "gms.wjgl.zhanghao"/></th>
												<th><@spring.message "gms.wjgl.wjid"/></th>
												<th><@spring.message "gms.wjgl.jsid"/></th>
												<th><@spring.message "gms.wjgl.jiaoseming"/></th>
												<th><@spring.message "gms.wjgl.dengji"/></th>
												<th><@spring.message "gms.wjgl.vip"/></th>
												<th><@spring.message "gms.wjgl.scdl"/></th>
												<th><@spring.message "gms.wjgl.cjsj"/></th>
												<th><@spring.message "gms.wjgl.zaixiang"/></th>
												<th><@spring.message "gms.fwqgl.caozuo"/></th>
											</tr>
										</thead>
							
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list datas as dt>
							                <tr class="${(dt_index%2 == 0)?string("odd", "even")}">
							                	<td>${dt.accountName?default("-")}</td>
							                	<td>${dt.gbId?default("-")}</td>
							                	<td>${dt.id?default("-")}</td>
							                	<td>${dt.roleName?default("-")}</td>
							                	<td>${dt.lv?default("")}</td>
							                	<td>${dt.vipLv?default("")}</td>
							                	<td>${FsGameGmsUtils.formatDate(dt.loginTime!0, "yyyy-MM-dd HH:mm:ss")}</td>
							                	<td>${FsGameGmsUtils.formatDate(dt.createTime!0, "yyyy-MM-dd HH:mm:ss")}</td>
							                	<td>
							                	<#if dt.online>
						                            <span style="color:#00FF00"><@spring.message "gms.wjgl.zaixiang"/></span>
						                        <#else>
						                            <span style="color:#FF0000"><@spring.message "gms.wjgl.lixian"/></span>
						                        </#if>
						                        </td>
							                	<td>
							                	<a name="forbidAccount" href="#" acc="${dt.accountName}" idVal="${dt.id}" ><#if dt.userGroup == -10><@spring.message "gms.common.uncloseaccount"/><#else><@spring.message "gms.common.closeaccount"/></#if></a>&nbsp;
													<a name="forbidLogin" href="#" dbIdVal="${dt.dbId}" idVal="${dt.id}" idVal2=${dt.userGroup}><#if dt.userGroup == -10><@spring.message "gms.wjgl.jiechujinzhi"/><#else><@spring.message "gms.wjgl.jzdl"/></#if></a>&nbsp;
							                	</td>
							            	</tr>
							            </#list>
										</tbody>
									</table>
								</div>
								<@pageNav page=page url_pattern='?module=player&action=playerlist&vipLv=${vipLv}&curPage=$$_NO_$$' />
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
</@js>
</@workbench>
</#escape>