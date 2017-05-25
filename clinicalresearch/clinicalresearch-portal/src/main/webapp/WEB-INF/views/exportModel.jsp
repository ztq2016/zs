<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<div id="responsive" class="modal fade" tabindex="-1" aria-hidden="true" role="basic" >
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
											<div class="scroller" style="height:300px" data-always-visible="1" data-rail-visible1="1">
												<div class="row">
													<div class="col-md-4">
														<div class="form-group">
																<div class="input-icon right input-middle margin-top-10 tree-search">
																	<i class="fa fa-search"></i>
																	<input type="text" class="form-control" placeholder="" id="tree-search">
																</div>
															
														</div>
														<div class="left-data scroller" data-always-visible="1" data-rail-visible1="1">
															<div id="tree" class="tree-demo"></div>
															<div id="tree_search" class="tree-demo hidden"></div>
														</div>
													</div>
													<div class="col-md-8">
														<div class="right-data scroller"  data-always-visible="1" data-rail-visible1="1">
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
					</div>
				   </div>
				</div>
			</div>
		</div>
										<div class="modal-footer">
											
														<form class="form-inline" role="form" style="display: inline-block;">
								
								
								<div class="checkbox">
									<label>
									<input type="checkbox" class="icheck planname-btn"> 保存至方案 </label>
								</div>
								<input type="text" class="form-control input-sm planname-input hidden" placeholder="方案名称" >
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