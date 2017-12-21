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
					<@spring.message "gms.wjgl.wjgl"/> <small><@spring.message "gms.wjgl.gdxxgl"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<form id="mainform" method="post">
			<input type="hidden" id="currPage" value="${page.curPage!(1)}"  />
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN EXAMPLE TABLE PORTLET-->
					<div class="portlet box" id="portlet_1">
						<div class="portlet-body">
							<div class="table-toolbar">
								<div class="btn-group">
									<button id="addrollbtn_pre" class="btn green">
									<@spring.message "gms.wjgl.tianjiagundongxiaoxi"/> <i class="fa fa-plus"></i>
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
												<th><@spring.message "gms.yysj.qudao"/></th>
												<th><@spring.message "gms.yysj.fuwuqi"/></th>
							                    <th><@spring.message "gms.wjgl.neirong"/></th>
							                   <!-- <th><@spring.message "gms.wjgl.meitiandingshi"/></th>
							                    <th>每天定<@spring.message "gms.wjgl.feng"/></th>
							                    <th><@spring.message "gms.wjgl.xunhuanmeige"/></th>
							                    <th>有效开始<@spring.message "gms.yysj.riqi"/></th>
							                    <th>结束<@spring.message "gms.yysj.riqi"/></th>-->
							                    <th><@spring.message "gms.wjgl.chuangjianriqi"/></th>
							                    <th></th>
											</tr>
										</thead>
							
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list datas as dt>
							                <tr title="<@spring.message "gms.wjgl.meitiandingshi"/>:${dt.dayHour?default("")}<br/>
							                <@spring.message "gms.wjgl.meitiandingfeng"/>:${dt.dayMinute?default("")}<br/>
							                <@spring.message "gms.wjgl.xunhuanmeige"/>:${dt.repeatInterval?default("")}<br/>
							                <@spring.message "gms.wjgl.youxiaokaishiriqi"/>:${FsGameGmsUtils.formatDate(dt.startTime, "yyyy-M-d HH:mm")}<br/>
							                <@spring.message "gms.wjgl.jiesuriqi"/>:${FsGameGmsUtils.formatDate(dt.endTime, "yyyy-M-d HH:mm")}<br/>
							                <@spring.message "gms.wjgl.neirong"/>:${dt.content?default("")}<br/>
							                " class="${(dt_index%2 == 0)?string("odd", "even")} tooltips">
							                	<td>
								                    <#if dt.oprGroup == ""> 
								                    	<@spring.message "gms.wjgl.ququdao"/>
								                    <#else>
								                    	${dt.oprGroup?default("")}
								                    </#if>
							                    </td>
							                    <td>
								                    <#if dt.serverId == 0> 
								                    	<@spring.message "gms.wjgl.quanfu"/>
								                    <#else>
								                    	${dt.serverId?default("")}
								                    </#if>
							                    </td>
							                    <td>${slim(dt.content,25)}</td>
							                    <!--<td>${dt.dayHour?default("")}</td>
							                    <td>${dt.dayMinute?default("")}</td>
							                    <td>${dt.repeatInterval}</td>
							                    <td>${FsGameGmsUtils.formatDate(dt.startTime, "yyyy年M月d日 HH:mm")}</td>
							                    <td>${FsGameGmsUtils.formatDate(dt.endTime, "yyyy年M月d日 HH:mm")}</td>-->
							                    <td>${FsGameGmsUtils.formatDate(dt.createTime, "yyyy年M月d日 HH:mm")}</td>
							                    <td>
							                    	<#if dt.state == FsGameGmsConst.VERIFY_STATE_PENDING || dt.state == FsGameGmsConst.VERIFY_STATE_REFUSE >
							                    		<a href="javascript:if(confirm('Please confirm again!')){$('#mainform').attr('action','pm?module=roll&action=delroll&id=${dt.id}');$('#mainform').submit();}"><@spring.message "gms.wjgl.shanchu"/></a>&nbsp;
							                    		<a href="pm?module=roll&action=rollcreate&id=${dt.id}"><@spring.message "gms.wjgl.bianji"/></a>&nbsp;
							                    	<#elseif dt.state == FsGameGmsConst.VERIFY_STATE_ALLOW >
							                    		<@spring.message "gms.wjgl.yitongguo"/>
							                    	</#if>
							                    </td>
							                   </tr>
							            </#list>
										</tbody>
									</table>
								</div>
								<@pageNav page=page url_pattern='?module=roll&action=rolllist&curPage=$$_NO_$$' />
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
<script type="text/javascript" src="${pluginsRoot}/jquery-ui-timepicker/jquery-ui-timepicker-addon.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${pluginsRoot}/select2/select2.min.js?${jsTag}" ></script>
<script type="text/javascript" src="${pluginsRoot}/data-tables/jquery.dataTables.js?${jsTag}" ></script>
<script type="text/javascript" src="${pluginsRoot}/data-tables/DT_bootstrap.js?${jsTag}" ></script>
<!-- END PAGE LEVEL PLUGINS -->

<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="${jsRoot}/core/app.js?${jsTag}" ></script>
<script src="${jsRoot}/custom/pm.js?${jsTag}"></script>
<!-- END BODY -->

<script type="text/javascript">
	jQuery(document).ready(function() {
       App.init();
       PlayerManager.initRoll();
    });
</script>
</@js>
</@workbench>
</#escape>