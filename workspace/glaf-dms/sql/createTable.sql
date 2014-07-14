

CREATE TABLE net_role(
        id INT NOT NULL IDENTITY,
        listno INT,
        rolename VARCHAR(100) ,
        roleuse INT,
        content VARCHAR(250) ,
        roletype INT,
        busiess_id VARCHAR(50) ,
        tasksort INT,
        domain_index INT,
        CODE VARCHAR(50) ,
        CREATEBY VARCHAR(50) ,
        CREATEDATE DATETIME,
        UPDATEBY VARCHAR(50) ,
        UPDATEDATE DATETIME,
        CONSTRAINT PK_net_role PRIMARY KEY (id)
 );

CREATE TABLE net_roleuse(
        id INT NOT NULL IDENTITY,
        roleid INT,
        celltreedot_index INT,
        intuserper INT,
        CONSTRAINT PK_net_roleuse PRIMARY KEY (id)
);

alter table userinfo add email VARCHAR(150);

alter table userinfo add mobile VARCHAR(50);

alter table userinfo add domain_index int;