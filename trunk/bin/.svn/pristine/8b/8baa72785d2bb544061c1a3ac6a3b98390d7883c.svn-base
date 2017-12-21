var PlayerManager = function() {
	
	var canScroll = true;
	
	var filePos = 0;
	
	var ltMonitorXhr;
	
	var ltMonitorTimerId;

	var handleDateRangePickers = function() {
		if (!jQuery().daterangepicker) {
			return;
		}

		$('#defaultrange').daterangepicker(
				{
					opens : (App.isRTL() ? 'left' : 'right'),
					format : 'YYYY/MM/DD',
					separator : ' to ',
					minDate : '1979/01/01',
					maxDate : '2099/01/01',
					ranges : {
						'今天' : [ moment(), moment() ],
						'最近2天' : [ moment().subtract('days', 1), moment() ],
						'最近3天' : [ moment().subtract('days', 2), moment() ],
						'最近7天' : [ moment().subtract('days', 6), moment() ],
						'最近30天' : [ moment().subtract('days', 29), moment() ]
					},
					locale : {
						applyLabel : '确认',
						fromLabel : '从',
						toLabel : '到',
						customRangeLabel : '自定义',
						daysOfWeek : [ '日', '一', '二', '三', '四', '五', '六' ],
						monthNames : [ '一月', '二月', '三月', '四月', '五月', '六月',
								'七月', '八月', '九月', '十月', '十一月', '十二月' ],
						firstDay : 1
					}
				},
				function(start, end) {
					console.log("Callback has been called!");
					$('#defaultrange input').val(
							start.format('YYYY/MM/DD') + '-'
									+ end.format('YYYY/MM/DD'));
				});
	}

	var handleDateTimeRangePickers = function() {
		var p = {
			dateFormat : "yy-mm-dd",
			timeFormat : "hh:mm",
			timeOnlyTitle : '选择时间',
			timeText : '时间',
			hourText : '小时',
			minuteText : '分钟',
			secondText : '秒钟',
			millisecText : '毫秒',
			microsecText : '微秒',
			timezoneText : '时区',
			currentText : '现在时间',
			closeText : '关闭',
			timeFormat : 'HH:mm',
			amNames : [ 'AM', 'A' ],
			pmNames : [ 'PM', 'P' ],
			isRTL : false
		}
		$('#tp_startTime').datetimepicker(p);
		$('#tp_endTime').datetimepicker(p);
	}

	var handleDateTimeRangePickersForItem = function() {
		var p = {
			dateFormat : "yy-mm-dd",
			timeFormat : "",
			timeOnlyTitle : '选择时间',
			timeText : '时间',
			timezoneText : '时区',
			currentText : '现在时间',
			closeText : '关闭',
			amNames : [ 'AM', 'A' ],
			pmNames : [ 'PM', 'P' ],
		}
		$('#tp_dateTime').datetimepicker(p);
	}

	return {
		init : function() {
			handleDateRangePickers();

			function dosearch(e) {
				e.preventDefault();
				$('#mainform').submit();
			}
			$("#searchbtn").click(dosearch);

			$("[name='forbidLogin']").each(
					function() {
						var sid = $(this).attr("idVal");
						var dbIdVal = $(this).attr("dbIdVal");

						var nowRow = $(this);
						$(this).click(
								function(e) {
									e.preventDefault();
									var userGroup = nowRow.attr("idVal2");
									// alert("userGroup = " + userGroup);
									if (confirm('请再次确认')) {
										var og = $("#oprGroupSel").val();
										var si = $("#serverIdSel").val();
										if (userGroup == -10) {
											AdminBean.activeAccount(si, og,
													sid, dbIdVal, function() {
														// alert("操作成功")
														nowRow.text('禁止登陆');
														nowRow
																.attr("idVal2",
																		0);
													});
										} else {
											AdminBean.forbidAccount(si, og,
													sid, dbIdVal, function() {
														// alert("操作成功")
														nowRow.text('解除禁止');
														nowRow.attr("idVal2",
																-10);
													});
										}
									}
								});
					});

			$("[name='forceOffline']").each(function() {
				var sid = $(this).attr("idVal");
				var nowRow = $(this);
				$(this).click(function(e) {
					if (confirm('请再次确认')) {
						var og = $("#oprGroupSel").val();
						var si = $("#serverIdSel").val();
						e.preventDefault();
						AdminBean.kickOut(si, og, sid, function() {
							alert("操作成功")
						});
					}
				});
			});

			$("[name='resetGuide']").each(function() {
				var sid = $(this).attr("idVal");
				var dbIdVal = $(this).attr("dbIdVal");
				var nowRow = $(this);
				$(this).click(function(e) {
					if (confirm('请再次确认')) {
						var og = $("#oprGroupSel").val();
						var si = $("#serverIdSel").val();
						e.preventDefault();
						AdminBean.resetGuide(si, og, sid, dbIdVal, function() {
							alert("操作成功");
							location.reload();
						});
					}
				});
			});

			$("[name='resetPassword']").each(function() {
				var acc = $(this).attr("acc");
				var nowRow = $(this);
				$(this).click(function(e) {
					if (confirm('请再次确认')) {
						var og = $("#oprGroupSel").val();
						var si = $("#serverIdSel").val();
						e.preventDefault();
						AdminBean.resetPassword(si, og, acc, function(ret) {
							alert(ret);
							if(ret =='SUCCESS'){
								alert("操作成功");
								location.reload();
							}else{
								alert("操作失败");
							}
						});
					}
				});
			});
			
			$("[name='unbindGameCenter']").each(function() {
				var acc = $(this).attr("acc");
				var idVal = $(this).attr("idVal");
				var nowRow = $(this);
				$(this).click(function(e) {
					if (confirm('请再次确认')) {
						var og = $("#oprGroupSel").val();
						var si = $("#serverIdSel").val();
						e.preventDefault();
						AdminBean.unbindGameCenter(si, og, acc, idVal, function(ret) {
							if(ret >= 0){
								alert("操作成功");
								location.reload();
							}else{
								alert("操作失败! 本来就没有绑定过, 返回值 "+ret);
							}
						});
					}
				});
			});
				$("[name='unbindGamePhone']").each(function() {
				var acc = $(this).attr("acc");
				var idVal = $(this).attr("idVal");
				var nowRow = $(this);
				$(this).click(function(e) {
					if (confirm('请再次确认')) {
						var og = $("#oprGroupSel").val();
						var si = $("#serverIdSel").val();
						e.preventDefault();
						AdminBean.unbindGamePhone(si, og, acc, idVal, function(ret) {
							if(ret >= 0){
								alert("操作成功");
								location.reload();
							}else{
								alert("操作失败! 本来就没有绑定过, 返回值 "+ret);
							}
						});
					}
				});
			});


             $("[name='changeName']").each(function() {
				var sid = $(this).attr("idVal");
				var dbIdVal = $(this).attr("dbIdVal");
				var nowRow = $(this);
				$(this).click(function(e) {
					if (confirm('确认重置名字')) {
						var og = $("#oprGroupSel").val();
						var si = $("#serverIdSel").val();
						e.preventDefault();
						AdminBean.changeName(si, og, sid, dbIdVal,1, function() {
							alert("操作成功");
							location.reload();
						});
					}
				});
			});
             $("[name='changeAvatar']").each(function() {
				var sid = $(this).attr("idVal");
				var dbIdVal = $(this).attr("dbIdVal");
				var nowRow = $(this);
				$(this).click(function(e) {
					if (confirm('确认重置头像')) {
						var og = $("#oprGroupSel").val();
						var si = $("#serverIdSel").val();
						e.preventDefault();
						AdminBean.changeAvatar(si, og, sid, dbIdVal,1, function() {
							alert("操作成功");
							location.reload();
						});
					}
				});
			});

			$("[name='jinyanOneHour']").each(function() {
				var sid = $(this).attr("idVal");
				var dbIdVal = $(this).attr("dbIdVal");
				var nowRow = $(this);
				$(this).click(function(e) {
					if (confirm('请再次确认')) {
						var og = $("#oprGroupSel").val();
						var si = $("#serverIdSel").val();
						e.preventDefault();
						AdminBean.jinyanByType(si, og, sid, dbIdVal,1, function() {
							alert("操作成功");
							location.reload();
						});
					}
				});
			});


			$("[name='jinyanOneDay']").each(function() {
				var sid = $(this).attr("idVal");
				var dbIdVal = $(this).attr("dbIdVal");
				var nowRow = $(this);
				$(this).click(function(e) {
					if (confirm('请再次确认')) {
						var og = $("#oprGroupSel").val();
						var si = $("#serverIdSel").val();
						e.preventDefault();
						AdminBean.jinyanByType(si, og, sid, dbIdVal,2, function() {
							alert("操作成功");
							location.reload();
						});
					}
				});
			});


			$("[name='jinyanStop']").each(function() {
				var sid = $(this).attr("idVal");
				var dbIdVal = $(this).attr("dbIdVal");
				var nowRow = $(this);
				$(this).click(function(e) {
					if (confirm('请再次确认')) {
						var og = $("#oprGroupSel").val();
						var si = $("#serverIdSel").val();
						e.preventDefault();
						AdminBean.stopJinyan(si, og, sid, dbIdVal, function() {
							alert("操作成功");
							location.reload();
						});
					}
				});
			});

		},

		initReward : function() {
			$('#addsrmbtn').click(function(e) {
				e.preventDefault();
				window.location.href = "pm?module=reward&action=rewardcreate";
			});
	
			$('#doaddsrmbtn').click(
					function(e) {
						e.preventDefault();

						var player = $('#textUser').val();
						var selQudao = $('#oprGroupSel').val();
						var selServer = $('#serverIdSel').val();

						// alert("selQudao = " + selQudao);
						// alert("selServer = " + selServer);

						if (player != "") {
							if (selQudao == "" || selServer == 0) {
								alert("请选择服务器和渠道");
								return;
							}
						}

						$('#mainform').attr('action',
								'?module=reward&action=dorewardcreate');
						$('#mainform').submit();
					});

			$('#msgTypeSel').change(function() {
				var p1 = $(this).children('option:selected').val();
				if (p1 == 1) {
					$("#rwd_body").hide();
				} else {
					$("#rwd_body").show();
				}
			}).change();

			$('#mainform').validate();
		},
		
		
		sendproduct : function() {
			$('#addsrmbtn').click(function(e) {
				e.preventDefault();
				window.location.href = "pm?module=sendProduct&action=createsendproduct";
				console.log("clicked---btn------");
			});
	
			$('#doaddsrmbtn').click(
					function(e) {
						e.preventDefault();

						var player = $('#textUser').val();
						var selQudao = $('#oprGroupSel').val();
						var selServer = $('#serverIdSel').val();
						var touserId = $('#touserId').val();
						var productId = $('#productId').val();
						// alert("selQudao = " + selQudao);
						// alert("selServer = " + selServer);

						if (player != "") {
							if (selQudao == "" || selServer == 0) {
								alert("请选择服务器和渠道");
								return;
							}
						}

						$('#mainform').attr('action',
								'?module=sendProduct&action=dosendproduct');
						$('#mainform').submit();
					});

			$('#msgTypeSel').change(function() {
				var p1 = $(this).children('option:selected').val();
				if (p1 == 1) {
					$("#rwd_body").hide();
				} else {
					$("#rwd_body").show();
				}
			}).change();

			$('#mainform').validate();
		},
		
		
		
		
		initRoll : function() {
			handleDateTimeRangePickers();
			$('#mainform').validate();
			$("#addrollbtn").click(function(e) {
				e.preventDefault();
				$('#mainform').submit();
			});

			$('#addrollbtn_pre').click(function(e) {
				e.preventDefault();
				window.location.href = "pm?module=roll&action=rollcreate";
			});
		},
		initCriticalLog : function() {
			handleDateRangePickers();
			function dosearch(e) {
				e.preventDefault();
				$('#mainform').submit();
			}
			$("#searchbtn").click(dosearch);
		},
		initChargeRecord : function() {
			handleDateRangePickers();
			function dosearch(e) {
				e.preventDefault();
				$('#mainform').submit();
			}
			$("#searchbtn").click(dosearch);
		},
		initItemList : function() {
			handleDateTimeRangePickersForItem();
			function dosearch(e) {
				var serverId = $("#serverIdSel").val();
				serverId = serverId && typeof (serverId) != "undefined" ? parseInt(serverId) : 0;
				var oprGroup = $("#oprGroupSel").val();
				var gbId = $("#gbId").val();
				var accountName = $("#accountName").val();
				var itemTemplateId = $("#itemTemplateId").val();
				var tp_dateTime = $("#tp_dateTime").val();
				if (serverId <= 0 || !oprGroup) {
					alert("服务器和渠道不能为空!");
					return;
				}

				if (!gbId && !accountName) {
					alert("玩家ID和账号必须填一个!");
					return;
				}

				if (!itemTemplateId) {
					alert("道具ID不能为空!");
					return;
				}

				e.preventDefault();
				$('#mainform').submit();
			}
			$("#searchbtn").click(dosearch);
		},
		initFeedbackList : function() {
			$("#fbOprGroupSel")
					.change(
							function() {
								window.location.href = "pm?module=feedback&action=feedbacklist&oprGroup="
										+ $("#fbOprGroupSel").val();
							});

			$("#saveReply").click(
					function(e) {
						e.preventDefault();
						var mv = $("#replyContent").val();
						if (!mv || mv.length == 0) {
							alert("请输入文字!");
							return;
						}
						var currId = $('#responsive').attr("currId");

						AdminBean.replyFeedback($("#fbOprGroupSel").val(),
								currId, mv, function() {
									alert("操作成功!");
									location.reload();
								});
					});

			$("[name='replyFb']").each(function() {
				var sid = $(this).attr("idVal");
				$(this).click(function(e) {
					e.preventDefault();
					$('#responsive').modal();
					$('#responsive').attr("currId", sid);
				});
			});

			$("[name='delFb']").each(
					function() {
						var sid = $(this).attr("idVal");
						$(this).click(
								function(e) {
									e.preventDefault();
									AdminBean.removeFeedback(
											$("#fbOprGroupSel").val(), sid,
											function() {
												alert("操作成功");
												location.reload();
											});
								});
					});
		},
		
		__litaotianNameClick : function(obj) {
			if(confirm('是否封禁?')){
				var uid = $(obj).attr("uidVal");
				var og = $("#oprGroupSel").val();
				var si = $("#serverIdSel").val();
				AdminBean.forbidAccount(si, og,
						uid, -1, function() {
							 alert("操作成功");
						});
			}
		},
		
		liaotianmonitor : function() {
			var loadingDiv = $('#spinner').hide();
			$(document).ajaxStart(function () {
				  loadingDiv.show();
			  }).ajaxStop(function () {
				  loadingDiv.hide();
			  });
			
			$('#autoScrollBtn').click(function(e) {
				canScroll = !canScroll;
			    $(this).html(canScroll?'自动滚动':'停止滚动');
			});
			
			$('#clearLogBtn').click(function(e) {
				$('#liaotian_content').html('');
		        $('#liaotian_content').scrollTop($('#liaotian_content').prop('scrollHeight'));
			});
			
			$('#monitorBtn').click(function(e) {
				filePos = 0;
				if(ltMonitorXhr) {
					ltMonitorXhr.abort();
		        }
				clearTimeout(ltMonitorTimerId);
				$('#liaotian_content').html('');
		        $('#liaotian_content').scrollTop($('#liaotian_content').prop('scrollHeight'));
		        
			    var _f = function() {
			    	var og = $("#oprGroupSel").val();
					var si = $("#serverIdSel").val();
					ltMonitorXhr = $.ajax({
		  		           type: "POST",
		  		           url: "pm?module=liaotian&action=monitor&oprGroup="+og+"&serverId="+si+"&filePos="+filePos,
		  		           success: function(data)
		  		           {
		  		        	 filePos = data.filePos;
			                 if(data.fileLines !== '') {
			                	var newContentArr = data.fileLines.split(/\n/g);
			                	var tabStr = "&nbsp;&nbsp;&nbsp;&nbsp;";
			                	for(var i=newContentArr.length-1;i>=0;--i){
			                		if(!newContentArr[i] || !newContentArr[i].trim()){
			                			continue;
			                		}
			                		var lineJson = $.parseJSON(newContentArr[i]);
			                		var toName = lineJson.toName;
			                		if(lineJson.type==1) {
			                			toName = "<small style='color: #ffb848;'>世界</small>";
			                		}else if(lineJson.type==2) {
			                			toName = "<a name='toNameBtn' href='javascript:void(0)' uidVal='"+lineJson.toAvatarId
			                			+"' onclick='PlayerManager.__litaotianNameClick(this);'>"+lineJson.toName+"</a>";
			                		}else if(lineJson.type==4) {
			                			toName = "<small style='color: #e02222;'>派系["+lineJson.toName+"]</small>";
			                		}
			                		                		
			                		var dateTime = "<small style='color: #35aa47'>"+App.formateDate(lineJson.time)+"</small>";
			                		var fromName = "<a name='fromNameBtn' href='javascript:void(0)' uidVal='"+lineJson.fromAvatarId
			                			+"' onclick='PlayerManager.__litaotianNameClick(this);'>"+lineJson.fromName+"</a>";
			                		
			                		var lineStr = dateTime +
			                			tabStr+ fromName+ " -> "+toName+tabStr+lineJson.msg;
			                		$('#liaotian_content').append(lineStr + "<br/>");
			                		
//			                		alert(App.formateDate(lineJson.time));
			                	}
			                		
			                		
//			                	alert("123");
//			                	alert(newContentJson[0].ss);
			                	
//			                    $('#liaotian_content').append(data.fileLines.replace(/\n/g, ','));
			                    if (canScroll) {
			                        $('#liaotian_content').scrollTop($('#liaotian_content').prop('scrollHeight'));
			                    }
			                  }
			                  ltMonitorTimerId = setTimeout(_f, 2000);
			                  console.log('monitor liaotian', filePos);
		  		           },
		  		           error: function (error) {
		  		        	 alert("ajax error="+error);
		  		        	 console.log('monitor error', error);
		  		           }
		     		});
			    };
			    ltMonitorTimerId = setTimeout(_f, 2000);
			});
	
		}, 
		
		initPassNotice : function() {
	    	
    		$("[name='btnpass']").each(function(){
              	var srmId = $(this).attr("srmid");
              	$(this).click(function(e){
                  	if(confirm('请再次确认')){
                      	e.preventDefault();
                      	AdminBean.allowNotice(srmId, function() {
                          	alert("操作成功");
                          	location.reload();
                      	});
                  	}
              	});
          	});
            
            $("[name='btnnopass']").each(function(){
              	var srmId = $(this).attr("srmid");
              	$(this).click(function(e){
                  	if(confirm('请再次确认')){
                      	e.preventDefault();
                      	AdminBean.refuseNotice(srmId, function() {
                          	alert("操作成功");
                          	location.reload();
                      	});
                  	}
              	});
          	});
            
            $("[name='btndel']").each(function(){
              	var srmId = $(this).attr("srmid");
              	$(this).click(function(e){
                  	if(confirm('请再次确认')){
                      	e.preventDefault();
                      	AdminBean.delRollMsg(srmId, function(ret) {
                      		alert("操作成功");
                      		location.reload();
                      	});
                  	}
              	});
          	});
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
					            			window.location.href = "pm?module=notice&action=addnotice";
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
				
				window.location.href = "pm?module=notice&action=addnotice";
            });
            
            $("#noticeOprGroupSel").change();
            
        }, 
        
        initApplePurchase : function() {
			handleDateRangePickers();
			function dosearch(e) {
				e.preventDefault();
				$('#mainform').submit();
			}
			$("#searchbtn").click(dosearch);
		}
	};

}();