<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="title" content="A+可视化布局系统">
<meta name="keywords" content="A+,可视化,布局,系统">
<title>A+可视化布局系统</title>
<!-- Le styles -->

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<link href="css/bootstrap-combined.min.css" rel="stylesheet">
<link href="css/layoutit.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="fonts/font-awesome/font-awesome.min.css"/>
<link rel="stylesheet" type="text/css" href="css/animate.css"/>
<link rel="stylesheet" type="text/css" href="css/common.css"/>
<link href="css/plugins/jquery-file-upload/blueimp-gallery/blueimp-gallery.min.css" rel="stylesheet"/>
<link href="css/plugins/jquery-file-upload/css/jquery.fileupload.css" rel="stylesheet"/>
<link href="css/plugins/jquery-file-upload/css/jquery.fileupload-ui.css" rel="stylesheet"/>
<link href="css/plugins/fancybox/source/jquery.fancybox.css" rel="stylesheet" type="text/css"/>
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
		<script src="js/html5shiv.js"></script>
	<![endif]-->
	<!-- Fav and touch icons -->
	<link rel="shortcut icon" href="img/favicon.png">
	<script type="text/javascript" src="js/jquery-2.0.0.min.js"></script>
	<script src="js/jquery-migrate.min.js" type="text/javascript"></script>
	<!--[if lt IE 9]>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<![endif]-->
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui.js"></script>
	<script type="text/javascript" src="js/jquery.ui.touch-punch.min.js"></script>
<script type="text/javascript" src="js/jquery.htmlClean.js"></script>
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="ckeditor/config.js"></script>
<script type="text/javascript" src="js/scripts.js"></script>
</head>
<body style="min-height: 660px; cursor: auto;" class="edit">
<div class="navbar navbar-inverse navbar-fixed-top row border-bottom">
  <div class="navbar navbar-static-top">
    <div class="container-fluid">
      <div class="nav-collapse" >
      	<ul class="nav" id="menu-layoutit">
          <li>
            <!--<div class="btn-group">
              <a class="btn btn-blank " href="#" target="_blank"><i class="fa fa-plus-square"></i>新建页面</a>
            </div>-->
            <div class="btn-group">
              <a class="btn btn-blank " href="#" target="_blank" data-toggle="modal" data-target="#myModal5"><i class="fa fa-picture-o"></i>我的图库</a>
            </div>
            <div class="btn-group" data-toggle="buttons-radio">
              <button type="button" id="edit" class="btn btn-blank active"><i class="fa fa-edit"></i>编辑</button>
              <button type="button" class="btn btn-blank" id="devpreview"><i class="fa fa-eye-slash"></i>布局编辑</button>
              <button type="button" class="btn btn-blank" id="sourcepreview"><i class="fa fa-eye"></i>预览</button>
            </div>
            <div class="btn-group">
              <button type="button" class="btn btn-blank" data-target="#shareModal" rel="/build/downloadModal" role="button" data-toggle="modal" id="getDownList"><i class="fa fa-download"></i>下载</button>
              <button class="btn btn-blank" href="/share/index" role="button" data-toggle="modal" data-target="#downloadModal"><i class="fa fa-save"></i>保存</button>
              <button class="btn btn-blank" href="#clear" id="clear"><i class="fa fa-trash "></i>清空</button>
            </div>
            <div class="btn-group">
				<button class="btn btn-blank" href="#undo" id="undo" ><i class="fa fa-arrow-left"></i>撤销</button>
				<button class="btn btn-blank" href="#redo" id="redo" ><i class="fa fa-arrow-right"></i>重做</button>
			</div>
          </li>
        </ul>
        <ul class="nav pull-right" style="margin-right: 20px;">
               	  <li>
               	  <div class="btn-group">
              <button type="button" class="btn btn-blank" style="margin-right: 20px;font-weight: 600;"><i class="fa fa-home"></i>欢迎使用A+</button>
              <a class="btn btn-blank" style="color: #999C9E;" href="login.html"><i class="fa fa-sign-out" style="color: #999C9E;"></i>退出</a>
            </div>
			      </li>
          </ul>
      </div>
      <!--/.nav-collapse --> 
    </div>
  </div>
</div>
<div class="container-fluid">
  <div class="row-fluid">
    <div class="">
      <div class="sidebar-nav">
                     <div class="nav-first">
                        <div class="dropdown profile-element"> <span>
                            <img alt="image" class="img-circle" src="img/zs.jpg" style="width: 64px;height: 64px;">
                             </span>
                            <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
                                <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold">Beaut-小木</strong>
                             </span>  <span class="text-muted text-xs block">超级管理员 <b class="caret"></b></span> </span>
                            </a>
                            <ul class="dropdown-menu animated fadeInRight m-t-xs">
                                <!--<li><a href="form_avatar.html">修改头像</a>
                                </li>-->
                                <li><a href="profile.html">个人资料</a>
                                </li>
                                <li><a href="contacts.html">联系我们</a>
                                </li>
                                <!--<li><a href="mailbox.html">信箱</a>
                                </li>-->
                                <li class="divider"></li>
                                <li><a href="login.html">安全退出</a>
                                </li>
                            </ul>
                        </div>
                     </div>
                        
        <ul class="nav nav-list accordion-group active">
          <li class="nav-header">
           	<span class="fa arrow"></span>
           <!-- <i class="fa fa-th-large"></i> -->
            <i class="fa fa-columns"></i> 布局设置
           <div class="popover-info"><i class="icon-question-sign"></i>
              <div class="popover fade right">
                <div class="arrow"></div>
                <h3 class="popover-title">功能</h3>
                <div class="popover-content">在这里设置你的栅格布局, 栅格总数默认为12, 用空格分割每列的栅格值, 如果您需要了解更多信息，请访问<a target="_blank" href="http://twitter.github.io/bootstrap/scaffolding.html#gridSystem">Bootstrap栅格系统.</a></div>
              </div>
            </div>
          </li>
          <li style="display: list-item;padding-bottom: 15px;" class="rows" id="estRows">
            <div class="lyrow ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <div class="preview">
                <input value="12" type="text">
              </div>
              <div class="view">
                <div class="row-fluid clearfix">
                  <div class="col-md-12 column"></div>
                </div>
              </div>
            </div>
            <div class="lyrow ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <div class="preview">
                <input value="6 6" type="text">
              </div>
              <div class="view">
                <div class="row-fluid clearfix">
                  <div class="col-md-6 column"></div>
                  <div class="col-md-6 column"></div>
                </div>
              </div>
            </div>
            <div class="lyrow ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <div class="preview">
                <input value="8 4" type="text">
              </div>
              <div class="view">
                <div class="row-fluid clearfix">
                  <div class="col-md-8 column"></div>
                  <div class="col-md-4 column"></div>
                </div>
              </div>
            </div>
            <div class="lyrow ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <div class="preview">
                <input value="4 4 4" type="text">
              </div>
              <div class="view">
                <div class="row-fluid clearfix">
                  <div class="col-md-4 column"></div>
                  <div class="col-md-4 column"></div>
                  <div class="col-md-4 column"></div>
                </div>
              </div>
            </div>
            <div class="lyrow ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <div class="preview">
                <input value="2 6 4" type="text">
              </div>
              <div class="view">
                <div class="row-fluid clearfix">
                  <div class="col-md-2 column"></div>
                  <div class="col-md-6 column"></div>
                  <div class="col-md-4 column"></div>
                </div>
              </div>
            </div>
          </li>
        </ul>
        <ul class="nav nav-list accordion-group">
          <li class="nav-header"><i class="fa fa-flask"></i> &nbsp;UI&nbsp;元素&nbsp;&nbsp;
            <div class="popover-info"><i class="icon-question-sign "></i>
              <div class="popover fade right">
                <div class="arrow"></div>
                <h3 class="popover-title">帮助</h3>
                <div class="popover-content">这里提供了一系列基本元素样式，你可以通过区块右上角的编辑按钮修改样式设置。如需了解更多信息，请访问<a target="_blank" href="http://twitter.github.io/bootstrap/base-css.html">基本CSS.</a></div>
              </div>
            </div>
            <span class="fa arrow"></span>
          </li>
          <li style="display: none;" class="boxes" id="elmBase">
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> 
            	 <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">对齐 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">默认</a></li>
                <li class=""><a href="#" rel="text-left">靠左</a></li>
                <li class=""><a href="#" rel="text-center">居中</a></li>
                <li class=""><a href="#" rel="text-right">靠右</a></li>
              </ul>
              </span> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">标记 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">默认</a></li>
                <li class=""><a href="#" rel="muted">禁用</a></li>
                <li class=""><a href="#" rel="text-warning">警告</a></li>
                <li class=""><a href="#" rel="text-error">错误</a></li>
                <li class=""><a href="#" rel="text-info">提示</a></li>
                <li class=""><a href="#" rel="text-success">成功</a></li>
              </ul>
              </span> </span>
              <div class="preview">标题栏</div>
              <div class="view">
                <h3 contenteditable="true">h3. 这是一套可视化布局系统.</h3>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">对齐 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">默认</a></li>
                <li class=""><a href="#" rel="text-left">靠左</a></li>
                <li class=""><a href="#" rel="text-center">居中</a></li>
                <li class=""><a href="#" rel="text-right">靠右</a></li>
              </ul>
              </span> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">标记 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">默认</a></li>
                <li class=""><a href="#" rel="muted">禁用</a></li>
                <li class=""><a href="#" rel="text-warning">警告</a></li>
                <li class=""><a href="#" rel="text-error">错误</a></li>
                <li class=""><a href="#" rel="text-info">提示</a></li>
                <li class=""><a href="#" rel="text-success">成功</a></li>
              </ul>
              </span> <a class="btn btn-mini" href="#" rel="lead">Lead</a> </span>
              <div class="preview">段落</div>
              <div class="view" contenteditable="true">
                <p><em>Git</em>是一个分布式的版本控制系统，最初由<b>Linus Torvalds</b>编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在Ruby社区中。 </p>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button></span>
              <div class="preview">地址</div>
              <div class="view">
                <address contenteditable="true">
                <strong>Twitter, Inc.</strong><br>
                795 Folsom Ave, Suite 600<br>
                San Francisco, CA 94107<br>
                <abbr title="Phone">P:</abbr> (123) 456-7890
                </address>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"> <a class="btn btn-mini" href="#" rel="pull-right">右对齐</a> </span>
              <div class="preview">引用块</div>
              <div class="view clearfix">
                <blockquote contenteditable="true">
                  <p>github是一个全球化的开源社区.</p>
                  <small>关键词 <cite title="Source Title">开源</cite></small> </blockquote>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <a class="btn btn-mini" href="#" rel="unstyled">无样式</a> <a class="btn btn-mini" href="#" rel="inline">嵌入</a> </span>
              <div class="preview">无序列表</div>
              <div class="view">
                <ul contenteditable="true">
                  <li>新闻资讯</li>
                  <li>体育竞技</li>
                  <li>娱乐八卦</li>
                  <li>前沿科技</li>
                  <li>环球财经</li>
                  <li>天气预报</li>
                  <li>房产家居</li>
                  <li>网络游戏</li>
                </ul>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <a class="btn btn-mini" href="#" rel="unstyled">无样式</a> <a class="btn btn-mini" href="#" rel="inline">嵌入</a> </span>
              <div class="preview">有序列表</div>
              <div class="view">
                <ol contenteditable="true">
                  <li>新闻资讯</li>
                  <li>体育竞技</li>
                  <li>娱乐八卦</li>
                  <li>前沿科技</li>
                  <li>环球财经</li>
                  <li>天气预报</li>
                  <li>房产家居</li>
                  <li>网络游戏</li>
                </ol>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <a class="btn btn-mini" href="#" rel="dl-horizontal">竖向对齐</a> </span>
              <div class="preview">详细描述</div>
              <div class="view">
                <dl contenteditable="true">
                  <dt>Rolex</dt>
                  <dd>劳力士创始人为汉斯.威尔斯多夫，1908年他在瑞士将劳力士注册为商标。</dd>
                  <dt>Vacheron Constantin</dt>
                  <dd>始创于1775年的江诗丹顿已有250年历史，</dd>
                  <dd>是世界上历史最悠久、延续时间最长的名表之一。</dd>
                  <dt>IWC</dt>
                  <dd>创立于1868年的万国表有“机械表专家”之称。</dd>
                  <dt>Cartier</dt>
                  <dd>卡地亚拥有150多年历史，是法国珠宝金银首饰的制造名家。</dd>
                </dl>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">样式 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">默认</a></li>
                <li class=""><a href="#" rel="table-striped">条纹</a></li>
                <li class=""><a href="#" rel="table-bordered">边框</a></li>
              </ul>
              </span> <a class="btn btn-mini" href="#" rel="table-hover">鼠标指示</a> <a class="btn btn-mini" href="#" rel="table-condensed">紧凑</a> </span>
              <div class="preview">表格</div>
              <div class="view">
                <table class="table" contenteditable="true">
                  <thead>
                    <tr>
                      <th>编号</th>
                      <th>产品</th>
                      <th>交付时间</th>
                      <th>状态</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>1</td>
                      <td>TB - Monthly</td>
                      <td>01/04/2012</td>
                      <td>Default</td>
                    </tr>
                    <tr class="success">
                      <td>1</td>
                      <td>TB - Monthly</td>
                      <td>01/04/2012</td>
                      <td>Approved</td>
                    </tr>
                    <tr class="error">
                      <td>2</td>
                      <td>TB - Monthly</td>
                      <td>02/04/2012</td>
                      <td>Declined</td>
                    </tr>
                    <tr class="warning">
                      <td>3</td>
                      <td>TB - Monthly</td>
                      <td>03/04/2012</td>
                      <td>Pending</td>
                    </tr>
                    <tr class="info">
                      <td>4</td>
                      <td>TB - Monthly</td>
                      <td>04/04/2012</td>
                      <td>Call in to confirm</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <a class="btn btn-mini" href="#" rel="form-inline">嵌入</a> </span>
              <div class="preview">提交表单</div>
              <div class="view">
				<form>
					<fieldset>
					<legend contenteditable="true">表单项</legend>
					<label contenteditable="true">表签名</label>
					<input type="text" placeholder="Type something…">
					<span class="help-block" contenteditable="true">这里填写帮助信息.</span>
					<label class="checkbox" contenteditable="true">
					<input type="checkbox"> 勾选同意
					</label>
					<button type="submit" class="btn" contenteditable="true">提交</button>
					</fieldset>
				</form>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <a class="btn btn-mini" href="#" rel="form-inline">嵌入</a> </span>
              <div class="preview">搜索框</div>
              <div class="view">
                <form class="form-search">
                  <input class="input-medium search-query" type="text">
                  <button type="submit" class="btn" contenteditable="true">查找</button>
                </form>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"> </span>
              <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button></span>
              <div class="preview">纵向表单</div>
              <div class="view">
                <form class="form-horizontal">
                  <div class="control-group">
                    <label class="control-label" for="inputEmail" contenteditable="true">邮箱</label>
                    <div class="controls">
                      <input id="inputEmail" placeholder="Email" type="text">
                    </div>
                  </div>
                  <div class="control-group">
                    <label class="control-label" for="inputPassword" contenteditable="true">密码</label>
                    <div class="controls">
                      <input id="inputPassword" placeholder="Password" type="password">
                    </div>
                  </div>
                  <div class="control-group">
                    <div class="controls">
                      <label class="checkbox" contenteditable="true">
                        <input type="checkbox">
                        Remember me </label>
                      <button type="submit" class="btn" contenteditable="true">登陆</button>
                    </div>
                  </div>
                </form>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> 
            	<span class="configuration"> 
            		<span class="btn-group"> 
            			<a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">样式 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">默认</a></li>
                <li class=""><a href="#" rel="btn-primary">重点</a></li>
                <li class=""><a href="#" rel="btn-info">信息</a></li>
                <li class=""><a href="#" rel="btn-success">成功</a></li>
                <li class=""><a href="#" rel="btn-warning">提醒</a></li>
                <li class=""><a href="#" rel="btn-danger">危险</a></li>
                <li class=""><a href="#" rel="dim">3D</a></li>
                <li class=""><a href="#" rel="btn-link">链接</a></li>
              </ul>
              </span> 
              <span class="btn-group"> 
              	<a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">尺寸 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class=""><a href="#" rel="btn-large">大</a></li>
                <li class="active"><a href="#" rel="">中</a></li>
                <li class=""><a href="#" rel="btn-small">小</a></li>
                <li class=""><a href="#" rel="btn-mini">微型</a></li>
              </ul>
              </span> 
              <span class="btn-group"> 
              	<a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">线性 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">填充按钮</a></li>
                <li class=""><a href="#" rel="btn-outline">线性按钮</a></li>
                <li class=""><a href="#" rel="btn-circle">圆形按钮</a></li>
                <li class=""><a href="#" rel="btn-rounded">圆角按钮</a></li>
              </ul>
              </span> 
              <a class="btn btn-mini" href="#" rel="btn-block">通栏</a> <a class="btn btn-mini" href="#" rel="disabled">禁用</a> </span>
              <div class="preview">按钮</div>
              <div class="view">
                <button class="btn" type="button" contenteditable="true">按钮</button>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">样式 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">默认</a></li>
                <li class=""><a href="#" rel="img-rounded">圆角</a></li>
                <li class=""><a href="#" rel="img-circle">圆圈</a></li>
                <li class=""><a href="#" rel="img-polaroid">相框</a></li>
              </ul>
              </span> </span>
              <div class="preview">图片</div>
              <div class="view"> <img alt="140x140" src="img/a.jpg"> </div>
            </div>
          </li>
        </ul>
        <ul class="nav nav-list accordion-group">
          <li class="nav-header"><i class="fa fa-magic"></i> 基础组件
            <div class="popover-info"><i class="icon-question-sign "></i>
              <div class="popover fade right">
                <div class="arrow"></div>
                <h3 class="popover-title">帮助</h3>
                <div class="popover-content">拖放组件到布局框内. 拖入后你可以设置组件样式. 查看这里获取更多帮助 <a target="_blank" href="http://twitter.github.io/bootstrap/components.html">Components.</a></div>
              </div>
            </div>
            <span class="fa arrow"></span>
          </li>
          <li style="display: none;" class="boxes" id="elmComponents">
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">方向<span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">横向</a></li>
                <li class=""><a href="#" rel="btn-group-vertical">竖向</a></li>
              </ul>
              </span> </span>
              <div class="preview">按钮组</div>
              <div class="view">
                <div class="btn-group">
                    <button class="btn btn-white" type="button">左</button>
                    <button class="btn btn-primary" type="button">中</button>
                    <button class="btn btn-white" type="button">右</button>
                </div>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <a class="btn btn-mini" href="#" rel="dropup">上拉</a> </span>
              <div class="preview">下拉菜单</div>
              <div class="view">
                <div class="btn-group">
                    <button data-toggle="dropdown" class="btn btn-default dropdown-toggle" aria-expanded="false">操作 <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <li><a href="#">置顶</a>
                        </li>
                        <li><a href="#" class="font-bold">修改</a>
                        </li>
                        <li><a href="#">禁用</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="#">删除</a>
                        </li>
                    </ul>
                </div>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">样式 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class=""><a href="#" rel="nav-tabs">线框</a></li>
                <li class=""><a href="#" rel="nav-pills">图钉</a></li>
              </ul>
              </span> <a class="btn btn-mini" href="#" rel="nav-stacked">切换格式</a> </span>
              <div class="preview">导航</div>
              <div class="view">
                <ul class="nav nav-tabs" contenteditable="true">
                  <li class="active"><a href="#">首页</a></li>
                  <li><a href="#">资料</a></li>
                  <li class="disabled"><a href="#">信息</a></li>
                  <li class="dropdown pull-right"> <a href="#" data-toggle="dropdown" class="dropdown-toggle">下拉 <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                      <li><a href="#">操作</a></li>
                      <li><a href="#">设置栏目</a></li>
                      <li><a href="#">更多设置</a></li>
                      <li class="divider"></li>
                      <li><a href="#">分割线</a></li>
                    </ul>
                  </li>
                </ul>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <a class="btn btn-mini" href="#" rel="well">嵌入</a> </span>
              <div class="preview">导航列表</div>
              <div class="view">
                <ul class="nav nav-list" contenteditable="true">
                  <li class="nav-header">列表标题</li>
                  <li class="active"><a href="#">首页</a></li>
                  <li><a href="#">库</a></li>
                  <li><a href="#">应用</a></li>
                  <li class="nav-header">功能列表</li>
                  <li><a href="#">资料</a></li>
                  <li><a href="#">设置</a></li>
                  <li class="divider"></li>
                  <li><a href="#">帮助</a></li>
                </ul>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button></span>
              <div class="preview">面包导航</div>
              <div class="view">
                <ul class="breadcrumb" contenteditable="true">
                  <li><a href="#">主页</a> <span class="divider">/</span></li>
                  <li><a href="#">类目</a> <span class="divider">/</span></li>
                  <li class="active">主题</li>
                </ul>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">尺寸 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class=""><a href="#" rel="pagination-large">大</a></li>
                <li class="active"><a href="#" rel="">中</a></li>
                <li class=""><a href="#" rel="pagination-small">小</a></li>
                <li class=""><a href="#" rel="pagination-mini">微型</a></li>
              </ul>
              </span> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">位置 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">靠左</a></li>
                <li class=""><a href="#" rel="pagination-centered">居中</a></li>
                <li class=""><a href="#" rel="pagination-right">靠右</a></li>
              </ul>
              </span> </span>
              <div class="preview">翻页</div>
              <div class="view">
                <div class="pagination">
                  <ul contenteditable="true">
                    <li><a href="#">上一页</a></li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#">下一页</a></li>
                  </ul>
                </div>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">样式 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">默认</a></li>
                <li class=""><a href="#" rel="badge-success">成功</a></li>
                <li class=""><a href="#" rel="badge-warning">警告</a></li>
                <li class=""><a href="#" rel="badge-important">重要</a></li>
                <li class=""><a href="#" rel="badge-info">提示</a></li>
                <li class=""><a href="#" rel="badge-inverse">倒数</a></li>
              </ul>
              </span> </span>
              <div class="preview">文字标签</div>
              <div class="view"> <span class="label" contenteditable="true">文字标签</span> </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">样式 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">默认</a></li>
                <li class=""><a href="#" rel="badge-success">成功</a></li>
                <li class=""><a href="#" rel="badge-warning">警告</a></li>
                <li class=""><a href="#" rel="badge-important">重要</a></li>
                <li class=""><a href="#" rel="badge-info">提示</a></li>
                <li class=""><a href="#" rel="badge-inverse">倒数</a></li>
              </ul>
              </span> </span>
              <div class="preview">微标</div>
              <div class="view"> <span class="badge" contenteditable="true">1</span> </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <a class="btn btn-mini" href="#" rel="well">嵌入</a> </span>
              <div class="preview">概述</div>
              <div class="view">
                <div class="hero-unit" contenteditable="true">
                  <h1>Hello, world!</h1>
                  <p>这是一个可视化布局模板, 你可以点击模板里的文字进行修改, 也可以通过点击弹出的编辑框进行富文本修改. 拖动区块能实现排序. </p>
                  <p><a class="btn btn-primary btn-large" href="#">参看更多 »</a></p>
                </div>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button></span>
              <div class="preview">页标题</div>
              <div class="view">
                <div class="page-header" contenteditable="true">
                  <h1>页标题范例 <small>此处编写页标题</small></h1>
                </div>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button></span>
              <div class="preview">文本</div>
              <div class="view">
                <h2 contenteditable="true">标题</h2>
                <p contenteditable="true">本可视化布局程序在HTML5浏览器上运行更加完美, 能实现自动本地化保存, 即使关闭了网页, 下一次打开仍然能恢复上一次的操作.</p>
                <p><a class="btn" href="#" contenteditable="true">查看更多 »</a></p>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button></span>
              <div class="preview">预览列表</div>
              <div class="view">
                <ul class="thumbnails">
                  <li class="span4">
                    <div class="thumbnail"> <img alt="300x200" src="img/people.jpg">
                      <div class="caption" contenteditable="true">
                        <h3>冯诺尔曼结构</h3>
                        <p>也称普林斯顿结构，是一种将程序指令存储器和数据存储器合并在一起的存储器结构。程序指令存储地址和数据存储地址指向同一个存储器的不同物理位置。</p>
                        <p><a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">分享</a></p>
                      </div>
                    </div>
                  </li>
                  <li class="span4">
                    <div class="thumbnail"> <img alt="300x200" src="img/city.jpg">
                      <div class="caption" contenteditable="true">
                        <h3>哈佛结构</h3>
                        <p>哈佛结构是一种将程序指令存储和数据存储分开的存储器结构，它的主要特点是将程序和数据存储在不同的存储空间中，进行独立编址。</p>
                        <p><a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">分享</a></p>
                      </div>
                    </div>
                  </li>
                  <li class="span4">
                    <div class="thumbnail"> <img alt="300x200" src="img/sports.jpg">
                      <div class="caption" contenteditable="true">
                        <h3>改进型哈佛结构</h3>
                        <p>改进型的哈佛结构具有一条独立的地址总线和一条独立的数据总线，两条总线由程序存储器和数据存储器分时复用，使结构更紧凑。</p>
                        <p><a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">分享</a></p>
                      </div>
                    </div>
                  </li>
                </ul>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">样式 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">默认</a></li>
                <li class=""><a href="#" rel="progress-info">提示</a></li>
                <li class=""><a href="#" rel="progress-success">成功</a></li>
                <li class=""><a href="#" rel="progress-warning">警告</a></li>
                <li class=""><a href="#" rel="progress-danger">危险</a></li>
              </ul>
              </span> <a class="btn btn-mini" href="#" rel="progress-striped">条纹</a> <a class="btn btn-mini" href="#" rel="active">动画</a> </span>
              <div class="preview">进度条</div>
              <div class="view">
                <div class="progress">
                  <div class="bar" style="width: 60%;"></div>
                </div>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <a class="btn btn-mini" href="#" rel="well">嵌入</a> </span>
              <div class="preview">嵌入媒体</div>
              <div class="view">
                <div class="media"> <a href="#" class="pull-left"> <img src="img/a_002.jpg" class="media-object"> </a>
                  <div class="media-body" contenteditable="true">
                    <h4 class="media-heading">嵌入媒体标题</h4>
                   请尽量使用HTML5兼容的视频格式和视频代码实现视频播放, 以达到更好的体验效果. </div>
                </div>
              </div>
            </div>
          </li>
        </ul>
        <ul class="nav nav-list accordion-group">
          <li class="nav-header"><i class="fa fa-sitemap"></i> 交互组件 
            <div class="popover-info"><i class="icon-question-sign "></i>
              <div class="popover fade right">
                <div class="arrow"></div>
                <h3 class="popover-title">帮助</h3>
                <div class="popover-content">拖放组件到布局容器. 拖入后, 你可以配置显示样式. 如果有任何疑问可访问 <a target="_blank" href="http://twitter.github.io/bootstrap/javascript.html">JavaScript.</a></div>
              </div>
            </div>
            <span class="fa arrow"></span>
          </li>
          <li style="display: none;" class="boxes mute" id="elmJS">
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <div class="preview">遮罩窗体</div>
              <div class="view"> 
                <!-- Button to trigger modal --> 
                <a id="myModalLink" href="#myModalContainer" role="button" class="btn" data-toggle="modal" contenteditable="true">触发遮罩窗体</a> 
                
                <!-- Modal -->
                <div id="myModalContainer" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h3 id="myModalLabel" contenteditable="true">标题栏</h3>
                  </div>
                  <div class="modal-body">
                    <p contenteditable="true">显示信息</p>
                  </div>
                  <div class="modal-footer">
                    <button class="btn" data-dismiss="modal" aria-hidden="true" contenteditable="true">关闭</button>
                    <button class="btn btn-primary" contenteditable="true">保存设置</button>
                  </div>
                </div>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <a class="btn btn-mini" href="#" rel="navbar-inverse">Inverse</a> 
              <!--a class="btn btn-mini" href="#" rel="navbar-fixed-top">Navbar fixed top</a--> 
              </span>
              <div class="preview">导航栏</div>
              <div class="view">
                <div class="navbar">
                  <div class="navbar-inner">
                    <div class="container-fluid"> <a data-target=".navbar-responsive-collapse" data-toggle="collapse" class="btn btn-navbar"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a> <a href="#" class="brand" contenteditable="true">网站名</a>
                      <div class="nav-collapse collapse navbar-responsive-collapse">
                        <ul class="nav" contenteditable="true">
                          <li class="active"><a href="#">主页</a></li>
                          <li><a href="#">链接</a></li>
                          <li><a href="#">链接</a></li>
                          <li class="dropdown"> <a data-toggle="dropdown" class="dropdown-toggle" href="#">下拉菜单 <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                              <li><a href="#">下拉导航1</a></li>
                              <li><a href="#">下拉导航2</a></li>
                              <li><a href="#">其他</a></li>
                              <li class="divider"></li>
                              <li class="nav-header">标签</li>
                              <li><a href="#">链接1</a></li>
                              <li><a href="#">链接2</a></li>
                            </ul>
                          </li>
                        </ul>
                        <ul class="nav pull-right" contenteditable="true">
                          <li><a href="#">右边链接</a></li>
                          <li class="divider-vertical"></li>
                          <li class="dropdown"> <a data-toggle="dropdown" class="dropdown-toggle" href="#">下拉菜单 <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                              <li><a href="#">下拉导航1</a></li>
                              <li><a href="#">下拉导航2</a></li>
                              <li><a href="#">其他</a></li>
                              <li class="divider"></li>
                              <li><a href="#">链接3</a></li>
                            </ul>
                          </li>
                        </ul>
                      </div>
                      <!-- /.nav-collapse --> 
                    </div>
                  </div>
                  <!-- /navbar-inner --> 
                </div>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">位置 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">默认</a></li>
                <li class=""><a href="#" rel="tabs-below">底部</a></li>
                <li class=""><a href="#" rel="tabs-left">靠左</a></li>
                <li class=""><a href="#" rel="tabs-right">靠右</a></li>
              </ul>
              </span> </span>
              <div class="preview">切换卡</div>
              <div class="view">
                <div class="tabbable" id="myTabs"> <!-- Only required for left/right tabs -->
                  <ul class="nav nav-tabs">
                    <li class="active"><a href="#tab1" data-toggle="tab" contenteditable="true">第一部分</a></li>
                    <li><a href="#tab2" data-toggle="tab" contenteditable="true">第二部分</a></li>
                  </ul>
                  <div class="tab-content">
                    <div class="tab-pane active" id="tab1" contenteditable="true">
                      <p>第一部分内容.</p>
                    </div>
                    <div class="tab-pane" id="tab2" contenteditable="true">
                      <p>第二部分内容.</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"> <span class="btn-group"> <a class="btn btn-mini dropdown-toggle" data-toggle="dropdown" href="#">样式 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li class="active"><a href="#" rel="">默认</a></li>
                <li class=""><a href="#" rel="alert-info">提示</a></li>
                <li class=""><a href="#" rel="alert-error">错误</a></li>
                <li class=""><a href="#" rel="alert-success">成功</a></li>
              </ul>
              </span> </span>
              <div class="preview">提示框</div>
              <div class="view">
                <div class="alert" contenteditable="true">
                  <button type="button" class="close" data-dismiss="alert">×</button>
                  <h4>提示!</h4>
                  <strong>警告!</strong> 请注意你的个人隐私安全. </div>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button></span>
              <div class="preview">手风琴切换</div>
              <div class="view">
                <div class="accordion" id="myAccordion">
                  <div class="accordion-group">
                    <div class="accordion-heading"> <a class="accordion-toggle" data-toggle="collapse" data-parent="#myAccordion" href="#collapseOne" contenteditable="true"> 选项卡 #1 </a> </div>
                    <div id="collapseOne" class="accordion-body collapse in">
                      <div class="accordion-inner" contenteditable="true"> 功能块... </div>
                    </div>
                  </div>
                  <div class="accordion-group">
                    <div class="accordion-heading"> <a class="accordion-toggle" data-toggle="collapse" data-parent="#myAccordion" href="#collapseTwo" contenteditable="true"> 选项卡 #2 </a> </div>
                    <div id="collapseTwo" class="accordion-body collapse">
                      <div class="accordion-inner" contenteditable="true"> 功能块... </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="box box-element ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button></span>
              <div class="preview">轮换图</div>
              <div class="view">
                <div class="carousel slide" id="myCarousel">
                  <ol class="carousel-indicators">
                    <li class="active" data-slide-to="0" data-target="#myCarousel"></li>
                    <li data-slide-to="1" data-target="#myCarousel" class=""></li>
                    <li data-slide-to="2" data-target="#myCarousel" class=""></li>
                  </ol>
                  <div class="carousel-inner">
                    <div class="item active"> <img alt="" src="img/1.jpg">
                      <div class="carousel-caption" contenteditable="true">
                        <h4>棒球</h4>
                        <p>棒球运动是一种以棒打球为主要特点，集体性、对抗性很强的球类运动项目，在美国、日本尤为盛行。</p>
                      </div>
                    </div>
                    <div class="item"> <img alt="" src="img/2.jpg">
                      <div class="carousel-caption" contenteditable="true">
                        <h4>冲浪</h4>
                        <p>冲浪是以海浪为动力，利用自身的高超技巧和平衡能力，搏击海浪的一项运动。运动员站立在冲浪板上，或利用腹板、跪板、充气的橡皮垫、划艇、皮艇等驾驭海浪的一项水上运动。</p>
                      </div>
                    </div>
                    <div class="item"> <img alt="" src="img/3.jpg">
                      <div class="carousel-caption" contenteditable="true">
                        <h4>自行车</h4>
                        <p>以自行车为工具比赛骑行速度的体育运动。1896年第一届奥林匹克运动会上被列为正式比赛项目。环法赛为最著名的世界自行车锦标赛。</p>
                      </div>
                    </div>
                  </div>
                  <a data-slide="prev" href="#myCarousel" class="left carousel-control">‹</a> <a data-slide="next" href="#myCarousel" class="right carousel-control">›</a> </div>
              </div>
            </div>
          </li>
        </ul>
        
        <ul class="nav nav-list accordion-group">
          <li class="nav-header">
           	<span class="fa arrow"></span>
           <!-- <i class="fa fa-th-large"></i> -->
            <i class="fa fa-file"></i> 示例页面
           <div class="popover-info"><i class="icon-question-sign"></i>
              <div class="popover fade right">
                <div class="arrow"></div>
                <h3 class="popover-title">功能</h3>
                <div class="popover-content">在这里提供了一系列基础网页布局 ，拖动后方可查看, 如果您需要了解更多信息，请访问<a target="_blank" href="http://twitter.github.io/bootstrap/scaffolding.html#gridSystem">Bootstrap栅格系统.</a></div>
              </div>
            </div>
          </li>
          <li style="display: none;" class="rows" id="elmComm">
            <div class="lyrow ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <div class="preview">主页一</div>
              <div class="view">
                  <img src="img/index.jpg"/>
              </div>
            </div>
            <div class="lyrow ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <div class="preview">主页二</div>
              <div class="view">
                  <img src="img/index_4.jpg"/>
              </div>
            </div>
            <div class="lyrow ui-draggable"> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span>
              <div class="preview">留言板</div>
              <div class="view">
 <div class="wrapper wrapper-content  animated fadeInRight">

                <div class="row">
                    <div class="col-lg-12">

                        <div class="ibox chat-view">

                            <div class="ibox-title">
                                <small class="pull-right text-muted">最新消息：2017-04-27 18:39:23</small>
                                我的留言
                            </div>


                            <div class="ibox-content">

                                <div class="row">

                                    <div class="col-md-9 ">
                                        <div class="chat-discussion">

                                            <div class="chat-message">
                                                <img class="message-avatar" src="img/a1.jpg" alt="">
                                                <div class="message">
                                                    <a class="message-author" href="chat_view.html#"> 师君</a>
                                                    <span class="message-date"> 2017-04-27 18:39:23 </span>
                                                    <span class="message-content">
											我不是坏人
                                            </span>
                                            <span class="message-content">
											删除
                                            </span>
                                                </div>
                                            </div>
                                            <div class="chat-message">
                                                <img class="message-avatar" src="img/a4.jpg" alt="">
                                                <div class="message">
                                                    <a class="message-author" href="chat_view.html#"> 林Ariel </a>
                                                    <span class="message-date">  2017-04-12 11:12:36 </span>
                                                    <span class="message-content">
											哈哈哈哈哈
                                            </span>
                                                </div>
                                            </div>
                                            <div class="chat-message">
                                                <img class="message-avatar" src="img/a2.jpg" alt="">
                                                <div class="message">
                                                    <a class="message-author" href="chat_view.html#"> 谨斯里 </a>
                                                    <span class="message-date">  2017-04-12 11:12:36 </span>
                                                    <span class="message-content">
											验证日期格式(类似30/30/2008的格式,不验证日期准确性只验证格式
                                            </span>
                                                </div>
                                            </div>
                                            <div class="chat-message">
                                                <img class="message-avatar" src="img/a5.jpg" alt="">
                                                <div class="message">
                                                    <a class="message-author" href="chat_view.html#"> 张爽 </a>
                                                    <span class="message-date">  2017-04-12 - 11:12:36 </span>
                                                    <span class="message-content">
											还有约79842492229个Bug需要修复
                                            </span>
                                                </div>
                                            </div>
                                            <div class="chat-message">
                                                <img class="message-avatar" src="img/a6.jpg" alt="">
                                                <div class="message">
                                                    <a class="message-author" href="chat_view.html#"> 晨 </a>
                                                    <span class="message-date">  2017-02-02 11:12:36 </span>
                                                    <span class="message-content">
											九部令人拍案叫绝的惊悚悬疑剧情佳作】如果你喜欢《迷雾》《致命ID》《电锯惊魂》《孤儿》《恐怖游轮》这些好片，那么接下来推荐的9部同类题材并同样出色的的电影，绝对不可错过哦~
                                                        
                                            </span>
                                                </div>
                                            </div>

                                        </div>

                                    </div>
                                    <div class="col-md-3">
                                        <div class="chat-users">


                                            <div class="users-list">
                                                <div class="chat-user">
                                                    <img class="chat-avatar" src="img/a4.jpg" alt="">
                                                    <div class="chat-user-name">
                                                        <a href="chat_view.html#">伤城Simple</a>
                                                    </div>
                                                </div>
                                                <div class="chat-user">
                                                    <img class="chat-avatar" src="img/a1.jpg" alt="">
                                                    <div class="chat-user-name">
                                                        <a href="chat_view.html#">从未出现过的风景__</a>
                                                    </div>
                                                </div>
                                                <div class="chat-user">
                                                    <span class="pull-right label label-primary">留言</span>
                                                    <img class="chat-avatar" src="img/a2.jpg" alt="">
                                                    <div class="chat-user-name">
                                                        <a href="chat_view.html#">冬伴花暖</a>
                                                    </div>
                                                </div>
                                                <div class="chat-user">
                                                    <span class="pull-right label label-primary">留言</span>
                                                    <img class="chat-avatar" src="img/a3.jpg" alt="">
                                                    <div class="chat-user-name">
                                                        <a href="chat_view.html#">ZM敏姑娘	</a>
                                                    </div>
                                                </div>
                                                <div class="chat-user">
                                                    <img class="chat-avatar" src="img/a5.jpg" alt="">
                                                    <div class="chat-user-name">
                                                        <a href="chat_view.html#">才越越</a>
                                                    </div>
                                                </div>
                                                <div class="chat-user">
                                                    <img class="chat-avatar" src="img/a6.jpg" alt="">
                                                    <div class="chat-user-name">
                                                        <a href="chat_view.html#">时光十年TENSHI</a>
                                                    </div>
                                                </div>
                                                <div class="chat-user">
                                                    <img class="chat-avatar" src="img/a2.jpg" alt="">
                                                    <div class="chat-user-name">
                                                        <a href="chat_view.html#">刘顰颖</a>
                                                    </div>
                                                </div>
                                                <div class="chat-user">
                                                    <span class="pull-right label label-primary">留言</span>
                                                    <img class="chat-avatar" src="img/a3.jpg" alt="">
                                                    <div class="chat-user-name">
                                                        <a href="chat_view.html#">陈泳儿SccBaby</a>
                                                    </div>
                                                </div>


                                            </div>

                                        </div>
                                    </div>

                                </div>
                                <div class="row" style="margin-top: 2px;">
                                    <div class="col-lg-12">
                                        <div class="chat-message-form">

                                            <div class="form-group">

                                                <textarea class="form-control message-input" name="message" placeholder="输入留言内容，按回车键发送"></textarea>
                                            </div>

                                        </div>
                                    </div>
                                </div>


                            </div>

                        </div>
                    </div>

                </div>


            </div>
              </div>
            </div>
            
            
            
          </li>
        </ul>
        <ul class="nav nav-list accordion-group">
          <li class="nav-header"><i class="fa fa-plus"></i> 应用扩展 <span class="fa arrow"></span></li>
          <li style="display: none;" class="boxes mute" id="elmComm">
            <div class="preview">建设中...</div>
          </li>
        </ul>
      </div>
    </div>
    <!--/span-->
    <div class="demo ui-sortable" style="min-height: 304px; ">
      
      <div class="lyrow">
  <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a>
  <span class="drag label"><i class="icon-move"></i>拖动</span>
  <div class="preview">9 3</div>
  <div class="view">
    <div class="row-fluid clearfix">
      <div class="span12 column ui-sortable">
        
        <div class="box box-element ui-draggable" style="display: block; "> <a href="#close" class="remove label label-important"><i class="icon-remove icon-white"></i>删除</a> <span class="drag label"><i class="icon-move"></i>拖动</span> <span class="configuration"><button type="button" class="btn btn-mini" data-target="#editorModal" role="button" data-toggle="modal">编辑</button> <a class="btn btn-mini" href="#" rel="well">嵌入</a> </span>
              <div class="preview">概述</div>
              <div class="view">
                <div class="hero-unit" contenteditable="true">
                  <p>一种风，只流浪在一座山谷；</p>
                  <p>一道堤，只护住一湾星河。</p>
                  <p>每次仰望星空，我总是闭上眼，</p>
                  <p>因为最美的一颗不在天上。</p>                  
                </div>
              </div>
            </div>
      </div>
    </div>
  </div>
</div>
    </div>
    <!-- end demo -->
    <!--/span-->
    <div id="download-layout">
      <div class="container-fluid"></div>
    </div>
  </div>
  <!--/row--> 
</div>
<!--/.fluid-container--> 
<div class="modal hide fade" role="dialog" id="editorModal">
  <div class="modal-header"> <a class="close" data-dismiss="modal">×</a>
    <h3>编辑</h3>
  </div>
  <div class="modal-body">
    <p>
      <textarea id="contenteditor"></textarea>
    </p>
  </div>
  <div class="modal-footer"> <a id="savecontent" class="btn btn-primary" data-dismiss="modal">保存</a> <a class="btn" data-dismiss="modal">关闭</a> </div>
</div>
<div class="modal hide fade" role="dialog" id="downloadModal">
  <div class="modal-header"> <a class="close" data-dismiss="modal">×</a>
    <h3>保存</h3>
  </div>
  <div class="modal-body">
    <p>已在下面生成干净的HTML, 可以上传至服务器.</p>
    <div class="btn-group">
      <button type="button" id="fluidPage" class="active btn btn-info"><i class="icon-fullscreen icon-white"></i> 自适应宽度</button>
      <button type="button" class="btn btn-info" id="fixedPage"><i class="icon-screenshot icon-white"></i> 固定宽度</button>
    </div>
    <br>
    <br>
    <p>
      <textarea></textarea>
    </p>
  </div>
  <div class="modal-footer"> <a class="btn" data-dismiss="modal" id="save_btn_close">关闭</a> <a class="btn" data-dismiss="modal" id="download">保存</a></div>
</div>
<div class="modal hide fade" role="dialog" id="shareModal">
  <div class="modal-header"> <a class="close" data-dismiss="modal">×</a>
    <h3>下载</h3>
  </div>
  <div class="modal-body">
   <h4>文件列表</h4>
   <ul>
    <li><span>2016-6-21网页布局.html</span><button>下载</button></li>
     <li><span>2016-6-21网页布局.html</span><button>下载</button></li>
      <li><span>2016-6-21网页布局.html</span><button>下载</button></li>
   </ul>
  </div>
  <div class="modal-footer"> <a class="btn" data-dismiss="modal">Close</a> </div>
</div>
<div class="modal inmodal fade" id="myModal5" tabindex="-1" role="dialog" aria-hidden="true" style="display: none;margin-left:-460px;width: noset;">
                                <div class="modal-dialog modal-lg" style="margin: 0px auto;">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                                            <small class="font-bold">图库管理</small>
                                        </div>
                                        <small class="font-bold">
                                        <div class="modal-body">
                                            <form id="fileupload" action="css/plugins/jquery-file-upload/server/php/" method="POST" enctype="multipart/form-data" class="">
						<!-- The fileupload-buttonbar contains buttons to add/delete files and start/cancel the upload -->
						<div class="row fileupload-buttonbar">
							<div class="col-lg-7">
								<!-- The fileinput-button span is used to style the file input field as button -->
								<span class="btn green fileinput-button">
								<i class="fa fa-plus"></i>
								<span>
								新增图片 </span>
								<input type="file" name="files[]" multiple="">
								</span>
								<button type="submit" class="btn blue start"><span class="md-click-circle md-click-animate" style="height: 138px; width: 138px; top: -53px; left: -9.90625px;"></span>
								<i class="fa fa-upload"></i>
								<span>
								全部上传 </span>
								</button>
								<button type="reset" class="btn warning cancel">
								<i class="fa fa-ban-circle"></i>
								<span>
								终止上传 </span>
								</button>
								<button type="button" class="btn red delete"><span class="md-click-circle md-click-animate" style="height: 90px; width: 90px; top: -29px; left: 27.375px;"></span>
								<i class="fa fa-trash"></i>
								<span>
								批量删除 </span>
								</button>
								<!--<input type="checkbox" class="toggle">-->
								<!-- The global file processing state -->
								<span class="fileupload-process">
								</span>
							</div>
							<!-- The global progress information -->
							<div class="col-lg-5 fileupload-progress fade">
								<!-- The global progress bar -->
								<div class="progress progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="100">
									<div class="progress-bar progress-bar-success" style="width: 100%;">
									</div>
								</div>
								<!-- The extended global progress information -->
								<div class="progress-extended"></div>
							</div>
						</div>
						<!-- The table listing the files available for upload/download -->
						<table role="presentation" class="table table-striped clearfix">
						<tbody class="files">
							<tr><td >图片</td><td>文件名</td><td>详请</td><td>操作</td></tr>
						</tbody>
						</table>
					</form>
					<!--<p>
		<a class="fancybox" href="img/a1.jpg" data-fancybox-group="gallery" title="Lorem ipsum dolor sit amet"><img src="img/a1.jpg" alt="" /></a>
		<a class="fancybox" href="img/a2.jpg" data-fancybox-group="gallery" title="Etiam quis mi eu elit temp"><img src="img/a2.jpg" alt="" /></a>
		

	</p>-->

                                        </div>

                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
                                            <button type="button" class="btn btn-primary">保存</button>
                                        </div>
                                    </small>
                                    </div><small class="font-bold">
                                </small></div><small class="font-bold">
                            </small></div>
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<script id="template-upload" type="text/x-tmpl">
{% for (var i=0, file; file=o.files[i]; i++) { %}
    <tr class="template-upload fade">
        <td>
            <a class="preview fancybox" href="img/a{%=(i+1)%}.jpg" data-fancybox-group="gallery" title="图"></a>
        </td>
        <td>
            <p class="name"><input type="text" name="name" value={%=file.name%} /></p>
            <strong class="error text-danger label label-danger"></strong>
        </td>
        <td>
            <p class="size">Processing...</p>
            <div class="progress progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="0">
            <div class="progress-bar progress-bar-success" style="width:0%;"></div>
            </div>
        </td>
        <td>
            {% if (!i && !o.options.autoUpload) { %}
                <button class="btn blue start" disabled>
                    <i class="fa fa-upload"></i>
                    <span>上传至服务器</span>
                </button>
            {% } %}
            {% if (!i) { %}
                <button class="btn red cancel">
                    <i class="fa fa-ban"></i>
                    <span>取消</span>
                </button>
            {% } %}
        </td>
    </tr>
{% } %}
</script>                            
<!-- The template to display files available for download -->
<script id="template-download" type="text/x-tmpl">
        {% for (var i=0, file; file=o.files[i]; i++) { %}
            <tr class="template-download fade">
                <td>
                    <span class="preview">
                        {% if (file.thumbnailUrl) { %}
                            <a href="{%=file.url%}" title="{%=file.name%}" download="{%=file.name%}" data-gallery><img src="{%=file.thumbnailUrl%}"></a>
                        {% } %}
                    </span>
                </td>
                <td>
                    <p class="name">
                        {% if (file.url) { %}
                            <a href="{%=file.url%}" title="{%=file.name%}" download="{%=file.name%}" {%=file.thumbnailUrl?'data-gallery':''%}>{%=file.name%}</a>
                        {% } else { %}
                            <span>{%=file.name%}</span>
                        {% } %}
                    </p>
                    {% if (file.error) { %}
                        <div><span class="label label-danger">错误</span> {%=file.error%}</div>
                    {% } %}
                </td>
                <td>
                    <span class="size">{%=o.formatFileSize(file.size)%}</span>
                </td>
                <td>
                    {% if (file.deleteUrl) { %}
                        <button class="btn red delete btn-sm" data-type="{%=file.deleteType%}" data-url="{%=file.deleteUrl%}"{% if (file.deleteWithCredentials) { %} data-xhr-fields='{"withCredentials":true}'{% } %}>
                            <i class="fa fa-trash-o"></i>
                            <span>删除</span>
                        </button>
                        <input type="checkbox" name="delete" value="1" class="toggle">
                    {% } else { %}
                        <button class="btn yellow cancel btn-sm">
                            <i class="fa fa-ban"></i>
                            <span>取消</span>
                        </button>
                    {% } %}
                </td>
            </tr>
        {% } %}
    </script>
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="plugins/respond.min.js"></script>
<script src="plugins/excanvas.min.js"></script> 
<![endif]-->                            
                            <!-- BEGIN:File Upload Plugin JS files-->
<!-- The jQuery UI widget factory, can be omitted if jQuery UI is already included -->
<script src="css/plugins/jquery-file-upload/js/vendor/jquery.ui.widget.js"></script>
<!-- The Templates plugin is included to render the upload/download listings -->
<script src="css/plugins/jquery-file-upload/js/vendor/tmpl.min.js"></script>
<!-- The Load Image plugin is included for the preview images and image resizing functionality -->
<script src="css/plugins/jquery-file-upload/js/vendor/load-image.min.js"></script>
<!-- The Canvas to Blob plugin is included for image resizing functionality -->
<script src="css/plugins/jquery-file-upload/js/vendor/canvas-to-blob.min.js"></script>
<!-- blueimp Gallery script -->
<script src="css/plugins/jquery-file-upload/blueimp-gallery/jquery.blueimp-gallery.min.js"></script>
<!-- The Iframe Transport is required for browsers without support for XHR file uploads -->
<script src="css/plugins/jquery-file-upload/js/jquery.iframe-transport.js"></script>
<!-- The basic File Upload plugin -->
<script src="css/plugins/jquery-file-upload/js/jquery.fileupload.js"></script>
<!-- The File Upload processing plugin -->
<script src="css/plugins/jquery-file-upload/js/jquery.fileupload-process.js"></script>
<!-- The File Upload image preview & resize plugin -->
<script src="css/plugins/jquery-file-upload/js/jquery.fileupload-image.js"></script>
<!-- The File Upload audio preview plugin -->
<script src="css/plugins/jquery-file-upload/js/jquery.fileupload-audio.js"></script>
<!-- The File Upload video preview plugin -->
<script src="css/plugins/jquery-file-upload/js/jquery.fileupload-video.js"></script>
<!-- The File Upload validation plugin -->
<script src="css/plugins/jquery-file-upload/js/jquery.fileupload-validate.js"></script>
<!-- The File Upload user interface plugin -->
<script src="css/plugins/jquery-file-upload/js/jquery.fileupload-ui.js"></script>
<script type="text/javascript" src="js/plugins/form-fileupload.js"></script>
<script type="text/javascript" src="css/plugins/fancybox/source/jquery.fancybox.pack.js"></script>
<!-- The main application script -->
<!-- The XDomainRequest Transport is included for cross-domain file deletion for IE 8 and IE 9 -->
<!--[if (gte IE 8)&(lt IE 10)]>
    <script src="css/plugins/jquery-file-upload/js/cors/jquery.xdr-transport.js"></script>
    <![endif]-->
<!-- END:File Upload Plugin JS files-->
<script type="text/javascript">
	jQuery(document).ready(function() {
        FormFileUpload.init();
        $('.fancybox').fancybox();
        });
</script>

</body>
</html>
