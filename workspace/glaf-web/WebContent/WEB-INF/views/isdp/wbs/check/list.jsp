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
				<c:choose>
				<c:when test="${!empty activityId}">
	            url:'${contextPath}/rs/isdp/wbs/selectedTreegrid?activityId=${activityId}',
				</c:when>
				<c:otherwise>
	            url:'${contextPath}/rs/isdp/wbs/treegrid',
				</c:otherwise>
				</c:choose>
				
				idField:'indexId',
				treeField:'text',
				rowStyler:function(row){
					if (row.cell2 > 1){
						return 'background:#ff0000;color:#fff';
					}
				},
				onClickRow: onTreeGridClick,
				columns:[[
					{title:'工程信息',colspan:4},
					{title:'工程表格',colspan:3},
					{title:'工程文件',colspan:3}
	                ],[
	                {field:'text',title:'名称',width:580,align:'left'},
					{field:'status',title:'完成',width:60,align:'left', formatter:wbsTreeGridFormatter},
					{field:'bdate_date',title:'开工时间',width:90,align:'center'},
					{field:'edate_date',title:'完成时间',width:90,align:'center'},
					{field:'cell1',title:'应填',width:60,align:'right'},
					{field:'cell2',title:'已填',width:60,align:'right'},
					{field:'cell3',title:'缺少',width:60,align:'right'},
					{field:'intpfile1',title:'应有',width:60,align:'right'},
					{field:'intpfile2',title:'已有',width:60,align:'right'},
					{field:'intpfile3',title:'缺少',width:60,align:'right'}
				]]
			});

			$('#fileChkGrid').datagrid({
				url: 'datagrid_data2.json',
				width: 700,
				height: 'auto',
				fitColumns:true,
				fit:true,
				columns:[[
					{field:'status',title:'状态',width:90,align:'left', formatter:fileChkFormatter},
					{field:'intPage0',title:'页数',width:120,align:'left'},
					{field:'name',title:'表格名称',width:280,align:'left'}
				]]
			});

			$('#tableChkGrid').datagrid({
				//title: '表格检测',
				url: 'datagrid_data3.json',
				width: 700,
				height: 'auto',
				fit:true,
				fitColumns:true,
				onDblClickRow: onTableChkGridClick,
				columns:[[
					{field:'status',title:'状态',width:90,align:'left', formatter:tableChkFormatter},
					{field:'intPage0',title:'应填',width:90,align:'left'},
					{field:'intPage1',title:'已填',width:90,align:'left'},
	                {field:'num',title:'模版编号',width:180,align:'left'},
					{field:'name',title:'名称',width:320,align:'left'}
				]]
			});

			$('#checkProjectGrid').datagrid({
				//title: '检测项目',
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

		});

		function wbsTreeGridFormatter(value,row,index){
			 if(row.intPage0 > 0 && row.intPage0 == row.intPage1){
				return "完成";
			}
			return "缺少";
		}

		function tableChkFormatter(value,row,index){
            if(row.intPage0 > 0 && row.intPage0 == row.intPage1){
				return "完成";
			}
			return "缺少";
		}

		function fileChkFormatter(value,row,index){
            if(row.intPage0 > 0 && row.intPage0 == row.intPage1){
				return "完成";
			}
			return "缺少";
		}


		function onTreeGridClick(row){
             //alert("点击了\n"+row.indexName+"\nid="+row.indexId);
			 <c:choose>
				<c:when test="${!empty activityId}">
				</c:when>
				<c:otherwise>
                var url = '${contextPath}/rs/isdp/wbs/treegrid?indexId='+row.indexId;
                  loadData(row, url);
				</c:otherwise>
			 </c:choose>
			
			 updateFileChkGrid(row);
			 updateTableChkGrid(row);
			 updateCheckProjectGrid(row);
		}

		function onTableChkGridClick(rowIndex, row){
             alert(row.name);
		}

		function updateFileChkGrid(row){
            var url = '${contextPath}/rs/isdp/wbs/fileCheckList?indexId='+row.indexId;
			$.post(url,{qq:'mike'},function(data){
                $('#fileChkGrid').datagrid('loadData', data);
            },'json');
		}

		function updateTableChkGrid(row){
            var url = '${contextPath}/rs/isdp/wbs/tableCheckList?indexId='+row.indexId;
			$.post(url,{qq:'mike'},function(data){
                $('#tableChkGrid').datagrid('loadData', data);
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


		function loadData(row, url){
		  $.post(url,{qq:'mike'},function(data){
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
  <div id="main_info" data-options="region:'center',split:true,border:true" > 
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

  <div id="proj_info" data-options="region:'south',border:true,split:true" style="height:215px">		
        <div class="easyui-tabs" data-options="fit:true,border:false,plain:true">	         
			<div style="padding:10px" title="表格检查">
		        <div style="background:#fafafa;padding:5px;border:1px solid #ddd;font-size:12px"> 
                   <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-view'">
                      完成状态</a>
                   <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-edit'">
                      填写表格</a>  
		           <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-print'">
                      打印选定模板</a>  
                  </div>  

		           <table id="tableChkGrid"></table>
				</div>

				<div style="padding:10px" title="文件检查">
		            <table id="fileChkGrid"></table>
				</div>

				<div style="padding:10px" title="检测项目">
		            <table id="checkProjectGrid"></table>
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
<!--end of isdp/wbs/check/list.jsp-->