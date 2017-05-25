$(function(){
	
	$(".userinfo-btn").click(function(){
		
		if($(".userinfo").hasClass("hidden")){
			
			$(".userinfo").animate({"left":"25px","opacity":"1","width":"140px","height":"100px"},250).removeClass("hidden");
		}else{
		$(".userinfo").animate({"left":"25px","opacity":"0","width":"0px","height":"0px"},250).addClass("hidden");	
		}
	});
//	点击其他地方条件器关闭
	function stop(e) {
		if (e.stopPropagation)
		e.stopPropagation();
		else
		e.cancelBubble = true;
	} 
	$(document).bind('click',function(e){
		if(!$(e.target).hasClass("loadbtn")&&$(e.target).attr("alt")!="下载任务"&&$(e.target).attr("id")!="export_res"&&$(e.target).parents('.pull-right').attr("id")!="export_res"){
			$("#export_res").addClass("hidden");
		}
		
		$(".conditions-box").addClass("hidden");
		///$(".mypanel").addClass("hidden");
		/*$(".time_panel").addClass("hidden");*/
		$(".num_panel").addClass("hidden");
		$("#tab4 .block-var .edit-block i").removeClass("open");
		$(".userinfo").addClass("hidden").animate({"left":"25px","opacity":"0","width":"0px","height":"0px"},250);	
	}); 
	
	$(".conditions-box,.mypanel,.time_panel,.num_panel,.userinfo,.userinfo-btn").on("click", function(e) {
    	stop(e);	
	});
	
//点击其他地方条件器关闭 end	

})
