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
<title>部门列表</title>
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
					"id": "nodeId",
                    "fields": {
						"parentId": { "field": "parentNodeId",  "nullable": true },
                        "deptId": {
                            "type": "number"
                        },
                        "name": {
                            "type": "string"
                        },
                        "code": {
                            "type": "string"
                        },
						"code2": {
                            "type": "string"
                        },
                        "no": {
                            "type": "string"
                        }
                    }
					,
                    "expanded": true
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
                    "url": "<%=request.getContextPath()%>/rs/sys/department/data"
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
        "columns": [
        {
            "field": "name",
            "title": "部门名称",
            "width": "180px",
			"lockable": false,
            "locked": false
        },
        {
            "field": "code",
            "title": "代码",
            "width": "150px",
            "locked": false
        },
        {
            "field": "code2",
            "title": "编码",
            "width": "150px",
            "locked": false
        },
        {
            "field": "no",
            "title": "部门区分",
            "width": "150px",
            "locked": false
        },
        {
            "field": "desc",
            "title": "部门描述",
            "width": "220px",
            "locked": false
        },
		{
			"command": [{
                "text": "修改",
                "name": "edit",
                "click": function showDetails(e) {
					  dataItem = this.dataItem(jQuery(e.currentTarget).closest("tr"));
					  var link = "<%=request.getContextPath()%>/mx/system/department/edit?deptId="+dataItem.deptId;
					  editRow(link);
				        }
                    }]
          }
		],
        "scrollable": {},
        "resizable": true,
        "groupable": false
    });
  });


    function deptUsers(link){
		jQuery.layer({
			type: 2,
			maxmin: true,
			shadeClose: true,
			title: "部门用户",
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
        editRow('<%=request.getContextPath()%>/mx/system/department/edit');
	}

    function editRow(link){
		//alert(link);
		jQuery.layer({
			type: 2,
			maxmin: true,
			shadeClose: true,
			title: "编辑部门信息",
			closeBtn: [0, true],
			shade: [0.8, '#000'],
			border: [10, 0.3, '#000'],
			offset: ['20px',''],
			fadeIn: 100,
			area: ['520px', (jQuery(window).height() - 50) +'px'],
            iframe: {src: link}
		});
	}


 </script>
</head>
<body>
<div id="main_content" class="k-content">
<div class="x_content_title"><img
	src="<%=request.getContextPath()%>/images/window.png" alt="部门列表">&nbsp;
部门列表</div>
<br>
<div id="grid"></div>
</div>     
</body>
</html>