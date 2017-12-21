<#include "/lib/workbench.ftl"/>

<#escape x as x?html>
<@workbench>

<div class="page-content-wrapper">
	<div class="page-content">
			<!-- BEGIN PAGE HEADER-->
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN PAGE TITLE & BREADCRUMB-->
					<h3 class="page-title">
					<@spring.message "gms.aqgl.anquanguanli"/> <small><@spring.message "gms.fwqgl.zjgg"/></small>
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
							<@spring.message "gms.yysj.qudao"/>:&nbsp;<select id="noticeOprGroupSel" name="oprGroup" class="select2 ">
									<#list ogl as og>
								    	<option value="${og.oprGroup}" >${og.name}</option>
								    </#list>
							</select>
							<br></br>
							<label><@spring.message "gms.wjgl.neirong"/>:</label>
							<div>
								<textarea style="width:480px; height:320px" id="newcontent" name="newcontent" maxlength="20000"></textarea>
							</div>
							<input type="hidden"  value="" name="cntId" id="cntId">
							<input type="submit" value="<@spring.message "gms.fwqgl.queding"/>" class="bigBtn" id="okbtn" name="okbtn">
							
							<br></br>
							
							<div>
								<table class="table table-striped table-hover table-bordered dataTable" aria-describedby="sample_editable_1_info" id="noticeTable">
									<thead>
										<tr class="heading" role="row">
						                    <th><@spring.message "gms.wjgl.neirong"/></th>
						                    <th><@spring.message "gms.wjgl.cjsj"/></th>
						                    <th><@spring.message "gms.fwqgl.caozuo"/></th>
										</tr>
									</thead>
						
									<tbody>
									
									</tbody>
								</table>
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
       PlayerManager.initAddNoticeList();
    });
</script>
</@js>
</@workbench>
</#escape>