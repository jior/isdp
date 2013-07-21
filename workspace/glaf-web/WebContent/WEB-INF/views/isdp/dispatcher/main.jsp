<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="com.fasterxml.jackson.databind.node.*"%>
<%@ page import="org.apache.commons.lang.*"%>
<%@ page import="com.alibaba.fastjson.*"%>
<%@ page import="com.glaf.core.base.*"%>
<%@ page import="com.glaf.core.config.*"%>
<%@ page import="com.glaf.core.context.*"%>
<%@ page import="com.glaf.core.security.*"%>
<%@ page import="com.glaf.core.util.*"%>
<%
    ArrayNode result = (ArrayNode)request.getAttribute("menus");
	String theme = com.glaf.core.util.RequestUtils.getTheme(request);
	request.setAttribute("theme", theme);
 	request.setAttribute("nowDate", new java.util.Date());
	LoginContext loginContext = com.glaf.core.util.RequestUtils
			.getLoginContext(request);
	request.setAttribute("contextPath", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${cellMenu.name}</title>
<link href="<%=request.getContextPath()%>/css/core.css" rel="stylesheet" type="text/css" >
<link href="<%=request.getContextPath()%>/icons/styles.css" rel="stylesheet" type="text/css" >
<link href="<%=request.getContextPath()%>/layout/css/styles.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/scripts/easyui/themes/${theme}/easyui.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui.simple.extend.js"></script>
<script type="text/javascript">
var _menus = { "menus":<%=result!=null ? result.toString() : "[]"%> };

</script>
</head>
<body class="easyui-layout" style="overflow-y: hidden"  fit="true"   scroll="no">
<noscript>
<div style=" position:absolute; z-index:100000; height:2046px;top:0px;left:0px; width:100%; background:white; text-align:center;">
    <img src="${contextPath}/images/noscript.gif" alt='抱歉，请开启脚本支持！' />
</div></noscript>

<div id="loading-mask" style="position:absolute;top:0px; left:0px; width:100%; height:100%; background:#D2E0F2; z-index:20000">
<div id="pageloading" style="position:absolute; top:50%; left:50%; margin:-120px 0px 0px -120px; text-align:center;  border:2px solid #8DB2E3; width:200px; height:40px;  font-size:14px;padding:10px; font-weight:bold; background:#fff; color:#15428B;"> 
    <img src="${contextPath}/images/loading.gif" align="absmiddle" /> 正在加载中,请稍候...</div>
</div>

 
	<div region="north" split="false" border="false"
		style="overflow: hidden; height: 65px;">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr
				style="overflow: hidden; height: 63px; background: url(${contextPath}/themes/<%=theme%>/images/top_bar_bg.jpg)">
				<td width="5%" align="right" valign="top"><img
					src="${contextPath}/themes/<%=theme%>/images/logo.jpg"
					border="0"></td>
				<td width="25%" align="left" valign="middle"><span
					class="sys_name">${cellMenu.name}</td>
				<td>&nbsp;</td>
				<td width="5%" valign="middle" align="right"></td>
				<td width="10%" align="left" valign="middle">
					<table border="0" cellspacing="0" cellpadding="0"
						style="float: right; margin-right: 8px; margin-top: 5px">
						<tr>
							<td height="25"><img
								src="${contextPath}/images/linkman.gif"
								width="15" height="14" align="absmiddle"> <span
								class="user_name"> <%
							 	if (loginContext.getUser().getName() != null) {
							 		out.println(" " + loginContext.getUser().getName());
							 	}
							 %></span></td>
							<td valign="top"> </td>
						</tr>
						<tr>
							<td height="22"><img
								src="${contextPath}/images/calendar.png"
								width="15" height="13" align="absmiddle" border="0"><span
								class="curr_date"> <fmt:formatDate value="${nowDate}"
										pattern="yyyy-MM-dd" />&nbsp;
							</span></td>
							<td style="font-weight: bold"></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>

    <div region="south" split="true" style="height: 30px; background: #D2E0F2; ">
        <div class="footer">业务域:共有域 </div>
    </div>
    <div region="west" split="true"  title="导航菜单" style="width:180px;" id="west">
			<div id="nav">
		      <!--  导航内容 -->
				
			</div>

    </div>
    <div id="mainPanle" region="center" style="background: #eee; overflow-y:hidden">
        <div id="tabs" class="easyui-tabs"  fit="true" border="false" >
			<div title="我的首页" style="padding:20px;overflow:hidden; color:red; " >
				 
			</div>
		</div>
    </div>
    
    
	<div id="mm" class="easyui-menu" style="width:150px;">
		<div id="tabupdate">刷新</div>
		<div class="menu-sep"></div>
		<div id="close">关闭</div>
		<div id="closeall">全部关闭</div>
		<div id="closeother">除此之外全部关闭</div>
		<div class="menu-sep"></div>
		<div id="closeright">当前页右侧全部关闭</div>
		<div id="closeleft">当前页左侧全部关闭</div>
	</div>


</body>
</html>
<!--end of isdp/dispatcher/main.jsp-->