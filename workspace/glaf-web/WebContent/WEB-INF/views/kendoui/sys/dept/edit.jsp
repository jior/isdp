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
<title>编辑部门信息</title>
<%@ include file="/WEB-INF/views/inc/init_kendoui.jsp"%> 
<script type="text/javascript">
                
  jQuery(function() {
    var viewModel = kendo.observable({
        parent: "${department.parent.nodeId}",
        name: "${department.name}",
		no: "${department.no}",
		code: "${department.code}",
		code2: "${department.code2}",
		level: "${department.level}",
		desc: "${department.desc}",
		status: "${department.status}"
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
	   <c:when test="${!empty department}">
	   form.action = "<%=request.getContextPath()%>/mx/system/department/saveModify";
	   </c:when>
	   <c:otherwise>
	   form.action = "<%=request.getContextPath()%>/mx/system/department/saveAdd";
       </c:otherwise>
	   </c:choose>
	   form.submit();
   }

   function saveAjax(){
        var form = document.getElementById("iForm");
	    if(form.name.value == ''){
		    alert("部门名称不能为空！");
		    form.newPwd.focus();
		    return;
	    }

	<c:choose>
	   <c:when test="${!empty department}">
	   var link = "<%=request.getContextPath()%>/mx/system/department/saveModify";
	   </c:when>
	   <c:otherwise>
	   var link = "<%=request.getContextPath()%>/mx/system/department/saveAdd";
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
	src="<%=request.getContextPath()%>/images/window.png" alt="编辑部门信息">&nbsp;
编辑部门信息</div>
<br>
<form id="iForm" name="iForm">
<c:if test="${!empty department}">
<input type="hidden" id="deptId" name="deptId" value="${department.id}">
 </c:if>
  <table width="95%" align="center" border="0" cellspacing="0" cellpadding="5">
	  <tr>
        <td class="input-box2" valign="top">上级部门</td>
        <td>
		   <select id="parent" name="parent" style="width:160px; height:24px;">
		    <option value="0">/</option>
			<c:forEach items="${treeList}" var="tree">
			 <c:if test="${!empty tree.department}">
			  <option value="${tree.department.nodeId}">
			  <c:forEach begin="1" end="${tree.deep}" step="1">&nbsp;&nbsp;&nbsp;&nbsp;</c:forEach>${tree.department.name}
			  </option>
			 </c:if>
			</c:forEach>
		   </select>
           <script language="javascript">								
			  document.all.parent.value="${department.parent.nodeId}";	
		   </script>	
	   </td>
      </tr>

      <tr>
        <td width="20%" class="input-box">部门名称*</td>
        <td width="80%">
		  <input name="name" data-bind="value: name" type="text" size="30" class="k-textbox"  datatype="string" nullable="no" maxsize="20" chname="部门名称" style=" width:240px;">
        </td>
      </tr>

      <tr>
        <td class="input-box2" valign="top">部门代码*</td>
        <td>
		<input name="code" data-bind="value: code" type="text" size="30" class="k-textbox"  datatype="string" nullable="no" maxsize="20" chname="部门代码" style=" width:240px;">
		</td>
      </tr>

	  <tr>
        <td class="input-box2" valign="top">编码</td>
        <td>
		<input name="no" data-bind="value: no" type="text" size="30" class="k-textbox"  datatype="string" nullable="no" maxsize="20" chname="编码" style=" width:240px;">
		</td>
      </tr>

	  <tr>
        <td class="input-box2" valign="top">部门区分</td>
        <td>
		<input name="code2" data-bind="value: code2" type="text" size="30" class="k-textbox"  datatype="string" nullable="no" maxsize="20" chname="部门区分" style=" width:240px;">
		</td>
      </tr>
     
      <tr>
        <td class="input-box2" valign="top">部门描述</td>
        <td>
          <textarea id="desc" name="desc" rows="6" cols="46" class="k-textbox" style="height:60px; width:240px;"></textarea>        
		</td>
      </tr>
	 
	  <tr>
        <td class="input-box2" valign="top">部门层级</td>
        <td>
		    <kendo:dropDownList id="level" name="level" dataTextField="name" dataValueField="code" value="1">
              <kendo:dataSource data="${dictories}"></kendo:dataSource>
            </kendo:dropDownList> 
		     
		    <script type="text/javascript">
		        document.getElementById("level").value="${department.level}";
		    </script>
		</td>
      </tr>

      <tr>
        <td class="input-box2" valign="top">是否有效</td>
        <td>
		 <input type="radio" name="status" id="engine1" class="k-radio" value="0" <c:if test="${department.status==0}">checked</c:if>>
		 <label class="k-radio-label" for="engine1">有效</label>&nbsp;&nbsp;
		 <input type="radio" name="status" id="engine2" class="k-radio" value="1" <c:if test="${department.status==1}">checked</c:if>>
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