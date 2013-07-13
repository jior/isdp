<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<%@ include file="/WEB-INF/views/tm/header.jsp"%>
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/easyui/themes/${theme}/easyui.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/ztree/css/zTreeStyle/zTreeStyle.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/icons/styles.css">
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>
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
			 loadData('data/datagrid_data32.json');
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
				data-options="url:'data/datagrid_data3.json',fitColumns:true,nowrap:false,rownumbers:false">
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
			    <div class="easyui-tabs" data-options="fit:true,border:false,plain:true">
				    <div style="padding:10px" title="文件报审内容">
					<br>&nbsp;&nbsp;&nbsp;&nbsp;XXXXX报表
					</div>
					<div style="padding:10px" title="著录项">
					 <form id="iForm" name="iForm">
						   <div id="detailTable">
							<table id="detail" class="content-block" cellspacing="4"
								cellpadding="1" border="0">
								<tbody>
									<tr>
										<td width="12%" class="table-title">文件题名</td>
										<td width="88%" class="table-content" colspan="3"><textarea
												id="tname" name="tname" style="height: 50px; width: 650px;"></textarea>
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
<!--end of isdp/dispatcher/proj_Inspection.jsp-->