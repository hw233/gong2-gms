var SecurityManager = function () {

    return {
        initList: function () {
            $('#addsecbtn').click(function (e) {
            	e.preventDefault();
            	window.location.href="se?module=sec&action=seccreate";
            });
            $('#addoprgroupbtn').click(function (e) {
            	e.preventDefault();
            	window.location.href="se?module=oprgroup&action=oprgroupcreate";
            });
        },

    	initCreate: function() {
    		function doseccreate(e) {
    			e.preventDefault();
    	  		$('#mainform').submit();
    		}
    		$('#mainform').validate();
    		$("#addsecbtn").click(doseccreate);
    		$("#addoprgroupbtn").click(doseccreate);
    	},
    	
    	initPassReward : function() {
    	
    		$("[name='btnpass']").each(function(){
              	var srmId = $(this).attr("srmid");
              	$(this).click(function(e){
                  	if(confirm('请再次确认')){
                      	e.preventDefault();
                      	AdminBean.allowSend(srmId, function(ret) {
                      		if(ret=='SUCCESS'){
                      			alert("发送成功");
                              	location.reload();
                      		}else{
                      			alert("发送失败");
                      			alert(ret);
                      		}
                      	});
                  	}
              	});
          	});
            
            $("[name='btnnopass']").each(function(){
              	var srmId = $(this).attr("srmid");
              	$(this).click(function(e){
                  	if(confirm('请再次确认')){
                      	e.preventDefault();
                      	AdminBean.refuseSend(srmId, function() {
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
                      	AdminBean.delSend(srmId, function(ret) {
                      		alert("操作成功");
                      		location.reload();
                      	});
                  	}
              	});
          	});
            
            $("#redoOrder").click(function(e) {
        		e.preventDefault();
        		var oprGroup = $("#orderOprGroupSel").val();
        		var orderId = $("#orderId").val();
        		
        		if(!oprGroup || !orderId){
        			alert("Keyword can't be blank");
        			return;
        		}
        		
        		AdminBean.redoOrder(oprGroup, orderId, function(result){
        			if(result=="SUCCESS"){
                		alert(result);
                		$("#orderId").val("");
                		location.reload();
                	}else{
                		alert(result);
                	}
        		});
        	});
            
            $('.modal').on('show', function() {
                $(this).css({
                    'margin-top': function () {
                        return -($(this).height() / 2);
                    }
                });
            });
    	},
    	
    	
    	initpassproduct : function() {
        	
    		$("[name='btnpass']").each(function(){
              	var srmId = $(this).attr("srmid");
              	$(this).click(function(e){
                  	if(confirm('请再次确认')){
                      	e.preventDefault();
                      	
                      	AdminBean.allowproductSend(srmId, function(ret) {
                      		if(ret=='SUCCESS'){
                      			alert("发送成功");
                              	location.reload();
                      		}else{
                      			alert("发送失败");
                      			alert(ret);
                      		}
                      	});
                  	}
              	});
          	});
            
            $("[name='btnnopass']").each(function(){
              	var srmId = $(this).attr("srmid");
              	$(this).click(function(e){
                  	if(confirm('请再次确认')){
                      	e.preventDefault();
                      	AdminBean.refuseproductSend(srmId, function() {
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
                      	AdminBean.delproductSend(srmId, function(ret) {
                      		alert("操作成功");
                      		location.reload();
                      	});
                  	}
              	});
          	});
            
            $("#redoOrder").click(function(e) {
        		e.preventDefault();
        		var oprGroup = $("#orderOprGroupSel").val();
        		var orderId = $("#orderId").val();
        		
        		if(!oprGroup || !orderId){
        			alert("Keyword can't be blank");
        			return;
        		}
        		
        		AdminBean.redoOrder(oprGroup, orderId, function(result){
        			if(result=="SUCCESS"){
                		alert(result);
                		$("#orderId").val("");
                		location.reload();
                	}else{
                		alert(result);
                	}
        		});
        	});
            
            $('.modal').on('show', function() {
                $(this).css({
                    'margin-top': function () {
                        return -($(this).height() / 2);
                    }
                });
            });
    	},
    	
    	
    	
    };

}();