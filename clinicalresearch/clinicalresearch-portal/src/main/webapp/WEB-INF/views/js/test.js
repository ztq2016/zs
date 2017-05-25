/**
 *课题编辑数据传输 
 */
$(function() {
	var display = $('.tab-content .alert-danger').css('display');
	if(display == "none") {
		$("#tabone-btn").live("click", function() {
			$studyobjective = $.trim($("input[name='username']").val());
			$studytype = $("input[name='typename']:checked").val();
			$principalinvestigator = $("select[name='selectProjectPI']").val();
			$studystartdate = $("input[name='fromtime']").val();
			$studycompletiondate = $("input[name='totime'").val();

			$.ajax({
				url: "studyinfoinsert",
				contentType: 'application/json',
				type: 'POST',
				data: JSON.stringify({
					"userid": "000001",
					"studyid": "",
					"studyobjective": $studyobjective,
					"studytype": $studytype,
					"principalinvestigator": "张爽",
					"studystartdate": $studystartdate,
					"studycompletiondate": $studycompletiondate
				}), //向服务器端发送的数据 
				dataType: "json", //服务器返回数据的类型为json  
				success: function(json) {
					alert(json.userid);
				}
			})

		})
	}

	// 改变关系和对比值
	function formchange(n) {
		var str = "";
		var input2 = '<input type="text" class="form-control input-inline" placeholder="对比值" name="data3">';
		switch(n) {
			case "1":
				str = '<option value="==">等于</option><option value=">">大于</option><option value=">=">大于等于</option><option value="<">小于</option><option value="<=">小于等于</option><option value="!=">不等于</option><option value="between and">介于</option>';
				break;
			case "2":
				str = '<option value="==">等于</option><option value="!=">不等于</option><option value="like">包含</option><option value="not like">不包含</option>';
				break;
			case "3":
				str = '<option value="==">等于</option><option value=">">大于</option><option value=">=">大于等于</option><option value="<">小于</option><option value="<=">小于等于</option><option value="!=">不等于</option><option value="between and">介于</option>';
				input2 = '<div class=" date-picker input-daterange" data-date="2017/01/01" data-date-format="yyyy/mm/dd"><input type="text" class="form-control" name="time"></div>';
				break;
			case "4":
				str = '<option value="==">等于</option><option value="!=">不等于</option>';
				input2 = '<select class="form-control"><option>Option 1</option><option>Option 2</option></select>';
				break;
			case "5":
				str = '<option value="==">等于</option><option value="!=">不等于</option><option value="like">包含</option><option value="not like">不包含</option>';
				input2 = '<select class="form-control"><option>Option 1</option><option>Option 2</option></select>';
				break;
			case "6":
				str = '<option value="==">等于</option><option value="!=">不等于</option><option value="like">包含</option><option value="not like">不包含</option>';
				input2 = '<div class="input-icon right"><i class="fa fa-search"></i><input type="text" class="form-control" placeholder="搜索"></div>';
				break;

		}
		$("#relationship-select").html($(str));
		$("#input3").html($(input2));
		ComponentsPickers.init();
		console.log($("#input3").html());
	}
	//改变关系和对比值end
	//条件器弹出
	$("#pluscondition").on("click", function() {

		if(!$("#common-cont").hasClass("active") && !$("#history-cont").hasClass("active")) {
			$("#common-cont").toggleClass("active");
			$(".tab-toggle").live("click", function() { //切换通用变量和常用变量
				$(".conditions-box").removeClass("active");
				$(this).parents(".conditions-box").siblings(".conditions-box").toggleClass("active");
				if($("#history-cont").hasClass("active")) {
					$.each($("#history-cont .big-ul>li>div"), function(i, data) {
						if(parseFloat($(data).children("div.innerbox").height()) > 60) {
							$(data).css({
								"height": "60px",
								"overflow": "hidden"
							});
							if(!$(data).parent("li").children(".more").length) {
								$(data).parent("li").append('<a class="more">查看更多<i class="fa fa-angle-double-down"></i></a>');
							}
							$(".more").live("click", function() {

								$(this).parents("li").children("div").css({
									"height": "auto",
									"overflow": "visible"
								}).end().end().html('点击收起<i class="fa fa-angle-double-up"></i>').removeClass("more").addClass("up");
							});
							$(".up").live("click", function() {

								$(this).parents("li").children("div").css({
									"height": "60px",
									"overflow": "hidden"
								}).end().end().html('点击查看<i class="fa fa-angle-double-down"></i>').removeClass("up").addClass("more");
							});
						};
					})
				}
			});

		} else {

			$("#history-cont").removeClass("active");
			$("#common-cont").removeClass("active");
		}

	})

	//通用变量添加变量后关闭条件器
	$("#common-cont .big-ul>li .block-info").on("click", function() {
			var str = "";
			$("#keyinput").val($(this).html());

			formchange($(this).attr("data"));
			$(".conditions-box").removeClass("active");
		})
		//通用变量添加变量后关闭条件器 end
		//自动补全
	$.fn.typeahead.Constructor.prototype.blur = function() {
		var that = this;
		setTimeout(function() {
			that.hide()
		}, 250);
	};
	//第一个框
	$('#keyinput').typeahead({
		source: ["a", "b", "aaa"],
		highlighter: function(item) {
			console.log(item.length);
			if(item) {
				return(item);
			} else {
				return('<b style="color:red;">未找到相关结果</b>');
			}
		},
		updater: function(item) {
			console.log("'" + item + "' selected.");
			return item;
		}

	});
	//第一个框 end	
	//自动补全 end

	//添加条件分组框
	$(".plus-conditions-container").on("click", function() {
		$(this).before($('<span>"且"</span><div class="conditions-container"><div><ol></ol></div></div><div class="bottom-bar"><i class="fa fa-close"></i></div>'));

	});
	//添加条件分组框 end
	//分组框选取
	$(".conditions-container").live("click", function() {
		$(".conditions-container").removeClass("active");
		$(this).addClass("active");
	});
	//分组框选取 end
})