<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ page import="java.util.*"%>
<%@ page import="com.glaf.base.modules.sys.*"%>
<%@ page import="com.glaf.base.modules.sys.model.*"%>
<%@ page import="com.glaf.base.utils.*"%>
<%
String context = request.getContextPath();
pageContext.setAttribute("contextPath", context); 
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
<%@ include file="/WEB-INF/views/inc/mx_header.jsp"%>
<script language="javascript" src='<%=context%>/scripts/main.js'></script>
<script language="javascript" src='<%=context%>/scripts/verify.js'></script></head>
<script language="JavaScript">
function checkForm(form){
  if(verifyAll(form)){
     if(form.newPwd.value!=form.password2.value){
	   alert("新密码与确认密码不匹配！");
	 }else{
	   return true;
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
<br><br>
<html:form action="${contextPath}/mx/identity/user/savePwd" method="post"  onsubmit="return checkForm(this);"> 
 
   <table width="500" align="center" border="0" cellspacing="0" cellpadding="5">
	  <tr>
        <td height="28"class="input-box2" valign="top">原密码*</td>
        <td height="28"><input name="oldPwd" type="password" size="30"  class="input span3 x-text" value="" datatype="string" nullable="no" minsize="6" maxsize="20" chname="密码"></td>
      </tr>
      <tr>
        <td height="28"class="input-box2" valign="top">新密码*</td>
        <td height="28"><input name="newPwd" type="password" size="30"  class="input span3 x-text" value="" datatype="string" nullable="no" minsize="6" maxsize="20" chname="密码"></td>
      </tr>
      <tr>
        <td height="28"class="input-box2" valign="top">确认密码*</td>
        <td height="28"><input name="password2" type="password" size="30"  class="input span3 x-text" value=""  datatype="string" nullable="no" minsize="6" maxsize="20" chname="确认密码"></td>
      </tr>
      <tr>
        <td height="30">&nbsp;</td>
		<td align="left" valign="bottom" height="30">&nbsp;
           <br><input name="btn_save2" type="submit" value="修改密码" class="btn btn-primary">
		</td>
      </tr>
    </table> 
</html:form>
</body>
</html>
