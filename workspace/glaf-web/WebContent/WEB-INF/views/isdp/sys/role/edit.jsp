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
<%@ include file="/WEB-INF/views/inc/header.jsp"%> 
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
				url:"${contextPath}/rs/isdp/sys/role/functionPerms?roleId=${role.id}",
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
				url:"${contextPath}/rs/isdp/sys/role/dataPerms?roleId=${role.id}",
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
		  var zTree1 = $.fn.zTree.getZTreeObj("functionPermsTree");
		  zTree1.setting.async.url='${contextPath}/rs/isdp/sys/role/functionPerms?roleId='+row.id;
		  //alert(zTree.setting.async.url);
		  //$.fn.zTree.init($("#functionPermsTree"), setting);
          zTree1.reAsyncChildNodes(null, "refresh"); 

		  var zTree2 = $.fn.zTree.getZTreeObj("dataPermsTree");
		  zTree2.setting.async.url='${contextPath}/rs/isdp/sys/role/dataPerms?roleId='+row.id;
		  //alert(zTree.setting.async.url);
		  //$.fn.zTree.init($("#dataPermsTree"), setting2);
          zTree2.reAsyncChildNodes(null, "refresh"); 
	  }


	    $(document).ready(function(){
			$.fn.zTree.init($("#functionPermsTree"), setting);
			$.fn.zTree.init($("#dataPermsTree"), setting2);
		});
	 
	</script>
</head>
<body>  
<div style="margin:0;"></div>  
<div class="easyui-layout" data-options="fit:true">  
    <div data-options="region:'center'">  
        <div class="easyui-layout" data-options="fit:true">  
           <div data-options="region:'north',split:true,border:true" style="height:215px"> 
             <div style="background:#fafafa;padding:2px;border:1px solid #ddd;font-size:12px"> 
			   <b>岗位信息</b>
               <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-ok'" >确定</a>  
               <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-no'">取消</a>	
             </div>  

             <div>
               <table>
               <tr>
				<td width="20%">岗位</td>
				<td width="80%">
				<input type="text" name="rolename" value="${role.rolename}" class="x-text">
				</td>
               </tr>
               <tr>
				<td width="20%">分配角色任务</td>
				<td width="80%">
				  <select id="tasksort" name="tasksort">
					<option value="0">先登录先分配</option>
					<option value="1">优先级分配</option>
					<option value="2">全部分配</option>
					<option value="3">指定分配</option>
				  </select>
				  <script type="text/javascript">
					 $("#tasksort").val('${role.tasksort}');
				  </script>
				</td>
               </tr>
               <tr>
				<td width="20%">描述</td>
				<td width="80%">
				   <textarea name="content" rows="5" cols="38" class="x-textarea">${role.content}</textarea>
				</td>
               </tr>
               </table>
			 </div>

			</div>  

			<div data-options="region:'center',border:false,cache:true">
			    
			    <div class="easyui-tabs" data-options="fit:true,border:false,plain:true,closed:true,cache:true">
					<div style="padding:10px" title="功能权限">
					    <ul id="functionPermsTree" class="ztree"></ul> 
					</div>
					<div style="padding:10px" title="数据权限">
					    <ul id="dataPermsTree" class="ztree"></ul> 
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

</body>  
</html>  
<!--end of isdp/sys/role/edit.jsp-->