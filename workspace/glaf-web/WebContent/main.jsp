<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="com.glaf.base.modules.sys.model.*"%>
<%
	String contextPath = request.getContextPath();
	com.glaf.base.utils.ContextUtil.setContextPath(contextPath);
	com.glaf.core.util.ContextUtils.setContextPath(contextPath);
	SysUser user = com.glaf.base.utils.RequestUtil.getLoginUser(request);
	if (user != null) {
		if(user.getAccountType() == 1){
		    response.sendRedirect(request.getContextPath() + "/mx/website/main");
		} else {
			response.sendRedirect(request.getContextPath() + "/mx/my/home");
		}
	} else {
		response.sendRedirect(request.getContextPath() + "/mx/login");
	}
%>