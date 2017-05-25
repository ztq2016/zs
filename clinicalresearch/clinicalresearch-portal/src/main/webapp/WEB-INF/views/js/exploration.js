/**
 * 问题挖掘页
 */
$(function() {
	var tabcont=$("#portlet_tab0").html();

function panelSetting(panel,targetObj,widthSync,offX,offY){
				  
				  var Objh=$(targetObj).outerHeight();
				  var Objw=$(targetObj).outerWidth();
				  var Pleft=$(targetObj).offset().left;
				  var Ptop=$(targetObj).offset().top+Objh;
				 
				  $(panel).css({"position":"absolute","left":Pleft+offX,"top":Ptop+offY,"width":Objw});
				
}
$(".config-btn").live("click",function(){
	$(".settab").addClass("hidden");
	panelSetting($(".settab"),$(this),false,-500,10);
	$(".settab").removeClass("hidden");
	
});
$(".config-btn .fa-close,.settab .control>span").live("click",function(){
	$(".settab").addClass("hidden");
});
var tabstr=$("#portlet_tab0").html();
$("#tab_15_1 .nav-tabs li").live("dblclick",function(){
	$(this).find("span").attr("contenteditable","true");
});
function swiperInit(obj){
	 var mySwiper0 = new Swiper (obj, {
		 keyboardControl : true,
		 onlyExternal : true,
		    slidesPerView : 3,
		    slidesPerGroup : 1,
		    
		    spaceBetween : 10,
		    // 如果需要分页器
		    pagination: '.swiper-pagination',
		    
		    // 如果需要前进后退按钮
		    nextButton: '.swiper-button-next',
		    prevButton: '.swiper-button-prev'
		    
		   
		  });
	 $("#portlet_tab0 .conditionsPage-btn-group").on("click",".prev",function(){
   			mySwiper0.slidePrev();
   			
   		});
   		$("#portlet_tab0 .conditionsPage-btn-group").on("click",".next",function(){
   			mySwiper0.slideNext();
   			
   		});
   		$('#portlet_tab0 .plus-conditions-container').click(function(){
   			mySwiper0.appendSlide('<div class="conditions-container swiper-slide"><div><ol></ol><div class="bottom-bar"><i class="fa fa-close"></i></div></div></div>'); //加到Swiper的最后
   			mySwiper0.slideTo(mySwiper0.slides.length);
   		});
}
$("#tab_15_1 .nav-tabs li a").live("click",function(e){
	var num=$("#tab_15_1 .nav-tabs li").length-1;
	var _li=$(this).closest("li");
	var aid=$(e.target).closest("a").attr("id");
	if($(e.target).hasClass("close-fa")){
		var ids=_li.find("a").attr("href");
		_li.remove();
		$("#tab_15_1 .tab-content").find(ids).remove();
		
		$("#tab_15_1 .nav-tabs li").eq(0).addClass("active").find("a").attr("href");
		$("#tab_15_1 .tab-content>.tab-pane").eq(0).addClass("active").removeClass("hidden").siblings(".tab-pane").removeClass("active");
		}
	else if(aid=="add_group"||$(e.target).text()=="添加组"){
		var str='<li><a href="#portlet_tab'+num+'" data-toggle="tab" ><span >对照组'+num+'</span><b class="close-fa">&times;</b> </a></li>';
		/*$("#tab_15_1 .tab-content").append('<div class="tab-pane" id="portlet_tab'+num+'">'+tabcont+'</div>');*/
		_li.before($(str));
		/*swiperInit($("#tab_15_1 .tab-content #portlet_tab"+num+" .swiper-container"));*/
		console.log($("#tab_15_1 .tab-content #portlet_tab"+num+" .swiper-container"));
	}
	
});
function stop(e) {
	if (e.stopPropagation)
	e.stopPropagation();
	else
	e.cancelBubble = true;
}
/*$(document).bind('click',function(e){
	$("#tab_15_1 .nav-tabs li a").css("background","#eee");
		
}); 
$("#tab_15_1 .nav-tabs li a .span").on("click", function(e) {
	stop(e);	
});*/
$("#tab_15_1 .nav-tabs li a .close").on("click", function(e) {
	$(e.target).closest("a").attr("href")
});
	

var opt={
		chart: {
			type: 'bar',
			padding:[-10, 15, 5, 15],
			
		},
		credits: {
	          enabled:false
		},
		exporting: {
		    enabled:false
		},
		title: {
			text: '症状',
			align: 'left' 
		},
		xAxis: {
			categories: ['胸痛', '胸闷', '呼吸困难', '心悸', '晕厥', '头晕', '背痛', '心前区不适', '剑突下不适', '放射痛'],
			lineColor: "#dfdfdf", 
			minorTickColor:"#ff0000",        //没有看出效果
		    minorTickInterval:3,               //副标记的间隔
			title: {
				text: null
			}
		},
		
		 
		yAxis: {
			
			min: 0,
			title: {
				text: '占比（%）',
				align: 'high'
			},
			labels: {
				overflow: 'justify'
			}
		},
		tooltip: {
			valueSuffix: ' %'
		},
		plotOptions: {
			bar: {
				borderWidth: 1,               //柱子边框的大小
	            borderColor: "#78c8f1",           //柱子边框的颜色
	            borderRadius:0,            //柱子两端的圆角的半径
	            color:"rgba(40,125,209,0.7)",
	            pointWidth:6,
				dataLabels: {
					enabled: true
				}
			 
			},
			column: {
				borderWidth: 1,               //柱子边框的大小
	            borderColor: "#78c8f1",           //柱子边框的颜色
	            borderRadius:0,            //柱子两端的圆角的半径
	            color:"rgba(40,125,209,0.7)",
	            pointWidth:6,
				dataLabels: {
					enabled: true
				}
			 
			}
		},
		legend: {
			enabled:false,
			layout: 'vertical',
			align: 'right',
			verticalAlign: 'top',
			x: -40,
			y: 100,
			floating: true,
			borderWidth: 1,
			backgroundColor: ((Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF'),
			shadow: true
		},
		
		series: [{
			name: '占比',
			data: [50.6, 19.3, 10.8, 3.6, 3.6, 3.6, 2.4, 2.4, 2.4, 2.4]
		}, ]
	};
var opt2={
		chart: {
			plotBackgroundColor: null,
			plotBorderWidth: null,
			plotShadow: false,
		   
		},
		credits: {
	          enabled:false
	},
	exporting: {
	    enabled:false
	},
		title: {
			text: '性别分布',
			align:"left"
		},
		tooltip: {
			pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
		},
		plotOptions: {
			pie: {
				allowPointSelect: true,
				cursor: 'pointer',
				dataLabels: {
					   enabled: true,
	                   format: '<b>{point.name}</b>',
	                   style: {
	                       color: '#666666'
	                   }
				},
				showInLegend: false
			}
		},
		series: [{
			type: 'pie',
			name: '占比',
			data: [
				['男', 45.0],
				['女', 26.8]
			],
			colors:["#4fa1dc","#f18f9e","#4fa1dc","#f18f9e","#4fa1dc","#f18f9e","#4fa1dc","#f18f9e","#4fa1dc","#f18f9e"]
		}]
	}
function update_chart_graphics_symptom(info,hitCount,chart){
	var data1 = new Array();
	var data2 = new Array();
	if( info == null || info.length == 0)
	{
		chart.hide();
		return;
	}
	for(var i = 0; i < info.length; i ++){
		var temp_value = Number((info[i]['count']*1.0/hitCount*100).toFixed(1));
		if(i==0){
			data3={y:temp_value,color:"rgba(125,190,86,0.7)",borderColor:"rgba(110,205,153,0.7)"};
			data1.push(data3);
		}else{
			data1.push(temp_value);
		}
		data2.push(info[i]['entityName']);
	};
	opt.chart.type='bar';
	opt.title.text='症状';
	opt.xAxis.categories=data2;
	opt.series[0]={name:'症状',data:data1};
	(info==null||info.length==0)?(chart.hide()):(chart.show());
	chart.highcharts(opt);
};
function update_chart_graphics_drugs(info,hitCount,chart){
	var data1 = new Array();
	var data2 = new Array();
	if( info == null || info.length == 0)
	{
		chart.hide();
		return;
	}
	for(var i = 0; i < info.length; i ++){
		var temp_value = Number((info[i]['count']*1.0/hitCount*100).toFixed(1));
		if(i==0){
			data3={y:temp_value,color:"rgba(125,190,86,0.7)",borderColor:"rgba(110,205,153,0.7)"};
			data1.push(data3);
		}else{
			data1.push(temp_value);
		}
		data2.push(info[i]['entityName']);
	};
	opt.chart.type='column';
	opt.title.text='药品';
	opt.xAxis.categories=data2;
	opt.series[0]={name:'药品',data:data1};
	(info==null||info.length==0)?(chart.hide()):(chart.show());
	chart.highcharts(opt);
};
function upate_chart_graphics_treatment(info,hitCount,chart){
	var data1 = new Array();
	
	if( info == null || info.length == 0)
	{
		chart.hide();
		return;
	}
	for(var i = 0; i < info.length; i ++){
		var temp_value = Number((info[i]['count']*1.0/hitCount*100).toFixed(1));
		
			data3=[info[i]['entityName'], temp_value]
			
			data1.push(data3);
		
		
	};
	opt2.title.text='治疗';
	opt2.series[0].data=data1;
	(info==null||info.length==0)?(chart.hide()):(chart.show());
	chart.highcharts(opt2);
};
$("#chart_btn").live("click",function(){
	var exp=$("#research_group").attr("data-exp");
	$.ajax({
		 url: 'descriptivestatistics',     
		 contentType: 'application/json', 
		 type: 'POST',             
		 data:JSON.stringify({"expressions":exp,"resultField":["病历_基本信息_性别","病历_基本信息_年龄","用药_医嘱用药_药品名称","诊断_诊断_出院诊断","检查_检查_检查项目","病历_主诉_症状"]}),//向服务器端发送的数据 
		 dataType: "json",
		 success:function(data){
			 $(".chart").animate({"width":"0"},10).animate({"width":"100%"},500);
			 update_chart_graphics_symptom(data.topSympton,data.topSympton[0].allCount,$("#chart1"));
			 update_chart_graphics_drugs(data.topDrugs,data.topDrugs[0].allCount,$("#chart3"));
			 upate_chart_graphics_treatment(data.topExamine,data.topExamine[0].allCount,$("#chart2"));
			 chartInit();
		 }
		});
		var str='';
		
		$("#tab_15_1 .nav-tabs>li[data-exp]").each(function(i,item){
			if(!$(item).hasClass("add")){
				var exp=$(item).attr("data-exp");
				var name=$(item).find("a>span").text();
				if(i==0)
				str+='<span class="active" data-exp='+exp+'>'+name+'</span>';
				else
				str+='<span data-exp='+exp+'>'+name+'</span>';
			}
		});
		$("#exp_group").html(str);
	
});
$("#exp_group>span").live("click",function(){
	
	if($("#exp_group>span.active").length<3){
		$(this).toggleClass("active");
	}
	/*var exp=$("#research_group").attr("data-exp");
	$.ajax({
		 url: 'descriptivestatistics',     
		 contentType: 'application/json', 
		 type: 'POST',             
		 data:JSON.stringify({"expressions":exp,"resultField":["病历_基本信息_性别","病历_基本信息_年龄","用药_医嘱用药_药品名称","诊断_诊断_出院诊断","检查_检查_检查项目","病历_主诉_症状"]}),//向服务器端发送的数据 
		 dataType: "json",
		 success:function(data){
			 $(".chart").animate({"width":"0"},10).animate({"width":"100%"},500);
			 update_chart_graphics_symptom(data.topSympton,data.topSympton[0].allCount,$("#chart1"));
			 update_chart_graphics_drugs(data.topDrugs,data.topDrugs[0].allCount,$("#chart3"));
			 upate_chart_graphics_treatment(data.topExamine,data.topExamine[0].allCount,$("#chart2"));
			 chartInit();
		 }
		});
		var str='';
		
		$("#tab_15_1 .nav-tabs>li[data-exp]").each(function(i,item){
			if(!$(item).hasClass("add")){
				var exp=$(item).attr("data-exp");
				var name=$(item).find("a>span").text();
				if(i==0)
				str+='<span class="active" data-exp='+exp+'>'+name+'</span>';
				else
				str+='<span data-exp='+exp+'>'+name+'</span>';
			}
		});
		$("#exp_group").html(str);*/
	
});
})