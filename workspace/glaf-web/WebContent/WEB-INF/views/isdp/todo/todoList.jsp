<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
    String taskType = request.getParameter("taskType");
	if(taskType == null || taskType.trim().length() == 0){
		taskType="RN";
	}
	String theme = com.glaf.core.util.RequestUtils.getTheme(request);
	request.setAttribute("theme", theme);
%>
 
  <table  width="99%" border="0" cellspacing="1" cellpadding="0" class="todo-list-box" >
    
	<c:forEach items="${tasks}" var="task">
		<tr>
			<td width="75%" align="left" class="todo-text" >
			<img src="${contextPath}/images/dot_icon.gif">&nbsp;
			 <a href="${contextPath}">${task.indexName}</a>
			</td>
			<td width="25%" align="center"  class="todo-text">&nbsp;
			  <a href="${contextPath}">查看流程</a>&nbsp;
			  <a href="${contextPath}/mx/isdp/wbs/check/list?activityId=${task.activityId}"
			    target="_blank">查看WBS</a>&nbsp;
			</td>
		</tr>
	</c:forEach>
  
  </table>
 <!--end of isdp/todo/todoList.jsp-->