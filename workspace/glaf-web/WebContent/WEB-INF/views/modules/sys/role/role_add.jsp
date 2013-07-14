<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ page import="java.util.*"%>
<%@ page import="com.glaf.base.modules.sys.*"%>
<%@ page import="com.glaf.base.modules.sys.model.*"%>
<%@ page import="com.glaf.base.utils.*"%>
<%
String context = request.getContextPath();
List  list = (List)request.getAttribute("parent");
int parent=ParamUtil.getIntParameter(request, "parent", 0);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="<%=context%>/css/site.css" type="text/css" rel="stylesheet">
<script language="javascript" src='<%=context%>/scripts/main.js'></script>
<script language="javascript" src='<%=context%>/scripts/verify.js'></script></head>

<body>
<html:form action="${contextPath}/mx/sys/role/saveAdd" method="post" onsubmit="return verifyAll(this);" >
<div class="nav-title"><span class="Title">角色管理</span>&gt;&gt;增加角色</div>
<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0" class="box">
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
    <td class="box-mm"><table width="95%" align="center" border="0" cellspacing="0" cellpadding="5">
      <tr>
        <td class="input-box">角色名称*</td>
        <td><input name="name" type="text" size="35" class="input" datatype="string" nullable="no" maxsize="20" chname="角色名称"></td>
      </tr>
      <tr>
        <td class="input-box2" valign="top">描　　述</td>
        <td><textarea name="content" cols="35" rows="3" class="input-multi" datatype="string" nullable="yes" maxsize="100" chname="描述"></textarea>        </td>
      </tr>
      <tr>
        <td class="input-box2" valign="top">代码*</td>
        <td><input name="code" type="text" size="35" class="input" datatype="string" nullable="no" maxsize="20" chname="代码"></td>
      </tr>
      <tr>
        <td colspan="2" align="center" valign="bottom" height="30">&nbsp;
            <input name="btn_save" type="submit" value="保存" class="button"></td>
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
