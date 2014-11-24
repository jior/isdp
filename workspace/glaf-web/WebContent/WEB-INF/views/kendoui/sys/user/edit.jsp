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

   function save(){
       var form = document.getElementById("iForm");
	   form.method="post";
	   <c:choose>
	   <c:when test="${!empty bean}">
	   form.action = "<%=request.getContextPath()%>/mx/system/user/saveModify";
	   </c:when>
	   <c:otherwise>
	   form.action = "<%=request.getContextPath()%>/mx/system/user/saveAdd";
       </c:otherwise>
	   </c:choose>
	   form.submit();
   }
 </script>
</head>
<body style="margin-top:0px;">
<div id="main_content" class="k-content ">
<br>
<div class="x_content_title"><img
	src="<%=request.getContextPath()%>/images/window.png" alt="编辑用户信息">&nbsp;
编辑用户信息</div>
<br>
<form id="iForm" name="iForm">
  <table width="95%" align="center" border="0" cellspacing="0" cellpadding="5">
  <c:choose>
	<c:when test="${!empty bean}">
	  <tr>
        <td width="20%" class="input-box">用户名*</td>
        <td width="80%">
		<label>${bean.actorId}</label>
		<input type="hidden" id="actorId" name="actorId" value="${actorId}">
		</td>
      </tr>
 	</c:when>
	<c:otherwise>
	  <tr>
        <td width="20%" class="input-box">用户名*</td>
        <td width="80%">
		  <input name="actorId" data-bind="value: actorId" type="text" size="30" class="k-textbox"  datatype="string" nullable="no" maxsize="20" chname="用户名">
        </td>
      </tr>
	  <tr>
        <td width="20%" class="input-box">密码*</td>
        <td width="80%">
		  <input name="password" data-bind="value: password" type="password" size="30" class="k-textbox"  datatype="string" nullable="no" maxsize="20" chname="密码">
        </td>
      </tr>
   </c:otherwise>
</c:choose>
     
      <tr>
        <td class="input-box2" valign="top">部　门</td>
        <td>
		   <select id="departmentId" name="departmentId" style="width:160px; height:24px;">
			<c:forEach items="${treeList}" var="tree">
			 <c:if test="${!empty tree.department}">
			  <option value="${tree.department.id}">
			  <c:forEach begin="1" end="${tree.deep}" step="1">&nbsp;&nbsp;&nbsp;&nbsp;</c:forEach>${tree.department.name}
			  </option>
			 </c:if>
			</c:forEach>
		   </select>
           <script language="javascript">								
			  document.all.departmentId.value="${bean.deptId}";	
		   </script>	
	   </td>
      </tr>
      <tr>
        <td class="input-box2" valign="top">姓　名*</td>
        <td>
		<input name="name" data-bind="value: name" type="text" size="30" class="k-textbox"  datatype="string" nullable="no" maxsize="20" chname="姓名">
		</td>
      </tr>
      <tr>
        <td class="input-box2" valign="top">性　别</td>
        <td>
		  <input type="radio" name="gender" id="gender1" class="k-radio" value="0" <c:if test="${bean.status==0}">checked</c:if>>
		 <label class="k-radio-label" for="gender1">男</label>&nbsp;&nbsp;
		 <input type="radio" name="gender" id="gender2" class="k-radio" value="1" <c:if test="${bean.status==1}">checked</c:if>>
		 <label class="k-radio-label" for="gender2">女</label>
		</td>
      </tr>
      <tr>
        <td class="input-box2" valign="top">手　机</td>
        <td>
          <input name="mobile" data-bind="value: mobile" type="text" size="30" class="k-textbox" datatype="string" 
			     nullable="yes" maxsize="12" chname="手机">        
		</td>
      </tr>
      <tr>
        <td class="input-box2" valign="top">邮　件</td>
        <td>
          <input name="email" data-bind="value: email" type="text" size="30" class="k-textbox" datatype="email" 
				 nullable="yes" maxsize="50" chname="邮件">       
		</td>
      </tr>
      <tr>
        <td class="input-box2" valign="top">办公电话</td>
        <td>
          <input name="telephone" data-bind="value: telephone" type="text" size="30" class="k-textbox" datatype="string" 
				 nullable="yes" maxsize="20" chname="办公电话">        
		</td>
      </tr>
	  <!-- <tr>
        <td class="input-box2" valign="top">职　位</td>
        <td>
		    <kendo:dropDownList id="headship" name="headship" dataTextField="name" dataValueField="code" value="1">
              <kendo:dataSource data="${dictories}"></kendo:dataSource>
            </kendo:dropDownList>
		   <script type="text/javascript">
		        document.getElementById("headship").value="${bean.headship}";
		   </script>
		</td>
      </tr> -->
	  <tr>
        <td class="input-box2" valign="top">账户类型</td>
        <td>
		    <kendo:dropDownList id="accountType" name="accountType" dataTextField="name" dataValueField="code" value="1">
              <kendo:dataSource data="${accountTypeDictories}"></kendo:dataSource>
            </kendo:dropDownList> 
		     
		    <script type="text/javascript">
		        document.getElementById("accountType").value="${bean.accountType}";
		    </script>
		</td>
      </tr>
	  
      <tr>
        <td class="input-box2" valign="top">是否有效</td>
        <td>
		 <input type="radio" name="status" id="engine1" class="k-radio" value="0" <c:if test="${bean.status==0}">checked</c:if>>
		 <label class="k-radio-label" for="engine1">有效</label>&nbsp;&nbsp;
		 <input type="radio" name="status" id="engine2" class="k-radio" value="1" <c:if test="${bean.status==1}">checked</c:if>>
		 <label class="k-radio-label" for="engine2">无效</label>
		</td>
      </tr>
 
      <tr>
        <td colspan="2" align="center" valign="bottom" height="30">&nbsp;
		   <div >
			  <button type="button" id="iconButton"  class="k-primary" style="width: 90px" onclick="javascript:save();">保存</button>
		   </div>
	    </td>
      </tr>
    </table>   
</form>
</div>     
</body>
</html>