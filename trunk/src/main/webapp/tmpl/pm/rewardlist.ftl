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
					<@spring.message "gms.wjgl.wjgl"/> <small><@spring.message "gms.wjgl.ffgl"/></small>
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
									<button id="addsrmbtn" class="btn green">
									<@spring.message "gms.wjgl.xinjian"/> <i class="fa fa-plus"></i>
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
												<th><@spring.message "gms.youxi.leixing"/></th>
							                    <th><@spring.message "gms.aqgl.mubiao"/></th>
							                    <th><@spring.message "gms.wjgl.neirong"/></th>
							                    <th><@spring.message "gms.wjgl.jlsj"/></th>
							                    <th><@spring.message "gms.wjgl.fsshijian"/></th>
							                    <th></th>
											</tr>
										</thead>
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list srms as srm>
							                <tr title="<@spring.message "gms.aqgl.mubiao"/>:${srm.toUsers}<br/><@spring.message "gms.wjgl.wuping"/>:${srm.itemIds?default("")}
							                <@spring.message "gms.youxi.shuliang"/>:${srm.itemCounts?default("")}<br/>
							                <@spring.message "gms.wjgl.yinliang"/>:${srm.money?default("")} 
							                <@spring.message "gms.wjgl.yuanbao"/>:${srm.gold?default("")} 
							                vip<@spring.message "gms.wjgl.jifeng"/>:${srm.leijiGold?default("")}
							                " class="${(srm_index%2 == 0)?string("odd", "even")} tooltips">
							                    <td>
								                    <#if srm.oprGroup == ""> 
								                    	<@spring.message "gms.wjgl.ququdao"/>
								                    <#else>
								                    	${srm.oprGroup?default("")}
								                    </#if>
							                    </td>
							                    
							                    <td>
								                    <#if srm.serverId == 0> 
								                    	<@spring.message "gms.wjgl.quanfu"/>
								                    <#else>
								                    	${srm.serverId?default("")}
								                    </#if>
							                    </td>
							                    
							                    <td><#if srm.msgType ==  FsGameGmsConst.MSG_TYPE_COMMON> <@spring.message "gms.wjgl.xiaoxi"/> <#else> <@spring.message "gms.wjgl.jiangli"/> </#if></td>
							                    <td>${slim(srm.toUsers,10)}</td>
							                    <td>${slim(srm.content,10)}</td>
							                    <td>${FsGameGmsUtils.formatDate(srm.createTime, "yyyy年M月d日 HH:mm")}</td>
							                    <td>${FsGameGmsUtils.formatDate(srm.sendTime, "yyyy年M月d日 HH:mm")}</td>
							                    <td>
							                    	<#if srm.state == FsGameGmsConst.VERIFY_STATE_PENDING || srm.state == FsGameGmsConst.VERIFY_STATE_REFUSE >
							                    		<a href="javascript:if(confirm('Please confirm again!')){$('#mainform').attr('action','pm?module=reward&action=delsrm&id=${srm.id}');$('#mainform').submit();}"><@spring.message "gms.wjgl.shanchu"/></a>&nbsp;
							                    		<a href="pm?module=reward&action=rewardcreate&id=${srm.id}"><@spring.message "gms.wjgl.bianji"/></a>&nbsp;
							                    	<#elseif srm.state == FsGameGmsConst.VERIFY_STATE_ALLOW >
							                    		<@spring.message "gms.wjgl.yitongguo"/>
							                    	</#if>
							                    </td>
							                   </tr>
							            </#list>
										</tbody>
									</table>
								</div>
								<@pageNav page=page url_pattern='?module=reward&action=rewardlist&curPage=$$_NO_$$' />
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
       PlayerManager.initReward();
    });
</script>
</@js>
</@workbench>
</#escape>