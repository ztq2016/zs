<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<div class="varpanel4 u_panel hidden">
								  <div class="row no-padding group-var">
											   			
											   			
											   			<div class="form-group search-group">
											   				
															<div class="search">
																<input type="text" class="form-control keyinput" placeholder="搜索项" name="search" value="" >
															</div>
														</div>
														<div class="form-group relationship-group hidden">
															  <div class="">
																	<select class="form-control relationship-select" name="relationship">
																		
																	</select>
														       </div>
														</div>
														<div class="form-group input3-group hidden">
														<div class=" input3">
															<input type="text" class="form-control input-inline" placeholder="对比值" name="data3">
														</div>
														</div>
														<div class="no-padding form-btn-group">
															<i class="fa fa-check"></i><i class="fa  fa-times"></i>
																			
														</div>
													 
											   		</div>
</div>
<div class="num_panel hidden u_panel">
									 <!-- <img src="img/arrow.png" class="arrow"/> --> 
									
									<div style="clear:both;"></div>
									<div class="scroll2div">
									<div class="form-group" >
										
										
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
									</div>
									<div class="text-right bottom-btngroup">
										<span class="btn btn-xs green adddata">确定</span><span class="btn btn-xs">取消</span>
									</div>
								</div>
	<div class="time_panel hidden u_panel">
									<!-- <img src="img/arrow.png" class="arrow"/> -->
									<div class="form-group typetime-choose">
										<label><input type="radio" name="time10" class="jcheck" checked="checked"> 相对时间</label>
										<label><input type="radio" name="time10" class="jcheck"> 绝对时间</label>
										
									</div>
									<div class="scrolldiv">
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
										<select class="form-control input-xsmall inline timing">
											<!-- <option value="f" disabled="disabled" selected="selected">时间</option> -->
											<option value="pre">之前</option>
											<option value="later">之后</option>
											<option value="today">当天</option>
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
										
										<b class="plus-group" title="添加"><i class="fa fa-plus-circle"></i></b>
										<b class="del-this hidden"><i class="fa fa-minus-circle" title="删除"></i></b>
										
									</div> 
									</div>
									<div class="form-group group-relativeTime bottom-btngroup">
										<label>指标次数</label>
										<label><input type="radio" name="times10" class="jcheck" checked="checked"> 全部指标</label>
										<label><input type="radio" name="times10" class="jcheck"> 第一次</label>
										<label><input type="radio" name="times10" class="jcheck"> 最后（最近）一次</label>
									</div>
									<div class="form-group group-absoluteTime hidden">
										<div class="input-group input-large date-picker input-daterange" data-date="2012-11-10" data-date-format="yyyy-dd-mm">
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