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
    List  list = (List)request.getAttribute("parent");
    int parent=ParamUtil.getIntParameter(request, "parent", 0);
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
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/glaf-base.js"></script>
<script type="text/javascript">

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

    function verifyApplicationForm(form){
		if(verifyAll(form)){
		  var type = document.getElementById("type").value;
		  if("L" == type){
			  //var link = document.getElementById("url").value;
			  //if(link == ""){
			  //	alert("链接地址是必须的！");
			  //	document.getElementById("url").focus();
			  //	return false;
			 // }
		  }

		  if("T" == type){
			  var content = document.getElementById("linkFileName").value;
			  if(content == ""){
				//alert("文件是必须的！");
				//document.getElementById("linkFileName").focus();
				//return false;
			  }
		  }
		}
		return true;
    }

  function chooseCellTreedot(formName, elementId, elementName){
    var x_selected =  document.getElementById(elementId);
    var url="<%=request.getContextPath()%>/rs/cell/treedot/choose?formName="+formName+"&elementId="+elementId+"&elementName="+elementName;
    if(x_selected != null && x_selected.value != ""){
	    url = url + "&selecteds="+x_selected.value;
    }
    var x=150;
    var y=50;
    if(is_ie) {
	    x=document.body.scrollLeft+event.clientX-event.offsetX-200;
	    y=document.body.scrollTop+event.clientY-event.offsetY-200;
     }
     openWindow(url,self,x, y, 565, 600);
}


 function chooseTreeProjectInfo(formName, elementId, elementName){
    var x_selected =  document.getElementById("refId1");
    var url="<%=request.getContextPath()%>/rs/treeProjectInfo/choose?formName="+formName+"&elementId="+elementId+"&elementName="+elementName;
    if(x_selected != null && x_selected.value != ""){
	    url = url + "&strfuntion="+x_selected.value;
    }
    var x=150;
    var y=50;
    if(is_ie) {
	    x=document.body.scrollLeft+event.clientX-event.offsetX-200;
	    y=document.body.scrollTop+event.clientY-event.offsetY-200;
     }
     openWindow(url,self,x, y, 565, 600);
}

</script>
</head>
<body style="margin:10px;">
<html:form id="iForm" name="iForm"
           action="${contextPath}/mx/sys/application/saveAdd" method="post" enctype="multipart/form-data"
           onsubmit="return verifyApplicationForm(this);"  > 
<div class="easyui-panel" title="增加模块" style="width:550px;padding:10px">
<input type="hidden" name="parent" value="<%=parent%>">
 <table width="95%" align="center" border="0" cellspacing="0" cellpadding="5">
      <tr>
        <td class="input-box">名　　称*</td>
        <td><input name="name" type="text" size="35" class="input easyui-validatebox" datatype="string" nullable="no" maxsize="20" chname="名称" data-options="required:true"></td>
      </tr>
	  <tr>
        <td class="input-box">编　　码</td>
        <td><input name="code" type="text" size="35" class="input easyui-validatebox" datatype="string" nullable="yes" maxsize="20" chname="代码" ></td>
      </tr>
      <tr>
        <td class="input-box2" valign="top">描　　述</td>
        <td><textarea name="desc" cols="42" rows="4" class="input-multi " datatype="string" nullable="yes" maxsize="100" chname="描述"></textarea></td>
      </tr>

	  <tr>
		<td width="30%" align="left" valign="top">链接类型</td>
		<td width="70%" align="left" valign="top" >  
			<input id="type" name="type" type="radio" value="L" onclick="javascript:changeXDiv('L');" >链接地址
			<input id="type" name="type" type="radio" value="T" onclick="javascript:changeXDiv('T');" >链接文件
			<br>
			<div id="urlDir" style="display:block;">
		      <textarea id="url" name="url" cols="42" rows="4" class="input-multi " datatype="string" nullable="yes" maxsize="100" chname="链接"></textarea>
			</div>
			<div id="divDir" style="display:none;">
		        <input type="file" id="linkFileName" name="linkFileName"  class="input " size="35">
				<br>链接参数<br>
				<textarea id="linkParam" name="linkParam" cols="42" rows="4" class="input-multi " datatype="string" nullable="yes" maxsize="100" chname="链接参数"></textarea>
			</div>
		</td>
	</tr>
 
	<tr>
        <td class="input-box2" valign="top">关联菜单</td>
        <td>
		   <input type="hidden" id="refId1" name="refId1" value="">
           <input type="text" id="refName1" name="refName1" size="35" value="" class="input "
				  onclick="javascript:chooseCellTreedot('iForm', 'refId1', 'refName1');">
		</td>
      </tr>
	  <tr>
        <td class="input-box2" valign="top">关联工程信息</td>
        <td>
           <input type="hidden" id="refId2" name="refId2" value="">
           <input type="text" id="refName2" name="refName2" size="35" value="" class="input "
				  onclick="javascript:chooseTreeProjectInfo('iForm', 'refId2', 'refName2');">
		</td>
      </tr>

    <tr>
        <td class="input-box2" valign="top">是否弹出窗</td>
        <td><span class="fontlist">
          <input type="radio" name="showMenu" value="2">是
          <input type="radio" name="showMenu" value="1" checked>否</span>
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
</body>
</html>
