/** �������
delete from sys_access;
delete from sys_function;
delete from sys_department;
delete from sys_application;
delete from sys_tree;
delete from sys_dictory;
delete from sys_dictory_def;
delete from sys_dbid;
delete from sys_property;
delete from sys_workcalendar;
delete from sys_params;
delete from sys_input_def;

**/



/*��ʼ����ɫ��Ϣ*/
insert into net_role (rolename, content, tasksort, code) values ('ϵͳ����Ա', '', 1, 'SystemAdministrator');
insert into net_role (rolename, content, tasksort, code) values ('���Ź���Ա', '', 10, 'R006');
insert into net_role (rolename, content, tasksort, code) values ('�ּ�����Ա', '', 2, 'BranchAdmin');



/*��ʼϵͳ����Ϣ*/
insert into sys_tree (id, parent, name, nodedesc, sort, code, treeId) values (1, 0, '/', '��Ŀ¼', 1, '0', '1|');
insert into sys_tree (id, parent, name, nodedesc, sort, code, treeId) values (2, 1, '���ݽṹ', '', 20, '01', '1|2|');
insert into sys_tree (id, parent, name, nodedesc, sort, code, treeId) values (3, 1, 'Ӧ��ģ��', '', 10, '02', '1|3|');
insert into sys_tree (id, parent, name, nodedesc, sort, code, treeId) values (4, 2, '��������', '', 50, '011', '1|2|4|');
insert into sys_tree (id, parent, name, nodedesc, sort, code, discriminator) values (5, 2, '���Žṹ', '���Žṹ', 40, '012','D');
insert into sys_tree (id, parent, name, nodedesc, sort, code, discriminator) values (6, 5, 'ϵͳ����', 'ϵͳ����', 284, 'JS000','D');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (8, 3, 'ϵͳ����', 'ϵͳ����', 5, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (10, 3, '��ȫ����', '��ȫ����', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (11, 8, 'ϵͳĿ¼', 'ϵͳĿ¼', 20, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (12, 10, '���Ź���', '���Ź���', 20, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (14, 10, '��ɫ����', '��ɫ����', 15, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (15, 10, 'ģ�����', 'ģ�����', 12, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (16, 8, '�ֵ����', '�ֵ����', 16, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (17, 8, '�������', '�������', 17, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (18, 8, '��������', '��������', 18, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (19, 8, 'ģ�����', 'ģ�����', 19, 'template');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (20, 8, '���ݹ���', '���ݹ���', 20, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (21, 8, '��������', '��������', 21, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (30, 8, '�ļ�����', '�ļ�����', 30, '');


insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (42, 3, 'ͳ�Ʊ���', 'ͳ�Ʊ���', 42, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (43, 42, '��ѯ����', '��ѯ����', 43, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (44, 42, '�����', '�����', 44, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (45, 42, 'ͼ�����', 'ͼ�����', 45, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (46, 42, '�������', '�������', 46, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (47, 42, '�����͹���', '�����͹���', 47, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (48, 42, '���ȹ���', '���ȹ���', 48, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (49, 42, '�������', '�������', 49, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (50, 42, '��������', '��������', 50, '');
 

insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (53, 3, 'Activiti���̹���', 'Activiti���̹���', 53, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (54, 53, '�������̰�', '�������̰�', 54, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (55, 53, '���̶���', '���̶���', 55, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (56, 53, '����ʵ��', '����ʵ��', 56, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (57, 53, '��ʷ����ʵ��', '��ʷ����ʵ��', 57, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (58, 53, '�����б�', '�����б�', 58, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (59, 53, '������ʾ', '������ʾ', 59, '');

insert into sys_tree (id, parent, name, nodedesc, sort, code) values (308, 19, '��ӡģ��', '��ӡģ��', 0, 'print_tpl');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (312, 19, '�ʼ�ģ��', '�ʼ�ģ��', 0, 'mail_tpl');
 
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (449, 8, '��������', '��������', 449, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (450, 8, 'ϵͳ����', 'ϵͳ����', 450, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (452, 8, '�ʼ���������', '�ʼ���������', 452, '');

insert into sys_tree (id, parent, name, nodedesc, sort, code) values (494, 8, 'TODO����', 'TODO����', 494, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (495, 8, '���ȹ���', '���ȹ���', 495, '');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (498, 4, '��������', '��������', 498, 'money');
insert into sys_tree (id, parent, name, nodeDesc, sort, code) values (499, 4, '�˻�����', '�˻�����', 499, 'AccountType');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (512, 10, '��Ȩ����', '��Ȩ����', 512, '');


insert into sys_tree (id, parent, name, nodedesc, sort, code) values (701, 3, '���ݹ���', '���ݹ���', 0, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (702, 701, '���Ź���', '���Ź���', 0, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (703, 701, '�������', '�������', 0, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code, treeId) values (720, 1, '���ݹ������', '', 0, '', '1|720|');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (721, 720, '����', '����', 0, 'news');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (722, 721, '��˾����', '��˾����', 0, 'news_01');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (723, 721, 'ҵ������', 'ҵ������', 0, 'news_02');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (731, 720, '����', '����', 0, 'bulletin');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (732, 731, '��ͨ', '', 0, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (733, 731, '��Ҫ', '', 0, '');


insert into sys_tree (id, parent, name, nodedesc, sort, code) values (801, 3, 'UI����', 'UI����', 0, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (802, 801, '���ֹ���', '���ֹ���', 0, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (803, 801, '�������', '�������', 0, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (804, 801, 'portal����', 'portal����', 0, '');


insert into sys_tree (id, parent, name, nodedesc, sort, code) values (901, 3, '��������', '��������', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (902, 901, '�޸�����', '�޸�����', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (903, 901, '�޸ĸ�����Ϣ', '�޸ĸ�����Ϣ', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (904, 901, '��ҳ���', '��ҳ���', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (905, 901, '��ҳ����', '��ҳ����', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (906, 901, 'portal����', 'portal����', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (907, 901, '�շ���Ϣ', '�շ���Ϣ', 30, '');

insert into sys_tree (id, parent, name, nodedesc, sort, code) values (941, 3, '��ʾģ��', '��ʾģ��', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (942, 941, '�ּ�����', '�ּ�����', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (943, 941, '�û�����', '�û�����', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (944, 941, '��ɫ����', '��ɫ����', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (945, 941, '��������', '��������', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (946, 941, 'ģ������', 'ģ������', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (947, 941, '�ֵ�����', '�ֵ�����', 30, '');
insert into sys_tree (id, parent, name, nodedesc, sort, code) values (948, 941, '��������', '��������', 30, '');

/*��ʼ��������Ϣ*/
insert into sys_department (id, name, deptdesc, createtime, sort, deptno, code, code2, status, fincode, nodeid) values (1, 'ϵͳ����', 'ϵͳ����', null, 284, 'SYS000', 'SYS', 'S', 0, 'SYS000', 6);
 
/*��ʼ���û���Ϣ*/
insert into UserInfo (UserID,  UserName, password, depId, status, issystem ) values ('root', 'ϵͳ����Ա', '111111', 0, '0', '1');

/*��ʼ��Ӧ����Ϣ*/
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (3, 'Ӧ��ģ��', 'Ӧ��ģ��', '', 3, 1, 3);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (8, 'ϵͳ����', 'ϵͳ����', '', 5, 1, 8);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (9, '��������', '��������', '', 30, 1, 4);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (10, '��ȫ����', '', '', 14, 2, 10);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (11, 'ϵͳĿ¼', '', '/mx/sys/tree/showMain', 10, 2, 11);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (12, '���Ź���', '', '/mx/sys/department/showFrame', 20, 2, 12);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (14, '��ɫ����', '', '/mx/sys/role/showList', 15, 2, 14);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (15, 'ģ�����', '', '/mx/sys/application/showFrame', 12, 2, 15);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (16, '�ֵ����', '', '/mx/sys/dictory/showFrame', 15, 2, 16);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (17, '�������', '', '/mx/sys/cacheMgr', 15, 2, 17);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (18, '��������', '', '/mx/sys/sequence', 15, 2, 18);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (19, 'ģ�����', '', '/mx/sys/template/showFrame', 15, 2, 19);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (20, '���ݹ���', '', '/mx/sys/table', 10, 2, 20);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (21, '��������', '', '/mx/sys/dictory/loadDictory', 10, 2, 21);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (30, '�ļ�����', '', '/webfile/jsp/main.jsp', 10, 2, 30);

insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (449, '��������', '��������', '/mx/sys/workCalendar/showList', 449, 1, 449);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (450, 'ϵͳ����', 'ϵͳ����', '/mx/sys/property/edit?category=SYS', 450, 1, 450);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (452, '�ʼ���������', '�ʼ���������', '/mx/sys/mailConfig', 452, 1, 452);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (512, '��Ȩ����', '', '/mx/sys/sysUserRole/showUsers', 512, 2, 512);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (494, 'TODO����', '', '/mx/sys/todo/showList', 494, 1, 494);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (495, '���ȹ���', '', '/mx/sys/scheduler/showList', 495, 1, 495);

insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (42, 'ͳ�Ʊ���', 'ͳ�Ʊ���', '', 42, 1, 42);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (43, '��ѯ����', '', '/mx/dts/query', 43, 1, 43);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (44, '�����', '�����', '/mx/dts/table', 44, 1, 44);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (45, 'ͼ�����', 'ͼ�����', '/mx/bi/chart', 45, 1, 45);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (46, '�������', '�������', '/mx/bi/report', 46, 1, 46);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (47, '�����͹���', '�����͹���', '/mx/bi/reportTask', 47, 1, 47);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (48, '���ȹ���', '���ȹ���', '/mx/dts/scheduler', 48, 1, 48);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (49, '�������', '�������', '/mx/dts/task', 49, 1, 49);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (50, '��������', '��������', '/mx/sys/property/edit?category=RPT', 50, 1, 50);
 

insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (53, 'Activiti���̹���', 'Activiti���̹���', '', 53, 1, 53);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (54, '�������̰�', '', '/mx/activiti/deploy', 54, 1, 54);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (55, '���̶���', '���̶���', '/mx/activiti/process/processDefinitions', 55, 1, 55);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (56, '����ʵ��', '����ʵ��', '/mx/activiti/process/processInstances', 56, 1, 56);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (57, '��ʷ����ʵ��', '��ʷ����ʵ��', '/mx/activiti/history/historyProcessInstances', 57, 1, 57);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (58, '�����б�', '�����б�', '/mx/activiti/task/taskList', 58, 1, 58);
insert into sys_application (id, name, appDesc, url, sort, showMenu, nodeId) values (59, '������ʾ', '������ʾ', '/workflow/activiti/index.jsp', 59, 1, 59);

insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid, code) values (71, '���ݹ���', '', '', 1, 1, 701, null);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid, code) values (72, '���Ź���', '', '/mx/cms/info?serviceKey=news', 2, 1, 702, null);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid, code) values (73, '�������', '', '/mx/cms/info?serviceKey=bulletin', 3, 1, 703, null);


insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid, code) values (801, 'UI����', '', '', 1, 1, 801, null);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid, code) values (802, '���ֹ���', '', '/mx/layout', 2, 1, 802, null);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid, code) values (803, '�������', '', '/mx/panel?isSystem=true', 3, 1, 803, null);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid, code) values (804, 'portal����', '', '/mx/user/portal?edit=true', 3, 1, 804, null);


insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (901, '��������', '', '', 15, 2, 901);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (902, '�޸�����', '', '/mx/identity/user/prepareModifyPwd', 15, 2, 902);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (903, '�޸ĸ�����Ϣ', '', '/mx/identity/user/prepareModifyInfo', 15, 2, 903);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (904, '��ҳ���', '', '/mx/panel', 15, 2, 904);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (905, '��ҳ����', '', '/mx/layout', 15, 2, 905);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (906, 'portal����', '', '/mx/user/portal?edit=true', 15, 2, 906);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (907, '�շ���Ϣ', '', '/mx/workspace/message/showReceiveList', 15, 2, 907);


insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (941, '��ʾģ��', '', '', 15, 2, 941);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (942, '�ּ�����', '', '/mx/branch/department', 15, 2, 942);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (943, '�û�����', '', '/mx/sys/user/deptUsers', 15, 2, 943);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (944, '��ɫ����', '', '/mx/sys/role', 15, 2, 944);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (945, '��������', '', '/mx/sys/department', 15, 2, 945);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (946, 'ģ������', '', '/mx/sys/application', 15, 2, 946);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (947, '�ֵ�����', '', '/mx/sys/dictory', 15, 2, 947);
insert into sys_application (id, name, appdesc, url, sort, showmenu, nodeid) values (948, '��������', '', '/mx/sys/tree', 15, 2, 948);



/*�����û���ɫ*/
insert into userrole (id, userid, roleid, authorized, authorizefrom) values (2, 1, 1, 0, 1);
 
 
/*�������Ȩ��*/
insert into sys_access (roleid, appid) values (1, 3);
insert into sys_access (roleid, appid) values (1, 8);
insert into sys_access (roleid, appid) values (1, 9);
insert into sys_access (roleid, appid) values (1, 10);
insert into sys_access (roleid, appid) values (1, 11);
insert into sys_access (roleid, appid) values (1, 12);
insert into sys_access (roleid, appid) values (1, 14);
insert into sys_access (roleid, appid) values (1, 15);
insert into sys_access (roleid, appid) values (1, 16);
insert into sys_access (roleid, appid) values (1, 20);
insert into sys_access (roleid, appid) values (1, 21);
insert into sys_access (roleid, appid) values (1, 22);
insert into sys_access (roleid, appid) values (1, 26);

insert into sys_access (roleid, appid) values (1, 449);
insert into sys_access (roleid, appid) values (1, 512); 
insert into sys_access (roleid, appid) values (1, 494); 
insert into sys_access (roleid, appid) values (1, 495); 

/*����ϵͳ����*/

insert into sys_function (id, name, funcdesc, funcmethod, sort, appid, code) values (1, 'ģ���б�', 'ģ���б�', 'com.glaf.base.modules.sys.springmvc.SysApplicationController.showList', 1, 15, 'app:list');
insert into sys_function (id, name, funcdesc, funcmethod, sort, appid, code) values (2, '����ģ��', '����ģ��', 'com.glaf.base.modules.sys.springmvc.SysApplicationController.prepareAdd', 2, 15, 'app:create');
insert into sys_function (id, name, funcdesc, funcmethod, sort, appid, code) values (3, '�޸�ģ��', '�޸�ģ��', 'com.glaf.base.modules.sys.springmvc.SysApplicationController.prepareModify', 3, 15, 'app:update');
insert into sys_function (id, name, funcdesc, funcmethod, sort, appid, code) values (4, 'ɾ��ģ��', 'ɾ��ģ��', 'com.glaf.base.modules.sys.springmvc.SysApplicationController.batchDelete', 4, 15, 'app:delete');

insert into sys_permission (roleid, funcid) values (1, 1);
insert into sys_permission (roleid, funcid) values (1, 2);
insert into sys_permission (roleid, funcid) values (1, 3);
insert into sys_permission (roleid, funcid) values (1, 4);

insert into sys_dictory (id, typeId, code, name, sort, dictDesc, blocked, ext1, ext2) values (1, 498, 'CNY', '�����', 1, null, 0, '', '');
insert into sys_dictory (id, typeId, code, name, sort, dictDesc, blocked, ext1, ext2) values (2, 498, 'USD', '��Ԫ', 2, null, 0, '', '');
insert into sys_dictory (id, typeId, code, name, sort, dictDesc, blocked, ext1, ext2) values (3, 498, 'JPY', '��Ԫ', 3, null, 0, '', '');
insert into sys_dictory (id, typeId, code, name, sort, dictDesc, blocked, ext1, ext2) values (4, 498, 'HKD', '�۱�', 4, null, 0, '', '');
insert into sys_dictory (id, typeId, code, name, sort, dictDesc, blocked, ext1, ext2) values (5, 498, 'EUR', 'ŷԪ', 5, null, 0, '', '');
 
insert into sys_dictory (id, typeId, code, name, sort, dictDesc, blocked, value) values (11, 499, '0', 'Ĭ��', 1, null, 0, '/mx/my/main');
insert into sys_dictory (id, typeId, code, name, sort, dictDesc, blocked, value) values (12, 499, '1', '��վ', 2, null, 0, '/website/main');
insert into sys_dictory (id, typeId, code, name, sort, dictDesc, blocked, value) values (13, 499, '2', '΢��', 3, null, 0, '/mx/wechat/main');



insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (4,  0, 'ext1',  'EXT1', '',  'String', 200, 3, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (5,  0, 'ext2',  'EXT2', '',  'String', 200, 4, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (6,  0, 'ext3',  'EXT3', '',  'String', 200, 5, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (7,  0, 'ext4',  'EXT4', '',  'String', 200, 5, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (8,  0, 'ext5',  'EXT5', '',  'Date', 20, 7, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (9,  0, 'ext6',  'EXT6', '',  'Date', 20, 8, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (10, 0, 'ext7',  'EXT7', '',  'Date', 20, 9, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (11, 0, 'ext8',  'EXT8', '',  'Date', 20, 10, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (12, 0, 'ext9',  'EXT9', '',  'Date', 20, 11, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (13, 0, 'ext10', 'EXT10', '', 'Date', 20, 12, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (14, 0, 'ext11', 'EXT11', '', 'Long', 20, 13, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (15, 0, 'ext12', 'EXT12', '', 'Long', 20, 14, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (16, 0, 'ext13', 'EXT13', '', 'Long', 20, 15, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (17, 0, 'ext14', 'EXT14', '', 'Long', 20, 16, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (18, 0, 'ext15', 'EXT15', '', 'Long', 20, 17, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (19, 0, 'ext16', 'EXT16', '', 'Double', 20, 18, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (20, 0, 'ext17', 'EXT17', '', 'Double', 20, 19, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (21, 0, 'ext18', 'EXT18', '', 'Double', 20, 20, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (22, 0, 'ext19', 'EXT19', '', 'Double', 20, 21, 0, 'sys_dictory');
insert into sys_dictory_def (id, nodeid, name, columnname, title, type, length, sort, required, target) values (23, 0, 'ext20', 'EXT20', '', 'Double', 20, 22, 0, 'sys_dictory');

insert into sys_dbid(name_, title_, value_, version_) values ('next.dbid', 'ϵͳ��������', '1001', 1);

insert into sys_property (id_, description_, locked_, name_, title_, type_, value_, category_, initvalue_) values ('1', 'ϵͳ����', 0, 'res_system_name', 'ϵͳ����', null, 'GLAF����Ӧ�ÿ��', 'SYS', null);
insert into sys_property (id_, description_, locked_, name_, title_, type_, value_, category_, initvalue_) values ('2', 'ϵͳ�汾', 0, 'res_version', 'ϵͳ�汾', null, 'V3.0', 'SYS', null);
insert into sys_property (id_, description_, locked_, name_, title_, type_, value_, category_, initvalue_) values ('3', '��Ȩ��Ϣ', 0, 'res_copyright', '��Ȩ��Ϣ', null, 'GLAF ��Ȩ����', 'SYS', null);
insert into sys_property (id_, description_, locked_, name_, title_, type_, value_, category_, initvalue_) values ('4', null, 0, 'res_mail_from', '�ʼ�������', null, 'admin@localhost', 'SYS', null);
insert into sys_property (id_, category_, description_, initvalue_, locked_, name_, title_, type_, value_, inputtype_) values ('5', 'SYS', '�޶�ÿ���˺�ֻ����һ����¼', '[{"name":"����","value":"true"},{"name":"������","value":"false"}]', 0, 'login_limit', 'ϵͳ��¼�˺�����', null, 'true', 'combobox');
insert into sys_property (id_, description_, locked_, name_, title_, type_, value_, category_, initvalue_) values ('6', '�����û����ʱ�䣨�룩', 0, 'login_time_check', '�����û����ʱ�䣨�룩', null, '600', 'SYS', null);
insert into sys_property (id_, description_, locked_, name_, title_, type_, value_, category_, initvalue_) values ('8', '�������ϵͳ��IP��ַ', 0, 'login.allow.ip', '�������ϵͳ��IP��ַ', null, '', 'SYS', null);
insert into sys_property (id_, category_, description_, initvalue_, locked_, name_, title_, type_, value_, inputtype_) values ('9', 'SYS', '�ļ��洢��ʽ', '[{"name":"���ݿ�","value":"DATABASE"},{"name":"Ӳ��","value":"DISK"}]', 0, 'fs_storage_strategy', '�ļ��洢��ʽ', null, 'DATABASE', 'combobox');
insert into sys_property (id_, category_, description_, initvalue_, locked_, name_, title_, type_, value_, inputtype_) values ('10', 'SYS', '�洢���ݵ�Mongodb', '[{"name":"��","value":"true"},{"name":"��","value":"false"}]', 0, 'fs_storage_mongodb', '�洢���ݵ�Mongodb', null, 'false', 'combobox');
insert into sys_property (id_, category_, description_, initvalue_, locked_, name_, title_, type_, value_, inputtype_) values ('11', 'SYS', '���ò�ѯ����', '[{"name":"��","value":"true"},{"name":"��","value":"false"}]', 0, 'use_query_cache', '���ò�ѯ����', null, 'false', 'combobox');
insert into sys_property (id_, description_, locked_, name_, title_, type_, value_, category_, initvalue_) values ('14', null, 0, 'res_mail_to_dev', '���ⱨ���������', null, 'jior2008@gmail.com', 'SYS', null);

insert into sys_property (id_, description_, locked_, name_, title_, type_, value_, category_, initvalue_) values ('101', '�����6λ���¸�ʽ��YYYYMM������201312', 0, 'curr_yyyymm', '��ǰ����', null, '', 'RPT', '${curr_yyyymm}');
insert into sys_property (id_, description_, locked_, name_, title_, type_, value_, category_, initvalue_) values ('102', '�����8λ���ڸ�ʽ��YYYYMMDD������20130630', 0, 'curr_yyyymmdd', '��ǰ����', null, '', 'RPT', '${curr_yyyymmdd}');
insert into sys_property (id_, description_, locked_, name_, title_, type_, value_, category_, initvalue_) values ('103', '�����ļ�·��', 0, 'dataDir', '�����ļ�·��', null, '', 'RPT', null);
insert into sys_property (id_, description_, locked_, name_, title_, type_, value_, category_, initvalue_) values ('104', '�����������£�${curr_yyyymm}��ʾ��ǰ�·�', 0, 'input_yyyymm', '������������', null, '', 'RPT', '');
insert into sys_property (id_, description_, locked_, name_, title_, type_, value_, category_, initvalue_) values ('105', '������������ڣ�${curr_yyyymmdd}-1��ʾ��ǰ���ڵ�ǰһ��', 0, 'input_yyyymmdd', '������������', null, '', 'RPT', '');
insert into sys_property (id_, description_, locked_, name_, title_, type_, value_, category_, initvalue_) values ('106', '�������ɸ�Ŀ¼', 0, 'report_save_path', '�������ɸ�Ŀ¼', null, '', 'RPT', null);


insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20140101, 1, 1, 2014);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20140501, 1, 5, 2014); 
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20140502, 2, 5, 2014);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20140503, 3, 5, 2014);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20141001, 1, 10, 2014);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20141002, 2, 10, 2014);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20141003, 3, 10, 2014);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20141004, 4, 10, 2014);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20141005, 5, 10, 2014);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20141006, 6, 10, 2014);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20141007, 7, 10, 2014);

insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20150101, 1, 1, 2015);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20150501, 1, 5, 2015); 
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20150502, 2, 5, 2015);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20150503, 3, 5, 2015);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20151001, 1, 10, 2015);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20151002, 2, 10, 2015);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20151003, 3, 10, 2015);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20151004, 4, 10, 2015);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20151005, 5, 10, 2015);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20151006, 6, 10, 2015);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20151007, 7, 10, 2015);

insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20160101, 1, 1, 2016);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20160501, 1, 5, 2016); 
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20160502, 2, 5, 2016);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20160503, 3, 5, 2016);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20161001, 1, 10, 2016);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20161002, 2, 10, 2016);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20161003, 3, 10, 2016);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20161004, 4, 10, 2016);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20161005, 5, 10, 2016);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20161006, 6, 10, 2016);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20161007, 7, 10, 2016);

insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20170101, 1, 1, 2017);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20170501, 1, 5, 2017); 
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20170502, 2, 5, 2017);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20170503, 3, 5, 2017);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20171001, 1, 10, 2017);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20171002, 2, 10, 2017);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20171003, 3, 10, 2017);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20171004, 4, 10, 2017);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20171005, 5, 10, 2017);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20171006, 6, 10, 2017);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20171007, 7, 10, 2017);

insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20180101, 1, 1, 2018);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20180501, 1, 5, 2018); 
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20180502, 2, 5, 2018);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20180503, 3, 5, 2018);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20181001, 1, 10, 2018);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20181002, 2, 10, 2018);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20181003, 3, 10, 2018);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20181004, 4, 10, 2018);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20181005, 5, 10, 2018);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20181006, 6, 10, 2018);
insert into SYS_WORKCALENDAR (id, freeday, freemonth, freeyear) values (20181007, 7, 10, 2018);

insert into sys_params (id, business_key, date_val, double_val, int_val, java_type, key_name, long_val, service_key, string_val, text_val, title, type_cd) values ('news__news_processName', 'news', null, null, null, 'string', 'processName', null, 'news', 'PublicInfoProcess', 'PublicInfoProcess', '��������', 'news');
insert into sys_params (id, business_key, date_val, double_val, int_val, java_type, key_name, long_val, service_key, string_val, text_val, title, type_cd) values ('bulletin__bulletin_processName', 'bulletin', null, null, null, 'string', 'processName', null, 'bulletin', 'PublicInfoProcess', 'PublicInfoProcess', '��������', 'bulletin');
insert into sys_params (id, business_key, date_val, double_val, int_val, java_type, key_name, long_val, service_key, string_val, text_val, title, type_cd) values ('sys_table', 'sys_table', null, null, null, 'json', 'sys_table', null, 'sys_table', '[{"tablename":"net_role","title":"��ɫ"},{"tablename":"sys_tree","title":"ϵͳ��"},{"tablename":"sys_department","title":"����"},{"tablename":"UserInfo","title":"�û�"},{"tablename":"sys_application","title":"ģ��"},{"tablename":"userrole","title":"�û���ɫ"},{"tablename":"sys_access","title":"����Ȩ��"},{"tablename":"sys_function","title":"ϵͳ����"},{"tablename":"sys_dictory","title":"�����ֵ�"},{"tablename":"sys_dictory_def","title":"�ֵ䶨��"},{"tablename":"sys_dbid","title":"ϵͳ����"},{"tablename":"sys_property","title":"ϵͳ����"},{"tablename":"sys_workcalendar","title":"��������"},{"tablename":"sys_params","title":"��������"},{"tablename":"sys_input_def","title":"ϵͳ���붨��"}]', '[{"tablename":"net_role","title":"��ɫ"},{"tablename":"sys_tree","title":"ϵͳ��"},{"tablename":"sys_department","title":"����"},{"tablename":"UserInfo","title":"�û�"},{"tablename":"sys_application","title":"ģ��"},{"tablename":"userrole","title":"�û���ɫ"},{"tablename":"sys_access","title":"����Ȩ��"},{"tablename":"sys_function","title":"ϵͳ����"},{"tablename":"sys_dictory","title":"�����ֵ�"},{"tablename":"sys_dictory_def","title":"�ֵ䶨��"},{"tablename":"sys_dbid","title":"ϵͳ����"},{"tablename":"sys_property","title":"ϵͳ����"},{"tablename":"sys_workcalendar","title":"��������"},{"tablename":"sys_params","title":"��������"},{"tablename":"sys_input_def","title":"ϵͳ���붨��"}]', 'ϵͳ��', 'sys_table');


insert into sys_input_def (id, init_value, input_type, java_type, key_name, required, service_key, text_field, title, type_cd, type_title, url, valid_type, value_field) values ('7', '/rs/jbpm/definition/json', 'combobox', 'String', 'processName', null, 'news', 'text', '��������', 'news', '���ŷ���', '/rs/jbpm/definition/json', null, 'name');
insert into sys_input_def (id, init_value, input_type, java_type, key_name, required, service_key, text_field, title, type_cd, type_title, url, valid_type, value_field) values ('8', '/rs/jbpm/definition/json', 'combobox', 'String', 'processName', null, 'bulletin', 'text', '��������', 'bulletin', '���淢��', '/rs/jbpm/definition/json', null, 'name');


insert into ui_panel (id_,actorid_,close_,collapsible_,columnindex_,height_,link_,locked_,name_,resize_,title_,type_,width_) values ( '1010','root',0,0,0,250,'/mx/isdp/todo/todoList',0,'todo',0,'��������','L',0);
insert into ui_panel (id_,actorid_,close_,collapsible_,columnindex_,height_,link_,locked_,name_,resize_,title_,type_,width_) values ( '1016','root',0,0,0,250,'/mx/public/info/indexList?serviceKey=news',0,'news',0,'����','L',0);
insert into ui_panel (id_,actorid_,close_,collapsible_,columnindex_,height_,link_,locked_,name_,resize_,title_,type_,width_) values ( '1018','root',0,0,0,250,'/mx/public/info/indexList?serviceKey=bulletin',0,'bulletin',0,'����','L',0);
insert into ui_panel (id_,actorid_,close_,collapsible_,columnindex_,content_,height_,locked_,name_,resize_,title_,type_,width_) values ( '1020','root',0,0,0,'<p>&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbspGLAF1.0׼��������</p>',250,0,'notice',0,'֪ͨ','T',0);


insert into ui_userpanel (id_,actorid_,layoutname_,refreshseconds_) values ( '1023','root','P2',0);


insert into ui_panelinstance (id_,name_,panel_,userpanel_) values ( '1024','2','1020','1023');
insert into ui_panelinstance (id_,name_,panel_,userpanel_) values ( '1025','1','1010','1023');
insert into ui_panelinstance (id_,name_,panel_,userpanel_) values ( '1026','4','1018','1023');
insert into ui_panelinstance (id_,name_,panel_,userpanel_) values ( '1027','3','1016','1023');


insert into ui_userportal (id_,actorid_,columnindex_,panelid_,position_) values ( '1028','root',0,'1010',1);
insert into ui_userportal (id_,actorid_,columnindex_,panelid_,position_) values ( '1029','root',0,'1016',3);
insert into ui_userportal (id_,actorid_,columnindex_,panelid_,position_) values ( '1030','root',1,'1018',4);
insert into ui_userportal (id_,actorid_,columnindex_,panelid_,position_) values ( '1031','root',1,'1020',2);

update sys_application set locked = 0 where locked is null;

update sys_tree set locked = 0 where locked is null;

