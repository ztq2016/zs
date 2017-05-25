<html><head>
<meta charset="utf-8">

  
  
  <title>临床研究平台 | 修改课题 </title>
  


<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<meta content="" name="description">
<meta content="" name="author">
	<!-- BEGIN GLOBAL MANDATORY STYLES -->
	<link href="fonts/font-awesome/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css">
	<link href="assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css">
	<link href="assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css">
	<!-- END GLOBAL MANDATORY STYLES -->
	<!-- BEGIN THEME STYLES -->
	<link href="assets/global/css/components-md.css" id="style_components" rel="stylesheet" type="text/css">
	<link href="assets/global/css/plugins-md.css" rel="stylesheet" type="text/css">
	<link href="assets/admin/layout/css/layout.css" rel="stylesheet" type="text/css">
	<link id="style_color" href="assets/admin/layout/css/darkblue.css" rel="stylesheet" type="text/css">
	<link href="assets/admin/layout/css/custom.css" rel="stylesheet" type="text/css">
	<!-- END THEME STYLES -->
	<!-- BEGIN PAGE LEVEL STYLES -->
	<link rel="stylesheet" type="text/css" href="assets/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css">
	<link rel="stylesheet" type="text/css" href="assets/global/plugins/swiper3/css/swiper-3.4.1.min.css">
	<link rel="stylesheet" type="text/css" href="assets/global/plugins/swiper3/css/animate.min.css">
	<link href="assets/global/plugins/icheck/skins/all.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="assets/global/plugins/jstree/dist/themes/default/style.min.css">
	<!-- END PAGE LEVEL STYLES -->
	<link href="css/animate.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/mystyle.css">
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
						<img src="img/logo.png" class="iconlogo">
						
					</div>
					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
					<div class="sidebar-toggler">
					</div>					
				</li>
				<li class="sidebar-user-wrapper noshow">
					<img src="img/user.png" alt="用户头像" class="userinfo-btn">
					
						<b class="uname userinfo-btn">张嘉佳</b>
						<i class="fa fa-caret-down userinfo-btn"></i><br>
						    <span class="userinfo-arrow"></span>
						 <ul class="userinfo hidden" style="left: 40px; opacity: 0; width: 0px; height: 0px;">						
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
					<a href="/clinicalresearch-portal/index?userId=000001&amp;password=1234"><i class="myicon home"></i><span class="title">课题管理</span>
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
		<div class="page-content" style="min-height:655px">
			
			<!-- BEGIN PAGE HEADER-->
			<div class="page-bar">
				<ul class="page-breadcrumb">
					<li>
						<i class="myicon pos"></i>
						<a href="/clinicalresearch-portal?userId=000001">课题管理</a>
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
			        	<ul id="dced"><li data-fileid="84"><div class="doc_info"><small title="bcrp-000001-2017-03-15_11-05-22-622.CSV">bcrp...22.CSV<span>2017-03-15</span></small></div><div class="doc_dc"><i class="export_icon" title="下载到本地"></i></div></li><li data-fileid="83"><div class="doc_info"><small title="bcrp-000001-2017-03-15_11-05-05-001.CSV">bcrp...01.CSV<span>2017-03-15</span></small></div><div class="doc_dc"><i class="export_icon" title="下载到本地"></i></div></li><li data-fileid="82"><div class="doc_info"><small title="bcrp-000001-2017-03-15_11-03-53-343.CSV">bcrp...43.CSV<span>2017-03-15</span></small></div><div class="doc_dc"><i class="export_icon" title="下载到本地"></i></div></li><li data-fileid="81"><div class="doc_info"><small title="bcrp-000001-2017-03-14_16-08-31-268.CSV">bcrp...68.CSV<span>2017-03-14</span></small></div><div class="doc_dc"><i class="export_icon" title="下载到本地"></i></div></li><li data-fileid="80"><div class="doc_info"><small title="bcrp-000001-2017-03-14_16-06-44-495.CSV">bcrp...95.CSV<span>2017-03-14</span></small></div><div class="doc_dc"><i class="export_icon" title="下载到本地"></i></div></li><li class="text-center"><a>显示全部文件</a></li></ul>
			        </li>
			       </ul>
			    </div>
			</div>
			<!-- END PAGE HEADER-->
			<div class="container-box">
			<img src="img/helper.png" class="helpimg" id="helper">
			 <!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-10 col-md-offset-1 col-sm-12" style="min-width:766px;">
					<div id="form_wizard_1">
						<div class=" form">
							<form action="#" class="form-horizontal" id="submit_form" method="POST" novalidate="novalidate">
							   <input type="hidden" value="000060" name="studyId" id="studyid">
								<div class="form-wizard">
									<div class="form-body">
										<ul class="nav nav-pills nav-justified steps">
											<li class="done">
												<a href="#tab1" data-toggle="tab" class="step" aria-expanded="false">
												<span class="number">
												1 </span>
												<span class="desc">
												<i class="fa fa-check"></i>基本信息配置 </span>
												</a>
											</li>
											<li class="done">
												<a href="#tab2" data-toggle="tab" class="step" aria-expanded="false">
												<span class="number">
												2 </span>
												<span class="desc">
												<i class="fa fa-check"></i> 研究对象筛选 </span>
												</a>
											</li>
											<li class="done">
												<a href="#tab3" data-toggle="tab" class="step active" aria-expanded="false">
												<span class="number">
												3 </span>
												<span class="desc">
												<i class="fa fa-check"></i> 研究对象分组 </span>
												</a>
											</li>
											<li class="active">
												<a href="#tab4" data-toggle="tab" class="step active" aria-expanded="true">
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
											<div class="progress-bar progress-bar" style="background-color: rgb(138, 149, 168); width: 80%;"></div>
										</div>
										<!--tab-content start -->
										<div class="tab-content">
											<div class="tab-pane" id="tab1">
																					
																					<div class="form-group has-success">
																						<label class="control-label col-md-3">研究目的 <span class="required" aria-required="true">* </span></label>
																						<div class="col-md-4">
																						
																						  
																						  
																						  <input type="text" class="form-control" name="username" value="中国不同性别急性心肌梗死患者临床症状及诱发因素的差异分析" title="中国不同性别急性心肌梗死患者临床症状及诱发因素的差异分析" aria-required="true" aria-describedby="username-error"><span id="username-error" class="help-block help-block-error valid" style="display: none;"></span>
																						  
																						
																							
																						</div>
																					</div>
																					
																					<div class="form-group form-md-radios">
																						<label class="control-label col-md-3">研究类型 <span class="required" aria-required="true">
																						* </span>
																						</label>
																						<div class="md-radio-list col-md-3">
																							
																							     
																							 
																								
																								     
																								        
																								        <div class="md-radio">
																											<input type="radio" id="radio1" name="typename" value="000002" class="md-radiobtn" checked="checked"> 
																											<label for="radio1">
																												<span></span> <span class="check"></span>
																												<span class="box"></span> 非随机对照试验 
																											</label>
																										</div>
																								        
																								        
																								     
																										
																								
																								     
																								        
																								        
																								        <div class="md-radio">
																								       <input type="radio" id="radio2" name="typename" value="000003" class="md-radiobtn"> 
																											
																											<label for="radio2">
																												<span></span> <span class="check"></span>
																												<span class="box"></span> 回顾性队列研究 
																											</label>
																										</div>
																								        
																								     
																										
																								
																								     
																								        
																								        
																								        <div class="md-radio">
																								       <input type="radio" id="radio3" name="typename" value="000004" class="md-radiobtn"> 
																											
																											<label for="radio3">
																												<span></span> <span class="check"></span>
																												<span class="box"></span> 病例对照研究 
																											</label>
																										</div>
																								        
																								     
																										
																								
																								     
																								        
																								        
																								        <div class="md-radio">
																								       <input type="radio" id="radio4" name="typename" value="000005" class="md-radiobtn"> 
																											
																											<label for="radio4">
																												<span></span> <span class="check"></span>
																												<span class="box"></span> 横断面调查 
																											</label>
																										</div>
																								        
																								     
																										
																								
																								  
																						  
																								
																						</div>
																					</div>
									
																					<div class="form-group has-success">
																						<label class="control-label col-md-3">课题PI <span class="required" aria-required="true"> * </span>
																						</label>
																						<div class="col-md-4">
																							<select class="form-control" name="selectProjectPI" aria-required="true" aria-describedby="selectProjectPI-error">
																						  
																							     
																								 
																									<option value="张佳佳" selected="selected">张佳佳</option>
																									
																									<option value="000001">张爽</option>
																								   
																									<option value="000002">张佳佳</option>
																								   
																									<option value="000003">张爽</option>
																								   
																									<option value="000006">张爽</option>
																								   
																									<option value="000011">张爽</option>
																								   
																									<option value="000012">张爽</option>
																								   
																									  
																						  												
																								
																							</select><span id="selectProjectPI-error" class="help-block help-block-error valid" style="display: none;"></span>
																						</div>
																					</div>
																					<div class="form-group has-success">
																						<label class="control-label col-md-3">课题开始时间 <span class="required" aria-required="true"> * </span></label>
																						<div class="col-md-4">
																							
																								     
																									 
																										<div class="input-group date-picker input-daterange" data-date="2017-01-01" data-date-format="yyyy-mm-dd">
																										  	<input type="text" class="form-control" name="fromtime" value="2017.03.30" aria-required="true" aria-describedby="fromtime-error"><span id="fromtime-error" class="help-block help-block-error valid" style="display: none;"></span>
																									   </div>
																										  
																							  
																							
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
																							<button type="button" class="btn blue button-next" id="tabone-btn"><span class="md-click-circle md-click-animate" style="height: 0px; width: 0px; top: 552px; left: 720px;"></span>
																								下一步 <i class="m-icon-swapright m-icon-white"></i>
																							</button>
																						
																						</div>
																					</div>
																				</div>
																				
																			</div>
																			
											<div class="tab-pane" id="tab2">
											<div class="row">
											   <div class="col-md-12" style="margin-bottom:8px;">
											      <span class="tjbjq">条件编辑器</span>
											   </div>
											</div>
													<div class="row well no-border no-margin no-padding">
															<div class="col-md-12 margin-top-10">
																<div class="center">
																<label class="control-label" style="float:left"><b>条件编辑</b></label>
																	<div class="form-group search-group no-padding search" data="病历_基本信息_性别" data-type="4" data-hastime="undefined" data-id="000027">
																		<input type="text" class="form-control keyinput" placeholder="搜索项" name="search" value="" autocomplete="off" style="width:120px;">
																	</div>
																	
																	<div class="form-group  no-padding">
																		<select class="form-control relationship-select" name="relationship"><option value="等于">等于</option><option value="不等于">不等于</option><option value="包含">包含</option><option value="不包含">不包含</option></select>
																	</div>
																	
																	<div class="form-group input3" style="width:220px;"><select class="form-control select-input" name="lastdata"><option value="女">女</option><option value="未知的性别">未知的性别</option><option value="未说明的性别">未说明的性别</option><option value="男">男</option></select></div> 
																	<div class="form-group hidden">
																		<select class="form-control units" name="units"></select>
																		</div>
																	<div class=" ensure-group">
																			<button type="button" class="btn green ensure" style="margin-left:10px;height: 34px;line-height: 14px;"><span class="md-click-circle md-click-animate" style="height: 56px; width: 56px; top: -2px; left: 13.5px;"></span>确定</button>
																		</div>
																</div>
															</div>
														</div>
													
														<div class="conditions-group">
															
															<div class="showbox swiper-container swiper-container-horizontal">
																<div class="conditions-container-box swiper-wrapper" style="transition-duration: 0ms;">
																			<div class="conditions-container swiper-slide active swiper-slide-active" style="width: 211.5px; margin-right: 10px;">
																				<div>
																					<div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto;"><ol class="ui-droppable" style="overflow: hidden; width: auto;"><li title="性别等于女" class="ui-draggable"><span class="s1" data="病历_基本信息_性别">性别</span><span class="s2" data="等于">等于</span><span class="s3" data="女">女</span><span class="s4" data=""></span><i class="fa fa-close close-li"></i></li></ol><div class="slimScrollBar" style="background: rgb(0, 0, 0); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px;"></div><div class="slimScrollRail" style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
																					<div class="bottom-bar"><i class="fa fa-close"></i></div>
																				</div>
																			</div>
																			<div class="conditions-container swiper-slide swiper-slide-next" style="width: 211.5px; margin-right: 10px;">
																				<div>
																					<div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto;"><ol class="ui-droppable" style="overflow: hidden; width: auto;"></ol><div class="slimScrollBar" style="background: rgb(0, 0, 0); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: none; border-radius: 7px; z-index: 99; right: 1px; height: 205px;"></div><div class="slimScrollRail" style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
																					<div class="bottom-bar"><i class="fa fa-close"></i></div>
																				</div>
																			</div>
																			<div class="conditions-container swiper-slide" style="width: 211.5px; margin-right: 10px;">
																				<div>
																					<div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto;"><ol class="ui-droppable" style="overflow: hidden; width: auto;"></ol><div class="slimScrollBar" style="background: rgb(0, 0, 0); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: none; border-radius: 7px; z-index: 99; right: 1px; height: 205px;"></div><div class="slimScrollRail" style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
																					<div class="bottom-bar"><i class="fa fa-close"></i></div>
																				</div>
																			</div>
																			<div class="conditions-container swiper-slide" style="width: 211.5px; margin-right: 10px;">
																				<div>
																					<div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto;"><ol class="ui-droppable" style="overflow: hidden; width: auto;"></ol><div class="slimScrollBar" style="background: rgb(0, 0, 0); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: none; border-radius: 7px; z-index: 99; right: 1px; height: 205px;"></div><div class="slimScrollRail" style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
																					<div class="bottom-bar"><i class="fa fa-close"></i></div>
																				</div>
																			</div>
																			<div class="conditions-container swiper-slide" style="width: 211.5px; margin-right: 10px;">
																				<div>
																					<div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto;"><ol class="ui-droppable" style="overflow: hidden; width: auto;"></ol><div class="slimScrollBar" style="background: rgb(0, 0, 0); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px;"></div><div class="slimScrollRail" style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
																					<div class="bottom-bar"><i class="fa fa-close"></i></div>
																				</div>
																			</div>
																			<div class="conditions-container swiper-slide" style="width: 211.5px; margin-right: 10px;">
																				<div>
																					<div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto;"><ol class="ui-droppable" style="overflow: hidden; width: auto;"></ol><div class="slimScrollBar" style="background: rgb(0, 0, 0); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px;"></div><div class="slimScrollRail" style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
																					<div class="bottom-bar"><i class="fa fa-close"></i></div>
																				</div>
																			</div>
										 									
															  </div>
															 
														  </div>
									     				</div>
									     				<b class="border-common plus-conditions-container">+</b> 
									     				<!-- <div class="btn-group btn-group-xs conditionsPage-btn-group">
															<button type="button" class="btn prev"><i class="fa fa-caret-left"></i></button>
															
															<button type="button" class="btn next"><i class="fa fa-caret-right"></i></button>
														</div> -->
														 <!-- 如果需要导航按钮 -->
															    <div class="swiper-button-prev swiper-button-disabled"></div>
															    <div class="swiper-button-next"></div>
														<div class="conditions-equation">
															
															<div class="border-common">
																	<span class="equation">(性别等于女)</span>
																	<span class="look-btn"><i class="eg-num" style="outline: 0px; box-shadow: rgba(187, 199, 121, 0) 0px 0px 13px; outline-offset: 20px;">1525</i>例<span>点击查看&gt;&gt;</span></span>
															</div>
														</div>
														<div class="row no-padding no-margin">
											   	 
													
														<div class="table-scrollable res_tab1 hidden">
															 <table class="table table-striped table-hover table-noborder text-center"><tbody>
															 	<tr class="first-tr">
															 		<td colspan="6" class="text-right"><a class="export" data-toggle="modal" href="#responsive"><img src="img/export_icon_btn.png" alt="导出数据">导出</a></td>
															 	</tr>
															 	<tr class="first-th"><th>序号</th><th>性别</th><th>年龄</th><th>诊断</th><th>就诊次数</th><th>操作</th></tr><tr><td>1</td><td>女</td><td>83</td><td title="冠心病 不稳定性心绞痛 心界不大 心律齐 心功能Ⅱ级 腔隙性脑梗死 陈旧性肺结核 肝囊肿 骨关节病 卵巢良性肿瘤切除术后 痔疮术后" class="text-left">冠心病 不稳定性心绞痛 心界不大 心律齐 心功能Ⅱ级 腔隙性脑梗死 陈旧性肺结核 肝囊肿 骨关节病 卵巢良性肿瘤切除术后...</td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>2</td><td>女</td><td>86</td><td title="冠状动脉性心脏病 不稳定性心绞痛 心界不大 心律齐 心功能Ⅱ级(NYHA) 高血压病3级,极高危 高脂血症" class="text-left">冠状动脉性心脏病 不稳定性心绞痛 心界不大 心律齐 心功能Ⅱ级(NYHA) 高血压病3级,极高危 高脂血症...</td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>3</td><td>女</td><td>46</td><td title="慢性心力衰竭急性加重 扩张型心肌病 心脏扩大 心律齐 心功能Ⅲ级(NYHA) 高血压病 高脂血症 支气管哮喘 忧郁症" class="text-left">慢性心力衰竭急性加重 扩张型心肌病 心脏扩大 心律齐 心功能Ⅲ级(NYHA) 高血压病 高脂血症 支气管哮喘 忧郁症...</td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>4</td><td>女</td><td>58</td><td title="冠状动脉性心脏病 不稳定型心绞痛 心界不大 心律齐 心功能I级（NYHA分级） 高血压1级 高脂血症 2型糖尿病 胆囊切除术后" class="text-left">冠状动脉性心脏病 不稳定型心绞痛 心界不大 心律齐 心功能I级（NYHA分级） 高血压1级 高脂血症 2型糖尿病 胆囊切...</td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>5</td><td>女</td><td>69</td><td title="高血压病3级，极高危 Hypertension class3 very high risk 高脂血症 dyslipidemia 腔隙性脑梗死 lacunar infarction 陈旧性心肌梗死 aged myocardial infarction" class="text-left">高血压病3级，极高危 Hypertension class3 very high risk 高脂血症 dyslipide...</td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>6</td><td>女</td><td>74</td><td title="心律失常-阵发性心房颤动 高血压3级 支气管哮喘 甲状腺功能减退" class="text-left">心律失常-阵发性心房颤动 高血压3级 支气管哮喘 甲状腺功能减退...</td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>7</td><td>女</td><td>81</td><td title="冠状动脉性心脏病 不稳定性心绞痛 心律齐 心界不大 心功能Ⅱ级 高血压病3级，极高危 2型糖尿病" class="text-left">冠状动脉性心脏病 不稳定性心绞痛 心律齐 心界不大 心功能Ⅱ级 高血压病3级，极高危 2型糖尿病...</td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>8</td><td>女</td><td>63</td><td title="胸痛原因待查 高血压病1级，极高危 2型糖尿病 高脂血症 抑郁症 结肠癌术后" class="text-left">胸痛原因待查 高血压病1级，极高危 2型糖尿病 高脂血症 抑郁症 结肠癌术后...</td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>9</td><td>女</td><td>73</td><td title="心律失常-室性早搏 高血压病，2级，高危" class="text-left">心律失常-室性早搏 高血压病，2级，高危...</td><td>2</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>10</td><td>女</td><td>57</td><td title="冠状动脉性心脏病 不稳定型心绞痛 心脏不大 心律齐 心功能I级（NYHA） 糖耐量异常 高脂血症 类风湿性关节炎" class="text-left">冠状动脉性心脏病 不稳定型心绞痛 心脏不大 心律齐 心功能I级（NYHA） 糖耐量异常 高脂血症 类风湿性关节炎...</td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td colspan="6"><div class="pageToolbar1"></div></td></tr></tbody></table>
												</div>
											   </div>
														<div class="form-actions">
														     <div class="row">
																<div class="col-md-offset-4 col-md-9">
																	<a href="javascript:;" class="btn default button-previous" style="display: inline-block;">
																		<i class="m-icon-swapleft"></i> 上一步
																	</a>
																	<button type="button" class="btn blue button-next" id="tabtwo-btn"><span class="md-click-circle md-click-animate" style="height: 0px; width: 0px; top: 613px; left: 820px;"></span>
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
											<div class="group-box"> 	
											   	<div class="row big-group">
											   		<div class="name-group">
											   			<input type="text" class="group-name" value="A组" name="group-name">
											   			
											   		</div>
											   		<div class="col-md-9 no-padding">
											   			
											   			
											   			<div class="form-group margin-top-10 search-group">
											   				
															<div class="search" data="病历_基本信息_性别" data-type="4" data-hastime="undefined" data-id="000027">
																<input type="text" class="form-control keyinput" placeholder="搜索项" name="search" value="">
															</div>
														</div>
														<div class="form-group relationship-group">
															  <div class="margin-top-10">
																	<select class="form-control relationship-select" name="relationship"><option value="等于">等于</option><option value="不等于">不等于</option><option value="包含">包含</option><option value="不包含">不包含</option></select>
														       </div>
														</div>
														<div class="form-group input3-group">
																		<div class="margin-top-10 input3"><select class="form-control select-input" name="lastdata"><option value="女">女</option><option value="未知的性别">未知的性别</option><option value="未说明的性别">未说明的性别</option><option value="男">男</option></select></div>
																		<div class="margin-top-10 hidden">
																		<select class="form-control units" name="units"></select>
																		</div>
																		
														</div>
														<div class="no-padding col-md-2 big btn-group">
															<b class="plus-group" title="添加分组"><i class="fa fa-plus-circle"></i></b>
														</div>
													 
											   		</div>
											   		<div class="col-md-2 no-padding">
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
												   		<div class="col-md-9 no-padding">
												   			
												   			
												   			<div class="form-group margin-top-10 other-group" style="margin-top: 12px;">
												   				
																<div>
																	<input type="text" class="form-control" placeholder="正常分组外剩余样本" name="search" value="" autocomplete="off">
																</div>
															</div>
														</div>
												   		<div class="col-md-2 no-padding">
												   			<div class="btn-group">
												   				<b class="plus-children" title="添加子分组"><i class="fa fa-plus"></i>  添加亚组</b>
															</div>
												   		</div>
												   	</div>
												</div>							   
											   </div>
											   <div class="row resure-group no-padding text-right">
											   	  
											   	  <div class="resure-btn col-md-12 no-padding"><button type="button" class="btn green btn-sm"><span class="md-click-circle md-click-animate" style="height: 84px; width: 84px; top: -30px; left: 20.25px;"></span> 确定分组 </button></div>
											   </div>
											   
											   
											   <div class="no-action  hidden">
											   	 <img src="img/no_table.png" alt="没有操作" class="">
											   	 <img src="img/loading.gif" alt="loading" class="hidden">
											   </div>
											   <div class="result-tab">
											   	<div class="num-info"><span>总样本</span><i id="sum">1525</i></div>
											   	<div class="tabbable-line">
								<ul class="nav nav-tabs " id="group_ul"><li class="active"><a>A组（<span>1525</span>例）</a></li><li><a>其他（<span>0</span>例）</a></li></ul>
								
								<div class="tab-content result-tab-content"><div class="tab-pane active"><div class="row no-padding no-margin"><div class="result-info"><div class="set-eg"><span>设置样本量</span><input type="number" name="set-eg-input" class="set-eg-input">例</div></div><div class="table-scrollable"><table class="table table-striped table-hover table-noborder text-center bigG"><tbody><tr><th>序号</th><th>性别</th><th>年龄</th><th>诊断</th><th>就诊次数</th><th>操作</th></tr><tr><td>1</td><td>女</td><td>68</td><td class="text-left" title="冠状动脉粥样硬化性心脏病 心功能Ⅱ级(NYHA分级) 冠状动脉支架植入术后状态 糖耐量异常 阑尾术后 甲状腺术后">冠状动脉粥样硬化性心脏病 心功能Ⅱ级(NYHA分级) 冠状动脉支架植入术后状态 ...</td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>2</td><td>女</td><td>77</td><td class="text-left" title="undefined"></td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>3</td><td>女</td><td>68</td><td class="text-left" title="高血压3级 周围血管支架植入术后状态 高脂血症 脂肪肝 肝囊肿 动脉粥样硬化">高血压3级 周围血管支架植入术后状态 高脂血症 脂肪肝 肝囊肿 动脉粥样硬化</td><td>0</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>4</td><td>女</td><td>62</td><td class="text-left" title="undefined"></td><td>2</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>5</td><td>女</td><td>42</td><td class="text-left" title="undefined"></td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>6</td><td>女</td><td>62</td><td class="text-left" title="不稳定性心绞痛 冠状动脉粥样硬化性心脏病 心功能I级(NYHA分级) 房间隔缺损 高血压2级 高脂血症 胃溃疡">不稳定性心绞痛 冠状动脉粥样硬化性心脏病 心功能I级(NYHA分级) 房间隔缺损...</td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>7</td><td>女</td><td>72</td><td class="text-left" title="不稳定性心绞痛 冠状动脉粥样硬化性心脏病 频发性房性期前收缩 心功能I级(NYHA分级) 高血压3级 高脂血症 慢性肾功能不全">不稳定性心绞痛 冠状动脉粥样硬化性心脏病 频发性房性期前收缩 心功能I级(NYH...</td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>8</td><td>女</td><td>28</td><td class="text-left" title="undefined"></td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>9</td><td>女</td><td>79</td><td class="text-left" title="阑尾术后 不稳定性心绞痛 冠状动脉粥样硬化性心脏病 心功能I级(NYHA分级) 高血压2级 高脂血症 颈内动脉闭塞 肝囊肿 后天性肾囊肿 皮质延髓小脑萎缩">阑尾术后 不稳定性心绞痛 冠状动脉粥样硬化性心脏病 心功能I级(NYHA分级) ...</td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td>10</td><td>女</td><td>78</td><td class="text-left" title="undefined"></td><td>1</td><td><i class="fa fa-trash-o"></i></td></tr><tr><td colspan="6"><div class="page pageToolbarA_0"><div id="Paging_05748776808141174" class="ui-paging-container"><ul><li class="js-page-first js-page-action ui-pager ui-pager-disabled">首页</li><li class="js-page-prev js-page-action ui-pager ui-pager-disabled">上一页</li><li data-page="1" class="ui-pager focus">1</li><li data-page="2" class="ui-pager">2</li><li data-page="3" class="ui-pager">3</li><li class="ui-paging-ellipse">...</li><li data-page="153" class="ui-pager">153</li><li class="js-page-next js-page-action ui-pager">下一页</li><li class="js-page-last js-page-action ui-pager">末页</li><li class="ui-paging-toolbar"><select class="ui-select-pagesize"><option value="5">5条/页</option><option value="10">10条/页</option><option value="15">15条/页</option><option value="20">20条/页</option></select><input type="text" class="ui-paging-count"><a href="javascript:void(0)">跳转</a></li></ul></div></div></td></tr></tbody></table></div></div></div><div class="tab-pane"><div class="row no-padding no-margin"><div class="result-info"><div class="set-eg"></div></div><div class="table-scrollable"><table class="table table-striped table-hover table-noborder text-center bigG"><tbody><tr><th>序号</th><th>性别</th><th>年龄</th><th>诊断</th><th>就诊次数</th><th>操作</th></tr><tr><td colspan="6">没有数据</td></tr></tbody></table></div></div></div></div>
							</div>
						</div>
						<div class="form-actions">
						     <div class="row">
								<div class="col-md-offset-4 col-md-9">
									<a href="javascript:;" class="btn default button-previous" id="next3_btn" style="display: inline-block;">
										<i class="m-icon-swapleft"></i> 上一步
									</a>
									<button type="button" class="btn blue button-next next3" id="tabthree-btn"><span class="md-click-circle md-click-animate" style="height: 0px; width: 0px; top: 1005px; left: 791px;"></span>
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
						<div class="tab-pane active" id="tab4">
							
							
<div class="varpanel4 u_panel hidden">
								  <div class="row no-padding group-var">
											   			
											   			
											   			<div class="form-group search-group">
											   				
															<div class="search">
																<input type="text" class="form-control keyinput" placeholder="搜索项" name="search" value="">
															</div>
														</div>
														<div class="form-group relationship-group hidden">
															  <div class="">
																	<select class="form-control relationship-select" name="relationship">
																		
																	</select>
														       </div>
														</div>
														<div class="form-group input3-group hidden">
														<div class="input3"><select class="form-control select-input" name="lastdata"><option value="女">女</option><option value="未知的性别">未知的性别</option><option value="未说明的性别">未说明的性别</option><option value="男">男</option></select></div>
														</div>
														<div class="no-padding form-btn-group">
															<i class="fa fa-check"></i><i class="fa  fa-times"></i>
																			
														</div>
													 
											   		</div>
</div>
<div class="num_panel hidden u_panel">
									 <!-- <img src="img/arrow.png" class="arrow"/> --> 
									
									<div style="clear:both;"></div>
									<div class="form-group">
										
										
										<input type="text" class="form-control input-xsmall inline">
										-
										<input type="text" class="form-control input-xsmall inline">
										<select class="form-control input-xsmall inline">
											<option>岁</option>
											<option>月</option>
											<option>周</option>
											
										</select>
										值代码<input type="number" class="form-control input-xsmall inline" name="numcode10" value="0">
										<span class="action-btn">
										<b class="plus-group hidden" title="添加"><i class="fa fa-plus-circle"></i></b>
										<b class="del-this"><i class="fa fa-minus-circle" title="删除"></i></b></span>
									</div>
									<div class="form-group">
										
										
										<input type="text" class="form-control input-xsmall inline">
										-
										<input type="text" class="form-control input-xsmall inline">
										<select class="form-control input-xsmall inline">
											<option>岁</option>
											<option>月</option>
											<option>周</option>
											
										</select>
										值代码<input type="number" class="form-control input-xsmall inline" name="numcode10" value="1">
											<span class="action-btn">
												<b class="plus-group" title="添加"><i class="fa fa-plus-circle"></i></b><b class="del-this"><i class="fa fa-minus-circle" title="删除"></i></b>
											</span>
									</div>
									<div class="text-right bottom-btngroup">
										<span class="btn btn-xs green adddata">确定</span><span class="btn btn-xs">取消</span>
									</div>
								</div>
	<div class="time_panel hidden u_panel">
									<!-- <img src="img/arrow.png" class="arrow"/> -->
									<div class="form-group typetime-choose">
										<label><div class="radio"><span class="checked"><input type="radio" name="time10" class="jcheck" checked="checked"></span></div> 相对时间</label>
										<label><div class="radio"><span><input type="radio" name="time10" class="jcheck"></span></div> 绝对时间</label>
										
									</div>
									
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
										<input type="text" class="form-control input-xsmall inline timedata">
										<select class="form-control input-xsmall inline">
											<option>之前</option>
											<option>之后</option>
											<option>当天</option>
										</select>
										<input type="number" class="form-control input-xsmall inline">
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
										
										<b class="plus-group" title="添加"><i class="fa fa-plus-circle"></i></b>
										<b class="del-this hidden"><i class="fa fa-minus-circle" title="删除"></i></b>
										
									</div> 
									<div class="form-group group-relativeTime bottom-btngroup">
										<label>指标次数</label>
										<label><div class="radio"><span class="checked"><input type="radio" name="times10" class="jcheck" checked="checked"></span></div> 全部指标</label>
										<label><div class="radio"><span><input type="radio" name="times10" class="jcheck"></span></div> 第一次</label>
										<label><div class="radio"><span><input type="radio" name="times10" class="jcheck"></span></div> 最后（最近）一次</label>
									</div>
									<div class="form-group group-absoluteTime hidden">
										<div class="input-group input-large date-picker input-daterange" data-date="10/11/2012" data-date-format="mm/dd/yyyy">
												<input type="text" class="form-control" name="from10" placeholder="起始时间">
												<span class="input-group-addon">
												-</span>
												<input type="text" class="form-control" name="to10" placeholder="结束时间">
											</div>
									</div>
									<div class="text-right">
										<span class="btn btn-xs green">确定</span><span class="btn btn-xs">取消</span>
									</div>
								</div>							
							<a id="control" data-toggle="modal" href="#static"></a>
						<div class="row">
							<div id="static" class="modal fade" tabindex="-1" data-backdrop="static" data-keyboard="false" aria-hidden="true" style="display: none;">
								<div class="modal-dialog choose-var">
									<div class="modal-content">
										<div class="modal-header">
											
											<h4 class="modal-title">选择统计模型</h4>
										</div>
										<div class="modal-body row method-modal"><div class="method-modal-body"><h4 class="method-modal-title">比较均值分析</h4><div class=" method-group"><b>参数</b><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-grey checked" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000010" data-remark="2" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>独立样本T检验</label><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000011" data-remark="2" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>配对样本T检验</label><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000012" data-remark="3" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>单因素方差分析</label></div></div></div><div class=" method-group"><b>非参数</b><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000013" data-remark="2" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>两个独立样本检验</label><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000014" data-remark="3" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>多个独立样本检验</label><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000015" data-remark="2" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>两个关联样本检验</label><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000016" data-remark="3" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>多个关联样本检验</label></div></div></div></div><div class="method-modal-body"><h4 class="method-modal-title">logistic回归</h4><div class=" method-group group-two"><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000017" data-remark="undefined" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>二元logistic回归</label><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000018" data-remark="3" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>有序logistic回归</label><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000019" data-remark="3" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>多项logistic回归</label></div></div></div></div><div class="method-modal-body"><h4 class="method-modal-title">相关分析</h4><div class=" method-group group-two"><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000020" data-remark="1" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>双变量相关</label><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000021" data-remark="1" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>偏相关</label><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000022" data-remark="1" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>距离相关</label></div></div></div></div><div class="method-modal-body"><h4 class="method-modal-title">Cox回归</h4><div class=" method-group group-two"><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000023" data-remark="3" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>Cox回归</label></div></div></div></div><div class="method-modal-body"><h4 class="method-modal-title">Roe曲线</h4><div class=" method-group group-two"><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000024" data-remark="undefined" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>Roe曲线</label></div></div></div></div><div class="method-modal-body"><h4 class="method-modal-title">线性回归</h4><div class=" method-group group-two"><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000025" data-remark="1" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>线性回归方法</label></div></div></div></div><div class="method-modal-body"><h4 class="method-modal-title">定性数据分析方法</h4><div class=" method-group group-two"><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000026" data-remark="3" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0; cursor: pointer;"></ins></div>定性数据分析方法</label></div></div></div></div></div>
										<div class="modal-footer " style="text-align: center;">
											<button type="button" data-dismiss="modal" class="btn green add_method-btn"><span class="md-click-circle md-click-animate" style="height: 56px; width: 56px; top: -9px; left: -2.48438px;"></span>确定</button>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="main">
							<ul class="nav nav-tabs method-ul">
								<li class="dropdown method-dropdown choose-var">
											<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
											统计方法 <i class="fa fa-angle-down"></i>
											</a>
											<div class="dropdown-menu" role="menu">
												<div class="method-modal-body"><div class="method-modal-body"><h4 class="method-modal-title">比较均值分析</h4><div class=" method-group"><b>参数</b><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000010" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>独立样本T检验</label><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000011" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>配对样本T检验</label><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000012" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>单因素方差分析</label></div></div></div><div class=" method-group"><b>非参数</b><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000013" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>两个独立样本检验</label><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000014" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>多个独立样本检验</label><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000015" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>两个关联样本检验</label><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000016" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>多个关联样本检验</label></div></div></div></div><div class="method-modal-body"><h4 class="method-modal-title">logistic回归</h4><div class=" method-group group-two"><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000017" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>二元logistic回归</label><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000018" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>有序logistic回归</label><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000019" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>多项logistic回归</label><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000025" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>线性回归方法</label></div></div></div></div><div class="method-modal-body"><h4 class="method-modal-title">相关分析</h4><div class=" method-group group-two"><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000020" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>双变量相关</label><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000021" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>偏相关</label><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000022" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>距离相关</label></div></div></div></div><div class="method-modal-body"><h4 class="method-modal-title">Cox回归</h4><div class=" method-group group-two"><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000023" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>Cox回归</label></div></div></div></div><div class="method-modal-body"><h4 class="method-modal-title">Roe曲线</h4><div class=" method-group group-two"><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000024" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>Roe曲线</label></div></div></div></div><div class="method-modal-body"><h4 class="method-modal-title">线性回归</h4><div class=" method-group group-two"><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000025" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>线性回归方法</label></div></div></div></div><div class="method-modal-body"><h4 class="method-modal-title">定性数据分析方法</h4><div class=" method-group group-two"><div class="input-group"><div class="icheck-inline"><label><div class="icheckbox_minimal-blue" style="position: relative;"><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="000026" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>定性数据分析方法</label></div></div></div></div></div>
											<span class="btn btn-sm add_method-btn blue" style="float:right;">确定</span>
											</div>
								</li>
							<li class="active"><a href="#tab_000010" data-toggle="tab">独立样本T检验 <i class="fa fa-close"></i></a></li></ul>
							<div class="tab-content">
								<div class="tab-pane fade in active" id="tab_000010">
									<div class="hxkz margin-top-20 ">
										<div class="checker"><span><input type="checkbox" name="hxkz10"></span></div>混淆控制
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
										<div class="chose-group-body" id="g10"><span class="block-group btn active" data-groupid="1489650698486">A组（1525例）</span><span class="block-group btn disabled" data-groupid="1489650698539">其他（0例）</span></div>
									</div>
									<div class="border-gray bcgk-gray inset-shadow box padding-10 margin-top-10 zxqj-box">
										<div>
											<label for="zxqj">置信区间百分比：</label><input type="text" value="95" name="zxqj" class="zxqj">%
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>缺失值：</b><label for="qsz10"><div class="iradio_minimal-grey checked" style="position: relative;"><input type="radio" name="qsz10" class="icheck" checked="checked" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>按分析顺序排除个案</label>&nbsp;&nbsp;&nbsp;&nbsp;<label for="qsz10"><div class="iradio_minimal-grey disabled" style="position: relative;"><input type="radio" name="qsz10" class="icheck" disabled="disabled" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>按列表排除个案</label>
										</div>
									</div>
									<div class="result-btn-box text-right">
										<button class="btn green">数据预览</button>
										<button class="btn green">生成结果</button>
									</div>
									<div class="res-box margin-top-20 hidden">
									
								<!-- <div class="tabpadding">
										<table class="table table-advance table-right-border text-center">
								<thead>
								<tr class="closetr">
								<td colspan="6">
										<span class="group">A组+B组</span>
										<span class="close close-resbox">关闭</span>
								</td>
								</tr>
								<tr>
									<th colspan="4" class="text-left bcgk-gray">
										独立样本T检验
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
										<td rowspan="2">出院年龄</td>
										<td>假设方差相等</td><td>-4.57</td><td class="fred">0.000</td><td>-4.36</td><td>-1.71</td>
									</tr>
									<tr>
										
										<td>假设方差不相等</td><td>-4.65</td><td class="fred">0.000</td><td>-4.34</td><td>-1.73</td>
									</tr>
									<tr class="bcgk-sp">
										<td rowspan="2">BMI</td>
										<td>假设方差相等</td><td>-0.856</td><td class="fred">0.000</td><td>-0.510</td><td>0.204</td>
									</tr>
									<tr class="bcgk-sp">
										
										<td>假设方差不相等</td><td>-0.854</td><td class="fred">0.000</td><td>-0.503</td><td>0.197</td>
									</tr>									
								</tbody>	
								
								</table>
								</div> -->
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
									<th>
										组别
									</th>
									<th>
										科研变量
									</th>
									<th>
										数据完整度
									</th>
									<th>
										数据占比
									</th>
									
								</tr>
								</thead>
								<tbody>
									<tr class="border-bottom">
										<td rowspan="3" class="bcgk-gray ">A组</td>
										
									</tr>
									<tr class="bcgk-sp">
									<td>出院年龄</td>
									<td class="pernum">有数据：1525&nbsp;&nbsp;&nbsp;&nbsp;空：0</td>
									<td class="pertd"><div class="progress progress-mini"><div class="progress-bar" style="width:100%;"></div></div>100%</td>
									</tr>
									<tr class="bcgk-sp border-bottom">
										<td>BMI</td>
										<td class="pernum">有数据：1281&nbsp;&nbsp;&nbsp;&nbsp;空:244</td>
									<td class="pertd"><div class="progress progress-mini"><div class="progress-bar" style="width:84%;"></div></div>84%</td>
									</tr>
									
									<tr>
										<td rowspan="3" class="bcgk-gray">B组</td>
										
									</tr>
									<tr class="bcgk-sp">
									<td>出院年龄</td>
									<td class="pernum">有数据：189&nbsp;&nbsp;&nbsp;&nbsp;空：84</td>
									<td class="pertd">
									 <div class="progress progress-mini">
	                                      <div class="progress-bar" style="width: 80%;"></div>
	                                 </div>
	                                 67%
	                                </td>
									</tr>
									<tr class="bcgk-sp border-bottom">
										<td>BMI</td>
										<td class="pernum">有数据：248&nbsp;&nbsp;&nbsp;&nbsp;空：34</td>
									<td class="pertd">
									 <div class="progress progress-mini">
	                                      <div class="progress-bar" style="width: 80%;"></div>
	                                 </div>
	                                 88%
	                                </td>
									</tr>
									
									
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
								<div class="back-gray box padding-10 margin-top-10 xgxs-box padding-bottom-35 inset-shadow">
									<div class="border-deepgray ">
										<span class="title">相关系数</span>
										<div class="form-group">
											<label><div class="icheckbox_minimal-red checked" style="position: relative;"><input type="checkbox" class="icheck" name="xgxs" data-checkbox="icheckbox_minimal-red" checked="checked" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>Pearson</label>
											<label><div class="icheckbox_minimal-red" style="position: relative;"><input type="checkbox" class="icheck" name="xgxs" data-checkbox="icheckbox_minimal-red" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>Kendall的tau-b</label>
											<label><div class="icheckbox_minimal-red" style="position: relative;"><input type="checkbox" class="icheck" name="xgxs" data-checkbox="icheckbox_minimal-red" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>Spearman</label>
										</div>
									</div>
									<div class="border-deepgray xzxjy">
										<span class="title">显著性检验</span>
										<div class="form-group">
											<label><div class="icheckbox_minimal-red checked" style="position: relative;"><input type="checkbox" class="icheck" name="xzxjy" data-checkbox="icheckbox_minimal-red" checked="checked" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>双侧检验</label>
											<label><div class="icheckbox_minimal-red" style="position: relative;"><input type="checkbox" class="icheck" name="xzxjy" data-checkbox="icheckbox_minimal-red" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>单侧检验</label>
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
											<tr>
												<td rowspan="2">年龄</td>
												<td>假设方差相等</td><td>.0801</td><td>0.921</td><td>-5.78</td><td>6.38</td>
											</tr>
											<tr>
												
												<td>假设方差不相等</td><td class="fred">.0427</td><td>0.921</td><td>-5.83</td><td>6.44</td>
											</tr>
											<tr class="bcgk-sp">
												<td rowspan="2">血同型半胱氨酸</td>
												<td>假设方差相等</td><td>.874</td><td>0.921</td><td>-5.78</td><td>6.38</td>
											</tr>
											<tr class="bcgk-sp">
												
												<td>假设方差不相等</td><td class="fred">.0478</td><td>0.921</td><td>-5.83</td><td>6.44</td>
											</tr>
											<tr>
												<td rowspan="2">超敏C反应蛋白</td>
												<td>假设方差相等</td><td>.0918</td><td>0.921</td><td>-5.78</td><td>6.38</td>
											</tr>
											<tr>
												
												<td>假设方差不相等</td><td class="fred">.0379</td><td>0.921</td><td>-5.83</td><td>6.44</td>
											</tr>
											<tr class="bcgk-sp">
												<td rowspan="2">纤维蛋白原</td>
												<td>假设方差相等</td><td>.0998</td><td>0.921</td><td>-5.78</td><td>6.38</td>
											</tr>
											<tr class="bcgk-sp">
												
												<td>假设方差不相等</td><td>.0789</td><td>0.921</td><td>-5.83</td><td>6.44</td>
											</tr>
											<tr>
												<td rowspan="2">D-二聚体定量</td>
												<td>假设方差相等</td><td>.0635</td><td>0.921</td><td>-5.78</td><td>6.38</td>
											</tr>
											<tr>
												
												<td>假设方差不相等</td><td>.0914</td><td>0.921</td><td>-5.83</td><td>6.44</td>
											</tr>
										</tbody>	
										</table>
									</div>
								</div>
								<div class="tab-pane fade" id="tab_000017">
									<div class="tab-pane fade in" id="tab_000010">
									<div class="hxkz margin-top-20 ">
										<div class="checker"><span><input type="checkbox" class="i-checks" name="hxkz17"></span></div>混淆控制
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
										<div class="chose-group-body" id="g17"><span class="block-group btn active" data-groupid="1489650698486">A组（1525例）</span><span class="block-group btn disabled" data-groupid="1489650698539">其他（0例）</span></div>
									</div>
									<div class="border-gray bcgk-gray inset-shadow box padding-10 margin-top-10 zxqj-box">
										<div>
											<label for="zxqj">置信区间百分比：</label><input type="text" value="95" name="zxqj" class="zxqj">%
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>缺失值：</b><label for="qsz17"><div class="iradio_minimal-grey checked" style="position: relative;"><input type="radio" name="qsz17" class="icheck" checked="checked" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>按分析顺序排除个案</label>&nbsp;&nbsp;&nbsp;&nbsp;<label for="qsz17"><div class="iradio_minimal-grey disabled" style="position: relative;"><input type="radio" name="qsz17" class="icheck" disabled="disabled" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>按列表排除个案</label>
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
												<td>假设方差相等</td><td>.0908</td><td>0.921</td><td>-5.78</td><td>6.38</td>
											</tr>
											<tr>
												
												<td>假设方差不相等</td><td class="fred">0.498</td><td>0.921</td><td>-5.83</td><td>6.44</td>
											</tr>
											<tr class="bcgk-sp">
												<td rowspan="2">血同型半胱氨酸</td>
												<td>假设方差相等</td><td>0.998</td><td>0.921</td><td>-5.78</td><td>6.38</td>
											</tr>
											<tr class="bcgk-sp">
												
												<td>假设方差不相等</td><td>0.674</td><td>0.921</td><td>-5.83</td><td>6.44</td>
											</tr>
											<tr>
												<td rowspan="2">超敏C反应蛋白</td>
												<td>假设方差相等</td><td>0.785</td><td>0.921</td><td>-5.78</td><td>6.38</td>
											</tr>
											<tr>
												
												<td>假设方差不相等</td><td>0.757</td><td>0.921</td><td>-5.83</td><td>6.44</td>
											</tr>
											<tr class="bcgk-sp">
												<td rowspan="2">纤维蛋白原</td>
												<td>假设方差相等</td><td class="fred">0.356</td><td>0.921</td><td>-5.78</td><td>6.38</td>
											</tr>
											<tr class="bcgk-sp">
												
												<td>假设方差不相等</td><td>0.998</td><td>0.921</td><td>-5.83</td><td>6.44</td>
											</tr>
											<tr>
												<td rowspan="2">D-二聚体定量</td>
												<td>假设方差相等</td><td>0.789</td><td>0.921</td><td>-5.78</td><td>6.38</td>
											</tr>
											<tr>
												
												<td>假设方差不相等</td><td class="fred">.0468</td><td>0.921</td><td>-5.83</td><td>6.44</td>
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
										<div class="chose-group-body" id="g26"><span class="block-group btn active" data-groupid="1489650698486">A组（1525例）</span><span class="block-group btn disabled" data-groupid="1489650698539">其他（0例）</span></div>
									</div>
									<div class="border-gray bcgk-gray inset-shadow box padding-10 margin-top-10 zxqj-box">
										<div>
											<label for="zxqj">置信区间百分比：</label><input type="text" value="95" name="zxqj" class="zxqj">%
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>缺失值：</b><label for="qsz16"><div class="iradio_minimal-grey checked" style="position: relative;"><input type="radio" name="qsz16" class="icheck" checked="checked" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>按分析顺序排除个案</label>&nbsp;&nbsp;&nbsp;&nbsp;<label for="qsz16"><div class="iradio_minimal-grey disabled" style="position: relative;"><input type="radio" name="qsz16" class="icheck" disabled="disabled" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>按列表排除个案</label>
										</div>
									</div>
									
									<div class="back-gray box padding-10 margin-top-10  padding-bottom-35 inset-shadow">
										<div class="border-deepgray " style="border:0px;">
											<div class="form-group">
											<label>检验类型：</label>
												<label><div class="icheckbox_minimal-red checked" style="position: relative;"><input type="checkbox" class="icheck" name="xgxs" data-checkbox="icheckbox_minimal-red" checked="checked" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>卡方</label>
												<label><div class="icheckbox_minimal-red" style="position: relative;"><input type="checkbox" class="icheck" name="xgxs" data-checkbox="icheckbox_minimal-red" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>KAPPA</label>
												<label><div class="icheckbox_minimal-red" style="position: relative;"><input type="checkbox" class="icheck" name="xgxs" data-checkbox="icheckbox_minimal-red" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div>Mcnemar</label>
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
									<th>
										变量
									</th>
									<th>
										关系
									</th>
									<th>
										值
									</th>
									<th>
										df
									</th>
									<th>
										渐进Sig(双侧)
									</th>
									<th>
										精确Sig(双侧)
									</th>
									
								</tr>
								</thead>
								<tbody>
									<tr>
										<td rowspan="3">冠状动脉旁路移植术</td>
										<td>Pearson卡方</td><td>0.101 </td><td>1 </td><td>0.750</td><td>-</td>
									</tr>
									<tr>
										<td>连续矫正b</td><td>0.033 </td><td>1 </td><td>0.855</td><td>-</td>
									</tr>
									<tr>
										<td>Fisher的精确检验</td><td>- </td><td>-</td><td>-</td><td>0.891</td>
									</tr>
									<tr class="bcgk-sp">
										<td rowspan="3">吸烟史</td>
										<td>Pearson卡方</td><td>3.859</td><td>1</td><td class="fred">0.000</td><td>-</td>
									</tr>
									<tr class="bcgk-sp">
										
										<td>连续矫正b</td><td>3.857</td><td>1</td><td class="fred">0.000</td><td>-</td>
									</tr>
									<tr class="bcgk-sp">
										
										<td>Fisher的精确检验</td><td>-</td><td>-</td><td>-</td><td class="fred">0.000</td>
									</tr>
									<tr>
										<td rowspan="3">胸痛</td>
										<td>Pearson卡方</td><td>3.709 </td><td>1</td><td class="fred">0.000</td><td>-</td>
									</tr>
									<tr>
										<td>连续矫正b</td><td>3.685 </td><td>1</td><td class="fred">0.000</td><td>-</td>
									</tr>
									<tr>
										<td>Fisher的精确检验</td><td>- </td><td>-</td><td>-</td><td class="fred">0.000</td>
									</tr>					
									<tr class="bcgk-sp">
										<td rowspan="3">大汗</td>
										<td>Pearson卡方</td><td>7.537</td><td>1</td><td class="fred">0.000</td><td>-</td>
									</tr>
									<tr class="bcgk-sp">
										
										<td>连续矫正b</td><td>7.503</td><td>1</td><td class="fred">0.000</td><td>-</td>
									</tr>
									<tr class="bcgk-sp">
										
										<td>Fisher的精确检验</td><td>-</td><td>-</td><td>-</td><td class="fred">0.000</td>
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
									<th>
										组别
									</th>
									<th>
										科研变量
									</th>
									<th>
										数据完整度
									</th>
									<th>
										数据占比
									</th>
									
								</tr>
								</thead>
								<tbody>
									<tr class="border-bottom">
										<td rowspan="5" class="bcgk-gray ">A组</td>
										
									</tr>
									<tr class="bcgk-sp">
									<td>冠状动脉旁路移植术</td>
									<td>有数据：130&nbsp;&nbsp;&nbsp;&nbsp;空：152</td>
									<td>
									 <div class="progress progress-mini">
	                                      <div class="progress-bar" style="width: 80%;"></div>
	                                 </div>
	                                 46%
	                                </td>
									</tr>
									<tr class="bcgk-sp">
										<td>吸烟史</td>
										<td>有数据：190&nbsp;&nbsp;&nbsp;&nbsp;空：92</td>
									<td>
									 <div class="progress progress-mini">
	                                      <div class="progress-bar" style="width: 80%;"></div>
	                                 </div>
	                                 67%
	                                </td>
									</tr>
									<tr class="bcgk-sp">
										<td>症状等于胸痛</td>
										<td>有数据：245&nbsp;&nbsp;&nbsp;&nbsp;空：37</td>
									<td>
									 <div class="progress progress-mini">
	                                      <div class="progress-bar" style="width: 80%;"></div>
	                                 </div>
	                                 87%
	                                </td>
									</tr>
									<tr class="bcgk-sp border-bottom">
										<td>症状等于大汗</td>
										<td>有数据：152&nbsp;&nbsp;&nbsp;&nbsp;空：130</td>
									<td>
									 <div class="progress progress-mini">
	                                      <div class="progress-bar" style="width: 80%;"></div>
	                                 </div>
	                                 54%
	                                </td>
									</tr>
									<tr>
										<td rowspan="5" class="bcgk-gray">B组</td>
										
									</tr>
									<tr class="bcgk-sp">
									<td>冠状动脉旁路移植术</td>
									<td>有数据：544&nbsp;&nbsp;&nbsp;&nbsp;空：267</td>
									<td>
									 <div class="progress progress-mini">
	                                      <div class="progress-bar" style="width: 80%;"></div>
	                                 </div>
	                                 67%
	                                </td>
									</tr>
									<tr class="bcgk-sp">
										<td>吸烟史</td>
										<td>有数据：527&nbsp;&nbsp;&nbsp;&nbsp;空：284</td>
									<td>
									 <div class="progress progress-mini">
	                                      <div class="progress-bar" style="width: 80%;"></div>
	                                 </div>
	                                 65%
	                                </td>
									</tr>
									<tr class="bcgk-sp">
										<td>症状等于胸痛</td>
										<td>有数据：600&nbsp;&nbsp;&nbsp;&nbsp;空：211</td>
									<td>
									 <div class="progress progress-mini">
	                                      <div class="progress-bar" style="width: 80%;"></div>
	                                 </div>
	                                 74%
	                                </td>
									</tr>
									<tr class="bcgk-sp border-bottom">
										<td>症状等于大汗</td>
										<td>有数据：584&nbsp;&nbsp;&nbsp;&nbsp;空：228</td>
									<td>
									 <div class="progress progress-mini">
	                                      <div class="progress-bar" style="width: 80%;"></div>
	                                 </div>
	                                 72%
	                                </td>
									</tr>
								</tbody>	
								</table>
									</div>
										</div>
								
								</div>
							</div>
							<div class="form-actions">
									     <div class="row">
											<div class="col-md-offset-4 col-md-9">
												<a href="javascript:;" class="btn default button-previous" style="display: inline-block;">
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
	          										<tbody><tr class="info-li">
	          											
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
	          											<td id="group_td"><span class="block-info bigg"><b>A组</b>:性别等于女</span><br><span class="block-info bigg"><b>其他</b>:性别不等于女</span></td>
	          										</tr>
	          										<tr class="info-li">
	          											
	          											<td><span class="list-title">暴露因素</span>：</td>
	          											<td><span class="block-info">年龄</span><span class="block-info">BMI</span><span class="block-info">冠状动脉旁路移植术</span>
	          												<span class="block-info">吸烟史</span><span class="block-info">症状等于胸痛</span><span class="block-info">症状等于大汗</span>
	          											</td>
	          										</tr>
	          										<!-- <tr class="info-li">
	          											
	          											<td valign="top"><span class="list-title">结局因素</span>：</td>
	          											<td><span class="block-info">冠心病</span></td>
	          										</tr> -->
	          										<tr class="info-li">
	          											
	          											<td valign="top"><span class="list-title">统计结果：</span></td>
	          											<td><span class="block-info"></span></td>
	          										</tr>
	          									</tbody></table>
	          									
	          									
					<!-- END SAMPLE TABLE PORTLET-->
				
				</div>
			</div>
			
			<!--highchart-->
			<div class="row" style="padding:0px 2%;">
				<div class="col-md-12">
					<div id="chart-container1" style="min-width: 310px; height: 500px; margin: 0 auto" data-highcharts-chart="53"><div id="highcharts-xcviqg8-108" class="highcharts-container " style="position: relative; overflow: hidden; width: 310px; height: 500px; text-align: left; line-height: normal; z-index: 0; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);"><svg version="1.1" class="highcharts-root" style="font-family:&quot;Lucida Grande&quot;, &quot;Lucida Sans Unicode&quot;, Arial, Helvetica, sans-serif;font-size:12px;" xmlns="http://www.w3.org/2000/svg" width="310" height="500"><desc>Created with Highcharts 5.0.7</desc><defs><clipPath id="highcharts-xcviqg8-109"><rect x="0" y="0" width="256" height="335" fill="none"></rect></clipPath></defs><rect fill="#ffffff" class="highcharts-background" x="0" y="0" width="310" height="500" rx="0" ry="0"></rect><rect fill="none" class="highcharts-plot-background" x="44" y="51" width="256" height="335"></rect><g class="highcharts-grid highcharts-xaxis-grid "><path fill="none" class="highcharts-grid-line" d="M 86.5 51 L 86.5 386" opacity="1"></path><path fill="none" class="highcharts-grid-line" d="M 128.5 51 L 128.5 386" opacity="1"></path><path fill="none" class="highcharts-grid-line" d="M 171.5 51 L 171.5 386" opacity="1"></path><path fill="none" class="highcharts-grid-line" d="M 214.5 51 L 214.5 386" opacity="1"></path><path fill="none" class="highcharts-grid-line" d="M 256.5 51 L 256.5 386" opacity="1"></path><path fill="none" class="highcharts-grid-line" d="M 299.5 51 L 299.5 386" opacity="1"></path><path fill="none" class="highcharts-grid-line" d="M 43.5 51 L 43.5 386" opacity="1"></path></g><g class="highcharts-grid highcharts-yaxis-grid "><path fill="none" stroke="#e6e6e6" stroke-width="1" class="highcharts-grid-line" d="M 44 386.5 L 300 386.5" opacity="1"></path><path fill="none" stroke="#e6e6e6" stroke-width="1" class="highcharts-grid-line" d="M 44 353.5 L 300 353.5" opacity="1"></path><path fill="none" stroke="#e6e6e6" stroke-width="1" class="highcharts-grid-line" d="M 44 319.5 L 300 319.5" opacity="1"></path><path fill="none" stroke="#e6e6e6" stroke-width="1" class="highcharts-grid-line" d="M 44 286.5 L 300 286.5" opacity="1"></path><path fill="none" stroke="#e6e6e6" stroke-width="1" class="highcharts-grid-line" d="M 44 252.5 L 300 252.5" opacity="1"></path><path fill="none" stroke="#e6e6e6" stroke-width="1" class="highcharts-grid-line" d="M 44 219.5 L 300 219.5" opacity="1"></path><path fill="none" stroke="#e6e6e6" stroke-width="1" class="highcharts-grid-line" d="M 44 185.5 L 300 185.5" opacity="1"></path><path fill="none" stroke="#e6e6e6" stroke-width="1" class="highcharts-grid-line" d="M 44 152.5 L 300 152.5" opacity="1"></path><path fill="none" stroke="#e6e6e6" stroke-width="1" class="highcharts-grid-line" d="M 44 118.5 L 300 118.5" opacity="1"></path><path fill="none" stroke="#e6e6e6" stroke-width="1" class="highcharts-grid-line" d="M 44 85.5 L 300 85.5" opacity="1"></path><path fill="none" stroke="#e6e6e6" stroke-width="1" class="highcharts-grid-line" d="M 44 50.5 L 300 50.5" opacity="1"></path></g><rect fill="none" class="highcharts-plot-border" x="44" y="51" width="256" height="335"></rect><g class="highcharts-axis highcharts-xaxis "><path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 86.5 386 L 86.5 396" opacity="1"></path><path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 128.5 386 L 128.5 396" opacity="1"></path><path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 171.5 386 L 171.5 396" opacity="1"></path><path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 214.5 386 L 214.5 396" opacity="1"></path><path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 256.5 386 L 256.5 396" opacity="1"></path><path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 300.5 386 L 300.5 396" opacity="1"></path><path fill="none" class="highcharts-tick" stroke="#ccd6eb" stroke-width="1" d="M 43.5 386 L 43.5 396" opacity="1"></path><path fill="none" class="highcharts-axis-line" stroke="#ccd6eb" stroke-width="1" d="M 44 386.5 L 300 386.5"></path></g><g class="highcharts-axis highcharts-yaxis "><path fill="none" class="highcharts-axis-line" d="M 44 51 L 44 386"></path></g><g class="highcharts-series-group"><g class="highcharts-series highcharts-series-0 highcharts-column-series highcharts-color-undefined highcharts-tracker" transform="translate(44,51) scale(1 1)" clip-path="url(#highcharts-xcviqg8-109)"><rect x="10.5" y="84.5" width="21" height="251" fill="#5B9BD5" class="highcharts-point" stroke="#ffffff" stroke-width="1"></rect><rect x="53.5" y="335.5" width="21" height="0" fill="#5B9BD5" class="highcharts-point" stroke="#ffffff" stroke-width="1"></rect><rect x="95.5" y="335.5" width="21" height="0" fill="#5B9BD5" class="highcharts-point" stroke="#ffffff" stroke-width="1"></rect><rect x="138.5" y="335.5" width="21" height="0" fill="#5B9BD5" class="highcharts-point" stroke="#ffffff" stroke-width="1"></rect><rect x="181.5" y="335.5" width="21" height="0" fill="#5B9BD5" class="highcharts-point" stroke="#ffffff" stroke-width="1"></rect><rect x="223.5" y="335.5" width="21" height="0" fill="#5B9BD5" class="highcharts-point" stroke="#ffffff" stroke-width="1"></rect></g><g class="highcharts-markers highcharts-series-0 highcharts-column-series highcharts-color-undefined " transform="translate(44,51) scale(1 1)" clip-path="none"></g></g><text x="10" text-anchor="start" class="highcharts-title" style="color:#555;font-size:13px;fill:#555;" y="20"><tspan>p值</tspan></text><g class="highcharts-legend" transform="translate(245,10)"><rect fill="none" class="highcharts-legend-box" rx="0" ry="0" x="0" y="0" width="55" height="29" visibility="visible"></rect><g><g><g class="highcharts-legend-item highcharts-column-series highcharts-color-undefined highcharts-series-0" transform="translate(8,3)"><text x="21" style="color:#333333;font-size:12px;font-weight:bold;cursor:pointer;fill:#333333;" text-anchor="start" y="15">Sig</text><rect x="2" y="4" width="12" height="12" fill="#5B9BD5" rx="0" ry="0" class="highcharts-point"></rect></g></g></g></g><g class="highcharts-axis-labels highcharts-xaxis-labels "><text x="67.926058197684" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0) rotate(-45 67.926058197684 402)" y="402" opacity="1"><tspan>冠状动脉旁路…</tspan><title>冠状动脉旁路移植术</title></text><text x="110.59272486435067" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0) rotate(-45 110.59272486435067 402)" y="402" opacity="1"><tspan>吸烟史</tspan></text><text x="153.25939153101734" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0) rotate(-45 153.25939153101734 402)" y="402" opacity="1"><tspan>胸痛</tspan></text><text x="195.926058197684" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0) rotate(-45 195.926058197684 402)" y="402" opacity="1"><tspan>大汗</tspan></text><text x="238.59272486435069" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0) rotate(-45 238.59272486435069 402)" y="402" opacity="1"><tspan>出院年龄</tspan></text><text x="281.25939153101734" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0) rotate(-45 281.25939153101734 402)" y="402" opacity="1"><tspan>BMI</tspan></text></g><g class="highcharts-axis-labels highcharts-yaxis-labels "><text x="29" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0)" y="388" opacity="1"><tspan>0</tspan></text><text x="29" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0)" y="355" opacity="1"><tspan>0.1</tspan></text><text x="29" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0)" y="321" opacity="1"><tspan>0.2</tspan></text><text x="29" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0)" y="288" opacity="1"><tspan>0.3</tspan></text><text x="29" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0)" y="254" opacity="1"><tspan>0.4</tspan></text><text x="29" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0)" y="221" opacity="1"><tspan>0.5</tspan></text><text x="29" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0)" y="187" opacity="1"><tspan>0.6</tspan></text><text x="29" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0)" y="154" opacity="1"><tspan>0.7</tspan></text><text x="29" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0)" y="120" opacity="1"><tspan>0.8</tspan></text><text x="29" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0)" y="87" opacity="1"><tspan>0.9</tspan></text><text x="29" style="color:#666666;cursor:default;font-size:11px;fill:#666666;" text-anchor="end" transform="translate(0,0)" y="53" opacity="1"><tspan>1</tspan></text></g></svg></div></div>
				</div>
			</div>
			<!--highchart end-->
			<div class="row">
				<b class="page-title" style="font-size: 16px;font-weight: bold;color: #333;margin: 15px 0px -5px 0px;">所有入选者一般资料的比较</b>
			</div>
			<div class="row" style="padding:2%;">
				
				<div class="col-md-12 res-box">
					<!-- BEGIN TABLE1-->
					<table class="table table-advance table-right-border text-center">
								<thead>
								<tr>
									<th colspan="6" class="text-left bcgk-gray">
										定性分析结果
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
										值
									</th>
									<th>
										df
									</th>
									<th>
										渐进Sig(双侧)
									</th>
									<th>
										精确Sig(双侧)
									</th>
									
								</tr>
								</thead>
								<tbody>
									<tr>
										<td rowspan="3">冠状动脉旁路移植术</td>
										<td>Pearson卡方</td><td>0.101 </td><td>1 </td><td>0.750</td><td>-</td>
									</tr>
									<tr>
										<td>连续矫正b</td><td>0.033 </td><td>1 </td><td>0.855</td><td>-</td>
									</tr>
									<tr>
										<td>Fisher的精确检验</td><td>- </td><td>-</td><td>-</td><td>0.891</td>
									</tr>
									<tr class="bcgk-sp">
										<td rowspan="3">吸烟史</td>
										<td>Pearson卡方</td><td>3.859</td><td>1</td><td class="fred">0.000</td><td>-</td>
									</tr>
									<tr class="bcgk-sp">
										
										<td>连续矫正b</td><td>3.857</td><td>1</td><td class="fred">0.000</td><td>-</td>
									</tr>
									<tr class="bcgk-sp">
										
										<td>Fisher的精确检验</td><td>-</td><td>-</td><td>-</td><td class="fred">0.000</td>
									</tr>
									<tr>
										<td rowspan="3">胸痛</td>
										<td>Pearson卡方</td><td>3.709 </td><td>1</td><td class="fred">0.000</td><td>-</td>
									</tr>
									<tr>
										<td>连续矫正b</td><td>3.685 </td><td>1</td><td class="fred">0.000</td><td>-</td>
									</tr>
									<tr>
										<td>Fisher的精确检验</td><td>- </td><td>-</td><td>-</td><td class="fred">0.000</td>
									</tr>					
									<tr class="bcgk-sp">
										<td rowspan="3">大汗</td>
										<td>Pearson卡方</td><td>7.537</td><td>1</td><td class="fred">0.000</td><td>-</td>
									</tr>
									<tr class="bcgk-sp">
										
										<td>连续矫正b</td><td>7.503</td><td>1</td><td class="fred">0.000</td><td>-</td>
									</tr>
									<tr class="bcgk-sp">
										
										<td>Fisher的精确检验</td><td>-</td><td>-</td><td>-</td><td class="fred">0.000</td>
									</tr>
								</tbody>	
					</table>
				</div>
			</div> 
			 <div class="row">
				<b class="page-title" style="font-size: 16px;font-weight: bold;color: #333;margin: 15px 0px -5px 0px;"></b>
			</div>
			<div class="row" style="padding:2%;">
				
				<div class="col-md-12 res-box">
				<table class="table table-advance table-right-border text-center">
								<thead>
								<tr class="closetr">
									<td colspan="6">
										<span class="close close-resbox">关闭</span>
									</td>
									</tr>
								<tr>
									<th colspan="4" class="text-left bcgk-gray">
										独立样本T检验
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
										<td rowspan="2">出院年龄</td>
										<td>假设方差相等</td><td>-4.57</td><td class="fred">0.000</td><td>-4.36</td><td>-1.71</td>
									</tr>
									<tr>
										
										<td>假设方差不相等</td><td>-4.65</td><td class="fred">0.000</td><td>-4.34</td><td>-1.73</td>
									</tr>
									<tr class="bcgk-sp">
										<td rowspan="2">BMI</td>
										<td>假设方差相等</td><td>-0.856</td><td class="fred">0.000</td><td>-0.510</td><td>0.204</td>
									</tr>
									<tr class="bcgk-sp">
										
										<td>假设方差不相等</td><td>-0.854</td><td class="fred">0.000</td><td>-0.503</td><td>0.197</td>
									</tr>									
								</tbody>	
								
								</table>
				
					<!-- BEGIN BORDERED TABLE PORTLET-->
					
					
					<!-- END BORDERED TABLE PORTLET-->
				</div>
			</div>
			
			<!-- END PAGE CONTENT-->
		</div>
	<div class="form-actions">
														     <div class="row">
																<div class="col-md-offset-3 col-md-9">
																	<a href="javascript:;" class="btn default button-previous" style="display: inline-block;">
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
			<a href="#" target="_blank"> Copyright © 2016 Goodwill All
				rights reserved.</a>
		</div>
		<div class="scroll-to-top" style="display: none;">
			<i class="icon-arrow-up"></i>
		</div>
	</div>
	<!-- END FOOTER -->
	<!--通用指标 开始-->
		<div class="box conditions-box hidden" id="common-cont" style="left: 407.344px; top: 234px;">
			<div class="caption">
				<span>请输入关键字或拼音搜索</span>
			</div>
			
				<div class="main-row">
					<div class="tabbable-line top-group">
						<ul class="nav nav-tabs top-ul"><li><a>常用指标 </a></li><li class="active"><a>病历 </a></li><li><a>诊断 </a></li><li><a>症状 </a></li><li><a>体征 </a></li><li><a>用药 </a></li><li><a>检验 </a></li><li><a>检查 </a></li><li><a>手术 </a></li></ul>
					</div>
					<div class="right-group">
						<div class="tab-content"><div class="tab-pane" id="often-condition">没有使用记录!</div><div class="tab-pane active"><ul class="body-ul"><li class="row no-padding no-margin"><h4 class="stitle">基本信息</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="病历_基本信息_性别" data-id="000027" data-type="4" data-hastime="undefined">性别</span><span>|</span><span class="block-info" data="病历_基本信息_出生日期" data-id="000028" data-type="2" data-hastime="undefined">出生日期</span><span>|</span><span class="block-info" data="病历_基本信息_出院年龄" data-id="000029" data-type="0" data-hastime="undefined">出院年龄</span><span>|</span><span class="block-info" data="病历_基本信息_国籍" data-id="000030" data-type="5" data-hastime="undefined">国籍</span><span>|</span><span class="block-info" data="病历_基本信息_民族" data-id="000031" data-type="5" data-hastime="undefined">民族</span><span>|</span><span class="block-info" data="病历_基本信息_职业" data-id="000032" data-type="5" data-hastime="undefined">职业</span><span>|</span><span class="block-info" data="病历_基本信息_婚姻状况" data-id="000033" data-type="4" data-hastime="undefined">婚姻状况</span><span>|</span><span class="block-info" data="病历_基本信息_付费方式" data-id="000034" data-type="4" data-hastime="undefined">付费方式</span><span>|</span><span class="block-info" data="病历_基本信息_住院次" data-id="000035" data-type="0" data-hastime="undefined">住院次</span><span>|</span><span class="block-info" data="病历_基本信息_入院途径" data-id="000036" data-type="4" data-hastime="undefined">入院途径</span><span>|</span><span class="block-info" data="病历_基本信息_入院时间" data-id="000037" data-type="2" data-hastime="undefined">入院时间</span><span>|</span><span class="block-info" data="病历_基本信息_入院科室" data-id="000038" data-type="5" data-hastime="undefined">入院科室</span><span>|</span><span class="block-info" data="病历_基本信息_出院时间" data-id="000039" data-type="2" data-hastime="undefined">出院时间</span><span>|</span><span class="block-info" data="病历_基本信息_出院科室" data-id="000040" data-type="5" data-hastime="undefined">出院科室</span><span>|</span><span class="block-info" data="病历_基本信息_住院天数" data-id="000041" data-type="0" data-hastime="undefined">住院天数</span><span>|</span><span class="block-info" data="病历_基本信息_文化程度" data-id="000141" data-type="5" data-hastime="undefined">文化程度</span><span>|</span><span class="block-info" data="病历_基本信息_病人身份" data-id="000142" data-type="5" data-hastime="undefined">病人身份</span><span>|</span><span class="block-info" data="病历_基本信息_入院状态" data-id="000143" data-type="4" data-hastime="undefined">入院状态</span><span>|</span><span class="block-info" data="病历_基本信息_病情转归" data-id="000144" data-type="4" data-hastime="undefined">病情转归</span></div></div></li><li class="row no-padding no-margin"><h4 class="stitle">既往史</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="病历_既往史_既往疾病" data-id="000043" data-type="5" data-hastime="undefined">既往疾病</span><span>|</span><span class="block-info" data="病历_既往史_既往用药" data-id="000045" data-type="5" data-hastime="undefined">既往用药</span><span>|</span><span class="block-info" data="病历_既往史_用药剂量" data-id="000046" data-type="0" data-hastime="undefined">用药剂量</span><span>|</span><span class="block-info" data="病历_既往史_用药频次" data-id="000047" data-type="0" data-hastime="undefined">用药频次</span><span>|</span><span class="block-info" data="病历_既往史_既往手术" data-id="000178" data-type="5" data-hastime="undefined">既往手术</span><span>|</span><span class="block-info" data="病历_既往史_否认既往疾病" data-id="000179" data-type="5" data-hastime="undefined">否认既往疾病</span></div></div></li><li class="row no-padding no-margin"><h4 class="stitle">个人史</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="病历_个人史_吸烟史" data-id="000051" data-type="3" data-hastime="undefined">吸烟史</span><span>|</span><span class="block-info" data="病历_个人史_烟龄" data-id="000052" data-type="0" data-hastime="undefined">烟龄</span><span>|</span><span class="block-info" data="病历_个人史_每日吸烟量" data-id="000053" data-type="0" data-hastime="undefined">每日吸烟量</span><span>|</span><span class="block-info" data="病历_个人史_是否戒烟" data-id="000054" data-type="3" data-hastime="undefined">是否戒烟</span><span>|</span><span class="block-info" data="病历_个人史_戒烟时长" data-id="000055" data-type="0" data-hastime="undefined">戒烟时长</span><span>|</span><span class="block-info" data="病历_个人史_饮酒史" data-id="000056" data-type="3" data-hastime="undefined">饮酒史</span><span>|</span><span class="block-info" data="病历_个人史_酒龄" data-id="000057" data-type="0" data-hastime="undefined">酒龄</span><span>|</span><span class="block-info" data="病历_个人史_每日饮酒量" data-id="000058" data-type="0" data-hastime="undefined">每日饮酒量</span><span>|</span><span class="block-info" data="病历_个人史_是否戒酒" data-id="000059" data-type="3" data-hastime="undefined">是否戒酒</span><span>|</span><span class="block-info" data="病历_个人史_戒酒时长" data-id="000060" data-type="0" data-hastime="undefined">戒酒时长</span></div></div></li><li class="row no-padding no-margin"><h4 class="stitle">婚育史</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="病历_婚育史_结婚年龄" data-id="000061" data-type="0" data-hastime="undefined">结婚年龄</span><span>|</span><span class="block-info" data="病历_婚育史_子女个数" data-id="000062" data-type="0" data-hastime="undefined">子女个数</span><span>|</span><span class="block-info" data="病历_婚育史_初潮年龄" data-id="000063" data-type="0" data-hastime="undefined">初潮年龄</span><span>|</span><span class="block-info" data="病历_婚育史_行经天数" data-id="000064" data-type="1" data-hastime="undefined">行经天数</span><span>|</span><span class="block-info" data="病历_婚育史_间隔天数" data-id="000065" data-type="0" data-hastime="undefined">间隔天数</span><span>|</span><span class="block-info" data="病历_婚育史_末次月经" data-id="000066" data-type="2" data-hastime="undefined">末次月经</span><span>|</span><span class="block-info" data="病历_婚育史_月经量" data-id="000067" data-type="1" data-hastime="undefined">月经量</span><span>|</span><span class="block-info" data="病历_婚育史_闭经年龄" data-id="000068" data-type="0" data-hastime="undefined">闭经年龄</span><span>|</span><span class="block-info" data="病历_婚育史_足月分娩数" data-id="000069" data-type="0" data-hastime="undefined">足月分娩数</span><span>|</span><span class="block-info" data="病历_婚育史_早产数" data-id="000070" data-type="0" data-hastime="undefined">早产数</span><span>|</span><span class="block-info" data="病历_婚育史_流产人流数" data-id="000071" data-type="0" data-hastime="undefined">流产人流数</span><span>|</span><span class="block-info" data="病历_婚育史_存活数" data-id="000072" data-type="0" data-hastime="undefined">存活数</span></div></div></li><li class="row no-padding no-margin"><h4 class="stitle">家族史</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="病历_家族史_家族遗传史" data-id="000073" data-type="4" data-hastime="undefined">家族遗传史</span><span>|</span><span class="block-info" data="病历_家族史_家族成员关系" data-id="000074" data-type="4" data-hastime="undefined">家族成员关系</span><span>|</span><span class="block-info" data="病历_家族史_所患疾病" data-id="000075" data-type="5" data-hastime="undefined">所患疾病</span></div></div></li><li class="row no-padding no-margin"><h4 class="stitle">专科情况</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="病历_专科情况_专科检查描述" data-id="000076" data-type="1" data-hastime="undefined">专科检查描述</span></div></div></li><li class="row no-padding no-margin"><h4 class="stitle">辅助检查</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="病历_辅助检查_检查时间" data-id="000077" data-type="2" data-hastime="undefined">检查时间</span><span>|</span><span class="block-info" data="病历_辅助检查_检查项目" data-id="000078" data-type="5" data-hastime="undefined">检查项目</span><span>|</span><span class="block-info" data="病历_辅助检查_检查结果" data-id="000079" data-type="1" data-hastime="undefined">检查结果</span></div></div></li><li class="row no-padding no-margin"><h4 class="stitle">现病史</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="病历_现病史_症状" data-id="000089" data-type="5" data-hastime="Y">症状</span><span>|</span><span class="block-info" data="病历_现病史_症状诱因" data-id="000090" data-type="5" data-hastime="undefined">症状诱因</span><span>|</span><span class="block-info" data="病历_现病史_症状频率" data-id="000091" data-type="4" data-hastime="undefined">症状频率</span><span>|</span><span class="block-info" data="病历_现病史_症状持续时间" data-id="000092" data-type="0" data-hastime="undefined">症状持续时间</span><span>|</span><span class="block-info" data="病历_现病史_伴随症状" data-id="000093" data-type="5" data-hastime="undefined">伴随症状</span><span>|</span><span class="block-info" data="病历_现病史_检查项目" data-id="000152" data-type="5" data-hastime="Y">检查项目</span><span>|</span><span class="block-info" data="病历_现病史_检查结果" data-id="000153" data-type="1" data-hastime="undefined">检查结果</span><span>|</span><span class="block-info" data="病历_现病史_手术名称" data-id="000154" data-type="5" data-hastime="undefined">手术名称</span><span>|</span><span class="block-info" data="病历_现病史_手术部位" data-id="000155" data-type="5" data-hastime="undefined">手术部位</span><span>|</span><span class="block-info" data="病历_现病史_药物" data-id="000156" data-type="5" data-hastime="undefined">药物</span><span>|</span><span class="block-info" data="病历_现病史_用药效果" data-id="000157" data-type="1" data-hastime="undefined">用药效果</span><span>|</span><span class="block-info" data="病历_现病史_用药频率" data-id="000158" data-type="0" data-hastime="undefined">用药频率</span><span>|</span><span class="block-info" data="病历_现病史_不伴症状" data-id="000174" data-type="5" data-hastime="undefined">不伴症状</span><span>|</span><span class="block-info" data="病历_现病史_恢复方式" data-id="000175" data-type="5" data-hastime="undefined">恢复方式</span><span>|</span><span class="block-info" data="病历_现病史_治疗名称" data-id="000176" data-type="1" data-hastime="undefined">治疗名称</span><span>|</span><span class="block-info" data="病历_现病史_治疗结果" data-id="000177" data-type="1" data-hastime="undefined">治疗结果</span></div></div></li><li class="row no-padding no-margin"><h4 class="stitle">主诉</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="病历_主诉_症状持续时间" data-id="000171" data-type="0" data-hastime="undefined">症状持续时间</span><span>|</span><span class="block-info" data="病历_主诉_症状" data-id="000170" data-type="5" data-hastime="undefined">症状</span><span>|</span><span class="block-info" data="病历_主诉_症状频率" data-id="000172" data-type="4" data-hastime="undefined">症状频率</span><span>|</span><span class="block-info" data="病历_主诉_伴随症状" data-id="000173" data-type="5" data-hastime="undefined">伴随症状</span></div></div></li></ul></div><div class="tab-pane"><ul class="body-ul"><li class="row no-padding no-margin"><h4 class="stitle">诊断</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="诊断_诊断_出院诊断" data-id="000080" data-type="5" data-hastime="undefined">出院诊断</span><span>|</span><span class="block-info" data="诊断_诊断_入院诊断" data-id="000081" data-type="5" data-hastime="undefined">入院诊断</span><span>|</span><span class="block-info" data="诊断_诊断_门(急)诊诊断" data-id="000082" data-type="5" data-hastime="undefined">门(急)诊诊断</span><span>|</span><span class="block-info" data="诊断_诊断_病理诊断" data-id="000083" data-type="5" data-hastime="undefined">病理诊断</span><span>|</span><span class="block-info" data="诊断_诊断_死亡诊断" data-id="000084" data-type="5" data-hastime="undefined">死亡诊断</span><span>|</span><span class="block-info" data="诊断_诊断_初步诊断" data-id="000180" data-type="5" data-hastime="Y">初步诊断</span><span>|</span><span class="block-info" data="诊断_诊断_治疗结果" data-id="000181" data-type="4" data-hastime="undefined">治疗结果</span><span>|</span><span class="block-info" data="诊断_诊断_治疗天数" data-id="000182" data-type="0" data-hastime="undefined">治疗天数</span><span>|</span><span class="block-info" data="诊断_诊断_诊断时间" data-id="000183" data-type="2" data-hastime="undefined">诊断时间</span></div></div></li></ul></div><div class="tab-pane"><ul class="body-ul"><li class="row no-padding no-margin"><h4 class="stitle">主诉</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="症状_主诉_症状" data-id="000085" data-type="5" data-hastime="Y">症状</span><span>|</span><span class="block-info" data="症状_主诉_症状持续时间" data-id="000086" data-type="0" data-hastime="undefined">症状持续时间</span><span>|</span><span class="block-info" data="症状_主诉_症状频率" data-id="000087" data-type="4" data-hastime="undefined">症状频率</span><span>|</span><span class="block-info" data="症状_主诉_伴随症状" data-id="000184" data-type="5" data-hastime="undefined">伴随症状</span></div></div></li><li class="row no-padding no-margin"><h4 class="stitle">现病史</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="症状_现病史_症状" data-id="000161" data-type="5" data-hastime="Y">症状</span><span>|</span><span class="block-info" data="症状_现病史_症状诱因" data-id="000162" data-type="5" data-hastime="undefined">症状诱因</span><span>|</span><span class="block-info" data="症状_现病史_症状频率" data-id="000163" data-type="4" data-hastime="undefined">症状频率</span><span>|</span><span class="block-info" data="症状_现病史_症状持续时间" data-id="000164" data-type="0" data-hastime="undefined">症状持续时间</span><span>|</span><span class="block-info" data="症状_现病史_伴随症状" data-id="000165" data-type="5" data-hastime="undefined">伴随症状</span><span>|</span><span class="block-info" data="症状_现病史_不伴症状" data-id="000185" data-type="5" data-hastime="undefined">不伴症状</span><span>|</span><span class="block-info" data="症状_现病史_恢复方式" data-id="000186" data-type="5" data-hastime="undefined">恢复方式</span></div></div></li></ul></div><div class="tab-pane"><ul class="body-ul"><li class="row no-padding no-margin"><h4 class="stitle">体格检查</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="体征_体格检查_体温" data-id="000094" data-type="0" data-hastime="undefined">体温</span><span>|</span><span class="block-info" data="体征_体格检查_脉搏" data-id="000095" data-type="0" data-hastime="undefined">脉搏</span><span>|</span><span class="block-info" data="体征_体格检查_呼吸" data-id="000096" data-type="0" data-hastime="undefined">呼吸</span><span>|</span><span class="block-info" data="体征_体格检查_身高" data-id="000099" data-type="0" data-hastime="undefined">身高</span><span>|</span><span class="block-info" data="体征_体格检查_体重" data-id="000100" data-type="0" data-hastime="undefined">体重</span><span>|</span><span class="block-info" data="体征_体格检查_心率" data-id="000187" data-type="0" data-hastime="undefined">心率</span><span>|</span><span class="block-info" data="体征_体格检查_收缩压" data-id="000188" data-type="0" data-hastime="undefined">收缩压</span><span>|</span><span class="block-info" data="体征_体格检查_BMI" data-id="000200" data-type="0" data-hastime="undefined">BMI</span><span>|</span><span class="block-info" data="体征_体格检查_舒张压" data-id="000195" data-type="0" data-hastime="undefined">舒张压</span></div></div></li></ul></div><div class="tab-pane"><ul class="body-ul"><li class="row no-padding no-margin"><h4 class="stitle">医嘱用药</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="用药_医嘱用药_药品名称" data-id="000102" data-type="5" data-hastime="undefined">药品名称</span><span>|</span><span class="block-info" data="用药_医嘱用药_用药剂量" data-id="000103" data-type="0" data-hastime="undefined">用药剂量</span><span>|</span><span class="block-info" data="用药_医嘱用药_药物类型" data-id="000104" data-type="5" data-hastime="undefined">药物类型</span><span>|</span><span class="block-info" data="用药_医嘱用药_用药途径" data-id="000105" data-type="5" data-hastime="undefined">用药途径</span><span>|</span><span class="block-info" data="用药_医嘱用药_用药频次" data-id="000106" data-type="4" data-hastime="undefined">用药频次</span><span>|</span><span class="block-info" data="用药_医嘱用药_用药时长" data-id="000107" data-type="0" data-hastime="undefined">用药时长</span><span>|</span><span class="block-info" data="用药_医嘱用药_出院带药" data-id="000189" data-type="3" data-hastime="undefined">出院带药</span><span>|</span><span class="block-info" data="用药_医嘱用药_医嘱开始时间" data-id="000190" data-type="2" data-hastime="undefined">医嘱开始时间</span><span>|</span><span class="block-info" data="用药_医嘱用药_医嘱停止时间" data-id="000191" data-type="2" data-hastime="undefined">医嘱停止时间</span></div></div></li></ul></div><div class="tab-pane"><ul class="body-ul"><li class="row no-padding no-margin"><h4 class="stitle">检验</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="检验_检验_标本类别" data-id="000193" data-type="5" data-hastime="Y">标本类别</span><span>|</span><span class="block-info" data="检验_检验_检验结果值" data-id="000192" data-type="0" data-hastime="Y">检验结果值</span><span>|</span><span class="block-info" data="检验_检验_检验时间" data-id="000116" data-type="2" data-hastime="undefined">检验时间</span><span>|</span><span class="block-info" data="检验_检验_检验项目" data-id="000117" data-type="5" data-hastime="Y">检验项目</span><span>|</span><span class="block-info" data="检验_检验_检验类型" data-id="000146" data-type="5" data-hastime="Y">检验类型</span><span>|</span><span class="block-info" data="检验_检验_检验结果项" data-id="000147" data-type="5" data-hastime="Y">检验结果项</span></div></div></li></ul></div><div class="tab-pane"><ul class="body-ul"><li class="row no-padding no-margin"><h4 class="stitle">检查</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="检查_检查_检查部位" data-id="000122" data-type="5" data-hastime="undefined">检查部位</span><span>|</span><span class="block-info" data="检查_检查_检查时间" data-id="000123" data-type="2" data-hastime="undefined">检查时间</span><span>|</span><span class="block-info" data="检查_检查_检查所见" data-id="000124" data-type="1" data-hastime="undefined">检查所见</span><span>|</span><span class="block-info" data="检查_检查_检查结果" data-id="000125" data-type="1" data-hastime="undefined">检查结果</span><span>|</span><span class="block-info" data="检查_检查_检查项目" data-id="000168" data-type="5" data-hastime="Y">检查项目</span><span>|</span><span class="block-info" data="检查_检查_诊断描述" data-id="000194" data-type="1" data-hastime="undefined">诊断描述</span></div></div></li></ul></div><div class="tab-pane"><ul class="body-ul"><li class="row no-padding no-margin"><h4 class="stitle">手术</h4><div class="outerbox"><div class="innerbox"><span>|</span><span class="block-info" data="手术_手术_手术名称" data-id="000131" data-type="5" data-hastime="undefined">手术名称</span><span>|</span><span class="block-info" data="手术_手术_术前诊断" data-id="000132" data-type="5" data-hastime="undefined">术前诊断</span><span>|</span><span class="block-info" data="手术_手术_术后诊断" data-id="000133" data-type="5" data-hastime="undefined">术后诊断</span><span>|</span><span class="block-info" data="手术_手术_切口类型" data-id="000134" data-type="4" data-hastime="undefined">切口类型</span><span>|</span><span class="block-info" data="手术_手术_手术时间" data-id="000135" data-type="2" data-hastime="undefined">手术时间</span><span>|</span><span class="block-info" data="手术_手术_麻醉方式" data-id="000136" data-type="5" data-hastime="undefined">麻醉方式</span><span>|</span><span class="block-info" data="手术_手术_有无病理标本" data-id="000137" data-type="3" data-hastime="undefined">有无病理标本</span><span>|</span><span class="block-info" data="手术_手术_出血量" data-id="000138" data-type="0" data-hastime="undefined">出血量</span><span>|</span><span class="block-info" data="手术_手术_输血类型" data-id="000139" data-type="4" data-hastime="undefined">输血类型</span><span>|</span><span class="block-info" data="手术_手术_输血量" data-id="000140" data-type="0" data-hastime="undefined">输血量</span><span>|</span><span class="block-info" data="手术_手术_手术级别" data-id="000166" data-type="4" data-hastime="undefined">手术级别</span><span>|</span><span class="block-info" data="手术_手术_愈合程度" data-id="000167" data-type="4" data-hastime="undefined">愈合程度</span></div></div></li></ul></div></div>
					
				</div>
				
			</div>
		</div>
	<!--通用指标 结束-->									
														
														
<!-- 浮动面板 -->	
<div class="mypanel hidden" style="background:#fff;border:1px #ddd solid;z-index:99990;max-height:250px;overflow-y:auto;"></div>
<!-- 浮动面板 end -->		
<!--model-->

<div id="responsive" class="modal fade" tabindex="-1" aria-hidden="true" role="basic">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
											<h4 class="modal-title" style="font-family: '微软雅黑 ';">数据导出</h4>
											<div class="btn-group hasplan" id="hasplan">
														<button class="btn btn-sm dropdown-toggle" type="button" data-toggle="dropdown">
														导出方案 <i class="fa fa-angle-down"></i>
														</button>
														<ul class="dropdown-menu" role="menu">
															
														</ul>
													</div>
										</div>
										<div class="modal-body">
											<div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 300px;"><div class="scroller" style="height: 300px; overflow: hidden; width: auto;" data-always-visible="1" data-rail-visible1="1" data-initialized="1">
												<div class="row">
													<div class="col-md-4">
														<div class="form-group">
																<div class="input-icon right input-middle margin-top-10 tree-search">
																	<i class="fa fa-search"></i>
																	<input type="text" class="form-control" placeholder="" id="tree-search">
																</div>
															
														</div>
														<div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 240px;"><div class="left-data scroller" data-always-visible="1" data-rail-visible1="1" data-initialized="1" style="overflow: hidden; width: auto; height: 240px;">
															<div id="tree" class="tree-demo"></div>
															<div id="tree_search" class="tree-demo hidden"></div>
														</div><div class="slimScrollBar" style="background: rgb(187, 187, 187); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px;"></div><div class="slimScrollRail" style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(234, 234, 234); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
													</div>
													<div class="col-md-8">
														<div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 300px;"><div class="right-data scroller" data-always-visible="1" data-rail-visible1="1" data-initialized="1" style="overflow: hidden; width: auto; height: 300px;">
															<div class="table-scrollable">
							<table class="table table-striped table-bordered table-advance table-hover " id="var_table">
								<thead>
									<tr class="text-left">
										<th></th>
										<th>变量名称</th>
										<th>显示名称</th>
									</tr>
								</thead>
								<tbody></tbody>
							</table>
						</div>
					</div><div class="slimScrollBar" style="background: rgb(187, 187, 187); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px;"></div><div class="slimScrollRail" style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(234, 234, 234); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
				   </div>
				</div>
			</div><div class="slimScrollBar" style="background: rgb(187, 187, 187); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px;"></div><div class="slimScrollRail" style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(234, 234, 234); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
		</div>
										<div class="modal-footer">
											
														<form class="form-inline" role="form" style="display: inline-block;">
								
								
								<div class="checkbox">
									<label>
									<div class="icheckbox_minimal-grey" style="position: relative;"><input type="checkbox" class="icheck planname-btn" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div> 保存至方案 </label>
								</div>
								<input type="text" class="form-control input-sm planname-input hidden" placeholder="方案名称">
							</form>	
											
											<div class="btn-group">
														<button type="button" class="btn btn-sm green exportSure_btn" style="background: #38c1b4;">导出至服务器</button>
														<button type="button" class="btn btn-sm default" id="exporttype-btn" data-toggle="dropdown">CSV<i class="fa fa-angle-down"></i></button>
														<ul class="dropdown-menu" role="menu" id="exporttype-ul">
															<li>
																<a href="javascript:;">CSV</a>
															</li>
															<li><a href="javascript:;">EXCEL</a>
															</li>
															<li><a href="javascript:;">SPSS</a>
															</li>
															
														</ul>
													</div>
											<button type="button" data-dismiss="modal" class="btn btn-sm default modalClose" style="background:none;box-shadow:none;">取消</button>
										</div>
									</div>
								</div>
							</div>		

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
<script type="text/javascript" src="js/charts.js"></script>
<script type="text/javascript" src="js/jquery.fly.min.js"></script>
<script src="assets/global/plugins/bootbox/bootbox.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/swiper3/script/swiper-3.4.1.jquery.min.js"></script>
<script src="assets/global/plugins/swiper3/script/swiper.animate1.0.2.min.js"></script>
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
$(".conditions-container ol").slimScroll({});
			//控制条件框移动移动
			 var mySwiper = new Swiper ('.swiper-container', {
				 keyboardControl : true,
				 onlyExternal : true,
				    slidesPerView : 4,
				    slidesPerGroup : 1,
				    
				    spaceBetween : 10,
				    // 如果需要分页器
				    pagination: '.swiper-pagination',
				    
				    // 如果需要前进后退按钮
				    nextButton: '.swiper-button-next',
				    prevButton: '.swiper-button-prev'
				    
				   
				  });
			 mySwiper.onResize();
			 $(".conditionsPage-btn-group").on("click",".prev",function(){
		   			mySwiper.slidePrev();
		   			
		   		});
		   		$(".conditionsPage-btn-group").on("click",".next",function(){
		   			mySwiper.slideNext();
		   			
		   		});
		   		$('.plus-conditions-container').click(function(){
		   			mySwiper.appendSlide('<div class="conditions-container swiper-slide"><div><ol></ol><div class="bottom-bar"><i class="fa fa-close"></i></div></div></div>'); //加到Swiper的最后
		   			mySwiper.slideTo(mySwiper.slides.length);
		   		});
		   	//分组框选取
				$("#tab2 .conditions-container").live("click", function(e) {
					if($(e.target).hasClass("fa-close")&&$(e.target).parent().hasClass("bottom-bar")){
						
						mySwiper.removeSlide($(this).index());
						
						
					}else{
					$("#tab2 .conditions-container").removeClass("active");
					$(this).addClass("active");
					}
				});	
	 });
</script>
<!-- END JAVASCRIPTS -->

<!-- END BODY -->

</body></html>