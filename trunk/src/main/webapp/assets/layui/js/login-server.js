$(function(){
	$(".layui-canvs").jParticle({
		background: "#141414",
		color: "#E6E6E6"
	});
});
$(window).resize(function () { 
  location.reload();
  
})
document.onkeydown=function(e){
     if(e.keyCode==13){
       $('.layui-form').submit();
     } 
   } 
