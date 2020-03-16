<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p><sec:authentication property="name"/></p>
				<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
			</div>
		</div>

		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">菜单</li>
			<li id="admin-index"><a
				href="${pageContext.request.contextPath}/pages/main.jsp"><i
					class="fa fa-dashboard"></i> <span>首页</span></a></li>

			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
					<span>系统管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>


			</a>
				<ul class="treeview-menu">

					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/user/findAll.do"> <i
							class="fa fa-circle-o"></i> 用户管理
					</a></li>
				</ul></li>
			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
					<span>基础数据</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">
					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/spinfo/findAll.do">
							<i class="fa fa-circle-o"></i> 零件管理
					</a></li>
					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/spinfo/findAllGys.do">
						<i class="fa fa-circle-o"></i> 供应商管理
					</a></li>
					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/orders/findAll.do"> <i
							class="fa fa-circle-o"></i> 订单管理
					</a></li>

				</ul></li>
			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
				<span>进销管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">
					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/spinfo/findAll.do">
						<i class="fa fa-circle-o"></i> 进货
					</a></li>
					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/spinfo/findAll.do">
						<i class="fa fa-circle-o"></i> 销售
					</a></li>
				</ul></li>

		</ul>
	</section>
	<!-- /.sidebar -->
</aside>