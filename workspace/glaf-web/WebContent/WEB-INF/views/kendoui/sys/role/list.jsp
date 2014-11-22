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
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色列表</title>
<%@ include file="/WEB-INF/views/inc/init_kendoui.jsp"%> 
<script id="template" type="text/x-kendo-template">
   <div class="toolbar">
      <button type="button" id="newButton"  class="k-button" style="width: 90px" 
	  onclick="javascript:addRow();">新增</button>               
   </div>
</script>
<script type="text/javascript">
  var dataItem;
  //var kendo = window.kendo;
  jQuery(function() {
    jQuery("#grid").kendoGrid({
        "columnMenu": true,
        "dataSource": {
            "schema": {
                "total": "total",
                "model": {
                    "fields": {
                        "roleId": {
                            "type": "string"
                        },
                        "name": {
                            "type": "string"
                        },
                        "code": {
                            "type": "string"
                        },
                        "content": {
                            "type": "string"
                        },
                        "createTime": {
                            "type": "date",
							"format": "{0: yyyy-MM-dd}"
                        },
                        "lastLoginTime": {
                            "type": "date",
							"format": "{0: yyyy-MM-dd}"
                        }
                    }
                },
                "data": "rows"
            },
            "transport": {
                "parameterMap": function(options) {
					//alert(JSON.stringify(options));
                    return JSON.stringify(options);
                },
                "read": {
                    //"dataType": "json",
				    "contentType": "application/json",
                    "type": "POST",
                    "url": "<%=request.getContextPath()%>/rs/sys/role/data"
                }
            },
			"serverFiltering": true,
            "serverSorting": true,
            "pageSize": 10,
            "serverPaging": true,
            "serverGrouping": false,
        },
        "height": "452px",
        "reorderable": true,
        "filterable": true,
        "sortable": true,
		"pageable": {
                       "refresh": true,
                       "pageSizes": [5, 10, 15, 20, 25, 50, 100],
                       "buttonCount": 10
                     },
		"selectable": "single",
        "toolbar": kendo.template(jQuery("#template").html()),
        "columns": [{
            "field": "roleId",
            "title": "角色编号",
            "width": "120px",
            "lockable": false,
            "locked": false
        },
        {
            "field": "name",
            "title": "角色名称",
            "width": "150px",
			"lockable": false,
            "locked": false
        },
        {
            "field": "code",
            "title": "编码",
            "width": "120px",
            "locked": false
        },
        {
            "field": "content",
            "title": "描述",
            "width": "220px",
			"sortable": false,
			"filterable": {
                    "cell": {
						"showOperators": false,
						 "suggestionOperator": "contains",
						"operator": "contains"
                    }
                }
        },
        {
            "field": "createTime",
            "title": "创建日期",
            "width": "120px",
            "lockable": false,
			"align": "center",
			"format": "{0: yyyy-MM-dd}",
			"filterable": {
              "ui": "datetimepicker"  
           }
        },
		{
			"command": [{
                "text": "修改",
                "name": "edit",
                "click": function showDetails(e) {
                      //alert("修改记录");
					  //var dataItem = this.dataItem(jQuery(e.currentTarget).closest("tr"));
                      //alert(JSON.stringify(dataItem));
					  //alert(dataItem.roleId);
					  //var link = "<%=request.getContextPath()%>/mx/system/role/edit?roleId="+dataItem.roleId;
					  //var width=480;
					  //var height=450;
					  //var scroll="no";
					  //openWindow(link, width, height, scroll);
					  //editRow(link);
					  dataItem = this.dataItem(jQuery(e.currentTarget).closest("tr"));
                      //alert(JSON.stringify(dataItem));
					  //alert(dataItem.actorId);
					  document.getElementById("roleId").value=dataItem.roleId;
					  if(dataItem.name != null){
					     document.getElementById("name").value=dataItem.name;
					  } else {
						 document.getElementById("name").value="";
					  }
					  if(dataItem.code != null){
					     document.getElementById("code").value=dataItem.code;
					  } else {
						 document.getElementById("code").value="";
					  }
					  if(dataItem.content != null){
					     document.getElementById("content").value=dataItem.content;
					  } else {
						 document.getElementById("content").value="";
					  }
					 
					  var link = "<%=request.getContextPath()%>/mx/system/role/saveModify?roleId="+dataItem.roleId;
					  var window = jQuery("#window");
					  window.kendoWindow({
                        width: "385px",
						height: "315px",
						resizable: true,
						draggable: true,
                        title: "修改记录",
						position: {top:23, left:320, pinned:"fixed"}
                     });
					  
					 window.data("kendoWindow").open();
				    }
                },
				{
                "text": "用户设置",
                "name": "roleUsers",
                "click": function showDetails(e) {
                     //alert("修改记录");
					 dataItem = this.dataItem(jQuery(e.currentTarget).closest("tr"));
                     //alert(JSON.stringify(dataItem));
					 //alert(dataItem.roleId);
					 var link = "<%=request.getContextPath()%>/mx/sys/role/roleUsers?roleId="+dataItem.roleId;
					 roleUsers(link);
				   }
                },
				{
                "text": "菜单设置",
                "name": "roleMenus",
                "click": function showDetails(e) {
                     //alert("修改记录");
					 dataItem = this.dataItem(jQuery(e.currentTarget).closest("tr"));
                     //alert(JSON.stringify(dataItem));
					 //alert(dataItem.roleId);
					 var link = "<%=request.getContextPath()%>/mx/sys/role/roleMenus?roleId="+dataItem.roleId;
					 roleMenus(link);
                  }
            }]
          }
		],
        "scrollable": {},
        "resizable": true,
        "groupable": false
    });
  });


    function roleUsers(link){
		jQuery.layer({
			type: 2,
			maxmin: true,
			shadeClose: true,
			title: "角色用户",
			closeBtn: [0, true],
			shade: [0.8, '#000'],
			border: [10, 0.3, '#000'],
			offset: ['20px',''],
			fadeIn: 100,
			area: ['520px', (jQuery(window).height() - 40) +'px'],
            iframe: {src: link}
		});
	}

    function roleMenus(link){
		jQuery.layer({
			type: 2,
			maxmin: true,
			shadeClose: true,
			title: "角色菜单",
			closeBtn: [0, true],
			shade: [0.8, '#000'],
			border: [10, 0.3, '#000'],
			offset: ['20px',''],
			fadeIn: 100,
			area: ['520px', (jQuery(window).height() - 40) +'px'],
            iframe: {src: link}
		});
	}

	function addRow(){
        //editRow('<%=request.getContextPath()%>/mx/system/role/edit');
		document.getElementById("roleId").value="";
		document.getElementById("name").value="";
		document.getElementById("code").value="";
		document.getElementById("content").value="";
		var link = "<%=request.getContextPath()%>/mx/system/role/saveAdd";
		var window = jQuery("#window");
		window.kendoWindow({
                        width: "385px",
						height: "315px",
						resizable: true,
						draggable: true,
                        title: "新增记录",
						position: {top:23, left:320, pinned:"fixed"}
                     });
					  
		window.data("kendoWindow").open();
	}

    function editRow(link){
		jQuery.layer({
			type: 2,
			maxmin: true,
			shadeClose: true,
			title: "编辑角色信息",
			closeBtn: [0, true],
			shade: [0.8, '#000'],
			border: [10, 0.3, '#000'],
			offset: ['20px',''],
			fadeIn: 100,
			area: ['520px', (jQuery(window).height() - 50) +'px'],
            iframe: {src: link}
		});
	}


	function saveModify(){
        var form = document.getElementById("iForm");
	    if(form.name.value == ''){
		    alert("角色名称不能为空！");
		    form.newPwd.focus();
		    return;
	    }

		var link = '<%=request.getContextPath()%>/mx/system/role/saveModify';

		if(document.getElementById("roleId").value==""){
            link = '<%=request.getContextPath()%>/mx/system/role/saveAdd';
		}
	     
	    var params = jQuery("#iForm").formSerialize();
		jQuery.ajax({
				   type: "POST",
				   url: link,
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
                      var window = jQuery("#window");
                      window.data("kendoWindow").close(); 
					  dataItem.name = document.getElementById("name").value ;
					  dataItem.code = document.getElementById("code").value ;
					  dataItem.content = document.getElementById("content").value ;
					  var grid = jQuery("#grid").data("kendoGrid");
					  grid.refresh();      
				   }
			 });
   }
 

 </script>
</head>
<body>
<div id="main_content" class="k-content">
<div class="x_content_title"><img
	src="<%=request.getContextPath()%>/images/window.png" alt="角色列表">&nbsp;
角色列表</div>
<br>
<div id="grid"></div>
<div id="window" style="display:none">
 <form id="iForm" name="iForm">
  <table width="95%" align="center" border="0" cellspacing="0" cellpadding="5">
	  <tr>
        <td width="20%" class="input-box">角色名称*</td>
        <td width="80%">
		<input id="name" name="name" type="text" size="30" class="k-textbox" value="" datatype="string" nullable="no" minsize="6" maxsize="20" chname="角色名称" style=" width:240px;"> 
		<input type="hidden" id="roleId" name="roleId" value="">
		</td>
      </tr>
	  <tr>
        <td class="input-box2" valign="top">角色编码</td>
        <td>
		<input id="code" name="code" type="text" size="30" class="k-textbox" value=""  datatype="string" nullable="no" minsize="6" maxsize="20" chname="角色编码" style=" width:240px;"></td>
      </tr>
	  <tr>
        <td class="input-box2" valign="top">角色描述</td>
        <td>
		<textarea id="content" name="content" rows="6" cols="46" class="k-textbox" style="height:120px; width:240px;" ></textarea>
		</td>
      </tr>
      <tr>
        <td colspan="2" align="center" valign="bottom" height="30">&nbsp;
		<button type="button" id="iconButton" class="k-primary" style="width: 90px" onclick="javascript:saveModify();">确定</button>
	    </td>
      </tr>
  </table>   
 </form>
</div> 
</div>     
</body>
</html>