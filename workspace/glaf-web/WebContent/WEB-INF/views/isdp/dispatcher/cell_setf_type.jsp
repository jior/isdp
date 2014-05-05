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
<%@ include file="/WEB-INF/views/inc/header.jsp"%>
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/easyui/themes/gray/easyui.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/ztree/css/zTreeStyle/zTreeStyle.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/css/icons.css">
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript" src="${contextPath}/scripts/ztree/js/jquery.ztree.all.min.js"></script>
<script type="text/javascript">
 
		var setting = {
			async: {
				enable: true,
				url:"${contextPath}/rs/isdp/treetop/treeJson",
				autoParam:["id","id=treetopIndexId"],
				//otherParam:{"otherParam":"zTreeAsyncTest"},
				dataFilter: filter
			},
			callback: {
				//beforeClick: zTreeBeforeClick,
				onExpand: zTreeOnExpand,
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
			 //updateNode(treeId, treeNode);
            //treeNode.icon="${contextPath}/scripts/ztree/css/zTreeStyle/img/diy/2.png";
			//alert(treeNode.icon);
			//jQuery('#iForm').form('load', treeNode);
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
			 //updateNode(treeId, treeNode);
			 //loadData('data/datagrid_data32.json');
			 jQuery('#iForm').form('load', treeNode);
		}

		function loadData(url){
		  $.get(url,{name:'mike'},function(data){
		      //var text = JSON.stringify(data); 
              //alert(text);
			  $('#myGridData').datagrid('loadData', data);
		  },'json');
	  }


		$(document).ready(function(){
			$.fn.zTree.init($("#myTree"), setting);
		});
	 
	</script>
</head>
<body>  
<div style="margin:0;"></div>  
<div class="easyui-layout" data-options="fit:true">  

    <div data-options="region:'west',split:true" style="width:280px;">
	  <div class="easyui-layout" data-options="fit:true">  
          <div data-options="region:'north',split:true,border:true" style="height:72px">

			<div style="background:#fafafa;padding:5px;border:1px solid #ddd">  
             <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">同级增加</a>
			 <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">增加下级</a>
			 <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">修改</a>
			 <br>
               
			 <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</a> 
             <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-move',plain:true">移动</a> 
			 <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-imp',plain:true">导入</a> 
			 <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-exp',plain:true">导出</a> 
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

           <div data-options="region:'center',split:true,border:true, fit:true">
		   
             <!-- <div style="background:#fafafa;padding:2px;border:1px solid #ddd;font-size:12px;height:30px"> 
			   <b>资料分类信息</b>
                
             </div> -->  

			 <form id="iForm" name="iForm" method="post">
 	   <div id="tt" class="easyui-tabs" tools="#tab-tools" style="width:695px;height:542px;">
		
		<div title="文件分类信息" style="padding:10px;"  closable="false">
			<table id="info" class="content-block" cellspacing="4" cellpadding="1" border="0" >
				<tbody>
				<tr>
					<td width="20%" class="table-title">文件分类名</td>
					<td width="30%" class="table-content">
					    <input class="x-text" type="text" name="indexName"></input>
					</td>
				</tr>
				<tr>
					<td width="20%" class="table-title">文件分类号</td>
					<td width="30%" class="table-content">
					    <input class="x-text" type="text" name="num"></input>
					</td>
				</tr>
				<tr>
					<td class="table-title">文件分类码</td>
					<td class="table-content">
					    <input class="x-text" type="text" name="filenum"></input>
					</td>
				</tr>
				<tr>
					<td class="table-title">著录项类别</td>
					<td class="table-content">
					     <select name="ztype" class="span3">
						     <option value="0">文书</option>
							 <option value="1">声像</option>
							 <option value="2">照片</option>
							 <option value="3">图纸</option>
							 <option value="4">其他</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="table-title">密级</td>
					<td class="table-content">
					     <select name="slevel" class="span3">
							<c:forEach var="item" items="${slevel_dataitems}">
								<option value="${item.id}">${item.list}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td class="table-title">保管期限</td>
					<td class="table-content">
					    <select name="savetime" class="span3">
							<c:forEach var="item" items="${savetime_dataitems}">
								<option value="${item.id}">${item.list}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				 
				</tbody>
			</table>
		</div>

		<div title="选用著录项" style="padding:10px;"  closable="false">
		</div>
 
	</div>
	</form>
	   
			</div>  

            <div data-options="region:'south',split:true,border:true,align:'right'" style="height:30px">
			    <div style="text-align:right;valign:middle;padding-top:5px;">
				 
				</div>
			</div>  
        </div>  
    </div>  
    </div>  

 <div id="mm1" style="width:150px;"> 
	<div>插入分类</div>
	<div>新增下级</div>
 </div>

  <div id="mm3" style="width:150px;"> 
	<div>删除本节点</div>
	<div>删除本节点及子孙</div>
 </div>

</body>  
</html>  
<!--end of isdp/dispatcher/cell_setf_type.jsp-->