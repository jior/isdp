<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.*"%>
<%@ page import="org.apache.commons.lang.*"%>
<%@ page import="com.glaf.isdp.domain.*"%>
<%
        String theme = com.glaf.core.util.RequestUtils.getTheme(request);
        request.setAttribute("theme", theme);
	    StringBuffer bufferx = new StringBuffer();
	    StringBuffer buffery = new StringBuffer();
	    StringBuffer bufferz = new StringBuffer();
 
		List roles = (List)request.getAttribute("roles");
		List selecteds = (List)request.getAttribute("selecteds");
        if(roles != null && roles.size() > 0){
		    for(int j=0;j<roles.size();j++){
				NetRole u = (NetRole) roles.get(j);
				if(selecteds != null && selecteds.contains(u.getId())){
                    buffery.append("\n<option value=\"").append(u.getId()).append("\">")
						   .append("").append(u.getName()).append("")
						   .append("</option>");
				} else {
				    bufferx.append("\n<option value=\"").append(u.getId()).append("\">")
						   .append("").append(u.getName()).append("")
						   .append("</option>");
				}
			}
		}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Layout</title>
<%@ include file="/WEB-INF/views/inc/header.jsp"%> 
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/easyui/themes/${theme}/easyui.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/css/icons.css">
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
    var contextPath = "${contextPath}";

	function formatter1(value,row,index){
        if(value =='1'){
           return "是";
		 }
		   return "否";
	}

	function formatter2(value,row,index){
        if(value =='0'){
            return "使用中";
		}
		   return "停用";
	}

	function styler1(value,row,index){
		if(value =='1'){
            return 'color:#ffee00;color:green;';
		}
	}

	function switchRole(){
        var isSystem = $('[id=isSystem]:checkbox').attr('checked');
		if(isSystem){
			$('#roleTable').hide();
		} else {
            $('#roleTable').show();
		}
	}

  $(function(){
	//移到右边
	$('#add').click(function() {
	//获取选中的选项，删除并追加给对方
		$('#noselected option:selected').appendTo('#selected');
	});
	//移到左边
	$('#remove').click(function() {
		$('#selected option:selected').appendTo('#noselected');
	});
	//全部移到右边
	$('#add_all').click(function() {
		//获取全部的选项,删除并追加给对方
		$('#noselected option').appendTo('#selected');
	});
	//全部移到左边
	$('#remove_all').click(function() {
		$('#selected option').appendTo('#noselected');
	});
	//双击选项
	$('#noselected').dblclick(function(){ //绑定双击事件
		//获取全部的选项,删除并追加给对方
		$("option:selected",this).appendTo('#selected'); //追加给对方
	});
	//双击选项
	$('#selected').dblclick(function(){
	   $("option:selected",this).appendTo('#noselected');
	});
});

</script>
</head>
<body>  
<div style="margin:0;"></div>  
  
<div class="easyui-layout" data-options="fit:true">  
    <div data-options="region:'center'">  
        <div class="easyui-layout" data-options="fit:true">  
		<div data-options="region:'center',border:false">
		 <div style="background:#fafafa;padding:2px;border:1px solid #ddd;font-size:12px"> 
		  <b>用户信息</b>
	      <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-ok'" >确定</a>  
	      <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-no'">取消</a>	
         </div>  
		<form id="iForm" name="iForm">
		<table>
		<tr>
		   <td width="50%"  valign="top">
			   <table>
				<tr>
				<td width="30%">帐号:</td>
				<td width="70%">
				<input type="text" id="actorId" name="actorId" value="${user.actorId}" class="x-text">
				</td>
			   </tr>
			   <tr>
				<td width="30%">用户名:</td>
				<td width="70%">
				<input type="text" id="name" name="name" value="${user.name}" class="x-text">
				</td>
			   </tr>
			  
			   <tr>
				<td>创建日期:</td>
				<td><input type="text" id="createDate" name="createDate"  readonly class="x-text easyui-datebox "
						   value="<fmt:formatDate value="${user.createDate}" pattern="yyyy-MM-dd HH:mm" />">
				</td>
			   </tr>
			   <tr>
				<td>失效日期:</td>
				<td><input type="text" id="etime" name="etime" class="x-text easyui-datebox "
						   value="<fmt:formatDate value="${user.etime}" pattern="yyyy-MM-dd HH:mm" />">
				</td>
			   </tr>

			   <tr>
				<td>电子邮件:</td>
				<td><input type="text" id="mail" name="mail" value="${user.mail}" class="x-text"></td>
			   </tr>
			   <tr>
				<td>手机号码:</td>
				<td><input type="text" id="mobile" name="mobile" value="${user.mobile}" class="x-text"></td>
			   </tr>

			   <tr>
				<td>系统管理员:</td>
				<td>
				<input type="checkbox" id="isSystem" name="isSystem" value="${user.isSystem}"
					   onclick="javascript:switchRole();"
					   <c:if test="${user.isSystem == '1'}">checked</c:if> >

				</td>
			   </tr>
			   <tr>
				<td>全部WBS权限:</td>
				<td><input type="checkbox"  id="intallwbs" name="intallwbs" value="${user.intallwbs}"
						   <c:if test="${user.intallwbs == '1'}">checked</c:if>></td>
			   </tr>
			   <tr>
				<td>远程用户:</td>
				<td>
				<input type="checkbox"  id="intRemote" name="intRemote" value="${user.intRemote}"
					   <c:if test="${user.intRemote == '1'}">checked</c:if>>
				</td>
			   </tr>

			   <tr>
				<td>虚拟用户:</td>
				<td><input type="checkbox" id="intVirtual" name="intVirtual" value="${user.intVirtual}"
					 <c:if test="${user.intVirtual == '1'}">checked</c:if>></td>
			   </tr>
			   <tr>
				<td>停用帐号:</td>
				<td><input type="checkbox" id="status" name="status" value="${user.status}"
				<c:if test="${user.status == '1'}">checked</c:if>></td>
			   </tr>
			   </table>
		   </td>
		   <td width="50%" valign="top">
			   <table>    
			   <tr>
				<td width="35%"></td>
				<td >
				<input type="checkbox" id="isBind" name="isBind" value="${user.isBind}" <c:if test="${user.isBind == '1'}">checked</c:if>>用户在指定计算机才能登陆
				</td>	
			   </tr>
			   <tr>
				<td width="35%" >计算机名:</td>
				<td >
				<textarea id="computerId" name="computerId" rows="6" cols="40" class="x-textarea" >${user.computerId}</textarea>
				</td>
			   </tr>
			   <tr>
				<td width="35%" >集成系统用户:</td>
				<td >
					<textarea  rows="6" cols="40" class="x-textarea"></textarea>
				</td>
			   </tr>
			  </table>
		   </td>
		  </tr>
		  <tr>
		   <td width="100%" colspan="2">
			   <table id="roleTable">
			   <tr>
			   <td width="40%"  valign="top" align="center">
				  <br>可选角色<br>
				  <select class="list" id="noselected" name="noselected" 
					style="width: 200px; height: 240px;" multiple="multiple" size="12"
					>
					<%=bufferx.toString()%> 
				</select>
			   </td>
			   <td width="20%"  valign="middle" align="center">
				<br> 
				   <input id="add" name="add" value="添加->  "  class="button" type="button">
				<br><br>  
				   <input id="add_all" name="add_all" value="添加->>"  class="button" type="button">
				<br><br> 
				<input id="remove" name="remove" value="  <-删除" class="button" type="button">
				<br><br> 
				<input id="remove_all" name="remove_all" value="<<-删除" class="button" type="button">
			   </td>
			   <td width="40%" align="center">
				   <br>已选角色<br>
				   <select id="selected" name="selected" class="list"
					style="width: 200px; height: 240px;" multiple="multiple" size="12">
					<%=buffery.toString()%> 
				</select>
			   </td>
			  </tr>
			  </table>
		  </td>
		  </tr>
		  </table>
		 </form>
	   </div>  
   </div>  
</div>   
</body>  
</html>  
<!--end of isdp/sys/user/edit.jsp-->