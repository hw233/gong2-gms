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
					<@spring.message "gms.wjgl.wjgl"/> <small><@spring.message "gms.aqgl.gonggaoshenhe"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<form id="mainform" method="post">
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
												<th><@spring.message "gms.aqgl.caozuozhe"/></th>
							                    <th><@spring.message "gms.yysj.qudao"/></th>
							                    <th><@spring.message "gms.yysj.fuwuqi"/></th>
							                    <th><@spring.message "gms.wjgl.neirong"/></th>
							                     <!--<th><@spring.message "gms.wjgl.meitiandingshi"/></th>
							                    <th>每天定<@spring.message "gms.wjgl.feng"/></th>
							                    <th><@spring.message "gms.wjgl.xunhuanmeige"/></th>
							                    <th>有效开始<@spring.message "gms.yysj.riqi"/></th>
							                    <th>结束<@spring.message "gms.yysj.riqi"/></th> -->
							                    <th><@spring.message "gms.wjgl.cjsj"/></th>
							                    <th><@spring.message "gms.fwqgl.caozuo"/></th>
											</tr>
										</thead>
							
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list srms as srm>
							                <tr title="<@spring.message "gms.wjgl.meitiandingshi"/>:${srm.dayHour?default("")}<br/>
							                <@spring.message "gms.wjgl.meitiandingfeng"/>:${srm.dayMinute?default("")}<br/>
							                <@spring.message "gms.wjgl.xunhuanmeige"/>:${srm.repeatInterval?default("")}<br/>
							                <@spring.message "gms.wjgl.youxiaokaishiriqi"/>:${FsGameGmsUtils.formatDate(srm.startTime, 'yyyy-M-d HH:mm')}<br/>
							                <@spring.message "gms.wjgl.jiesuriqi"/>:${FsGameGmsUtils.formatDate(srm.endTime, 'yyyy-M-d HH:mm')}<br/>
							                <@spring.message "gms.wjgl.neirong"/>:${srm.content?default("")}<br/>
							                " class="${(srm_index%2 == 0)?string("odd", "even")} tooltips">
							                    <td>${srm.owner?default("")}</td>
							                    <td>${srm.oprGroup?default("")}</td>
							                    <td>${srm.serverId?default("")}</td>
							                    <td>${srm.content?default("")}</td>
							                    <!--<td>${srm.dayHour?default("")}</td>
							                    <td>${srm.dayMinute?default("")}</td>
							                    <td>${srm.repeatInterval?default("")}</td>
							                    <td>${FsGameGmsUtils.formatDate(srm.startTime, "yyyy年M月d日 HH:mm")}</td>
							                    <td>${FsGameGmsUtils.formatDate(srm.endTime, "yyyy年M月d日 HH:mm")}</td>-->
							                    <td>${FsGameGmsUtils.formatDate(srm.createTime, "yyyy年M月d日 HH:mm")}</td>
							                    <td>
							                    	<#if srm.state == FsGameGmsConst.VERIFY_STATE_PENDING >
							                    		<a href="#" name="btnpass" srmid=${srm.id?default("")}><@spring.message "gms.wjgl.tongguo"/></a>&nbsp;
							                    		<a href="#" name="btnnopass" srmid=${srm.id?default("")}><@spring.message "gms.wjgl.butongguo"/></a>
							                    	<#elseif srm.state == FsGameGmsConst.VERIFY_STATE_ALLOW >
							                    		<@spring.message "gms.wjgl.yitongguo"/>
							                    	<#elseif srm.state == FsGameGmsConst.VERIFY_STATE_REFUSE >
							                    		<@spring.message "gms.wjgl.weitongguo"/>
							                    	</#if>
							                    	&nbsp;
							                    	<a href="#" name="btndel" srmid=${srm.id?default("")}><@spring.message "gms.wjgl.shanchu"/></a>
							                    </td>
							                </tr>
							            </#list>
										</tbody>
									</table>
								</div>
								<@pageNav page=page url_pattern='?module=passnotice&action=passnoticelist&curPage=$$_NO_$$' />
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
<script src="${jsRoot}/custom/pm.js?${jsTag}"></script>
<!-- END BODY -->

<script type="text/javascript">
	jQuery(document).ready(function() {
       App.init();
       PlayerManager.initPassNotice();
    });
</script>
</@js>
</@workbench>
</#escape>