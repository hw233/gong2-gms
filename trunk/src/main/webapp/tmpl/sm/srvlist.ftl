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
					<@spring.message "gms.fwqgl.fwqlb"/> <small><@spring.message "gms.fwqgl.fwqlb"/></small>
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
									<button id="addsrvbtn" class="btn green">
									<@spring.message "gms.fwqgl.zjfwq"/> <i class="fa fa-plus"></i>
									</button>
								</div>
							</div>
							
							
							<div id="sample_editable_1_wrapper" class="dataTables_wrapper"
								role="grid">
								<div class="table-scrollable">
								<div class="control-group">

										<label class="control-label">选择渠道名称进行检索</label>

										<div class="controls">
                                          <form action="sm?module=srv&action=srvlist" method="post">
											<select data-placeholder="Your Favorite Type of Bear" name="oprgroup" class="chosen-with-diselect span6" tabindex="-1" id="selCSI">
											<option value="">请选择渠道名称</option>
                                             <#list oprgroups as opr>
												<option value="${opr?default("")}" <#if oprgroup==opr>selected</#if>>[${opr_index+1}]${opr?default("")}</option>
												</#list>
											</select>
                                            <button type="submit" class="btn blue">查找 <i class="m-icon-swapright m-icon-white"></i></button>
                                            </form>
										</div>

									</div>
									<table
										class="table table-striped table-hover table-bordered dataTable"
										id="sample_editable_1" aria-describedby="sample_editable_1_info">
										<thead>
											<tr class="heading" role="row">
												<th><@spring.message "gms.fwqgl.fuwuqiid"/></th>
							                    <th><@spring.message "gms.fwqgl.quhao"/></th>
							                    <th><@spring.message "gms.wjgl.mingzi"/></th>
							                    <th><@spring.message "gms.fwqgl.qudaozu"/></th>
							                    <th><@spring.message "gms.aqgl.qudaobiaoshi"/></th>
							                    <th><@spring.message "gms.fwqgl.dizhi"/></th>
							                    <th><@spring.message "gms.fwqgl.duankou"/></th>
							                    <th><@spring.message "gms.fwqgl.guanlidizhi"/></th>
							                    <th><@spring.message "gms.fwqgl.guanliduankou"/></th>
							                    <th><@spring.message "gms.fwqgl.zhuangtai"/></th>
							                    <th><@spring.message "gms.fwqgl.shifouxinfu"/></th>
							                     <th><@spring.message "gms.tool.isPush"/></th>
							                    <th><@spring.message "gms.common.kjlx"/></th>
							                    <th><@spring.message "gms.wjgl.jlsj"/></th>
							                    <th></th>
											</tr>
										</thead>
							
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list srvs as srv>
							                <tr title="<@spring.message "gms.aqgl.qudaobiaoshi"/>:${srv.oprMatchStr!('')}" class="${(srv_index%2 == 0)?string("odd", "even")} tooltips">
							                    <td>${srv.serverId}</td>
							                    <td>${srv.zone?default("")}</td>
							                    <td>${srv.serverName?html}</td>
							                    <td>${srv.oprGroup}</td>
							                    <td>${slim(srv.oprMatchStr!(''), 10)}</td>
							                    <td>${srv.ip}</td>
							                    <td>${srv.port}</td>
							                    <td>${srv.adminIp?default("")}</td>
							                    <td>${srv.adminPort}</td>
							                    <td>
							                        <#if srv.state==FsGameGmsConst.SERVER_STATE_CLOSE>
							                            <span style="color:#FF0000"><@spring.message "gms.fwqgl.guanbi"/></span>
							                        <#else>
							                            <span style="color:#00FF00"><@spring.message "gms.fwqgl.kaiqi"/></span>
							                        </#if>  
							                    </td>
							                    <td>
							                    	<#if srv.newSrv>
							                            <span style="color:#00FF00"><@spring.message "gms.fwqgl.xinfu"/></span>
							                        <#else>
							                            <span ><@spring.message "gms.fwqgl.laofu"/></span>
							                        </#if>
							                    </td>
							                    <td>
							                    	<#if srv.isPush==1>
							                            <span style="color:#00FF00"><@spring.message "gms.tool.Push"/></span>
							                        <#else>
							                            <span ><@spring.message "gms.tool.noPush"/></span>
							                        </#if>
							                    </td>
							                    <td>
							                    	<#if srv.visibleType == 0>
							                            <span ><@spring.message "gms.common.qwkj"/></span>
							                        <#elseif srv.visibleType == 1>
							                        	<span ><@spring.message "gms.common.bfwlkj"/></span>
							                        <#else>
							                            <span ><@spring.message "gms.common.bukejian"/></span>
							                        </#if>
							                    </td>
							                    <td>${FsGameGmsUtils.formatDate(srv.createTime, "yyyy-M-d HH:mm")}</td>
							                    <td>
							                    	<a name="srvDel" idVal="${srv.id}" href="#"><@spring.message "gms.wjgl.shanchu"/></a>&nbsp;
							                    	<a href="sm?module=srv&action=srvcreate&id=${srv.id}"><@spring.message "gms.wjgl.bianji"/></a>&nbsp;
							                    </td>
							                   </tr>
							            </#list>
										</tbody>
									</table>
								</div>
								<@pageNav page=page url_pattern='?module=srv&action=srvlist&curPage=$$_NO_$$&oprgroup＝'+oprgroup+'' />
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
<script src="${jsRoot}/custom/sm.js?${jsTag}"></script>
<!-- END BODY -->

<script type="text/javascript">
	jQuery(document).ready(function() {
       App.init();
       ServerManager.initList();
    });
</script>
</@js>
</@workbench>
</#escape>