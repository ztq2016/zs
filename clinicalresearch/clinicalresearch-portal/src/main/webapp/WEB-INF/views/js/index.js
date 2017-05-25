/**
 *首页数据传输 
 */
$(function(){
	var userid;
	   var xhr=null;
	   var inputText;
	   var studyType;
	   var currentpage=1;
	   var pagesize=10;
/**   呈现在页面**/
	function htmlChange(json,info) { 
        if(info){
        	console.log(info);
        	$("#project-tip").html(info+'<small >总数：</small><i id="project-sum">'+json.page.count+'</i>');
        	$("#lastpage").html('<i class="fa fa-angle-right"></i><a href="#">'+info+'</a>');
        }else{
        	$("#project-tip").html('所有项目 <small >总数：</small><i id="project-sum">'+json.page.count+'</i>');
        	$("#lastpage").html(' ');
        }
    	
    	$str="";
        $.each(json.studyList,function(i,study){
        	var n=(json.page.currentPage-1)*(json.page.pageSize)+i+1;
        	if(n<10){n='0'+n;}
           $str+='<div class="project-list"><table class="table table-hover"><tbody><tr class="expand">'
                    	+'<td class="project-id"><input type="hidden" value="'+study.studyId +'" class="studyid"> <i>'+n+'</i>'
                    	+'</td><td class="project-title">'
                           + '<a>'+study.studyObjective+'</a><br/>'
                          +' <small> 创建时间：'+study.startTime +'</small> </td> <td class="project-type">'
                        	+'<span>'+study.studyType.typename+'</span> </td><td class="project-pi">'
                        	+'<span>'+study.pi+'</span></td><td class="project-completion">'
                              +'<small>'+ study.schedule+'</small><div class="progress progress-mini"><div  class="progress-bar"></div>'                                        
+'</div></td><td class="project-actions" data="'+study.studyId+'"><form action="studyedit" method="POST"><input type="hidden" name="userId" value="'+json.userId+'" id="userid"><input type="hidden" name="studyId" value="'+study.studyId+'"><a title="修改" class="edit-btn"><i class="myicon edit"></i></a><a href="javascript:;" class="lock-btn" title="锁定"><i class="myicon lock"></i></a><a href="javascript:;" class="remove-projectlist-btn" title="删除"><i class="myicon trash-o"></i></a></form></td></tr></table>'
+'<div class="row detail_list" style="display: none;" ><div class="col-md-12"><table  class="table"><tbody><tr><td style="width:10%"></td><td style="width:12%;" class="text-right"><b> 入排信息</b></td><td style="width:70%">';
						           if(study.inclusionCriteria){
									   
								    	
										 $.each(study.inclusionCriteria,function(iii,inclusion){
									          
									        	  $str+='<span class="block-info">'+inclusion.criteriaexpression+';</span><br/>';
									          
								       }) 
									 
								 }
															
								$str+='</td><td style="width:10%"></td></tr><tr><td></td><td class="text-right"><b>分组信息</b></td><td>';
								if(study.groupInfo){
           							$.each(study.groupInfo,function(ii,group){
           								if(group.groupnum==null)
										 $str+=group.groupname+'<span class="block-info">'+group.groupnum +'例</span>；'
										 else
											 $str+=group.groupname+'<span class="block-info">0例</span>；' 
									 }) 
								}
								
								$str+='</td><td></td></tr><tr><td></td><td class="text-right"><b>统计方法</b></td><td>';		
								if(study.statisticalModel){
								$.each(study.statisticalModel,function(ii,model){
										$str+='<span class="block-info">'+model.modelname+'；</span>';
									});
								}
								$str+='</td><td></td></tr><tr><td colspan="4" ><a class="result-btn"> 点击查看研究结果  <i class="fa fa fa-angle-double-right"></i></a></td></tr></tbody></table>'
									+'<div class="packup-btn">点击收起  <i class="fa fa-caret-up"></i></div></div></div></div>';	
									
						
        })    	
        $("#project-box").html($($str));
       
    //  当前进度
        $.each($(".project-completion"),function(n,item){
        	   if($.trim($(item).children("small").html())=="已完成"){
        	   	$(item).find(".progress-bar").animate({"width":"100%"},{queue:false,duration:600,easing:"swing"}).addClass("progress-bar-success");
        	   	$(item).parents(".project-list").find(".result-btn").removeClass("hidden");
        	   }else{
        	   
        	   	$w=$(item).children("small").html();
        	     $(item).find(".progress-bar").animate({"width":parseFloat($w)},{queue:false,duration:600,easing:"swing"});
        	    $(item).children("small").prepend("当前进度:");
        	    $(item).parents(".project-list").find(".result-btn").addClass("hidden");
        	   }
        });
        
        
        p.render({pagesize:json.page.pageSize,count:json.page.count,current: json.page.currentPage});
        }
	
/**页面渲染结束 htmlchange方法结束**/	
    userid=$("#userid").val();
   
// 搜索功能
   $('#search-btn').click(function(){
	   
       if(xhr){  
           xhr.abort();//如果存在ajax的请求，就放弃请求  
       } 
       inputText = $.trim($("#search").val());
       if(inputText!=""){//检测键盘输入的内容是否为空，为空就不发出请求 
    	  $d={"userId":userid,"keyWord":inputText,"currentPage":"1","pageSize":pagesize,"studyType":studyType}; 
    	   
           xhr=$.ajax({  
        	   url: 'studysearch',     
        	   contentType: 'application/json', 
               type: 'POST',             
               data:JSON.stringify($d),//向服务器端发送的数据 
               dataType: "json",//服务器返回数据的类型为json  
               success: function (json) {  
                   if (json.studyList) {//检测返回的结果是否为空  
                	   htmlChange(json,"相关课题");
                	   

                   } else {  
                	 bootbox.setDefaults("locale","zh_CN");
                	 bootbox.alert('抱歉！没有搜索到与<b style="color:#333;">‘'+inputText+'’</b>相关课题');
                   }  
               }
           });  
       }else{  
    	   bootbox.alert('<b style="color:#333;">请输入关键字：课题PI或研究目的</b>'); 
       }  
       
   })  
   $("#search").keyup(function (e) {//当按下按键时  
       if (e.keyCode == 13) {//.which属性判断按下的是哪个键，回车键的键位序号为13  
           $('#search-btn').trigger("click");//触发搜索按钮的点击事件 
       }  
   });  
//研究类型选择
$('.view').live("click",function(){
	studyType=$.trim($(this).next("h5").html());
       if(xhr){  
           xhr.abort();//如果存在ajax的请求，就放弃请求  
       } 
       if(studyType){ 
    	   $d={"userId":userid,"keyWord":inputText,"currentPage":"1","pageSize":"10","studyType":studyType}; 
    	   
           xhr=$.ajax({  
        	   url: 'studysearch',     
        	   contentType: 'application/json', 
               type: 'POST',             
               data:JSON.stringify($d),//向服务器端发送的数据 
               dataType: "json",//服务器返回数据的类型为json  
               success: function (json) {  
                   if (json.studyList) {//检测返回的结果是否为空  
                	   htmlChange(json,studyType);
                   	   

                   } else {  
                	 bootbox.setDefaults("locale","zh_CN");
                	 bootbox.alert('抱歉！没有搜索到与<b style="color:#333;">‘'+inputText+'’</b>相关课题');
                   }  
               }
           });  
       }else{  
    	   bootbox.alert('<b style="color:#333;">请输入关键字：课题PI或研究目的</b>'); 
       }  
       
   }) 
  //分页实现
   
   var pagecount=parseInt($("#pageToolbar0").attr("data-pagecount"));
var p = new Paging();
       p.init({
	   target:"#pageToolbar0",
	   pagesize:10,
	   count:pagecount,
	   toolbar:true,
	   callback:function(page,size,count){
		   currentpage=page;
		   pagesize=size;
	   $.ajax({  
     	   url: 'studysearch',     
     	   contentType: 'application/json', 
            type: 'POST',             
            data:JSON.stringify({"userId":userid,"keyWord":inputText,"currentPage":page,"pageSize":pagesize,"studyType":studyType}),//向服务器端发送的数据 
            dataType: "json",//服务器返回数据的类型为json  
            success: function(data){
            	
            	if(studyType){htmlChange(data,studyType,size);
            	}else{htmlChange(data);}
            	 //	加序号
               
                $.each($(".project-id"), function(index,item) {
                	$id=(page-1)*size+(index+1);
                	if($id<=9){
                		
                		$id="0"+$id;
                	}
                	$(item).children("i").html($id);
                });
            }
        });  
   },
   
   });


  //返回所有课题跳转功能
     $("#toAllPage,#refresh-btn").live("click",function(){
    	 inputText=null;studyType=null;
    	 $.ajax({  
       	   url: 'studysearch',     
       	   contentType: 'application/json', 
              type: 'POST',             
              data:JSON.stringify({"userId":userid,"keyWord":inputText,"currentPage":1,"pageSize":"10","studyType":studyType}),//向服务器端发送的数据 
              dataType: "json",//服务器返回数据的类型为json  
              success: function(data){
              	htmlChange(data);

              }
          });  
     })
   
//    	编辑功能
     $(".edit-btn").live("click",function(){
    	 
    	 $(this).parent("form").submit();
     })
//    删除功能
$(".remove-projectlist-btn").live("click",function(e){
	var userid=$(this).parent().find("#userid").val();
            bootbox.setDefaults("locale","zh_CN");
    		bootbox.confirm("确定删除该课题?", function(result) {
                     if(result){
                     	$studyid=$(e.target).parents(".project-actions").attr("data");
                     	$.ajax({  
                      	   url: 'studydelete',     
                      	   contentType: 'application/json', 
                             type: 'POST',             
                             data:JSON.stringify({"userId":userid,"studyId":$studyid,"keyWord":inputText,"currentPage":currentpage,"pageSize":pagesize,"studyType":studyType}),//向服务器端发送的数据 
                             dataType: "json",//服务器返回数据的类型为json  
                             success: function(data){
                            	 htmlChange(data);
                                 if($("#studytypeList").html('<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12" ><div class="ibox float-e-margins">'
                            +'<div class="ibox-title border-color-sgreen"><span class="btn-xs btn blue-light pull-right view">查看</span>'
                               + '<h5>非随机对照试验</h5>'
                            +'</div><div class="ibox-content">'
                            +'<h1 class="no-margins text-blue-light">'+data.typeCount.nrct+'</h1>'
                            +'<div class="stat-percent font-bold ">'+data.typeCount.nrctper+'<i class="fa  fa-adjust"></i></div></div></div></div>'
                           +'<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12"><div class="ibox float-e-margins"><div class="ibox-title border-color-blue"><span class="btn-xs btn blue pull-right view" style="background: #89c4f4;">查看</span>'
                           +' <h5>病例对照研究</h5></div> <div class="ibox-content">'
                           +'<h1 class="no-margins text-navy">'+data.typeCount.ccs+'</h1>'
                           +'<div class="stat-percent font-bold ">'+data.typeCount.ccsper+'<i class="fa  fa-adjust"></i></div></div></div></div>'
       
                   +'<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12"><div class="ibox float-e-margins"><div class="ibox-title border-color-red">' 
                   +'<span class="btn-xs btn red pull-right view">查看</span><h5>横断面调查</h5></div><div class="ibox-content">'   
                    +'<h1 class="no-margins text-danger">'+data.typeCount.css+'</h1>'  
                    +'<div class="stat-percent font-bold ">'+data.typeCount.cssper+'<i class="fa  fa-adjust"></i></div></div></div></div>'
                    +'<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12"><div class="ibox float-e-margins"><div class="ibox-title border-color-purple">'
                     +'<span class="btn-xs btn purple pull-right view">查看</span><h5>回顾性队列研究</h5></div><div class="ibox-content">'
                      +'<h1 class="no-margins text-purple">'+data.typeCount.rcs+'</h1>'          
                      +'<div class="stat-percent font-bold ">'+data.typeCount.rcsper +'<i class="fa  fa-adjust"></i></div></div></div></div>'      
                       )){//删除成功后
                                	 console.log("删除成功！");
                                	 p.render({pagesize:data.page.pageSize,count:data.page.count,current: data.page.currentPage});
                       };  	 
                                 }

                             }
                         );  
                     	
                     }
                    }); 
    	});    	




//页面动作

$(".expand td:not('.project-actions')").live("click",function(){
    		$(this).parents(".project-list").siblings(".project-list").find(".detail_list").slideUp().end().removeClass("active");
    		$(this).parents("table").next(".detail_list").slideToggle();
    		$(this).parents(".project-list").toggleClass("active");
    	});
    	
    	$(".packup-btn").live("click",function(){
    		$(this).parents(".detail_list").slideUp();
    		$(this).parents(".project-list").removeClass("active");
    	});

//锁定
	$(".lock-btn").live("click",function(){
		
		if($(this).children("i").hasClass("lock")){
			bootbox.setDefaults("locale","zh_CN");
       	    bootbox.alert('课题已锁定，不能继续编辑');
			$(this).children("i").removeClass("lock");
			$(this).children("i").addClass("unlock").attr("title","解锁");
			$(this).siblings("a").hide();
		}else{
			$(this).children("i").removeClass("unlock");
			$(this).children("i").addClass("lock").attr("title","锁定");
			$(this).siblings("a").show();
		}
	})
	
	
 
//  当前进度
    $.each($(".project-completion"),function(n,item){
    	   if($.trim($(item).children("small").html())=="已完成"){
    	   	$(item).find(".progress-bar").animate({"width":"100%"},{queue:false,duration:600,easing:"swing"}).addClass("progress-bar-success");
    	   }else{
    	   
    	   	$w=$(item).children("small").html();
    	     $(item).find(".progress-bar").animate({"width":parseFloat($w)},{queue:false,duration:600,easing:"swing"});
    	    $(item).children("small").prepend("当前进度:");
    	   }
    });
})
	


