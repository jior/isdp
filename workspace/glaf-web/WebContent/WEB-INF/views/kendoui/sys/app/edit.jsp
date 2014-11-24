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
<title>编辑模块信息</title>
<%@ include file="/WEB-INF/views/inc/init_kendoui.jsp"%> 
<script type="text/javascript">
                
  jQuery(function() {
    var viewModel = kendo.observable({
        parent: "${application.parent.nodeId}",
        name: "${application.name}",
		code: "${application.code}",
		url: "${application.url}",
		desc: "${application.desc}",
		locked: "${application.locked}"
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
	   <c:when test="${!empty application}">
	   form.action = "<%=request.getContextPath()%>/mx/system/application/update";
	   </c:when>
	   <c:otherwise>
	   form.action = "<%=request.getContextPath()%>/mx/system/application/create";
       </c:otherwise>
	   </c:choose>
	   form.submit();
   }

   function saveAjax(){
        var form = document.getElementById("iForm");
	    if(form.name.value == ''){
		    alert("模块名称不能为空！");
		    form.newPwd.focus();
		    return;
	    }

	<c:choose>
	   <c:when test="${!empty application}">
	   var link = "<%=request.getContextPath()%>/rs/sys/application/update";
	   </c:when>
	   <c:otherwise>
	   var link = "<%=request.getContextPath()%>/rs/sys/application/create";
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
	src="<%=request.getContextPath()%>/images/window.png" alt="编辑模块信息">&nbsp;
编辑模块信息</div>
<br>
<form id="iForm" name="iForm">
<c:if test="${!empty application}">
<input type="hidden" id="appId" name="appId" value="${application.id}">
 </c:if>
  <table width="95%" align="center" border="0" cellspacing="0" cellpadding="5">
	  <tr>
        <td class="input-box2" valign="top">上级模块</td>
        <td>
		   <select id="parent" name="parent" data-bind="value: parent" style="width:160px; height:24px;">
			<option value="3">/</option>
			<c:forEach items="${treeList}" var="tree">
			 <c:if test="${!empty tree.app}">
			  <option value="${tree.app.nodeId}">
			  <c:forEach begin="1" end="${tree.deep}" step="1">&nbsp;&nbsp;&nbsp;&nbsp;</c:forEach>${tree.app.name}
			  </option>
			 </c:if>
			</c:forEach>
		   </select>
           <script language="javascript">								
			  document.all.parent.value="${application.parent.nodeId}";	
		   </script>	
	   </td>
      </tr>

      <tr>
        <td width="20%" class="input-box">模块名称*</td>
        <td width="80%">
		  <input name="name" data-bind="value: name" type="text" size="30" class="k-textbox"  datatype="string" nullable="no" maxsize="20" chname="模块名称" style=" width:240px;">
        </td>
      </tr>

      <tr>
        <td class="input-box2" valign="top">模块代码*</td>
        <td>
		<input name="code" data-bind="value: code" type="text" size="30" class="k-textbox"  datatype="string" nullable="no" maxsize="20" chname="模块代码" style=" width:240px;">
		</td>
      </tr>
     
      <tr>
        <td class="input-box2" valign="top">模块描述</td>
        <td>
          <textarea id="desc" name="desc" data-bind="value: desc" rows="6" cols="46" class="k-textbox" style="height:60px; width:240px;"></textarea>    
		</td>
      </tr>

	  <tr>
        <td class="input-box2" valign="top">链接地址</td>
        <td>
          <textarea id="url" name="url" data-bind="value: url" rows="6" cols="46" class="k-textbox" style="height:60px; width:240px;"></textarea>
		</td>
      </tr>

      <tr>
        <td class="input-box2" valign="top">是否有效</td>
        <td>
		 <input type="radio" name="locked" id="engine1" data-bind="value: locked" class="k-radio" value="0" <c:if test="${application.locked==0}">checked</c:if>>
		 <label class="k-radio-label" for="engine1">有效</label>&nbsp;&nbsp;
		 <input type="radio" name="locked" id="engine2" data-bind="value: locked" class="k-radio" value="1" <c:if test="${application.locked==1}">checked</c:if>>
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