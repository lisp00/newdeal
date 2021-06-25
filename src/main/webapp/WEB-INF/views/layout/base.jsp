<%@ include file="/WEB-INF/include/jspDefinition.jspf" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta  http-equiv="Content-Type"  content="text/html;charset=utf-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>UINetworks</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/assets/images/favicon.ico"/>
    </head>

    <body>
        <tiles:insertAttribute name="frontscript" />

        <div class="wrap">
            <tiles:insertAttribute name="header"/>
            <tiles:insertAttribute name="menu" />

            <tiles:insertAttribute name="body" />
        </div>
    </body>
</html>
