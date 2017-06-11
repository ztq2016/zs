var Login = function () {

	var handleLogin = function() {
		$('.login-form').validate({
	            errorElement: 'span', //default input error message container
	            errorClass: 'help-block', // default input error message class
	            focusInvalid: false, // do not focus the last invalid input
	            rules: {
	            	userId: {
	                    required: true
	                },
	                password: {
	                    required: true
	                },
	                remember: {
	                    required: false
	                }
	            },

	            messages: {
	            	userId: {
	                    required: "您还没有输入用户名！"
	                },
	                password: {
	                    required: "您还没有输入密码！"
	                },
	                loginStatus:{
	                	 required: "登录失败！"
	                }
	            },

	            invalidHandler: function (event, validator) { //display error alert on form submit   
	                $('.alert-danger', $('.login-form')).show();
	            },

	            highlight: function (element) { // hightlight error inputs
	                $(element).closest('.form-group').addClass('error'); // set error class to the control group
	            },

	            success: function (label) {
	                label.closest('.form-group').removeClass('error');
	                label.remove();
	            },

	            errorPlacement: function (error, element) {
	                error.insertAfter(element.closest('.input-icon'));
	            },

	            submitHandler: function (form) {
	            	var url=$('.login-form').attr("action");
	               	$.ajax({
             		   type: "post",
                        url: url,
                        data:{userId:$("#form_control_1").val(),password:$("#form_control_2").val()},
                        success:function(result){
	                     	  if(result!="200"){
	                     		 $('.forget-form').removeClass("hidden");
	                     		 $('.alert-danger').find("span").html("登录失败请重新输入！");
	                     	  }else{
	                     		  window.location.href=url.substr(0,url.lastIndexOf("/"))+"/index";
	                     	  }
                     	    	
                        }
             	});
	             //   form.submit();
	            }
	        });

	        $('.login-form input').keypress(function (e) {
	            if (e.which == 13) {
	            
	                if ($('.login-form').validate().form()) {
	     
	                	 $('.login-form').submit();
	                }
	                return false;
	            }
	        });

	}
    
    return {
        //main function to initiate the module
        init: function () {
        	 handleLogin();    
        }

    };

}();