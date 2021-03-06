<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ page import="java.util.*"%>
<%@ page import="java.net.*"%>
<%@ page import="com.glaf.base.modules.sys.*"%>
<%@ page import="com.glaf.base.modules.workspace.model.*"%>
<%@ page import="com.glaf.base.utils.*"%>
<%
	String url = URLEncoder.encode(ParamUtil.getParameter(request, "url"), "UTF-8");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>增加我的菜单</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/themes/<%=com.glaf.core.util.RequestUtils.getTheme(request)%>/site.css">
<script src="<%= request.getContextPath() %>/scripts/css.js" language="javascript"></script>
<script type='text/javascript' src='<%= request.getContextPath() %>/scripts/main.js'></script>
<script type='text/javascript' src="<%= request.getContextPath() %>/scripts/verify.js"></script>
</head>

<body>
<div class="nav-title"><span class="Title">工作台</span>&gt;&gt; 增加我的菜单</div>
<html:form action="/mx/workspace/mymenu/saveAdd" method="post" onsubmit="return verifyAll(this);" >
<input name="showList" type="hidden" value="1">
<input name="url" type="hidden"  value="<%= url %>">
  <table width="99%" border="0" align="center" cellpadding="0" cellspacing="0" class="box">
    <tr>
      <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr class="box">
            <td class="box-lt">&nbsp;</td>
            <td class="box-mt">&nbsp;</td>
            <td class="box-rt">&nbsp;</td>
          </tr>
      </table></td>
    </tr>
    <tr>
      <td class="box-mm"><table width="95%" border="0" align="center" cellpadding="5" cellspacing="0">
        <tr>
          <td width="20%" class="input-box">菜单标题*</td>
          <td><input name="title" type="text" class="input" size="45" datatype="string" nullable="no" maxsize="100" chname="菜单标题"></td>
        </tr>
      </table>
        <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
              <td height="35" align="center" valign="bottom"><input name="btnSave" type="submit" class="button" value="保存"></td>
            </tr>
        </table></td>
    </tr>
    <tr>
      <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr class="box">
            <td class="box-lb">&nbsp;</td>
            <td class="box-mb">&nbsp;</td>
            <td class="box-rb">&nbsp;</td>
          </tr>
      </table></td>
    </tr>
  </table>
</html:form>
</body>
</html>
