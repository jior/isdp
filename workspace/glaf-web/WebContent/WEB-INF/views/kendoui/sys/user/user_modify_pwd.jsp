<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.kendoui.com/jsp/tags" prefix="kendo"%>
<%
    String theme = com.glaf.core.util.RequestUtils.getTheme(request);
    request.setAttribute("theme", theme);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑用户信息</title>
<%@ include file="/WEB-INF/views/inc/init_kendoui.jsp"%> 
<script type="text/javascript">
                
  jQuery(function() {
    var viewModel = kendo.observable({
        //actorId: "${bean.actorId}",
        name: "${bean.name}",
		mobile: "${bean.mobile}",
		email: "${bean.mail}",
		telephone: "${bean.telephone}",
		gender: "${bean.gender}",
		status: "${bean.status}"
    });

    kendo.bind($("#iForm"), viewModel);

   });

   $(document).ready(function() {
                $("#iconButton").kendoButton({
                    spriteCssClass: "k-icon"
                });           
   });

   function resetPwd(){
        var form = document.getElementById("iForm");
	    if(form.newPwd.value == ''){
		    alert("新密码不能为空！");
		    form.newPwd.focus();
		    return;
	    }
	    if(form.newPwd.value!=form.password2.value){
	        alert("新密码与确认密码不匹配！");
		    form.password2.focus();
		    return;
	    }
 
	    var params = jQuery("#iForm").formSerialize();
		jQuery.ajax({
				   type: "POST",
				   url: '<%=request.getContextPath()%>/mx/system/user/savePwd',
				   dataType:  'json',
				   data: params,
				   error: function(data){
					   alert('服务器处理错误！');
				   },
				   success: function(data){
					   if(data != null && data.message != null){
						   alert(data.message);
					   } else {
						   alert('操作成功完成！');
					   }
				   }
			 });
   }
 </script>
</head>
<body>
<div id="main_content" class="k-content ">
<div class="x_content_title"><img
	src="<%=request.getContextPath()%>/images/window.png" alt="修改密码">&nbsp;
修改密码</div>
<br>
<form id="iForm" name="iForm">
  <table width="95%" align="center" border="0" cellspacing="0" cellpadding="5">
	  <tr>
        <td width="20%" class="input-box">用户名</td>
        <td width="80%">
		<label>${bean.actorId}</label>
		<input type="hidden" id="actorId" name="actorId" value="${actorId}">
		</td>
      </tr>
	  <tr>
        <td class="input-box2" valign="top">原始密码*</td>
        <td><input name="oldPwd" type="password" size="30" class="k-textbox" value="" datatype="string" nullable="no" minsize="6" maxsize="20" chname="密码"></td>
      </tr>
	  <tr>
        <td class="input-box2" valign="top">新密码*</td>
        <td><input name="newPwd" type="password" size="30" class="k-textbox" value="" datatype="string" nullable="no" minsize="6" maxsize="20" chname="密码"></td>
      </tr>
      <tr>
        <td class="input-box2" valign="top">确认密码*</td>
        <td><input name="password2" type="password" size="30" class="k-textbox" value=""  datatype="string" nullable="no" minsize="6" maxsize="20" chname="确认密码"></td>
      </tr>
      <tr>
        <td colspan="2" align="center" valign="bottom" height="30">&nbsp;
		   <div >
			  <button type="button" id="iconButton"  class="k-primary" style="width: 90px" onclick="javascript:resetPwd();">确定</button>
		   </div>
	    </td>
      </tr>
    </table>   
</form>
</div>     
</body>
</html>