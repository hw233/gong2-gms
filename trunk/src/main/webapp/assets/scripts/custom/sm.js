var ServerManager = function () {
	
	var _sd = function(){
		return [$("#serverIdSel option:selected").val(), $("#oprGroupSel option:selected").val()];
	}

    return {
        initList: function () {
            $('#addsrvbtn').click(function (e) {
            	e.preventDefault();
            	window.location.href="sm?module=srv&action=srvcreate";
            });

            $("[name='srvDel']").each(function(){
    			var sid = $(this).attr("idVal");
    			$(this).click(function(e){
    				e.preventDefault();
    				if(confirm('请再次确认')){
    					$.ajax({
    		  		           type: "POST",
    		  		           url: "sm?module=srv&action=delsrv&id="+sid,
    		  		           data: $("#mainform").serialize(), 
    		  		           success: function(data)
    		  		           {
    		  		              if (data=="SUCCESS"){
    		  		            	 alert("删除成功!");
    		  		            	location.reload();
    		  		              }else{
    		  		            	 alert("删除失败!请检查对应的认证服务器是否正常运行!");
    		  		              }
    		  		           }
    		     		});
    				}
    			});
    		});
        },

    	initCreate: function() {
    		function dosrvcreate(e) {
    			e.preventDefault();
    			var sogs = $("#srvOprGroupSel").attr("disabled");
    			if(sogs) {
    				$("#srvOprGroupSel").removeAttr("disabled");
    			}
    			$.ajax({
  		           type: "POST",
  		           url: "?module=srv&action=dosrvcreate",
  		           data: $("#mainform").serialize(), 
  		           success: function(data)
  		           {
  		              if (data=="SUCCESS"){
  		            	 alert("创建成功!");
  		            	 window.location.href="sm?module=srv&action=srvlist";
  		              }else{
  		            	 if(sogs) {
  		            		$("#srvOprGroupSel").attr("disabled", sogs);
  		            	 }
  		            	 alert("创建失败!请检查对应的认证服务器是否正常运行!");
  		              }
  		           }
     			});
    		}
    		$('#mainform').validate();
    		$("[name='data\\[ip\\]']").ipAddress();
    		$("[name='data\\[adminIp\\]']").ipAddress();
    		$("#addsrvbtn").click(dosrvcreate);
    		
    		$("#srvOprGroupSel").change(function(){  
                AdminBean.getOprMatchStr($(this).val(), function(result){
                	$("#srvOprMatchStr").val(result);
                })
            });
    		$("#srvOprGroupSel").change();
    		
    	},
        
        initTools: function() {
        	
        	$("#openSrv").click(function(e) {
        		e.preventDefault();
        		AdminBean.openSrv(_sd()[0], _sd()[1], function(){
        			alert("操作成功!");
        			$("#serverIdSel").change();
//        			location.reload();
        		});
        	});
        	$("#closeSrv").click(function(e) {
        		e.preventDefault();
        		AdminBean.closeSrv(_sd()[0], _sd()[1], function(){
        			alert("操作成功!");
        			$("#serverIdSel").change();
//        			location.reload();
        		});
        	});
        	$("#stopSrv").click(function(e) {
        		e.preventDefault();
        		AdminBean.stopSrv(_sd()[0], _sd()[1], function(){
        			alert("操作成功!");
        			$("#serverIdSel").change();
//        			location.reload();
        		});
        	});
        	$("#flushData").click(function(e) {
        		e.preventDefault();
        		AdminBean.flushData(_sd()[0], _sd()[1], function(){
        			alert("操作成功!");
//        			location.reload();
        		});
        	});
        	
        	$("#saveMax").click(function(e) {
        		e.preventDefault();
        		var mv = $("#maxVal").val();
        		if(!(/^(\+|-)?\d+$/.test(mv)) || mv < 0){
        			alert("请输入正整数!");
        			return;
        		}
        		AdminBean.changeMaxOnline(_sd()[0], _sd()[1], mv, function(){
        			alert("操作成功!");
        			location.reload();
        		});
        	});
        	
        	$("#hotfix").click(function(e) {
        		e.preventDefault();
        		AdminBean.hotfix(_sd()[0], _sd()[1], function(){
        			alert("操作成功!");
//        			location.reload();
        		});
        	});
        	
        	$("#refreshVersion").click(function(e) {
        		e.preventDefault();
        		AdminBean.refreshVersion(_sd()[0], _sd()[1], function(){
        			alert("操作成功!");
//        			location.reload();
        		});
        	});
        	
        	$("#forceSyncZstData").click(function(e) {
        		e.preventDefault();
        		AdminBean.forceSyncZstData(_sd()[0], _sd()[1], function(){
        			alert("操作成功!");
        		});
        	});
        	
        	$("#serverIdSel").change(function(){ 
        		var sis = $("#serverIdSel").val();
        		var ogs = $("#oprGroupSel").val();
        		if(sis && ogs && parseInt(sis) > 0) {
        			AdminBean.getServerConfig(sis, ogs, function(config){
        				var sHtml = "<dl class='dl-horizontal'>";
        				sHtml += "<dt>服务器状态:</dt>";
        				if(config.open) {
        					sHtml += "<dd><span style='color:#35aa47'>开启</span></dd>";
        				} else {
        					sHtml += "<dd><span style='color:#ff0000'>关闭</span></dd>";
        				}
        				sHtml += "<dt>最高在线:</dt>";
        				sHtml += "<dd>"+config.maxOnlineCount+"</dd>";
        				sHtml += "<dt>当前在线:</dt>";
        				sHtml += "<dd>"+config.curOnlineCount+"</dd>";
        				sHtml += "</dl>";
        				$("#serverConfigData").html(sHtml);
        				
        				$(".dl-horizontal > dt").each(function(){
        	        		$(this).css("text-align","left");
        	        		$(this).css("margin-left","20px");
        	        		$(this).css("margin-bottom","10px");
        	        	});
        	        	
        	        	$(".dl-horizontal > dd").each(function(){
        	        		$(this).css("margin-left","100px");
        	        		$(this).css("margin-bottom","10px");
        	        	});
            		});
        		}
            });
        },
        
        initScripts: function() {
    		$("#runScript").click(function(e){
    			e.preventDefault();
    			var sc = $("#scriptContent").val();
    			if(!sc) {
    				alert("请输入内容!");
    				return;
    			}
    			AdminBean.runScript(_sd()[0], _sd()[1], $("#scriptContent").val(), function(result){
    				var _html="<p>执行时间: " + (result.costTime / 1000) + "s</p>";
    				if(result.output != null && result.output != "") {
    					 _html += "<p>----------------------------------------------------------------------------------------------------</p>";
    					 _html += "<p>" + result.output + "</p>";				
    				}
    				if(result.error != null && result.error != "") {
    					 _html += "<p>----------------------------------------------------------------------------------------------------</p>";
    					 _html += "<p>" + result.error + "</p>";
    				} else {
    					 _html += "<p>----------------------------------------------------------------------------------------------------</p>";
    					 _html += "<p>执行结果: " + ((result.result != null)?result.result:"") + "</p>";
    				}
    				$("#scriptResult").html(_html);
        		});
    		});
    		
    		$("#saveScript").click(function(e){
    			e.preventDefault();
    			var scriptTitle = $("#scriptTitle").val();
    			var scriptContent = $("#scriptContent").val();
    			var scriptId = $("#scriptId").val();
    			
    			if(!scriptContent) {
    				alert("请输入内容!");
    				return;
    			}
    			AdminBean.saveScript(scriptId, scriptTitle, scriptContent, function(){
    				alert("保存成功!");
    				location.reload();
        		});
    		});
    		
    		$("[name='scriptDel']").each(function(){
    			var sid = $(this).attr("idVal");
    			$(this).click(function(e){
    				e.preventDefault();
    				if(confirm('请再次确认')){
    					AdminBean.deleteScript(sid, function(){
            				alert("删除成功!");
            				location.reload();
                		});
    				}
    			});
    		});
    		
    		$("[name='scriptLoad']").each(function(){
    			var sid = $(this).attr("idVal");
    			$(this).click(function(e){
    				e.preventDefault();
    				$("#scriptId").val(sid);
    				$("#scriptTitle").val($("#t_"+sid).text());
    				$("#scriptContent").val($("#c_"+sid).text());
    			});
    		});
    	},
        
        initOprGroupList: function(){
        	$('#addsecbtn').click(function (e) {
            	e.preventDefault();
            	window.location.href="sm?module=sec&action=seccreate";
            });
            $('#addoprgroupbtn').click(function (e) {
            	e.preventDefault();
            	window.location.href="sm?module=oprgroup&action=oprgroupcreate";
            });
        },
        
        initOprGroupCreate: function(){
        	function doseccreate(e) {
    			e.preventDefault();
    			var oprMatchStr = $("#oprMatchStrId").val();
    			var pattern = /^([0-9A-Za-z]|[,]){0,}$/;
    			if(!pattern.test(oprMatchStr)){
    				alert("只能输入数字和字母, 注意全半角逗号!");
    				return;
    			}
    			if(oprMatchStr.indexOf(",") == 0 || oprMatchStr.lastIndexOf(",") == oprMatchStr.length - 1){
    				alert("两头不能有逗号!");
    				return;
    			}
    			$.ajax({
 		           type: "POST",
 		           url: "?module=oprgroup&action=dooprgroupcreate",
 		           data: $("#mainform").serialize(), 
 		           success: function(data)
 		           {
 		              if (data=="SUCCESS"){
 		            	 alert("创建成功!");
 		            	 window.location.href="sm?module=oprgroup&action=oprgrouplist";
 		              }else{
 		            	 alert("创建失败!请检查对应的认证服务器是否正常运行!");
 		              }
 		           }
    			});
    		}
    		$('#mainform').validate();
    		$("#addoprgroupbtn").click(doseccreate);
        },
        
        initAddNoticeList: function(){
            $("#noticeOprGroupSel").change(function(){
                AdminBean.getOprNoticeList($(this).val(), function(result){
                	var nList = $.parseJSON(result);
                	var htmlStr = "";
                	$.each(nList, function (i, item) {
                		htmlStr += "<tr class='old'>";
                		
                		htmlStr += "<td>";
                		htmlStr += item.content;
                		htmlStr += "</td>";
                		
                		htmlStr += "<td>";
                		htmlStr += new Date(parseInt(item.createTime)).toLocaleString().replace(/:\d{1,2}$/,' ');
                		htmlStr += "</td>";
                		
                		htmlStr += "<td>";
                		
                		htmlStr += "<a name = \'" + "delete_" + item.id + "\'>DEL</a>";
                		
                		htmlStr += "&nbsp;"
                		htmlStr += "<a name = \'" + "edit_" + item.id + "\'" + " idText=\'" + item.content + "\'>EDIT</a>";
                		htmlStr += "</td>";
                		
                		htmlStr += "</tr>";
            		});
                	
                	$("#noticeTable > tbody").html(htmlStr);
                	
                	$("#noticeTable > tbody").each(function() {
						$(this).find("td").each(function() {
							$(this).find("a").each(function() {
								$(this).click(function (e) {
					            	var attrName = $(this).attr("name");
					            	var arr = attrName.split("_");
					            	
					            	if (arr.length != 2) {
					            		return;
					            	}
					            	
					            	if (arr[0] == "delete") {
					            		if (confirm('请再次确认')) {
					            			AdminBean.delNotice($("#noticeOprGroupSel").val(), arr[1]);
					            			//var href1 = "sm?module=notice&action=addnotice&oprGroup=" + $(noticeOprGroupSel).val();
					            			//alert(href1);
					            			window.location.href = "sm?module=notice&action=addnotice";
					            		}
					            	} else if (arr[0] == "edit") {
					            		var _id = arr[1];
					            		var _idText = $(this).attr("idText");
										$("#newcontent").text(_idText);
										$("#newcontent").val(_idText);
										$("#cntId").val(_id);
					            	}
					            });
							});
						});
					});
                })
            });
            
            $("#okbtn").click(function() {
            	var _id = $("#cntId").attr("value");
				var _cnt = $("#newcontent").val();
				
				if (_id == "") {
					AdminBean.addNotice($("#noticeOprGroupSel").val(), _cnt);
				} else {
					AdminBean.updateNotice($("#noticeOprGroupSel").val(), _id, _cnt);
				}
				
				$("#cntId").attr("value", "");
				
				window.location.href = "sm?module=notice&action=addnotice";
            });
            
            $("#noticeOprGroupSel").change();
            
        }, 
        
        
        initSql: function() {
    		$("#executeSql").click(function(e){
    			e.preventDefault();
    			var sc = $("#sqlContent").val();
    			if(!sc) {
    				alert("请输入内容!");
    				return;
    			}
    			var __sn = $("#serverNameSel").val();
    			AdminBean.executeSql(_sd()[0], _sd()[1], __sn, $("#sqlContent").val(), function(result){
    				if(!result){
    					$("#sqlResult").html("unknown error!");
    					return;
    				}
    				var _html = "";
    				if(result.error != undefined){
    					_html = "error " + result.error;
    				}else if(result.rows != undefined){
    					_html = "effect rows "+ result.rows;
    				}else if(result.datas != undefined && result.datas.length > 0){
    					var row0 = result.datas[0];
    					var _thead_th = "";
    					for(var r in row0){
    						_thead_th += "<th>"+r+"</th>";
    					}
    					var _thead = "<thead><tr class='heading' role='row'>"+_thead_th+"</tr></thead>";
    					var _tbody_tr = "";
    					for(var _idx=0 ; _idx<result.datas.length;_idx++){
    						var _tbody_td = "";
    						for(var _key in result.datas[_idx]){
    							_tbody_td += "<td>"+result.datas[_idx][_key]+"</td>";
    						}
    						var _tr_class = "even";
    						if(_idx%2 == 0){
    							_tr_class = "odd";
    						}
    						_tbody_tr += "<tr class='"+_tr_class+"'>"+_tbody_td+"</tr>";
    					}
    					
    					var _tbody = "<tbody role='alert' aria-live='polite' aria-relevant='all'>"+_tbody_tr+"</tbody>";
    					_html = _thead + _tbody;
    				} else {
    					_html = "no rows or datas!";
    				}
    				$("#sqlResult").html(_html);
        		});
    		});
    		
    	}
        
        
        
    };

}();