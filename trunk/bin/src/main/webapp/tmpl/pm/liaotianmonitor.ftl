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
					<@spring.message "gms.wjgl.wjgl"/> <small><@spring.message "gms.wjgl.ltjk"/></small>
				</h3>
				<@navBar />
				<!-- END PAGE TITLE & BREADCRUMB-->
			</div>
		</div>
		<!-- END PAGE HEADER-->
		
		<!-- BEGIN PAGE CONTENT-->
		<div class="row">
			<div class="col-md-3">
				<@spring.message "gms.yysj.qudao"/>:&nbsp;<select id="oprGroupSel" name="oprGroup" class="select2 " sval=""></select> 
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
				<@spring.message "gms.yysj.fu"/>:&nbsp;<select id="serverIdSel" name="serverId" class="select2 " sval="0"></select>
			</div>
			<div class="col-md-1" >
				<input type="button" value="<@spring.message "gms.wjgl.kaishijiankong"/>" class="btn green" id="monitorBtn" name="monitorBtn">
			</div>
			
			<div class="col-md-2" style="float:right;">
				<div id="spinner" style="display:none;"><img src="assets/img/loading-spinner-grey.gif"/><span>&nbsp;&nbsp;Loading...</span></div>
			</div>
		</div>
		
		<br/>
		
		
		<div class="row">
			<div class="panel panel-default">
                <div id="liaotian_content" class="panel-body log"></div>
            </div>
		</div>
		
		<div class="row">
	        <div class="pull-right">
	            <button id="clearLogBtn" class="btn btn-info" type="button" ><@spring.message "gms.wjgl.qingkongjilu"/></button>
	        </div>
	        <div class="clearfix"></div>
        </div>
		<!-- END PAGE CONTENT-->
	</div>
</div>

<@js>
<script type="text/javascript" src="${jsRoot}/core/app.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${jsRoot}/custom/pm.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript">
	jQuery(document).ready(function() {    
       	App.init();
       	PlayerManager.liaotianmonitor();
    });
    
</script>
</@js>
</@workbench>
</#escape>