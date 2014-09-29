
  
CREATE TABLE sys_access(
        roleid bigint  NOT NULL,
        appid bigint NOT NULL,
        PRIMARY KEY (roleid, appid)
);

CREATE TABLE sys_permission (
        roleid bigint NOT NULL,
        funcid bigint NOT NULL,
        PRIMARY KEY (roleid, funcid)
 );

 
CREATE TABLE sys_application(
        id bigint not null,
        name nvarchar(255),
	code nvarchar(255),
        appdesc nvarchar(500),
        url nvarchar(255),
        sort int,
        showmenu int,
        nodeid bigint NOT NULL,
	locked int default 0,
	linkfileid varchar(100),
	linkfilename varchar(200),
        linktype varchar(50),
        PRIMARY KEY (id)
);


CREATE TABLE sys_department(
        id bigint not null,
        name nvarchar(255),
        deptdesc nvarchar(500),
        createtime datetime,
        sort int,
        deptno nvarchar(255),
        code nvarchar(255),
        code2 nvarchar(255),
        status int,
        fincode nvarchar(255),
        nodeid bigint NOT NULL,
        PRIMARY KEY (id)
);


CREATE TABLE sys_function(
        id bigint not null,
        name nvarchar(255),
	code nvarchar(50),
        funcdesc nvarchar(500),
        funcmethod nvarchar(255),
        sort int,
        appid bigint NOT NULL,
        PRIMARY KEY (id)
);

CREATE TABLE sys_log(
        id bigint not null,
        account nvarchar(50),
	moduleid nvarchar(50),
        ip nvarchar(255),
        createtime datetime,
        operate nvarchar(255),
	content nvarchar(2000),
        flag int,
	timems int,
        PRIMARY KEY (id)
);

 CREATE TABLE sys_user_online (
        id_ bigint not null,
        actorid_ nvarchar(50),
        checkdate_ datetime,
        checkdatems_ bigint,
        logindate_ datetime,
        loginip_ nvarchar(100),
        name_ nvarchar(50),
        sessionid_ nvarchar(200),
        PRIMARY KEY (id_)
 );

CREATE TABLE sys_user_online_log (
        id_ bigint not null,
        actorid_ nvarchar(50),
        logindate_ datetime,
        loginip_ nvarchar(100),
        logoutdate_ bigint,
        name_ nvarchar(50),
        sessionid_ nvarchar(200),
        PRIMARY KEY (id_)
 );

CREATE TABLE sys_tree (
        id bigint not null,
        parent bigint,
        name nvarchar(255),
        nodedesc nvarchar(500),
	cacheFlag nvarchar(1),
	discriminator nvarchar(1),
	moveable nvarchar(1),
	treeId nvarchar(200),
        sort int,
        code nvarchar(255),
	icon nvarchar(255),
	iconCls nvarchar(255),
	url nvarchar(255),
	locked int default 0,
        PRIMARY KEY (id)
);


CREATE TABLE sys_dictory (
        id bigint not null,
        typeId bigint,
        name nvarchar(50),
        dictDesc nvarchar(500),
        code nvarchar(50),
	value_ nvarchar(2000),
        sort int,
        blocked int,
        ext1 nvarchar(200),
        ext2 nvarchar(200),
        ext3 nvarchar(200),
        ext4 nvarchar(200),
        ext5 datetime,
        ext6 datetime,
        ext7 datetime,
        ext8 datetime,
        ext9 datetime,
        ext10 datetime,
        ext11 bigint,
        ext12 bigint,
        ext13 bigint,
        ext14 bigint,
        ext15 bigint,
        ext16 double precision,
        ext17 double precision,
        ext18 double precision,
        ext19 double precision,
        ext20 double precision,
        PRIMARY KEY (id)
);

create table sys_dictory_def (
        id bigint not null,
        nodeId bigint,
        name nvarchar(50),
        columnName nvarchar(50),
        title nvarchar(50),
        type nvarchar(50),
        length int,
        sort int,
        required int,
        target nvarchar(50),
        PRIMARY KEY (id)
);

CREATE TABLE sys_workcalendar (
        id bigint not null,
        freeday int,
        freemonth int,
        freeyear int,
        PRIMARY KEY (id)
);


CREATE TABLE sys_todo(
        id bigint not null,
        code nvarchar(255),
        content nvarchar(255),
        deptid bigint,
        deptname nvarchar(255),
        enableflag int,
        limitday int,
        xa int,
        xb int,
        link nvarchar(255),
        listlink nvarchar(255),
	allListLink nvarchar(255),
        linktype nvarchar(255),
        appid bigint,
        moduleid bigint,
        modulename nvarchar(255),
        objectid nvarchar(255),
        objectvalue nvarchar(255),
        processname nvarchar(255),
        rolecode nvarchar(255),
        roleid bigint,
        taskname nvarchar(255),
        title nvarchar(255),
        type nvarchar(50),
	provider varchar(50),
        sql_ nvarchar(max),
	sortno int,
        versionno bigint,
        PRIMARY KEY (id)
    );

CREATE TABLE sys_todo_instance(
        id bigint not null,
        actorid nvarchar(255),
        actorname nvarchar(255),
        title nvarchar(255),
        content nvarchar(255),
        provider nvarchar(255),
        link_ nvarchar(255),
        linktype nvarchar(255),
        createdate datetime,
        startdate datetime,
        enddate datetime,
        alarmdate datetime,
        pastduedate datetime,
        taskinstanceid nvarchar(255),
        processinstanceid nvarchar(255),
        deptid bigint,
        deptname nvarchar(255),
        roleid bigint,
        rolecode nvarchar(255),
        rowid_ nvarchar(255),
        todoid bigint,
        appid bigint,
        moduleid bigint,
        objectid nvarchar(255),
        objectvalue nvarchar(255),
        versionno bigint,
        PRIMARY KEY (id)
    );

  CREATE TABLE sys_scheduler (
        id nvarchar(50) not null,
	autoStartup int,
        createBy nvarchar(255),
        createDate datetime,
	title nvarchar(200),
        content nvarchar(500),
	startDate datetime,
        endDate datetime,
        expression_ nvarchar(500),
        jobClass nvarchar(200),
        locked_ int,
        priority_ int,
        repeatCount int,
        repeatInterval int,
        startDelay int,
        startup_ int,
        taskName nvarchar(200),
        taskType nvarchar(50),
        threadSize int,
	attribute_ nvarchar(500),
        PRIMARY KEY (id)
    );

CREATE TABLE sys_lob (
        id_ varchar(50) not null,
        businesskey_ varchar(50),
        contenttype_ varchar(50),
        createby_ varchar(50),
        createdate_ datetime,
        data_ varbinary,
        deleteflag_ int,
        deviceid_ varchar(20),
        fileid_ varchar(50),
        filename_ varchar(500),
        lastmodified_ bigint,
        locked_ int,
        name_ varchar(50),
        objectid_ varchar(255),
        objectvalue_ varchar(255),
        path_ varchar(500),
        servicekey_ varchar(50),
        size_ bigint,
        status_ int,
        type_ varchar(50),
        primary key (id_)
);

CREATE TABLE message(
        id bigint not null,
        type int,
        sysType int,
        sender bigint,
        recver bigint,
        recverList nvarchar(2000) ,
        title nvarchar(500) ,
        content nvarchar(max) ,
        createDate datetime,
        readed int,
        category int,
        crUser nvarchar(20),
        crDate datetime,
        edUser nvarchar(20),
        edDate datetime,
        PRIMARY KEY (id)
  );

CREATE TABLE mymenu(
        id bigint not null,
        userId bigint,
        title nvarchar(100),
        url nvarchar(200),
        sort int,
        crUser nvarchar(20),
        crDate datetime,
        edUser nvarchar(20),
        edDate datetime,
        PRIMARY KEY (id)
);
 

CREATE TABLE  attachment (
	id bigint  not null,
	referId bigint,
	referType int,
	name nvarchar (100),
	url nvarchar (200),
	createDate datetime,
	createId bigint,
	crUser nvarchar (20),
	crDate datetime,
	edUser nvarchar (20),
	edDate datetime,
	PRIMARY KEY (id)
);


create table sys_dbid(
        name_ nvarchar(50)  not null,
	title_ varchar(255),
        value_ nvarchar(255) not null,
        version_ int not null,
        primary key (name_)
);

create table sys_agent (
        ID_ nvarchar(50)  not null,
        AGENTTYPE_ int,
        ASSIGNFROM_ nvarchar(255) ,
        ASSIGNTO_ nvarchar(255) ,
        CREATEDATE_ datetime,
        ENDDATE_ datetime,
        LOCKED_ int,
        OBJECTID_ nvarchar(255) ,
        OBJECTVALUE_ nvarchar(255) ,
        PROCESSNAME_ nvarchar(255) ,
        SERVICEKEY_ nvarchar(50) ,
        STARTDATE_ datetime,
        TASKNAME_ nvarchar(255) ,
        PRIMARY KEY (ID_)
 );

CREATE TABLE sys_property (
        id_ nvarchar(50) NOT NULL,
        category_ nvarchar(200),
        description_ nvarchar(500),
        initvalue_ nvarchar(1000),
        locked_ int,
        name_ nvarchar(50),
        title_ nvarchar(200),
        type_ nvarchar(50),
	inputtype_ nvarchar(50),
        value_ nvarchar(1000),
        PRIMARY KEY (id_)
);

create table sys_params(
        id nvarchar(50) not null,
        business_key nvarchar(200) not null,
        date_val datetime,
        double_val double precision,
        int_val int,
        java_type nvarchar(20) not null,
        key_name nvarchar(50) not null,
        long_val bigint,
        service_key nvarchar(50) not null,
        string_val nvarchar(2000),
        text_val nvarchar(max),
        title nvarchar(200),
        type_cd nvarchar(20) not null,
        primary key (id)
);


create table sys_input_def (
        id nvarchar(50) not null,
        init_value nvarchar(500),
        input_type nvarchar(50),
        java_type nvarchar(20) not null,
        key_name nvarchar(50) not null,
        required nvarchar(10),
        service_key nvarchar(50) not null,
        text_field nvarchar(50),
        title nvarchar(200) not null,
        type_cd nvarchar(20) not null,
        type_title nvarchar(200),
        url nvarchar(250),
        valid_type nvarchar(50),
        value_field nvarchar(50),
        primary key (id)
);

    create table sys_table (
        tablename_ varchar(50) not null,
        parenttablename_ varchar(50),
        packagename_ varchar(200),
        entityname_ varchar(50),
        classname_ varchar(250),
        title_ varchar(255),
        englishtitle_ varchar(255),
        columnqty_ int,
        addtype_ int,
        sysnum_ varchar(100),
        issubtable_ varchar(2),
        topid_ varchar(50),
        aggregationkeys_ varchar(500),
        queryids_ varchar(500),
        temporaryflag_ varchar(1),
        deletefetch_ varchar(1),
        createtime_ datetime,
        createby_ varchar(50),
        description_ varchar(500),
        type_ varchar(50),
        displaytype_ varchar(50),
        insertcascade_ int,
        updatecascade_ int,
        deletecascade_ int,
        locked_ int,
        deleteflag_ int,
        systemflag_ varchar(2),
        revision_ int,
        sortno_ int,
        primary key (tablename_)
    );


    create table sys_column (
        id_ varchar(100) not null,
        queryid_ varchar(50),
        tablename_ varchar(50),
        targetid_ varchar(50),
        alias_ varchar(50),
        columnname_ varchar(50),
        columnlabel_ varchar(50),
        name_ varchar(50),
        title_ varchar(100),
        englishtitle_ varchar(100),
        length_ int,
        scale_ int,
        precision_ int,
        primarykey_ varchar(10),
        null_ varchar(10),
        frozen_ varchar(10),
        unique_ varchar(10),
        searchable_ varchar(10),
        editable_ varchar(10),
        updateable_ varchar(10),
        resizable_ varchar(10),
        hidden_ varchar(10),
        tooltip_ varchar(100),
        ordinal_ int,
        javatype_ varchar(20),
        inputtype_ varchar(50),
        valuefield_ varchar(50),
        textfield_ varchar(50),
        url_ varchar(250),
        validtype_ varchar(50),
        required varchar(10),
        regex_ varchar(100),
        defaultvalue_ varchar(200),
        discriminator_ varchar(10),
        formula_ varchar(200),
        mask_ varchar(100),
        datacode_ varchar(50),
        rendertype_ varchar(50),
        translator_ varchar(100),
        summarytype_ varchar(50),
        summaryexpr_ varchar(200),
        displaytype_ int,
        sortable_ varchar(10),
        sorttype_ varchar(50),
        systemflag_ varchar(2),
        formatter_ varchar(200),
        align_ varchar(50),
        height_ varchar(50),
        width_ varchar(50),
        link_ varchar(200),
        iscollection_ varchar(10),
        valueexpression_ varchar(200),
        renderer_ varchar(100),
        primary key (id_)
    );


    alter table UserInfo add  accountType int;

    alter table UserInfo add  userType int;

    alter table UserInfo add  lastlogintime datetime;

    alter table UserInfo add  lastLoginIP varchar(50);

    alter table UserInfo add  evection int;

    alter table UserInfo add  dumpFlag int;

    alter table UserInfo add  superiorIds varchar(200);

    alter table UserInfo add  telephone varchar(200);

    alter table net_role add  code varchar(200) null;

    alter table net_role add  type varchar(50) null;

    alter table net_role add  isusebranch varchar(10) null;

    alter table userrole add authorized int;

    alter table userrole add authorizeFrom varchar(200) null;

    alter table userrole add availdateStart datetime null;

    alter table userrole add availdateEnd datetime null;

    create index idx_tree_name on sys_tree (name);

    create index idx_tree_code on sys_tree (code);

    create index sys_dept_name on sys_department (name);

    create index sys_dept_code on sys_department (code);

    create index sys_dept_node on sys_department (nodeid);

    create index sys_app_name on sys_application (name);

    create index sys_app_code on sys_application (code);

    create index sys_app_node on sys_application (nodeid);

    alter table sys_access 
        add constraint FK_ACCESS_APP 
        foreign key (appId) 
        references sys_application;

    alter table sys_application 
        add constraint FK_APP_TREE 
        foreign key (nodeId) 
        references sys_tree;

    alter table sys_department 
        add constraint FK_DEPT_TREE 
        foreign key (nodeId) 
        references sys_tree;

    alter table sys_function 
        add constraint FK_FUN_APP 
        foreign key (appId) 
        references sys_application;

    alter table sys_permission 
        add constraint FK_PERM_FUN
        foreign key (funcId) 
        references sys_function;


    alter table SYS_APPLICATION
        add constraint SYS_UNIQ_APPLICATION
        unique (code);

    alter table SYS_DEPARTMENT
        add constraint SYS_UNIQ_DEPARTMENT
        unique (code);

    alter table SYS_TREE
        add constraint SYS_UNIQ_TREE
        unique (code);