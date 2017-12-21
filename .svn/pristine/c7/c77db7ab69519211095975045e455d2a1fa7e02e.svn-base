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
			<div class="row">
				<div class="col-md-6">
			   		<form id="mainform" class="register-form" action="?module=reward&action=dorewardcreate" method="post">
			   			<input type="hidden"  value=${srm.id} name="data[id]" >
			   			<div class="form-group">
							<label class="control-label "><@spring.message "gms.youxi.leixing"/>:</label>
							<select id="msgTypeSel" name="data[msgType]" class="select2 form-control">
								<option <#if srm.msgType ==  FsGameGmsConst.MSG_TYPE_COMMON> selected </#if> value="1"><@spring.message "gms.wjgl.xiaoxi"/></option>
								<option  <#if srm.msgType ==  FsGameGmsConst.MSG_TYPE_REWARD> selected </#if> value="2"><@spring.message "gms.wjgl.jiangli"/></option>
							</select>
						</div>
						<div class="form-group">
							<label class="control-label "><@spring.message "gms.yysj.qudao"/>:</label>
							<select id="oprGroupSel" name="data[oprGroup]" class="select2 form-control " sval="${srm.oprGroup?default("")}">
								<option value='anzhuo+iosyy'>安卓+越狱</option>
							</select> 
						</div>
						<div class="form-group">
							<label class="control-label "><@spring.message "gms.yysj.fuwuqi"/>:</label>
							<select id="serverIdSel" name="data[serverId]" class="select2 form-control " sval="${srm.serverId?default("0")}"></select>
						</div>
						<div class="form-group">
							<label class="control-label "><@spring.message "gms.wjgl.isall"/></label>
						    <select id="isall" name="isall" class="select2 form-control ">
						    <#if (srm.id>0) > 
								    <option value='0' <#if srm.toUsers =="我的宫廷"> selected </#if> >请选择</option>
								    <option value='1' <#if srm.toUsers ==""> selected </#if> >是</option>
								    <option value='2' <#if srm.toUsers !="我的宫廷" && srm.toUsers !="" > selected </#if> >否</option>
						   <#else>
						           <option value='0'>请选择</option>
								    <option value='1'>是</option>
								    <option value='2'>否</option>
									
						   </#if>
						   </select>
						</div>
						<div class="form-group fafanguser" style="display:none">
							<label class="control-label "><@spring.message "gms.aqgl.mubiao"/>(<@spring.message "gms.wjgl.yishuxianfenge"/>):</label>
							<div class="input-icon">
								<textarea class="form-control maxlength-handler" place rows="5" id="textUser" name="data[toUsers]" maxlength="1000">${srm.toUsers!('')}</textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.wjgl.neirong"/>：</label>
							<div class="input-icon">
								<textarea class="form-control maxlength-handler required" rows="5" name="data[content]" maxlength="1000">${srm.content!('')}</textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.wjgl.beizhu"/>：</label>
							<div class="input-icon">
								<textarea class="form-control maxlength-handler required" rows="5" name="data[beiZhu]" maxlength="1000">${srm.beiZhu!('')}</textarea>
							</div>
						</div>
						
						<div id="rwd_body">
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.wjgl.wuping"/>ID(<@spring.message "gms.wjgl.yishuxianfenge"/>)：</label>
							<div class="input-icon">
								<input  name="data[itemIds]" class="form-control placeholder-no-fix" type="text" value="${srm.itemIds!('')}" >
							</div>
							<label class="control-label"><@spring.message "gms.wjgl.wupingshuliang"/>(<@spring.message "gms.wjgl.yishuxianfenge"/>)：</label>
							<div class="input-icon">
								<input  name="data[itemCounts]" class="form-control placeholder-no-fix" type="text" value="${srm.itemCounts!('')}" >
							</div>
						</div>
						<div class="form-group">
							<label class="control-label"><@spring.message "gms.wjgl.yinliang"/>：</label>
							<div class="input-icon">
								<input  name="data[money]" class="form-control placeholder-no-fix" type="text" value="${srm.money!('')}" >
							</div>
							<label class="control-label"><@spring.message "gms.wjgl.yuanbao"/>：</label>
							<div class="input-icon">
								<input  name="data[gold]" class="form-control placeholder-no-fix" type="text" value="${srm.gold!('')}" >
							</div>
							<label class="control-label"><@spring.message "gms.wjgl.vipjifeng"/>：</label>
							<div class="input-icon">
								<input  name="data[leijiGold]" class="form-control placeholder-no-fix" type="text" value="${srm.leijiGold!('')}" >
							</div>
						</div>
						</div>
						<div class="form-actions">
							<input type="button" value="<@spring.message "gms.wjgl.baocun"/>" class="btn" id="doaddsrmbtn" >
         					<input type="button" onclick="location.replace('?module=reward&amp;action=rewardlist');" value="<@spring.message "gms.wjgl.fanhui"/>" class="btn">
						</div>
					</form>
				</div>
			</div>
			<!-- END PAGE CONTENT-->
	</div>
</div>

<@js>
<script type="text/javascript" src="${pluginsRoot}/jquery.input-ip-address-control-1.0.min.js?${jsTag}" charset="utf-8"></script>
<script type="text/javascript" src="${jsRoot}/core/app.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript" src="${jsRoot}/custom/pm.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript">
	jQuery(document).ready(function() {    
       App.init();
       PlayerManager.initReward();
        var id=$('#isall option:selected') .val();
        if(id==2){
       $('.fafanguser').show();
     
     }else if(id==1){
       $('.fafanguser').hide();
       $('#textUser').val('');
     }else{
        $('.fafanguser').hide();
        $('#textUser').val('我的宫廷');
      }
    });
    $('#isall').change(function(){
     var id=$('#isall option:selected') .val();
     if(id==2){
        $('#textUser').val('');
       $('.fafanguser').show();
     
     }else if(id==1){
       $('.fafanguser').hide();
       $('#textUser').val('');
     }else{
        $('.fafanguser').hide();
        $('#textUser').val('我的宫廷');
      }
    
    })
    
</script>
</@js>
</@workbench>
</#escape>