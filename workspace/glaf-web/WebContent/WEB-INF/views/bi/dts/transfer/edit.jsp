<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/inc/init_import.jsp"%>
<%@ include file="/WEB-INF/views/inc/init_config.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><%=appTitle%></title>
<meta name="Keywords" content="<%=appKeywords%>" />
<meta name="Description" content="<%=appDescription%>" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/core.css">
<%@ include file="/WEB-INF/views/inc/init_style.jsp"%>
<%@ include file="/WEB-INF/views/inc/init_script.jsp"%>

<script type="text/javascript">
	var contextPath = "${contextPath}";

    jQuery(document).ready(function(){
	    jQuery('#aggregationKeys2').combogrid('setValues', ${dataTransfer.listStringAggregationKeys});
	});

	//保存
	function saveData() {
		jQuery('#aggregationKeys').val(jQuery('#aggregationKeys2').combobox('getValues'));
		var params = jQuery("#iForm").formSerialize();
		var bol = jQuery("#iForm").form('validate');
		if (bol == false) {
			alert("请检查输入！");
			return;
		}

		if(jQuery('#insertOnly').val() == 'false'){
           if(jQuery('#aggregationKeys').val()==""){
			   alert("请选择聚合主键！");
			   document.getElementById('aggregationKeys2').focus();
			   return;
		   }
		}
		 
		jQuery.ajax({
			type : "POST",
			url : '${contextPath}/mx/dts/dataTransfer/saveDataTransfer',
			data : params,
			dataType : 'json',
			async : false,
			error : function(data) {
				alert('服务器处理错误！');
			},
			success : function(data) {
				if (data != null && data.message != null) {
					alert(data.message);
				} else {
					alert('操作成功！');
				}
				if (window.opener) {
					window.opener.location.reload();
				} else if (window.parent) {
					window.parent.location.reload();
				}
			}
		});
	}

	function closeDialog() {
		window.close();
		window.parent.location.reload();
	}
	//提交
	function saveAsData() {
		var params = jQuery("#iForm").formSerialize();
		var bol = jQuery("#iForm").form('validate');
		if (bol == false) {
			alert("请检查输入！");
			return;
		}

		jQuery.ajax({
			type : "POST",
			url : '${contextPath}/mx/dts/dataTransfer/saveDataTransfer',
			data : params,
			dataType : 'json',
			async : false,
			error : function(data) {
				alert('服务器处理错误！');
			},
			success : function(data) {
				if (data != null && data.message != null) {
					alert(data.message);
				} else {
					alert('操作成功！');
				}
				if (window.opener) {
					window.opener.location.reload();
				} else if (window.parent) {
					window.parent.location.reload();
				}
			}
		});
	}

	//明细列表
	var editcount = 0;
	jQuery(function() {
		var tableName = jQuery('#tableName').val();
		jQuery('#mydatagrid').datagrid(
						{
							width : 745,
							height : 220,
							fit : true,
							fitColumns : true,
							nowrap : false,
							striped : true,
							collapsible : true,
							url : '${contextPath}/mx/dts/dataTransfer/columns?tableName='+ tableName,
							remoteSort : false,
							singleSelect : true,
							idField : 'id',
							columns : [ [
									{
										title : '序号',
										field : 'startIndex',
										width : 80,
										sortable : false
									},
									{
										title : '名称',
										field : 'name',
										width : 180,
										editor : {
											type : 'validatebox',
											options : {
												required : true,
												validType : 'notNullAndLength[200]'
											}
										}
									},
									{
										title : '字段名',
										field : 'columnName',
										width : 180,
										editor : {
											type : 'validatebox',
											options : {
												required : true,
												validType : 'Maxlength[50]'
											}
										}
									},
									{
										title : '字段长度',
										field : 'length',
										width : 120,
										align : 'right',
										editor : {
											type : 'numberbox',
											options : {
												required : false,
												min : 1,
												max : 4000
											}
										}
									},
									{
										title : '取数位置',
										field : 'position',
										width : 120,
										align : 'right',
										editor : {
											type : 'numberbox',
											options : {
												required : false,
												min : 1,
												max : 999,
												precision : 0
											}
										}
									},
									{
										title : '标题',
										field : 'title',
										width : 280,
										editor : {
											type : 'validatebox',
											options : {
												required : false,
												validType : 'Maxlength[250]'
											}
										}
									},
									{
										title : '类型',
										field : 'javaType',
										width : 120,
										editor : {
											type : 'combobox',
											options : {
												required : true,
												editable : false,
												url : '${contextPath}/rs/dts/dataTransfer/javaType',
												valueField : 'code',
												textField : 'text'
											}
										},
										formatter : function(value, row, index) {
											var javaType = "";
											jQuery.ajax({
														type : "POST",
														url : '${contextPath}/rs/dts/dataTransfer/javaType',
														dataType : 'json',
														async : false,
														success : function(data) {
															if (data != null && data.message != null) {
																alert(data.message);
															} else {
																for ( var i = 0; i < data.length; i++) {
																	if (data[i].code == value) {
																		javaType = data[i].text;
																	}
																}
															}
														}
													});
											return javaType;
										}
									},
									{
										title : '值表达式',
										field : 'valueExpression',
										width : 120,
										editor : {
											type : 'combobox',
											options : {
												required : false,
												editable : true,
												url : '${contextPath}/rs/dts/dataTransfer/valueExpression',
												valueField : 'code',
												textField : 'text'
											}
										},
										formatter : function(value, row, index) {
											var valueExpression = "";
											jQuery.ajax({
														type : "POST",
														url : '${contextPath}/rs/dts/dataTransfer/valueExpression',
														dataType : 'json',
														async : false,
														success : function(data) {
															if (data != null && data.message != null) {
																alert(data.message);
															} else {
																for ( var i = 0; i < data.length; i++) {
																	if (data[i].code == value) {
																		valueExpression = data[i].text;
																	}
																}
															}
														}
													});
											return valueExpression;
										}
									},
									{
										title : '操作',
										field : 'functionKey',
										width : 150,
										formatter : function(value, row, index) {
											if (row.editting) {
												var s = "<a href='#' onclick='saveDetail("
														+ index + ")'>保存</a> ";
												var c = "<a href='#' onclick='cancelrow("
														+ index + ")'>取消</a> ";
												return s + c;
											} else {
												var e = "<a href='#' onclick='editrow("
														+ index + ")'>编辑</a> ";
												return e;
											}
										}
									} ] ],
							rownumbers : false,
							pagination : false,
							onBeforeEdit : function(index, row) {
								row.editting = true;
								jQuery('#mydatagrid').datagrid('refreshRow',
										index);
								editcount++;
							},
							onAfterEdit : function(index, row) {
								row.editting = false;
								jQuery('#mydatagrid').datagrid('refreshRow',
										index);
								editcount--;
							},
							onCancelEdit : function(index, row) {
								row.editting = false;
								jQuery('#mydatagrid').datagrid('refreshRow',
										index);
								editcount--;
							}
						});

		var p = jQuery('#mydatagrid').datagrid('getPager');
		jQuery(p).pagination({
			onBeforeRefresh : function() {
				//alert('before refresh');
			}
		});
	});
	
	
	//明细增加
	function addNew() {
		if (editcount > 0) {
			alert("当前还有" + editcount + "记录正在编辑，不能增加记录。");
			return;
		}
		var index = jQuery("#mydatagrid").datagrid("getRows").length;
		jQuery("#mydatagrid").datagrid("appendRow", {});
		jQuery("#mydatagrid").datagrid("beginEdit", index);
	}
	
	
	//明细删除
	function deleteSelections() {
		if (editcount > 0) {
			alert("当前还有" + editcount + "记录正在编辑，暂不能删除。");
			return;
		}
		var tableName = jQuery('#tableName').val();
		var ids = [];
		var rows = jQuery('#mydatagrid').datagrid('getSelections');
		for ( var i = 0; i < rows.length; i++) {
			ids.push(rows[i].id);
		}
		if (ids.length > 0 && confirm("数据删除后不能恢复，确定删除吗？")) {
			var columnIds = ids.join(',');
			jQuery.ajax({
						type : "POST",
						url : '${contextPath}/mx/dts/dataTransfer/deleteColumns?columnIds='
								+ columnIds + '&tableName=' + tableName,
						dataType : 'json',
						async : false,
						error : function(data) {
							alert('服务器处理错误！');
						},
						success : function(data) {
							if (data != null && data.message != null) {
								alert(data.message);
							} else {
								alert('操作成功！');
							}
							jQuery('#mydatagrid').datagrid('reload');
						}
					});
		} else {
			alert("请选择至少一条记录。");
		}
	}
	
	
	//明细取消
	function cancelrow(indexs) {
		var bol = $("#mydatagrid").datagrid("validateRow", indexs);
		jQuery('#mydatagrid').datagrid("cancelEdit", indexs);
		jQuery('#mydatagrid').datagrid("endEdit", indexs);
		jQuery('#mydatagrid').datagrid('refreshRow', indexs);
		$("#mydatagrid").datagrid("selectRow", indexs);
		var rows = $("#mydatagrid").datagrid("getSelections");
		if (bol == false) {
			if (!(rows[0].purchaseitemid)) {
				jQuery('#mydatagrid').datagrid('deleteRow', indexs);
			}
		}
	}
	
	
	//明细编辑
	function editrow(indexs) {
		if (editcount > 0) {
			alert("当前还有" + editcount + "记录正在编辑，暂不能编辑。");
			return;
		}
		jQuery('#mydatagrid').datagrid("beginEdit", indexs);
	}
	
	
	//明细保存
	function saveDetail(indexs) {
		var tableName = jQuery('#tableName').val();
		if(tableName == ""){
            alert("请填写数据库表名！");
			document.getElementById("tableName").focus();
			return;
		}
		$("#mydatagrid").datagrid("endEdit", indexs);
		$("#mydatagrid").datagrid("selectRow", indexs);
		var rows = $("#mydatagrid").datagrid("getSelections");
		var bol = $("#mydatagrid").datagrid("validateRow", indexs);
		if (bol == false) {
			alert("请检查输入！");
			return;
		}
		jQuery.ajax({
			type : "POST",
			url : '${contextPath}/mx/dts/dataTransfer/saveColumn?tableName='+ tableName,
			data : rows[0],
			dataType : 'json',
			async : false,
			error : function(data) {
				alert('服务器处理错误！');
			},
			success : function(data) {
				if (data != null && data.message != null) {
					alert(data.message);
				} else {
					alert('操作成功！');
				}
				var link = '${contextPath}/mx/dts/dataTransfer/saveColumn?tableName='+ tableName;
				//jQuery('#mydatagrid').datagrid('reload');
				jQuery.get(url+'&randnum='+Math.floor(Math.random()*1000000),{qq:'xx'},function(data){
			         jQuery('#easyui_data_grid').datagrid('loadData', data);
		         },'json');
			}
		});
	}
</script>
</head>

<body>
	<div class="easyui-layout" data-options="fit:true">
		<div data-options="region:'north',split:true,border:true"
			style="height: 40px">
			<div class="toolbar-backgroud">
				<span class="x_content_title">数据传递</span> 
				<a href="#" class="easyui-linkbutton"
					data-options="plain:true, iconCls:'icon-save'"
					onclick="javascript:saveData();">保存</a> 
				<a href="#" class="easyui-linkbutton"
					data-options="plain:true, iconCls:'icon-cancel'"
					onclick="javascript:art.dialog.close();">关闭</a>
			</div>
		</div>
		<div data-options="region:'center',border:false,cache:true">
			<form id="iForm" name="iForm" method="post">
				<input type="hidden" id="id" name="id" value="${dataTransfer.id}" />
				<input type="hidden" id="nodeId" name="nodeId" value="${nodeId}" >
				<input type="hidden" id="aggregationKeys" name="aggregationKeys" value="${dataTransfer.aggregationKeys}" />
				<div style="width: 100%">
					<table style="width: 720px;" align="center">
						<tbody>
							<tr>
								<td align="left">表名</td>
								<td align="left"><input id="tableName" name="tableName"
									type="text" class="easyui-validatebox x-text"
									data-options="required:true" maxlength="25" size="25"
									value="${dataTransfer.tableName}" /></td>
								<td align="left">类型</td>
								<td align="left"><input id="parseType"
									class="easyui-combobox" name="parseType"
									value="${dataTransfer.parseType}" size="15" editable="false"
									data-options="required:true,valueField:'code',textField:'text',required:true,url:'${contextPath}/rs/dts/dataTransfer/parseTypeJson',
									onSelect: function(rec){ 
									jQuery.ajax({
									   type: 'POST',
									   url: '${contextPath}/rs/dts/dataTransfer/parseTypeJson',
									   data: {'parseType':rec.code},
									   dataType:  'json',
										async:false ,
									   error: function(data){
									   alert('服务器处理错误！');
									   },
									   success: function(data){
						 
									   }
									 });
									},onChange: function(rec){ 
										jQuery.ajax({
										   type: 'POST',
										   url: '${contextPath}/rs/dts/dataTransfer/parseTypeJson',
										   data: {'parseType':rec.code},
										   dataType:  'json',
										   async:false,
										   error: function(data){
										   alert('服务器处理错误！');
										   },
										   success: function(data){
										   
										   }
										 });
									}" />
							</td>
					    </tr>
					    <tr>
								<td align="left">标题</td>
								<td align="left">
								  <input id="title" name="title" type="text"
									class="easyui-validatebox  x-text" editable="true" size="25" value="${dataTransfer.title}" />
								</td>
								<td align="left">主键</td>
								<td align="left">
								  <input class="easyui-combobox" 
								         id="primaryKey"
										 name="primaryKey"
										 value="${dataTransfer.primaryKey}"
										 size='15'
										 editable="false"
										 data-options="
												url:'${contextPath}/rs/dts/dataTransfer/columns?tableName=${dataTransfer.tableName}',
												method:'get',
												valueField:'columnName',
												textField:'text',
												multiple:false,
												panelHeight:'auto'
										">
								</td>
							</tr>
							<tr>
								<td align="left">文件前缀</td>
								<td align="left">
								  <input id="filePrefix" name="filePrefix"
									type="text"  class="easyui-validatebox  x-text"
									data-options="required:false" size="25" />
								</td>
								<td align="left">开始行数</td>
								<td align="left">
								   <input id="startRow" name="startRow" class="easyui-validatebox easyui-numberbox  x-text" 
                                          data-options= " required:false, min: 0, max: 99999, precision: 0 "
									      size="10" value="${dataTransfer.startRow}" editable="true"/>
								</td>
							</tr>
							<tr>
								<td align="left">结束词</td>
								<td align="left">
								  <input id="stopWord" 
									class="easyui-validatebox  x-text" name="stopWord" editable="true"
									data-options= " required:false "
									value="${dataTransfer.stopWord}" size='25' />
								</td>
								<td align="left">每次都插入数据</td>
								<td align="left">
                                    <select id="insertOnly" name="insertOnly">
										<option value="false">否</option>
										<option value="true" selected>是</option>
                                    </select>
									<script type="text/javascript">
									    document.getElementById("insertOnly").value="${dataTransfer.insertOnly}";
									</script>
								</td>
							</tr>
							<tr>
								<td align="left">结束跳过行数</td>
								<td align="left">
								  <input id="stopSkipRow" name="stopSkipRow" class="easyui-numberbox  x-text" 
								         data-options= " required:false, min: 0, max: 99999, precision: 0 " 
									     size="5" value="${dataTransfer.stopSkipRow}" editable="true"/>
								</td>
								<td align="left">聚合主键</td>
								<td align="left">
								  <select id="aggregationKeys2"
										  name="aggregationKeys2"
										  multiple
										  class="easyui-combogrid" style="width:250px" 
										  data-options="
											panelWidth: 500,
											multiple: true,
											idField: 'columnName',
											textField: 'text',
											url: '${contextPath}/rs/dts/dataTransfer/columns?tableName=${dataTransfer.tableName}',
											columns: [[
												{field:'ck',checkbox:true},
												{field:'columnName',title:'列名',width:120},
												{field:'title',title:'标题',width:120},
												{field:'javaType',title:'类型',width:120,align:'center'},
												{field:'length',title:'字段长度',width:90,align:'right'}
											]],
											fitColumns: true
										">
									</select>					
								</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div style="margin: 0;"></div>
				<div data-options="region:'north',split:true,border:true"
					style="height: 40px">
					<div class="toolbar-backgroud">
						 &nbsp; &nbsp;<img src="${contextPath}/images/window.png">&nbsp; <span
							class="x_content_title">字段列表:</span> <a href="#"
							class="easyui-linkbutton"
							data-options="plain:true, iconCls:'icon-add'"
							onclick="javascript:addNew();">增加</a> <a href="#"
							class="easyui-linkbutton"
							data-options="plain:true, iconCls:'icon-remove'"
							onclick="javascript:deleteSelections();">删除</a>
					</div>
					<div data-options="region:'center',border:true"
						style="width: 780px; height: 200px">
						<table id="mydatagrid">
						</table>
					</div>
 
					<div style="margin: 0; height: 4px"></div>
					 
			</form>

		</div>

</body>
</html>
<%@ include file="/WEB-INF/views/inc/init_end.jsp"%>