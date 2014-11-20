<%
    String my_theme = com.glaf.core.util.RequestUtils.getTheme(request);
	if(my_theme == null){
		my_theme="default";
	} else if("default".equals(my_theme)){
		my_theme="blueopal";
	} else if("gray".equals(my_theme)){
		my_theme="default";
	} else if("sunny".equals(my_theme)){
		my_theme="default";
	} else if("metro".equals(my_theme)){
		my_theme="metro";
	} else if("bootstrap".equals(my_theme)){
		my_theme="bootstrap";
	}
    request.setAttribute("my_theme", my_theme);
%>
<link href="<%=request.getContextPath()%>/static/scripts/kendoui/styles/kendo.common.min.css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/scripts/kendoui/styles/kendo.rtl.min.css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/scripts/kendoui/styles/kendo.${my_theme}.min.css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/scripts/kendoui/styles/kendo.dataviz.min.css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/scripts/kendoui/styles/kendo.dataviz.${my_theme}.min.css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/scripts/kendoui/styles/kendo.mobile.all.min.css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/scripts/layer/skin/layer.css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/themes/default/styles.css" rel="stylesheet" type="text/css" >
<link href="<%=request.getContextPath()%>/css/icons.css" rel="stylesheet" type="text/css" >
<link href="<%=request.getContextPath()%>/css/kendoui.css" rel="stylesheet" type="text/css" >
<script type="text/javascript" src="<%=request.getContextPath()%>/static/scripts/kendoui/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery.form.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/scripts/kendoui/js/angular.min.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/static/scripts/kendoui/js/kendo.all.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/scripts/kendoui/js/kendo.timezones.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/scripts/kendoui/js/cultures/kendo.culture.zh-CN.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/scripts/kendoui/js/messages/kendo.messages.zh-CN.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/scripts/layer/layer.min.js"></script>