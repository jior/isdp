<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ page import="java.util.*"%>
<%@ page import="com.glaf.base.modules.*"%>
<%@ page import="com.glaf.base.modules.sys.model.*"%>
<%@ page import="com.glaf.base.utils.*"%>
<%@ page import="com.glaf.core.util.DateUtils"%>
<%@ page import="com.glaf.core.util.RequestUtils"%>
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
<title>用户管理</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/themes/<%=com.glaf.core.util.RequestUtils.getTheme(request)%>/site.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery.form.js"></script> 
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
	  document.all.btn_role.disabled=false;
	  document.all.btn_reset_pwd.disabled=false;
	}else{
	  document.all.btn_modify.disabled=true;
	  document.all.btn_reset_pwd.disabled=true;
	  document.all.btn_role.disabled=true;
	}
  }else{
    document.all.btn_del.disabled=true;
	document.all.btn_modify.disabled=true;
	document.all.btn_reset_pwd.disabled=true;
	document.all.btn_role.disabled=true;
  }
}

function add(){
  var url="user/prepareAdd?parent=0";
  var link = "<%=request.getContextPath()%>/mx/sys/"+url;
  var width=480;
  var height=450;
  var scroll="no";
  openWindow(link, width, height, scroll);
  //art.dialog.open(link, { height: height, width: width, title: "添加用户", lock: true, scrollbars:"no" }, false);
}
function modify(form){
  var id =0;
  for (var i=0;i<form.id.length;i++) {
    var e = form.id[i];
    if (e.checked){
	  id=e.value;
	}     
  }
  var url="user/prepareModify?id="+id;
  var link = "<%=request.getContextPath()%>/mx/sys/"+url;
  var width=480;
  var height=450;
  var scroll="no";
  openWindow(link, width, height, scroll);
  //art.dialog.open(link, { height: height, width: width, title: "修改用户", lock: true, scrollbars:"no" }, false);
}

function editRow(id){
  var link = "<%=request.getContextPath()%>/mx/sys/user/prepareModify?id="+id;
  var width=480;
  var height=450;
  var scroll="no";
  openWindow(link, width, height, scroll);
  //art.dialog.open(link, { height: height, width: width, title: "修改用户", lock: true, scrollbars:"no" }, false);
}

function resetPwd(form){
  var id =0;
  for (var i=0;i<form.id.length;i++) {
    var e = form.id[i];
    if (e.checked){
	  id=e.value;
	}     
  }
  var url="user/prepareResetPwd?id="+id;
  var link = "<%=request.getContextPath()%>/mx/sys/"+url;
  var width=450;
  var height=300;
  var scroll="no";
  openWindow(link, width, height, scroll);
  //art.dialog.open(link, { height: height, width: width, title: "重置用户密码", lock: true, scrollbars:"no" }, false);
}

function changePwd(id){
  var link = "<%=request.getContextPath()%>/mx/sys/user/prepareResetPwd?id="+id;
  var width=450;
  var height=300;
  var scroll="no";
  openWindow(link, width, height, scroll);
  //art.dialog.open(link, { height: height, width: width, title: "重置用户密码", lock: true, scrollbars:"no" }, false);
}


function del(){
  var form = document.all.GenericForm;
  if(confirmDelete(form)){
    form.target="hiddenFrame";
    form.action="<%=request.getContextPath()%>/mx/sys/user/batchDelete";
	form.submit();
  }
}

function roles(form){
  var id =0;
  for (var i=0;i<form.id.length;i++) {
    var e = form.id[i];
    if (e.checked){
	  id=e.value;
	}     
  }
  var link = "<%=request.getContextPath()%>/mx/sys/user/showRole?actorId="+id;
  var width=550;
  var height=420;
  var scroll="yes";
  openWindow(link, width, height, scroll);
  //art.dialog.open(link, { height: height, width: width, title: "用户角色", lock: true, scrollbars:"no" }, false);
}

function editUserRole(id){
  var link = "<%=request.getContextPath()%>/mx/sys/user/showRole?actorId="+id;
  var width=550;
  var height=420;
  var scroll="yes";
  openWindow(link, width, height, scroll);
}

function viewUserMenus(id){
  var link = "<%=request.getContextPath()%>/mx/sys/user/showUserMenus?actorId="+id;
  var width=550;
  var height=420;
  var scroll="yes";
  openWindow(link, width, height, scroll);
}
</script>
</head>

<body style="margin-left:5px;">
<div class="nav-title"><span class="Title">用户管理</span>  </div>
<html:form action="${contextPath}/mx/sys/user/batchDelete" method="post" target="_self"> 
<input name="page_no" type="hidden" value="<%=pager.getCurrentPageNo()%>">
<input type="hidden" name="id" value="0">
<table width="100%" border="0" cellspacing="1" cellpadding="0" class="list-box">
  <tr class="list-title"> 
    <td width="5%" align="center"> 
	<input type="checkbox" name="chkall" value="checkbox" onClick="checkAll(this.form, this);checkOperation(this.form)">    
	</td>
    <td width="5%"  align="center">序号</td>
    <td width="8%"  align="center" >帐号</td>
    <td width="10%" align="center" >姓名</td>
    <td width="8%"  align="center" >是否有效</td>
    <td width="8%"  align="center" >创建日期</td>
    <td width="8%"  align="center" >上次登陆时间</td>
	<td width="15%" align="center">功能键</td>
  </tr>
  <%
int i=0;
if(list!=null){
  Iterator iter=list.iterator();   
  while(iter.hasNext()){
    SysUser bean=(SysUser)iter.next();
%>
  <tr <%=i%2==0?"":"class='list-back'"%>> 
    <td width="5%" class="td-cb"> 
	<input type="checkbox" id="id" name="id" value="<%= RequestUtils.encodeString(bean.getActorId())%>" onClick="checkOperation(this.form)"> 
	</td>
    <td width="5%"  class="td-no"><%=((pager.getCurrentPageNo()-1)*pageSize + i+1)%></td>
    <td width="8%"  class="td-text"><%=bean.getAccount()%>&nbsp;</td>
    <td width="10%" class="td-text"><%=bean.getName()%>&nbsp;</td>
    <td width="8%"  class="td-no"><%=bean.getLocked()==1?"否":"是"%>&nbsp;</td>
    <td width="8%"  class="td-time">
	    <%=DateUtils.getDate(bean.getCreateTime())%>&nbsp;&nbsp;
	</td>
    <td width="8%" class="td-time" align="center" >
	   <%=DateUtils.getDate(bean.getLastLoginTime())%>&nbsp;&nbsp;
	</td>
	<td>&nbsp;
	   <a href="#" onclick="javascript:editRow('<%=RequestUtils.encodeString(bean.getActorId())%>');">修改</a>&nbsp;
	   <a href="#" onclick="javascript:changePwd('<%=RequestUtils.encodeString(bean.getActorId())%>');">重置密码</a>&nbsp;
	   <a href="#" onclick="javascript:editUserRole('<%=RequestUtils.encodeString(bean.getActorId())%>');">角色设置</a>&nbsp;
	   <a href="#" onclick="javascript:viewUserMenus('<%=RequestUtils.encodeString(bean.getActorId())%>');">菜单</a>&nbsp;
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
    <td>&nbsp;</td>
    <td>&nbsp;</td>
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
    <td  width="46%"> 
	  <input name="btn_add" type="button" value="增加" class="button" onClick="javascript:add();"> 
      <input name="btn_del" type="button" value="删除" class="button" onClick="javascript:del();" disabled>
      <input name="btn_modify" type="button" value="修改" class="button" onClick="javascript:modify(this.form);" disabled>
	  <input name="btn_reset_pwd" type="button" value="重置密码" class="button" onClick="javascript:resetPwd(this.form);" disabled>
      <input name="btn_role" type="button" value="角色设置" class="button" onClick="javascript:roles(this.form);" disabled> 
	</td>
    <td  width="54%"> 
      <%
        String params = WebUtil.getQueryString(request);
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
//attachFrame();
</script>
</body>
</html>
