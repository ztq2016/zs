$(function($){
	//初始化菜单
    $("i[id^='menuIcon']").each(function(index,item){
	         switch(index){
	         case 0:$("i[id='menuIcon_"+index+"']").attr("class","myicon home");break;
	         case 1:$("i[id='menuIcon_"+index+"']").attr("class","myicon rocket");break;
	         case 2:$("i[id='menuIcon_"+index+"']").attr("class","myicon gears");break;
	         case 3:$("i[id='menuIcon_"+index+"']").attr("class","myicon gears");break;
	         }
     });
    $("li[id^='menu']").each(function(index,item){
    	$(this).click(function(){
    		  $("li[id^='menu']").each(function(k,v){	
    			  $(this).removeAttr("class","start active open");
    			  $(this).attr("class","start  open");
    		  });
    		$(this).attr("class","start active open");
    	});
    	$(this).find(".arrow").attr("class","");
    	$("li[id^='menu_"+index+"']").find("ul").each(function(i,item){
    	
    		if($(this).attr("class")!=null){
    			$("li[id^='menu_"+index+"']").find("#menu_arrow_"+index).attr("class","arrow");
    			$(this).parent().children("a").removeAttr("href");
    		}
    	});
    });
});