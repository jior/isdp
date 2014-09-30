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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>前台菜单</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/core.css"/>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/scripts/ztree/css/zTreeStyle/zTreeStyle.css"/>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/icons.css"/>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/themes/${theme}/styles.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery.form.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/ztree/js/jquery.ztree.all.min.js"></script>
<script type="text/javascript">

	 var setting = {
			async: {
				enable: true,
				url: "<%=request.getContextPath()%>/rs/sys/role/roleMenusJson?roleId=${role.id}",
				dataFilter: filter
			},
			check: {
				enable: true
			},
			callback: {
				onClick: zTreeOnClick
			}
		};
  
  	function filter(treeId, parentNode, childNodes) {
		if (!childNodes) return null;
		for (var i=0, l=childNodes.length; i<l; i++) {
			childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
            //if(childNodes[i].iconCls=='icon-user'){
			   // childNodes[i].icon="<%=request.getContextPath()%>/images/user.gif";
		    //}
		}
		return childNodes;
	}

	function zTreeOnClick(event, treeId, treeNode, clickFlag) {
		//jQuery("#nodeId").val(treeNode.id);
		//loadData('<%=request.getContextPath()%>/mx/sys/application/json&parentId='+treeNode.id);
	}


    jQuery(document).ready(function(){
			jQuery.fn.zTree.init(jQuery("#myTree"), setting);
	});

	function saveRoleSiteMenus(){
		var zTree = $.fn.zTree.getZTreeObj("myTree");
        var selectedNodes  = zTree.getCheckedNodes(true);

        var sx = '';  
		var id='';
        for(var i=0; i<selectedNodes.length; i++){  
            if (sx != ''){ 
				sx += ','; 
			}
			id = selectedNodes[i].id;
            sx += id;  
        }  
        $("#nodeIds").val(sx);
		//alert(sx);
		var params = jQuery("#iForm").formSerialize();
		jQuery.ajax({
				   type: "POST",
				   url: '<%=request.getContextPath()%>/rs/sys/role/saveRoleMenus?roleId=${role.id}',
				   dataType:  'json',
				   data: params,
				   error: function(data){
					   alert('服务器处理错误！');
				   },
				   success: function(data){
					   if(data != null && data.message != null){
						   alert(data.message);
					   } else {
						   alert('操作成功完成！');
					   }
					   jQuery('#mydatagrid').datagrid('reload');
				   }
			 });
	}

</script>
</head>

<body style="margin:0px;"> 
<form id="iForm" name="iForm" method="post">
<input type="hidden" id="nodeIds" name="nodeIds">
<div class="toolbar-backgroud"> 
<span class="x_content_title">设置角色【${role.name}】的菜单</span>
&nbsp;
<input type="button" name="save" value=" 保 存 " class="button" onclick="javascript:saveRoleSiteMenus();"> 
</div> 
<div>
	<ul id="myTree" class="ztree"></ul> 
</div>
</form>
</body>
</html>