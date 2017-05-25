<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>临床研究平台 | 首页 </title>
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
<link rel="stylesheet" type="text/css" href="assets/global/plugins/bootstrap-toastr/toastr.min.css"/>
<!-- END THEME STYLES -->
<link href="css/animate.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<link rel="stylesheet" type="text/css" href="css/mystyle.css"/>
<script src="assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
	window.onload=function(){
		  $("li[id^='menu_0']").attr("class","start active open");
		var powertips="${powerTips}";
		if(powertips!=null&&powertips!=""){
			$("#manageMessage").html(powertips);
			$("#mymodal").modal();
		}
		if(document.getElementById("project-sum").innerHTML==0){
			
			$("#noproject").removeClass("hidden");
		}else{
			$("#hasproject").removeClass("hidden");
		}
		
	}
</script>
</head>
<body class="page-md page-header-fixed page-quick-sidebar-over-content" style="overflow-y: scroll;">

<div class="clearfix">
</div>
<!-- BEGIN CONTAINER -->
<div class="page-container">
	<!-- BEGIN SIDEBAR -->
	<div class="page-sidebar-wrapper">
	<%@include file="./common/menu.jspf"%>
	</div>
	<!-- END SIDEBAR -->
	<!-- BEGIN CONTENT -->
	<div class="page-content-wrapper">
		<div class="page-content hidden" id="hasproject">
			
			<!-- BEGIN PAGE HEADER-->
			<div class="page-bar">
				<ul class="page-breadcrumb">
					<li>
						<i class="myicon pos"></i>
						<a href="#">课题管理</a>
						<i class="fa fa-angle-right"></i>
					</li>
					<li>
						<span href="javascript:;" id="toAllPage">所有课题</span>
						
					</li>
					<li id="lastpage">
					    
					</li>
				</ul>
				<div class="page-toolbar">
					<div class="btn-group pull-right">
						<a  href="addstudy" class="btn btn-success" id="addproject" ><span class="md-click-circle md-click-animate"></span><i class="fa fa-plus"></i>创建新课题</a>
					</div>
					<ul class="pagebar-tool pull-right" >
			     <li class="loadbtn" ><img alt="下载任务" src="img/export_icon_unload.png"></li>
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
			</div>
			<!-- END PAGE HEADER-->
			<div class="container-box">
			<!-- BEGIN PAGE CONTENT-->
			<!--四栏导航-->
			<div class="row" id="studytypeList">
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12" >
                        <div class="ibox float-e-margins">
                            <div class="ibox-title border-color-sgreen">
                                <span class="btn-xs btn blue-light pull-right view">查看</span>
                                <h5>非随机对照试验</h5>
                            </div>
                            <div class="ibox-content">
                                <h1 class="no-margins text-blue-light">${typeCount.nrct }</h1>
                                <div class="stat-percent font-bold ">${typeCount.nrctper }% <i class="fa  fa-adjust"></i></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title border-color-blue">
                               <span class="btn-xs btn blue pull-right view" style="background: #89c4f4;">查看</span>
                                <h5>病例对照研究</h5>
                            </div>
                            <div class="ibox-content">
                                <h1 class="no-margins text-navy">${typeCount.ccs }</h1>
                                <div class="stat-percent font-bold ">${typeCount.ccsper }% <i class="fa  fa-adjust"></i>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title border-color-red">
                               <span class="btn-xs btn red pull-right view">查看</span>
                                <h5>横断面调查</h5>
                            </div>
                            <div class="ibox-content">
                                <h1 class="no-margins text-danger">${typeCount.css }</h1>
                                <div class="stat-percent font-bold ">${typeCount.cssper }% <i class="fa  fa-adjust"></i>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title border-color-purple">
                                <span class="btn-xs btn purple pull-right view">查看</span>
                                <h5>回顾性队列研究</h5>
                            </div>
                            <div class="ibox-content">
                                <h1 class="no-margins text-purple">${typeCount.rcs } </h1>
                                <div class="stat-percent font-bold ">${typeCount.rcsper }% <i class="fa  fa-adjust"></i>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                </div>
                <!--四栏导航 end-->
		<!-- 所有项目列表-->
			<div class="row">
                <div class="col-md-12">
                    <div class="wrapper wrapper-content animated fadeInUp">

                        <div class="ibox ">
                        	<!--所有课题列表头-->
                            <div class="ibox-title row" style="border: 0px;margin-bottom: 0;min-height: 30px;padding-bottom: 0px;">
                                <h5 class="col-lg-3 col-md-2 col-sm-2 col-xs-4" id="project-tip">所有项目 <small >总数：</small><i id="project-sum">${allcount }</i></h5>
                                	
                                		
                                	
                                
                                <!--搜索框-->
                                
                                    <div class="col-lg-3 col-md-3  col-sm-4 col-xs-12" style="float: right;">
                                    	
                                        <div class="input-icon input-icon-sm right">
											<i class="fa fa-search" id="search-btn"></i>
											<input type="text" class="form-control input-sm " placeholder="输入课题名称" id="search" name="studysearch">
										</div>
                                    </div>
                                <!--搜索框 end-->
                                <i class="fa fa-refresh" id="refresh-btn"></i>

                            </div>
                            <!--所有课题列表头 end-->
                            <!--所有课题主体-->
                            <div class="ibox-content" id="project-box">
                            <c:forEach items="${studyList }" var="study"  varStatus="status"  >
                            	<!--一项列表-->
                                <div class="project-list">
                                	<!--显示表格基本信息-->
                                	
                                    <table class="table table-hover">
                                        <tbody>
                                        <tr class="expand">
                                        	
                                        	<td class="project-id">
                                        	<input type="hidden" value="${study.studyId }" class="studyid">
                                        	<c:choose>
	                                        	<c:when test="${status.count<10}">
											        0${status.count}
											    </c:when>
											    <c:otherwise>
											        ${status.count}
										        </c:otherwise>
                                        	</c:choose>
                                        	
                                        	</td>
	                                        <td class="project-title">
	                                            <a>${study.studyObjective }</a>
	                                            <br/>
	                                           <small> 创建时间： ${study.startTime }</small>
	                                        </td>
	                                        
                                        
	                                        <td class="project-type">
	                                        	<span>${study.studyType.typename }</span>	
	                                        </td>
	                                        <td class="project-pi">
	                                        	<span>${study.pi }</span>
	                                        </td>
	                                        <td class="project-completion">
	                                                <small> ${study.schedule }</small>
	                                                <div class="progress progress-mini">
	                                                    <div  class="progress-bar"></div>
	                                                </div>
	                                        </td>
	                                       
	                                        <td class="project-actions" data="${study.studyId }">
	                                        	<form action="studyedit" method="POST">
	                                        	   <input type="hidden" name="userId" value="${ userId}" id="userid">
	                                               <input type="hidden" name="studyId" value="${study.studyId }">                                   	
		                                            <a  title="修改" class="edit-btn myicon edit"><i class="myicon edit"></i></a>          
		                                            <a class="lock-btn" title="锁定"><i class="myicon lock"></i></a>
		                                            <a  class="remove-projectlist-btn" title="删除"><i class="myicon trash-o"></i></a>
												</form>
	                                        </td>
                                    	</tr>
                                    </table>
                                    <!--显示表格基本信息 end-->
                                    	
                                    <!--一项列表中的详细信息-->
                                    	<div class="row detail_list" style="display: none;" >
											<div class="col-md-12">
												<table  class="table">
												<tbody>
												
												<tr>
													<td style="width:10%"></td>
													<td style="width:12%;" class="text-right">
														<b> 入排条件</b>
													</td>
													<td style="width:70%">
													<c:if test="${!empty study.inclusionCriteria}">
														 <c:forEach items="${study.inclusionCriteria }" var="inclusionCriteria" varStatus="status">
																${inclusionCriteria.criteriaexpression}
														</c:forEach> 	
													</c:if>
														 
													</td>
													<td style="width:10%"></td>
													
												</tr>
												
												<tr>
													<td></td>
													<td class="text-right">
														 <b>分组信息</b>
													</td>
													<td>
													<c:forEach items="${study.groupInfo }" var="group" varStatus="status">
															${group.groupname }：
														
														<c:choose>
														<c:when test="${empty group.groupnum ||group.groupnum == 'null'}">
														<span class="block-info">0例</span>；
														</c:when>
														<c:otherwise>
														<span class="block-info">${group.groupnum }例</span>；
														</c:otherwise>
														</c:choose>
														</c:forEach>
													</td>
													<td></td>
												</tr>
												<tr>
													<td></td>
													<td class="text-right">
														 <b>统计方法</b>
													</td>
													<td>
													    <c:forEach items="${study.statisticalModel }" var="model" varStatus="status">
															
														<span class="block-info">${model.modelname }；</span>
													</c:forEach>
														
													</td>
													<td></td>
												</tr>
												<tr >
													<td colspan="4" >
													<c:choose>
													  <c:when test="${study.schedule =='已完成'}">
													  <a class="result-btn"> 点击查看研究结果  <i class="fa fa fa-angle-double-right"></i></a>
													  </c:when>
													  <c:otherwise>
													  <a class="result-btn hidden"> 点击查看研究结果  <i class="fa fa fa-angle-double-right"></i></a>
													  </c:otherwise>
													</c:choose>
														
													</td>
													
													
												</tr>
												</tbody>
												</table>
												<div class="packup-btn">
		                                    	点击收起  <i class="fa fa-caret-up"></i>
		                                    </div>
											</div>
											 
										</div>
                                    <!--一项列表中的详细信息结束-->
                                   
		                       </div>
		                       <!--一项结束-->
		                       </c:forEach>
		                     
		                       
						</div>
						<!-- 所有课题主题部分结束 -->
						<!--分页 开始-->
						<div id="pageToolbar0" data-currentPage="${page.currentPage}" data-pageCount="${allcount }"></div>
						<%-- <div class="dataTables_paginate paging_simple_numbers" id="sample_6_paginate">
							<ul class="pagination">
								     <li class="paginate_button previous disabled" aria-controls="sample_6" tabindex="0" id="sample_6_previous">
										<span><i class="fa fa-angle-left"></i></span>
									</li> 
							
					             <c:choose>
							   <c:when test="${page.pageCount>5}">   
							    <c:forEach var="i" begin="1" end="3">  
									 <c:choose>
									   <c:when test="${page.currentPage==i }">   
										     <li class="paginate_button active" aria-controls="sample_6" tabindex="0">
							                     <span>${i }</span>  
							         		 </li>
										</c:when>  
										<c:otherwise> 
										<li class="paginate_button" aria-controls="sample_6" tabindex="0">
												<span>${i }</span>
											</li>
										</c:otherwise>	  
									</c:choose>
							      </c:forEach>
								     <li class="paginate_button" aria-controls="sample_6" tabindex="0">
					                     <span>...</span>  
					         		 </li>
					         		 <li class="paginate_button" aria-controls="sample_6" tabindex="0">
					                     <span>${page.pageCount}</span>  
					         		 </li>
								</c:when>  
								<c:otherwise>
								  <c:forEach var="i" begin="1" end="${page.pageCount}">  
									 <c:choose>
									   <c:when test="${page.currentPage==i }">   
										     <li class="paginate_button active" aria-controls="sample_6" tabindex="0">
							                     <span>${i }</span>  
							         		 </li>
										</c:when>  
										<c:otherwise> 
										<li class="paginate_button" aria-controls="sample_6" tabindex="0">
												<span>${i }</span>
											</li>
										</c:otherwise>	  
									</c:choose>
							      </c:forEach>
								</c:otherwise>  
							</c:choose>
										<li class="paginate_button next" aria-controls="sample_6" tabindex="0" id="sample_6_next">
											<span><i class="fa fa-angle-right"></i></span>
										</li>
								<li><input type="number" value="1" id="toPage" name="toPage" autocomplete="off">页 <b class="jumpbtn">  跳转</b></li>
								
							</ul>
						</div> --%>
						<!--分页结束-->
					</div>
					<!--所有课题结束-->
			</div>
			</div>
			</div>
			<!-- END PAGE CONTENT-->
			</div>
			
		</div>
		
		<div class="page-content hidden" id="noproject">
			<a href="addstudy">
				<img src="img/noproject_main.png" alt="" /><br/>
				<img src="img/noproject_btn.png" alt="" />
			</a>
			
		</div>
	</div>
	<!-- END CONTENT -->
	
</div>
<!-- END CONTAINER -->
<!-- BEGIN FOOTER -->
<div class="page-footer">
	<div class="page-footer-inner">
		 <a href="#" target="_blank"> Copyright &copy; 2016 Goodwill All rights reserved.</a>
	</div>
	<div class="scroll-to-top">
		<i class="icon-arrow-up"></i>
	</div>
</div>
<!-- 模态弹出窗 -->
<div class="modal fade"  id="mymodal" >
    <div class="modal-dialog" >
      <div class="modal-content" style="width:300px;margin:auto;margin-top: 200px;">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title">操作提醒</h4>
            </div>
            <div class="modal-body">
                <p id="manageMessage"></p>
            </div>
            <div class="modal-footer" style="height:60px;">
                <button type="button" class="btn btn-primary" data-dismiss="modal" style="margin-top: 0px;">确定</button>
            </div>
        </div>
    </div>
</div>
<!-- END FOOTER -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="assets/global/plugins/respond.min.js"></script>
<script src="assets/global/plugins/excanvas.min.js"></script> 
<![endif]-->

<script src="assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
<!-- IMPORTANT! Load jquery-ui.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
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
<script src="assets/global/plugins/bootstrap-toastr/toastr.min.js"></script>
<script src="assets/admin/pages/scripts/ui-toastr.js"></script>
<script type="text/javascript" src="js/action.js"></script>
<script type="text/javascript" src="js/index.js"></script>
<script type="text/javascript" src="js/addstudy.js"></script>
<script type="text/javascript" src="js/query.js"></script>
<script type="text/javascript" src="js/paging.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
<script src="assets/global/plugins/bootbox/bootbox.min.js" type="text/javascript"></script>
<script>
jQuery(document).ready(function() {    
 Metronic.init(); // init metronic core components
Layout.init(); // init current layout
QuickSidebar.init(); // init quick sidebar
Demo.init(); // init demo features 
UIToastr.init();
		

		        
      });
   </script>
<!-- END JAVASCRIPTS -->

</body>
<!-- END BODY -->
</html>