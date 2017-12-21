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
					<@spring.message "gms.dhmgl.dhmgl"/> <small><@spring.message "gms.dhmgl.pici"/></small>
					</h3>
					<@navBar />
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-6">
			   		<form id="mainform" class="register-form" method="post">
			   			<input type="hidden"  value=${data.id} name="data[id]" >
			   			<div class="form-group">
							<label class="control-label "><@spring.message "gms.dhmgl.libaoleixing"/>:</label>
							<div class="input-icon">
								<select  name=data[giftType] class="bs-select form-control required" >
								    <#list giftTypes as gts>
								    	<option value="${gts.giftType}" <#if gts.giftType=="${data.giftType!('')}">selected</#if>>${gts.giftName}</option>
								    </#list>
								</select>
							</div>
						</div>
						<div class="form-group" >
							<label class="control-label "><@spring.message "gms.yysj.qudao"/>:</label>
							<div class="input-icon">
								<select id="srvOprGroupSel" name="oprGroup" class="select2" onchange="groupChange()" >
								   <option  value="">主渠道</option>
								    <#list ogl as og>
								    	<option value="${og.oprGroup}" <#if og.oprGroup=="${oprGroup!('')}">selected</#if>>${og.oprGroup}</option>
								    </#list>
						        </select>
						        <select id="srvNameSel" name=data[opr] class="select2">
								   <option  value="">子渠道</option>
						        </select>
								
							</div>
						</div>
						
						<div class="form-group" >
							<label class="control-label "><@spring.message "gms.youxi.shuliang"/>:</label>
							<div class="input-icon">
								<input  class="form-control placeholder-no-fix required" type="text" name="data[count]" value="${data.count!('')}" maxlength="50" size="50">
							</div>
						</div>
						<div class="form-actions">
							<input type="button" value="<@spring.message "gms.yysj.tijiao"/>" class="btn" id="addbatchbtn" name="addbatchbtn">
         					<input type="button" onclick="location.replace('?module=batch&amp;action=batchlist');" value="<@spring.message "gms.wjgl.fanhui"/>" class="btn">
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
<script type="text/javascript" src="${jsRoot}/custom/cpm.js?${jsTag}" charset="utf-8"></script> 
<script type="text/javascript">
	jQuery(document).ready(function() {    
       App.init();
       CouponManager.initBatchCreate();
    });
    function groupChange()
    {
      $('#srvNameSel').empty();
      $('#srvNameSel').append('<option  value="">子渠道</option>');
      var opr=$('#srvOprGroupSel').find("option:selected").val();
      if(opr!="")
      {
      $.ajax({
       type:"post",
       url:"cpm?module=batch&action=batchqlist",
       dataType:"text",
       data:{'oprid':opr},
       success:function(res){
        if(res!="")
        {
           var strs= new Array();
           strs=res.split(",");
           for (i=0;i<strs.length ;i++ ) 
			{ 
			  $('#srvNameSel').append('<option  value="'+strs[i]+'">'+strs[i]+'</option>');
			} 
        }
       },
       error:function(){
       
       alert("服务器通信发生故障");
      }
       
     });
     }
      
    
    }
</script>
</@js>
</@workbench>
</#escape>