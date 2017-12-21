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
					<@spring.message "gms.wjgl.wjgl"/> <small><@spring.message "gms.wjgl.wanjiafankui"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<form id="mainform" action="?module=feedback&action=feedbacklist" method="post">
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN EXAMPLE TABLE PORTLET-->
					<div class="portlet box" id="portlet_1">
						<div class="portlet-body">
							<@spring.message "gms.yysj.qudao"/>:&nbsp;<select id="fbOprGroupSel" name="oprGroup" class="select2 ">
									<#list ogl as og>
								    	<option value="${og.oprGroup}"  <#if og.oprGroup==oprGroup> selected </#if> >${og.name}</option>
								    </#list>
							</select>
							
							<div>
								<table class="table table-striped table-hover table-bordered dataTable" aria-describedby="sample_editable_1_info" >
									<thead>
										<tr class="heading" role="row">
						                    <th><@spring.message "gms.wjgl.mingzi"/></th>
						                    <th><@spring.message "gms.wjgl.lianxifangshi"/></th>
						                    <th><@spring.message "gms.wjgl.neirong"/></th>
						                    <th><@spring.message "gms.wjgl.cjsj"/></th>
						                    <th><@spring.message "gms.wjgl.huifuneirong"/></th>
						                    <th><@spring.message "gms.wjgl.huifushijian"/></th>
						                    <th></th>
										</tr>
									</thead>
						
									<tbody>
										<#list datas as dt>
							                <tr class="${(dt_index%2 == 0)?string("odd", "even")}">
							                	<td>${dt.roleName?default("-")}</td>
							                	<td>${dt.contact?default("-")}</td>
							                	<td>${dt.content?default("-")}</td>
							                	<td>${FsGameGmsUtils.formatDate(dt.createTime!0, "yyyy-MM-dd HH:mm:ss")}</td>
							                	<td>${dt.reply?default("")}</td>
							                	<td>${FsGameGmsUtils.formatDate(dt.replyTime!0, "yyyy-MM-dd HH:mm:ss")}</td>
							                	<td>
													<a name="replyFb" href="#" idVal="${dt.id}" ><@spring.message "gms.wjgl.huifu"/></a>&nbsp;
				                    				<a name="delFb" href="#" idVal="${dt.id}"><@spring.message "gms.wjgl.shanchu"/></a>&nbsp;
							                	</td>
							            	</tr>
							            </#list>
									
									</tbody>
								</table>
							</div>
							<@pageNav page=page url_pattern='?module=feedback&action=feedbacklist&curPage=$$_NO_$$' />
						</div>
					</div>
					<!-- END EXAMPLE TABLE PORTLET-->
				</div>
			</div>
			</form>
			<!-- END PAGE CONTENT-->
	</div>
</div>

<div id="responsive" class="modal fade" tabindex="-1" data-width="580px">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
		<h4 class="modal-title"><@spring.message "gms.wjgl.huifu"/></h4>
	</div>
	<div class="modal-body">
		<div class="row">
			<div class="col-md-6">
				<p>
					<textarea style="width:480px; height:320px" id="replyContent" name="replyContent" maxlength="20000"></textarea>
				</p>
			</div>
		</div>
	</div>
	<div class="modal-footer">
		<button type="button" data-dismiss="modal" class="btn btn-default"><@spring.message "gms.fwqgl.guanbi"/></button>
		<button type="button" class="btn blue" id="saveReply"><@spring.message "gms.wjgl.baocun"/></button>
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
<script src="${jsRoot}/custom/pm.js?${jsTag}"></script>
<!-- END BODY -->

<script type="text/javascript">
	jQuery(document).ready(function() {
       App.init();
       PlayerManager.initFeedbackList();
    });
</script>
</@js>
</@workbench>
</#escape>