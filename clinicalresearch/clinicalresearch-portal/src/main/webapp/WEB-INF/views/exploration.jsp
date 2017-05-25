<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>临床研究平台 | 问题挖掘</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<meta content="" name="description"/>
<meta content="" name="author"/>
	<!-- BEGIN GLOBAL MANDATORY STYLES -->
	<link href="fonts/font-awesome/font-awesome.min.css" rel="stylesheet" type="text/css"/>
	<link href="assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
	<link href="assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
	<link href="assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
	<link href="assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css"/>
	<!-- END GLOBAL MANDATORY STYLES -->
	<!-- BEGIN THEME STYLES -->
	<link href="assets/global/css/components-md.css" id="style_components" rel="stylesheet" type="text/css"/>
	<link href="assets/global/css/plugins-md.css" rel="stylesheet" type="text/css"/>
	<link href="assets/admin/layout/css/layout.css" rel="stylesheet" type="text/css"/>
	<link id="style_color" href="assets/admin/layout/css/darkblue.css" rel="stylesheet" type="text/css"/>
	<link href="assets/admin/layout/css/custom.css" rel="stylesheet" type="text/css"/>
	<!-- END THEME STYLES -->
	<!-- BEGIN PAGE LEVEL STYLES -->
	<link rel="stylesheet" type="text/css" href="assets/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css"/>
	<link href="assets/global/plugins/icheck/skins/all.css" rel="stylesheet"/>
	<link rel="stylesheet" type="text/css" href="assets/global/plugins/jstree/dist/themes/default/style.min.css"/>
	<!-- END PAGE LEVEL STYLES -->
	<link href="css/animate.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
	<link rel="stylesheet" type="text/css" href="css/mystyle.css"/>
	<style type="text/css">
	.chartbox{float:left;display:inline-block;}
	.chartbox .config-btn{    
	float: right;
    position: relative;
    right: 10px;
    bottom: -10px;
    margin-bottom: -40px;
    z-index: 999;}
	.settab .fa-close:hover{cursor:pointer;}
	</style>
</head>
<body class="page-md page-header-fixed page-quick-sidebar-over-content">
<div class="clearfix"></div>
<!-- BEGIN CONTAINER -->
<div class="page-container">
	<!-- BEGIN SIDEBAR -->
	<div class="page-sidebar-wrapper">		
			<%@include file="./common/menu.jspf"%>
	</div>
	<!-- END SIDEBAR -->
	<!-- BEGIN CONTENT -->
	<div class="page-content-wrapper">
		<div class="page-content">
			
			<!-- BEGIN PAGE HEADER-->
			<div class="page-bar">
				<ul class="page-breadcrumb">
					<li>
						<i class="myicon pos"></i>
						<a href="<%=request.getContextPath() %>?userId=000001">课题管理</a>
						<i class="fa fa-angle-right"></i>
					</li>
					<li>
						<a href="#">新增课题</a>
						<i class="fa fa-angle-right"></i>
					</li>
					<li>
						<a href="javascript:;">研究对象筛选</a>
					</li>
				</ul>
			    <ul class="pagebar-tool pull-right">
			     <li class="loadbtn"><img alt="下载任务" src="img/export_icon_unload.png"></li>
			    </ul>
			    <div id="export_res" class="pull-right hidden">
			       <ul>
			        <li class="active">
			        	<a>正在导出</a>
			        	<ul id="dcing"></ul>
			        </li>
			        <li class="done">
			        	<a>导出完成</a>
			        	<ul id="dced"></ul>
			        </li>
			       </ul>
			    </div>
			</div>
			<!-- END PAGE HEADER-->
			<div class="container-box" id="exploration" style="padding: 20px 0px;">
				<div class="row">
				   <div class="col-md-12">
				   	<div class="tabbable-line">
								<ul class="nav nav-tabs ">
									<li class="active">
										<a href="#tab_15_1" data-toggle="tab">
										研究对象筛选</a>
									</li>
									<li id="chart_btn">
										<a href="#tab_15_2" data-toggle="tab">
										描述性统计</a>
									</li>
									
								</ul>
								
								<div class="tab-content">
									<div class="tab-pane active" id="tab_15_1">
										<div class="row">
											<div class="col-md-12 ">
												<!-- BEGIN TAB PORTLET-->
					<div class="portlet box grey">
						<div class="portlet-title ">
							
							<ul class="nav nav-tabs">
								<li class="active" id="research_group" data-exp='[[{"field":"病历_基本信息_性别","exp":"不等于","values":["未说明的性别"],"flag":"||","unit":""}]]'>
									<a href="#portlet_tab0" data-toggle="tab" >
									<span >研究组</span><b style="opacity:0.3;">&times;</b> </a>
								</li>
								
								<li class="add">
									<a id="add_group">
									<b class="plus-fa">+</b>添加组 </a>
								</li>
								
							</ul>
						</div>
						
							<div class="tab-content">
								<div class="tab-pane active" id="portlet_tab0">
									<div class="row">
									   <div class="col-md-10 col-md-offset-1">
									     <div class="tab2">
															<div class="row">
																<div class="col-md-12" style="margin-bottom:8px;">
																	<span class="tjbjq">条件编辑器</span>
																</div>
															</div>
															<div class="row well no-border no-margin">
																<div class="col-md-12 col-lg-10 col-lg-offset-1">
																	<div class="center">
																		<label class="control-label col-md-2" style="float:left"><b>条件编辑</b></label>
																		<div class="form-group search-group no-padding search">
																			<input type="text" class="form-control keyinput" placeholder="搜索项" name="search" value="" autocomplete="off" style="width:120px;">
																		</div>

																		<div class="form-group  no-padding">
																			<select class="form-control relationship-select" name="relationship">
																				<option style="color: #b3b3b3" disabled="disabled" selected="selected">关系</option>
																			</select>
																		</div>

																		<div class="form-group input3 no-padding col-md-4">
																			<input type="text" class="form-control input-inline" placeholder="对比值" name="data3">
																		</div>
																		<div class="form-group hidden no-padding col-md-2">
																			<select class="form-control units" name="units">
																				<option>单位</option>
																			</select>
																		</div>
																		<div class=" ensure-group">
																			<button type="button" class="btn green ensure">确定</button>
																		</div>
																	</div>
																</div>
															</div>

															<div class="conditions-group">

																<div class="showbox swiper-container0">
																	<div class="conditions-container-box swiper-wrapper">
																		<div class="conditions-container swiper-slide active">
																			<div>
																				<ol></ol>
																				<div class="bottom-bar"><i class="fa fa-close"></i></div>
																			</div>
																		</div>
																		<div class="conditions-container swiper-slide">
																			<div>
																				<ol></ol>
																				<div class="bottom-bar"><i class="fa fa-close"></i></div>
																			</div>
																		</div>
																		<div class="conditions-container swiper-slide">
																			<div>
																				<ol></ol>
																				<div class="bottom-bar"><i class="fa fa-close"></i></div>
																			</div>
																		</div>
																	</div>

																</div>
															</div>
															<b class="border-common plus-conditions-container">+</b>

															<div class="swiper-button-prev"></div>
															<div class="swiper-button-next"></div>
															<div class="conditions-equation">

																<div class="border-common">
																	<div><span class='equation'>当前公式</span></div>
																	<span class="look-btn"><i class="eg-num">3814</i>例<span>点击查看>></span></span>
																</div>
															</div>
															<div class="row no-padding no-margin">

																<div class="loadbg hidden">
																	<img src="img/loading.gif" class="load2">
																</div>
																<div class="table-scrollable res_tab1 hidden">
																	<table class="table table-striped table-hover table-noborder text-center">
																		
																	</table>
																</div>
															</div>
															
														</div>
									   </div>
									</div>
								</div>
								<div class="tab-pane active" id="portlet_tab1">
									<div class="row">
									   <div class="col-md-10 col-md-offset-1">
									     <div class="tab2">
															<div class="row">
																<div class="col-md-12" style="margin-bottom:8px;">
																	<span class="tjbjq">条件编辑器</span>
																</div>
															</div>
															<div class="row well no-border no-margin">
																<div class="col-md-12 col-lg-10 col-lg-offset-1">
																	<div class="center">
																		<label class="control-label col-md-2" style="float:left"><b>条件编辑</b></label>
																		<div class="form-group search-group no-padding search">
																			<input type="text" class="form-control keyinput" placeholder="搜索项" name="search" value="" autocomplete="off" style="width:120px;">
																		</div>

																		<div class="form-group  no-padding">
																			<select class="form-control relationship-select" name="relationship">
																				<option style="color: #b3b3b3" disabled="disabled" selected="selected">关系</option>
																			</select>
																		</div>

																		<div class="form-group input3 no-padding col-md-4">
																			<input type="text" class="form-control input-inline" placeholder="对比值" name="data3">
																		</div>
																		<div class="form-group hidden no-padding col-md-2">
																			<select class="form-control units" name="units">
																				<option>单位</option>
																			</select>
																		</div>
																		<div class=" ensure-group">
																			<button type="button" class="btn green ensure">确定</button>
																		</div>
																	</div>
																</div>
															</div>

															<div class="conditions-group">

																<div class="showbox swiper-container1">
																	<div class="conditions-container-box swiper-wrapper">
																		<div class="conditions-container swiper-slide active">
																			<div>
																				<ol></ol>
																				<div class="bottom-bar"><i class="fa fa-close"></i></div>
																			</div>
																		</div>
																		<div class="conditions-container swiper-slide">
																			<div>
																				<ol></ol>
																				<div class="bottom-bar"><i class="fa fa-close"></i></div>
																			</div>
																		</div>
																		<div class="conditions-container swiper-slide">
																			<div>
																				<ol></ol>
																				<div class="bottom-bar"><i class="fa fa-close"></i></div>
																			</div>
																		</div>
																	</div>

																</div>
															</div>
															<b class="border-common plus-conditions-container">+</b>

															<div class="swiper-button-prev"></div>
															<div class="swiper-button-next"></div>
															<div class="conditions-equation">

																<div class="border-common">
																	<div><span class='equation'>当前公式</span></div>
																	<span class="look-btn"><i class="eg-num">3814</i>例<span>点击查看>></span></span>
																</div>
															</div>
															<div class="row no-padding no-margin">

																<div class="loadbg hidden">
																	<img src="img/loading.gif" class="load2">
																</div>
																<div class="table-scrollable res_tab1 hidden">
																	<table class="table table-striped table-hover table-noborder text-center">
																		
																	</table>
																</div>
															</div>
															
														</div>
									   </div>
									</div>
								</div>
								
							</div>
						
					</div>
					<!-- END TAB PORTLET-->
				</div>
			</div>
										
									</div>
									<div class="tab-pane" id="tab_15_2">
									<div id="exp_group">
								    <span class="active">研究组1</span>
								    <span>研究组2</span>
								</div>
										<div class="row">
											<div class="col-md-12" style="background: #f8f8f8;height: 12px;margin-bottom: 30px;">
												
											</div>
										</div>
										<div class="row">
											<div class="col-md-12" style="padding:10px 5%;">
												 <div class="chartbox col-md-6">
												 <span class="config-btn"><i class="fa fa-bars"></i></span>
													<div class="chart" id="chart1" ></div>
													
												</div>
												<div class="chartbox col-md-6 hidden">
												 <span class="config-btn"><i class="fa fa-bars"></i></span>
													<div class="chart" id="chart1_1" ></div>
													
												</div>
												 <div class="chartbox col-md-6">
												 <span class="config-btn"><i class="fa fa-bars"></i></span>
													<div class="chart" id="chart2"></div>
													
												</div>
												<div class="chartbox col-md-6 hidden">
												 <span class="config-btn"><i class="fa fa-bars"></i></span>
													<div class="chart" id="chart2_1" ></div>
													
												</div>
												 <div class="chartbox col-md-6">
												 <span class="config-btn"><i class="fa fa-bars"></i></span>
													<div class="chart" id="chart3"></div>
													
												</div>
												<div class="chartbox col-md-6 hidden">
												 <span class="config-btn"><i class="fa fa-bars"></i></span>
													<div class="chart" id="chart3_1" ></div>
													
												</div>
												
												 <div class="chartbox col-md-6">
												 <span class="config-btn"><i class="fa fa-bars"></i></span>
													<div class="chart" id="chart4"></div>
													
												</div>
												<div class="chartbox col-md-6 hidden">
												 <span class="config-btn"><i class="fa fa-bars"></i></span>
													<div class="chart" id="chart4_1" ></div>
													
												</div>
												
												 <div class="chartbox col-md-6">
												 <span class="config-btn"><i class="fa fa-bars"></i></span>
													<div class="chart" id="chart5"></div>
													
												</div>
												<div class="chartbox col-md-6 hidden">
												 <span class="config-btn"><i class="fa fa-bars"></i></span>
													<div class="chart" id="chart5_1" ></div>
													
												</div>
												 <div class="chartbox col-md-6">
												 <span class="config-btn"><i class="fa fa-bars"></i></span>
													<div class="chart" id="chart6"></div>
													
												</div>
												<div class="chartbox col-md-6 hidden">
												 <span class="config-btn"><i class="fa fa-bars"></i></span>
													<div class="chart" id="chart6_1" ></div>
													
												</div>
												<!-- <div class="chart" id="chart1" style="min-width:400px;height:300px;width:50%;"></div>
												<div class="chart" id="chart4" style="min-width:400px;height:300px;width:50%;"></div>
												<div class="chart" id="chart5" style="min-width:400px;height:300px;width:50%;"></div>
												<div class="chart" id="chart6" style="min-width:400px;height:300px;width:50%;"></div> -->
												
											</div>
										</div>
										
									</div>
									
								</div>
							</div>
				   </div>
				</div>
		    </div>
	</div>
	<!-- END CONTENT -->
</div>
<!-- END CONTAINER -->
</div>
	
	<!-- BEGIN FOOTER -->
	<div class="page-footer">
		<div class="page-footer-inner">
			<a href="#" target="_blank"> Copyright &copy; 2016 Goodwill All
				rights reserved.</a>
		</div>
		<div class="scroll-to-top">
			<i class="icon-arrow-up"></i>
		</div>
	</div>
	<!-- END FOOTER -->
	<!--通用指标 开始-->
		<div class="box conditions-box hidden" id="common-cont">
			<div class="caption">
				<span >请输入关键字或拼音搜索</span>
			</div>
			
				<div class="main-row">
					<div class="tabbable-line top-group">
						<ul class="nav nav-tabs top-ul"></ul>
					</div>
					<div class="right-group">
						<div class="tab-content">
							
						</div>
					
				</div>
				
			</div>
		</div>
	<!--通用指标 结束-->									
														
														
<!-- 浮动面板 -->	
<div class="mypanel hidden" style="background:#fff;border:1px #ddd solid;z-index:99990;height:250px;overflow-y:scroll;"></div>
<!-- 设置可切换菜单 -->
<div class="settab hidden" style="border:1px #d5d5d5 solid;position:absolute;top:0px;left:100px;background:#fff;z-index:999999;padding:5px 20px;">
 <span style="float:right;"><i class="fa fa-close"></i></span>
 	<ul class="nav nav-tabs">
		<li class="active">
			<a href="#tab_s_1" data-toggle="tab">相对时间 </a>
		</li>
		<li>
			<a href="#tab_s_2" data-toggle="tab">切换指标 </a>
		</li>
		<li>
			<a href="#tab_s_3" data-toggle="tab">切换图表 </a>
		</li>
		<li>
			<a href="#tab_s_4" data-toggle="tab">图表设置 </a>
		</li>
		
	</ul>
	<div class="tab-content" style="margin-top:5px;">
		<div class="tab-pane fade active in" id="tab_s_1">
			<div class="form-group group-relativeTime clone-group">
										
										<select class="form-control input-xsmall inline">
											<option>手术</option>
											<option>用药</option>
											<option>诊断</option>
											<option>病历</option>
										</select>
										<select class="form-control input-xsmall inline">
											<option value="=">等于</option>
										</select>
										<input type="text" class="form-control input-xsmall inline timedata"  >
										<select class="form-control input-xsmall inline">
											<option>之前</option>
											<option>之后</option>
											<option>当天</option>
										</select>
										<input type="number" class="form-control input-xsmall inline"  >
										<select class="form-control input-xsmall inline">
											<option>天</option>
											<option>月</option>
											<option>年</option>
											<option>时</option>
											<option>分</option>
											<option>秒</option>
										</select>
										
										<select class="form-control input-xsmall inline">
											<option>之内</option>
											<option>之外</option>
										</select>
										
										<!-- <b class="plus-group" title="添加"><i class="fa fa-plus-circle"></i></b>
										<b class="del-this hidden"><i class="fa fa-minus-circle" title="删除"></i></b> -->
										
									</div> 
									<div class="form-group group-relativeTime bottom-btngroup">
										<label>指标次数</label>
										<label><input type="radio" name="times10" class="jcheck" checked="checked"> 全部指标</label>
										<label><input type="radio" name="times10" class="jcheck"> 第一次</label>
										<label><input type="radio" name="times10" class="jcheck"> 最后（最近）一次</label>
									</div>
									<div class="text-right control">
										<span class="btn btn-xs green">确定</span><span class="btn btn-xs">取消</span>
									</div>
		</div>
		<div class="tab-pane fade" id="tab_s_2">
			<form style="height:50px;">
											   			
											   			
											   			<div class="form-group margin-top-10 search-group">
											   				
															<div class="search">
																<input type="text" class="form-control keyinput" placeholder="搜索项" name="search" value="" >
															</div>
														</div>
														<div class="form-group relationship-group">
															  <div class="margin-top-10">
																	<select class="form-control relationship-select" name="relationship">
																		<option style="color: #B3B3B3;">关系</option>
																		
																	</select>
														       </div>
														</div>
														<div class="form-group input3-group">
																		<div class="margin-top-10 input3">
																			<input type="text" class="form-control input-inline" placeholder="对比值" name="data3">
																		</div>
																		<div class="margin-top-10 hidden">
																		<select class="form-control units" name="units"></select>
																		</div>
																		
														</div>
														
													 </form>
											<div style="clear:both;"></div>		 
									<div class="text-right control">
										<span class="btn btn-xs green">确定</span><span class="btn btn-xs">取消</span>
									</div>
											   		</div>
		
		<div class="tab-pane fade" id="tab_s_3">
		
				<ul class="nav nav-tabs tabs-left">
					<li class="active">
						<a href="#tab_c_1" data-toggle="tab">
						<img alt="柱形图" src="img/u1.png"></a>
					</li>
					<li>
						<a href="#tab_c_2" data-toggle="tab">
						<img alt="条形图" src="img/u2.png"></a>
					</li>
					<li>
						<a href="#tab_c_3" data-toggle="tab">
						<img alt="直方图" src="img/u3.png"></a>
					</li>
					<li>
						<a href="#tab_c_4" data-toggle="tab">
						<img alt="箱线图" src="img/u4.png"></a>
					</li>
					<li>
						<a href="#tab_c_5" data-toggle="tab">
						<img alt="扇形图" src="img/u5.png"></a>
					</li>
					<li>
						<a href="#tab_c_6" data-toggle="tab">
						<img alt="散点图" src="img/u6.png"></a>
					</li>
				</ul>
			
				<div class="tab-content">
					<div class="tab-pane active" id="tab_c_1">
						<p>
							 <img src="img/zhuzhuangtu.png">
						</p>
					</div>
					<div class="tab-pane fade" id="tab_c_2">
						<p>
							 <img src="img/tiaoxingtu.png">
						</p>
					</div>
					<div class="tab-pane fade" id="tab_c_3">
						<p>
							<img src="img/zhifangtu.png">
						</p>
					</div>
					<div class="tab-pane fade" id="tab_c_4">
						<p>
							<img src="img/bingtu.png">
						</p>
					</div>
					<div class="tab-pane fade" id="tab_c_5">
						<p>
							<img src="img/xiangxiantu.png">
						</p>
					</div>
					<div class="tab-pane fade" id="tab_c_6">
						<p>
							<img src="img/dain.png">
						</p>
					</div>
				</div>
			<div class="text-right control" style="position: relative;bottom: -200px;">
					<span class="btn btn-xs green">确定</span><span class="btn btn-xs">取消</span>
				</div>

			
		</div>
		<div class="tab-pane fade" id="tab_s_4">
			<form class="form-horizontal" role="form">
				<div class="form-body">
					<div class="form-group">
						<label class="col-md-3 control-label">标题</label>
						<div class="col-md-9">
							<input type="text" class="form-control input-inline input-medium" value="症状">
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3 control-label">X轴</label>
						<div class="col-md-9">
							<input type="text" class="form-control input-inline input-medium" value="数量">
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3 control-label">Y轴</label>
						<div class="col-md-9">
							<div class="checkbox-list">
								<label><input type="checkbox" checked="checked"> 全选</label>
								<label><input type="checkbox" checked="checked"> 胸痛 </label>
								<label><input type="checkbox" checked="checked"> 胸闷 </label>
								<label><input type="checkbox" checked="checked"> 呼吸困难 </label>
								<label><input type="checkbox" checked="checked"> 心悸 </label>
								<label><input type="checkbox" checked="checked"> 晕厥 </label>
								<label><input type="checkbox" checked="checked"> 头晕 </label>
								
							</div>
						</div>
					</div>
				</div>
			</form> 
			<div class="text-right control">
					<span class="btn btn-xs green">确定</span><span class="btn btn-xs">取消</span>
				</div>
		</div>
	</div>
 </div>
 
	

<!-- 浮动面板 end -->		
<!--model-->
<jsp:include page="exportModel.jsp"></jsp:include>
<!--model end-->
<script src="assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<script src="assets/global/scripts/metronic.js" type="text/javascript"></script>
<script src="assets/admin/layout/scripts/layout.js" type="text/javascript"></script>
<script src="assets/admin/layout/scripts/quick-sidebar.js" type="text/javascript"></script>
<script src="assets/admin/layout/scripts/demo.js" type="text/javascript"></script>
<script type="text/javascript" src="js/action.js"></script>
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="assets/global/plugins/jquery-validation/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="assets/global/plugins/bootstrap-wizard/jquery.bootstrap.wizard.min.js"></script>
<script type="text/javascript" src="assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.zh-CN.min.js"></script>
<script type="text/javascript" src="assets/global/plugins/jquery-validation/js/messages_zh.min.js"></script>
<script src="assets/admin/pages/scripts/components-pickers.js"></script>

<script src="assets/global/plugins/bootbox/bootbox.min.js" type="text/javascript"></script>
<script type="text/javascript" src="assets/global/plugins/highcharts/highcharts.js"></script>
<script type="text/javascript" src="assets/global/plugins/highcharts/highcharts-more.js"></script>
<script type="text/javascript" src="assets/global/plugins/highcharts/exporting.js"></script>
<script type="text/javascript" src="assets/global/plugins/highcharts/data.js"></script>
<script src="assets/global/plugins/jquery.pulsate.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/ui/jquery.ui.core.js"></script>
<script src="assets/global/plugins/icheck/icheck.min.js"></script>
	<script src="assets/global/plugins/ui/jquery.ui.widget.js"></script>
	<script src="assets/global/plugins/ui/jquery.ui.mouse.js"></script>
	<script src="assets/global/plugins/ui/jquery.ui.draggable.js"></script>
	<script src="assets/global/plugins/ui/jquery.ui.droppable.js"></script>
	<script src="assets/global/plugins/ui/jquery.ui.sortable.js"></script>
	<script src="assets/admin/pages/scripts/ui-general.js" type="text/javascript"></script>
	<script src="assets/global/plugins/jstree/dist/jstree.min.js"></script>
	<script src="assets/admin/pages/scripts/ui-tree.js"></script>
<script type="text/javascript" src="js/query.js"></script>
<script type="text/javascript" src="js/paging.js"></script>
<script type="text/javascript" src="js/charts1.js"></script>
<script type="text/javascript" src="js/jquery.fly.min.js"></script>
<script src="assets/global/plugins/swiper3/script/swiper-3.4.1.jquery.min.js"></script>
<script src="assets/global/plugins/swiper3/script/swiper.animate1.0.2.min.js"></script>
<script src="assets/global/plugins/bootbox/bootbox.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jq_animateNumber/jquery.animateNumber.min.js"></script>
<script src="assets/global/plugins/jq_animateNumber/jquery.color.min.js"></script>

<!-- END PAGE LEVEL PLUGINS -->
<script src="assets/admin/pages/scripts/form-wizard.js"></script>
<script src="assets/admin/pages/scripts/form-icheck.js"></script>
<script type="text/javascript" src="js/addstudy.js"></script>
<script type="text/javascript" src="js/exploration.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
<script>
	jQuery(document).ready(function() {    
		 $("li[id^='menu_1']").attr("class","start active open");
			Metronic.init(); // init metronic core components
			Layout.init(); // init current layout
			QuickSidebar.init(); // init quick sidebar
			Demo.init(); // init demo features	 
			ComponentsPickers.init();
			FormiCheck.init(); 
			UITree.init();
			$('.pageToolbar2').Paging({pagesize:5,count:85,toolbar:true});
			$('.pageToolbar3').Paging({pagesize:5,count:20,toolbar:true});
			$('.pageToolbar4').Paging({pagesize:5,count:0,toolbar:true});
			$(".conditions-container ol").slimScroll({});
			//控制条件框移动移动
			 var mySwiper0 = new Swiper ('.swiper-container0', {
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
		   	
		   	 var mySwiper1 = new Swiper ('.swiper-container1', {
				 keyboardControl : true,
				 onlyExternal : true,
				    slidesPerView : 3,
				    slidesPerGroup : 1,
				    
				    spaceBetween : 10,
				    // 如果需要分页器
				    pagination: '.swiper-pagination',
				    
				    // 如果需要前进后退按钮
				    nextButton: '.swiper-button-next',
				    prevButton: '.swiper-button-prev',
				    
				    	onInit: function(swiper){
				    		$(swiper).closest(".tab-pane").removeClass("active");
				    	    }
				  });
			 $("#portlet_tab1 .conditionsPage-btn-group").on("click",".prev",function(){
		   			mySwiper1.slidePrev();
		   			
		   		});
		   		$("#portlet_tab1 .conditionsPage-btn-group").on("click",".next",function(){
		   			mySwiper1.slideNext();
		   			
		   		});
		   		$('#portlet_tab1 .plus-conditions-container').click(function(){
		   			mySwiper1.appendSlide('<div class="conditions-container swiper-slide"><div><ol></ol><div class="bottom-bar"><i class="fa fa-close"></i></div></div></div>'); //加到Swiper的最后
		   			mySwiper1.slideTo(mySwiper1.slides.length);
		   		});
		   	//分组框选取
				$(".tab2 .conditions-container").live("click", function(e) {
					if($(e.target).hasClass("fa-close")&&$(e.target).parent().hasClass("bottom-bar")){
						if($(".tab2 .conditions-container").length<2){
							bootbox.setDefaults("locale","zh_CN");
				    		bootbox.alert("系统不支持全部删除");
				    		return false;
						}
						mySwiper.removeSlide($(this).index());
						
						
					}else{
					$(".tab2 .conditions-container").removeClass("active");
					$(this).addClass("active");
					}
				});	
				$(".border-common>div").slimScroll({
					alwaysVisible: "0",
					wheelStep:'38px',
					height:"38px",
				  color:"rgba(0,0,0,0)",
				   width:"90%",
				 
				});
				$("#tab_15_1 .tab-pane").removeClass("active");
				$("#portlet_tab0").addClass("active");
				 $.ajax({
						url: "patientscount",
						contentType: 'application/json',
						type: 'POST',
						
						dataType: "json", //服务器返回数据的类型为json  
						success: function(json) {
							
							count=json.count;
							$(".eg-num").html(json.count);
						},
						 error:function(XMLHttpRequest, textStatus, errorThrown) {
						      $(".eg-num").html("3814");
						       console.log('读取总数错误信息：'+textStatus);
						     }
				 });
	 });
</script>

<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>

