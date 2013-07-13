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
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/ztree/css/zTreeStyle/zTreeStyle.css" >
<link rel="stylesheet" type="text/css" href="${contextPath}/icons/styles.css">
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" 
        src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/ztree/js/jquery.ztree.all.min.js"></script>
<script type="text/javascript">
 
		var setting = {
			async: {
				enable: true,
				url:"${contextPath}/rs/isdp/treepInfo/treeJson?cellTreedotIndexId=${cellTreedot.indexId}",
				autoParam:["id"],
				//otherParam:{"otherParam":"zTreeAsyncTest"},
				dataFilter: filter
			},
			callback: {
				//beforeClick: zTreeBeforeClick,
				//onExpand: zTreeOnExpand,
				onClick: zTreeOnClick
			}
		};

		function filter(treeId, parentNode, childNodes) {
			if (!childNodes) return null;
			for (var i=0, l=childNodes.length; i<l; i++) {
				childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
			}
			return childNodes;
		}

		function zTreeOnExpand(treeId, treeNode){
			 updateNode(treeId, treeNode);
            //treeNode.icon="${contextPath}/scripts/ztree/css/zTreeStyle/img/diy/2.png";
			//alert(treeNode.icon);
		}

		function updateNode(treeId, treeNode){
			var zTree = $.fn.zTree.getZTreeObj(treeId);
			zTree.setting.view.fontCss["color"] = "#0000ff";
			//treeNode.iconSkin = "icon03" ;
			zTree.updateNode(treeNode);
		}

		function zTreeBeforeClick(treeId, treeNode, clickFlag) {
           
		}

		function zTreeOnClick(event, treeId, treeNode, clickFlag) {
             //alert(treeNode.id);
			 $("#treepInfoIndexId").val(treeNode.indexId);
			 //updateNode(treeId, treeNode);
			 loadData('${contextPath}/rs/isdp/cellFillform/json?indexId=${cellTreedot.indexId}&treepInfoIndexId='+treeNode.indexId);
		}

		function loadData(url){
		  $.post(url,{name:'mike'},function(data){
		      var text = JSON.stringify(data); 
              //alert(text);
			  $('#myGridData').datagrid('loadData', data);
		  },'json');
	  }

	  function loadGridData(){
          var treepInfoIndexId = $("#treepInfoIndexId").val();
		  if(treepInfoIndexId != ''){
			 //var pager = $('#myGridData').datagrid('getPager');
			 //alert(pager.pageNumber);
             var link = '${contextPath}/rs/isdp/cellFillform/json?indexId=${cellTreedot.indexId}&treepInfoIndexId='+treepInfoIndexId+"&page="+pager.pageNumber;
            loadData(link);
		  }
	  }


		$(document).ready(function(){
			$.fn.zTree.init($("#myTree"), setting);
		});

		function onGridBeforeLoad(param){
			 var dg =  $('#myGridData');
			 //var pager = $('#myGridData').datagrid('getPager');
			 //alert(pager);
			 //var text = JSON.stringify(param); 
             //alert(text);
			 //alert(param.page);
			 var pageNo = param.page;
			 var rows = param.rows;
			 var treepInfoIndexId = $("#treepInfoIndexId").val();
			 var link = '${contextPath}/rs/isdp/cellFillform/json?indexId=${cellTreedot.indexId}&treepInfoIndexId='+treepInfoIndexId+"&page="+pageNo+"&rows="+rows;
			 //alert(link);
             //dg.url=link;
			 $.post(link,{name:'mike'},function(data){
		      var text = JSON.stringify(data); 
              //alert(text);
			  $('#myGridData').datagrid('loadData', data);
		  },'json');
		}

		function onMyClickRow(rowIndex, rowData){
			alert(rowData.name);
		}

		function onGridReload(param){
			alert(param.page);
		}
	 
</script>
</head>
<body>  
<input type="hidden" id="treepInfoIndexId" name="treepInfoIndexId">
<div style="margin:0;"></div>  
<div class="easyui-layout" data-options="fit:true">  
    <div data-options="region:'west',split:true" style="width:280px;">
	  <div class="easyui-layout" data-options="fit:true">  
          <div data-options="region:'north',split:true,border:true" style="height:38px">
			<div style="background:#fafafa;padding:5px;border:1px solid #ddd">  
              <select name="projectId">
				<c:forEach var="project" items="${projects}">
				  <option value="${project.indexId}">${project.indexName}</option>
				</c:forEach>
			   </select>
             </div>  
			 
			</div>
			 <div data-options="region:'center',border:false">
			    <ul id="myTree" class="ztree"></ul>  
			 </div>  
            <!--<div data-options="region:'south',split:true,border:true" style="height:30px"></div>--> 
        </div>  
	</div>  
    <div data-options="region:'center'">  
        <div class="easyui-layout" data-options="fit:true">  
           <div data-options="region:'north',split:true,border:true" style="height:265px"> 
             <div style="background:#fafafa;padding:2px;border:1px solid #ddd;font-size:12px"> 
			   <b>报表列表</b>
			   <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-view'">查看</a> 
               <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-add'" >新增</a>  
               <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-edit'">修改</a>  
			   <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-remove'">删除</a> 
			   <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-search'">查找</a>
			   <input type="checkbox" name="includesChildren">不显示下级表格
             </div>  
          <table id="myGridData" class="easyui-datagrid" 
				data-options="striped:true,fitColumns:true,nowrap:false,rownumbers:false,pagination:true,pagePosition:'top',singleSelect:true,onBeforeLoad:onGridBeforeLoad, onClickRow:onMyClickRow">
			<thead>
				<tr>
					<th data-options="field:'sortNo',width:60, frozen:true, sortable:true">序号</th>
					<th data-options="field:'num',width:90, frozen:true, sortable:true">编号</th>
					<th data-options="field:'name',width:380, frozen:true, sortable:true">名称</th>
					<c:forEach items="${fields}" var="f">
					<th data-options="field:'${f.dname}',width:${f.listweigth}, sortable:true">${f.fname}</th>
					</c:forEach>  
				</tr>
			</thead>
		</table>  
	   

			</div>  

			<div data-options="region:'center',border:false">

				  <table width="100%">
						<tr>
							<td width="70%" align="left">相关内容</td>
							<td width="30%" align="right"><img id="zoom_out"
								src="${contextPath}/images/zoom_out_small.png"
								border="0" title="恢复原样" style="cursor: pointer;"
								onclick="javascript:zoomOut();" /> &nbsp; <img id="zoom_in"
								src="${contextPath}/images/zoom_in_small.png"
								border="0" title="将内容部分放大看" style="cursor: pointer;"
								onclick="javascript:zoomIn();" /></td>
						</tr>
					</table>
			    <div class="easyui-tabs" data-options="fit:true,border:false,plain:true">
				    <div style="padding:10px" title="报表内容">
					<br>&nbsp;&nbsp;&nbsp;&nbsp;XXXXX报表
					</div>
					<div style="padding:10px" title="附件关联">
					<br>&nbsp;&nbsp;&nbsp;&nbsp;YYYYY附件
					</div>
				</div>
			
			</div> 
            <div data-options="region:'south',split:true,border:true,align:'right'" style="height:30px">
			    <div style="text-align:right;valign:middle;padding-top:5px;">
				共有10条记录,共1页,第1页
				</div>
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
<!--end of isdp/dispatcher/common.jsp-->