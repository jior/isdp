﻿var userAgent = navigator.userAgent.toLowerCase();
var isSafari = userAgent.indexOf("Safari")>=0;
var is_opera = userAgent.indexOf('opera') != -1 && opera.version();
var is_moz = (navigator.product == 'Gecko') && userAgent.substr(userAgent.indexOf('firefox') + 8, 3);
var is_ie = (userAgent.indexOf('msie') != -1 && !is_opera) && userAgent.substr(userAgent.indexOf('msie') + 5, 3);

var contextPath = "/glaf";

function getOpener() {
   if(is_moz){
      return window.opener;
   }
   else{
      return parent.dialogArguments;
   }
}

function openWindow(URL, parent, x, y, width, height)
{
  if(is_ie){
     window.showModalDialog(URL,parent,"edge:raised;scroll:0;status:0;help:0;resizable:0;dialogWidth:"+width+"px;dialogHeight:"+height+"px;dialogTop:"+y+"px;dialogLeft:"+x+"px",true);
  }
  else {
	 var f = "height="+height+",width="+width+",status=0,toolbar=no,menubar=no,location=no,scrollbars=yes,top="+y+",left="+x+",resizable=no,modal=yes,dependent=yes,dialog=yes,minimizable=no";
     window.open(URL, parent, f, true);
  }
}

function selectRole(formName, elementId, elementName){
    var x_selected =  document.getElementById(elementId);
    var url=contextPath+"/mx/base/identityChoose/chooseRoles?formName="+formName+"&elementId="+elementId+"&elementName="+elementName;
    if(x_selected != null && x_selected.value != ""){
	    url = url + "&selecteds="+x_selected.value;
    }
    var x=200;
    var y=150;
    if(is_ie) {
	    x=document.body.scrollLeft+event.clientX-event.offsetX-100;
	    y=document.body.scrollTop+event.clientY-event.offsetY+70;
     }
     openWindow(url,self,x, y, 498, 420);
 }

 function selectUsers(formName, elementId, elementName, deptId, roleId){
    var x_selected =  document.getElementById(elementId);
    var url=contextPath+"/mx/base/identityChoose/chooseUsers?formName="+formName+"&elementId="+elementId+"&elementName="+elementName+"&deptId="+deptId+"&roleId="+roleId;
    if(x_selected != null && x_selected.value != ""){
	    url = url + "&selecteds="+x_selected.value;
    }
    var x=150;
    var y=100;
    if(is_ie) {
	    x=document.body.scrollLeft+event.clientX-event.offsetX-100;
	    y=document.body.scrollTop+event.clientY-event.offsetY+70;
     }
     openWindow(url,self,x, y, 458, 380);
 }

function selectDept(formName, elementId, elementName){
    var x_selected =  document.getElementById(elementId);
    var url=contextPath+"/mx/base/identityChoose/chooseDepts?code=012&formName="+formName+"&elementId="+elementId+"&elementName="+elementName;
    if(x_selected != null && x_selected.value != ""){
	    url = url + "&selecteds="+x_selected.value;
    }
    var x=150;
    var y=50;
    if(is_ie) {
	    x=document.body.scrollLeft+event.clientX-event.offsetX-200;
	    y=document.body.scrollTop+event.clientY-event.offsetY-200;
     }
     openWindow(url,self,x, y, 565, 600);
}

function selectDept(formName, elementId, elementName, exclusive){
    var x_selected =  document.getElementById(elementId);
    var url=contextPath+"/mx/base/identityChoose/chooseDepts?code=012&formName="+formName+"&elementId="+elementId+"&elementName="+elementName;
    if(x_selected != null && x_selected.value != ""){
	    url = url + "&selecteds="+x_selected.value;
    }
	if(exclusive != null){
		url = url + "&exclusive="+exclusive;
	}
    var x=150;
    var y=50;
    if(is_ie) {
	    x=document.body.scrollLeft+event.clientX-event.offsetX-200;
	    y=document.body.scrollTop+event.clientY-event.offsetY-200;
     }
     openWindow(url,self,x, y, 565, 600);
}

function selectTreeNode(treeCode, formName, elementId, elementName, exclusive){
    var x_selected =  document.getElementById(elementId);
    var url = contextPath+"/mx/base/identityChoose/chooseTrees?code="+treeCode+"?formName="+formName+
		        "&elementId="+elementId+"&elementName="+elementName;
    if(x_selected != null && x_selected.value != ""){
	    url = url + "&selecteds="+x_selected.value;
    }
	if(exclusive != null){
		url = url + "&exclusive="+exclusive;
	}
    var x=150;
    var y=50;
    if(is_ie) {
	    x=document.body.scrollLeft+event.clientX-event.offsetX-200;
	    y=document.body.scrollTop+event.clientY-event.offsetY-200;
     }
     openWindow(url,self,x, y, 565, 600);
}

function selectUser(formName, elementId, elementName){
	var x_selected =  document.getElementById(elementId);
    var url = contextPath+"/mx/base/identityChoose/chooseUsers?code=012&formName="+formName+"&elementId="+elementId+"&elementName="+elementName;
    if(x_selected != null && x_selected.value != ""){
	    url = url + "&selecteds="+x_selected.value;
    }
    var x=150;
    var y=50;
    if(is_ie) {
	    x=document.body.scrollLeft+event.clientX-event.offsetX-200;
	    y=document.body.scrollTop+event.clientY-event.offsetY-200;
     }
    openWindow(url,self,x, y, 565, 600);
}

function selectUser(formName, elementId, elementName, exclusive){
	var x_selected =  document.getElementById(elementId);
    var url = contextPath+"/mx/base/identityChoose/chooseUsers?code=012&formName="+formName+"&elementId="+elementId+"&elementName="+elementName;
    if(x_selected != null && x_selected.value != ""){
	    url = url + "&selecteds="+x_selected.value;
    }
	if(exclusive != null){
		url = url + "&exclusive="+exclusive;
	}
    var x=150;
    var y=50;
    if(is_ie) {
	    x=document.body.scrollLeft+event.clientX-event.offsetX-200;
	    y=document.body.scrollTop+event.clientY-event.offsetY-200;
     }
    openWindow(url,self,x, y, 565, 600);
}

/**
选择基础数据
**/
function selectData(dataCode, referId, referTitle, referCode,parent){
	var url = contextPath+"/mx/sys/dictory/showDictData?code="+dataCode+"&parent="+parent;
	var features="dialogHeight:310px; dialogWidth:360px; center: yes; resizable: no; status: no; help:no";
	var ret = window.showModalDialog(url, window, features);
	if(ret!=null){
		if(referId!=null) referId.value=ret[0];
		if(referTitle!=null) referTitle.value=ret[1];
		if(referCode!=null) referCode.value=ret[2];
	}
}

/**
上传下载附件
**/
function uploadFile(referType, referId, viewType){
	var link = contextPath+"/mx/others/attachment/showList?referType=" + referType + "&referId=" + referId + "&viewType="+viewType;
	art.dialog.open(link, { height: 300, width: 500, title: "上传下载", lock: true, scrollbars:"no" }, false);
}
	 
 