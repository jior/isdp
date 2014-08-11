<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="com.glaf.base.modules.sys.model.*"%>
<%
    String actorId = com.glaf.core.util.RequestUtils.getActorId(request);
	SysUser user = com.glaf.base.utils.RequestUtil.getLoginUser(request);
	//System.out.println("->user.getAccountType():"+user.getAccountType());
	if(user.getAccountType() == 1){
%>
	<script type="text/javascript">
		location.href="<%=request.getContextPath()%>/mx/website/main";
	</script>
<%}else{%>
	<script type="text/javascript">
		location.href="<%=request.getContextPath()%>/mx/my/home";
	</script>
<%}%>