var CouponManager = function () {
	var initOprMap = function() {
		// 渠道标示和子渠道选择框
        if(typeof AdminBean != "undefined"){
	        AdminBean.getOprMap(function(result){
	        	var oprMap = $.parseJSON(result);
	        	function changChild(oprGroup) { 
	        		var _opr = oprMap[oprGroup];
	        		$("#qd_oprSel").html("");
	        		$("#qd_oprSel").append("<option value=''>ALL</option>");
	        		if(_opr){
		    	        for(var i=0;i<_opr.length;i++){  
		    	            $("#qd_oprSel").append("<option value='"+_opr[i]+"'>"+_opr[i]+"</option>");  
		    	        }  
	        		}
	        		
	        	}  
	
	        	$("#qd_oprGroupSel").append("<option value=''>ALL</option>");
	        	for(var og in oprMap){
	        		$("#qd_oprGroupSel").append("<option value='"+og+"'>"+og+"</option>");
	        	}
	        	$("#qd_oprGroupSel").change(function(){  
	                changChild($(this).val());  
	            });
	        	
	        	//初始化当前值
	        	$("#qd_oprGroupSel").val($("#qd_oprGroupSel").attr("sval"));
	        	changChild($("#qd_oprGroupSel").attr("sval"));
	        	$("#qd_oprSel").val($("#qd_oprSel").attr("sval"));
			});
        }
	}
	
    return {
        initCateList: function () {
            $('#addcatebtn').click(function (e) {
            	e.preventDefault();
            	window.location.href="cpm?module=cate&action=catecreate";
            });
        },

    	initCateCreate: function() {
    		$('#mainform').validate();
    		$("#addcatebtn").click(function (e) {
    			e.preventDefault();
    	  		$('#mainform').submit();
    		});
    	},
    	
    	
    	initBatchList: function () {
            $('#addbatchbtn').click(function (e) {
            	e.preventDefault();
            	window.location.href="cpm?module=batch&action=batchcreate";
            });
            
            $("[name='batch_en']").each(function(){
    			var sid = $(this).attr("idVal");
    			$(this).click(function(e){
    				e.preventDefault();
    				if(confirm('请再次确认')){
    					AdminBean.enableCoupon(sid, function(result){
    	                	if(result=="SUCCESS"){
    	                		alert("启用成功!");
    	                		window.location.href="cpm?module=batch&action=batchlist";
    	                	}else{
    	                		alert("启用失败!");
    	                	}
    	                })
    				}
    			});
    		});
            
            $("[name='batch_dis']").each(function(){
    			var sid = $(this).attr("idVal");
    			$(this).click(function(e){
    				e.preventDefault();
    				if(confirm('请再次确认')){
    					AdminBean.disableCoupon(sid, function(result){
    	                	if(result=="SUCCESS"){
    	                		alert("禁用成功!");
    	                		window.location.href="cpm?module=batch&action=batchlist";
    	                	}else{
    	                		alert("禁用失败!");
    	                	}
    	                })
    				}
    			});
    		});
            
            $("[name='batch_del']").each(function(){
    			var sid = $(this).attr("idVal");
    			$(this).click(function(e){
    				e.preventDefault();
    				if(confirm('请再次确认')){
    					AdminBean.delCoupons(sid, function(result){
    	                	if(result=="SUCCESS"){
    	                		alert("删除成功!");
    	                		window.location.href="cpm?module=batch&action=batchlist";
    	                	}else{
    	                		alert("删除失败!");
    	                	}
    	                })
    				}
    			});
    		});
        },

    	initBatchCreate: function() {
    		$('#mainform').validate();
    		$("#addbatchbtn").click(function (e) {
    			e.preventDefault();
    			var el = $(".page-header-fixed");
    			App.blockUI({target: el, iconOnly: true});
    			$.ajax({
  		           type: "POST",
  		           url: "?module=batch&action=dobatchcreate",
  		           data: $("#mainform").serialize(), 
  		           success: function(data)
  		           {
  		        	  App.unblockUI(el);
  		        	  data = parseInt(data)
  		              if (data > 0){
  		            	 alert("创建成功! 一共生成"+data+"个激活码");
  		            	 window.location.href="cpm?module=batch&action=batchlist";
  		              }else{
  		            	 alert("创建失败!请检查对应的认证服务器是否正常运行!");
  		              }
  		           }
     			});
    		});
    		
    	},
    	
    	initCouponList: function() {
            function dosearch(e) {
    			e.preventDefault();
    	  		$('#mainform').submit();
    		}
    		$("#searchbtn").click(dosearch);
        },
        
        initGlobalCouponList: function () {
            $('#addGlobalCouponBtn').click(function (e) {
            	e.preventDefault();
            	window.location.href="cpm?module=glcoupon&action=glcouponcreate";
            });
            
            $("[name='glcoupon_en']").each(function(){
    			var sid = $(this).attr("idVal");
    			$(this).click(function(e){
    				e.preventDefault();
    				if(confirm('请再次确认')){
    					AdminBean.enableGlobalCoupon(sid, true,function(result){
    	                	if(result=="SUCCESS"){
    	                		alert("启用成功!");
    	                		window.location.href="cpm?module=glcoupon&action=glcouponlist";
    	                	}else{
    	                		alert("启用失败!");
    	                	}
    	                })
    				}
    			});
    		});
            
            $("[name='glcoupon_dis']").each(function(){
    			var sid = $(this).attr("idVal");
    			$(this).click(function(e){
    				e.preventDefault();
    				if(confirm('请再次确认')){
    					AdminBean.enableGlobalCoupon(sid, false, function(result){
    	                	if(result=="SUCCESS"){
    	                		alert("禁用成功!");
    	                		window.location.href="cpm?module=glcoupon&action=glcouponlist";
    	                	}else{
    	                		alert("禁用失败!");
    	                	}
    	                })
    				}
    			});
    		});
        },
        
        initGlobalCouponCreate: function() {
        	initOprMap();
    		$('#mainform').validate();
    		$("#addglobalcouponbtn").click(function (e) {
    			e.preventDefault();
    	  		$('#mainform').submit();
    		});
    	},
    };

}();