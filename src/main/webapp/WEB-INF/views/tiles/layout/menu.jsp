<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <aside class="dash_aside">
	<div class="side_conts">
		<h1 class="logo biglogo">
			<a href="${pageContext.request.contextPath}/"><img src="${pageContext.request.contextPath}/assets/images/logo_ui_wh.png" /></a>
		</h1>
		<h2 class="left_name">MENU</h2>
		<ul class="left_menu">
			<li>
				<a href="${pageContext.request.contextPath}/" class="selb_link">
					<img src="${pageContext.request.contextPath}/assets/images/sv_dash.svg" />
					<span class="menu_name">진행 현황</span>
				</a>
			</li>
		</ul><!-- left_menu -->
	</div><!-- side_conts -->
</aside><!-- dash_aside -->
