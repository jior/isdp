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
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>待办任务</title>
<link href="${contextPath}/styles/default.css" rel="stylesheet" type="text/css" />
<link href="${contextPath}/styles/styles.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/easyui/themes/${theme}/easyui.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/icons/styles.css">
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/jquery/jquery.cookie.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript">
      $(function(){
			$('#taskTreeGrid').treegrid({
				width:700,
				height:175,
				//nowrap: false,
				//rownumbers: true,
				//showFooter:true,
				striped:true,
				animate:true,
				collapsible:false,
				fitColumns:true,
				fit:true,
				url:'${contextPath}/mx/isdp/todo/json?taskType=RN',
				idField:'indexId',
				treeField:'text',
				rowStyler:function(row){
					if (row.parentId == -1){
						return 'background:#82a0ff;color:#fff';
					}
				},
				onClickRow: onTreeGridClick,
				onClickCell: onMyClickCell,
				onDblClickCell:onMyDblClickCell,
				columns:[[
	                {field:'text',title:'主题',width:580},
					{field:'startTime',title:'传入时间',width:90, align:'center'},
					{field:'wbs',title:'查看WBS',width:90, align:'center',formatter:wbsFormatter},
					{field:'process',title:'查看流程',width:90, align:'center',formatter:processFormatter}
				]]
			});
				 
      });

	  function onTreeGridClick(row){
		   //alert("点击了\n"+row.indexName+"\nid="+row.indexId);
	  }

	  function onMyDblClickCell(index,field,value){
		   //var text = JSON.stringify(field); 
           //alert("点击了\n"+index+"\nfield="+text+"\nvalue="+value);
		   if(index == "process"){

		   } else if(index == "wbs"){
              window.open("${contextPath}/mx/isdp/wbs/check/list?activityId="+field.activityId);
		   }
	  }

	  function onMyClickCell(index,field,value){
		   if(index == "process"){

		   } else if(index == "wbs"){
              window.open("${contextPath}/mx/isdp/wbs/check/list?activityId="+field.activityId);
		   }
	  }

	  function openChkWbs(activityId){
		    window.open("${contextPath}/mx/isdp/wbs/check/list?activityId="+activityId)
	  }

	  function processFormatter(value){
		  return "<span style='text-decoration:underline;color:#0066ff;cursor:pointer;'>查看流程</span>";
	  }

	  function wbsFormatter(value){
		   // return '<a href="#" onclick="javascript:openChkWbs('+value+');">查看WBS</a>' ;
		   return "<span style='text-decoration:underline;color:#0066ff;cursor:pointer;'>查看WBS</span>";
	  }

	  function stateFormatter(value){
		  //alert(value);
		  if(value == 0){
			  return "待办";
		  }else if(value == 1){
			  return "已办";
		  }
		  return "";
	  }


</script>
</head>
<body scroll="no">

  <table id="taskTreeGrid"></table>
 
</body>
</html>
<!--end of isdp/todo/todoList2.jsp-->