<%@ page contentType="text/html;charset=UTF-8" %>
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
<link rel="stylesheet" type="text/css" href="${contextPath}/scripts/easyui/themes/gray/easyui.css">
<link rel="stylesheet" href="${contextPath}/scripts/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
<link rel="stylesheet" type="text/css" href="${contextPath}/css/icons.css">
<script type="text/javascript" src="${contextPath}/scripts/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${contextPath}/scripts/ztree/js/jquery.ztree.all.min.js"></script>
<script type="text/javascript">
 
		var setting = {
			async: {
				enable: true,
				url:"${contextPath}/rs/isdp/treepname/treeJson",
				//autoParam:["id", "name=n", "level=lv"],
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
			 //jQuery('#iForm').form('load', treeNode);
			 var link = '${contextPath}/rs/isdp/pinfo/json';
			 loadData(link);
		}

		function loadData(url){
		  $.get(url,{name:'mike'},function(data){
		      //var text = JSON.stringify(data); 
              //alert(text);
			  //$('#myGridData').datagrid('loadData', data);
			  jQuery('#iForm').form('load', data);
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
          <div data-options="region:'north',split:true,border:true" style="height:66px">
            
			<div style="background:#fafafa;padding:5px;border:1px solid #ddd">  
			 <center><span style="font-size:18px;">工程列表</span></center>
             <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">同级增加</a>
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
		   
             <!-- <div style="background:#fafafa;padding:2px;border:1px solid #ddd;font-size:12px;height:30px"> 
			   <b>资料分类信息</b>
                
             </div> -->  

		   <form id="iForm" name="iForm" method="post">
 		
		    <div style="background:#fafafa;padding:5px;border:1px solid #ddd">  
			 <center><span style="font-size:18px;">工程著录项</span></center>
			 <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">修改著录信息</a>
		    </div>

			<table id="info" class="content-block" cellspacing="4" cellpadding="1" border="0" >
				<tbody>
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
				<c:when test="${col.dtype == 'Date' or col.dtype == 'datetime'}">
					<input id="<%=col.getDname()%>" name="<%=col.getDname()%>"
													type="text" size="20" class=" x-text span3" />
				</c:when>
				<c:otherwise>
					<c:choose>
						<c:when test="${col.intype == 'cmb'}">
							<select id="<%=col.getDname()%>" name="<%=col.getDname()%>" class="span2">
							<c:forEach items="${col.dataItems}" var="item">
							<option value="${item.list}">${item.list}</option>
							</c:forEach>
							</select>
						</c:when>
						<c:otherwise>
						<input id="<%=col.getDname()%>" name="<%=col.getDname()%>" type="text" size="40" class="x-text span3" />
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
			</tbody>
		  </table>
	     </form>
 

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
<!--end of isdp/dispatcher/planproj.jsp-->