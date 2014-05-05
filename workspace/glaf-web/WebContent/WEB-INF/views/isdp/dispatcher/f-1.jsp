<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.glaf.isdp.domain.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	List columns = (List) request.getAttribute("fields");
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
<link rel="stylesheet" type="text/css" href="${contextPath}/css/icons.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/ztree/css/zTreeStyle/zTreeStyle.css">
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/ztree/js/jquery.ztree.all.min.js"></script>
<script type="text/javascript">
       
	    var prevTreeNode;

		/**
		 * 配合比设计 277 f-1 (有疑问)
		 * 施工图审查 278 f-1 (有疑问)
		 * 临时道路修建、养护与拆迁 274 f-1 (有疑问) 
		 * 承包人驻地建设 275 f-1 (有疑问)
		 * 年度进度报表 292 f-1 (有疑问)
		 * 月进度报表 293 f-1 (有疑问)
		 **/

 
		var setting = {
			async: {
				enable: true,
				checkable: false,
				url:"${contextPath}/rs/isdp/treepInfo/treeJson?cellTreedotIndexId=${cellTreedot.indexId}",
				autoParam:["id"],
				//otherParam:{"otherParam":"zTreeAsyncTest"},
				dataFilter: filter,
				keepParent: true,
			    keepLeaf: true
			},
			callback: {
				//beforeExpand: zTreeBeforeExpand,
				//asyncSuccess: zTreeOnAsyncSuccess,
				//asyncError: zTreeOnAsyncError
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


	$(document).ready(function(){
		$.fn.zTree.init($("#myTree"), setting);
	});

	function zTreeBeforeExpand(treeId, treeNode) {
		if (!treeNode.isAjaxing) {
			//startTime = new Date();
			ajaxGetNodes(treeNode, "refresh");
			return false;
		} else {
			alert("zTree 正在下载数据中，请稍后展开节点。。。");
			return false;
		}
		return true;
	}


	function ajaxGetNodes(treeNode, reloadType) {
		var zTree1 = $.fn.zTree.getZTreeObj("myTree");
		if (reloadType == "refresh") {
			treeNode.icon = "${contextPath}/scripts/ztree/css/zTreeStyle/img/diy/1_open.png";
			zTree1.updateNode(treeNode);
		}
		zTree1.reAsyncChildNodes(treeNode, reloadType);
	}

	function zTreeOnAsyncSuccess(event, treeId, treeNode, msg) {
		alert(treeNode);
		if (treeNode) {
			//alert('xxxxxxxx');
			treeNode.icon = "${contextPath}/scripts/ztree/css/zTreeStyle/img/diy/1_open.png";
			var zTree1 = $.fn.zTree.getZTreeObj("myTree");
			zTree1.updateNode(treeNode);
			//zTree1.selectNode(treeNode.nodes[0]);
			//jQuery("#onAsyncSuccessNode").html( "[" + getTime() + "]  treeId=" + treeId + ";<br/>&nbsp;tId=" + treeNode.tId + "; Name=" + treeNode.name );
		} 
	}

	function zTreeOnAsyncError(event, treeId, treeNode, XMLHttpRequest, textStatus, errorThrown) {
		if (treeNode) {
			alert("异步获取数据出现异常。");
			treeNode.icon = "";
			var zTree1 = $.fn.zTree.getZTreeObj("myTree");
			zTree1.updateNode(treeNode);
		} 
	}


	function zTreeOnExpand(treeId, treeNode){
		//alert(treeNode);
		//updateNode(treeId, treeNode);
		var zTree1 = $.fn.zTree.getZTreeObj("myTree");
        treeNode.icon="${contextPath}/scripts/ztree/css/zTreeStyle/img/diy/8.png";
		if(prevTreeNode){
			prevTreeNode.icon="${contextPath}/scripts/ztree/css/zTreeStyle/img/diy/2.png";
			zTree1.updateNode(prevTreeNode);
		}
		
		zTree1.updateNode(treeNode);
		prevTreeNode = treeNode; 
	    //alert(treeNode.icon);
	}

	function updateNode(treeId, treeNode){
		var zTree = $.fn.zTree.getZTreeObj(treeId);
		zTree.setting.view.fontCss["color"] = "#0000ff";
		treeNode.iconSkin = "icon03" ;
		zTree.updateNode(treeNode);
	}

	function zTreeBeforeClick(treeId, treeNode, clickFlag) {
           
	}

	function zTreeOnClick(event, treeId, treeNode, clickFlag) {
       //alert(treeNode.id);
	   //updateNode(treeId, treeNode);
	  loadData('${contextPath}/rs/isdp/pfile/treefiles?indexId='+treeNode.id);
	  //var zTree2 = $.fn.zTree.getZTreeObj("myTree");
	  //zTree2.setting.async.url='${contextPath}/rs/isdp/treepInfo/treeJson?parentId='+treeNode.id;
	  //alert(zTree.setting.async.url);
	  //$.fn.zTree.init($("#myTree"), setting2);
	  //zTree2.reAsyncChildNodes(null, "refresh"); 
	    //if (!treeNode.isAjaxing) {
		//	ajaxGetNodes(treeNode, "refresh");
		//}
	    var zTree1 = $.fn.zTree.getZTreeObj("myTree");
        treeNode.icon="${contextPath}/scripts/ztree/css/zTreeStyle/img/diy/ico_check.gif";
	    if(prevTreeNode){
			prevTreeNode.icon="${contextPath}/scripts/ztree/css/zTreeStyle/img/diy/2.png";
			zTree1.updateNode(prevTreeNode);
		}
		zTree1.updateNode(treeNode);
		prevTreeNode = treeNode; 
	}

	function loadData(url) {
		$.post(url, {
			name : 'mike'
		}, function(data) {
			//var text = JSON.stringify(data); 
			//alert(text);
			$('#myGridData').datagrid('loadData', data);
		}, 'json');
	}

	function refreshNode(e) {
		var zTree = $.fn.zTree.getZTreeObj("myTree"), type = e.data.type, silent = e.data.silent, nodes = zTree
				.getSelectedNodes();
		if (nodes.length == 0) {
			alert("请先选择一个父节点");
		}
		for ( var i = 0, l = nodes.length; i < l; i++) {
			zTree.reAsyncChildNodes(nodes[i], type, silent);
			if (!silent){
				zTree.selectNode(nodes[i]);
			}
		}
	}

	var orgiHeight;

	$(document).ready(function() {
		orgiHeight = $("#div_south_area").css("height");
	});


	function onMyClickRow(rowIndex, row){
		var link = "${contextPath}/rs/isdp/pfile/panel?pfileId="+row.id;
        jQuery.ajax({
					type: "POST",
					url: link,
					dataType: 'html',
					error: function(data){
						 alert('服务器处理错误！' );
					},
					success: function(data){
						//alert(data);
						if(data.length>100){
						   jQuery('#detailTable').replaceWith(data);
						   reloadForm(row);
						}
					 }
				 });
       
	}

	function reloadForm(row){
		var url = "${contextPath}/rs/isdp/pfile/view?pfileId="+row.id;
		jQuery.ajax({
					type: "POST",
					url: url,
					dataType: 'json',
					error: function(data){
						 alert('服务器处理错误！' );
					},
					success: function(data){
						//var text = JSON.stringify(data); 
			            //alert(text);
						jQuery('#iForm').form('load', data);
					 }
				 });
	}

	function zoomOut() {
		alert("缩小");
		$("#div_north_area").css("height", 258);
		alert($("#div_south_area").css("height"));
		//$("#div_north_area").show();
		$("#div_south_area").css({
			width : function(index, value) {
				return parseFloat(value);
			},
			height : function(index, value) {
				return parseFloat(orgiHeight);
			}
		});
		alert($("#div_south_area").css("height"));
	}

	function zoomIn() {
		alert("放大");
		//var h1 = $("#div_north_area").css("height");
		//alert(h1);
		$("#div_north_area").css("height", 0);
		//alert($("#div_south_area").css("height"));
		//$("#div_north_area").hide();
		$("#div_south_area").css({
			width : function(index, value) {
				return parseFloat(value);
			},
			height : function(index, value) {
				alert("value=" + value);
				var h = parseFloat(orgiHeight) + 258;
				alert("h=" + h);
				return h;
			}
		});
		//$("#div_south_area").css("height",600);
		//alert($("#div_south_area").css("height"));
	}

	$("#zoom_out2").click(function() {
		alert("缩小");
		$("#div_north_area").css({
			width : function(index, value) {
				return parseFloat(value) * 0.8;
			},
			height : function(index, value) {
				return parseFloat(value) * 0.8;
			}
		});
	});

	$("#zoom_in2").click(function() {
		alert("放大");
		$("#div_south_area").css({
			width : function(index, value) {
				return parseFloat(value) * 1.2;
			},
			height : function(index, value) {
				return parseFloat(value) * 1.2;
			}
		});
	});
</script>
</head>
<body>
	<div style="margin: 0;"></div>
	<div class="easyui-layout" data-options="fit:true">
		<div data-options="region:'west',split:true" style="width: 265px;">
			<div class="easyui-layout" data-options="fit:true">
				<div data-options="region:'north',split:true,border:true"
					style="height: 40px">
					<div
						style="background: #fafafa; padding: 5px; border: 1px solid #ddd">
						<select name="projectId" class="span3">
							<c:forEach var="project" items="${projects}">
								<option value="${project.indexId}">${project.indexName}</option>
							</c:forEach>
						</select>
					</div>

				</div>
				<div data-options="region:'center',border:false">
					<ul id="myTree" class="ztree"></ul>
				</div>
			</div>
		</div>
		<div data-options="region:'center'">
			<div class="easyui-layout" data-options="fit:true">
				<div id="div_north_area"
					data-options="region:'north',split:true,border:true"
					style="height: 245px">
					<div
						style="background: #fafafa; padding: 2px; border: 0px solid #ddd; font-size: 12px">
						<b>报表列表</b> 
						<a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-view'">查看</a>
                        <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-add'">增加</a> 
                        <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-edit'">修改</a>  
			            <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-remove'">删除</a> 
			            <a href="#" class="easyui-linkbutton" data-options="plain:true, iconCls:'icon-search'">查找</a> 
						<input type="checkbox" name="includesChildren">不显示下级表格
					</div>

					<table id="myGridData" class="easyui-datagrid" style="width:700px;height:220px"  
						data-options="url:'data/datagrid_data3.json',fit:true,fitColumns:true,nowrap:false,nowrap:false,rownumbers:false,striped:true,onClickRow:onMyClickRow,singleSelect:true">
						<thead>
							<tr>
								<th data-options="field:'sortNo',width:80">序号</th>
								<c:forEach items="${fields}" var="f">
									<th
										data-options="field:'${f.dname}',width:${f.listweigth}, sortable:true">${f.fname}</th>
								</c:forEach>
							</tr>
						</thead>
					</table>

				</div>

				<div id="div_south_area"
					data-options="region:'center',split:true,border:true">
					<table width="100%">
						<tr>
							<td width="70%" align="left">文件信息</td>
							<td width="30%" align="right"><img id="zoom_out"
								src="${contextPath}/images/zoom_out_small.png"
								border="0" title="恢复原样" style="cursor: pointer;"
								onclick="javascript:zoomOut();" /> &nbsp; <img id="zoom_in"
								src="${contextPath}/images/zoom_in_small.png"
								border="0" title="将内容部分放大看" style="cursor: pointer;"
								onclick="javascript:zoomIn();" /></td>
						</tr>
					</table>

					<div class="easyui-tabs"
						data-options="fit:true,border:false,plain:true">
						<div style="padding: 10px" title="文件著录">
						  <form id="iForm" name="iForm">
						   <div id="detailTable">
							<table id="detail" class="content-block" cellspacing="4"
								cellpadding="1" border="0">
								<tbody>
									<tr>
										<td width="12%" class="table-title">文件题名</td>
										<td width="88%" class="table-content" colspan="3"><textarea
												id="tname" name="tname" style="height: 50px; width: 650px;"  class="x-textarea"></textarea>
										</td>
									</tr>
									<%
										if (columns != null && !columns.isEmpty()) {
											int index = 0;
											Iterator iter = columns.iterator();
											while (iter.hasNext()) {
												FieldInterface col = (FieldInterface) iter.next();
												if ("tname".equals(col.getDname())) {
													continue;
												}
												pageContext.setAttribute("col", col);
												if (index % 2 == 0) {
													out.println("\n	    <tr>");
												}
									%>
									<td width="10%" class="table-title" align="left"><%=col.getFname()%></td>
									<td width="40%" class="table-content" align="left"><c:choose>
											<c:when test="${col.dtype == 'Integer' or col.dtype == 'i4'}">
												<input id="<%=col.getDname()%>" name="<%=col.getDname()%>"
													type="text" size="40" class="easyui-numberbox x-text span3" />
											</c:when>
											<c:when test="${col.dtype == 'Long' or col.dtype == 'i8'}">
												<input id="<%=col.getDname()%>" name="<%=col.getDname()%>"
													type="text" size="40" class="easyui-numberbox x-text span3" />
											</c:when>
											<c:when test="${col.dtype == 'Double' or col.dtype == 'r8'}">
												<input id="<%=col.getDname()%>" name="<%=col.getDname()%>"
													type="text" size="40" class="easyui-numberbox x-text span3" />
											</c:when>
											<c:when
												test="${col.dtype == 'Date' or col.dtype == 'datetime'}">
												<input id="<%=col.getDname()%>" name="<%=col.getDname()%>"
													type="text" size="20" class=" x-text span3" />
											</c:when>
											<c:otherwise>
												<c:choose>
													<c:when test="${col.intype == 'cmb'}">
														<select id="<%=col.getDname()%>"
															name="<%=col.getDname()%>" class="span2">
															<c:forEach items="${col.dataItems}" var="item">
																<option value="${item.list}">${item.list}</option>
															</c:forEach>
														</select>
													</c:when>
													<c:otherwise>
														<input id="<%=col.getDname()%>" name="<%=col.getDname()%>"
															type="text" size="40" class="x-text span3" />
													</c:otherwise>
												</c:choose>
											</c:otherwise>
										</c:choose></td>
									<%
										index++;

												if (index > 0 && index % 2 == 0) {
													out.println("\n	    </tr>");
												}

											}

											if (index > 0 && index % 2 != 0) {
									%>
									<td width="10%" class="table-title">&nbsp;</td>
									<td width="40%" class="table-content">&nbsp;</td>
									</tr>
									<%
										}
										}
									%>
									<tr>
										<td class="table-content" colspan="4">&nbsp;</td>
									</tr>
								</tbody>
							</table>
						   </div>
						  </form>
						</div>
					</div>

				</div>
				<div
					data-options="region:'south',split:true,border:true,align:'right'"
					style="height: 32px">
					<div style="text-align: right; valign: middle; padding-top: 5px;">
						&nbsp;&nbsp;共有10条记录,共1页,第1页&nbsp;&nbsp;</div>
				</div>
			</div>
		</div>
	</div>

	<div id="mm1" style="width: 150px;">
		<div>新增同级</div>
		<div>新增下级</div>
	</div>

	<div id="mm3" style="width: 150px;">
		<div>删除本节点</div>
		<div>删除本节点及子孙</div>
	</div>
	<script type="text/javascript">
		//jQuery("#myGridData").width(1300);
	</script>
</body>
</html>
<!--end of isdp/dispatcher/f-1.jsp-->