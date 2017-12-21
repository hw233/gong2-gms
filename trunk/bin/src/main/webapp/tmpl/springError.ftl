<#include "/lib/workbench.ftl"/>

<#escape x as x?html>
<@workbench>
<div class="page-content-wrapper">
	<div class="page-content">
	  	<div class="title"><span class="buttons"></span>错误信息 </div>
	    <div class="tableWrapper">
	        <table class="grid">
	            <tr>
				    <td>摘要</td>
	            </tr>
	            <tr bgcolor="#ffffff"><td height="100">
	                  <div style="width: 90%; margin: 50px auto; font-size: 14px;">
	                     ${exception?default("")}         
	                  </div>
	            </td></tr>
	            <tr><td>${.now?string("yyyy-MM-dd HH:mm:ss")}</td></tr>
	        </table>
	    </div>
    </div>
</div>
<@js>
<script type="text/javascript" src="${jsRoot}/core/app.js" charset="utf-8"></script> 
<script type="text/javascript">
	jQuery(document).ready(function() {    
       App.init();
    });
</script>
</@js>
</@workbench>
</#escape>