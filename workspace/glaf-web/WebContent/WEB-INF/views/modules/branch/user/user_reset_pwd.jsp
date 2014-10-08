<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ page import="java.util.*"%>
<%@ page import="com.glaf.base.modules.sys.*"%>
<%@ page import="com.glaf.base.modules.sys.model.*"%>
<%@ page import="com.glaf.base.utils.*"%>
<%@ page import="com.glaf.core.util.*"%>
<%
	String context = request.getContextPath();
	SysUser bean=(SysUser)request.getAttribute("bean");
	pageContext.setAttribute("contextPath", request.getContextPath());
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/themes/<%=com.glaf.core.util.RequestUtils.getTheme(request)%>/site.css">
<script language="javascript" src='<%=context%>/scripts/main.js'></script>
<script language="javascript" src='<%=context%>/scripts/verify.js'></script></head>
<script language="javascript">

function checkForm(form){
  if(verifyAll(form)){
     if(form.newPwd.value!=form.password2.value){
	   alert("新密码与确认密码不匹配！");
	 }else {
	   if(confirm("确定要重置“<%=bean.getName()%>”的密码吗？")){
	       return true;
	   }
	 }
  }
   return false;
}

function setValue(obj){
  obj.value=obj[obj.selectedIndex].value;
}
</script>
</head>

<body>
<div class="nav-title"><span class="Title">重置密码</span></div>
<html:form action="${contextPath}/mx/branch/user/resetPwd" method="post"  onsubmit="return checkForm(this);"> 
<input type="hidden" name="id" value="<%=RequestUtils.encodeString(bean.getActorId())%>"> 
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
        <td width="20%" class="input-box">员工账户</td>
        <td width="80%"><%=bean.getActorId()%></td>
      </tr>
      <tr>
        <td class="input-box2" valign="top">姓　　名</td>
        <td><%=bean.getName()%></td>
      </tr>
      <tr>
        <td class="input-box2" valign="top">新密码*</td>
        <td><input name="newPwd" type="password" size="30" class="input" value="" datatype="string" nullable="no" minsize="6" maxsize="20" chname="密码"></td>
      </tr>
      <tr>
        <td class="input-box2" valign="top">确认密码*</td>
        <td><input name="password2" type="password" size="30" class="input" value=""  datatype="string" nullable="no" minsize="6" maxsize="20" chname="确认密码"></td>
      </tr>
      <tr>
        <td colspan="2" align="center" valign="bottom" height="30">&nbsp;
           <input name="btn_save2" type="submit" value="修改密码" class="button">
		</td>
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
