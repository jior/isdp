<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String theme = com.glaf.core.util.RequestUtils.getTheme(request);
request.setAttribute("theme", theme);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Layout</title>
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/easyui/themes/${theme}/easyui.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/icons/styles.css">
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript">
 
      $(function(){
			$('#wbsTreeGrid').treegrid({
				width:700,
				height:250,//注意,高度太大或太小都会导致树节点换行
				nowrap: true,
				//rownumbers: true,
				//showFooter:true,
				striped:true,
				animate:true,
				collapsible:true,
				collapseAll:false,
				fitColumns:true,
				fit:true,
				url:'${contextPath}/rs/isdp/datatable/treeJson?moduleId=${moduleId}',
				idField:'indexId',
				treeField:'name',
				rowStyler:function(row){
					if (row.cell2 > 1){
						return 'background:#ff0000;color:#fff';
					}
				},
				onClickRow: onTreeGridClick,
				columns:[[
					<c:forEach items="${fields}" var="f">
	                {field:'${f.dname}',title:'${f.fname}',width:${f.listweigth},align:'${f.align}'},
					</c:forEach>
					{field:'funKey',title:'功能键',width:90,align:'center'}
				]]
			});

        });
			 

		function finishFormatter(value,row,index){
            if(value==0){
				return "未开始";
			} else if(value==1){
				return "进行中";
			} else if(value==2){
				return "完成";
			}
			return "";
		}

		function typeFormatter(value,row,index){
			if(value==2){
				return "任务";
			} else if(value==3){
				return "流程";
			} else if(value==4){
				return "人工活动";
			}
			return "";
		}

		function onTreeGridClick(row){
             //alert("点击了\n"+row.indexName+"\nid="+row.indexId);
		}


		function loadData(row, url){
		  $.post(url,{qq:'mike'},function(data){
		      //var text = JSON.stringify(data); 
              //alert(text);
			  //$('#wbsTreeGrid').datagrid('loadData', data);
			 if(data.length > 0 ){
			   var node = $('#wbsTreeGrid').treegrid('getSelected');
			   $('#wbsTreeGrid').treegrid('append',{
	              parent: node.indexId,  // the node has a 'id' value that defined through 'idField' property
				  data: data
		       });
			 } else {
				 //alert(row.indexName+"已经是叶节点了.");
			 }
		  },'json');
	  }

	  function expandAll(){
		   $('#wbsTreeGrid').treegrid('expandAll');
	  }

	  function collapseAll(){
		   $('#wbsTreeGrid').treegrid('collapseAll');
	  }

</script>
</head>
<body>  
<div style="margin:0;"></div>  
<div  style="background:#fafafa;padding:2px;border:1px solid #ddd;font-size:12px">
<a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-view'">查看</a>
<a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-add'">同级新增</a>
<a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-add'">下级新增</a>   
<a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-edit'">修改</a>  
<a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-remove'">删除</a> 
<a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-search'">查找</a>
<!-- <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-expand'"
   onclick="javascript:expandAll();">全部展开</a>
<a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-collapse'"
   onclick="javascript:collapseAll();">全部收缩</a> -->
</div>  
<table id="wbsTreeGrid"></table>      


</body>  
</html>  
<!--end of isdp/inventory/list.jsp-->