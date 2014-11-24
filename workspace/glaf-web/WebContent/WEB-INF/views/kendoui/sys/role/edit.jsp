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
<title>编辑角色信息</title>
<%@ include file="/WEB-INF/views/inc/init_kendoui.jsp"%> 
<script type="text/javascript">
                
  jQuery(function() {
    var viewModel = kendo.observable({
        //roleId: "${sysRole.roleId}",
        name: "${sysRole.name}",
		code: "${sysRole.code}",
		content: "${sysRole.content}",
		status: "${sysRole.status}"
    });

    kendo.bind($("#iForm"), viewModel);

   });

   $(document).ready(function() {
                $("#iconButton").kendoButton({
                    spriteCssClass: "k-icon"
                });           
   });

   function save(){
       var form = document.getElementById("iForm");
	   form.method="post";
	   <c:choose>
	   <c:when test="${!empty sysRole}">
	   form.action = "<%=request.getContextPath()%>/mx/system/role/saveModify";
	   </c:when>
	   <c:otherwise>
	   form.action = "<%=request.getContextPath()%>/mx/system/role/saveAdd";
       </c:otherwise>
	   </c:choose>
	   form.submit();
   }

   function saveAjax(){
        var form = document.getElementById("iForm");
	    if(form.name.value == ''){
		    alert("角色名称不能为空！");
		    form.newPwd.focus();
		    return;
	    }

	<c:choose>
	   <c:when test="${!empty sysRole}">
	   var link = "<%=request.getContextPath()%>/mx/system/role/saveModify";
	   </c:when>
	   <c:otherwise>
	   var link = "<%=request.getContextPath()%>/mx/system/role/saveAdd";
       </c:otherwise>
	 </c:choose>
	     
	    var params = jQuery("#iForm").formSerialize();
		jQuery.ajax({
				   type: "POST",
				   url: link,
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
					   window.parent.location.reload();
				   }
			 });
   }
 </script>
</head>
<body style="margin-top:0px;">
<div id="main_content" class="k-content ">
<br>
<div class="x_content_title"><img
	src="<%=request.getContextPath()%>/images/window.png" alt="编辑角色信息">&nbsp;
编辑角色信息</div>
<br>
<form id="iForm" name="iForm">
  <table width="95%" align="center" border="0" cellspacing="0" cellpadding="5">
  <c:choose>
	<c:when test="${!empty sysRole}">
	  <tr>
        <td width="20%" class="input-box">角色编号*</td>
        <td width="80%">
		<label>${sysRole.id}</label>
		<input type="hidden" id="id" name="id" value="${roleId}">
		</td>
      </tr>
 	</c:when>
	<c:otherwise>
	  <tr>
        <td width="20%" class="input-box">角色名称*</td>
        <td width="80%">
		  <input name="name" data-bind="value: name" type="text" size="30" class="k-textbox"  datatype="string" nullable="no" maxsize="20" chname="角色名称" style=" width:240px;">
        </td>
      </tr>
   </c:otherwise>
</c:choose>
     
      <tr>
        <td class="input-box2" valign="top">角色代码*</td>
        <td>
		<input name="code" data-bind="value: code" type="text" size="30" class="k-textbox"  datatype="string" nullable="no" maxsize="20" chname="角色代码" style=" width:240px;">
		</td>
      </tr>
     
      <tr>
        <td class="input-box2" valign="top">角色描述</td>
        <td>
          <textarea id="content" name="content" rows="6" cols="46" class="k-textbox" style="height:60px; width:240px;"></textarea>        
		</td>
      </tr>
	 
	  <tr>
        <td class="input-box2" valign="top">角色类型</td>
        <td>
		    <kendo:dropDownList id="type" name="type" dataTextField="name" dataValueField="code" value="1">
              <kendo:dataSource data="${roleTypeDictories}"></kendo:dataSource>
            </kendo:dropDownList> 
		     
		    <script type="text/javascript">
		        document.getElementById("type").value="${sysRole.type}";
		    </script>
		</td>
      </tr>

	  <tr>
        <td class="input-box2" valign="top">是否有效</td>
        <td>
		 <input type="radio" name="status" id="engine1" class="k-radio" value="0" <c:if test="${sysRole.status==0}">checked</c:if>>
		 <label class="k-radio-label" for="engine1">有效</label>&nbsp;&nbsp;
		 <input type="radio" name="status" id="engine2" class="k-radio" value="1" <c:if test="${sysRole.status==1}">checked</c:if>>
		 <label class="k-radio-label" for="engine2">无效</label>
		</td>
      </tr>
 
      <tr>
        <td colspan="2" align="center" valign="bottom" height="30">&nbsp;
		   <div >
			  <button type="button" id="iconButton"  class="k-primary" style="width: 90px" onclick="javascript:saveAjax();">保存</button>
		   </div>
	    </td>
      </tr>
    </table>   
</form>
</div>     
</body>
</html>