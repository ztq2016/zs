//定义一个Highcharts的变量，初始值为null
var oChart = null;
//定义oChart的布局环境
//布局环境组成：X轴、Y轴、数据显示、图标标题
var oOptions = { 
 //设置图表关联显示块和图形样式
 chart: { 
  renderTo: 'chart-container1', //设置显示的页面块
  //type:'line'    //设置显示的方式
  type: 'column'
 },
 //图标标题
 title: { 
  text: 'p值',
  align:'left',
  style:{color:'#555',fontSize:'13px'}//设置null则不显示标题
 },
 credits: {
          enabled:false
},
 //x轴
 xAxis: {
  title: {
   text: ''
  },
  categories: [] //水平坐标
 },
 //y轴
 yAxis: {
  title: { text:null},
  tickPositions: [0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0]
 },
 exporting: {
            enabled: false
       },
 tooltip: {
        // 边框颜色
    borderRadius: 5,             // 边框圆角
    borderWidth: 1,               // 边框宽度
    shadow: true,                 // 是否显示阴影
    animation: true,               // 是否启用动画效果
    style: {                      // 文字内容相关样式
        color: "#000",
        fontSize: "12px",
        fontWeight: "blod",
        fontFamily: "Courir new"
    },
    Formatter: function() {
    return this;
	}
},
 legend:{
// 	symbolWidth:'42',
    align:'right',
 	verticalAlign:"top",
 	symbolRadius:"0",
 },
 //数据列
 series:[{
            name: 'Sig',
            data: [0.9, 0, 0.42, 0.2, 0.0, 0.16],
            color:'#5B9BD5'

        }]
}; 
$(window).scroll(function(){
	var arr=new Array();
	arr=[];
	$.each($("#tab5 .res-box").eq(0).find("table tbody td[rowspan]"), function(index,td) {
		arr.push(parseFloat($(td).next().next().next().next().html()));
	}); 
	$.each($("#tab5 .res-box").eq(1).find("table tbody td[rowspan]"), function(index,td) {
		arr.push(parseFloat($(td).next().next().next().html()));
	}); 
	$.each($("#tab5 .res-box table tbody td[rowspan]"), function(index,td) {
		oOptions.xAxis.categories[index]=$(td).html();
		oOptions.series[0].data[index]=arr[index];
		
	 });
	 oChart = new Highcharts.Chart(oOptions);
//	if($(this).scrollTop()>=100&&$(this).scrollTop()<=380){
//		$.each($("#tab5 .res-box table tbody td[rowspan]"), function(index,td) {
//		oOptions.xAxis.categories[index]=$(td).html();
//		oOptions.series[0].data[index]=arr[index];
//		
//	 });
//		
// oChart = new Highcharts.Chart(oOptions);
//     }
	});
	

