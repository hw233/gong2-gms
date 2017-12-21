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
					<@spring.message "gms.aqgl.anquanguanli"/> <small><@spring.message "gms.aqgl.wupinshenhe"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<div id="responsive" class="modal fade" tabindex="-1" data-width="380">
				<div class="modal-body">
					<div class="row">
						<div class="col-md-12">
							<p>
								<@spring.message "gms.yysj.qudao"/>:<select id="orderOprGroupSel" name="oprGroup" class="select2 ">
										<#list ogl as og>
									    	<option value="${og.oprGroup}" >${og.name}</option>
									    </#list>
								</select>
							</p>
							<p>
								订单号(  <small style="color:red">请咨询开发组询问订单号</small>  ):
								<input id="orderId" class="form-control" type="text" maxlength="50" size="50">
							</p>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" data-dismiss="modal" class="btn btn-default"><@spring.message "gms.fwqgl.guanbi"/></button>
					<button type="button" class="btn blue" id="redoOrder"><@spring.message "gms.wjgl.baocun"/></button>
				</div>
			</div>
			
			<!-- BEGIN PAGE CONTENT-->
			<form id="mainform" method="post">
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN EXAMPLE TABLE PORTLET-->
					<div class="portlet box" id="portlet_1">
						<div class="portlet-body">
							<#if FsGameGmsUtils.inZone('tw')> 
							<div class="table-toolbar">
								<div class="btn-group">
									<input type="button" value="<@spring.message "gms.wjgl.fasongwupin"/>" class="btn purple" id="" name="" onclick="$('#responsive').modal();">
								</div>
							</div>
							</#if>
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
							                    <th><@spring.message "gms.aqgl.mubiao"/></th>
							                    <th><@spring.message "gms.wjgl.productId"/></th>
							                    <th><@spring.message "gms.wjgl.cjsj"/></th>
							                   <th><@spring.message "gms.wjgl.fsshijian"/></th>
							                    <th><@spring.message "gms.fwqgl.caozuo"/></th>
							                    
											</tr>
										</thead>
							
										<tbody role="alert" aria-live="polite" aria-relevant="all">
										<#list srms as srm>
							                <tr title="<@spring.message "gms.aqgl.caozuozhe"/>:${srm.owner?default("")}
							                <@spring.message "gms.yysj.qudao"/>:${srm.oprGroup?default("")}<br/>
							                <@spring.message "gms.yysj.fuwuqi"/>:${srm.serverId?default("")}
							                <@spring.message "gms.aqgl.mubiao"/>:${slim(srm.toUser,10)}
							               <@spring.message "gms.wjgl.productId"/>:${srm.productId?default("")}<br/>
							               
							                " class="${(srm_index%2 == 0)?string("odd", "even")} tooltips">
							                
							                    <td>${srm.owner?default("")}</td>
							                    
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
							                    
							                    
							                    <td>${slim(srm.toUser,10)}</td>
							                    <td>${srm.productId?default("")}</td>
							                  
							                    <td>${FsGameGmsUtils.formatDate(srm.createTime, "yyyy-M-d HH:mm")}</td>
							                   <td>${FsGameGmsUtils.formatDate(srm.sendTime, "yyyy年M月d日 HH:mm")}</td>
							                    <td>
							                    	<#if srm.state == FsGameGmsConst.VERIFY_STATE_PENDING >
							                    	<a href="javascript:showmodel('#responsive${srm.id?default("")}');"><@spring.message "gms.wjgl.ordersp"/></a>&nbsp;
							                    	<!--弹窗部分开始-->
							                    	
<!--<div id="responsive${srm.id?default("")}" class="model-content">-->		
	<div  id="responsive${srm.id?default("")}"  class="modal fade"  tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">

									<div class="modal-header">

										<button type="button" class="close" onclick="closemodal('#responsive${srm.id?default("")}')" data-dismiss="modal" aria-hidden="true"></button>

										<h3>${slim(srm.toUser,10)}-补单-${FsGameGmsUtils.formatDate(srm.createTime, "yyyy-M-d HH:mm")}</h3>
									</div>

									<div class="modal-body">

										<div class="row-fluid">

											<div class="portlet box blue">

							<div class="portlet-title">

								<div class="caption"><i class="icon-cogs"></i>补单详情表</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

								</div>

							</div>

							<div class="portlet-body">

								<table class="table table-bordered table-responsive">

									<thead>

										<tr>

											<th>发放名目</th>

											<th>数值</th>
										</tr>

									</thead>

									<tbody>

										<tr>

											<td>

												发放对象

											</td>

											<td>${slim(srm.toUser,10)}</td>
										</tr>
										<tr>

											<td>

												发放区服

											</td>

											<td>${srm.serverId?default("")}服</td>
										</tr>
										<tr>

											<td>

												渠道

											</td>

											<td>${srm.oprGroup?default("")}</td>
										</tr>
										<tr>

											<td>

												创建时间

											</td>

											<td>${FsGameGmsUtils.formatDate(srm.createTime, "yyyy-M-d HH:mm")}</td>
										</tr>
                                      <tr>

											<td>

											 补单物品

											</td>

											<td>${srm.productId?default("")}</td>
										</tr>
										<tr>
										<td>
										<@spring.message "gms.wjgl.beizhu"/>
										</td>
										<td>${srm.beiZhu?default("")}</td>
										<tr>
									</tbody>

								</table>

							</div>

						</div>
										</div>

									</div>

									<div class="modal-footer">

										<button type="button" name="btnpass" class="btn blue" srmid=${srm.id?default("")}><@spring.message "gms.wjgl.tongguo"/></button>
										<button type="button" name="btnnopass" data-dismiss="modal" class="btn red" srmid=${srm.id?default("")}><@spring.message "gms.wjgl.butongguo"/></button>

									</div>

								</div>	
<!--</div>-->			
<!--弹窗部分结束-->
							                    	<!--
							                    		<a href="#" name="btnpass" srmid=${srm.id?default("")}><@spring.message "gms.wjgl.tongguo"/></a>&nbsp;
							                    		<a href="#" name="btnnopass" srmid=${srm.id?default("")}><@spring.message "gms.wjgl.butongguo"/></a>
							                    		-->
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
								<@pageNav page=page url_pattern='?module=productnotice&action=productnoticelist&curPage=$$_NO_$$' />
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
<script type="text/javascript" src="${pluginsRoot}/bootstrap-modal/js/bootstrap-modalmanager.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${pluginsRoot}/bootstrap-modal/js/bootstrap-modal.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${pluginsRoot}/select2/select2.min.js?${jsTag}" ></script>
<script type="text/javascript" src="${pluginsRoot}/data-tables/jquery.dataTables.js?${jsTag}" ></script>
<script type="text/javascript" src="${pluginsRoot}/data-tables/DT_bootstrap.js?${jsTag}" ></script>
<!-- END PAGE LEVEL PLUGINS -->

<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="${jsRoot}/core/app.js?${jsTag}" ></script>
<script src="${jsRoot}/custom/se.js?${jsTag}"></script>
<!-- END BODY -->

<script type="text/javascript">
	jQuery(document).ready(function() {
       App.init();
       SecurityManager.initpassproduct();
      
    
    });
     function showmodel(a)
    {
      
     $(a).modal({
	keyboard: true
   });
    
    }
    function closemodal(a)
    {
     $(a).hide();
    
    }
</script>
</@js>
</@workbench>
</#escape>