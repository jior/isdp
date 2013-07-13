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
<%@ include file="/WEB-INF/views/tm/header.jsp"%>
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/easyui/themes/${theme}/easyui.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/icons/styles.css">
<script type="text/javascript" src="${contextPath}/scripts/map.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">

   var treemap = new Map();
 
   $(function(){
	$('#wbsTreeGrid').treegrid({
       width:700,
       height:285,//注意,高度太大或太小都会导致树节点换行
       nowrap: true,
	   striped:true,
       animate:true,
	   fitColumns:true,
       fit:true,
       //rownumbers: true,
       //showFooter:true,
       //collapsible:false,     
       //autoRowHeight:true,
       //resizable:true,
       url:'${contextPath}/rs/isdp/wbs/treegrid',
       idField:'indexId',
       treeField:'text',
       rowStyler:function(row){
       	if (row.cell2 > 1){
       		return 'background:#ff0000;color:#fff';
       	}
       },
       onClickRow: onTreeGridClick,
       columns:[[
	        {field:'text',title:'名称',width:580,align:'left'},
       	    {field:'status',title:'状态',width:90,align:'left'},
       	    {field:'bdate_date',title:'开始时间',width:90,align:'center'},
       	    {field:'edate_date',title:'结束时间',width:90,align:'center'},
       	    {field:'cell1',title:'要填表格',width:60,align:'right'},
       	    {field:'cell2',title:'未填表格',width:60,align:'right'},
       	    {field:'cell3',title:'已填表格',width:60,align:'right'}
       ]]
		});

	$('#nodePropertiesGrid').datagrid({
       url: 'datagrid_data2.json',
       width: 700,
       height: 'auto',
       fitColumns:true,
       fit:true,
       columns:[[
       	{field:'sortNo',title:'序号',width:90,align:'left'},
       	{field:'inttasktype',title:'是否已填',width:120,align:'left'},
       	{field:'num',title:'表格编号',width:150,align:'left'},
       	{field:'dotname',title:'表格名称',width:280,align:'left'}
       ]]
	});

	$('#checkProjectGrid').datagrid({
       title: '检测项目',
       url: 'datagrid_data3.json',
       width: 700,
       height: 'auto',
       fitColumns:true,
       fit:true,
       columns:[[
       	{field:'sortNo',title:'序号',width:90,align:'left'},
       	{field:'content',title:'检测项目',width:180,align:'left'},
       	{field:'chkway',title:'检测频率',width:120,align:'left'},
       	{field:'chkformual',title:'计算公式',width:150,align:'left'},
       	{field:'point',title:'检测点计算',width:90,align:'left'},
       	{field:'f3',title:'施工自检',width:90,align:'left'},
	    {field:'conint',title:'监理抽检',width:90,align:'left'},
       	{field:'filedotNum',title:'表格编号',width:150,align:'left'}
       ]]
	});

 
    $('#executionGrid').treegrid({
       title: '执行情况',
       width:700,
       height:145,
       //nowrap: false,
       //rownumbers: true,
       striped:true,
       animate:true,
       collapsible:false,
       fitColumns:true,
       fit:true,
       url:'${contextPath}/rs/isdp/wbs/executionList',
       idField:'indexId',
       treeField:'text',
       showFooter:true,
       rowStyler:function(row){
       	if (row.cell2 > 1){
       		return 'background:#ff0000;color:#fff';
       	}
       },
       columns:[[
       	{field:'text',title:'名称',width:150,align:'left'},
       	{field:'intfinish',title:'进程',width:90,align:'left', formatter:finishFormatter},
       	{field:'type',title:'类型',width:90,align:'left', formatter:typeFormatter},
       	{field:'rolename',title:'角色',width:120,align:'left'},
       	{field:'limtime',title:'限时(天)',width:90,align:'left'},
	    {field:'username',title:'执行人',width:120,align:'left'},
       	{field:'starttime',title:'开始时间',width:90,align:'left'},
	    {field:'endtime',title:'结束时间',width:90,align:'left'},
       	{field:'useday',title:'耗时(天)',width:90,align:'left'}
       ]]
	});

	$('#txGrid').datagrid({
       title: '任务单列表',
       url: 'datagrid_data4.json',
       width: 700,
       height: 'auto',
       fitColumns:true,
       fit:true,
       columns:[[
       	{field:'sortNo',title:'序号',width:90,align:'left'},
       	{field:'finishint',title:'状态',width:90,align:'left', formatter:finishintFormatter},
       	{field:'ctime',title:'日期',width:90,align:'left'},
       	{field:'name',title:'表格名称',width:350,align:'left'},
       	{field:'f2',title:'页号',width:120,align:'left'}
       ]]
	});

            
	$('#dataLibGrid').datagrid({
       title: '资料列表',
       url: 'datagrid_data4.json',
       width: 700,
       height: 'auto',
       fitColumns:true,
       fit:true,
       columns:[[
       	{field:'listno',title:'序号',width:90,align:'left'},
       	{field:'num',title:'文件题目',width:180,align:'left'},
       	{field:'f1',title:'文件编号',width:150,align:'left'},
       	{field:'f2',title:'文件时间',width:120,align:'left'},
       	{field:'f3',title:'责任者',width:120,align:'left'},
	    {field:'f4',title:'页数',width:120,align:'left'},
       	{field:'f5',title:'主题词',width:90,align:'left'} 
       ]]
	});

	$('#specGrid').datagrid({
       title: '规范列表',
       url: 'datagrid_data4.json',
       width: 700,
       height: 'auto',
       fitColumns:true,
       fit:true,
       columns:[[
       	{field:'listno',title:'序号',width:90,align:'left'},
       	{field:'name',title:'名称',width:380,align:'left'}
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

	function finishintFormatter(value,row,index){
      if(value==0){
       return "未填";
	  } else if(value==1){
       return "已填";
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
	    var url = '${contextPath}/rs/isdp/wbs/treegrid?indexId='+row.indexId;
        loadData(row, url);
		updateExecutionGrid(row);
		updateCheckProjectGrid(row);
		updateNodePropertiesGrid(row);
		updateTxGrid(row);
	}

	function updateExecutionGrid(row){
        var url = '${contextPath}/rs/isdp/wbs/executionList?treepinfoIndexId='+row.indexId;
		$.post(url,{qq:'mike'},function(data){
           $('#executionGrid').treegrid('loadData', data);
            },'json');
	}


	function updateCheckProjectGrid(row){
		//alert("点击了\n"+row.indexName+"\nid="+row.indexId);
        var url = '${contextPath}/rs/isdp/cellCriterion/json?wbsIndexId='+row.wbsindex;
		$.post(url,{qq:'mike'},function(data){
         //var text = JSON.stringify(data); 
        //alert(text);
         $('#checkProjectGrid').datagrid('loadData', data);
            },'json');
	}

	function updateNodePropertiesGrid(row){
		//alert("点击了\n"+row.indexName+"\nid="+row.indexId);
        var url = '${contextPath}/rs/isdp/filedot/json?wbsIndexId='+row.wbsindex;
	    $.post(url,{qq:'mike'},function(data){
        //var text = JSON.stringify(data); 
        //alert(text);
        $('#nodePropertiesGrid').datagrid('loadData', data);
            },'json');
	}

	function updateTxGrid(row){
		//alert("点击了\n"+row.indexName+"\nid="+row.indexId);
        var url = '${contextPath}/rs/isdp/cellMyTask/json?indexId='+row.indexId;
	    $.post(url,{qq:'mike'},function(data){
       //var text = JSON.stringify(data); 
        //alert(text);
        $('#txGrid').datagrid('loadData', data);
            },'json');
	}

	function loadData(row, url){
		jQuery.post(url,{qq:'mike'},function(data){
		//var text = JSON.stringify(data); 
        //alert(text);
		//$('#wbsTreeGrid').datagrid('loadData', data);
	    if(data.length > 0 ){
          var node = $('#wbsTreeGrid').treegrid('getSelected');
          if(treemap.get(node.indexId) == null){
          $('#wbsTreeGrid').treegrid('append',{
	         parent: node.indexId,  // the node has a 'id' value that defined through 'idField' property
	         data: data
		  });
          treemap.put(node.indexId, "1");
          }
		} else {
          //alert(row.indexName+"已经是叶节点了.");
			 }
		  },'json');
	  }

    function getWidth(percent){
        return $(window).width() * percent;
    }

	function getHeight(percent){
        return $(window).height() * percent;
    }

	function getHeight(){
        return $(window).height() * 0.6;
    }

	function getHeight2(){
        return $(window).height() * 0.4;
    }

	function switchWBS(){
        var showWBS = $('[id=showWBS]:checkbox').attr('checked');
		if(showWBS){
			$('#mx_cc').layout('expand','south').add({border:true});
			$("#wbsTreeGrid").datagrid("resize",{height:getHeight2()});
		} else {      
			$('#mx_cc').layout('collapse','south');            
			$("#wbsTreeGrid").datagrid("resize",{height:getHeight()});
		}
	}

</script>
</head>
<body>  
<div style="margin:0;"></div>  
<div id="mx_cc" class="easyui-layout" data-options="fit:true">  
  <div id="main_info" data-options="region:'center',split:true,border:true"> 
    <div style="background:#fafafa;padding:2px;border:1px solid #ddd;font-size:12px"> 
	   <b>项目</b>
       <select name="projectId">
        <c:forEach var="project" items="${projects}">
         <option value="${project.indexId}">${project.indexName}</option>
        </c:forEach>
       </select>
       <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-view'">查看</a>
       <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-add'">增加</a>   
       <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-edit'">修改</a>  
       <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-remove'">删除</a> 
       <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-search'">查找</a>
       <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-review'">启用WBS计划</a>
       <input type="checkbox" id="showWBS" name="showWBS" checked="checked" 
        onclick="javascript:switchWBS();">显示WBS信息
       </div>
			
	   <table id="wbsTreeGrid"></table> 
	
	</div>  

    <div id="proj_info" data-options="region:'south',border:true,split:true"  style="height:215px">		
        <div class="easyui-tabs" data-options="fit:true,border:false,plain:true">	
	       <div style="padding:10px" title="基本信息">
       	    <table id="info" cellspacing="4" cellpadding="1" border="0" >
       		<tbody>
       		<tr>
       			<td  colspan="4">&nbsp;</td>
       		 </tr>
       		<tr>
       			<td width="50%" class="table-title" align="left">
				    &nbsp;&nbsp;名称&nbsp;&nbsp; 
                    <input class="x-text" type="text" name="name" size="50" ></input>
       			</td>
       			<td width="50%" class="table-title" align="left"> 
				    &nbsp;&nbsp;编号&nbsp;&nbsp; 
                    <input class="x-text" type="text" name="no"></input>
       			</td>
       		</tr>
       		<tr>
       			<td  width="50%" align="left">
				<fieldset style="width:350px;height:60px;">
				<legend> &nbsp;&nbsp;WBS计划执行时间</legend>
				<br/> &nbsp;&nbsp;
				 开始时间:<input class="x-text" type="text" name="startTime" size="9"></input>
				&nbsp;&nbsp;
				结束时间:<input class="x-text" type="text" name="endTime" size="9"></input>
				<br/>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				</fieldset>
				</td>
				<td  width="50%" align="left">
				<fieldset style="width:350px;height:60px;">
				<legend> &nbsp;&nbsp;工程施工时间</legend>
				<br/> &nbsp;&nbsp;
				 开始时间:<input class="x-text" type="text" name="startTime" size="9"></input>
				&nbsp;&nbsp;
				结束时间:<input class="x-text" type="text" name="endTime" size="9"></input>
				<br/>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				</fieldset>
              </td>
       		 </tr>
       		</table>
       	</div>

       	<div style="padding:10px" title="节点属性表">
		    <table id="nodePropertiesGrid"></table>
       	</div>

       	<div style="padding:10px" title="检测项目">
		    <table id="checkProjectGrid"></table>
       	</div>

       	<div style="padding:10px" title="执行情况">
       	 <table id="executionGrid"></table>
       	</div>

       	<div style="padding:10px" title="填写表格">
       	  <table id="txGrid"></table>
       	</div>

       	<div style="padding:10px" title="填写数据">
       	 
       	</div>

       	<div style="padding:10px" title="相关规范">
		    <table id="specGrid"></table>
       	</div>

       	<div style="padding:10px" title="相关资料">
		    <table id="dataLibGrid"></table>        
       	</div>

       </div>
			
	</div> 
  </div>  
 

 <div id="mm1" style="width:150px;"> 
	<div>新增同级</div>
	<div>新增下级</div>
 </div>

  <div id="mm3" style="width:150px;"> 
	<div>删除本节点</div>
	<div>删除本节点及子孙</div>
 </div>

</body>  
</html>  
<!--end of isdp/wbs/plan/list.jsp-->