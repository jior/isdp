<%@ page contentType="text/html;charset=UTF-8" %>
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
				url:"${contextPath}/rs/isdp/sys/permission/subSysPerms",
				//autoParam:["id", "qq=n", "level=lv"],
				//otherParam:{"otherParam":"zTreeAsyncTest"},
				dataFilter: filter
			},
			check: {
				enable: true
			},
			callback: {
				 
			}
		};

		var setting2 = {
			async: {
				enable: true,
				url:"${contextPath}/rs/isdp/sys/permission/baseDataPerms",
				//autoParam:["id", "qq=n", "level=lv"],
				//otherParam:{"otherParam":"zTreeAsyncTest"},
				dataFilter: filter
			},
			check: {
				enable: true
			},
			callback: {
				 
			}
		};

		function filter(treeId, parentNode, childNodes) {
			if (!childNodes) return null;
			for (var i=0, l=childNodes.length; i<l; i++) {
				childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
			}
			return childNodes;
		}


		function loadData(url){
		  $.get(url,{qq:'mike'},function(data){
		      //var text = JSON.stringify(data); 
              //alert(text);
			  $('#myGridData').datagrid('loadData', data);
		  },'json');
	  }

	  function formatter1(value,row,index){
           if(value =='0'){
			   return "先登录先分配";
		   } else if(value =='1'){
			   return "优先级分配";
		   } else if(value =='2'){
			   return "全部分配";
		   } else if(value =='3'){
			   return "指定分配";
		   }
		   return "";
	  }

	  function styler1(value,row,index){
		   if(value =='1'){
			   return 'color:#ffee00;color:green;';
		   }
	  }

	  function onMyClickRow(rowIndex, row){
          //alert(row.id);
		  var zTree1 = $.fn.zTree.getZTreeObj("sysPermsTree");
		  zTree1.setting.async.url='${contextPath}/rs/isdp/sys/permission/subSysPerms?roleId='+row.id;
		  //alert(zTree.setting.async.url);
		  //$.fn.zTree.init($("#sysPermsTree"), setting);
          zTree1.reAsyncChildNodes(null, "refresh"); 

		  var zTree2 = $.fn.zTree.getZTreeObj("baseDataPermsTree");
		  zTree2.setting.async.url='${contextPath}/rs/isdp/sys/permission/baseDataPerms?roleId='+row.id;
		  //alert(zTree.setting.async.url);
		  //$.fn.zTree.init($("#baseDataPermsTree"), setting2);
          zTree2.reAsyncChildNodes(null, "refresh"); 
	  }

	  function onMyDblClickRow(rowIndex, row){
            window.open('${contextPath}/mx/isdp/sys/permission/edit?roleId='+row.id);  
	  }

		function addRole(roleId){
			window.open('${contextPath}/mx/isdp/sys/role/edit?roleId='+roleId);
		}

		function editRole(){
			var rows = jQuery('#myGridData').datagrid('getSelections');
			if(rows == null || rows.length !=1){
			     alert("请选择其中一条记录。");
				 return;
			}
			var row = jQuery('#myGridData').datagrid('getSelected');
			if (row ){
			    window.open('${contextPath}/mx/isdp/sys/role/edit?roleId='+row.id);
			}
		}

	    $(document).ready(function(){
			$.fn.zTree.init($("#sysPermsTree"), setting);
			$.fn.zTree.init($("#baseDataPermsTree"), setting2);
		});
	 
	</script>
</head>
<body>  
<div style="margin:0;"></div>  
<div class="easyui-layout" data-options="fit:true">  
    <div data-options="region:'center'">  
        <div class="easyui-layout" data-options="fit:true">  
           <div data-options="region:'north',split:true,border:true" style="height:265px"> 
             <div style="background:#fafafa;padding:2px;border:1px solid #ddd;font-size:12px"> 
			   <b>岗位列表</b>
               <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-add'" 
			      onclick="addRole('');">新增</a>  
               <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-edit'" 
			      onclick="editRole();">修改</a>   
			   <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-remove'">删除</a> 
			   <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-search'">查找</a>
             </div>  
          <table id="myGridData" class="easyui-datagrid" 
				data-options="url:'${contextPath}/rs/isdp/sys/permission/list',fitColumns:true,nowrap:false,rownumbers:false,striped:true,onClickRow:onMyClickRow,onDblClickRow:onMyDblClickRow,singleSelect:true">
			<thead>
				<tr>
					<th data-options="field:'startIndex',width:60, frozen:true, sortable:true">序号</th>
					<th data-options="field:'rolename',width:90, frozen:true, sortable:true">岗位</th>
					<th data-options="field:'tasksort',width:150, align:'left', formatter:formatter1">分配角色任务</th>
					<th data-options="field:'content',width:180,align:'left'">描述</th>				
				</tr>
			</thead>
		</table>  
	   

			</div>  

			<div data-options="region:'center',border:false,cache:true">
			    相关信息
			    <div class="easyui-tabs" data-options="fit:true,border:false,plain:true,closed:true,cache:true">
					<div style="padding:10px" title="子系统权限">
					    <ul id="sysPermsTree" class="ztree"></ul> 
					</div>
					<div style="padding:10px" title="定义基础数据权限">
					    <ul id="baseDataPermsTree" class="ztree"></ul> 
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
<!--end of isdp/sys/permission/list.jsp-->