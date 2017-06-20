<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
    uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<!-- BEGIN HEAD -->
<head>
   <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"><meta name="renderer" content="webkit">
    <title>A+ - 注册</title>
    <link href="css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
    <link href="fonts/font-awesome/font-awesome.min.css" rel="stylesheet">
    <link href="css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=2.2.0" rel="stylesheet">
     <script>
  
       
          
            function imgChange(){
            	$.ajax({
          		   type: "get",
                     url: '/clinicalresearch-portal/register',
                     success:function(result){
                    	
                    	
                         	  
                     }
          		});
            }
       
    </script>
    <style>
      #img{
          float: right;
    width: 150px;}
      input{    
      width: 120px;
    margin: 30px 0px;}
    </style>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="gray-bg">
    <div class="middle-box text-center loginscreen   animated fadeInDown">
        <div>
            <div>
                <h1 class="logo-name">A+</h1>
            </div>
            <h3>欢迎注册 A+</h3>
            <p>创建一个A+新账户</p>
            <form class="m-t" role="form" action="<%=request.getContextPath() %>/addUser" method="post">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="请输入用户名" required="" name="userName">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="请输入密码" required="" name="password">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="真实姓名" required="" name="realName">
                </div>
                <img src="jcaptcha.jpg" id="img"/ onclick=" document.location.reload();" title="点击刷新验证码" alt="图形验证码"> 
					<input type="text" name="captcha" value="" id="jcaptcha" />
                <div class="form-group text-left">
                    <div class="checkbox i-checks">
                        <label class="no-padding">
                            <input type="checkbox"><i></i> 我同意注册协议</label>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">注 册</button>
                <p class="text-muted text-center"><small>已经有账户了？</small><a href="login.html">点此登录</a>
                </p>

            </form>
        </div>
    </div>
    <!-- Mainly scripts -->
    <script src="js/jquery-2.0.0.min.js"></script>
    <script src="js/bootstrap.min.js?v=3.4.0"></script>
    <!-- iCheck -->
    <script src="js/plugins/iCheck/icheck.min.js"></script>
    <script>
  
        $(document).ready(function () {
            $('.i-checks').iCheck({
                checkboxClass: 'icheckbox_square-green',
                radioClass: 'iradio_square-green',
            });
           
        });
    </script>
</body>
<!-- END BODY -->
</html>

