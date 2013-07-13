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
<script type="text/javascript" src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>
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
				url:'${contextPath}/mx/isdp/todo/json?taskType=<%=taskType%>',
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
					{field:'_state_',title:'状态',width:90, align:'left',formatter:stateFormatter},
					{field:'startTime',title:'传入时间',width:90, align:'center'},
					{field:'endTime',title:'送出时间',width:90, align:'center'},
					{field:'timelimit',title:'完成时限',width:90, align:'right',formatter:timelimitFormatter},
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

	  function timelimitFormatter(value){
		  //alert(value);
		  if(value > 0){
			  return value;
		  } 
		  return "";
	  }

	  function searchTask(){
		   var page = $('#page').val();
		   var keyword = $('#keyword').val();
		   var orderCondition = $('#orderCondition').val();
		   jQuery.cookie('isdp_taskList_orderCondition', orderCondition);
		   var url = '${contextPath}/mx/isdp/todo/json?taskType=<%=taskType%>&orderCondition='+orderCondition;
		   url = url+'&keyword='+keyword+'&page='+page;
           jQuery.get(url,{qq:'1'},function(data){
		      //var text = JSON.stringify(data); 
              //alert(text);
			  $('#taskTreeGrid').treegrid('loadData', data);
		  },'json');
	  }

	  function changeTaskOrder(){
		 var orderCondition = $("#orderCondition").val();
		 jQuery.cookie('isdp_taskList_orderCondition', orderCondition);
         location.href="${contextPath}/mx/isdp/todo/taskList?taskType=<%=taskType%>&orderCondition="+orderCondition;
	  }

</script>
</head>
<body class="easyui-layout" style="overflow-y: hidden"  fit="true"   scroll="no">

  <div id="mainPanle" region="center" style="  overflow-y:hidden">
   <div style="background:#fafafa;padding:2px;border:1px solid #ddd;font-size:12px"> 
	<table width="100%" height="99%">
		<tr>
			<td width="25%" align="left"><b>全部事项</b>(共${total}项)</td>
			<td width="75%" align="right">
			
			<input type="text" id="keyword" name="keyword" size="50" class="x-text">&nbsp;
			<input type="button" value="检索" class="button" onclick="javascript:searchTask();">&nbsp;
			查看条件&nbsp;
			<select id="orderCondition" name="orderCondition" onchange="javascript:changeTaskOrder();" >
				<option value="DATE">按时间排序</option>
				<option value="WBS">按WBS排序</option>
			</select>
			<script type="text/javascript">
			    var orderCondition = jQuery.cookie('isdp_taskList_orderCondition');
				jQuery("#orderCondition").val(orderCondition);
			</script>
			&nbsp;&nbsp;
			<select id="page" name="page" onchange="javascript:searchTask();">
			       <option value="1">第1页</option>
			<%
			    Integer total = (Integer)request.getAttribute("total");
				if(total > 0){
					for(int j=2;j<=(total / 100 + 1);j++){
						out.println("\n<option value=\""+j+"\">第"+j+"页</option>");
					}
				}
			%>
			</select>
			&nbsp;&nbsp;
			</td>
		</tr>
	</table>
   </div>  

  <table id="taskTreeGrid"></table>

  </div>
 
</body>
</html>
<!--end of isdp/todo/taskList.jsp-->