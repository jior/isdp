<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="com.glaf.core.base.*"%>
<%@ page import="com.glaf.core.config.*"%>
<%@ page import="com.glaf.core.context.*"%>
<%@ page import="com.glaf.core.security.*"%>
<%@ page import="com.glaf.core.util.*"%>
<%
    LoginContext loginContext = com.glaf.core.util.RequestUtils.getLoginContext(request);
	String theme = com.glaf.core.util.RequestUtils.getTheme(request);
	request.setAttribute("theme", theme);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>待办任务</title>
<link href="${contextPath}/styles/default.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/easyui/themes/${theme}/easyui.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/css/icons.css">
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/jquery/jquery.cookie.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src='${contextPath}/scripts/easyui.extend.js'></script> 
<script type="text/javascript">
var _menus = {
	"menus": [{
		"menuid": "1",
		"icon": "icon-sys",
		"menuname": "待办事项",
		"menus": [ 
		{
			"menuid": "11",
			"menuname": "待办事项",
			"icon": "icon-users",
			"url": "${contextPath}/mx/isdp/todo/taskList?taskType=RN"
		},
		{
			"menuid": "12",
			"menuname": "已办事项",
			"icon": "icon-users",
			"url": "${contextPath}/mx/isdp/todo/taskList?taskType=WD"
		},
		{
			"menuid": "13",
			"menuname": "退回事项",
			"icon": "icon-users",
			"url": "${contextPath}/mx/isdp/todo/taskList?taskType=FB"
		},
		{
			"menuid": "14",
			"menuname": "全部事项",
			"icon": "icon-users",
			"url": "${contextPath}/mx/isdp/todo/taskList?taskType=ALL"
		}]
	}]
};

 $(function(){
	 $.removeCookie('isdp_taskList_orderBy');
 });
</script>
</head>
<body class="easyui-layout" style="overflow-y: hidden"  fit="true"   scroll="no">
<noscript>
<div style=" position:absolute; z-index:100000; height:2046px;top:0px;left:0px; width:100%; background:white; text-align:center;">
    <img src="${contextPath}/images/noscript.gif" alt='抱歉，请开启脚本支持！' />
</div>
</noscript>

<div id="loading-mask" style="position:absolute;top:0px; left:0px; width:100%; height:100%; background:#D2E0F2; z-index:20000">
<div id="pageloading" style="position:absolute; top:50%; left:50%; margin:-120px 0px 0px -120px; text-align:center;  border:2px solid #8DB2E3; width:200px; height:40px;  font-size:14px;padding:10px; font-weight:bold; background:#fff; color:#15428B;"> 
    <img src="${contextPath}/images/loading.gif" align="absmiddle" /> 正在加载中,请稍候...</div>
</div>

    <div region="north" split="true" border="false" style="overflow: hidden; height: 52px;
        background: url(${contextPath}/images/top2.jpg) #7f99be left ;
        line-height: 50px;color: #fff; font-size:16px; font-family: Verdana, 微软雅黑,黑体">
        <span style="float:right; padding-right:20px;font-size:16px;" class="head">
		    欢迎 <%=loginContext.getUser().getName()%>
		</span>
        <!-- <span style="padding-left:10px; font-size: 16px; "><img src="images/blocks.gif" width="20" height="20" align="absmiddle" /> </span> -->
    </div>
    <div region="south" split="true" style="height: 30px; background: #D2E0F2; ">
        <div class="footer">业务域:共有域 </div>
    </div>
    <div region="west" split="true"   style="height:0px;width:180px;" id="west">
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
		<!-- <div id="tabupdate">刷新</div> -->
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
<!--end of isdp/todo/taskMain.jsp-->