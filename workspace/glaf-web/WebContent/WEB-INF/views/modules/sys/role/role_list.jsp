<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ page import="java.util.*"%>
<%@ page import="com.glaf.base.modules.*"%>
<%@ page import="com.glaf.base.modules.sys.model.*"%>
<%@ page import="com.glaf.base.utils.*"%>
<%
String context = request.getContextPath();
int pageSize=Constants.PAGE_SIZE;
com.glaf.core.util.PageResult pager=(com.glaf.core.util.PageResult)request.getAttribute("pager");
List list = pager.getResults();
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/themes/<%=com.glaf.core.util.RequestUtils.getTheme(request)%>/site.css">
<link href="<%=request.getContextPath()%>/scripts/artDialog/skins/default.css" rel="stylesheet" />
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery.form.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/artDialog/artDialog.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/artDialog/plugins/iframeTools.js"></script>
<script language="javascript" src='<%=context%>/scripts/verify.js'></script>
<script language="javascript" src='<%=context%>/scripts/main.js'></script>

<script language="javascript">
var num=0;
function checkOperation(form){
  num = getCheckedBoxNum(form,"id");
  if(num>0){
    document.all.btn_del.disabled=false;
	if(num==1){
	  document.all.btn_modify.disabled=false;
	  document.all.btn_ru.disabled=false;
	  document.all.btn_rm.disabled=false;
	}else{
	  document.all.btn_modify.disabled=true;
	  document.all.btn_ru.disabled=true;
	  document.all.btn_rm.disabled=true;
	}
  }else{
    document.all.btn_del.disabled=true;
	document.all.btn_modify.disabled=true;
	document.all.btn_ru.disabled=true;
	document.all.btn_rm.disabled=true;
  }
}
function add(){
  var url="role/prepareAdd";
  var link = "<%=request.getContextPath()%>/mx/sys/"+url;
  var width=520;
  var height=320;
  var scroll="no";
  //openWindow(url, width, height, scroll);
  art.dialog.open(link, { height: height, width: width, title: "添加角色", lock: false, scrollbars:"no" }, false);
}
function modify(form){
  var id =0;
  for (var i=0;i<form.id.length;i++) {
    var e = form.id[i];
    if (e.checked){
	  id=e.value;
	}     
  }
  var url="role/prepareModify?id="+id;
  var link = "<%=request.getContextPath()%>/mx/sys/"+url;
  var width=520;
  var height=320;
  var scroll="no";
  //openWindow(url, width, height, scroll);
  art.dialog.open(link, { height: height, width: width, title: "修改角色", scrollbars:"no" , lock: false });
}

function editRow(id){
  var url="role/prepareModify?id="+id;
  var link = "<%=request.getContextPath()%>/mx/sys/"+url;
  var width=520;
  var height=320;
  var scroll="no";
  //openWindow(url, width, height, scroll);
  art.dialog.open(link, { height: height, width: width, title: "修改角色", scrollbars:"no" , lock: false });
}

function roleUsers(form){
  var id =0;
  for (var i=0;i<form.id.length;i++) {
    var e = form.id[i];
    if (e.checked){
	  id=e.value;
	}     
  }
  var link = "<%=request.getContextPath()%>/mx/sys/role/roleUsers?id="+id;
  var width=520;
  var height=425;
  var scroll="no";
  //openWindow(url, width, height, scroll);
  art.dialog.open(link, { height: height, width: width, title: "角色用户", scrollbars:"no" , lock: false });
}

function editRoleUsers(id){
  var link = "<%=request.getContextPath()%>/mx/sys/role/roleUsers?id="+id;
  var width=520;
  var height=425;
  var scroll="no";
  //openWindow(url, width, height, scroll);
  art.dialog.open(link, { height: height, width: width, title: "角色用户", scrollbars:"no" , lock: false });
}


function roleMenus(form){
  var id =0;
  for (var i=0;i<form.id.length;i++) {
    var e = form.id[i];
    if (e.checked){
	  id=e.value;
	}     
  }
  var link = "<%=request.getContextPath()%>/mx/sys/role/roleMenus?roleId="+id;
  var width=520;
  var height=425;
  var scroll="no";
  //openWindow(url, width, height, scroll);
  art.dialog.open(link, { height: height, width: width, title: "角色菜单", scrollbars:"no" , lock: false });
}

function editRoleMenus(id){
  var link = "<%=request.getContextPath()%>/mx/sys/role/roleMenus?roleId="+id;
  var width=520;
  var height=425;
  var scroll="no";
  //openWindow(url, width, height, scroll);
  art.dialog.open(link, { height: height, width: width, title: "角色菜单", scrollbars:"no" , lock: false });
}

function del(){
  var form = document.all.command;
  if(confirmDelete(form)){
    form.target="hiddenFrame";
    form.action="role/batchDelete";
	form.submit();
  }
}

function sort(id, operate){  
  //SysRoleAjaxService.sort(id, operate, {callback:function (){reloadPage();}});
    	jQuery.ajax({
			type: "POST",
			url: '<%=request.getContextPath()%>/mx/sys/role/sort?id='+id+'&operate='+operate,
			dataType:  'json',
				error: function(data){
					alert('服务器处理错误！');
				},
				success: function(data){
					   location.reload();
				 }
		});
}

function queryForm(){
    var iForm = document.all.iForm;
	//document.getElementById("nameLike_encode").value="";
	//document.getElementById("codeLike_encode").value="";
	iForm.method="post";
    iForm.action="<%=request.getContextPath()%>/mx/sys/role/showList?_rq_=1";
	iForm.submit();
}

</script>
</head>

<body style="padding-top:10px;padding-left:2px;padding-right:20px;">
<html:form id="iForm" name="iForm" action="${contextPath}/mx/sys/role/batchDelete" method="post" target="_self"> 
<input name="page_no" type="hidden" value="<%=pager.getCurrentPageNo()%>">
<input type="hidden" name="id" value="0">
<div class="nav-title"><span class="Title">角色管理</span>&gt;&gt;角色列表</div>
&nbsp;&nbsp;&nbsp;&nbsp;角色名称：<input type="text" name="nameLike" id="nameLike" size="20" value="${nameLike}" class="input"><input type="hidden" id="nameLike_encode" name="nameLike_encode" value="${nameLike_encode}">
&nbsp;&nbsp;角色代码：<input type="text" name="codeLike" id="codeLike" size="20" value="${codeLike}" class="input">
<input type="hidden" id="codeLike_encode" name="codeLike_encode" value="${codeLike_encode}">
<input name="btn_query" type="button" value="查询" class="button" onClick="javascript:queryForm();"> 
<table width="100%" border="0" cellspacing="1" cellpadding="0" class="list-box">
  <tr class="list-title"> 
    <td width="5%" align="center"> <input type="checkbox" name="chkall" value="checkbox" onClick="checkAll(this.form, this);checkOperation(this.form)">    </td>
    <td width="5%" align="center">序号</td>
    <td width="20%" align="center">角色名称</td>
    <td width="20%" align="center">代码</td>
    <td width="25%" align="center">描述</td>
    <td width="10%" align="center">排序</td>
	<td width="15%" align="center">功能键</td>
  </tr>
  <%
int i=0;
if(list!=null){
  Iterator iter=list.iterator();   
  while(iter.hasNext()){
    SysRole bean=(SysRole)iter.next();
%>
  <tr <%=i%2==0?"":"class='list-back'"%>> 
    <td class="td-cb"> <input type="checkbox" name="id" value="<%=bean.getId()%>" onClick="checkOperation(this.form)">    </td>
    <td class="td-no"><%=((pager.getCurrentPageNo()-1)*pageSize + i+1)%></td>
    <td class="td-text"><%=bean.getName()%>&nbsp; </td>
    <td class="td-text"><%=bean.getCode() != null ? bean.getCode() : "" %></td>
    <td class="td-text"><%=bean.getContent() != null ? bean.getContent() : ""%>&nbsp;</td>
    <td class="td-no"><a href="javascript:sort(<%=bean.getId()%>, 0);" title="上移"><img src="<%=context%>/images/up.gif" border="0" height="13" width="13"></a> <a href="javascript:sort(<%=bean.getId()%>, 1);" title="下移"><img src="<%=context%>/images/down.gif" border="0" height="13" width="13"></a></td>
	<td align="center">&nbsp;
	<a href="#" onclick="javascript:editRow(<%=bean.getId()%>);">修改</a>&nbsp;
	<a href="#" onclick="javascript:editRoleUsers(<%=bean.getId()%>);">用户</a>&nbsp;
	<a href="#" onclick="javascript:editRoleMenus(<%=bean.getId()%>);">菜单</a>&nbsp;
	</td>
  </tr>
  <%
    i++;
  }
}
for(; i<pageSize; i++){
%>
  <tr <%=i%2==0?"":"class='list-back'"%>> 
    <td height="20">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp; </td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
	<td>&nbsp;</td>
  </tr>
<%
}
%>
</table>
<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr> 
    <td width="50%"> <input name="btn_add" type="button" value="增加" class="button" onClick="javascript:add();"> 
      <input name="btn_del" type="button" value="删除" class="button" onClick="javascript:del();" disabled>
      <input name="btn_modify" type="button" value="修改" class="button" onClick="javascript:modify(this.form);" disabled>
	  <input name="btn_ru" type="button" value="角色用户" class="button" onClick="javascript:roleUsers(this.form);" disabled>
	  <input name="btn_rm" type="button" value="角色菜单" class="button" onClick="javascript:roleMenus(this.form);" disabled>
	  </td>
    <td width="50%"> 
      <%
        String params = WebUtil.getQueryString(request);
		System.out.println("params:"+java.net.URLEncoder.encode(params));
      %>
      <jsp:include page="/WEB-INF/views/inc/show_page.jsp" flush="true"> 
              <jsp:param name="total" value="<%=pager.getTotalRecordCount()%>"/>
              <jsp:param name="page_count" value="<%=pager.getTotalPageCount()%>"/>
              <jsp:param name="page_size" value="<%=pageSize%>"/>
              <jsp:param name="page_no" value="<%=pager.getCurrentPageNo()%>"/>
              <jsp:param name="url" value=""/>
			  <jsp:param name="params" value="<%=java.net.URLEncoder.encode(params)%>"/> 
	  </jsp:include> 
	</td>
  </tr>
</table>
</html:form>
<script language="javascript">
attachFrame();
</script> 
</body>
</html>
