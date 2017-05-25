/**
 *课题编辑数据传输 
 */
$(function() {
	var p1 = new Paging();
	$('.pageToolbar2').Paging({pagesize:5,count:85,toolbar:true});
	$('.pageToolbar3').Paging({pagesize:5,count:20,toolbar:true});
	$('.pageToolbar4').Paging({pagesize:5,count:0,toolbar:true});
/********************tab通用************************/
//	加载条件选择器
	function conditionPanelInit(){
	$.ajax({
		   url: 'getVariableList',     
 	   contentType: 'application/json', 
        type: 'POST',             
        data:JSON.stringify({"variablename":''}),//向服务器端发送的数据 
        dataType: "json",
        success:function(data){
        	if(!data){return false;}
			$p1="";$p2='';$p3="";$p='';
			var li2;
			$.each(data,function(i,d){
				if(!d.variablename){return false;}
				$p1+='<li><a>'+d.variablename+' </a></li>';
				$p2='<div class="tab-pane"><ul class="body-ul">';
				$.each(d.hierarchicalVariableSurvey,function(ii,dd){
					
					$p2+='<li class="row no-padding no-margin"><h4 class="stitle">'+dd.variablename+'</h4><div class="outerbox"><div class="innerbox">';
					$.each(dd.hierarchicalVariableDetailed,function(iii,ddd){
						if(iii>0)
							$p3+='<span>|</span><span class="block-info" data="'+d.variablename+'_'+dd.variablename+'_'+ddd.variablename+'" data-id="'+ddd.variableid+'" data-type="'+ddd.variabletype +'" data-hastime="'+ddd.now+'">'+ddd.variablename +'</span>';
						if(iii==0){
							$p3+='<span class="block-info" data="'+d.variablename+'_'+dd.variablename+'_'+ddd.variablename+'" data-id="'+ddd.variableid+'" data-type="'+ddd.variabletype +'" data-hastime="'+ddd.now+'">'+ddd.variablename +'</span>';
						}
					});
					
						$p2+=$p3+'</div></div></li>';
						$p3='';
				});
				$p2+='</ul></div>';
				$p+=$p2;
				$p2='';
			});
			$("#common-cont .main-row .tab-content").html($($p)).prepend($('<div class="tab-pane" id="often-condition">没有使用记录!</div>'));
			$("#common-cont .main-row .top-ul").html($($p1)).prepend($('<li><a>常用指标 </a></li>'));
			
			$("#common-cont .main-row .top-ul li").eq(1).addClass("active");
			$("#common-cont .main-row .tab-pane").eq(1).addClass("active");
			$("#common-cont .main-row .top-ul li").click(function(){
				$(this).siblings("li").removeClass("active").end().addClass("active");
				$("#common-cont .main-row .tab-pane").eq($(this).index()).removeClass("fade").addClass("active").siblings(".tab-pane").removeClass("active");
			})			
		   },
			error:function(data){
				bootbox.setDefaults("locale","zh_CN");
	    		bootbox.alert("获取指标失败!错误："+data.statusText+":"+data.status);
			}	
		});
	}
//	加载条件选择器结束
	conditionPanelInit();
	//条件器弹出
	$(".keyinput").live("click",function(event){event.stopPropagation();})
	$(".keyinput").live("focus",function(e) {
		$(this).select();
		var _this = this;
		$(".mypanel").addClass("hidden");
		$(".conditions-box").css({"left":$(this).offset().left,"top":$(this).offset().top+38});
		$(".conditions-box").removeClass("hidden")
		$(".conditions-box .main-row .block-info").off("").on("click",function() {
				$(_this).val($(this).html())
				$(_this).parent().attr({"data":$(this).attr("data"),"data-type":$(this).attr("data-type"),"data-hastime":$(this).attr("data-hastime"),"data-id":$(this).attr("data-id")});

				formchange($(this).attr("data-type"),$(this).attr("data-id"),$(_this));
				$(".conditions-box").addClass("hidden");
				
		})		
	});
	$(".keyinput").live('input',function(e){
		 $(".mypanel").addClass("hidden");
		 $(".conditions-box").addClass("hidden");
		 $(e.target).parent().attr({"data":'',"data-id":'',"data-hastime":'',"data-type":''});
		$txt=$.trim($(this).val());
		var list="";var t="";var t2="";
		if($txt){
			var test = 1;
			if (test != 1) {
				return false;
			} else {
				test =$.ajax({  
		        	   url: 'searchbyvariablename',     
		        	   contentType: 'application/json', 
		               type: 'POST',             
		               data:JSON.stringify({"variablename":$txt}),//向服务器端发送的数据 
		               dataType: "json",//服务器返回数据的类型为json  
		               success: function (data){
		            	
		            	  if(data.length){
		            	   $.each(data,function(i,d){
		            		  
								  $.each(d.hierarchicalVariableSurvey,function(ii,dd){
								    	$.each(dd.hierarchicalVariableDetailed,function(iii,ddd){
								    		
								    		list+="<li><span class='block-info' data="+d.variablename+'_'+dd.variablename+'_'+ddd.variablename+" data-id='"+ddd.variableid+"' data-type="+ddd.variabletype+" data-hastime="+ddd.now+">"+ddd.variablename+"</span>"+"-"+dd.variablename+"-"+d.variablename+"</li>";
								    	})
								    	t2+=list;
								    	list="";
								    })
								    t+=t2;
								    t2="";
							 })
							 }else{
								 t='<li>未查到相关字段</li>';
							 }
		            	  $(".mypanel").addClass("hidden");
			          		 
		            	   $(".mypanel").html('<ul>'+t+'</ul>');
		            	   if($txt){$(".mypanel").removeClass("hidden");$(".conditions-box").addClass("hidden"); }
		            	   
		            	   panelSetting($(".mypanel"),$(e.target),true,0,0);
		            	 //通用变量添加变量后关闭条件器
		    				$(".mypanel li").click(function() {
		    						var str = "";
		    						$(e.target).val($(this).find(".block-info").html());
		    						$(e.target).parent().attr({"data":$(this).find(".block-info").attr("data"),"data-id":$(this).find(".block-info").attr("data-id"),"data-type":$(this).find(".block-info").attr("data-type"),"data-hastime":$(this).find(".block-info").attr("data-hastime")});
		    						
		    						formchange($(this).find(".block-info").attr("data-type"),$(this).find(".block-info").attr("data-id"),$(e.target));
		    						$(".mypanel").addClass("hidden");
		    						
		    						
		    					})
		    				//通用变量添加变量后关闭条件器 end
		            	},
		    			error:function(data){
		    				bootbox.setDefaults("locale","zh_CN");
				    		bootbox.alert("获取数据失败!错误："+data.statusText+":"+data.status);
		    			}
			   });
			}
	  }else{
		  $(".mypanel").addClass("hidden");
		  $(".conditions-box").removeClass("hidden");
	  }
	});
	// 改变关系和对比值
	function formchange(type,id,rowObj) {
		
		var row=$(rowObj).parents(".form-group").nextAll(".form-group");
		$(rowObj).parents(".varpanel4").find(".form-group").addClass("hidden");
		var input3=$(rowObj).closest(".row").find(".input3");
		var input2='';
		var str = "";
		$(input3).removeClass("hidden");
		switch(type) {
			case "0":
				str = '<option value="等于">等于</option><option value=">">大于</option><option value="大于等于">大于等于</option><option value="小于">小于</option><option value="小于等于">小于等于</option><option value="不等于">不等于</option><option value="介于">介于</option>';
				input2='<input type="number" class="form-control input-inline" placeholder="" name="lastdata">';
				$(rowObj).parents(".form-group").removeClass("hidden");
				
				break;
			case "1":
				str = '<option value="等于">等于</option><option value="不等于">不等于</option><option value="包含">包含</option><option value="不包含">不包含</option>';
				
				input2='<input type="text" class="form-control input-inline" placeholder="输入对比值" name="lastdata" >';
				$(rowObj).parents(".varpanel4").find(".form-group").removeClass("hidden");
				break;
			case "2":
				str = '<option value="等于">等于</option><option value=">">大于</option><option value="大于等于">大于等于</option><option value="小于">小于</option><option value="小于等于">小于等于</option><option value="不等于">不等于</option><option value="介于">介于</option>';
				input2='<div class=" date-picker input-daterange" data-date="2017-01-01" data-date-format="yyyy-mm-dd"><input type="text" class="form-control" name="lastdata" placeholder="选择时间"></div>';
				$(rowObj).parents(".varpanel4 .form-group").removeClass("hidden");
				break;
			case "3":
				if($(rowObj).val().indexOf("是否")>=0)
				    str = '<option value="是">是</option><option value="否">否</option>';
				else{
					str = '<option value="有">有</option><option value="无">无</option>';
				}
				$(input3).addClass("hidden");$(rowObj).parents(".form-group").removeClass("hidden");
				break;

			case "4":
				str = '<option value="等于">等于</option><option value="不等于">不等于</option><option value="包含">包含</option><option value="不包含">不包含</option>';
				input2='<select class="form-control select-input" name="lastdata">';
				$(rowObj).parents(".form-group").removeClass("hidden");
				var xhr=1;
				if(xhr!=1){return false;}
				else{
					xhr=$.ajax({  
			     	   url: 'getfieldbyid',     
			     	   contentType: 'application/json', 
			            type: 'POST',             
			            data:JSON.stringify({"variableid":id}),//向服务器端发送的数据 
			            dataType: "json",//服务器返回数据的类型为json  
			            success: function (data) {
			            	
			            	input2='<select class="form-control select-input" name="lastdata">';
			            	if(!data.fieldsList){return false;}
			            	if(data.fieldsList.length){
			            	$.each(data.fieldsList,function(i,d){
			            		input2+='<option value="'+d.fieldname+'">'+d.fieldname+'</option>';
			            		
			            		
			            	});
			            }else{
			            	input2+='<option value=null>没有字段</option>';
			            }
			            	input2+='</select>';
			            	input2=$(input2);
			            	$(input3).html(input2);
			            	$(rowObj).parents(".form-group").removeClass("hidden");
			            	$(".small-group .form-control").addClass("input-sm");
			            },
						error:function(data){
							bootbox.setDefaults("locale","zh_CN");
				    		bootbox.alert("获取数据失败!错误："+data.statusText+":"+data.status);
						}
				});
				}
				break;
			case "5":
				str = '<option value="等于">等于</option><option value="不等于">不等于</option><option value="包含">包含</option><option value="不包含">不包含</option>';
				input2='<div class="input-icon right"><i class="fa fa-search"></i><input type="text" class="form-control mulit-input" placeholder="搜索" name="lastdata"></div>';
				$(rowObj).parents(".varpanel4").find(".form-group").removeClass("hidden");
				break;

		}
		
		$.ajax({  
	     	   url: 'getunitsbyid',     
	     	   contentType: 'application/json', 
	            type: 'POST',             
	            data:JSON.stringify({"variableid":id}),//向服务器端发送的数据 
	            dataType: "json",//服务器返回数据的类型为json  
	            success: function (data) {
	            	var units='';
	            	if(data.length){
	            		$.each(data,function(i,d){
	            			units+='<option value="'+d.unittableid+'">'+d.unitname+'</option>';
	            		})
	            		
	            		row.find(".units").html(units).parent().removeClass("hidden");
	            		if(row.closest(".tab-pane").attr("id")=="tab3"){
	            		row.find(".units").html(units).parents(".input3-group").find(".input3").css("width","60%");
	            		}else{
	            		row.find(".units").html(units).closest(".row").find(".input3").attr("class","form-group input3 no-padding col-md-2");
	            		}
	            	}else{
	            		units=''
	            			if(row.closest(".tab-pane").attr("id")=="tab3"){
	    	            		row.find(".units").html(units).parents(".input3-group").find(".input3").css("width","95%");
	    	            		}else{
	    	            		row.find(".units").html(units).closest(".row").find(".input3").attr("class","form-group input3 no-padding col-md-4");
	    	            		}
	            			row.find(".units").html(units).parent().addClass("hidden");
	            		
	            	}
	            	
	            },
				error:function(data){
					bootbox.setDefaults("locale","zh_CN");
		    		bootbox.alert("获取数据单位失败!错误："+data.statusText+":"+data.status);
				}
		});
//		关系框
		$(input3).html($(input2));
		row.find(".relationship-select").html($(str)).change(function(){
			//介于出两个框
			if($(this).val()=="介于"){
				$(input3).html($(input2));
				$(input3).append($(input2));
				
				$(input3).children().css({"float":"left","width":"49%","margin-right":"1%"}); 
				
				ComponentsPickers.init();
			}else{
				$(input3).html($(input2));
				ComponentsPickers.init();
			}
		});
		$(rowObj).parents(".varpanel4").find(".relationship-select").html($('<option value="等于">等于</option><option value="包含">包含</option><option value="不包含">不包含</option><option value="不等于">不等于</option>'));
		$(".small-group .form-control").addClass("input-sm");
		ComponentsPickers.init();
		
		
	}
	//改变关系和对比值end
//	输入框限制
	$(".input3 .input-inline").live("input",function(e){
		
		e = (e) ? e : window.event
		$(e.target).val(stripscript($(e.target).val()))
			return stripscript($(e.target).val());
		
	});
	function stripscript(s) 
	{ 
	    var pattern = new RegExp("[`~!@#$^&=|{}':;',\\[\\]<>/?~！@#……&（）——|{}‘；：”“']") 
	    var rs = ""; 
	    for (var i = 0; i < s.length; i++) { 
	        rs = rs+s.substr(i, 1).replace(pattern, ''); 
	    } 
	    return rs; 
	}
	//第三个框海量枚举与下拉列表	
	$(".input3 .mulit-input").live("input",function(e){
		var key3=stripscript($.trim($(e.target).val()));
		var id=$(e.target).parents(".form-group").siblings(".form-group").find(".keyinput").parent().attr("data-id");
		
		var pageCount=0;
		var currentPage=1;
		$(e.target).parent().removeAttr("data-fieldid");
		var iii = {"variableid":id,"fieldname":key3,"pageSize":"20","index":1};
		$.ajax({  
	     	   url: 'getfieldbyid',     
	     	   contentType: 'application/json', 
	            type: 'POST',             
	            data:JSON.stringify(iii),//向服务器端发送的数据 
	            dataType: "json",//服务器返回数据的类型为json  
	            success: function (data) {
	            	var t1=''
	            		pageCount=data.page.pageCount;
	            	 if(data.fieldsList.length){
		            	   $.each(data.fieldsList,function(i,d){
		            		  t1+='<li class="data3" data-fieldid="'+d.fieldname+'" data-fielddesc="'+d.fielddesc+'" title="'+d.fieldname+'">'+d.fieldname+'</li>'
							 })
							 $(".mypanel").html('<ul>'+t1+'</ul>');
		            	   $(".mypanel").removeClass("hidden");
		            	   panelSetting($(".mypanel"),$(e.target),true,0,0);
							 
					}
							 
		            	   
			            	 //通用变量添加变量后关闭条件器
			    				$("li.data3").click(function() {
			    						
			    						$(e.target).val($(this).html());
			    						$(e.target).parent().attr("data-fieldid",$(this).attr("data-fieldid"));
			    						
			    						
			    						$(".mypanel").addClass("hidden");
			    						
			    					})
			    				//通用变量添加变量后关闭条件器 end
	            },
				error:function(data){
					bootbox.setDefaults("locale","zh_CN");
		    		bootbox.alert("获取数据失败!错误："+data.statusText+":"+data.status);
				}
			});
		
	})
		//第三个框海量枚举与下拉列表 end

	
//	确定按钮点击触发条件添加
	$(".tab2 .ensure-group button").live("click",function(){
		
		$search=$(this).closest(".row").find("input[name='search']");
		$relationship=$(this).closest(".row").find("select[name='relationship']");
		$valu=$(this).closest(".row").find(".input3").find("*[name='lastdata']");
		$unit=$(this).closest(".row").find(".units").children("option:checked").html();
		var item='';
		var s4='<span class="s4" data=""></span>';
		if(typeof($unit)!='undefined'){
			s4='<span class="s4" data="'+$unit+'">'+$unit+'</span>';
		}
		if($.trim($search.parent().attr("data")).length){
			
			var s1='<span class="s1" data="'+$search.parent().attr("data")+'">'+$search.val()+'</span>';
			if($.trim($relationship.val()).length){
				var s2='<span class="s2" data="'+$relationship.val()+'">'+$relationship.children("option:checked").html()+'</span>';
			   if($search.parent().attr("data-type")=="3"){
				   s3='<span class="s3" data=""></span>';
				   s3_='<span class="s3" data=""></span>';
			   }else if($relationship.val()=="介于"){
				   if($.trim($valu.eq(0).val()).length>0&&$.trim($valu.eq(1).val()).length>0){
					   s3='<span class="s3" data="'+$.trim($valu.eq(0).val())+'至'+$.trim($valu.eq(1).val())+'">'+$.trim($valu.eq(0).val())+'至'+$.trim($valu.eq(1).val())+'</span>';
					   s3_='<span class="s3" data="'+$.trim($valu.eq(0).val())+'至'+$.trim($valu.eq(1).val())+'">'+$.trim($valu.eq(0).val()).substring(0,2)+'...</span>';
				  
				   }else{
					   
					   $valu.pulsate({
			                color: "#ed5565",
			                repeat: false,
			                speed: 300
			                
			            });
					   return false;
				   }
			   }else{
				   if($.trim($valu.val()).length>0){
					   if($search.parent().attr("data-type")=="4"){
						   s3='<span class="s3" data="'+$valu.children("option:checked").html()+'">'+$valu.children("option:checked").html()+'</span>';
						   s3_='<span class="s3" data="'+$valu.children("option:checked").html()+'">'+$valu.children("option:checked").html().substring(0,2)+'...</span>';
					   }else if($search.parent().attr("data-type")=="5"){
						  
						   if($valu.parent().attr("data-fieldid")){
						   s3='<span class="s3" data="'+$valu.val()+'">'+$valu.val()+'</span>';
						   s3_='<span class="s3" data="'+$valu.val()+'">'+$valu.val().substring(0,2)+'...</span>';
						   }
						   else{
							   bootbox.setDefaults("locale","zh_CN");
					    		bootbox.alert("抱歉，该版本暂不支持手动输入");
							   $valu.val('');
							   return false;
						   }
					   }else{
						   s3='<span class="s3" data="'+$valu.val()+'">'+$valu.val()+'</span>';
						   s3_='<span class="s3" data="'+$valu.val()+'">'+$valu.val().substring(0,2)+'...</span>';
					   }
				   }else{
					   $valu.pulsate({
			                color: "#ed5565",
			                repeat: false,
			                speed: 300
			                
			            });
					   return false;
				   }
			   }
			}
		}else{
			$search.pulsate({
                color: "#ed5565",
                repeat: false,
                speed: 200
                
            });
			 return false;
		}
		
		item='<li title="'+$(s1).text()+$(s2).text()+$(s3).text()+$(s4).text()+'">'+s1+s2+s3+s4+'<b class="close-li">&times;</b></li>';
		if($(item).text().length>=14){
			
			item='<li title="'+$(s1).text()+$(s2).text()+$(s3).text()+$(s4).text()+'">'+s1+s2+s3_+s4+'<b class="close-li">&times;</b></li>';
		}
		
		if($(this).closest(".tab2").find('.conditions-container.active').find("ol").append(item)){
			eachBox($(this).closest(".tab2"));
			
			moveInit($(this).closest(".tab2"));
			$valu.val('');
			
		}
		
	})

    var patients='';//隐含的公式
	//遍历条件框，动态拼凑公式
	function showTab(data,obj){
		console.log(obj);
		if(typeof(data.total)!="undefined"&&parseInt(data.total)>=0){
			$(obj).find(".eg-num").prop('number', parseInt($(obj).find(".eg-num").html())).animateNumber({
			    number: data.total,
			    numberStep: function(now, tween) {
			    var target = $(tween.elem),
			    rounded_now = Math.round(now);

			    target.text(now === tween.end ? rounded_now : rounded_now);
			    }
			    },
			    500,
			    'linear'
			    );
    	}else{
    		$(obj).find(".eg-num").html(0);
    		//bootbox.setDefaults("locale","zh_CN");
    		//bootbox.alert("找不到病症!");
    	}
    	/*$(".eg-num").pulsate({
             color: "#bbc779",
             repeat: false
         });*/
		
    	if(typeof(data.total)!="undefined"&&data.total!="0"){
    		
    		if(data.hits){
        		var res='<thead><tr><td colspan="6" class="text-right"><a class="export" data-toggle="modal" href="#responsive"><img src="img/export_icon_btn.png" alt="导出数据" />导出</a></td></tr></thead><tbody><tr class="first-th"><th>序号</th><th>性别</th><th>年龄</th><th>诊断</th><th>就诊次数</th><th>操作</th></tr>';
	        	$.each(data.hits,function(i,d){
	        		var disease0=d.disease == null?'':d.disease;
	        		if(i<10){
	        			disease=disease0;
	        		if (disease0.length > 40) { disease =disease0.substring(0,40)+"..."}
	        		res+='<tr><td>'+(i+1)+'</td><td>'+d.gender+'</td><td>'+d.age+'</td><td title="'+disease0+'"><span>'+disease+'</span></td><td>'+d.visitNum+'</td><td><i class="fa fa-trash-o"></i></td></tr>';
	        		}
	        	
	        	});
	        	res+='</tbody><tfoot><tr><td colspan="6"></td></tr></tfoot>';
	        	
	        	$(obj).find(".res_tab1 table").html(res);
        	}
        	}else{
        		$(obj).find(".res_tab1 table").html('<tr><th class="fred">抱歉，没有找到结果</th></tr>');
        		
        	}
	}
	
	function eachBox(obj){
		
		var b1='';var b2='';var b='';var b3;
		var c1='';var c2='';var c3='';
		$.each(obj.find(".conditions-container ol"),function(i,b){
			
			     
				$.each($(b).children("li"),function(ii,bb){
					var ff=$(bb).children("span.s2").attr("data") =="有"||$(bb).children("span.s2").attr("data") =="无";
					
					var v3=$(bb).children("span.s3").attr("data");
					
					var i=v3.indexOf("至");
					if(i>0){
						
						b3=$(bb).attr("title"); 
						 var value1=v3.substring(0,i);
						 var value2=v3.substring(i+1,v3.length);
						 
						if(ii){
						b2+='&nbsp;||&nbsp;'+$(bb).attr("title");
						c3+=',{"field":"'+$(bb).children("span.s1").attr("data")+'","exp":"'+$(bb).children("span.s2").attr("data")+'","values":["'+value1+'","'+value2+'"],"flag":"||","unit":"'+$(bb).children("span.s4").attr("data")+'"}';
						}else{
							b2+=$(bb).attr("title");
								
							c3+='{"field":"'+$(bb).children("span.s1").attr("data")+'","exp":"'+$(bb).children("span.s2").attr("data")+'","values":["'+value1+'","'+value2+'"],"flag":"||","unit":"'+$(bb).children("span.s4").attr("data")+'"}';
						};
						
						if(ff){
							
							c3=c3.replace('"exp":"'+$(bb).children("span.s2").attr("data")+'"','"exp":""').replace('"values":[""]','"values":["'+$(bb).children("span.s2").attr("data")+'"]');
							
						}
						if($(bb).children("span.s2").attr("data") =="是"||$(bb).children("span.s2").attr("data") =="否"){
						c3=c3.replace('"exp":"'+$(bb).children("span.s2").attr("data")+'"','"exp":""').replace('"values":[""]','"values":["'+$(bb).children("span.s2").attr("data")+'"]');
						}
						
						
					}else{
					
					
					b3=$(bb).attr("title"); 
					if(ii){
						
					b2+='&nbsp;||&nbsp;'+b3;
					c3+=',{"field":"'+$(bb).children("span.s1").attr("data")+'","exp":"'+$(bb).children("span.s2").attr("data")+'","values":["'+$(bb).children("span.s3").attr("data")+'"],"flag":"||","unit":"'+$(bb).children("span.s4").attr("data")+'"}';
					}else{
						b2+=b3;
						c3+='{"field":"'+$(bb).children("span.s1").attr("data")+'","exp":"'+$(bb).children("span.s2").attr("data")+'","values":["'+$(bb).children("span.s3").attr("data")+'"],"flag":"||","unit":"'+$(bb).children("span.s4").attr("data")+'"}';
					};
					if($(bb).children("span.s2").attr("data") =="是"||$(bb).children("span.s2").attr("data") =="否")
					c3=c3.replace('"exp":"'+$(bb).children("span.s2").attr("data")+'"','"exp":""').replace('"values":[""]','"values":["'+$(bb).children("span.s2").attr("data")+'"]');
					if($(bb).children("span.s2").attr("data") =="有"||$(bb).children("span.s2").attr("data") =="无")
						c3=c3.replace('"exp":"'+$(bb).children("span.s2").attr("data")+'"','"exp":""').replace('"values":[""]','"values":["'+$(bb).children("span.s2").attr("data")+'"]');
				}
					
				});
				
				if(b2!=''){
					
				if(i){
				  b1+='&& (&nbsp;'+b2+'&nbsp;)&nbsp;';
				  c1+=',['+c3+']';
				}else{
					b1+='(&nbsp;'+b2+'&nbsp;)&nbsp;';
					c1+='['+c3+']';
					
				}
				}
				 b2='';c3='';
		});
		if(c1.indexOf(",")==0){
			c1=c1.substring(1,c1.length);
			
		}
		patients=c1;
		
		c1='';
		if(b1.indexOf("&")==0){
			b1=b1.substring(2,b1.length);
			
		}
		if($(obj).find(".equation").html(b1)){
			var status;
		if($(obj).find(".res_tab1").hasClass("hidden")){
			status=1;
		}else{
			status=0;
		}
		if($.trim($(obj).find(".equation").html()).length>0){	
			
			xhr=$.ajax({
				   url: 'getbypatients',     
			 	   contentType: 'application/json', 
			        type: 'POST',             
			        data:JSON.stringify({"patients":$(".equation").html(),"query":'{"expressions":['+patients+'],"page":"0","size":"10"}',"studyid":$("#studyid").val(),"count":status}),//向服务器端发送的数据 
			        dataType: "json",
			        success:function(data){
			        	showTab(data,obj);
				        $("#tab_15_1 .nav-tabs li.active").attr("data-exp",'['+patients+']');
				     },
					error:function(data){
						bootbox.setDefaults("locale","zh_CN");
						bootbox.alert("获取数据失败！错误："+data.statusText+":"+data.status);
					}
			        });
		
		}else{
			xhr=$.ajax({
				   url: 'getbypatients',     
			 	   contentType: 'application/json', 
			        type: 'POST',             
			        data:JSON.stringify({"patients":$(obj).find(".equation").html(),"query":'{"expressions":[[{"field":"病历_基本信息_性别","exp":"不等于","values":["未说明的性别"],"flag":"||","unit":""}]],"page":"0","size":"10"}',"studyid":$("#studyid").val(),"count":status}),//向服务器端发送的数据 
			        dataType: "json",
			        success:function(data){
			        	showTab(data,obj);
			        	 $("#tab_15_1 .nav-tabs li.active").attr("data-exp",'[[{"field":"病历_基本信息_性别","exp":"不等于","values":["未说明的性别"],"flag":"||","unit":""}]]');
				     },
					error:function(data){
						bootbox.setDefaults("locale","zh_CN");
						bootbox.alert("获取数据失败！错误："+data.statusText+":"+data.status);
					}
			        });
		}
		
		}	
		
		
		moveInit();
		
	}
	var n=0;
	
/********************tab通用 end************************/

	
	
	
	

//	***********tab2动作******************	  
//	删除li 
			$(".tab2 .conditions-container ol>li>.close-li").live("click",function(e){
				var _this=$(e.target).parents(".tab2");
				$(this).parent("li").remove();
				$i=0;
				
				eachBox(_this);
			});
		//监听条件框
		var $i=1;
//		$("#tab2 .conditions-container ol").on('DOMNodeInserted',function(e) {  
//			
//			
//		}); 
//		
//		修改
		/*$("#tab2 .conditions-container").on("dblclick","ol>li",function(e){
			formchange($(this).find("span.s1").attr("data-type"),$(this).find("span.s1").attr("data-id"),$("#tab2 .well-box"));
			$(this).css({"background":"#fff","border":"#ddd 1px solid","color":"#daa"}).addClass("editing");
			$("#tab2 .ensure-group button").click(function(){
				$(e.target).parents("ol").find("li.editing").remove();
				eachBox();
			});	
			
		});*/
		//拖动
		window.moveInit=function(){
			
			$( ".conditions-container li" ).draggable({
				 revert: "invalid",
				containment: '.conditions-container-box',
				cursor: "move",
				delay: 100,
				zIndex:999,
				helper:function(event,ui) {
					var s;
					if($(event.target)[0].tagName=="LI"){
						s=$(event.target);
					}else{
						s=$(event.target).parent("li");
					}
					
					return  s;
				},
				snapMode: 'outer',
				start: function(event, ui){
					$(this).css({"background":"#f7fcf8","border":"1px dashed #D5D5D5","color":"rgba(0,0,0,0.2)"}) },
		         stop: function(event, ui) {
		        	 $(this).css({"background":"#e5e9f0","border":"0px","color":"rgba(0,0,0,1)"});
		        	 eachBox($(event.target).closest(".tab2"));
		        	
		        	},
			     
			});
			$( ".conditions-container ol" ).droppable({

		      activeClass: "ui-state-hover",
		      hoverClass: "ui-state-active",
		    
		      drop: function( event, ui ) {
		    	 $(this).parents(".conditions-container").addClass("active").siblings().removeClass("active");
		    	  event.preventDefault();
		    	  ui.draggable.appendTo($(this));
		      }
			});
			
			}
		moveInit();//初始化li拖动
		
	
		
	


	   
//	 点击查看表格
	  $(".look-btn").live("click",function(e){
		  
		  var obj=$(e.target);
		 var idtag=(obj.closest(".tab-pane").attr("id"));
		  obj.closest(".tab2").find(".res_tab1").addClass("hidden");
		  obj.closest(".tab2").find(".loadbg").removeClass("hidden");
		  $("#shadediv").removeClass("hidden");
		 if(obj.closest(".tab2").find(".equation").html().length<=0){
		  patients='[{"field":"病历_基本信息_性别","exp":"不等于","values":["未说明的性别"],"flag":"||","unit":""}]';
		  }
		  var count=0;
		   var xhr=$.ajax({
			   url: 'getbypatients',     
		 	   contentType: 'application/json', 
		        type: 'POST',             
		        data:JSON.stringify({"patients":obj.closest(".tab2").find(".equation").html(),"query":'{"expressions":['+patients+']}',"studyid":$("#studyid").val(),"count":0,"page":0,"size":10}),//向服务器端发送的数据 
		        dataType: "json",
		        success:function(data){
		        	
		        	if(typeof(data.total)!="undefined"&&data.total!="0"){
		        		count=data.total;
		        		
			        	if(data.hits){
			        		var res='<thead><tr class="first-tr"><td colspan="6" class="text-right"><a class="export" data-toggle="modal" href="#responsive"><img src="img/export_icon_btn.png" alt="导出数据" />导出</a></td></tr></thead><tbody><tr class="first-th"><th>序号</th><th>性别</th><th>年龄</th><th class="text-left">诊断</th><th>就诊次数</th><th>操作</th></tr>';
				        	$.each(data.hits,function(i,d){
				        		var disease0=d.disease == null?'':d.disease;
				        		
				        			disease=disease0;
				        		if (disease0.length > 40) { disease =disease0.substring(0,40)+"..."}
				        		res+='<tr><td>'+(i+1)+'</td><td>'+d.gender+'</td><td>'+d.age+'</td><td title="'+disease0+'" class="text-left"><span>'+disease+'</span></td><td>'+d.visitNum+'</td><td><i class="fa fa-trash-o"></i></td></tr>';
				        		
				        	
				        	});
				        	res='<table class="table table-striped table-noborder text-center">'+res+'</tbody></table><div class="pageToolbar1'+idtag+'"></div>'
				        	
				        	obj.closest(".tab2").find(".res_tab1").html(res);
				        	
			        	}else{
			        		bootbox.setDefaults("locale","zh_CN");
				    		bootbox.alert("找不到病症!");
			        	}
			        	
		        	}else{
		        		obj.closest(".tab2").find(".res_tab1 table").html('<tr><th class="fred">抱歉，没有找到结果</th></tr>');
		        		
		        	}
		        	var p1 = new Paging();
		        	p1.init({target:'.pageToolbar1'+idtag,pagesize:10,count:count,toolbar:true,callback:function(page,size,count){
		        		$.ajax({
		     			   url: 'getbypatients',     
		     		 	   contentType: 'application/json', 
		     		        type: 'POST',             
		     		        data:JSON.stringify({"patients":obj.closest(".tab2").find(".equation").html(),"query":'{"expressions":['+patients+']}',"studyid":$("#studyid").val(),"count":0,"page":(page-1),"size":size}),//向服务器端发送的数据 
		     		        dataType: "json",
		     		        success:function(data){
		     		        	console.log(data);
		     		        	if(typeof(data.total)!="undefined"&&data.total!="0"){
		     		        		count=data.total;
		     			        	if(data.hits){
		     			        		var res='<thead><tr class="first-tr"><td colspan="6" class="text-right"><a class="export" data-toggle="modal" href="#responsive"><img src="img/export_icon_btn.png" alt="导出数据" />导出</a></td></tr></thead><tbody><tr class="first-th"><th>序号</th><th>性别</th><th>年龄</th><th class="text-left">诊断</th><th>就诊次数</th><th>操作</th></tr>';
		     				        	$.each(data.hits,function(i,d){
		     				        		var disease0=d.disease == null?'':d.disease;
		     				        		
		     				        			disease=disease0;
		     				        		if (disease0.length > 40) { disease =disease0.substring(0,40)+"..."}
		     				        		res+='<tr><td>'+(size*(page-1)+i+1)+'</td><td>'+d.gender+'</td><td>'+d.age+'</td><td title="'+disease0+'" class="text-left"><span>'+disease+'</span></td><td>'+d.visitNum+'</td><td><i class="fa fa-trash-o"></i></td></tr>';
		     				        		
		     				        	
		     				        	});
		     				        	
		     				        	
		     				        	obj.closest(".tab2").find(".res_tab1 table").html('</tbody>'+res);
		     			        	}else{
		     			        		bootbox.setDefaults("locale","zh_CN");
		     				    		bootbox.alert("找不到病症!");
		     			        	}
		     		        	}else{
		     		        		obj.closest(".tab2").find(".res_tab1 table").html('<tr><th class="fred">抱歉，没有找到结果</th></tr>');
		     		        		
		     		        	}
		     		        	
		     		        	
		     		        	  p1.render({pagesize:size,count:data.total,current: page});
		     		 		  
		     		        	 obj.closest(".tab2").find(" .res_tab1").removeClass("hidden");
		     		         },
		     					error:function(data){

		     						bootbox.setDefaults("locale","zh_CN");
		     			    		bootbox.alert("获取返回数据失败!错误："+data.statusText+":"+data.status);
		     					}
		     		        });
		        	}
		        	});
		        	obj.closest(".tab2").find(".loadbg").addClass("hidden");
		        	obj.closest(".tab2").find(".res_tab1").removeClass("hidden");
		        	
		 		  $("#shadediv").addClass("hidden");
		 		
		         },
					error:function(data){
						$("#shadediv").addClass("hidden");
						bootbox.setDefaults("locale","zh_CN");
			    		bootbox.alert("获取返回数据失败!错误："+data.statusText+":"+data.status);
					}
		        });
		 
	   });
	   //导出功能
//	   生成树
function initTree(d){
	//替换select
	var datastr=JSON.stringify(d).replace(/"selected":false/g,'"state":{"selected": false}').replace(/"selected":true/g,'"state":{"selected": true}');
	var data=JSON.parse(datastr);
	
	$('#tree').remove();
	if(data.length>0){
	 $('#tree').data('jstree', false);
      $(".left-data").prepend($('<div id="tree" class="tree-demo"></div>'));
      $('.left-data #tree_search').addClass("hidden");
	$('#tree').jstree({
		            'plugins': ["wholerow", "checkbox", "types","search"],
		            'core': {
		                "themes" : {
		                    "responsive": false
		                },    
		                'data': data
		            },
		            "types" : {
		                "default" : {
		                    "icon" : "img/export_icon_file.png"
		                },
		                "file" : {
		                    "icon" : "img/export_icon_file.png"
		                }
		            }
		        });
	
	treeChange();
	}
}
function initSearchTree(d){
	//替换select
	var datastr=JSON.stringify(d).replace(/"selected":false/g,'"state":{"opened": true,"selected": false}').replace(/"selected":true/g,'"state":{"selected": true}');
	var data=JSON.parse(datastr);
	
	$('#tree_search').remove();
	if(data.length>0){
	 $('#tree_search').data('jstree', false);
      $(".left-data").append($('<div id="tree_search" class="tree-demo"></div>'));	
      $('.left-data #tree').addClass("hidden");
	$('#tree_search').jstree({
		            'plugins': ["wholerow", "checkbox", "types","search"],
		            'core': {
		                "themes" : {
		                    "responsive": false
		                },    
		                'data': data
		            },
		            "types" : {
		                "default" : {
		                    "icon" : "img/export_icon_file.png"
		                },
		                "file" : {
		                    "icon" : "img/export_icon_file.png"
		                }
		            }
		        });
	treeChange();
	}else{
		//$(".left-data").html($('<div id="treeBlank">没有相关数据</div>'));	
	}
}
function updataTable(data){
	//右侧数据
					  var str='';
					  if(data.length>0){
						  $.each(data,function(i,json){
							 
							  var othername=json.varialbeOtherName==''?json.variableName:json.varialbeOtherName;
							 
							  str+='<tr data-linkid="'+json.linkId+'" data-varid="'+json.variableId+'" data-text="'+json.variableFullName+'"><td>'+(parseInt(i)+1)+'</td><td>'+json.variableName+'</td><td contenteditable="true">'+othername+'</td></tr>';
					           	
				          

						  })
					  
			          
					  }
					  $(".right-data table tbody").html(str);
}						
function exportPlan(data){
	 //已有方案     
	           if(data==null){return false;}
			  var str='';
			  
			  $.each(data,function(i,json){
				  str+='<li data-expId="'+json.expId+'" data-expType="'+json.expType+'"><a>'+json.expName+' <i class="fa fa-close"></i></a></li>';
			  });
			  $("#hasplan ul").html(str);
}


	  $(".res_tab1 .export").live("click",function(){
	  $.ajax({
		  url:"queryexportplan",
		  dataType:"json",
		  type:"POST",
		  data:JSON.stringify({}),
		  contentType:"application/json",
		  success:function(data){
			  if(data.length){return false;}
			  initTree(data.variableTrees);
			  updataTable(data.exportPlanSelectVariables);
			 exportPlan(data.exportPlans);
			 $("#exporttype-ul").css({"width":"75px"});
		  },
			error:function(data){
				bootbox.setDefaults("locale","zh_CN");
	    		bootbox.alert("获取导出数据列表失败!错误："+data.statusText+":"+data.status);
			} 
	  })
	  });
	  $("#exporttype-ul>li").live("click",function(){
		  $("#exporttype-btn").html($(this).text()+'<i class="fa fa-angle-down"></i>');
	  })
	  //方案选择和删除
	  $("#hasplan ul li").live("click",function(e){
		  var _this=$(this);
		  var expid=$(this).attr("data-expId");
		  if($(e.target).hasClass("fa-close")){
			  $.ajax({
				  url:"deleteexportplan",
				  dataType:"json",
				  type:"POST",
				  data:'{"expId":'+expid+'}',
				  contentType:"application/json",
				  success:function(data){
					//右侧数据
					
					  bootbox.setDefaults("locale","zh_CN");
	      	    	bootbox.alert("删除成功!");
					 initTree(data.variableTrees);
					 exportPlan(data.exportPlans);
					}
					  })
		  }else{
			  if($("#hasplan>button").attr("data-id")==expid){return false;}
			  $.ajax({
				  url:"queryexportplan",
				  dataType:"json",
				  type:"POST",
				  data:'{"expId":'+expid+'}',
				  contentType:"application/json",
				  success:function(data){
					//右侧数据
					  if(!data){
					bootbox.setDefaults("locale","zh_CN");
      	    		bootbox.alert("获取导出数据列表失败!");return false;}
					updataTable(data.exportPlanSelectVariables);
					  
					  $("#hasplan>button").html(_this.text()+'<i class="fa fa-angle-down"></i>').attr("data-id",expid);
					 
					initTree(data.variableTrees);
					  
					  
					
					  }
					  })
					  
		  }
	  })
	   $("#responsive .modal-footer .planname-btn").live('ifChanged',function(){
	   	$(this).parents(".modal-footer").find(".planname-input").toggleClass("hidden");
	   });

	  function treeChange(){
		 
		  $('#tree').on("changed.jstree", function (e, data) {
			 
			   var str='';
		           for(var key in data.selected){
		        	  if(data.instance.is_leaf(data.selected[key])){
		        	   var leaf=data.instance.get_node(data.selected[key]);
		        	   var parent=data.instance.get_node(data.instance.get_parent(data.selected[key]));
		        	   var parents=data.instance.get_node(data.instance.get_parent(data.instance.get_parent(data.selected[key])));
		        	   var id=leaf.id;
		           	var name=leaf.text;
		           	var datatext='';
		            if(parents.id=="#"){
		            	datatext=parent.text+'_'+leaf.text;
		            }else{
		            	datatext=parents.text+'_'+parent.text+'_'+leaf.text;
		            }
		            
		           	str+='<tr data-linkid="" data-varid="'+id+'" data-text="'+datatext+'"><td>'+(parseInt(key)+1)+'</td><td>'+name+'</td><td contenteditable="true">'+name+'</td></tr>';
		        	  }
		           }
		          
		           $(".right-data table tbody").html(str);
		          
		         });
		  $('#tree_search').on("changed.jstree", function (e, data) {
			   var str='';
		           for(var key in data.selected){
		        	  
		        	  if(data.instance.is_leaf(data.selected[key])){
		        	   var leaf=data.instance.get_node(data.selected[key]);
		        	  
		           	$('#tree').jstree('select_node', leaf);
		            
		           	
		        	  }
		           }
		           
		          
		          
		         });
		 $("#var_table>tbody>tr>td：first-child").each(function(i,td){
			 $(td).html(i+1);
		 })
		  
	  } 
	  treeChange();
	  $('#tree-search').live("focus",function () {
		  $(this).select();
	  });
        $('#tree-search').live("input",function () { 
        	var k=$.trim($('#tree-search').val());
        	if(k!=''&&k!=null){
        		$.ajax({
            		  url:"queryexportvariable",
            		  dataType:"json",
            		  type:"POST",
            		  data:'{"keyWord":"'+k+'"}',
            		  contentType:"application/json",
            		  success:function(data){
            			  initSearchTree(data.variableTrees);
            			 
            			  
            		  },
            			error:function(data){
            				bootbox.setDefaults("locale","zh_CN");
            	    		bootbox.alert("获取导出数据列表失败!错误："+data.statusText+":"+data.status);
            			} 
            	  })
        }else{

        	$("#tree_search").addClass("hidden").prev().removeClass("hidden");
        }
  
   
});  
       
//		***********tab2动作end******************		
//	************	公用函数		************************
//		点击其他地方条件器关闭
		function stop(e) {
			if (e.stopPropagation)
			e.stopPropagation();
			else
			e.cancelBubble = true;
		} 
		$(document).bind('click',function(e){
			if(!$(e.target).hasClass("loadbtn")&&$(e.target).attr("alt")!="下载任务"&&$(e.target).attr("id")!="export_res"&&$(e.target).parents('.pull-right').attr("id")!="export_res"){
				$("#export_res").addClass("hidden");
			}
			
			$(".conditions-box").addClass("hidden");
			$(".mypanel").addClass("hidden");
			$(".num_panel").addClass("hidden");
			/*$(".time_panel").addClass("hidden");*/
			$("#tab4 .block-var .edit-block i").removeClass("open");
			$(".userinfo").addClass("hidden").animate({"left":"40px","opacity":"0","width":"0px","height":"0px"},250);	
		}); 
		
		$(".conditions-box,.mypanel,.num_panel,.time_panel,.userinfo,.userinfo-btn").on("click", function(e) {
		console.log("你点了哪里？")
		console.log(e.target);
	    	stop(e);	
		});
		
	//点击其他地方条件器关闭 end
	   
	   
//		  判断是否为汉字
		  function CheckChinese(val){    
			var reg = new RegExp("[\\u4E00-\\u9FFF]+","g");
			if(reg.test(val)){    
			       return true;       
			} else{
				return false;
			}     
			  };
	//浮动窗口位置设置(为了两个自动补全)
		 function panelSetting(panel,targetObj,widthSync,offX,offY){
				  
				  var Objh=$(targetObj).outerHeight();
				  var Objw=$(targetObj).outerWidth();
				  var Pleft=$(targetObj).offset().left;
				  var Ptop=$(targetObj).offset().top+Objh;
				 
				  $(panel).css({"position":"absolute","left":Pleft+offX,"top":Ptop+offY,"width":Objw});
				
			     }
//			************	公用函数	end	************************

//******************tab3*********************** 
$("#tab3>.well *").live("click",function(){
	if($(".resure-group").hasClass("hidden")){
		$(".resure-group").removeClass("hidden");
	}
});

$(".result-tab ul li").live("click",function(){
	$("#tab3 .result-tab-content .tab-pane").addClass("hidden");
	$("#tab3 .result-tab-content").find($(this).children("a").attr("href")).removeClass("hidden").addClass("active");
});
var smallGroupNode='<div class="row small-group"><div class="col-md-1 no-padding name-group"><input type="text" class="group-name" value="亚组"></div><div class=" no-margin no-padding col-md-8" ><div class="row no-margin"><div class="form-group  no-margin no-padding search-group "><div class="input-group search"><input type="text" class="form-control keyinput input-sm" placeholder="搜索项" name="search" value="" autocomplete="off"></div></div><div class="form-group no-margin relationship-group"><div><select class="form-control relationship-select input-sm" name="relationship"><option style="color: #B3B3B3;">关系</option><option>1</option></select></div></div><div class="form-group input3-group"><div class=" input3"><input type="text" class="form-control input-inline input-sm" placeholder="对比值" name="data3"></div><div class="hidden"><select class="form-control input-sm units" name="units"></select></div></div><div class="no-padding  btn-group"><b class="del-child" title="删除分组"><i class="fa  fa-times"></i></b></div></div></div></div>';
var othersmallNode='<div class="row small-group other"><div class="col-md-1 no-padding name-group"><span class="group-name" contenteditable="true">其他</span></div><div class="col-md-8 no-margin no-padding"><div class="row no-margin"><div class="form-group  no-margin no-padding other-group"><input type="text" class="form-control  input-sm" placeholder="亚组正常分组外的其他分组" name="search" value="" autocomplete="off"></div></div></div></div>';
//添加分组
$("#tab3 .plus-children").live("click",function(){
	
	if(!$(this).parents(".big-group").next(".small-group").length){
		$(this).parents(".big-group").after($(smallGroupNode));
		$(this).parents(".big-group").next().after($(othersmallNode));
	}else{
		var smallgroup=$('<div class="row small-group">'+$(this).parents(".group-box").find(".small-group").html()+'</div>');
		smallgroup.find(".keyinput").val( $(this).parents(".group-box").find(".small-group .keyinput").val());
		$(this).parents(".big-group").nextAll(".other").eq(0).before(smallgroup);
		
	}
	nth();
});
 var tag_firstGroup=true;
$("#tab3 .plus-group").live("click",function(e){	
	var biggroup=$('<div class="row big-group">'+$(this).parents(".group-box .big-group").html()+'</div>');
	biggroup=biggroup.find(".group-name").removeClass("edited").end().find(".big.btn-group").html('<b class="plus-group" title="添加分组"><i class="fa fa-plus-circle"></i></b><b class="del-this"><i class="fa fa-minus-circle" title="删除该组"></i></b>').end();
	$(this).parents("#tab3").find('.big-group.other').parents(".group-box").before('<div class="group-box"></div>');
	biggroup.find(".keyinput").val( $(this).parents(".group-box").find(".keyinput").val());
    var newNode=$(this).parents("#tab3").find('.big-group.other').parents(".group-box").prev().html(biggroup);
    
    
  if($(this).parents(".group-box").siblings(".group-box").length<3){
	  $(this).after($('<b class="del-this"><i class="fa fa-minus-circle" title="删除该组"></i></b>'));
  }
	  $(this).remove();
	nth();
})
//删除子节点
$("#tab3 .del-child").live("click",function(){
	
	if($(this).parents(".small-group").next(".small-group").hasClass("other")&&(!$(this).parents(".small-group").prev(".small-group").length)){
		$(this).parents(".small-group").next(".other.small-group").remove().end().remove();
	}else{
		$(this).parents(".small-group").remove();
	};
	nth();
});
$("#tab3 .del-this").live("click",function(){
	var groupnum=$(this).parents(".group-box").siblings(".group-box").length;
	var ithis=$(this).parents(".group-box").index();
	var btnStr='<b class="plus-group" title="添加分组"><i class="fa fa-plus-circle"></i></b><b class="del-this" title="删除该组"><i class="fa  fa-minus-circle"></i></b>';
	if(groupnum>1){
		
		if(groupnum==2){
			$(this).parents(".group-box").remove();
			$("#tab3 .group-box .big").eq(0).html($('<b class="plus-group" title="添加分组"><i class="fa fa-plus-circle"></i></b>'));
		}else{
			if(ithis==(groupnum-1)){
				
				$(this).parents(".group-box").prev(".group-box").find(".big").html(btnStr);
			}
			$(this).parents(".group-box").remove();
		}
	}
	nth();
});
//加序号加颜色
$("#tab3 .group-name").live("keyup",function(){
	$(this).addClass("edited");
})
function nth(){
	$.each($(".big-group"),function(i,data){
		var zm=String.fromCharCode(65 + i);
		if(!$(data).find(".group-name").hasClass("edited"))
		{
		   $(data).find(".group-name").val(zm+'组');
		};
		$.each($(data).parents(".group-box").find(".small-group"),function(j,dd){
			if(!$(dd).find(".group-name").hasClass("edited"))
			{
			   $(dd).find(".group-name").val(zm+(j+1)+'组');
			};
		})
	})
}
   nth();
   var bigarr=new Array();
   //确定按钮后拼接公式，与es交互显示数据
   $("#tab3 .resure-group button").live("click",function(){
	   

	 var tab3item='';
	 bigarr=[];
	 var arr=new Array();
	 var blankTag=true;
	   $("#tab3 .group-box").each(function(i,group){
		   
		   $($(group).children(".row")).each(function(n,row){
				
		      $groupname=$(row).find(".group-name");
			   $search=$(row).find("input[name='search']");
			   $relationship=$(row).find("select[name='relationship']");
			   $valu=$(row).find(".input3").find("*[name='lastdata']");
			   $unit=$(row).find(".units").children("option:checked").html();
			  
			   	 var item='';
				var s4='';
				var s0='';
				if($.trim($groupname.val()).length>0){
					s0=$.trim($groupname.val());
				}else{
					$groupname.pulsate({
		                color: "#ed5565",
		                repeat: false,
		                speed: 300
		                
		            });
					blankTag=false;
					return false;
				}
				if(typeof($unit)!='undefined'&&$unit!='undefined'){
					s4=$unit;
				}
				if($.trim($search.parent().attr("data")).length){
					
					var s1=$search.parent().attr("data");
					if($.trim($relationship.val()).length){
						var s2=$relationship.children("option:checked").html();
					   if($search.parent().attr("data-type")=="3"){
						   s3='';
					   }else if($relationship.val()=="介于"){
						   if($.trim($valu.eq(0).val()).length>0&&$.trim($valu.eq(1).val()).length>0){
							   s3=$.trim($valu.eq(0).val())+'","'+$.trim($valu.eq(1).val());
							  
						   }else{
							   
							   $valu.pulsate({
					                color: "#ed5565",
					                repeat: false,
					                speed: 300
					                
					            });
							   //alert("介于时第三个框有空");
							   blankTag=false;
							   return false;
						   }
					   }else{
						   if($.trim($valu.val()).length>0){
							   if($search.parent().attr("data-type")=="4"){
								   s3=$valu.children("option:checked").html();
							   }else if($search.parent().attr("data-type")=="5"){
								  
								   if($valu.parent().attr("data-fieldid"))
								   s3=$valu.val();
								   else{
									   bootbox.setDefaults("locale","zh_CN");
							    		bootbox.alert("抱歉，该版本暂不支持手动输入");
									   $valu.val('');
									   blankTag=false;
									   return false;
								   }
							   }else{
								   s3=$valu.val();
							   }
						   }else{
							   $valu.pulsate({
					                color: "#ed5565",
					                repeat: false,
					                speed: 300
					                
					            });
							   //alert("第三个框为空");
							   blankTag=false;
							   return false;
						   }
					   }
					}
				}else{
					if($(row).hasClass("other")){
						s0=$.trim($groupname.text());
						s1='';s2='';s3='';s4='';
						
					}else{
					$search.pulsate({
			                color: "#ed5565",
			                repeat: false,
			                speed: 200
			                
			            });
					blankTag=false;
					 return false;
					}
				}
				tab3item={"gname":s0,"field":s1,"exp":s2,"values":s3,"unit":s4};
				arr.push(tab3item);
				

				
		   });
		   if(blankTag)
		   bigarr.push(arr);	   
		   arr=[];//数组滞空
	   });//遍历group-box结束
	   var res=groupToAjax(0,10);

	});
   var message='';
   var groupcondition='';
   var configgroup='';
   function groupToAjax(page,size){
	   groupcondition='';
	   message='';
	   var page=parseInt($.trim(page));
	   var size=parseInt($.trim(size));
	   //根据数组对象拼字符
	   var not_big='';
	   var not_bigG=new Array();
	   var not_small='';
	   var not_smallG=new Array();
	   var not_bigC='';
	   var not_bigGC=new Array();
	   var not_smallC='';
	   var not_smallGC=new Array();
	   
	 
     if(bigarr.length>0){
    	 
    	 $.each(bigarr, function(i,val){
    		
    	 if(i<bigarr.length-1){
    		 
    		 $.each(val,function(ii,json){
    			 var sfield=json.field.substring(json.field.lastIndexOf("_")+1,json.field.length);
    			 if(ii==0){
    				 //大组正常
    				 message+='<_n'+json.gname+'n_[{"field":"'+json.field+'","exp":"'+json.exp+'","values":["'+json.values+'"],"flag":"||","unit":"'+json.unit+'"}]>' ;
    				 
    				 not_big='[{"field":"'+json.field+'","exp":"'+OppositeFun(json.exp)+'","values":["'+json.values+'"],"flag":"||","unit":"'+json.unit+'"}]';
    				 not_bigG.push(not_big);
    				  //拼语句
    				 not_bigC=sfield+OppositeFun(json.exp)+json.values+json.unit;
    				 not_bigGC.push(not_bigC);
    				 groupcondition+='<br/><span class="block-info bigg"><b>'+json.gname+'</b>:'+sfield+json.exp+json.values+json.unit+'</span>';
    			 }else{
    				 
    				 if(ii==val.length-1){
    					 //最后的小非组
        				 message+='<_n'+json.gname+'n_[{"field":"'+val[0].field+'","exp":"'+val[0].exp+'","values":["'+val[0].values+'"],"flag":"||","unit":"'+val[0].unit+'"}]';
        				 groupcondition+='<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="block-info"><b>'+json.gname+'</b>:'+val[0].field.substring(val[0].field.lastIndexOf("_")+1,val[0].field.length)+val[0].exp+val[0].values+val[0].unit;
        				 $.each(not_smallG,function(iii,strr){
        					message+=','+strr;
        				 })
        				 $.each(not_smallGC,function(iii,strr){
        					 groupcondition+='&nbsp;且&nbsp;'+strr;
        				 })
        				 not_smallG=[];
        				 not_smallGC=[];
        				 message+='>'; 
        				 groupcondition+='</span>';
        			 }else{
        				 message+='<_n'+json.gname+'n_[{"field":"'+val[0].field+'","exp":"'+val[0].exp+'","values":["'+val[0].values+'"],"flag":"||","unit":"'+val[0].unit+'"}],[{"field":"'+json.field+'","exp":"'+json.exp+'","values":["'+json.values+'"],"flag":"||","unit":"'+json.unit+'"}]>' ; 
        				 not_small='[{"field":"'+json.field+'","exp":"'+OppositeFun(json.exp)+'","values":["'+json.values+'"],"flag":"||","unit":"'+json.unit+'"}]';
        				 groupcondition+='<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="block-info"><b>'+json.gname+'</b>:'+val[0].field.substring(val[0].field.lastIndexOf("_")+1,val[0].field.length)+val[0].exp+val[0].values+val[0].unit+'&nbsp;且&nbsp;'+sfield+json.exp+json.values+json.unit+'</span>';
        				 not_smallC+=sfield+OppositeFun(json.exp)+json.values+json.unit;
        				 not_smallG.push(not_small);
        				 not_smallGC.push(not_smallC);
        			 }
    				 
    			 }
    		 });
    		 
    		 message+='##';
    		 groupcondition+='##';	
    	 }else{
    			//最后一个大组其他
    			 $.each(val,function(ii,json){
    				 var sfield=json.field.substring(json.field.lastIndexOf("_")+1,json.field.length);
    				var msg='<_n'+json.gname+'n_';
    				if(ii==0) groupcondition+='<br/><span class="block-info bigg"><b>'+json.gname+'</b>:';
    				else groupcondition+='<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="block-info"><b>'+json.gname+'</b>:';
    				 $.each(not_bigG,function(iii,strr){
    					if(iii){
    						msg+=','+strr;
    					}else{
    						msg+=strr;
    					}
    					 
    				 });
    				 $.each(not_bigGC,function(iii,strr){
     					if(iii){
     						groupcondition+='&nbsp;且&nbsp;'+strr;
     					}else{
     						groupcondition+=strr;
     					}
     					 
     				 })
    				 message+=msg;
        			 if(ii==0){
        				 groupcondition+='</span>';
        				 message+='>'; 
        				 
        			 }else{
        				 if(ii==val.length-1){
        					 //大非组的最后的小非组
            				 $.each(not_smallG,function(iii,strr){
            					message+=','+strr;
            				 })
            				 
            				 not_smallG=[];
            				 message+='>'; 
            				 $.each(not_smallGC,function(iii,strr){
            					 groupcondition+='&nbsp;且&nbsp;'+strr;
             				 })
             				 
             				 not_smallGC=[];
            				 groupcondition+='</span>';
            			 }else{
            				 message+=',[{"field":"'+json.field+'","exp":"'+json.exp+'","values":["'+json.values+'"],"flag":"||","unit":"'+json.unit+'"}]>' ; 
            				 groupcondition+='&nbsp;且&nbsp;'+sfield+json.exp+json.values+json.unit+'</span>';
            				 not_small='[{"field":"'+json.field+'","exp":"'+OppositeFun(json.exp)+'","values":["'+json.values+'"],"flag":"||","unit":"'+json.unit+'"}]';
            				 not_smallC=sfield+OppositeFun(json.exp)+json.values+json.unit;
            				 not_smallG.push(not_small);
            				 not_smallGC.push(not_smallC);
            			 }
        				 
        			 }
        		 });
    			 
    		 }
    		 
    	 });
    	 
    	 $(".no-action").children("img").eq(0).addClass("hidden").next().removeClass("hidden");
    	 $("#shadediv").removeClass("hidden");
    	 groupcondition=groupcondition.replace(/##/g,'').replace(/","/g,'至');
    	 //message='<_nA组n_[{"field":"病历_基本信息_性别","exp":"等于","values":["女"],"flag":"||","unit":""}]>';
	 $.ajax({
	   url: 'getbygroup',     
	   contentType: 'application/json', 
      type: 'POST',             
      data:JSON.stringify({"query":message,"studyid":$("#studyid").val(),"size":size,"page":page}),//向服务器端发送的数据 $("#studyid").val()
      dataType: "json",
      success:function(data){  	  
    	 
    	  if(data){ 		  
    	  if($(data).length){  	
    		  var tabname='';
    		  var ulstr='';
    		  var bignum=0;
    		  $("#tab3 .result-tab-content").html('');
      	$.each(data,function(i,groupall){
      			$.each(groupall,function(ii,group){
      				var smallname='';var tabcont='';
      				
      					
      				for(var name in group){
      					var gname=name.length>4?name.substring(0,4)+'...':name;
      					if(typeof(group[name])=="undefined"){
      						 bootbox.setDefaults("locale","zh_CN");
      		    	  		bootbox.alert("无查询结果");
      						return false;}
      			    if(ii==0){
      			    	var $total = typeof(group[name][0].total) == "undefined"?0:group[name][0].total;
		      	    	var tabnamestr='<li><a title="'+name+'">'+gname+'（<span>'+$total+'</span>例）</a></li>';
		      	    	
		      	    	bignum++;
		      	    	
      			    	if(bignum>4){
      			    		
      			    		if(bignum==5){
      			    			ulstr='<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown">更多分组<i class="fa fa-angle-down"></i></a><ul class="dropdown-menu" role="menu">'
      			    				ulstr+=tabnamestr;
      			    		}else if(ii==groupall.length){
      			    			ulstr=ulstr+tabnamestr+'</ul></li>';
      			    		}else{
      			    			ulstr+=tabnamestr;
      			    		}
      			    	}else{
      			    		tabname+=tabnamestr;
      			    	}
						
		      	    	if($total>0&&group[name][0].hits.length>0){
					      	 tabcont='<div class="tab-pane"><div class="row no-padding no-margin"><div class="result-info"><div class="set-eg"><span>设置样本量</span><input type="number" name="set-eg-input" class="set-eg-input"/>例</div></div><div class="table-scrollable"><table class="table table-striped table-hover table-noborder text-center bigG"><thead><tr><th>序号</th><th>性别</th><th>年龄</th><th class="text-left">诊断</th><th>就诊次数</th><th>操作</th></tr></thead><tbody>';						 	
					      	 $.each(group[name][0].hits,function(n,info){
					      		 if(info.disease){
					      		 var disease=info.disease.length>=40?info.disease.substring(0,40)+"...":info.disease;
					      		 }else{
					      			var disease='';
					      		 }
					      		 tabcont+='<tr><td>'+(n+1)+'</td><td>'+info.gender+'</td><td>'+info.age+'</td><td  title="'+info.disease+'" class="text-left"><span>'+disease+'</span></td><td>'+info.visitNum+'</td><td><i class="fa fa-trash-o"></i></td></tr>';
					      	 });
					      	 tabcont+='</tbody><tfoot><tr><td colspan="6"><div class="page pageToolbar'+i+'_'+ii+'"></div></td></tr></tfoot></table></div></div></div>'
	      	    	
	      	    	   }else{
	      	    		 tabcont='<div class="tab-pane"><div class="row no-padding no-margin"><div class="result-info"><div class="set-eg"></div></div><div class="table-scrollable"><table class="table table-striped table-hover table-noborder text-center bigG"><tr><th>序号</th><th>性别</th><th>年龄</th><th class="text-left">诊断</th><th>就诊次数</th><th>操作</th></tr>';						 	
	      	    		tabcont+='<tr><td colspan="6">没有数据</td></tr></table></div></div></div>';
	      	    	   }
      	    	
		      			$("#tab3 .result-tab-content").append($(tabcont));
		      			$("#tab3 .result-tab-content .tab-pane:last-child").find('.pageToolbar'+i+'_'+ii).html('');
		      			
		      			var q='<_n'+name+'n_[';
		      			$.each(group[name][1].expressions,function(i,exp){
		      				if(i==1){
		      					q+=JSON.stringify(exp[0]);
		      				}else if(i>1){
		      					q+=','+JSON.stringify(exp[0]);
		      				}
		      			});
		      			
		      			q+=']>';
		      			
		      			$("#tab3 .result-tab-content .tab-pane:last-child").find('.pageToolbar'+i+'_'+ii).attr({"data-query":q,"data-name":name})
		      			$("#tab3 .result-tab-content .tab-pane:last-child").find('.pageToolbar'+i+'_'+ii).Paging({
		      				pagesize:10,
		      				count:group[name][0].total,
		      				toolbar:true,
		      				callback:function(page,size,count){
		      				var qq=$($(this)[0].target.context).attr("data-query");
		      				var obj=$($(this)[0].target.context).closest("tfoot").prev("tbody");
		      				
		      					$.ajax({
		      					   url: 'getbygroup',     
		      					   contentType: 'application/json', 
		      				      type: 'POST',             
		      				      data:JSON.stringify({"query":qq,"studyid":$("#studyid").val(),"size":size,"page":(page-1)}),//向服务器端发送的数据 $("#studyid").val()
		      				      dataType: "json",
		      				      success:function(data){
		      				    	  var str='';
		      				    	  for(var key in data){
		      				    		 for(var name in data[key][0]){
		      				    			$.each(data[key][0][name][0].hits,function(n,info){
		      				    				if(info.disease){
		      							      		 var disease=info.disease.length>=40?info.disease.substring(0,40)+"...":info.disease;
	      							      		 }else{
	      							      			var disease='';
	      							      		 }
		      				    				str+='<tr><td>'+(size*(page-1)+n+1)+'</td><td>'+info.gender+'</td><td>'+info.age+'</td><td title="'+info.disease+'"><span>'+disease+'</span></td><td>'+info.visitNum+'</td><td><i class="fa fa-trash-o"></i></td></tr>';
		      				    			});
		      				    		 }
		      				    	  }
		      				    	  obj.html(str);
		      				      }
		      					})
		      				}
		      			});
		      			tabcont='';
      			 }//大组结束
      			    else{
      			    	$("#tab3 .result-tab-content .tab-pane:last-child").find(".bigG").remove();
      			    	smallname+='<a class="get-group-name" title="'+name+'">'+gname+':';
    	      	    	var $total = typeof(group[name][0].total) == "undefined"?0:group[name][0].total;
    	      	    	smallname+=$total+'例</a>';
    	      	    	if($total>0){
      	      	    		tabcont+='<table class="table table-striped table-hover table-noborder text-center hidden"><thead><tr><th>序号</th><th>性别</th><th>年龄</th><th>诊断</th><th>就诊次数</th><th>操作</th></tr></thead><tbody>';
      	      	    		$.each(group[name][0].hits,function(n,info){
      	      	    		     var disease=info.disease;
      	      	    			if(info.disease==null){
      	      	    			disease='';
      	      	    			}
	      	      	      		var disease0=disease.length>=40?disease.substring(0,40)+"...":disease;
	      	      	      		tabcont+='<tr><td>'+(n+1)+'</td><td>'+info.gender+'</td><td>'+info.age+'</td><td title="'+disease+'"><span>'+disease0+'</span></td><td>'+info.visitNum+'</td><td><i class="fa fa-trash-o"></i></td></tr>';
      	      	      	    });
      	      	    		tabcont+='</tbody><tfoot><tr><td colspan="6"><div class="page pageToolbar'+i+'_'+ii+'"></div></td></tr></tfoot></table>';
      	      	    	
      	      	        }else{
      	      	        tabcont='<table class="table table-striped table-hover table-noborder text-center hidden"><tr><th>序号</th><th>性别</th><th>年龄</th><th>诊断</th><th>就诊次数</th><th>操作</th></tr>';
  	      	    		
  	      	    		tabcont+='<tr><td colspan="6">没有数据</td></tr></table>';
      	      	    	
      	      	    	}
    	      	    	$("#tab3 .result-tab-content .table-scrollable").append($(tabcont));
    	      	      	$("#tab3 .result-tab-content .tab-pane:last-child").find('.pageToolbar'+i+'_'+ii).html('');
    	      	      
    	      	      	
    	      	      var q='<_n'+name+'n_[';
		      			$.each(group[name][1].expressions,function(i,exp){
		      				if(i==1){
		      					q+=JSON.stringify(exp[0]);
		      				}else if(i>1){
		      					q+=','+JSON.stringify(exp[0]);
		      				}
		      			});
		      			
		      			q+=']>';
		      			
		      			$("#tab3 .result-tab-content .tab-pane:last-child").find('.pageToolbar'+i+'_'+ii).attr("data-query",q)
		      			$("#tab3 .result-tab-content .tab-pane:last-child").find('.pageToolbar'+i+'_'+ii).Paging({
		      				pagesize:10,
		      				count:group[name][0].total,
		      				toolbar:true,
		      				callback:function(page,size,count){
		      				var qq=$($(this)[0].target.context).attr("data-query");
		      				var obj=$($(this)[0].target.context).closest("tfoot").prev("tbody");
		      				
		      					$.ajax({
		      					   url: 'getbygroup',     
		      					   contentType: 'application/json', 
		      				      type: 'POST',             
		      				      data:JSON.stringify({"query":qq,"studyid":$("#studyid").val(),"size":size,"page":(page-1)}),//向服务器端发送的数据 $("#studyid").val()
		      				      dataType: "json",
		      				      success:function(data){
		      				    	  var str='';
		      				    	  for(var key in data){
		      				    		 for(var name in data[key][0]){
		      				    			$.each(data[key][0][name][0].hits,function(n,info){
		      				    				if(info.disease){
		      							      		 var disease=info.disease.length>=40?info.disease.substring(0,40)+"...":info.disease;
	      							      		 }else{
	      							      			var disease='';
	      							      		 }
		      				    				str+='<tr><td>'+(size*(page-1)+n+1)+'</td><td>'+info.gender+'</td><td>'+info.age+'</td><td  title="'+info.disease+'"><span>'+disease+'</span></td><td>'+info.visitNum+'</td><td><i class="fa fa-trash-o"></i></td></tr>';
		      				    			});
		      				    		 }
		      				    	  }
		      				    	  obj.html(str);
		      				      }
		      					})
		      				}
		      			});
    	      	      	$("#tab3 .result-tab-content .tab-pane:last-child").find(".result-info div.set-eg").before($(smallname));
      			    }
      	      }//遍历组结束
      			
      	    })
      	});
      	      $("#group_ul").html(tabname+ulstr);
      	      $("#group_ul li").eq(0).addClass("active");
      	    $("#tab3 .result-tab-content .tab-pane:first-child").addClass("active");
      	    $("#tab3 .result-tab-content .result-info .get-group-name:first-child").addClass("active");
      	 $("#tab3 .result-tab-content table:first-child").removeClass("hidden");
      	 		$("#sum").html($(".eg-num").html());
    		  $(".result-tab").removeClass("hidden").prev(".no-action").addClass("hidden").children("img").eq(0).removeClass("hidden").next().addClass("hidden");
    		  $("#shadediv").addClass("hidden");
    	  }else{
    		  $("#shadediv").addClass("hidden");
    		  bootbox.setDefaults("locale","zh_CN");
    	  		bootbox.alert("返回0条数据");
    	  }
    	  }else{
    		 
    	  		bootbox.alert("null!");
    	  }
    	  
      },
      error:function(data){
      	bootbox.setDefaults("locale","zh_CN");
  		bootbox.alert("获取返回数据失败!错误："+data.statusText+":"+data.status);
      }
     
});
     }
     groupcondition=groupcondition.substring(5);
     
   }
   //输出互斥关系
   function  OppositeFun(relative){
	   switch($.trim(relative)){
	   case "等于":return "不等于";break;
	   case "不等于":return "等于";break;
	   case "包含":return "不包含";break;
	   case "不包含":return "包含";break;
	   case "介于":return "不介于";break;
	   case "大于等于":return "小于";break;
	   case "大于":return "小于等于";break;
	   case "小于等于":return "大于";break;
	   case "小于":return "大于等于";break;
	   case "介于":return "不介于";break;
	   case "有":return "无";break;
	   case "无":return "有";break;
	   case "是":return "否";break;
	   case "否":return "是";break;
	   default:break;
	   }
   }
   //亚组切换
  
   $(".result-info .get-group-name").live("click",function(){
	   
	   $(this).addClass("active").siblings().removeClass("active");
	  $(this).parent(".result-info").next().children("table").eq($(this).index()).removeClass("hidden").siblings().removeClass("active").addClass("hidden");
   })
   //大组切换
   $(".page ul li").live("click",function(event){
	   $(event.target).parents(".tab-pane").removeClass("hidden");
   })
   $(".result-tab #group_ul li").live("click",function(event){
	   event.stopPropagation();
	   $(".result-tab #group_ul>li.dropdown").removeClass("open");
	   if($(this).hasClass("dropdown")){
		   return false;
	   }
	   $(this).addClass("active").siblings().removeClass("active");
	   $("#tab3 .tab-pane").eq($(this).index()).addClass("active").removeClass("hidden").siblings().removeClass("active");
   });
   $(".result-tab #group_ul>li.dropdown ul li").live("click",function(){
	 
	   $(".result-tab #group_ul li").removeClass("active");
	   
	   $(this).closest("li").addClass("active").siblings().removeClass("active");
	   $("#tab3 .tab-pane").eq($(this).index()+4).addClass("active").removeClass("hidden").siblings().removeClass("active");
	   $(".result-tab #group_ul>li.dropdown").removeClass("open");
   });
//******************tab3 end*********************** 
//******************tab4***************************
//$("#control").click();
function step4Start(check){
	if($(".method-ul li").length<2){
	
	$.ajax({
		url: " getcounthandle",
		contentType: 'application/json',
		type: 'GET',
		dataType: "json", //服务器返回数据的类型为json  
		success: function(json) {
			
			var $str1='';var $str2='';var $str3='';
			if(json.length){
				$.each(json,function(i,d){
			$str1+='<div class="method-modal-body"><h4 class="method-modal-title">'+d.modelname+'</h4>';
					$.each(d.two,function(ii,dd){
						if(dd.three.length){
									$str2+='<div class=" method-group"><b>'+dd.modelname+'</b><div class="input-group"><div class="icheck-inline">';
								$.each(dd.three,function(iii,ddd){
									$str2+='<label><input type="checkbox" class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="'+ddd.modelid+'" data-remark="'+ddd.remark+'">'+ddd.modelname+'</label>';
								});
								$str2+='</div></div></div>';
								
						}else{
							$str3+='<label><input type="checkbox"  class="icheck" data-checkbox="icheckbox_minimal-blue" data-id="'+dd.modelid+'" data-remark="'+dd.remark+'">'+dd.modelname+'</label>';
							if(ii==(d.two.length-1)){
								$str2+='<div class=" method-group group-two"><div class="input-group"><div class="icheck-inline">'+$str3+'</div></div></div>';
								$str3='';
							}
						}						
							
							
						
					})
						
					$str1+=$str2+'</div>'
					$str2='';			
					
					
				
			});
			
			}else{
			$str1='还没有统计方法可选';
			}
			$(".method-modal").html('<form role="form">'+$str1+'</form>');
			$.each($(".method-modal-body"),function(i,data){
				if($(data).children(".method-group").length>1){
					$(data).css("width","100%");
				}
			})
			$(".method-modal .icheck").iCheck({ 
				  labelHover : false, 
				  cursor : true, 
				  checkboxClass : 'icheckbox_minimal-blue', 
				  radioClass : 'iradio_minimal-blue', 
				  
				});
			$(".method-modal .icheck").iCheck('disable');
			$(".method-modal .icheck").closest("label").css("color","rgb(208,208,208)");
			if(check){
				$(".method-modal .icheck").iCheck('enable');
				$(".method-modal .icheck").closest("label").css("color","#676a6c");
			}
			else{
				$(".method-modal input[data-remark='1']").iCheck('enable');
				$(".method-modal input[data-remark='1']").closest("label").css({"color":"#676a6c","text-decoration":"none"});
			}
			$("#control").click();	
		}
	
	})	
}
}
var panelClone=$(".num_panel").html();
var panelClone2=$(".time_panel").html();
//时间量化绑定数据

//时间量化绑定数据 结束
var panelClone4=$(".varpanel4").html();
var mainClone=$(".main").html();
$(".add_method-btn").click(function(){
	
	if($(this).parents(".choose-var").find("input:checked").attr("data-id")){
		
	$.each($(this).parents(".choose-var").find("input:checked"),function(i,d){
//		if(i==0){
//			$('.method-ul').append($('<li class="active"><a href="#tab_'+$(d).attr("data-id")+'" data-toggle="tab">'+$(d).parents("label").text()+' <i class="fa fa-close"></i></a></li>'));
//			$("#tab_"+$(d).attr("data-id")).addClass("active");
//		}else{
		$('.method-ul .choose-var').before($('<li title="'+$(d).parents("label").text()+'"><a href="#tab_'+$(d).attr("data-id")+'" data-toggle="tab">'+$(d).parents("label").text()+' <i class="fa fa-close"></i></a></li>'));
	});
	var ahref=$('.method-ul').children("li").eq(0).addClass("active").children("a").attr("href");
	
	$(ahref).addClass("active").addClass("in");
	 
	$("#tab4 .main").removeClass("hidden");
}else{
	$(this).stop().next().animate({"opacity":1},"500").delay(2000).animate({"opacity":0},"500")
	return false;
}
	
	/*$('.method-modal-body .checked').removeClass("checked");*/
});
$(".choose-var .return-btn,.choose-var .close").live("click",function(){
	$('#form_wizard_1').bootstrapWizard('show',2);	
})
$('.method-ul li').live("click",function(e){
	$(".u_panel").not('.varpanel4').addClass("hidden");
	if($(e.target).hasClass("fa-close")){
		$($(this).removeClass("active").children("a").attr("href")).removeClass("active");
		clearCont($($(this).removeClass("active").children("a").attr("href")));
		$(this).remove();
		
		var ahref=$('.method-ul').children("li").eq(0).addClass("active").children("a").attr("href");
		$(ahref).addClass("active").addClass("in");
		
		
		
	
	
	}
});


//鼠标移入变量
$("#tab4 .block-var").live("mouseenter",function(){
	var type=$(this).attr("data_type");	
    var _this=$(this);
	if(!$(this).hasClass("once")){
		switch(type) {
		case "0":
			$(this).addClass("once").append($('<span class="edit-block hidden"><i class="btn_num" title="量化"></i><i class="btn_del" title="删除"></i></span>'));
			break;
		case "1":
			$(this).addClass("once").append($('<span class="edit-block hidden"><i class="btn_edit" title="编辑"></i><i class="btn_del" title="删除"></i></span>'));
			break;
		case "2":
			$(this).addClass("once").append($('<span class="edit-block hidden"><i class="btn_del" title="删除"></i></span>'));
			break;
		case "3":
			$(this).addClass("once").append($('<span class="edit-block hidden"><i class="btn_del" title="删除"></i></span>'));
			break;
		case "4":
			$(this).addClass("once").append($('<span class="edit-block hidden"><i class="btn_edit" title="编辑"></i><i class="btn_del" title="删除"></i></span>'));
			break;
		case "5":
			$(this).addClass("once").append($('<span class="edit-block hidden"><i class="btn_edit" title="编辑"></i><i class="btn_del" title="删除"></i></span>'));
			break;

};
    if(_this.attr("data_hastime")=="Y"){
    	_this.children(".edit-block").prepend('<i class="btn_time" title="时间变量"></i>');
    }
	}

     
	
    $(this).children(".edit-block").removeClass("hidden");
	$(this).find("i.btn_del").stop().live("click",function(){
		$(this).addClass("open").siblings().removeClass("open");
		_this.remove();
	});
	
	$(this).find("i.btn_time").stop().live("click",function(e){
		stop(e);
		$(this).addClass("open").siblings().removeClass("open");
		$(".u_panel").addClass("hidden");
		$(".time_panel").html(panelClone2);
		ComponentsPickers.init();
		$.ajax({
			url: "gettriggerevent",
			contentType: 'application/json',
			type: 'GET',
			dataType: "json", //服务器返回数据的类型为json  
			success: function(json) {
				if(JSON.stringify(json)){
					$(".time_panel .group-relativeTime").find("select").eq(0).html('');
				
		         $.each(json,function(i,data){
		        	 if(i === 0){
		        		 $(".time_panel .group-relativeTime").find("select").eq(0).append($('<option value="f" disabled="disabled" selected="selected">请选择</option><option value="'+data.fieldtableid+'">'+data.trigername+'</option>'));  
		        	 }else
		        	$(".time_panel .group-relativeTime").find("select").eq(0).append($('<option value="'+data.fieldtableid+'">'+data.trigername+'</option>')); 
		         })
		         }
					
			},
			error:function(data){
				bootbox.setDefaults("locale","zh_CN");
				bootbox.alert("获取数据失败!错误："+data.statusText+":"+data.status);
			}
		});
		$(".icheck,.jcheck").iCheck({ 
			  labelHover : false, 
			  cursor : true, 
			  checkboxClass : 'icheckbox_minimal-grey', 
			  radioClass : 'iradio_minimal-grey', 
			
			});
		var setleft0=($(e.target).position().left-110>232)?232:$(e.target).position().left-110;
		$(".time_panel").css({"left":setleft0-100,"top":$(e.target).position().top+190,"opacity":"0"}).removeClass("hidden");
		$(".time_panel").stop().animate({"left":setleft0,"opacity":"1"},500);
		$("#blankdiv").removeClass("hidden");
	});
	//改变第一个的值
	var timeData;
	$(".time_panel .group-relativeTime").find("select:first-child").stop().live("change",function(e){
		console.log(e.target);
		if($(this).val()!="f"){
		timeData='';
		$(".mypanel").addClass("hidden");
		var xhr=1;
		if(xhr==1){
		xhr=$.ajax({
			url:'getfielddictbyname',
			contentType: 'application/json',
			type: 'POST',
			dataType: "json", 
			data: JSON.stringify({"fieldtableid":$(this).val(),"fieldname":''}),
			success: function(json){
				xhr=1;
				if(json.length!=0){
					$(e.target).next("select").removeClass("hidden").next("input").removeClass("hidden").val('');
				    $.each(json,function(i,data){
				    	
				    	timeData+='<li><span class="block-info" data-id="'+data.fieldtableid+'" data-name="'+data.fieldname+'" data-version="'+data.fieldversion+'" data-code="'+data.fpycode+'">'+data.fieldname+'</span></li>'
				    	
				    });
				    $(".mypanel").html('<ul>'+timeData+'</ul>');
				    
				  
				}else{
					
					$(e.target).next("select").addClass("hidden").next("input").addClass("hidden");
				}
			},
			error:function(data){
				
					bootbox.setDefaults("locale","zh_CN");
					bootbox.alert("获取数据失败!错误："+data.statusText+":"+data.status);
				
			}
		});
		}
	}
	});
	//改变第二个关系为当天时后面隐藏
	$(".time_panel .timing").live("change",function(e){
		console.log($(e.target).val());
		if($(e.target).val()=="today"){
			$(e.target).next().addClass("hidden").next().addClass("hidden").next().addClass("hidden");
		}else{
			$(e.target).next().removeClass("hidden").next().removeClass("hidden").next().removeClass("hidden");
		}
	})
	$(".time_panel .group-relativeTime").find(".timedata").live("focus",function(e){
		
		panelSetting($(".mypanel"),$(e.target),true,0,0);
		$(".mypanel").removeClass("hidden");
		$(".mypanel li").click(function() {
			var str = "";
			$(e.target).val($(this).find(".block-info").html());
			$(e.target).attr({"data-name":$(this).find(".block-info").attr("data-name"),"data-id":$(this).find(".block-info").attr("data-id"),"data-version":$(this).find(".block-info").attr("data-version"),"data-code":$(this).find(".block-info").attr("data-code")});
			$(".mypanel").addClass("hidden");
			
			
		})
	});
	/*$(".time_panel .group-relativeTime").find(".timedata").live("blur",function(e){
		$(".mypanel").addClass("hidden");
	});*/
	$(".time_panel .group-relativeTime").find(".timedata").live("input",function(e){
		timeData='';
		var key3=$.trim($(e.target).val());
		var id=$(e.target).prev().prev().val();
		$(e.target).parent().removeAttr("data-fieldid");
		
		$.ajax({  
	     	   url: 'getfielddictbyname',     
	     	   contentType: 'application/json', 
	            type: 'POST',             
	            data:JSON.stringify({"fieldtableid":id,"fieldname":key3}),//向服务器端发送的数据 
	            dataType: "json",//服务器返回数据的类型为json  
	            success: function (data) {
	            	 if(data.length){
		            	   $.each(data,function(i,data){
		            		   timeData+='<li><span class="block-info" data-id="'+data.fieldtableid+'" data-name="'+data.fieldname+'" data-version="'+data.fieldversion+'" data-code="'+data.fpycode+'">'+data.fieldname+'</span></li>'
							 })
							 
							 
					}else{
						timeData+='<li><span>未找到搜索值</span></li>';
					}
	            	 $(".mypanel").html('<ul>'+timeData+'</ul>');
	            	   $(".mypanel").removeClass("hidden");
	            	   panelSetting($(".mypanel"),$(e.target),true,0,0);			 
		            	   
			            	 //通用变量添加变量后关闭条件器
	            	   $(".mypanel li").click(function() {
	           			var str = "";
	           			$(e.target).val($(this).find(".block-info").html());
	           			$(e.target).attr({"data-name":$(this).find(".block-info").attr("data-name"),"data-id":$(this).find(".block-info").attr("data-id"),"data-version":$(this).find(".block-info").attr("data-version"),"data-code":$(this).find(".block-info").attr("data-code")});
	           			$(".mypanel").addClass("hidden");
	           			
	           			
	           		})
			    				//通用变量添加变量后关闭条件器 end
	            },
				error:function(data){
					
						bootbox.setDefaults("locale","zh_CN");
						bootbox.alert("获取数据失败!错误："+data.statusText+":"+data.status);
					
				}
			});
		
	})
	$(this).find("i.btn_num").stop().live("click",function(e){
		stop(e);
		$(".u_panel").addClass("hidden");
		    $(".num_panel").html(panelClone);
			$(this).addClass("open").siblings().removeClass("open");
		var setleft=($(e.target).position().left-113>410)?410:$(e.target).position().left-113;
		$(".num_panel").css({"left":setleft-80,"top":$(e.target).position().top+190,"opacity":"0"}).removeClass("hidden");
		$(".num_panel").stop().animate({"left":setleft,"opacity":"1"},500);
	});
	$(this).find("i.btn_edit").stop().live("click",function(e){
		stop(e);
		var part=$(e.target).parents(".block-var");
		$(".u_panel").addClass("hidden");
			$(".varpanel4").html(panelClone4);
			$(this).addClass("open").siblings().removeClass("open");
		
		$(".varpanel4").find(".keyinput").val(part.children(".s1").html());
		$(".varpanel4").find(".keyinput").parent().attr({"data":part.children(".s1").attr("data"),"data-type":part.attr("data_type"),"data-hastime":part.attr("data_hastime"),"data-id":part.attr("data-id")});
		formchange(part.attr("data_type"),part.attr("data-id"),$(".varpanel4").find(".keyinput"));
		
		$(".varpanel4").css({"left":$(e.target).position().left-80,"top":$(e.target).position().top+195}).removeClass("hidden");
		part.addClass("remove");
	})
});
$("#tab4 .block-var").live("mouseleave",function(){
	if($(".num_panel").hasClass("hidden")&&$(".time_panel").hasClass("hidden")&&$(".varpanel4").hasClass("hidden")){
		$("#tab4 .block-var i").removeClass("open");
		$(this).children(".edit-block").addClass("hidden");
		
	}
	return false;
});

//时间变量面板

$(".typetime-choose input").live('ifChecked',function(){
	
	$(this).parents(".time_panel").find(".group-relativeTime").toggleClass("hidden");
	$(this).parents(".time_panel").find(".group-absoluteTime").toggleClass("hidden");
})
$("#tab4 .time_panel").on("click",".btn",function(){
	$("#tab4 .block-var i").removeClass("open");
	$(this).parents(".time_panel").addClass("hidden");
	$("#blankdiv").addClass("hidden");
	
});
$("#blankdiv").click(function(){
	$("#tab4 .time_panel").pulsate({
        color: "#3598dc",
       reach:1,
        repeat: false,
        speed: 100,
        glow: false
    });
})
$("#tab4 .num_panel").on("click",".btn",function(){
	$("#tab4 .block-var i").removeClass("open");
	$(this).parents(".num_panel").addClass("hidden");
});
var contrainer;
function checkAdd(obj){
	$search=$(obj).parents(".varpanel4").find("input[name='search']");
	$relationship=$(obj).parents(".varpanel4").find("select[name='relationship']");
	$valu=$(obj).parents(".varpanel4").find(".input3").find("*[name='lastdata']");
	var item='';
	$type=parseInt($search.parent().attr("data-type"));
	
if($.trim($search.val())&&($type==1||$type==5)){
	if($valu.hasClass("select-input")){
		$data3=$valu.children("option:checked").html();
		$data3_key=$valu.children("option:checked").attr("value");
		if(typeof($data3) == "undefined"){$data3='';}
		if($data3_key){
			item='<div class="block-var" data_hastime="'+$search.parent().attr("data-hastime")+'" data_type="'+$search.parent().attr("data-type")+'" data-id="'+$search.parent().attr("data-id")+'"><span class="s1" data="'+$search.parent().attr("data")+'">'+$search.val()+'</span><span class="s2" data="'+$relationship.val()+'">'+$relationship.children("option:checked").html()+'</span><span class="s3" data-fieldid="'+$data3_key+'">'+$data3+'</span></div>';
			
			contrainer.append($(item));
			contrainer.find(".remove.block-var").remove();
		}else{
			
				bootbox.setDefaults("locale","zh_CN");
				bootbox.alert("请输入值");
			
		}
	}else if($valu.hasClass("mulit-input")){
		$data3=$valu.val();
		$data3_key=$valu.parent().attr("data-fieldid");
		if(typeof($data3) == "undefined"){$data3='';}
		if($data3_key){
			item='<div class="block-var" data_hastime="'+$search.parent().attr("data-hastime")+'" data_type="'+$search.parent().attr("data-type")+'" data-id="'+$search.parent().attr("data-id")+'"><span class="s1" data="'+$search.parent().attr("data")+'">'+$search.val()+'</span><span class="s2" data="'+$relationship.val()+'">'+$relationship.children("option:checked").html()+'</span><span class="s3" data-fieldid="'+$data3_key+'">'+$data3+'</span></div>';
			contrainer.append($(item));
			contrainer.find(".remove.block-var").remove();
		}else{
			bootbox.setDefaults("locale","zh_CN");
			bootbox.alert("请输入值");
		}
		
	}else{
		if($valu.eq(1).val()){
			$data3=$valu.val()+"-"+$valu.eq(1).val();
		}else{
		    $data3=$valu.val();
		}
		$data3_key=$valu.parent().attr("data-fieldid");
		if(typeof($data3) == "undefined"){$data3='';}
		item='<div class="block-var" data_hastime="'+$search.parent().attr("data-hastime")+'" data_type="'+$search.parent().attr("data-type")+'" data-id="'+$search.parent().attr("data-id")+'"><span class="s1" data="'+$search.parent().attr("data")+'">'+$search.val()+'</span><span class="s2" data="'+$relationship.val()+'">'+$relationship.children("option:checked").html()+'</span><span class="s3" data-fieldid="'+$data3_key+'">'+$data3+'</span></div>';
		contrainer.append($(item));
		contrainer.find(".remove.block-var").remove();
	}
	
}else if($.trim($search.val())){
item='<div class="block-var" data_hastime="'+$search.parent().attr("data-hastime")+'" data_type="'+$search.parent().attr("data-type")+'" data-id="'+$search.parent().attr("data-id")+'"><span class="s1" data="'+$search.parent().attr("data")+'">'+$search.val()+'</span></div>';
contrainer.append($(item));
contrainer.find(".remove.block-var").remove();
}
	$search.val('');$relationship.val('');$valu.val('');
};


$("#tab4 .varpanel4").on("click","i",function(){
	
	$("#tab4 .block-var i").removeClass("open");
	if($(this).hasClass("fa-check")){
		checkAdd($(this));
			
	}else{
		$(this).parents(".varpanel4").addClass("hidden");
	}
	
});

$("#tab4 .varpanel4 .keyinput").live("keypress",function(e){
	 if (e.which == 13) {
		 $("#tab4 .varpanel4 i.fa-check").click();
	        return false;
	    }
})
//变量弹出

$(".pluss").click(function(e){
	stop(e);
	var _this=$(e.target);
	var _left=$(this).parents(".box").offset().left;
	var _top=$(this).parents(".box").offset().top;
	$(".u_panel").addClass("hidden");
	$(".varpanel4").css({"top":_top,"left": _left}).removeClass("hidden");
	$(".pluss").parents(".box").find(".vars_div").removeAttr("id");
	_this.parents(".box").find(".vars_div").attr("id","only");
	contrainer=_this.parents(".box").find("#only");
	
});
//值代码序号

//增加一条记录
$("#tab4 .num_panel").on("click",".plus-group",function(){
   if($(this).parents(".num_panel").find(".scroll2div").append($(this).parents(".form-group").clone())){
   	$(this).addClass("hidden");
   	$.each($(".num_panel input[name='numcode10']"),function(i,data){
	
	$(data).val(i);
})
   }
});
$(".time_panel").on("click",".plus-group",function(){
   if($(this).parents(".time_panel").find(".scrolldiv").append($(this).parent(".form-group").clone().find(".del-this").removeClass("hidden").end())){
   	$(this).next("b").removeClass("hidden").end().addClass("hidden");
   }
});
//删除一条记录
$("#tab4 .num_panel").on("click",".del-this",function(){
    if($(this).parents(".scroll2div").find(".form-group").length>1){
   	if($(this).parents(".form-group").index()==$(this).parents(".scroll2div").find(".form-group").length-1){
   		$(this).parents(".form-group").prev(".form-group").find(".plus-group").removeClass("hidden").end().end().remove();
   	}else{
   		$(this).parents(".form-group").remove();
   	}
   	
	$.each($(".num_panel input[name='numcode10']"),function(i,data){
   		
		$(data).val(i);
	})
   }
})
$("#tab4 .time_panel").on("click",".del-this",function(){
	
   if($(this).parents(".scrolldiv").find(".clone-group").length>1){
	   
   	if($(this).parent(".clone-group").index()==$(this).parents(".scrolldiv").find(".clone-group").length-1){
   		$(this).parent(".form-group").prev(".form-group").find(".plus-group").removeClass("hidden").end().end().remove();
   	}else{
   		$(this).parent(".form-group").remove();
   	}

   }
})
//混淆控制
$(".hxkz input").on('change',function(e){
	$(e.target).parents(".hxkz").nextAll(".hxbl-box").toggleClass("hidden");
});
//小数四舍五入
function decimal(num,v){
	var vv = Math.pow(10,v);
	return Math.round(num*vv)/vv;
	}
//分组选择

var checkgroupname=new Array();
$("#tab_000010 .chose-group-body>span").live("click",function(e){
	
	
	if($(e.target).siblings("span.active").length>1){
		
		bootbox.setDefaults("locale","zh_CN");
		bootbox.alert("抱歉，现只支持选择两组!");
	}else{
		$(this).toggleClass("active");
	}
	
});
$("#tab_000011 .chose-group-body>span").live("click",function(e){
	
	
	if($(e.target).siblings("span.active").length>1){
		
		bootbox.setDefaults("locale","zh_CN");
		bootbox.alert("抱歉，现只支持选择两组!");
	}else{
		$(this).toggleClass("active");
	}
	
});
function changeNum(modelid,vars,groups,groupnum){
	var obj=$("#"+modelid);
	console.log("所有组别");
	console.log(groups);console.log(groupnum);console.log(vars);
	var tr=''
	$.each(groups,function(i,group){
		tr+='<tr class="border-bottom"><td rowspan="'+vars.length+'" class="bcgk-grey">'+group+'</td><td>'+vars[0]+'</td><td class="pernum">有数据：'+groupnum[i]+'&nbsp;&nbsp;&nbsp;&nbsp;空：0</td><td class="pertd"><div class="progress progress-mini"><div class="progress-bar" style="width:100%;"></div></div>100%</td></tr>';
		$.each(vars,function(ii,variable){
			if(ii>0){
			tr+='<tr class="border-bottom"><td>'+variable+'</td><td class="pernum">有数据：'+groupnum[i]+'&nbsp;&nbsp;&nbsp;&nbsp;空：0</td><td class="pertd"><div class="progress progress-mini"><div class="progress-bar" style="width:100%;"></div></div>100%</td></tr>';
			}
		})
		
	});
	obj.find(".dataview table>tbody").html(tr);
	return true;
	/*$.ajax({
	url: "getdatapreview",
	contentType: 'application/json',
	type: 'POST',
	data: JSON.stringify({
		"groupids":'1489647030894,1489647031552',
		"ids":'[ids]',
		"query ":'"expressions":[[{"field":"症状_现病史_症状","exp":"包含","flag":"or","unit":"","values":["发热"]}]]',
		"resultField":'["症状_现病史_症状","病历_基本信息_性别"]',
		"studyid":$("input[name='studyId']").val()
	
	}), //向服务器端发送的数据 
	dataType: "json", //服务器返回数据的类型为json  
	success: function(json) {
		console.log("数据预览");
		
		
	},
	error:function(data){
		bootbox.setDefaults("locale","zh_CN");
		bootbox.alert("数据预览!错误："+data.statusText+":"+data.status);
	}
});*/
}
//结果展示
$(".result-btn-box button").click(function(e){
	var exp='';var strshow='';var vars=new Array();
	var ids=$(e.target).closest(".tab-pane").attr("id");
	$.each($(e.target).closest(".tab-pane").find(".vars_div .block-var"),function(i,block){
		var s1str=typeof($(block).children(".s1").html()) == "undefined"?'':$(block).children(".s1").html();
		var s1data=typeof($(block).children(".s1").attr("data")) == "undefined"?'':$(block).children(".s1").attr("data");
		var s2str=typeof($(block).children(".s2").html()) == "undefined"?'':$(block).children(".s2").html();
		var s2data=typeof($(block).children(".s2").attr("data")) == "undefined"?'':$(block).children(".s2").attr("data");
		var s3str=typeof($(block).children(".s3").html()) == "undefined"?'':$(block).children(".s3").html();
		var s3data=typeof($(block).children(".s3").attr("data-fieldid")) == "undefined"?'':$(block).children(".s3").attr("data");
		if(i){
			
		exp+="##{'field':'"+s1data+"','exp':'"+s2data+"','flag':'or','unit':'','values':['"+s3str+"']}"; 
		}else{
			
			exp+="{'field':'"+s1data+"','exp':'"+s2data+"','flag':'or','unit':'','values':['"+s3str+"']}";
		}
		if(s3str==''){
		strshow+="&lt;span class='block-info'&gt;"+s1str+"&lt;/span&gt;";
		vars.push(s1str);
		}else{
			strshow+="&lt;span class='block-info'&gt;"+s3str+"&lt;/span&gt;";
			vars.push(s3str);
			}
	});
	var zxqj=decimal(parseFloat($(this).parents(".tab-pane").find("input.zxqj").val())*0.01,4);
	console.log(ids);
		switch(ids){
		
		case "tab_000010":
			if($(this).text()=="生成结果"){
				if(!$(e.target).parents(".result-btn-box").siblings(".dataview").hasClass("hidden")){
					$(e.target).parents(".result-btn-box").siblings(".dataview").addClass("hidden");
					$(e.target).parents(".result-btn-box").siblings(".res-box").removeClass("hidden");
					
					return false;
				}
			//判断是否只选了两组
			if($("#g10>span.active").length!=2){
				bootbox.setDefaults("locale","zh_CN");
				bootbox.alert("请选择有数据的两组进行处理!");
				
			}else{
				
				var groupids=$("#g10>span.active").eq(0).attr("data-groupid")+','+$("#g10>span.active").eq(1).attr("data-groupid");
				var groupnames=$("#g10>span.active").eq(0).html()+'+'+$("#g10>span.active").eq(1).html();
				if(groupids==''||exp==''||strshow==''){
					bootbox.setDefaults("locale","zh_CN");
					bootbox.alert("请完善统计条件!");
					return false;
				}
				$(e.target).parents(".result-btn-box").siblings(".loading").removeClass("hidden");
				$("#shadediv").removeClass("hidden");
				var data=JSON.stringify({
					"modelname":'独立样本T检验',
					"variablenames":strshow,
					"confLevel":zxqj,
					"groupids":groupids,
					"query":exp,
					"studyid":$("input[name='studyId']").val()
				
				});
				var data_query=JSON.stringify({
					confLevel:zxqj,
					groupids:groupids,
					query:exp
				});
				$.ajax({
					url: "modelistest",
					contentType: 'application/json',
					type: 'POST',
					data: data, //向服务器端发送的数据 
					dataType: "json", //服务器返回数据的类型为json  
					success: function(json) {
						var str='';
						if(json!=null){
							
								
							
							str='<div class="tabpadding hasdata" data-query='+data_query+' data-varname="'+strshow+'" data-modelid="000010" data-modelname="独立样本T检验"><table class="table table-advance table-right-border text-center"><thead><tr class="closetr"><td colspan="6"><span class="group">'+groupnames+'</span><span class="close close-resbox">关闭</span></td></tr><tr><th colspan="4" class="text-left bcgk-gray">独立样本T检验</th><th colspan="2">差分的 '+zxqj+'%置信区间</th></tr><tr><th>变量</th><th>关系</th><th>t</th><th>Sig（双侧）</th><th>下限</th><th>上限</th></tr></thead><tbody>';
							$.each(json,function(i,data){
								
								if(data!=null&&data!=''&&typeof(data.isttId)!="undefined"){
									var varname=data.variableId==null?'-':data.variableId;
								var varEqualSig=decimal(parseFloat(data.varEqualSig),3);
								var varEqualSup=decimal(data.varEqualSup,3);
								var varEqualT=decimal(data.varEqualT,3);
								var varEqualInf=decimal(data.varEqualInf,3);
								var varUnequalSig=decimal(data.varUnequalSig,3);
								var varUnequalSup=decimal(data.varUnequalSup,3);
								var varUnequalT=decimal(data.varUnequalT,3);
								var varUnequalInf=decimal(data.varUnequalInf,3);
								if(varEqualSig<0.05){
									varEqualSig='<span class="fred">'+varEqualSig+'</span>';
								}
								if(varUnequalSig<0.05){
									varUnequalSig='<span class="fred">'+varUnequalSig+'</span>';
								}
								if(i%2){
									str+='<tr><td rowspan="2">'+varname+'</td><td>假设方差相等</td><td>'+varEqualT+'</td><td>'+varEqualSig+'</td><td>'+varEqualInf+'</td><td>'+varEqualSup+'</td></tr><tr><td>假设方差不相等</td><td>'+varUnequalT+'</td><td>'+varUnequalSig+'</td><td>'+varUnequalInf+'</td><td>'+varUnequalSup+'</td></tr>';
								}else{
								str+='<tr class="bcgk-sp"><td rowspan="2">'+varname+'</td><td>假设方差相等</td><td>'+varEqualT+'</td><td>'+varEqualSig+'</td><td>'+varEqualInf+'</td><td>'+varEqualSup+'</td></tr><tr class="bcgk-sp"><td>假设方差不相等</td><td>'+varUnequalT+'</td><td>'+varUnequalSig+'</td><td>'+varUnequalInf+'</td><td>'+varUnequalSup+'</td></tr>';
								
								}
							  }else{
								  var varname=data[1].variableId==null?'-':data[1].variableId;
								 
								 if(typeof(data[1].errorMeg)!="undefined"&&data[1].errorMeg!=null){
									 var errorCode=data[1].errorCode==null?'-':data[1].errorCode;
									 var errorMeg=data[1].errorMeg==null?'-':data[1].errorMeg;
									 str+='<tr><td>'+varname+'</td><td>'+errorCode+'</td><td colspan="4">'+errorMeg+'</td></tr>';
								 }else{
									 str+='<tr><td>'+varname+'</td><td>'+varname+'</td><td colspan="4">'+varname+'</td></tr>';
								 }
							  }
							});
							str+='</tbody></table></div>';
								
						}else{
							str='<div class="tabpadding"><table class="table table-advance table-right-border text-center"><thead><tr class="closetr"><td colspan="6"><span class="group">没有数据</span><span class="close close-resbox">关闭</span></td></tr></thead></table></div>';
						}
						$(e.target).parents(".result-btn-box").siblings(".res-box").append($(str));
						setTimeout(function () {$(e.target).parents(".result-btn-box").siblings(".res-box").find('.blank_res').fadeOut(800) }, 3000);
						$(e.target).parents(".result-btn-box").siblings(".loading").addClass("hidden");
						$("#shadediv").addClass("hidden");
						$(e.target).parents(".result-btn-box").siblings(".res-box").removeClass("hidden");

					},
					error:function(data){
						$("#shadediv").addClass("hidden");
						bootbox.setDefaults("locale","zh_CN");
						bootbox.alert("获取数据失败!错误："+data.statusText+":"+data.status);
						$(e.target).parents(".result-btn-box").next(".loading").addClass("hidden");
						
					}
				});
			}
		}else if($(this).text()=="数据预览"){
			
			var groupnum=new Array();
			var groups=new Array();
			$.each($("#g10>span"),function(i,data){
				if(!$(data).hasClass("disabled")){
					groups.push($(data).text());
					groupnum.push(parseInt($(data).children("span").html()));
				}
			});
			if(vars.length<1){
				bootbox.setDefaults("locale","zh_CN");
				bootbox.alert("请添加变量");
				return false;
			}
			if(groups.length<1){
				bootbox.setDefaults("locale","zh_CN");
				bootbox.alert("请选择分组人群");
				return false;
			}
		      var res=changeNum("tab_000010",vars,groups,groupnum);
		      if(res){
				$(this).parents(".result-btn-box").nextAll(".res-box").addClass("hidden");
				$(this).parents(".result-btn-box").nextAll(".loading").addClass("hidden");
				$(this).parents(".result-btn-box").nextAll(".dataview").removeClass("hidden");
		      }else{
		    	  bootbox.setDefaults("locale","zh_CN");
					bootbox.alert("数据预览!错误");
		      }
	}
			break;
		case "tab_000011":
			if($(this).text()=="生成结果"){
				if(!$(e.target).parents(".result-btn-box").siblings(".dataview").hasClass("hidden")){
					$(e.target).parents(".result-btn-box").siblings(".dataview").addClass("hidden");
					$(e.target).parents(".result-btn-box").siblings(".res-box").removeClass("hidden");
					
					return false;
				}
			//判断是否只选了两组
			if($("#g11>span.active").length!=2){
				bootbox.setDefaults("locale","zh_CN");
				bootbox.alert("请选择有数据的两组进行处理!");
				
			}else{
				
				var groupids=$("#g11>span.active").eq(0).attr("data-groupid")+','+$("#g10>span.active").eq(1).attr("data-groupid");
				var groupnames=$("#g11>span.active").eq(0).html()+'+'+$("#g11>span.active").eq(1).html();
				if(groupids==''||exp==''||strshow==''){
					bootbox.setDefaults("locale","zh_CN");
					bootbox.alert("请完善统计条件!");
					return false;
				}
				$(e.target).parents(".result-btn-box").siblings(".loading").removeClass("hidden");
				$("#shadediv").removeClass("hidden");
				var data=JSON.stringify({
					"modelname":'配对样本T检验',
					"variablenames":strshow,
					"confLevel":zxqj,
					"groupids":groupids,
					"query":exp,
					"studyid":$("input[name='studyId']").val()
				
				});
				var data_query=JSON.stringify({
					confLevel:zxqj,
					groupids:groupids,
					query:exp
				});
				$.ajax({
					url: "modelistest",
					contentType: 'application/json',
					type: 'POST',
					data: data, //向服务器端发送的数据 
					dataType: "json", //服务器返回数据的类型为json  
					success: function(json) {
						var str='';
						if(json!=null){
							if(json[0]!=null){
								
							
							str='<div class="tabpadding hasdata" data-query='+data_query+' data-varname="'+strshow+'" data-modelid="000011" data-modelname="配对样本T检验"><table class="table table-advance table-right-border text-center"><thead><tr class="closetr"><td colspan="6"><span class="group">'+groupnames+'</span><span class="close close-resbox">关闭</span></td></tr><tr><th colspan="4" class="text-left bcgk-gray">配对样本T检验</th><th colspan="2">差分的 '+(json[0].confLevel)*100+'%置信区间</th></tr><tr><th>变量</th><th>关系</th><th>t</th><th>Sig（双侧）</th><th>下限</th><th>上限</th></tr></thead><tbody>';
							$.each(json,function(i,data){
								
								var varname=data.variableId;
								var varEqualSig=decimal(parseFloat(data.varEqualSig),3);
								var varEqualSup=decimal(data.varEqualSup,3);
								var varEqualT=decimal(data.varEqualT,3);
								var varEqualInf=decimal(data.varEqualInf,3);
								var varUnequalSig=decimal(data.varUnequalSig,3);
								var varUnequalSup=decimal(data.varUnequalSup,3);
								var varUnequalT=decimal(data.varUnequalT,3);
								var varUnequalInf=decimal(data.varUnequalInf,3);
								if(varEqualSig<0.05){
									varEqualSig='<span class="fred">'+varEqualSig+'</span>';
								}
								if(varUnequalSig<0.05){
									varUnequalSig='<span class="fred">'+varUnequalSig+'</span>';
								}
								if(i%2){
									str+='<tr><td rowspan="2">'+varname+'</td><td>假设方差相等</td><td>'+varEqualT+'</td><td>'+varEqualSig+'</td><td>'+varEqualInf+'</td><td>'+varEqualSup+'</td></tr><tr><td>假设方差不相等</td><td>'+varUnequalT+'</td><td>'+varUnequalSig+'</td><td>'+varUnequalInf+'</td><td>'+varUnequalSup+'</td></tr>';
								}else{
								str+='<tr class="bcgk-sp"><td rowspan="2">'+varname+'</td><td>假设方差相等</td><td>'+varEqualT+'</td><td>'+varEqualSig+'</td><td>'+varEqualInf+'</td><td>'+varEqualSup+'</td></tr><tr class="bcgk-sp"><td>假设方差不相等</td><td>'+varUnequalT+'</td><td>'+varUnequalSig+'</td><td>'+varUnequalInf+'</td><td>'+varUnequalSup+'</td></tr>';
								
								}
							});
							str+='</tbody></table></div>';
							}else{
								str='<div class="tabpadding blank_res"><table class="table table-advance table-right-border text-center"><thead><tr class="closetr"><td colspan="6"><span class="group">没有数据</span><span class="close close-resbox">关闭</span></td></tr></thead></table></div>';
							}	
						}else{
							str='<div class="tabpadding"><table class="table table-advance table-right-border text-center"><thead><tr class="closetr"><td colspan="6"><span class="group">没有数据</span><span class="close close-resbox">关闭</span></td></tr></thead></table></div>';
						}
						$(e.target).parents(".result-btn-box").siblings(".res-box").append($(str));
						setTimeout(function () {$(e.target).parents(".result-btn-box").siblings(".res-box").find('.blank_res').fadeOut(800) }, 3000);
						$(e.target).parents(".result-btn-box").siblings(".loading").addClass("hidden");
						$("#shadediv").addClass("hidden");
						$(e.target).parents(".result-btn-box").siblings(".res-box").removeClass("hidden");

					},
					error:function(data){
						$("#shadediv").addClass("hidden");
						bootbox.setDefaults("locale","zh_CN");
						bootbox.alert("获取数据失败!错误："+data.statusText+":"+data.status);
						$(e.target).parents(".result-btn-box").next(".loading").addClass("hidden");
						
					}
				});
			}
		}else if($(this).text()=="数据预览"){
			
			var groupnum=new Array();
			var groups=new Array();
			$.each($("#g10>span"),function(i,data){
				if(!$(data).hasClass("disabled")){
					groups.push($(data).text());
					groupnum.push(parseInt($(data).children("span").html()));
				}
			});
			if(vars.length<1){
				bootbox.setDefaults("locale","zh_CN");
				bootbox.alert("请添加变量");
				return false;
			}
			if(groups.length<1){
				bootbox.setDefaults("locale","zh_CN");
				bootbox.alert("请选择分组人群");
				return false;
			}
		      var res=changeNum("tab_000011",vars,groups,groupnum);
		      if(res){
				$(this).parents(".result-btn-box").nextAll(".res-box").addClass("hidden");
				$(this).parents(".result-btn-box").nextAll(".loading").addClass("hidden");
				$(this).parents(".result-btn-box").nextAll(".dataview").removeClass("hidden");
		      }else{
		    	  bootbox.setDefaults("locale","zh_CN");
					bootbox.alert("数据预览!错误");
		      }
	}
			break;
		default:console.log("没有模型");return false;
		}
	
	
	
	
});
//关闭结果
$(".close-resbox").live("click",function(e){
	
	$(e.target).parents(".tabpadding").remove();
})
//清空操作
 function clearCont(obj){
	 $(".u_panel").addClass("hidden");
 }
function getconfidence(data){//获取置信分组

	$.ajax({
		url: "getconfidence",
		contentType: 'application/json',
		type: 'POST',
		data: JSON.stringify({
			"studyid":$("input[name='studyId']").val()
		}), //向服务器端发送的数据 
		dataType: "json", //服务器返回数据的类型为json  
		success: function(data) {
			if(data){
				var str='';
				var n=0;
				$.each(data,function(i,json){
					var groupnum=json.groupnum;
					var gg=json.remark;
					if(json.groupnum=='null'||json.groupnum==null){
						if(gg=='0'){
							
								str+='<span class="block-group btn disabled" data-groupid="'+json.groupid+'">'+json.groupname+'（0例）</span>';
						
						}else{
							str+='<span class="block-group btn small disabled" data-groupid="'+json.groupid+'">'+json.groupname+'（0例）</span>';
						}
					}else{
						if(gg=='0'){
							if(n<2){
								str+='<span class="block-group btn active" data-groupid="'+json.groupid+'">'+json.groupname+'（<span>'+groupnum+'</span>例）</span>';
								
								
							}else{
								str+='<span class="block-group btn" data-groupid="'+json.groupid+'">'+json.groupname+'（<span>'+groupnum+'</span>例）</span>';
							}
						
						
						
						n++;
						}else{
							str+='<span class="block-group btn small" data-groupid="'+json.groupid+'">'+json.groupname+'（<span>'+groupnum+'</span>例）</span>';
						}
					}
					
					
				})
			}
			$(".chose-group-body").html(str);
			if(data.length>=2){
				step4Start(true);
			}else{
				step4Start(false);
			}
			
		}
	});
}
$("#tab4 .choose-var").live("click",function(){
	//做模型关联
})
//******************tab4 end***************************
//******进入网页 *********	
var count=0;
var userid=$("input[name='userId']").val()
			var xhr;
			
				$("#tabone-btn").live("click",function() {
					$('#form_wizard_1').bootstrapWizard('show',0);
					$studyobjective = $.trim($("input[name='username']").val());
					$studytype = $("input[name='typename']:checked").val();
					$principalinvestigator = $("select[name='selectProjectPI']").val();
					$studystartdate = $("input[name='fromtime']").val();
					$studycompletiondate = $("input[name='totime'").val();
					$studyid= $("input[name='studyId']").val()
					$.ajax({
						url: "studyinfoinsert",
						contentType: 'application/json',
						type: 'POST',
						data: JSON.stringify({
							"userid":userid,
							"studyid": $studyid,
							"studyobjective": $studyobjective,
							"studytype": $studytype,
							"principalinvestigator": $principalinvestigator,
							"studystartdate": $studystartdate,
							"studycompletiondate": $studycompletiondate
						}), //向服务器端发送的数据 
						dataType: "json", //服务器返回数据的类型为json  
						success: function(json) {
							if(json.result=="200"){
								$("#studyid").val(json.studyid);
								$('#form_wizard_1').bootstrapWizard('show',1);
							}
							
							//控制条件框移动移动
							 var mySwiper = new Swiper ('.swiper-container', {
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
							 
							
						},
						error:function(data){				        	
				        	$('#form_wizard_1').bootstrapWizard('show',0);
				        	bootbox.setDefaults("locale","zh_CN");
				    		bootbox.alert("存储失败!错误："+data.statusText+":"+data.status);
				         }
					})

				});
				$("#tabtwo-btn").live("click",function() {
					$('#form_wizard_1').bootstrapWizard('show',1);
					if(parseInt($(".eg-num").text())>0 && $.trim($(".equation").html()).length>0){
					$.ajax({
						   url: 'savepatients',     
					 	   contentType: 'application/json', 
					        type: 'POST',             
					        data:JSON.stringify({"patients":$(".equation").html(),"query":'{"expressions":['+patients+'],"page":"1","size":"10"}',"studyid":$("#studyid").val(),"total":$(".eg-num").text()}),//向服务器端发送的数据 
					        dataType: "json",
					        success:function(data){
					        	if(data.result=="200"){
									console.log("save2");
									$('#form_wizard_1').bootstrapWizard('show',2);
									/*$("#tab3 .well").html('<div class="row"><div class="col-md-4"><b>组别</b></div><div class="col-md-8"><b>水平</b></div></div><div class="scroll"><div class="group-box"><div class="row big-group"><div class="name-group"><input type="text" class="group-name" value="A组" name="group-name"></div><div class="col-md-8 no-padding"><div class="form-group margin-top-10 search-group"><div class="search"><input type="text" class="form-control keyinput" placeholder="搜索项" name="search" value="" ></div></div><div class="form-group relationship-group"><div class="margin-top-10"><select class="form-control relationship-select" name="relationship"><option style="color: #B3B3B3;" disabled selected>关系</option></select></div></div><div class="form-group input3-group"><div class="margin-top-10 input3"><input type="text" class="form-control input-inline" placeholder="对比值" name="data3"></div><div class="margin-top-10 hidden"><select class="form-control units" name="units"></select></div></div><div class="no-padding big btn-group"><b class="plus-group" title="添加分组"><i class="fa fa-plus-circle"></i></b></div></div><div class="md2 no-padding"><div class="btn-group"><b class="plus-children" title="添加子分组"><i class="fa fa-plus"></i>  添加亚组</b></div></div></div></div><div class="group-box"><div class="row big-group other"><div class="name-group"><span class="group-name" contenteditable="true" style="border-left: 1px #ddd solid;">其他</span></div><div class="col-md-8 no-padding"><div class="form-group margin-top-10 other-group" style="margin-top: 12px;"><div><input type="text" class="form-control" placeholder="正常分组外剩余样本" name="search" value="" autocomplete="off"></div></div></div><div class="md2 no-padding"><div class="btn-group"><b class="plus-children" title="添加子分组"><i class="fa fa-plus"></i>  添加亚组</b></div></div></div></div></div>');*/
									/*$("#tab3 .well .keyinput").val("");
									$("#tab3 .result-tab").addClass("hidden");*/
					        	};
								
					        	
					         },
					         error:function(data){				        	
					        	$('#form_wizard_1').bootstrapWizard('show',1);
					        	bootbox.setDefaults("locale","zh_CN");
					    		bootbox.alert("存储失败!错误："+data.statusText+":"+data.status);
					         }
					        });
					}else{
						$('#form_wizard_1').bootstrapWizard('show',1);
						bootbox.setDefaults("locale","zh_CN");
			    		bootbox.alert("当前筛选人群为空！");
					}
				});
				window.threebtn=function(){
						var result=false;
					$.ajax({
						   url: 'getbygroup',     
					 	   contentType: 'application/json', 
					        type: 'POST',  
					        async:false, 
					        data:JSON.stringify({"query":message,"studyid":$("#studyid").val(),"groupcondition":groupcondition,"savestatus":1}),//向服务器端发送的数据 
					        dataType: "json",
					        success:function(data){
									$("#tab5 #group_td").html(groupcondition.replace(/##/g,''));
									
									getconfidence(data);
									
						    		result=true;
						    		
					        	
					         },
					         error:function(data){				        	
					        	
					        	bootbox.setDefaults("locale","zh_CN");
					    		bootbox.alert("存储失败!错误："+data.statusText+":"+data.status);
					    		
					         }
					        });

					return result;
				};
				$("#tabfour-btn").live("click",function() {
					//遍历所有模型
					var str='';
					var exp=new Array();
					exp=[];
					var varnames='';
					var modelnames='';
					$.each($("#tab4 .tab-content .tab-pane"),function(i,obj){
						var modelid='';
						
						
						if($(obj).find(".hasdata").length>0){
							modelid=$(obj).find(".hasdata").attr("data-modelid");
							if(i>0){
								modelnames+=","+$(obj).find(".hasdata").attr("data-modelname");
							}else{
								modelnames+=$(obj).find(".hasdata").attr("data-modelname");
							}
							
							var query=new Array();
							$.each($(obj).find(".hasdata"),function(ii,data){
								varnames+=$(data).attr("data-varname");
								
								
									query.push(JSON.parse($(data).attr("data-query")));
							
								
								
							});
						
						var list={'modelid':modelid,'modelinf':query};
						
							exp.push(list);	
						
						
						
						};
						
					});
					
					
					var str={"modelstr":JSON.stringify(exp),"studyid":$("#studyid").val(),"variablenames":varnames,"modelnames":modelnames};
					/*if(exp.length>0 && modelnames.length>0){*/
						console.log(str);
						$.ajax({
							   url:'savetestmodel',     
						 	   contentType: 'application/json', 
						        type: 'POST',             
						        data:
						        	JSON.stringify(str),//向服务器端发送的数据 
						        dataType: "json",
						        success:function(res){
						        	
						        	$.ajax({
										   url: 'getresultshow',     
									 	   contentType: 'application/json', 
									        type: 'POST',             
									        data:JSON.stringify({"studyid":$("#studyid").val()}),//向服务器端发送的数据 
									        dataType: "json",
									        success:function(data){
									        	if(data!=null){
									        		if(data.inclu==''||data.inclu==null){
									        			$("#tab5 #res_condition").html('-');
									        		}else{
									        			$("#tab5 #res_condition").html(data.inclu);
									        		}
									        		if(data.groupscondition==''||data.groupscondition==null){
									        			$("#tab5 #group_td").html('-');
									        		}else{
									        			$("#tab5 #group_td").html(data.groupscondition);
									        		}
									        		if(data.studysList[0].studytype==''||data.studysList[0].studytype==null){
									        			$("#tab5 #research_type").html('-');
									        		}else{
									        			$("#tab5 #research_type").html(data.studysList[0].studytype);
									        		}
									        	    if(data.studysList[0].studyobjective==''||data.studysList[0].studyobjective==null){
									        	    	$("#tab5 #p2 .page-title").html('研究目的  :-');
									        	    }else{
									        	    	$("#tab5 #p2 .page-title").html('研究目的  :'+data.studysList[0].studyobjective);
									        	    }
									        	    if(data.studysList[0].interventionmodel==''||data.studysList[0].interventionmodel==null){
									        	    	$("#tab5 #stats_methods").html('');
									        	    }else{
									        	    	$("#tab5 #stats_methods").html(data.studysList[0].interventionmodel);
									        	    }
									        	    if(data.studysList[0].statisticalmodel==''||data.studysList[0].statisticalmodel==null){
									        	    	$("#tab5 #vars").html('');
									        	    }else{
									        	    	$("#tab5 #vars").html(data.studysList[0].statisticalmodel);
									        	    }
									        	    //生成结果
									        	    if(data.modelIstest.length>0){
														
														
														var str='<div class="tabpadding hasdata"  data-modelid="000010" data-modelname="独立样本T检验"><table class="table table-advance table-right-border text-center"><thead><tr class="closetr"><td colspan="6"><span class="group">'+data.studysList[0].interventionmodel+'</span><span class="close close-resbox">关闭</span></td></tr><tr><th colspan="4" class="text-left bcgk-gray">独立样本T检验</th><th colspan="2">差分的 '+(data.modelIstest[0].confLevel)*100+'%置信区间</th></tr><tr><th>变量</th><th>关系</th><th>t</th><th>Sig（双侧）</th><th>下限</th><th>上限</th></tr></thead><tbody>';
														$.each(data.modelIstest,function(i,data){
															
															var varname=data.variableId;
															var varEqualSig=decimal(parseFloat(data.varEqualSig),3);
															var varEqualSup=decimal(data.varEqualSup,3);
															var varEqualT=decimal(data.varEqualT,3);
															var varEqualInf=decimal(data.varEqualInf,3);
															var varUnequalSig=decimal(data.varUnequalSig,3);
															var varUnequalSup=decimal(data.varUnequalSup,3);
															var varUnequalT=decimal(data.varUnequalT,3);
															var varUnequalInf=decimal(data.varUnequalInf,3);
															if(varEqualSig<0.05){
																varEqualSig='<span class="fred">'+varEqualSig+'</span>';
															}
															if(varUnequalSig<0.05){
																varUnequalSig='<span class="fred">'+varUnequalSig+'</span>';
															}
															if(i%2){
																str+='<tr><td rowspan="2">'+varname+'</td><td>假设方差相等</td><td>'+varEqualT+'</td><td>'+varEqualSig+'</td><td>'+varEqualInf+'</td><td>'+varEqualSup+'</td></tr><tr><td>假设方差不相等</td><td>'+varUnequalT+'</td><td>'+varUnequalSig+'</td><td>'+varUnequalInf+'</td><td>'+varUnequalSup+'</td></tr>';
															}else{
															str+='<tr class="bcgk-sp"><td rowspan="2">'+varname+'</td><td>假设方差相等</td><td>'+varEqualT+'</td><td>'+varEqualSig+'</td><td>'+varEqualInf+'</td><td>'+varEqualSup+'</td></tr><tr class="bcgk-sp"><td>假设方差不相等</td><td>'+varUnequalT+'</td><td>'+varUnequalSig+'</td><td>'+varUnequalInf+'</td><td>'+varUnequalSup+'</td></tr>';
															
															}
														});
														str+='</tbody></table></div>';
														}else{
															str='<div class="tabpadding blank_res"><table class="table table-advance table-right-border text-center"><thead><tr class="closetr"><td colspan="6"><span class="group">没有数据</span><span class="close close-resbox">关闭</span></td></tr></thead></table></div>';
														}
									        	    $("#tab5 .res-box").html($(str))
									        	}
									        	
									        	
									         },
									         error:function(data){				        	
									        	$('#form_wizard_1').bootstrapWizard('show',3);
									        	bootbox.setDefaults("locale","zh_CN");
									    		bootbox.alert("存储失败!错误："+data.statusText+":"+data.status);
									         }
									        });
						        },
						        error:function(data){				        	
						        	bootbox.setDefaults("locale","zh_CN");
						    		console.log("存储失败!错误："+data.statusText+":"+data.status);
						         }
						})
					/*}*/
					
					
					
				});
//function printType(n){
//	
//}
function getResAjax(){
	$.ajax({
		   url:'querydownlist',     
		   contentType: 'application/json', 
	     type: 'POST',             
	    data:'',
	     dataType: "json",
	     success:function(arr){
	    	 
	     	var string1='';		  
	     	var stred1='';
	     	var perNum=0;
	     	var count=0;
	     	$.each(arr,function(i,data){
	     		var filename=data.exportName;
	     		var per=Math.floor(parseFloat(data.per)*100);
	     		perNum+=parseInt(data.per);
	     		if(data.exportName.length>20){
	     			filename=data.exportName.substring(0,4)+'...'+data.exportName.substring(data.exportName.lastIndexOf(".")-2);
	     		};
	     		if(data.end){
	     			if((++count)<6)
	     			stred1+='<li data-fileid="'+data.fileId+'"><div class="doc_info"><small title="'+data.exportName+'">'+filename+'<span>'+data.time+'</span></small></div><div class="doc_dc"><i class="export_icon" title="下载到本地"></i></div></li>';
	     			else if(count==6)
	     				stred1+='<li class="text-center"><a>显示全部文件</a></li>';
	     		}else{
		        	string1+='<li data-fileid="'+data.fileId+'"><div class="doc_info"><small title="'+data.exportName+'">'+filename+'<span>'+per+'%</span></small><div class="progress progress-mini"><div class="progress-bar" style="width: '+per+'%;"></div></div></div><div class="doc_del"><i class="fa fa-close"></i></div></li>';
		        }
	     	});
	     	if(string1==''){
	     		string1='<li></li>';
	     	}
	     	$("#dced").html(stred1);$("#dcing").html(string1);
	     	
	     	if(arr.length==perNum){
	     		clearInterval(inter);
	     		$(".loadbtn>img").attr("src","img/export_icon_unload.png");
	     	}else{
	     		$(".loadbtn>img").attr("src","img/export_icon_downloading.png");
	     	}	
	      }
	     
	     });
}

	
		
		 inter=setInterval(function(){
			 getResAjax()
				
			},1000);

var offset = $(".loadbtn").offset();
var flyer = $('<img class="u-flyer" src="img/load_icon.png">');
function addFly(){
	

		$("#responsive .modalClose").click();
		var addcar = $(this);
		flyer = $('<img class="u-flyer" src="img/load_icon.png">');
		
		flyer.fly({
			start: {
				left: offset.left-110,
				top: offset.top+100,
				opacity:100
			},
			end: {
				left: offset.left+10,
				top: offset.top+10-$(window).scrollTop(),
				width: 0,
				height: 0,
				opacity:100
			},
			 onEnd: function() {   
				
				 $(".loadbtn>img").delay(1000).attr("src","img/export_icon_downloading.png");
	             this.destory(); //销毁抛物体
			}
		});
	
	
}
$(".exportSure_btn").live("click",function(){
	 
	var planName=$.trim($(".planname-input").val());
	var needCreate=$(".planname-input").hasClass("hidden")?false:true;
	var resultArr=new Array();
	var variableArr=new Array();
	if($(".right-data table tbody tr td:first-child").html()>0){
		if($(".right-data table tbody tr").length>=1){
			resultArr[0]="fieldId";
		$.each($(".right-data table tbody tr"),function(i,data){
			
			resultArr.push($(data).attr("data-text"));
			var json={"variableName":$(data).children("td").eq(1).html(),"variableId":$(data).attr("data-varid"),"variableOtherName":$.trim($(data).children("td").eq(2).html())};
			
			variableArr.push(json);
			
		})
		}
	}
	var variableList=variableArr;
	var exp=patients;
	var exportType=$("#exporttype-btn").text();
	var tojson={"planName":planName,"needCreate":needCreate,"exportType":exportType,"variableList":variableArr,"exp":{"expressions":[[{"field":"病历_基本信息_性别","exp":"等于","values":["女"],"flag":"||","unit":""}]],"page":"0","size":"10","resultField":resultArr}};
	if(needCreate){
		if(planName==''){
			$(".planname-input").pulsate({
                color: "#ed5565",
                repeat: false,
                speed: 100
                
            });
		return false;	
		}
	}
	 $.ajax({
		   url: 'createplanandexport',     
		   contentType: 'application/json', 
	      type: 'POST',             
	      data:JSON.stringify(tojson),
	      dataType: "text",
	      success:function(data){ 
	    	  getResAjax();
	    	  addFly();
	    	  if(!$("#export_res").hasClass("hidden")){
	  			clearInterval(inter);
	  			 inter=setInterval(function(){
	  				 getResAjax();
	  				},1000);
	  			 
	  		}
			
		},
		error:function(data){
			bootbox.setDefaults("locale","zh_CN");
    		bootbox.alert("导出失败!错误："+data.statusText+":"+data.status);
		}

	});
});
				var time=0;
	$(".loadbtn").live("click",function(){
		if($("#export_res").hasClass("hidden")){
			clearInterval(inter);
			 inter=setInterval(function(){
				 getResAjax()
					
				},1000);
			 $("#export_res").removeClass("hidden");
		}else{
			clearInterval(inter);
			$("#export_res").addClass("hidden");
		}

		

	});
//	导出到本地
	
	$("#dced>li").live("click",function(){
		
		var id=$(this).attr("data-fileid");
	    window.location.href='downfile?fileId='+id+'&userId='+userid;
	})
//	导出面板
$("#export_res>ul>li").click(function(){
	
	$(this).addClass("active").siblings("li").removeClass("active")
});
	
//******进入网页 *********
});
