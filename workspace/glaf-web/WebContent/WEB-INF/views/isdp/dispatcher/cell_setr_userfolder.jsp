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
<title>${cellTreedot.indexName}</title>
<%@ include file="/WEB-INF/views/tm/header.jsp"%>
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/easyui/themes/${theme}/easyui.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/ztree/css/zTreeStyle/zTreeStyle.css" >
<link rel="stylesheet" type="text/css" href="${contextPath}/icons/styles.css">
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/ztree/js/jquery.ztree.all.min.js"></script>
<script type="text/javascript">
 
		var setting = {
			async: {
				enable: true,
				url:"${contextPath}/rs/isdp/treeFolder/json?cellTreedotIndexId=${cellTreedotIndexId}",
				//autoParam:["id", "name=n", "level=lv"],
				//otherParam:{"otherParam":"zTreeAsyncTest"},
				dataFilter: filter
			},
			callback: {
				beforeClick: zTreeBeforeClick,
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
			 updateNode(treeId, treeNode);
			 var url='${contextPath}/rs/isdp/cellUpicInfo/list?treeFolderIndexId='+treeNode.id;
			 loadData(url);
		}

		function loadData(url){
		  $.get(url,{qq:'mike'},function(data){
		      //var text = JSON.stringify(data); 
              //alert(text);
			  $('#myGridData').datagrid('loadData', data);
		  },'json');
	  }


		function onMyDbClickRow(rowIndex, row){
			var link = "${contextPath}/rs/isdp/cellUpicInfo/download?id="+row.id;
			window.open(link);
		}


		$(document).ready(function(){
			$.fn.zTree.init($("#myTree"), setting);
		});
	 
</script>
</head>
<body>  
<div style="margin:0;"></div>  
<div class="easyui-layout" data-options="fit:true">  

    <div data-options="region:'west',split:true" style="width:250px;">
	  <div class="easyui-layout" data-options="fit:true">  
          <div data-options="region:'north',split:true,border:true" style="height:72px">

			<div style="background:#fafafa;padding:5px;border:1px solid #ddd">  
             <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">同级增加</a>
			 <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">增加下级</a>
			 <br>
			 <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">修改</a>
			 <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</a> 
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
		   
             <div style="background:#fafafa;padding:2px;border:1px solid #ddd;font-size:12px"> 
			   <b>文件列表</b>
               <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-view'">查看</a>
               <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-add'">增加</a>  
               <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-edit'">修改</a>  
			   <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-remove'">删除</a> 
			   <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-search'">查找</a>
			   <input type="checkbox" name="includesChildren">不显示下级表格
             </div>  

			 <table id="myGridData" class="easyui-datagrid" 
					data-options="url:'${contextPath}/rs/isdp/cellUpicInfo/list?treeFolderIndexId=${treeFolderIndexId}',fitColumns:true,nowrap:false,rownumbers:true,onDblClickRow:onMyDbClickRow">
				<thead>
					<tr>
						<th data-options="field:'sortNo',width:180, frozen:true, sortable:true">编号</th>
						<c:forEach items="${fields}" var="f">
						<th data-options="field:'${f.dname}',width:${f.listweigth}, sortable:true">${f.fname}</th>
						</c:forEach> 
					</tr>
				</thead>
			</table>  
	   
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
<!--end of isdp/dispatcher/cell_setr_userfolder.jsp-->