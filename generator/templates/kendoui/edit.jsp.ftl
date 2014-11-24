<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*"%>
<%@ page import="com.glaf.core.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro"%>
<%@ taglib uri="http://www.kendoui.com/jsp/tags" prefix="kendo"%>
<%
    String theme = com.glaf.core.util.RequestUtils.getTheme(request);
    request.setAttribute("theme", theme);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑${classDefinition.title}信息</title>
<%@ include file="/WEB-INF/views/inc/init_kendoui.jsp"%>
<style scoped>

   .k-textbox {
        width: 11.8em;
    }

    .demo-section {
        width: 800px;
        padding: 0;
     }

     #tickets form {
        padding: 30px;
        margin-left: 150px;
    }
    #tickets h3 {
        font-weight: normal;
        font-size: 1.4em;
        margin: 0;
        padding: 0 0 20px;
    }

    #tickets ul {
        list-style-type: none;
        margin: 0;
        padding: 0;
    }
    #tickets li {
        margin: 5px 0;
    }

    label {
        display: inline-block;
        width: 100px;
        text-align: right;
        padding-right: 10px;
    }

    .required {
        font-weight: bold;
    }

    .accept, .status {
        padding-left: 90px;
    }
    .confirm {
        text-align: right;
    }

    .valid {
        color: green;
    }

    .invalid {
        color: red;
    }
    span.k-tooltip {
        margin-left: 6px;
    }
</style>
<script type="text/javascript">
                
  jQuery(function() {
    var viewModel = kendo.observable({
  <#if pojo_fields?exists>
	<#list  pojo_fields as field>
        "${field.name}": "#F{${modelName}.${field.name}}",
	</#list>
  </#if>
        "${idField.name}": "#F{${modelName}.${idField.name}}"
    });

    kendo.bind($("#iForm"), viewModel);

   });

    $(document).ready(function() {
          $("#iconButton").kendoButton({
                spriteCssClass: "k-icon"
          });           
    });

    $(function () {
        var container = $("#iForm");
        kendo.init(container);
        container.kendoValidator({
                rules: {
                      greaterdate: function (input) {
                            if (input.is("[data-greaterdate-msg]") && input.val() != "") {                                    
                               var date = kendo.parseDate(input.val()),
                               otherDate = kendo.parseDate($("[name='" + input.data("greaterdateField") + "']").val());
                               return otherDate == null || otherDate.getTime() < date.getTime();
                             }

                             return true;
                          }
                      }
        });
    });

   function save(){
       var form = document.getElementById("iForm");
       var validator = $("#iForm").data("kendoValidator");
       if (validator.validate()) {
	   form.method="post";
	   form.action = "<%=request.getContextPath()%>/mx/${classDefinition.moduleName}/${modelName}/save${entityName}";
	   form.submit();
       }
   }
 </script>
</head>
<body style="margin-top:0px;">
<div id="main_content" class="k-content ">
<br>
<div class="x_content_title"><img
	src="<%=request.getContextPath()%>/images/window.png" alt="编辑${classDefinition.title}信息">&nbsp;
编辑${classDefinition.title}信息</div>
<br>
<form id="iForm" name="iForm" method="post" data-role="validator" novalidate="novalidate">
<input type="hidden" id="${idField.name}" name="${idField.name}" value="#F{${modelName}.${idField.name}}"/>
<table width="95%" align="center" border="0" cellspacing="0" cellpadding="5">
 <#if pojo_fields?exists>
    <#list  pojo_fields as field>	
    <#if field.editable>
    <tr>
	<td width="2%" align="left">&nbsp;</td>
	<td align="left">
	<label for="${field.name}" class="required">${field.title}&nbsp;</label>
	<#if field.type?exists && field.type== 'Date'>
	<input id="${field.name}" name="${field.name}" type="text" class="k-textbox" data-type="date" data-role='datepicker'
	  <#if field.nullable == false> required="true" </#if> data-bind="value: ${field.name}"
	       value="<fmt:formatDate value="#F{${modelName}.${field.name}}" pattern="yyyy-MM-dd"/>" 
	       validationMessage="请输入${field.title}"/>
        <#elseif field.type?exists && field.type== 'Integer'>
	<input id="${field.name}" name="${field.name}" type="text" class="k-textbox" 
	  <#if field.nullable == false> required="true"  </#if> data-bind="value: ${field.name}"
	       value="#F{${modelName}.${field.name}}" validationMessage="请输入${field.title}"/>
	<#elseif field.type?exists && field.type== 'Long'>
	<input id="${field.name}" name="${field.name}" type="text" class="k-textbox"
	    <#if field.nullable == false> required="true"  </#if> data-bind="value: ${field.name}"
	       value="#F{${modelName}.${field.name}}" validationMessage="请输入${field.title}"/>
	<#elseif field.type?exists && field.type== 'Double'>
	<input id="${field.name}" name="${field.name}" type="text" class="k-textbox" 
	  <#if field.nullable == false> required="true"  </#if> data-bind="value: ${field.name}"
	       value="#F{${modelName}.${field.name}}" validationMessage="请输入${field.title}"/>
	<#else>
        <input id="${field.name}" name="${field.name}" type="text" class="k-textbox"  
	  <#if field.nullable == false> required="true"  </#if> data-bind="value: ${field.name}"
	   value="#F{${modelName}.${field.name}}" validationMessage="请输入${field.title}"/>
	</#if>
	<span class="k-invalid-msg" data-for="${field.name}"></span>
	</td>
    </tr>
  </#if>	 
 </#list>
</#if>
	   
  <!-- <tr>
        <td class="input-box2" valign="top">是否有效</td>
        <td>
	  <input type="radio" name="status" id="engine1" class="k-radio" value="0" >
	  <label class="k-radio-label" for="engine1">有效</label>&nbsp;&nbsp;
	  <input type="radio" name="status" id="engine2" class="k-radio" value="1" >
	  <label class="k-radio-label" for="engine2">无效</label>
	</td>
    </tr> -->
 
    <tr>
        <td colspan="2" align="center" valign="bottom" height="30">&nbsp;
        <div>
          <button type="button" id="iconButton"  class="k-button k-primary" style="width: 90px" onclick="javascript:save();">保存</button>
	</div>
	</td>
      </tr>
</table>   
</form>
</div>     
<script>
    jQuery(document).ready(function() {
 <#if pojo_fields?exists>
    <#list  pojo_fields as field>	
      <#if field.editable>
	<#if field.type?exists && field.type== 'Date'>
						  
        <#elseif field.type?exists && field.type== 'Integer'>
	    jQuery("#${field.name}").kendoNumericTextBox();			 
	<#elseif field.type?exists && field.type== 'Long'>
	    jQuery("#${field.name}").kendoNumericTextBox();			 
	<#elseif field.type?exists && field.type== 'Double'>
	    jQuery("#${field.name}").kendoNumericTextBox();		 
	<#else>
        </#if>
  </#if>	 
 </#list>
</#if>        
    });
</script>
</body>
</html>