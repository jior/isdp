<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ page import="java.util.*"%>
<%@ page import="com.glaf.base.modules.sys.*"%>
<%@ page import="com.glaf.base.modules.sys.model.*"%>
<%@ page import="com.glaf.base.utils.*"%>
<%
    String context = request.getContextPath();
    SysApplication bean=(SysApplication)request.getAttribute("bean");
    List  list = (List)request.getAttribute("parent");
	String theme = com.glaf.core.util.RequestUtils.getTheme(request);
    request.setAttribute("theme", theme);
	request.setAttribute("contextPath", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/themes/<%=com.glaf.core.util.RequestUtils.getTheme(request)%>/site.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/scripts/easyui/themes/${theme}/easyui.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src='<%=context%>/scripts/main.js'></script>
<script type="text/javascript" src='<%=context%>/scripts/verify.js'></script> 
<script language="javascript">

    function changeXDiv(state){
		if(state=='L'){
			jQuery("#urlDir").show();
			jQuery("#divDir").hide();
			document.getElementById("type").value = state;
		}
		if(state=='T'){
			jQuery("#divDir").show();
			jQuery("#urlDir").hide();
			document.getElementById("type").value = state;
		}
	}

	function checkForm(form){
	  if(verifyAll(form)){
		 if(form.parent.value=='<%=bean.getId()%>'){
		   alert("当前模块不能选择为所属模块");
		 } else{
		   return true;
		 }
	  }
	   return false;
	}

	function setValue(obj){
	  obj.value=obj[obj.selectedIndex].value;
	}

    function verifyApplicationForm(form){
	   if(checkForm(form)){
		  var type = document.getElementById("type").value;
		  if("L" == type){
			  var link = document.getElementById("url").value;
			  if(link == ""){
				alert("链接地址是必须的！");
				document.getElementById("url").focus();
				return false;
			  }
		  }

		  if("T" == type){
			  var content = document.getElementById("linkFileName").value;
			  if(content == ""){
				alert("文件是必须的！");
				document.getElementById("linkFileName").focus();
				return false;
			  }
		  }
	    }
    }

</script>
</head>

<body style="margin:10px;">
<html:form action="${contextPath}/mx/sys/application/saveModify" method="post" enctype="multipart/form-data" 
           onsubmit="return verifyApplicationForm(this);"> 
<div class="easyui-panel" title="修改模块" style="width:550px;padding:10px">
<input type="hidden" name="id" value="<%=bean.getId()%>">
<table width="95%" align="center" border="0" cellspacing="0" cellpadding="5">
      <tr>
        <td class="input-box">上级模块</td>
        <td><select name="parent" onChange="javascript:setValue(this);" class="input">
          <%
			if(list!=null){
			  Iterator iter=list.iterator();   
			  while(iter.hasNext()){
				SysTree bean2=(SysTree)iter.next();
			%>
					  <option value="<%=bean2.getId()%>">
					  <%
			for(int i=0;i<bean2.getDeep();i++){
			  out.print("&nbsp;&nbsp;");
			}
			out.print(bean2.getName());
			%>
					  </option>
					  <%    
			  }
			}
			%>
        </select>
		<script language="javascript">
		  document.all.parent.value="<%=bean.getNode().getParentId()%>";	
	    </script>
		</td>
      </tr>
      <tr>
        <td class="input-box">名　　称*</td>
        <td><input name="name" type="text" class="input easyui-validatebox" value="<%=bean.getName()%>" size="35" datatype="string" nullable="no" maxsize="20" chname="名称" data-options="required:true"></td>
      </tr>
	  <tr>
        <td class="input-box">权限编码</td>
        <td><input name="code" type="text" value="<%=bean.getCode()!=null?bean.getCode():""%>" size="35" class="input easyui-validatebox" datatype="string" nullable="yes" maxsize="50" chname="代码"></td>
      </tr>
      <tr>
        <td class="input-box2" valign="top">描　　述</td>
        <td><textarea name="desc" cols="38" rows="6" class="input-multi" datatype="string" nullable="yes" maxsize="100" chname="描述"><%=bean.getDesc() != null ? bean.getDesc() : ""%></textarea></td>
      </tr>
	  <tr>
		<td width="30%" align="left" valign="top">链接类型</td>
		<td width="70%" align="left" valign="top" >  
			<input id="type" name="type" type="radio" value="L" onclick="javascript:changeXDiv('L');" 
			<c:if test="${bean.linkType == 'L'}">checked</c:if> />链接地址
			<input id="type" name="type" type="radio" value="T" onclick="javascript:changeXDiv('T');" 
			<c:if test="${bean.linkType == 'T'}">checked</c:if> />链接文件
			<br>
			<div id="urlDir" style="display:block;">
		      <textarea  id="url" name="url" cols="38" rows="5" class="input-multi" datatype="string" nullable="yes" maxsize="100" chname="链接"><%=bean.getUrl() != null ? bean.getUrl() :""%></textarea>
			</div>
			<div id="divDir" style="display:none;">
		        <input type="file" id="linkFileName" name="linkFileName"  class="input " size="35">
				<c:if test="${bean.linkType == 'T'}">
				<br><br>如需更换链接文件，请重新上传。
                </c:if>
			</div>
		</td>
	</tr>
      <tr>
        <td class="input-box2" valign="top">是否弹出窗</td>
        <td>
          <input type="radio" name="showMenu" value="2" <%=bean.getShowMenu()==2?"checked":""%>>是
		  <input type="radio" name="showMenu" value="1" <%=bean.getShowMenu()!=2?"checked":""%>>否
		  </td>
      </tr>
	  <tr>
        <td class="input-box2" valign="top">是否有效</td>
        <td>
		  <input type="radio" name="locked" value="0" <%=bean.getLocked()==0?"checked":""%>>是
          <input type="radio" name="locked" value="1" <%=bean.getLocked()==1?"checked":""%>>否
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center" valign="bottom" height="30">&nbsp;
              <input name="btn_save" type="submit" value="保存" class="button">
		</td>
      </tr>
    </table>
</div>
</html:form>
<script type="text/javascript">
    <c:if test="${bean.linkType == 'T'}">
	    changeXDiv("${bean.linkType}");
    </c:if>
</script>
</body>
</html>
