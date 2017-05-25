<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<c:choose>
			<c:when test="${studyInfo.studyId == ''||studyInfo.studyId ==null}">
				<title>临床研究平台 | 新增课题 </title>
			</c:when>
			<c:otherwise>
				<title>临床研究平台 | 修改课题 </title>
			</c:otherwise>
		</c:choose>

		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta content="width=device-width, initial-scale=1.0" name="viewport" />
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<meta content="" name="description" />
		<meta content="" name="author" />
		<!-- BEGIN GLOBAL MANDATORY STYLES -->
		<link href="fonts/font-awesome/font-awesome.min.css" rel="stylesheet" type="text/css" />
		<link href="assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
		<link href="assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
		<link href="assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
		<link href="assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />
		<!-- END GLOBAL MANDATORY STYLES -->
		<!-- BEGIN THEME STYLES -->
		<link href="assets/global/css/components-md.css" id="style_components" rel="stylesheet" type="text/css" />
		<link href="assets/global/css/plugins-md.css" rel="stylesheet" type="text/css" />
		<link href="assets/admin/layout/css/layout.css" rel="stylesheet" type="text/css" />
		<link id="style_color" href="assets/admin/layout/css/darkblue.css" rel="stylesheet" type="text/css" />
		<link href="assets/admin/layout/css/custom.css" rel="stylesheet" type="text/css" />
		<!-- END THEME STYLES -->
		<!-- BEGIN PAGE LEVEL STYLES -->
		<link rel="stylesheet" type="text/css" href="assets/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css" />
		<link rel="stylesheet" type="text/css" href="assets/global/plugins/swiper3/css/swiper-3.4.1.min.css" />
		<link rel="stylesheet" type="text/css" href="assets/global/plugins/swiper3/css/animate.min.css" />
		<link href="assets/global/plugins/icheck/skins/all.css" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="assets/global/plugins/jstree/dist/themes/default/style.min.css" />
		<!-- END PAGE LEVEL STYLES -->
		<link href="css/animate.css" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/mystyle.css" />
	</head>

	<body class="page-md page-header-fixed page-quick-sidebar-over-content">
		<div class="clearfix"></div>
		<!-- BEGIN CONTAINER -->
		<div class="page-container">
			<!-- BEGIN SIDEBAR -->
			<div class="page-sidebar-wrapper">
				<div class="page-sidebar navbar-collapse collapse">
					<ul class="page-sidebar-menu page-sidebar-menu-light " data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
						<li class="sidebar-toggler-wrapper">
							<div class="logo">
								<img src="img/logo.png" class="iconlogo" />

							</div>
							<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
							<div class="sidebar-toggler">
							</div>
						</li>
						<li class="sidebar-user-wrapper noshow">
							<img src="img/user.png" alt="用户头像" class="userinfo-btn" />

							<b class="uname userinfo-btn">${user.realname }</b>
							<i class="fa fa-caret-down userinfo-btn"></i><br>
							<span class="userinfo-arrow"></span>
							<ul class="userinfo hidden">
								<li>
									<a href="page_user">个人信息 </a>
								</li>
								<li>
									<a href="page_help" name="help" id="help"> 帮助 </a>
									<span class="label label-success label-sm" style="float: right;">help </span>
								</li>

								<li class="exit-li">
									<a href="login"> 退出登录 </a>
								</li>
							</ul>
							<span id="qx" class="userinfo-btn">管理员</span><span class="noshow">，欢迎您！</span>
						</li>
						<li class="start active open">
							<a href="<%=request.getContextPath() %>/index"><i class="myicon home"></i><span class="title">课题管理</span>
							</a>
						</li>
						<li>
							<a href="exploration"><i class="myicon rocket"></i><span class="title">问题挖掘</span>
							</a>
						</li>
						<li>
							<a target="_blank"><i class="myicon gears"></i><span class="title">系统设置 </span>
							</a>
						</li>
					</ul>
					<!-- END SIDEBAR MENU -->
				</div>
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
								<a href="<%=request.getContextPath() %>?userId=${userId}">课题管理</a>
								<i class="fa fa-angle-right"></i>
							</li>
							<li>
								<a href="#">新增课题</a>
								<i class="fa fa-angle-right"></i>
							</li>
							<li>
								<a href="javascript:;">基本信息配置</a>
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
					<div class="container-box">
						<div id="shadediv" class="hidden"></div>
						<div id="blankdiv" class="hidden"></div>
						<img src="img/helper.png" class="helpimg" id="helper" />
						<!-- BEGIN PAGE CONTENT-->
						<div class="row">
							<div class="col-md-10 col-md-offset-1 col-sm-12" style="min-width:766px;">
								<div id="form_wizard_1">
									<div class=" form">
										<form action="#" class="form-horizontal" id="submit_form" method="POST">
											<input type="hidden" value="" name="studyId" id="studyid">
											<input type="hidden" value="${userId }" name="userId" id="userId">
											<div class="form-wizard">
												<div class="form-body">
													<ul class="nav nav-pills nav-justified steps">
														<li>
															<a href="#tab1" data-toggle="tab" class="step">
																<span class="number">
												1 </span>
																<span class="desc">
												<i class="fa fa-check"></i>基本信息配置 </span>
															</a>
														</li>
														<li>
															<a href="#tab2" data-toggle="tab" class="step">
																<span class="number">
												2 </span>
																<span class="desc">
												<i class="fa fa-check"></i> 研究对象筛选 </span>
															</a>
														</li>
														<li>
															<a href="#tab3" data-toggle="tab" class="step active">
																<span class="number">
												3 </span>
																<span class="desc">
												<i class="fa fa-check"></i> 研究对象分组 </span>
															</a>
														</li>
														<li>
															<a href="#tab4" data-toggle="tab" class="step active">
																<span class="number">
												4 </span>
																<span class="desc">
												<i class="fa fa-check"></i> 统计学处理</span>
															</a>
														</li>
														<li>
															<a href="#tab5" data-toggle="tab" class="step">
																<span class="number">
												5 </span>
																<span class="desc">
												<i class="fa fa-check"></i> 生成研究报告 </span>
															</a>
														</li>
													</ul>
													<div id="bar" class="progress progress-striped" role="progressbar">
														<div class="progress-bar progress-bar" style="background-color: #8a95a8;"></div>
													</div>
													<!--tab-content start -->
													<div class="tab-content">
														<div class="tab-pane active" id="tab1">

															<div class="form-group ">
																<label class="control-label col-md-3">研究目的 <span class="required">* </span></label>
																<div class="col-md-4">
																	<c:choose>
																		<c:when test="${studyInfo.studyObjective == ''||studyInfo.studyObjective == null}">
																			<input type="text" class="form-control" name="username" value="中国不同性别急性心肌梗死患者临床症状及诱发因素的差异分析 " title="中国不同性别急性心肌梗死患者临床症状及诱发因素的差异分析" />
																		</c:when>
																		<c:otherwise>
																			<input type="text" class="form-control" name="username" value="${studyInfo.studyObjective}" title="${studyInfo.studyObjective}" />
																		</c:otherwise>
																	</c:choose>

																</div>
															</div>

															<div class="form-group form-md-radios">
																<label class="control-label col-md-3">研究类型 <span class="required">
																						* </span>
																						</label>
																<div class="md-radio-list col-md-3">
																	<c:choose>
																		<c:when test="${studyInfo.studyType.typename == ''||studyInfo.studyType.typename ==null}">
																			<c:forEach items="${studyType }" var="studyType" varStatus="c">
																				<div class="md-radio">

																					<c:choose>
																						<c:when test="${c.count == 1 }">
																							<input type="radio" id="radio${c.count }" name="typename" value="${studyType.typeid }" class="md-radiobtn" checked="checked">
																						</c:when>
																						<c:otherwise>
																							<input type="radio" id="radio${c.count }" name="typename" value="${studyType.typeid }" class="md-radiobtn">
																						</c:otherwise>
																					</c:choose>
																					<label for="radio${c.count }">
																												<span></span> <span class="check"></span>
																												<span class="box"></span> ${studyType.typename } 
																											</label>
																				</div>
																			</c:forEach>
																		</c:when>
																		<c:otherwise>
																			<c:forEach items="${studyTypeAll }" var="studyType" varStatus="c">
																				<c:choose>
																					<c:when test="${studyType.typeid ==studyInfo.studyType.typeid }">
																						<div class="md-radio">
																							<input type="radio" id="radio${c.count }" name="typename" value="${studyType.typeid }" class="md-radiobtn" checked="checked">
																							<label for="radio${c.count }">
																												<span></span> <span class="check"></span>
																												<span class="box"></span> ${studyType.typename } 
																											</label>
																						</div>
																					</c:when>
																					<c:otherwise>
																						<div class="md-radio">
																							<input type="radio" id="radio${c.count }" name="typename" value="${studyType.typeid }" class="md-radiobtn">

																							<label for="radio${c.count }">
																												<span></span> <span class="check"></span>
																												<span class="box"></span> ${studyType.typename } 
																											</label>
																						</div>
																					</c:otherwise>
																				</c:choose>

																			</c:forEach>
																		</c:otherwise>
																	</c:choose>

																</div>
															</div>

															<div class="form-group">
																<label class="control-label col-md-3">课题PI <span
																							class="required" aria-required="true"> * </span>
																						</label>
																<div class="col-md-4">
																	<select class="form-control" name="selectProjectPI">
																		<c:choose>
																			<c:when test="${studyInfo.pi == ''||studyInfo.pi==null}">
																				<option value="">选择课题PI</option>
																				<c:forEach items="${usersList }" var="uList">
																					<option value="${uList.username }">${uList.username }</option>
																				</c:forEach>
																			</c:when>
																			<c:otherwise>
																				<option value="${studyInfo.pi}" selected="selected">${studyInfo.pi}</option>
																				<c:forEach items="${allUser }" var="uList">
																					<option value="${uList.userid }">${uList.username }</option>
																				</c:forEach>
																			</c:otherwise>
																		</c:choose>

																	</select>
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">课题开始时间 <span class="required"> * </span></label>
																<div class="col-md-4">
																	<c:choose>
																		<c:when test="${studyInfo.startTime == ''}">
																			<div class="input-group date-picker input-daterange" data-date="2017-01-01" data-date-format="yyyy-mm-dd">
																				<input type="text" class="form-control" name="fromtime">
																			</div>
																		</c:when>
																		<c:otherwise>
																			<div class="input-group date-picker input-daterange" data-date="2017-01-01" data-date-format="yyyy-mm-dd">
																				<input type="text" class="form-control" name="fromtime" value="${studyInfo.startTime }">
																			</div>
																		</c:otherwise>
																	</c:choose>

																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">课题结束时间 </label>
																<div class="col-md-4">
																	<div class="input-group date-picker input-daterange" data-date="2017-01-01" data-date-format="yyyy-mm-dd">
																		<input type="text" class="form-control" name="totime" id="totime">
																	</div>
																</div>
															</div>
															<div class="form-actions">
																<div class="row">
																	<div class="col-md-offset-4 col-md-9">
																		<button type="button" class="btn blue button-next" id="tabone-btn">
																								下一步 <i class="m-icon-swapright m-icon-white"></i>
																							</button>

																	</div>
																</div>
															</div>

														</div>

														<div class="tab-pane tab2" id="tab2">
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

																<div class="showbox swiper-container">
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
															<div class="form-actions">
																<div class="row">
																	<div class="col-md-offset-4 col-md-9">
																		<a href="javascript:;" class="btn default button-previous">
																			<i class="m-icon-swapleft"></i> 上一步
																		</a>
																		<button type="button" class="btn blue button-next" id="tabtwo-btn">
																		下一步 <i class="m-icon-swapright m-icon-white"></i>
																	</button>
																	</div>
																</div>

															</div>
														</div>
														<!-- 研究对象分组 -->
														<div class="tab-pane" id="tab3">
															<div class="well  no-border no-margin">

																<div class="row">
																	<div class="col-md-4"><b>组别</b></div>
																	<div class="col-md-8"><b>水平</b></div>
																</div>
																<div class="scroll">
																	<div class="group-box">
																		<div class="row big-group">
																			<div class="name-group">
																				<input type="text" class="group-name" value="A组" name="group-name">

																			</div>
																			<div class="col-md-8 no-padding">

																				<div class="form-group margin-top-10 search-group">

																					<div class="search">
																						<input type="text" class="form-control keyinput" placeholder="搜索项" name="search" value="">
																					</div>
																				</div>
																				<div class="form-group relationship-group">
																					<div class="margin-top-10">
																						<select class="form-control relationship-select" name="relationship">
																							<option style="color: #B3B3B3;" disabled="disabled" selected="selected">关系</option>

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
																				<div class="no-padding big btn-group">
																					<b class="plus-group" title="添加分组"><i class="fa fa-plus-circle"></i></b>
																				</div>

																			</div>
																			<div class="md2 no-padding">
																				<div class="btn-group">
																					<b class="plus-children" title="添加子分组"><i class="fa fa-plus"></i>  添加亚组</b>
																				</div>
																			</div>
																		</div>
																	</div>
																	<div class="group-box">
																		<div class="row big-group other">
																			<div class="name-group">
																				<span class="group-name" contenteditable="true" style="border-left: 1px #ddd solid;">其他</span>

																			</div>
																			<div class="col-md-8 no-padding">

																				<div class="form-group margin-top-10 other-group" style="margin-top: 12px;">

																					<div>
																						<input type="text" class="form-control" placeholder="正常分组外剩余样本" name="search" value="" autocomplete="off">
																					</div>
																				</div>
																			</div>
																			<div class="md2 no-padding">
																				<div class="btn-group">
																					<b class="plus-children" title="添加子分组"><i class="fa fa-plus"></i>  添加亚组</b>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
															<div class="row resure-group no-padding text-right hidden">

																<div class="resure-btn col-md-12 no-padding"><button type="button" class="btn green btn-sm"> 确定分组 </button></div>
															</div>

															<div class="no-action ">
																<img src="img/no_table.png" alt="没有操作" />
																<img src="img/loading.gif" alt="loading" class="hidden" />
															</div>
															<div class="result-tab hidden">
																<div class="num-info"><span>总样本</span><i id="sum">1093</i></div>
																<div class="tabbable-line">
																	<ul class="nav nav-tabs " id="group_ul">
																		<li class="active">
																			<a>A组（<span>282</span>例）</a>
																		</li>
																		<li>
																			<a>其他（<span>811</span>例）</a>
																		</li>
																	</ul>

																	<div class="tab-content result-tab-content">
																		<div class="tab-pane active">
																			<div class="row no-padding no-margin">
																				<div class="result-info">
																					<div class="set-eg"><span>设置样本量</span><input name="set-eg-input" class="set-eg-input" type="number">例</div>
																				</div>
																				<div class="table-scrollable">
																					<table class="table table-striped table-hover table-noborder text-center bigG">
																						<tbody>
																							<tr>
																								<th>序号</th>
																								<th>性别</th>
																								<th>年龄</th>
																								<th>诊断</th>
																								<th>就诊次数</th>
																								<th>操作</th>
																							</tr>
																							<tr>
																								<td>1</td>
																								<td>女</td>
																								<td>79</td>
																								<td class="text-left" title="肺部感染 冠状动脉性心脏病 陈旧性心肌梗死 心功能Ⅱ级(NYHA分级) 高血压3级 高脂血症 冠状动脉支架植入术后状态 胆囊术后">肺部感染 冠状动脉性心脏病 陈旧性心肌梗死 心功能Ⅱ级(NYHA分级) 高血压3...</td>
																								<td>0</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>2</td>
																								<td>女</td>
																								<td>89</td>
																								<td class="text-left" title="脑梗死后遗症 甲状腺囊肿 急性非ST段抬高型心肌梗死 急性心力衰竭 阵发性心房颤动 肺源性心脏病 肺部感染 慢性呼吸衰竭 高血压3级 高脂血症">脑梗死后遗症 甲状腺囊肿 急性非ST段抬高型心肌梗死 急性心力衰竭 阵发性心房颤...</td>
																								<td>0</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>3</td>
																								<td>女</td>
																								<td>78</td>
																								<td class="text-left" title="下肢静脉血栓形成 具有心脏起搏器状态 急性心力衰竭 慢性心力衰竭 心房颤动[心房纤颤] 心功能IV级(NYHA分级) 冠状动脉性心脏病 陈旧性心肌梗死 上消化道出血 高血压1级 2型糖尿病">下肢静脉血栓形成 具有心脏起搏器状态 急性心力衰竭 慢性心力衰竭 心房颤动[心房...</td>
																								<td>6</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>4</td>
																								<td>女</td>
																								<td>78</td>
																								<td class="text-left" title="慢性牙周炎 永久性心房颤动 慢性心力衰竭 心功能III级(NYHA分级) 冠状动脉性心脏病 陈旧性心肌梗死 高血压1级 2型糖尿病 具有心脏起搏器状态 颈动脉硬化">慢性牙周炎 永久性心房颤动 慢性心力衰竭 心功能III级(NYHA分级) 冠状动...</td>
																								<td>6</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>5</td>
																								<td>女</td>
																								<td>78</td>
																								<td class="text-left" title="高尿酸血症 消化性溃疡 慢性肾小球肾炎 腰椎间盘突出 颈椎病 青光眼 冠状动脉粥样硬化性心脏病 陈旧性心肌梗死 心功能Ⅱ级(NYHA分级) 泌尿系感染 慢性心力衰竭 高血压3级 2型糖尿病 高脂血症 低钾血症">高尿酸血症 消化性溃疡 慢性肾小球肾炎 腰椎间盘突出 颈椎病 青光眼 冠状动脉粥...</td>
																								<td>0</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>6</td>
																								<td>女</td>
																								<td>61</td>
																								<td class="text-left" title="undefined"></td>
																								<td>0</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>7</td>
																								<td>女</td>
																								<td>77</td>
																								<td class="text-left" title="泌尿系感染 急性下壁正后壁心肌梗死 冠状动脉性心脏病 陈旧性下壁后壁心肌梗死 心功能Ⅱ级(NYHA分级) 高血压1级 高脂血症 冠状动脉支架植入术后状态 婴儿贫血">泌尿系感染 急性下壁正后壁心肌梗死 冠状动脉性心脏病 陈旧性下壁后壁心肌梗死 心...</td>
																								<td>0</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>8</td>
																								<td>女</td>
																								<td>77</td>
																								<td class="text-left" title="高血压3级 2型糖尿病 高脂血症 脑梗死后遗症 脂肪肝 慢性肾炎 腰椎间盘突出 颈椎病 青光眼 急性心力衰竭 慢性心力衰竭 冠状动脉性心脏病 陈旧性后壁心肌梗死 陈旧性下壁高侧壁心肌梗死 心脏扩大 阵发性心房颤动 心功能III级(NYHA分级) 冠状动脉支架植入术后状态">高血压3级 2型糖尿病 高脂血症 脑梗死后遗症 脂肪肝 慢性肾炎 腰椎间盘突出 ...</td>
																								<td>0</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>9</td>
																								<td>女</td>
																								<td>55</td>
																								<td class="text-left" title="不稳定性心绞痛 冠状动脉性心脏病 陈旧性下壁心肌梗死 心功能I级(NYHA分级) 高血压3级">不稳定性心绞痛 冠状动脉性心脏病 陈旧性下壁心肌梗死 心功能I级(NYHA分级)...</td>
																								<td>0</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>10</td>
																								<td>女</td>
																								<td>75</td>
																								<td class="text-left" title="急性前壁心肌梗死 冠状动脉粥样硬化性心脏病 心功能Ⅱ级(NYHA分级) 高血压3级 高脂血症 2型糖尿病 肺部感染 婴儿贫血">急性前壁心肌梗死 冠状动脉粥样硬化性心脏病 心功能Ⅱ级(NYHA分级) 高血压3...</td>
																								<td>0</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td colspan="6">
																									<div class="page pageToolbarA_0">
																										<div id="Paging_05610684929022149" class="ui-paging-container">
																											<ul>
																												<li class="js-page-first js-page-action ui-pager ui-pager-disabled">首页</li>
																												<li class="js-page-prev js-page-action ui-pager ui-pager-disabled">上一页</li>
																												<li data-page="1" class="ui-pager focus">1</li>
																												<li data-page="2" class="ui-pager">2</li>
																												<li data-page="3" class="ui-pager">3</li>
																												<li class="ui-paging-ellipse">...</li>
																												<li data-page="17" class="ui-pager">17</li>
																												<li class="js-page-next js-page-action ui-pager">下一页</li>
																												<li class="js-page-last js-page-action ui-pager">末页</li>
																												<li class="ui-paging-toolbar">
																													<select class="ui-select-pagesize">
																														<option value="5">5条/页</option>
																														<option value="10">10条/页</option>
																														<option value="15">15条/页</option>
																														<option value="20">20条/页</option>
																													</select><input class="ui-paging-count" type="text">
																													<a href="javascript:void(0)">跳转</a>
																												</li>
																											</ul>
																										</div>
																									</div>
																								</td>
																							</tr>
																						</tbody>
																					</table>
																				</div>
																			</div>
																		</div>
																		<div class="tab-pane">
																			<div class="row no-padding no-margin">
																				<div class="result-info">
																					<div class="set-eg"><span>设置样本量</span><input name="set-eg-input" class="set-eg-input" type="number">例</div>
																				</div>
																				<div class="table-scrollable">
																					<table class="table table-striped table-hover table-noborder text-center bigG">
																						<tbody>
																							<tr>
																								<th>序号</th>
																								<th>性别</th>
																								<th>年龄</th>
																								<th>诊断</th>
																								<th>就诊次数</th>
																								<th>操作</th>
																							</tr>
																							<tr>
																								<td>1</td>
																								<td>男</td>
																								<td>43</td>
																								<td class="text-left" title="急性非ST段抬高型心肌梗死 冠状动脉性心脏病 心功能I级(NYHA分级) 高血压3级 2型糖尿病 高脂血症">急性非ST段抬高型心肌梗死 冠状动脉性心脏病 心功能I级(NYHA分级) 高血压...</td>
																								<td>2</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>2</td>
																								<td>男</td>
																								<td>58</td>
																								<td class="text-left" title="急性下壁心肌梗死 冠状动脉性心脏病 KillipIII级 冠状动脉支架植入术后状态 2型糖尿病 高血压2级">急性下壁心肌梗死 冠状动脉性心脏病 KillipIII级 冠状动脉支架植入术后状...</td>
																								<td>1</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>3</td>
																								<td>男</td>
																								<td>74</td>
																								<td class="text-left" title="急性心力衰竭 慢性心力衰竭 直背综合征 阵发性心房颤动 心功能Ⅱ级(NYHA分级) 陈旧性肺结核 缺铁性贫血 甲状腺功能减退">急性心力衰竭 慢性心力衰竭 直背综合征 阵发性心房颤动 心功能Ⅱ级(NYHA分级...</td>
																								<td>1</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>4</td>
																								<td>男</td>
																								<td>66</td>
																								<td class="text-left" title="急性广泛前壁心肌梗死 冠状动脉粥样硬化性心脏病 室性期前收缩 心功能Ⅱ级(NYHA分级) 高血压1级 慢性萎缩性胃炎">急性广泛前壁心肌梗死 冠状动脉粥样硬化性心脏病 室性期前收缩 心功能Ⅱ级(NYH...</td>
																								<td>1</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>5</td>
																								<td>男</td>
																								<td>38</td>
																								<td class="text-left" title="急性高侧壁正后壁心肌梗死 冠状动脉性心脏病 室性期前收缩 KillipI级 2型糖尿病 高脂血症 慢性牙周炎 牙周脓肿">急性高侧壁正后壁心肌梗死 冠状动脉性心脏病 室性期前收缩 KillipI级 2型...</td>
																								<td>1</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>6</td>
																								<td>男</td>
																								<td>67</td>
																								<td class="text-left" title="急性广泛前壁高侧壁心肌梗死 冠状动脉粥样硬化性心脏病 窦性心动过速 心功能I级(NYHA分级) 2型糖尿病 桡动静脉瘘">急性广泛前壁高侧壁心肌梗死 冠状动脉粥样硬化性心脏病 窦性心动过速 心功能I级(...</td>
																								<td>1</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>7</td>
																								<td>男</td>
																								<td>90</td>
																								<td class="text-left" title="急性非ST段抬高型心肌梗死 冠状动脉性心脏病 心功能Ⅱ级(NYHA分级) 高血压3级 2型糖尿病 高脂血症 肺部感染 龈炎">急性非ST段抬高型心肌梗死 冠状动脉性心脏病 心功能Ⅱ级(NYHA分级) 高血压...</td>
																								<td>0</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>8</td>
																								<td>男</td>
																								<td>82</td>
																								<td class="text-left" title="高钠血症 低钾血症 具有心脏起搏器状态 急性非ST段抬高型心肌梗死 慢性心力衰竭 室性心动过速 心室颤动 心房扑动 高血压3级 2型糖尿病 陈旧性下壁后壁心肌梗死 脑梗死后遗症">高钠血症 低钾血症 具有心脏起搏器状态 急性非ST段抬高型心肌梗死 慢性心力衰竭...</td>
																								<td>0</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>9</td>
																								<td>男</td>
																								<td>83</td>
																								<td class="text-left" title="心脏扩大 心功能IV级(NYHA分级) 高血压3级 高脂血症 慢性支气管炎 骨折术后 急性心力衰竭 慢性心力衰竭 重症肺炎 多脏器功能衰竭 急性肾衰竭 冠状动脉性心脏病 陈旧性心肌梗死 主动脉冠状动脉搭桥术后状态 阵发性心房颤动">心脏扩大 心功能IV级(NYHA分级) 高血压3级 高脂血症 慢性支气管炎 骨折...</td>
																								<td>0</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td>10</td>
																								<td>男</td>
																								<td>63</td>
																								<td class="text-left" title="急性心力衰竭 冠状动脉性心脏病 陈旧性心肌梗死 心功能III级(NYHA分级) 高血压3级 2型糖尿病 脑梗死后遗症">急性心力衰竭 冠状动脉性心脏病 陈旧性心肌梗死 心功能III级(NYHA分级) ...</td>
																								<td>0</td>
																								<td><i class="fa fa-trash-o"></i></td>
																							</tr>
																							<tr>
																								<td colspan="6">
																									<div class="page pageToolbarB_0">
																										<div id="Paging_0568404509507731" class="ui-paging-container">
																											<ul>
																												<li class="js-page-first js-page-action ui-pager ui-pager-disabled">首页</li>
																												<li class="js-page-prev js-page-action ui-pager ui-pager-disabled">上一页</li>
																												<li data-page="1" class="ui-pager focus">1</li>
																												<li data-page="2" class="ui-pager">2</li>
																												<li data-page="3" class="ui-pager">3</li>
																												<li class="ui-paging-ellipse">...</li>
																												<li data-page="49" class="ui-pager">49</li>
																												<li class="js-page-next js-page-action ui-pager">下一页</li>
																												<li class="js-page-last js-page-action ui-pager">末页</li>
																												<li class="ui-paging-toolbar">
																													<select class="ui-select-pagesize">
																														<option value="5">5条/页</option>
																														<option value="10">10条/页</option>
																														<option value="15">15条/页</option>
																														<option value="20">20条/页</option>
																													</select><input class="ui-paging-count" type="text">
																													<a href="javascript:void(0)">跳转</a>
																												</li>
																											</ul>
																										</div>
																									</div>
																								</td>
																							</tr>
																						</tbody>
																					</table>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
															<div class="form-actions">
																<div class="row">
																	<div class="col-md-offset-4 col-md-9">
																		<a href="javascript:;" class="btn default button-previous" id="next3_btn">
																			<i class="m-icon-swapleft"></i> 上一步
																		</a>
																		<button type="button" class="btn blue button-next next3" id="tabthree-btn">
										下一步 <i class="m-icon-swapright m-icon-white"></i>
									</button>
																	</div>
																</div>

															</div>
															<div class="loadbg hidden">
																<img src="img/loading.gif" class="load4">
															</div>
														</div>
														<!-- 研究对象分组 end -->
														<!-- 统计学统计 -->
														<div class="tab-pane" id="tab4">

															<jsp:include page="panel.jsp"></jsp:include>
															<a id="control" data-toggle="modal" href="#static"></a>
															<div class="row">
																<div id="static" class="modal fade in" tabindex="-1" data-backdrop="static" data-keyboard="false">
																	<div class="modal-dialog choose-var">
																		<div class="modal-content">
																			<div class="modal-header">
																				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
																				<h4 class="modal-title">选择统计模型</h4>

																			</div>
																			<div class="modal-body row method-modal">
																				<div class="method-modal-body" style="width:100%;">
																					<h4 class="method-modal-title">比较均值分析</h4>
																					<div class=" method-group"><b>参数</b>
																						<div class="input-group">
																							<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000010">独立样本T检验</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000011">配对样本T检验</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000012">单因素方差分析</label></div>
																						</div>
																					</div>
																					<div class=" method-group"><b>非参数</b>
																						<div class="input-group">
																							<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000013">两个独立样本检验</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000014">多个独立样本检验</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000015">两个关联样本检验</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000016">多个关联样本检验</label></div>
																						</div>
																					</div>
																				</div>
																				<div class="method-modal-body">
																					<h4 class="method-modal-title">logistic回归</h4>
																					<div class=" method-group group-two">
																						<div class="input-group">
																							<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000017">二元logistic回归</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000018">有序logistic回归</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000019">多项logistic回归</label></div>
																						</div>
																					</div>
																				</div>
																				<div class="method-modal-body">
																					<h4 class="method-modal-title">相关分析</h4>
																					<div class=" method-group group-two">
																						<div class="input-group">
																							<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000020">双变量相关</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000021">偏相关</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000022">距离相关</label></div>
																						</div>
																					</div>
																				</div>
																				<div class="method-modal-body">
																					<h4 class="method-modal-title">Cox回归</h4>
																					<div class=" method-group group-two">
																						<div class="input-group">
																							<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000023">Cox回归</label></div>
																						</div>
																					</div>
																				</div>
																				<div class="method-modal-body">
																					<h4 class="method-modal-title">Roe曲线</h4>
																					<div class=" method-group group-two">
																						<div class="input-group">
																							<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000024">Roe曲线</label></div>
																						</div>
																					</div>
																				</div>
																				<div class="method-modal-body">
																					<h4 class="method-modal-title">线性回归</h4>
																					<div class=" method-group group-two">
																						<div class="input-group">
																							<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000025">线性回归方法</label></div>
																						</div>
																					</div>
																				</div>
																				<div class="method-modal-body">
																					<h4 class="method-modal-title">定性数据分析方法</h4>
																					<div class=" method-group group-two">
																						<div class="input-group">
																							<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000026">定性数据分析方法</label></div>
																						</div>
																					</div>
																				</div>
																			</div>
																			<div class="modal-footer " style="text-align: center;">
																				<button type="button" data-dismiss="modal" class="btn return-btn">上一步</button>
																				<button type="button" data-dismiss="modal" class="btn green add_method-btn">确定</button>
																				<span class="label" style="opacity:0;position:absolute;">您还没有选择模型！<span>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="main hidden">
							<ul class="nav nav-tabs method-ul">
								<li class="dropdown method-dropdown choose-var">
											<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
											统计方法 <i class="fa fa-plus"></i>
											</a>
											<div class="dropdown-menu" role="menu">
				<div class="method-modal-body">
					<div class="method-modal-body">
						<h4 class="method-modal-title">比较均值分析</h4>
						<div class=" method-group"><b>参数</b>
							<div class="input-group">
								<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000010">独立样本T检验</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000011">配对样本T检验</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000012">单因素方差分析</label></div>
							</div>
						</div>
						<div class=" method-group"><b>非参数</b>
							<div class="input-group">
								<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000013">两个独立样本检验</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000014">多个独立样本检验</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000015">两个关联样本检验</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000016">多个关联样本检验</label></div>
							</div>
						</div>
					</div>
					<div class="method-modal-body">
						<h4 class="method-modal-title">logistic回归</h4>
						<div class=" method-group group-two">
							<div class="input-group">
								<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000017">二元logistic回归</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000018">有序logistic回归</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000019">多项logistic回归</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000025">线性回归方法</label></div>
							</div>
						</div>
					</div>
					<div class="method-modal-body">
						<h4 class="method-modal-title">相关分析</h4>
						<div class=" method-group group-two">
							<div class="input-group">
								<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000020">双变量相关</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000021">偏相关</label><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000022">距离相关</label></div>
							</div>
						</div>
					</div>
					<div class="method-modal-body">
						<h4 class="method-modal-title">Cox回归</h4>
						<div class=" method-group group-two">
							<div class="input-group">
								<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000023">Cox回归</label></div>
							</div>
						</div>
					</div>
					<div class="method-modal-body">
						<h4 class="method-modal-title">Roe曲线</h4>
						<div class=" method-group group-two">
							<div class="input-group">
								<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000024">Roe曲线</label></div>
							</div>
						</div>
					</div>
					<div class="method-modal-body">
						<h4 class="method-modal-title">线性回归</h4>
						<div class=" method-group group-two">
							<div class="input-group">
								<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000025">线性回归方法</label></div>
							</div>
						</div>
					</div>
					<div class="method-modal-body">
						<h4 class="method-modal-title">定性数据分析方法</h4>
						<div class=" method-group group-two">
							<div class="input-group">
								<div class="icheck-inline"><label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000026">定性数据分析方法</label></div>
							</div>
						</div>
					</div>
				</div>
											<span class="btn btn-sm add_method-btn blue" style="float:right;">确定</span>
																			</div>
																			</li>
																			</ul>
																			<div class="tab-content">
																				<div class="tab-pane fade in" id="tab_000010">
																					<div class="hxkz margin-top-20 ">
																						<input type="checkbox" name="hxkz10" />混淆控制
																					</div>
																					<div class="border-gray inset-shadow box padding-10 padding-bottom-35">
																						<div class="vars_div"></div>
																						<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																						<span class="box-name">检验变量</span>
																					</div>
																					<div class="border-gray inset-shadow box padding-10 margin-top-10 hxbl-box padding-bottom-35 hidden">
																						<div class="vars_div"></div>
																						<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																						<span class="box-name">混淆变量</span>
																					</div>
																					<div class="chose-group-box margin-top-10">
																						<span class="chose-group-info">请选择置信分组：</span>
																						<div class="chose-group-body" id="g10">

																						</div>
																					</div>
																					<div class="border-gray bcgk-gray inset-shadow box padding-10 margin-top-10 zxqj-box">
																						<div>
																							<label for="zxqj">置信区间百分比：</label><input type="text" value="95" name="zxqj" class="zxqj" />% &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																							<b>缺失值：</b><label for="qsz10"><input type="radio" name="qsz10" class="icheck" checked="checked"/>按分析顺序排除个案</label>&nbsp;&nbsp;&nbsp;&nbsp;<label for="qsz10"><input type="radio" name="qsz10" class="icheck" disabled="disabled"/>按列表排除个案</label>
																						</div>
																					</div>
																					<div class="result-btn-box text-right">
																						<button class="btn green">数据预览</button>
																						<button class="btn green">生成结果</button>
																					</div>
																					<div class="margin-top-20 text-center loading hidden">
																						<img alt="loading" src="img/loading.gif">
																					</div>
																					<div class="res-box margin-top-20 hidden">
																					</div>
																					<div class=" margin-top-20 dataview hidden">
																						<table class="table table-advance table-right-border text-center">
																							<thead>
																								<tr>
																									<th colspan="6" class="text-left bcgk-gray">数据预览</th>

																								</tr>
																								<tr>
																									<th>组别</th>
																									<th>科研变量</th>
																									<th>数据完整度</th>
																									<th>数据占比</th>
																								</tr>
																							</thead>
																							<tbody>

																							</tbody>
																						</table>
																					</div>
																				</div>
																				<div class="tab-pane fade in" id="tab_000011">
																					<div class="hxkz margin-top-20 ">
																						<input type="checkbox" name="hxkz11" />混淆控制
																					</div>
																					<div class="border-gray inset-shadow box padding-10 padding-bottom-35">
																						<div class="vars_div"></div>
																						<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																						<span class="box-name">检验变量</span>
																					</div>
																					<div class="border-gray inset-shadow box padding-10 margin-top-10 hxbl-box padding-bottom-35 hidden">
																						<div class="vars_div"></div>
																						<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																						<span class="box-name">混淆变量</span>
																					</div>
																					<div class="chose-group-box margin-top-10">
																						<span class="chose-group-info">请选择置信分组：</span>
																						<div class="chose-group-body" id="g11">

																						</div>
																					</div>
																					<div class="border-gray bcgk-gray inset-shadow box padding-10 margin-top-10 zxqj-box">
																						<div>
																							<label for="zxqj">置信区间百分比：</label><input type="text" value="95" name="zxqj" class="zxqj" />% &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																							<b>缺失值：</b><label for="qsz11"><input type="radio" name="qsz11" class="icheck" checked="checked"/>按分析顺序排除个案</label>&nbsp;&nbsp;&nbsp;&nbsp;<label for="qsz11"><input type="radio" name="qsz11" class="icheck" disabled="disabled"/>按列表排除个案</label>
																						</div>
																					</div>
																					<div class="result-btn-box text-right">
																						<button class="btn green">数据预览</button>
																						<button class="btn green">生成结果</button>
																					</div>
																					<div class="margin-top-20 text-center loading hidden">
																						<img alt="loading" src="img/loading.gif">
																					</div>
																					<div class="res-box margin-top-20 hidden">
																					</div>
																					<div class=" margin-top-20 dataview hidden">
																						<table class="table table-advance table-right-border text-center">
																							<thead>
																								<tr>
																									<th colspan="6" class="text-left bcgk-gray">数据预览</th>

																								</tr>
																								<tr>
																									<th>组别</th>
																									<th>科研变量</th>
																									<th>数据完整度</th>
																									<th>数据占比</th>
																								</tr>
																							</thead>
																							<tbody>

																							</tbody>
																						</table>
																					</div>
																				</div>
																				<div class="tab-pane fade" id="tab_000012">
																					<div class="border-gray inset-shadow box padding-10 padding-bottom-35 margin-top-20">
																						<div class="vars_div"></div>
																						<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																						<span class="box-name">检验变量</span>
																					</div>

																					<div class="border-gray inset-shadow box padding-10 margin-top-10 hxbl-box padding-bottom-35 hidden">
																						<div class="vars_div"></div>
																						<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																						<span class="box-name">混淆变量</span>
																					</div>
																					<div class="chose-group-box margin-top-10">
																						<span class="chose-group-info">请选择置信分组：</span>
																						<div class="chose-group-body" id="g12">

																						</div>
																					</div>
																					<div class="border-gray bcgk-gray inset-shadow box padding-10 margin-top-10 zxqj-box">
																						<div>
																							<label for="zxqj">置信区间百分比：</label><input type="text" value="95" name="zxqj" class="zxqj" />% &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																							<b>缺失值：</b><label for="qsz12"><input type="radio" name="qsz12" class="icheck" checked="checked"/>按分析顺序排除个案</label>&nbsp;&nbsp;&nbsp;&nbsp;<label for="qsz12"><input type="radio" name="qsz16" class="icheck" disabled="disabled"/>按列表排除个案</label>
																						</div>
																					</div>

																					<div class="back-gray box padding-10 margin-top-10  padding-bottom-35 inset-shadow">
																						<div class="border-deepgray " style="border:0px;">
																							<div class="form-group">
																								<label>检验类型：</label>
																								<label><input type="checkbox" class="icheck" name="xgxs12" data-checkbox="icheckbox_minimal-red" checked="checked"/>方差同质性</label>
																								<label><input type="checkbox" class="icheck" name="xgxs12" data-checkbox="icheckbox_minimal-red"/>两两比较</label>
																								
																							</div>
																						</div>
																					</div>
																					<div class="result-btn-box text-right">

																						<button class="btn green">数据预览</button>
																						<button class="btn green">生成结果</button>
																					</div>
																					<div class="res-box margin-top-20 hidden">
																						<table class="table table-advance table-right-border text-center">
																							<thead>
																								<tr>
																									<th colspan="6" class="text-left bcgk-gray">
																										单因素方差分析结果
																									</th>

																								</tr>
																								<tr>
																									<th>变量</th>
																									<th>关系</th>
																									<th>值</th>
																									<th>df</th>
																									<th>渐进Sig(双侧)</th>
																									<th>精确Sig(双侧)</th>
																								</tr>
																							</thead>
																							<tbody>
																								
																							</tbody>
																						</table>
																					</div>
																					<div class=" margin-top-20 dataview hidden">
																						<table class="table table-advance table-right-border text-center">
																							<thead>
																								<tr>
																									<th colspan="6" class="text-left bcgk-gray">
																										数据预览
																									</th>
																								</tr>
																								<tr>
																									<th>组别</th>
																									<th>科研变量</th>
																									<th>数据完整度</th>
																									<th>数据占比</th>
																								</tr>
																							</thead>
																							<tbody>
																						</tbody>
																					   </table>
																					</div>
																				</div>
																				<div class="tab-pane fade" id="tab_000013">
																					<div class="border-gray inset-shadow box padding-10 padding-bottom-35 margin-top-20">
																						<div class="vars_div"></div>
																						<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																						<span class="box-name">检验变量</span>
																					</div>

																					<div class="border-gray inset-shadow box padding-10 margin-top-10 hxbl-box padding-bottom-35 hidden">
																						<div class="vars_div"></div>
																						<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																						<span class="box-name">混淆变量</span>
																					</div>
																					<div class="chose-group-box margin-top-10">
																						<span class="chose-group-info">请选择置信分组：</span>
																						<div class="chose-group-body" id="g13">

																						</div>
																					</div>
																					<div class="border-gray bcgk-gray inset-shadow box padding-10 margin-top-10 zxqj-box">
																						<div>
																							<label for="zxqj">置信区间百分比：</label><input type="text" value="95" name="zxqj" class="zxqj" />% &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																							<b>缺失值：</b><label for="qsz13"><input type="radio" name="qsz13" class="icheck" checked="checked"/>按分析顺序排除个案</label>&nbsp;&nbsp;&nbsp;&nbsp;<label for="qsz13"><input type="radio" name="qsz13" class="icheck" disabled="disabled"/>按列表排除个案</label>
																						</div>
																					</div>

																					<div class="back-gray box padding-10 margin-top-10  padding-bottom-35 inset-shadow">
																						<div class="border-deepgray " style="border:0px;">
																							<div class="form-group">
																								<label>检验类型：</label>
																								<label><input type="checkbox" class="icheck" name="xgxs13" data-checkbox="icheckbox_minimal-red" checked="checked"/>Mann-Whitney U</label>
																								<label><input type="checkbox" class="icheck" name="xgxs13" data-checkbox="icheckbox_minimal-red" disabled="disabled"/>Kolmogorov-Smirnov Z</label>
																								<label><input type="checkbox" class="icheck" name="xgxs13" data-checkbox="icheckbox_minimal-red" disabled="disabled"/>Moses极限反应</label>
																								<label><input type="checkbox" class="icheck" name="xgxs13" data-checkbox="icheckbox_minimal-red" disabled="disabled"/>Wald-Wolfowitz游程</label>
																								
																							</div>
																						</div>
																					</div>
																					<div class="result-btn-box text-right">

																						<button class="btn green">数据预览</button>
																						<button class="btn green">生成结果</button>
																					</div>
																					<div class="res-box margin-top-20 hidden">
																						<table class="table table-advance table-right-border text-center">
																							<thead>
																								<tr>
																									<th colspan="6" class="text-left bcgk-gray">
																										两个独立样本检验结果
																									</th>

																								</tr>
																								<tr>
																									<th>变量</th>
																									<th>关系</th>
																									<th>值</th>
																									<th>df</th>
																									<th>渐进Sig(双侧)</th>
																									<th>精确Sig(双侧)</th>
																								</tr>
																							</thead>
																							<tbody>
																								
																							</tbody>
																						</table>
																					</div>
																					<div class=" margin-top-20 dataview hidden">
																						<table class="table table-advance table-right-border text-center">
																							<thead>
																								<tr>
																									<th colspan="6" class="text-left bcgk-gray">
																										数据预览
																									</th>
																								</tr>
																								<tr>
																									<th>组别</th>
																									<th>科研变量</th>
																									<th>数据完整度</th>
																									<th>数据占比</th>
																								</tr>
																							</thead>
																							<tbody>
																						</tbody>
																					   </table>
																					</div>
																				</div>
																				<div class="tab-pane fade" id="tab_000014">
																					<div class="border-gray inset-shadow box padding-10 padding-bottom-35 margin-top-20">
																						<div class="vars_div"></div>
																						<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																						<span class="box-name">检验变量</span>
																					</div>

																					<div class="border-gray inset-shadow box padding-10 margin-top-10 hxbl-box padding-bottom-35 hidden">
																						<div class="vars_div"></div>
																						<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																						<span class="box-name">混淆变量</span>
																					</div>
																					<div class="chose-group-box margin-top-10">
																						<span class="chose-group-info">请选择置信分组：</span>
																						<div class="chose-group-body" id="g14">

																						</div>
																					</div>
																					<div class="border-gray bcgk-gray inset-shadow box padding-10 margin-top-10 zxqj-box">
																						<div>
																							<label for="zxqj">置信区间百分比：</label><input type="text" value="95" name="zxqj" class="zxqj" />% &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																							<b>缺失值：</b><label for="qsz14"><input type="radio" name="qsz14" class="icheck" checked="checked"/>按分析顺序排除个案</label>&nbsp;&nbsp;&nbsp;&nbsp;<label for="qsz14"><input type="radio" name="qsz14" class="icheck" disabled="disabled"/>按列表排除个案</label>
																						</div>
																					</div>

																					<div class="back-gray box padding-10 margin-top-10  padding-bottom-35 inset-shadow">
																						<div class="border-deepgray " style="border:0px;">
																							<div class="form-group">
																								<label>检验类型：</label>
																								<label><input type="checkbox" class="icheck" name="xgxs14" data-checkbox="icheckbox_minimal-red" checked="checked"/>Kruskal-Wallis H(K)</label>
																								<label><input type="checkbox" class="icheck" name="xgxs14" data-checkbox="icheckbox_minimal-red" disabled="disabled"/>中位数</label>
																								<label><input type="checkbox" class="icheck" name="xgxs14" data-checkbox="icheckbox_minimal-red" disabled="disabled"/>Jonckheere-Terpstra(J)</label>
																								
																								
																							</div>
																						</div>
																					</div>
																					<div class="result-btn-box text-right">

																						<button class="btn green">数据预览</button>
																						<button class="btn green">生成结果</button>
																					</div>
																					<div class="res-box margin-top-20 hidden">
																						<table class="table table-advance table-right-border text-center">
																							<thead>
																								<tr>
																									<th colspan="6" class="text-left bcgk-gray">
																										两个独立样本检验结果
																									</th>

																								</tr>
																								<tr>
																									<th>变量</th>
																									<th>关系</th>
																									<th>值</th>
																									<th>df</th>
																									<th>渐进Sig(双侧)</th>
																									<th>精确Sig(双侧)</th>
																								</tr>
																							</thead>
																							<tbody>
																								
																							</tbody>
																						</table>
																					</div>
																					<div class=" margin-top-20 dataview hidden">
																						<table class="table table-advance table-right-border text-center">
																							<thead>
																								<tr>
																									<th colspan="6" class="text-left bcgk-gray">
																										数据预览
																									</th>
																								</tr>
																								<tr>
																									<th>组别</th>
																									<th>科研变量</th>
																									<th>数据完整度</th>
																									<th>数据占比</th>
																								</tr>
																							</thead>
																							<tbody>
																						</tbody>
																					   </table>
																					</div>
																				</div>
																				<div class="tab-pane fade" id="tab_000020">
																					<div class="border-gray inset-shadow box padding-10 padding-bottom-35 margin-top-20">
																						<div class="vars_div"></div>
																						<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																						<span class="box-name">检验变量</span>
																					</div>
																					<div class="chose-group-box margin-top-10">
																						<span class="chose-group-info">请选择置信分组：</span>
																						<div class="chose-group-body" id="g20"><span class="block-group btn active" data-groupid="1490063723243">A组（1525例）</span><span class="block-group btn disabled" data-groupid="1490063723555">其他（0例）</span></div>
																					</div>
																					<div class="back-gray box padding-10 margin-top-10 xgxs-box padding-bottom-35 inset-shadow">
																						<div class="border-deepgray ">
																							<span class="title">相关系数</span>
																							<div class="form-group">
																								<label><input type="checkbox" class="icheck" name="xgxs" data-checkbox="icheckbox_minimal-red" checked="checked"/>Pearson</label>
																								<label><input type="checkbox" class="icheck" name="xgxs" data-checkbox="icheckbox_minimal-red"/>Kendall的tau-b</label>
																								<label><input type="checkbox" class="icheck" name="xgxs" data-checkbox="icheckbox_minimal-red"/>Spearman</label>
																							</div>
																						</div>
																						<div class="border-deepgray xzxjy">
																							<span class="title">显著性检验</span>
																							<div class="form-group">
																								<label><input type="radio" class="icheck" name="xzxjy" data-checkbox="icheckbox_minimal-red" checked="checked"/>双侧检验</label>
																								<label><input type="radio" class="icheck" name="xzxjy" data-checkbox="icheckbox_minimal-red"/>单侧检验</label>
																							</div>
																						</div>
																					</div>
																					<div class="result-btn-box text-right">
																						<button class="btn green">生成结果</button>
																					</div>
																					<div class="res-box margin-top-20 hidden">
																						<table class="table table-advance table-right-border text-center">
																							<thead>
																								<tr>
																									<th>
																										变量
																									</th>
																									<th>
																										关系
																									</th>
																									<th>
																										t
																									</th>
																									<th>
																										Sig（双侧）
																									</th>
																									<th>
																										下限
																									</th>
																									<th>
																										上限
																									</th>
																								</tr>
																							</thead>
																							<tbody>
																								
																							</tbody>
																						</table>
																					</div>
																				</div>
																				<div class="tab-pane fade" id="tab_000017">
																					<div class="tab-pane fade in" id="tab_000010">
																						<div class="hxkz margin-top-20 ">
																							<input type="checkbox" class="i-checks" name="hxkz17" />混淆控制
																						</div>
																						<div class="border-gray inset-shadow box padding-10 padding-bottom-35" style="width:49%;float:left;margin-right:1%;">
																							<div class="vars_div"></div>
																							<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																							<span class="box-name">协变量</span>
																						</div>
																						<div class="border-gray inset-shadow box padding-10 ybl-box padding-bottom-35" style="width:50%;float:left;">
																							<div class="vars_div"></div>
																							<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																							<span class="box-name">哑变量</span>
																						</div>
																						<div style="clear:both;"></div>
																						<div class="border-gray inset-shadow box padding-10 margin-top-10 hxbl-box padding-bottom-35 hidden">
																							<div class="vars_div"></div>
																							<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																							<span class="box-name">混淆变量</span>
																						</div>

																						<div class="chose-group-box margin-top-10">
																							<span class="chose-group-info">请选择置信分组：</span>
																							<div class="chose-group-body" id="g17">

																							</div>
																						</div>
																						<div class="border-gray bcgk-gray inset-shadow box padding-10 margin-top-10 zxqj-box">
																							<div>
																								<label for="zxqj">置信区间百分比：</label><input type="text" value="95" name="zxqj" class="zxqj" />% &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																								<b>缺失值：</b><label for="qsz17"><input type="radio" name="qsz17" class="icheck" checked="checked"/>按分析顺序排除个案</label>&nbsp;&nbsp;&nbsp;&nbsp;<label for="qsz17"><input type="radio" name="qsz17" class="icheck" disabled="disabled"/>按列表排除个案</label>
																							</div>
																						</div>
																						<div class="result-btn-box text-right">
																							<button class="btn green">数据预览</button>
																							<button class="btn green">生成结果</button>

																						</div>
																						<div class="res-box margin-top-20 hidden">
																							<table class="table table-advance table-right-border text-center">
																								<thead>
																									<tr>
																										<th colspan="4" class="text-left bcgk-gray">
																											二元logistics回归检验结果
																										</th>
																										<th colspan="2">
																											差分的 95% 置信区间
																										</th>

																									</tr>
																									<tr>
																										<th>
																											变量
																										</th>
																										<th>
																											关系
																										</th>
																										<th>
																											t
																										</th>
																										<th>
																											Sig（双侧）
																										</th>
																										<th>
																											下限
																										</th>
																										<th>
																											上限
																										</th>
																									</tr>
																								</thead>
																								<tbody>
																									<tr>
																										<td rowspan="2">年龄</td>
																										<td>假设方差相等</td>
																										<td>.0908</td>
																										<td>0.921</td>
																										<td>-5.78</td>
																										<td>6.38</td>
																									</tr>
																									<tr>

																										<td>假设方差不相等</td>
																										<td class="fred">0.498</td>
																										<td>0.921</td>
																										<td>-5.83</td>
																										<td>6.44</td>
																									</tr>
																									
																								</tbody>
																							</table>
																						</div>
																					</div>
																				</div>
																				<div class="tab-pane fade" id="tab_000026">
																					<div class="border-gray inset-shadow box padding-10 padding-bottom-35 margin-top-20">
																						<div class="vars_div"></div>
																						<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																						<span class="box-name">检验变量</span>
																					</div>

																					<div class="border-gray inset-shadow box padding-10 margin-top-10 hxbl-box padding-bottom-35 hidden">
																						<div class="vars_div"></div>
																						<span class="pluss btn green" title="添加变量"><i class="fa fa-plus"></i></span>
																						<span class="box-name">混淆变量</span>
																					</div>
																					<div class="chose-group-box margin-top-10">
																						<span class="chose-group-info">请选择置信分组：</span>
																						<div class="chose-group-body" id="g26">

																						</div>
																					</div>
																					<div class="border-gray bcgk-gray inset-shadow box padding-10 margin-top-10 zxqj-box">
																						<div>
																							<label for="zxqj">置信区间百分比：</label><input type="text" value="95" name="zxqj" class="zxqj" />% &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																							<b>缺失值：</b><label for="qsz16"><input type="radio" name="qsz16" class="icheck" checked="checked"/>按分析顺序排除个案</label>&nbsp;&nbsp;&nbsp;&nbsp;<label for="qsz16"><input type="radio" name="qsz16" class="icheck" disabled="disabled"/>按列表排除个案</label>
																						</div>
																					</div>

																					<div class="back-gray box padding-10 margin-top-10  padding-bottom-35 inset-shadow">
																						<div class="border-deepgray " style="border:0px;">
																							<div class="form-group">
																								<label>检验类型：</label>
																								<label><input type="checkbox" class="icheck" name="xgxs" data-checkbox="icheckbox_minimal-red" checked="checked"/>卡方</label>
																								<label><input type="checkbox" class="icheck" name="xgxs" data-checkbox="icheckbox_minimal-red"/>KAPPA</label>
																								<label><input type="checkbox" class="icheck" name="xgxs" data-checkbox="icheckbox_minimal-red"/>Mcnemar</label>
																							</div>
																						</div>
																					</div>
																					<div class="result-btn-box text-right">

																						<button class="btn green">数据预览</button>
																						<button class="btn green">生成结果</button>
																					</div>
																					<div class="res-box margin-top-20 hidden">
																						<table class="table table-advance table-right-border text-center">
																							<thead>
																								<tr>
																									<th colspan="6" class="text-left bcgk-gray">
																										定性分析结果
																									</th>

																								</tr>
																								<tr>
																									<th>变量</th>
																									<th>关系</th>
																									<th>值</th>
																									<th>df</th>
																									<th>渐进Sig(双侧)</th>
																									<th>精确Sig(双侧)</th>
																								</tr>
																							</thead>
																							<tbody>
																								<tr>
																									<td rowspan="3">冠状动脉旁路移植术</td>
																									<td>Pearson卡方</td>
																									<td>0.101 </td>
																									<td>1 </td>
																									<td>0.750</td>
																									<td>-</td>
																								</tr>
																								<tr>
																									<td>连续矫正b</td>
																									<td>0.033 </td>
																									<td>1 </td>
																									<td>0.855</td>
																									<td>-</td>
																								</tr>
																								<tr>
																									<td>Fisher的精确检验</td>
																									<td>- </td>
																									<td>-</td>
																									<td>-</td>
																									<td>0.891</td>
																								</tr>
																								<tr class="bcgk-sp">
																									<td rowspan="3">吸烟史</td>
																									<td>Pearson卡方</td>
																									<td>3.859</td>
																									<td>1</td>
																									<td class="fred">0.000</td>
																									<td>-</td>
																								</tr>
																								<tr class="bcgk-sp">
																									<td>连续矫正b</td>
																									<td>3.857</td>
																									<td>1</td>
																									<td class="fred">0.000</td>
																									<td>-</td>
																								</tr>
																								<tr class="bcgk-sp">
																									<td>Fisher的精确检验</td>
																									<td>-</td>
																									<td>-</td>
																									<td>-</td>
																									<td class="fred">0.000</td>
																								</tr>
																								
																							</tbody>
																						</table>
																					</div>
																					<div class=" margin-top-20 dataview hidden">
																						<table class="table table-advance table-right-border text-center">
																							<thead>
																								<tr>
																									<th colspan="6" class="text-left bcgk-gray">
																										数据预览
																									</th>
																								</tr>
																								<tr>
																									<th>组别</th>
																									<th>科研变量</th>
																									<th>数据完整度</th>
																									<th>数据占比</th>
																								</tr>
																							</thead>
																							<tbody>
																						</tbody>
																					   </table>
																					</div>
																				</div>

																			</div>
																		</div>
																		<div class="form-actions">
																			<div class="row">
																				<div class="col-md-offset-4 col-md-9">
																					<a href="javascript:;" class="btn default button-previous">
																						<i class="m-icon-swapleft"></i> 上一步
																					</a>
																					<button type="button" class="btn blue button-next" id="tabfour-btn">
													下一步 <i class="m-icon-swapright m-icon-white"></i>
												</button>
																				</div>
																			</div>
																		</div>

																	</div>
																	<!-- 统计学统计 END -->
																	<!-- 生成报告 -->
																	<div class="tab-pane" id="tab5">
																		<div class="row">
																			<div class=" box" id="p2">
																				<span class="page-title" style="padding: 10px 0px;">
			研究目的  : 中国不同性别急性心肌梗死患者临床症状及诱发因素的差异分析
			</span>
																				<!-- END PAGE HEADER-->
																				<!-- BEGIN PAGE CONTENT-->
																				<div class="row " style="padding:0px 8%;">
																					<div class="col-md-12 ">

																						<!-- BEGIN SAMPLE TABLE PORTLET-->

																						<table class="middle-body-list table table-no-border">
																							<tr class="info-li">

																								<td style="width: 10%;min-width: 90px;"><span class="list-title">研究方法</span>：</td>
																								<td><span class="block-info" id="research_type">非随机对照试验</span><span class="list-title">统计方法</span>：<span class="block-info" id="stats_methods"> 独立样本T检验   定性数据分析方法 </span></td>
																							</tr>

																							<tr class="info-li">

																								<td><span class="list-title">入排条件</span>：</td>
																								<td>
																									<span class="block-info" id="res_condition">初步诊断包含心肌梗死</span>

																								</td>
																							</tr>
																							<tr class="info-li">

																								<td valign="top"><span class="list-title">分组：</span></td>
																								<td id="group_td"><span class="block-info"><b>A组：</b><br/>性别 等于 女</span><br/><span class="block-info"><b>B组：</b><br/>性别 等于 男</span><br/></td>
																							</tr>
																							<tr class="info-li">

																								<td><span class="list-title">暴露因素</span>：</td>
																								<td id="vars"><span class="block-info">年龄</span><span class="block-info">BMI</span><span class="block-info">冠状动脉旁路移植术</span>
																									<span class="block-info">吸烟史</span><span class="block-info">症状等于胸痛</span><span class="block-info">症状等于大汗</span>
																								</td>
																							</tr>
																							
																							<tr class="info-li">

																								<td valign="top"><span class="list-title">统计结果：</span></td>
																								<td><span class="block-info"></span></td>
																							</tr>
																						</table>

																						<!-- END SAMPLE TABLE PORTLET-->

																					</div>
																				</div>

																				<!--highchart-->
																				<!-- <div class="row" style="padding:0px 2%;">
																					<div class="col-md-12">
																						<div id="chart-container1" style="min-width: 310px; height: 500px; margin: 0 auto"></div>
																					</div>
																				</div> -->
																				<!--highchart end-->
																				
																				<div class="row" style="padding:2%;">

																					<div class="col-md-10 res-box col-md-offset-1">
																						

																						<!-- BEGIN BORDERED TABLE PORTLET-->

																						<!-- END BORDERED TABLE PORTLET-->
																					</div>
																				</div>

																				<!-- END PAGE CONTENT-->
																			</div>
																			<div class="form-actions">
																				<div class="row">
																					<div class="col-md-offset-3 col-md-9">
																						<a href="javascript:;" class="btn default button-previous">
																							<i class="m-icon-swapleft"></i> 上一步
																						</a>
																						<button type="button" class="btn blue">
																		完成 <i class="m-icon-swapright m-icon-white"></i>
																	</button>
																					</div>
																				</div>
																			</div>
																		</div>

																	</div>
																	<!-- 生成报告 END -->

																</div>
																<!--tab-content end -->
															</div>
														</div>
										</form>
										</div>
										</div>
										</div>
									</div>
									<!-- END PAGE CONTENT-->
								</div>
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
					<!-- END FOOTER -->
					<!--通用指标 开始-->
					<div class="box conditions-box hidden" id="common-cont">
						<div class="caption">
							<span>请输入关键字或拼音搜索</span>
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
					<div class="mypanel hidden" style="background:#fff;border:1px #ddd solid;z-index:99990;max-height:250px;overflow-y:auto;"></div>
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
					<!-- <script type="text/javascript" src="js/charts.js"></script> -->
					<script type="text/javascript" src="js/jquery.fly.min.js"></script>
					<script src="assets/global/plugins/bootbox/bootbox.min.js" type="text/javascript"></script>
					<script src="assets/global/plugins/swiper3/script/swiper-3.4.1.jquery.min.js"></script>
					<script src="assets/global/plugins/swiper3/script/swiper.animate1.0.2.min.js"></script>
					<script src="assets/global/plugins/jq_animateNumber/jquery.animateNumber.min.js"></script>
					<script src="assets/global/plugins/jq_animateNumber/jquery.color.min.js"></script>
					<!-- END PAGE LEVEL PLUGINS -->
					<script src="assets/admin/pages/scripts/form-wizard.js"></script>
					<script src="assets/admin/pages/scripts/form-icheck.js"></script>
					<script type="text/javascript" src="js/addstudy.js"></script>
					<script>
						jQuery(document).ready(function() {
							Metronic.init(); // init metronic core components
							Layout.init(); // init current layout
							QuickSidebar.init(); // init quick sidebar
							Demo.init(); // init demo features
							FormWizard.init();
							ComponentsPickers.init();
							FormiCheck.init();
							UITree.init();
						
							$(".conditions-container ol").slimScroll({
								alwaysVisible: "1",
								
								height:"205px",
							    /* railVisible: true, */
							   
							    disableFadeOut: true,
							    
							    alwaysVisible: true
							});
							
							
							 $(".border-common>div").slimScroll({
								alwaysVisible: "0",
								wheelStep:'38px',
								height:"38px",
							  color:"rgba(0,0,0,0)",
							   width:"90%",
							 
							}); 
							//控制条件框移动移动
							var mySwiper = new Swiper('.swiper-container', {
								keyboardControl: true,
								onlyExternal: true,
								slidesPerView: 3,
								slidesPerGroup: 1,

								spaceBetween: 10,
								// 如果需要分页器
								pagination: '.swiper-pagination',

								// 如果需要前进后退按钮
								nextButton: '.swiper-button-next',
								prevButton: '.swiper-button-prev'

							});
							mySwiper.onResize();
							$(".conditionsPage-btn-group").on("click", ".prev", function() {
								mySwiper.slidePrev();

							});
							$(".conditionsPage-btn-group").on("click", ".next", function() {
								mySwiper.slideNext();

							});
							$('.plus-conditions-container').click(function() {
								if(mySwiper.slides.length > 15) {
									bootbox.setDefaults("locale", "zh_CN");
									bootbox.alert("抱歉，您的组别个数达到上限15个");
									return false;
								}
								mySwiper.appendSlide('<div class="conditions-container swiper-slide"><div><ol></ol><div class="bottom-bar"><i class="fa fa-close"></i></div></div></div>'); //加到Swiper的最后
								mySwiper.slideTo(mySwiper.slides.length);
								$(".conditions-container .slimScrollDiv .scroller").attr({ "data-always-visible": "1", "data-rail-visible": "1" })
							});
							//分组框选取
							$("#tab2 .conditions-container").live("click", function(e) {
								if($(e.target).hasClass("fa-close") && $(e.target).parent().hasClass("bottom-bar")) {
									if($("#tab2 .conditions-container").length < 2) {
										bootbox.setDefaults("locale", "zh_CN");
										bootbox.alert("系统不支持全部删除");
										return false;
									}
									mySwiper.removeSlide($(this).index());

								} else {
									$("#tab2 .conditions-container").removeClass("active");
									$(this).addClass("active");
								}
							});

						});
					</script>
					<!-- <script type="text/javascript">  
    function jsonpCallback(result) {  
        alert(result);  
        
    }  
    var JSONP=document.createElement("script");  
    JSONP.type="text/javascript";  
    JSONP.src="http://192.168.8.20:8080/med/query/mrallnum.json";  
    document.getElementsByTagName("head")[0].appendChild(JSONP);  
</script>  -->
					<!-- END JAVASCRIPTS -->
	</body>
	<!-- END BODY -->

</html>