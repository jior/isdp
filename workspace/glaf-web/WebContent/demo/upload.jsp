<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>upload</title>
<link href="../scripts/easyui/themes/gray/easyui.css" rel="stylesheet" type="text/css" />
<link href="../icons/styles.css" rel="stylesheet" type="text/css" />
<link href="../scripts/artDialog/skins/default.css" rel="stylesheet" />
<script type="text/javascript" src="../scripts/jquery.min.js"></script>
<script type="text/javascript" src="../scripts/jquery.form.js"></script>
<script type="text/javascript" src="../scripts/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../scripts/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type='text/javascript' src="../scripts/easyui/jquery.edatagrid.js"></script>
<script type="text/javascript" src="../scripts/artDialog/artDialog.js"></script>
<script type="text/javascript" src="../scripts/artDialog/plugins/iframeTools.js"></script>
<script type='text/javascript' src="../scripts/glaf-base.js"></script>
<script type="text/javascript">
  
    var contextPath="<%=request.getContextPath()%>";

</script>
</head>
<body>
<form id="iForm" name="iForm" method="post"  > 
  <input type="text" name="xx"><br><br>
  <input type="button" name="upload" value="文件上传1" onclick="javascript:uploadFile(2, 2, 1);" >
  <input type="button" name="upload" value="文件上传2" onclick="javascript:uploadFile(2, 2, 2);" >
  <jsp:include page="/others/attachment.do?method=showCount">
     <jsp:param name="referType" value="2" />  
	 <jsp:param name="referId" value="2" />  
  </jsp:include>
</form>
</body>
</html>