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
<%@ include file="/WEB-INF/views/tm/header.jsp"%> 
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/easyui/themes/${theme}/easyui.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/ztree/css/zTreeStyle/zTreeStyle.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/icons/styles.css">
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/jquery/jquery.form.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/ztree/js/jquery.ztree.all.min.js"></script>
    <script type="text/javascript">
 
		var setting = {
			async: {
				enable: true,
				url:"${contextPath}/rs/isdp/sys/user/functionPerms",
				//autoParam:["id", "name=n", "level=lv"],
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
				url:"${contextPath}/rs/isdp/sys/user/dataPerms",
				//autoParam:["id", "name=n", "level=lv"],
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
		  $.get(url,{name:'mike'},function(data){
		      //var text = JSON.stringify(data); 
              //alert(text);
			  $('#myGridData').datagrid('loadData', data);
		  },'json');
	  }

	  function formatter1(value,row,index){
           if(value =='1'){
			   return "是";
		   }
		   return "否";
	  }

	  function formatter2(value,row,index){
           if(value =='0'){
			   return "使用中";
		   }
		   return "停用";
	  }

	  function styler1(value,row,index){
		   if(value =='1'){
			   return 'color:#ffee00;color:green;';
		   }
	  }

    function onMyDblClickRow(rowIndex, row){
            window.open('${contextPath}/mx/isdp/sys/user/edit?userId='+row.userId);  
	  }

    function onMyClickRow(rowIndex, row){
		  $('#userId').val(row.userId);
		  var params = jQuery("#iForm").formSerialize();
          var url = "${contextPath}/rs/isdp/sys/user/info";
		  jQuery.ajax({
					   type: "POST",
					   url: url,
					   data: params,
					   dataType: 'json',
					   error: function(data){
						   alert('服务器处理错误！' );
					   },
					   success: function(data){
						     //var text = JSON.stringify(data); 
                             //alert(text);
							 $('#iForm').form('load', data);
							 //alert(data.issystem);
							 if(data.issystem == '1'){
							    $('[id=issystem]:checkbox').attr('checked', true);
							 }
							 if(data.intallwbs == 1){
							    $('[id=intallwbs]:checkbox').attr('checked', true);
							 }
							 if(data.intRemote == 1){
							    $('[id=intRemote]:checkbox').attr('checked', true);
							 }
							 if(data.intVirtual == 1){
							    $('[id=intVirtual]:checkbox').attr('checked', true);
							 }
							 if(data.isbind == '1'){
							    $('[id=isbind]:checkbox').attr('checked', true);
							 }
							 if(data.status == '1'){
							    $('[id=status]:checkbox').attr('checked', true);
							 }
					   }
				 });

          //alert(row.userId);
		  var zTree1 = $.fn.zTree.getZTreeObj("functionPermsTree");
		  zTree1.setting.async.url='${contextPath}/rs/isdp/sys/user/functionPerms?userId='+row.userId;
		  //alert(zTree.setting.async.url);
		  //$.fn.zTree.init($("#functionPermsTree"), setting);
          zTree1.reAsyncChildNodes(null, "refresh"); 

		  var zTree2 = $.fn.zTree.getZTreeObj("dataPermsTree");
		  zTree2.setting.async.url='${contextPath}/rs/isdp/sys/user/dataPerms?userId='+row.userId;
		  //alert(zTree.setting.async.url);
		  //$.fn.zTree.init($("#dataPermsTree"), setting2);
          zTree2.reAsyncChildNodes(null, "refresh"); 
	  }

		function addUser(userId){
			window.open('${contextPath}/mx/isdp/sys/user/edit?userId='+userId);
		}

		function editUser(){
			var rows = jQuery('#myGridData').datagrid('getSelections');
			if(rows == null || rows.length !=1){
			     alert("请选择其中一条记录。");
				 return;
			}
			var row = jQuery('#myGridData').datagrid('getSelected');
			if (row ){
			    window.open('${contextPath}/mx/isdp/sys/user/edit?userId='+row.userId);
			}
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
           <div data-options="region:'north',split:true,border:true" style="height:265px"> 
             <div style="background:#fafafa;padding:2px;border:1px solid #ddd;font-size:12px"> 
			   <b>用户列表</b>
               <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-add'" 
			      onclick="addUser('');">新增</a>  
               <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-edit'"
			      onclick="editUser();">修改</a>  
			   <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-remove'">删除</a> 
			   <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-search'">查找</a>
			   <a href="${contextPath}/mx/isdp/sys/role/list" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-role'">角色管理</a>
             </div>  
			  <table id="myGridData" class="easyui-datagrid" 
					data-options="url:'${contextPath}/rs/isdp/sys/user/list',fitColumns:true,nowrap:false,rownumbers:false,striped:true,onClickRow:onMyClickRow,onDblClickRow:onMyDblClickRow,singleSelect:true">
				<thead>
					<tr>
						<th data-options="field:'sortNo',width:60, frozen:true, sortable:true">序号</th>
						<th data-options="field:'userId',width:90, frozen:true, sortable:true">帐号</th>
						<th data-options="field:'userName',width:90, align:'left', sortable:true">用户名</th>
						<th data-options="field:'ctime',width:90,align:'left'">创建日期</th>
						<th data-options="field:'etime',width:90">失效日期</th>
						<th data-options="field:'issystem',width:90, formatter:formatter1,styler:styler1">系统管理员</th>
						<!-- <th data-options="field:'status',width:90,align:'center',formatter:formatter2">状态</th> -->
					</tr>
				</thead>
			</table>  
	   

			</div>  

			<div data-options="region:'center',border:false">
			    相关信息
			    <div class="easyui-tabs" data-options="fit:true,border:false,plain:true">
				    <div style="padding:10px" title="基本信息">
					 <form id="iForm" name="iForm">
					  <input type="hidden" id="userId" name="userId">
					  <table>
					     <tr>
						   <td width="50%"  valign="top">
						       <table>
							    <tr>
								<td width="30%">帐号:</td>
								<td width="70%"><input type="text" id="userId" name="userId" class="x-text"></td>
						       </tr>
						       <tr>
								<td width="30%">用户名:</td>
								<td width="70%"><input type="text" id="username" name="username" class="x-text"></td>
						       </tr>
						      
						       <tr>
								<td>创建日期:</td>
								<td><input type="text" id="ctime" name="ctime" class="x-text"></td>
						       </tr>
						       <tr>
								<td>失效日期:</td>
								<td><input type="text" id="etime" name="etime" class="x-text"></td>
						       </tr>

							   <tr>
								<td>电子邮件:</td>
								<td><input type="text" id="email" name="email" class="x-text"></td>
						       </tr>
						       <tr>
								<td>手机号码:</td>
								<td><input type="text" id="mobile" name="mobile" class="x-text"></td>
						       </tr>

							   <tr>
								<td>系统管理员:</td>
								<td><input type="checkbox" id="issystem" name="issystem"></td>
						       </tr>
							   <tr>
								<td>全部WBS权限:</td>
								<td><input type="checkbox"  id="intallwbs" name="intallwbs"></td>
						       </tr>
						       <tr>
								<td>远程用户:</td>
								<td><input type="checkbox"  id="intRemote" name="intRemote"></td>
						       </tr>

							   <tr>
								<td>虚拟用户:</td>
								<td><input type="checkbox" id="intVirtual" name="intVirtual" ></td>
						       </tr>
						       <tr>
								<td>停用帐号:</td>
								<td><input type="checkbox" id="status" name="status" ></td>
						       </tr>
						       </table>
						   </td>
                           <td width="50%" valign="top">
						       <table>
						       <tr>
								<td width="35%">所属角色:</td>
								<td >
								    <textarea id="roleNames" name="roleNames" rows="6" cols="40" class="x-textarea"></textarea>
								</td>
						       </tr>
						       <tr>
							    <td width="35%"></td>
								<td >
								<input type="checkbox" id="isbind" name="isbind">用户在指定计算机才能登陆
								</td>				
						       </tr>
						       <tr>
								<td width="35%" >计算机名:</td>
								<td >
								    <textarea id="computerid" name="computerid" rows="6" cols="40" class="x-textarea"></textarea>
								</td>
						       </tr>
						       <tr>
								<td width="35%" >集成系统用户:</td>
								<td >
								    <textarea rows="6" cols="40" class="x-textarea"></textarea>
								</td>
						       </tr>
						       </table>
						   </td>
					  </table>
					 </form>
					</div>
					<div style="padding:10px" title="功能权限">
					    <ul id="functionPermsTree" class="ztree"></ul> 
					</div>
					<div style="padding:10px" title="数据权限">
					    <ul id="dataPermsTree" class="ztree"></ul> 
					</div>
				</div>
			
			</div> 
            <!-- <div data-options="region:'south',split:true,border:true,align:'right'" style="height:30px">
			    <div style="text-align:right;valign:middle;padding-top:5px;">
				共有10条记录,共1页,第1页
				</div>
			</div>  --> 
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
<!--end of isdp/sys/user/list.jsp-->