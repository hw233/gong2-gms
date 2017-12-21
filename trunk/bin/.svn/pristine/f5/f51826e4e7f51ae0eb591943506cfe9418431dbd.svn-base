<#macro pageNav page url_pattern = "" to_replace = "$$_NO_$$">
	<#assign current=page.curPage!(1) />
	<#assign limit=page.limit!(10) />
	<#assign total=page.total!(0) />
	<#assign totalPage=page.totalPage!(0) />
	<div class="row">
		<div class="col-md-12 text-center" >
				<ul class="pagination" style="visibility: visible;">
				
				<#assign prevDisFlag = (current == 1)?string("disabled", "")>
				<#assign nextDisFlag = (current gte totalPage)?string("disabled", "")>
				
				<li class="prev ${prevDisFlag}"><a href="#" title="Prev" value='${url_pattern?replace(to_replace, current-1)}' class="pagego"><i class="fa fa-angle-left"></i></a></li>
				<#list (current - 5)..(current + 5) as i>
					<#assign activeFlag1 = (current==i)?string("active", "")>
					<#if i gt 0 && i lte totalPage>
						${FsGameGmsUtils.println(i)}
						<li class="${activeFlag1}"><a href="#" value='${url_pattern?replace(to_replace, i)}' class="pagego">${i}</a></li>
					</#if> 
				</#list>
				
				<li class="next ${nextDisFlag}"><a href="#" title="Next" value="${url_pattern?replace(to_replace, current + 1)}"  class="pagego"><i class="fa fa-angle-right"></i></a></li>
				</ul>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12 text-center">
			<div class="dataTables_info" id="sample_editable_1_info">${current}/${totalPage}<@spring.message "gms.yysj.gong"/>${total}<@spring.message "gms.yysj.tiaojilu"/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<select id="limit" name="limit" onchange="document.getElementById('mainform').submit();" class="select2" >
			    <option value="${page.limit}" checked="checked"><@spring.message "gms.yysj.myxs"/>${page.limit}<@spring.message "gms.yysj.hang"/></option>
			    <option value="" disabled="disabled">---</option>
			    <option value="10">10<@spring.message "gms.yysj.hang"/></option>
			    <option value="30">30<@spring.message "gms.yysj.hang"/></option>
			    <option value="50">50<@spring.message "gms.yysj.hang"/></option>
			    <option value="100">100<@spring.message "gms.yysj.hang"/></option>
			    <option value="200">200<@spring.message "gms.yysj.hang"/></option>
			</select>
			</div>
		</div>
	</div>
</#macro>