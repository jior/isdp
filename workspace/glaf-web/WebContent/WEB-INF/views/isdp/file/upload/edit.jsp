<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.glaf.isdp.domain.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	List columns = (List) request.getAttribute("fields");
	String theme = com.glaf.core.util.RequestUtils.getTheme(request);
	request.setAttribute("theme", theme);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Layout</title>
<%@ include file="/WEB-INF/views/tm/header.jsp"%>
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/easyui/themes/${theme}/easyui.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/icons/styles.css">
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/jquery/jquery.form.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>       
 
</head>
<body>
	<div style="margin: 0;"></div>
	<div class="easyui-layout" data-options="fit:true">
		<div id="div_main_area" data-options="region:'center',split:true,border:true" style="height: 90%">
			<div style="background: #fafafa; padding: 2px; border: 0px solid #ddd; font-size: 12px">
				<b>原文录入</b> 
				<a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-save'">保存</a>
                <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-add'">著录项</a> 
                <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-edit'">电子原文</a>  	 
			</div>
 
			<div style="padding: 10px" title="文件著录">
			  <form id="iForm" name="iForm">
				<div id="detailTable">
					<table id="detail" class="content-block" cellspacing="4" cellpadding="1" border="0">
                     <tbody>
                     	<tr>
                     	<td width="12%" class="table-title">文件题名</td>
                     	<td width="88%" class="table-content" colspan="3">
						<textarea id="tname" name="tname" style="height: 50px; width: 650px;"  class="x-textarea"></textarea>
                     	</td>
                     	</tr>
                     	<%
                     	if (columns != null && !columns.isEmpty()) {
                     		 int index = 0;
                     		 Iterator iter = columns.iterator();
                     		 while (iter.hasNext()) {
							 FieldInterface col = (FieldInterface) iter.next();
							 if ("tname".equals(col.getDname())) {
								 if(col.getValue() != null){
								    out.println("<script type=\"text/javascript\">");
								    out.println("    $('#tname').val('"+col.getValue()+"');");
								    out.println("</script>");
								 }
								continue;
							 }
							 pageContext.setAttribute("col", col);
							 if (index % 2 == 0) {
								out.println("\n	    <tr>");
							 }
                     	%>
                     	<td width="10%" class="table-title" align="left"><%=col.getFname()%></td>
                     	<td width="40%" class="table-content" align="left">
						<c:choose>
                     	<c:when test="${col.dtype == 'Integer' or col.dtype == 'i4'}">
                          <input id="<%=col.getDname()%>" name="<%=col.getDname()%>" value="${col.value}"
                     	         type="text" size="40" class="easyui-numberbox x-text span3" />
                     	</c:when>
                     	<c:when test="${col.dtype == 'Long' or col.dtype == 'i8'}">
                          <input id="<%=col.getDname()%>" name="<%=col.getDname()%>" value="${col.value}"
                           	     type="text" size="40" class="easyui-numberbox x-text span3" />
                     	</c:when>
                     	<c:when test="${col.dtype == 'Double' or col.dtype == 'r8'}">
                          <input id="<%=col.getDname()%>" name="<%=col.getDname()%>" value="${col.value}"
                     	         type="text" size="40" class="easyui-numberbox x-text span3" />
                     	</c:when>
                     	<c:when test="${col.dtype == 'Date' or col.dtype == 'datetime'}">
                          <input id="<%=col.getDname()%>" name="<%=col.getDname()%>" value="${col.value}"
                     	         type="text" size="20" class=" x-text span3" />
                     	</c:when>
                     	<c:otherwise>
                          <c:choose>
                     	   <c:when test="${col.intype == 'cmb'}">
                     		<select id="<%=col.getDname()%>"
                     			name="<%=col.getDname()%>" class="span2" value="${col.value}">
                     			<c:forEach items="${col.dataItems}" var="item">
                                          <option value="${item.list}">${item.list}</option>
                     			</c:forEach>
                     		</select>
                     	   </c:when>
                     	   <c:otherwise>
                     		<input id="<%=col.getDname()%>" name="<%=col.getDname()%>" value="${col.value}"
                     			type="text" size="40" class="x-text span3" />
                     	   </c:otherwise>
                          </c:choose>
                     	</c:otherwise>
                     	</c:choose>
						</td>
                     	<%
                     		index++;

							 if (index > 0 && index % 2 == 0) {
								out.println("\n	    </tr>");
							 }

                     		}

                     		if (index > 0 && index % 2 != 0) {
                     	%>
                     	<td width="10%" class="table-title">&nbsp;</td>
                     	<td width="40%" class="table-content">&nbsp;</td>
                     	</tr>
                     	<%
                     		}
                     	}
                     	%>
                     	<tr>
                     		<td class="table-content" colspan="4">&nbsp;</td>
                     	</tr>
                     </tbody>
					</table>
				</div>
			  </form>
		</div>
	</div>

</body>
</html>
<!--end of isdp/file/upload/edit.jsp-->