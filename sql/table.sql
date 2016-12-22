drop table AssetBack;
drop table AssetBroorw;
drop table AssetRequire;
drop table AssetLog;
drop table AssetApply;
drop table AssetUser;
drop table AssetDepartment;
drop table AssetRole;
drop table AssetInfo;
drop table AssetStatus;
drop table AssetType;
drop table AssetHouse;

drop sequence AssetBack_seq;
drop sequence AssetBroorw_seq;
drop sequence AssetRequire_seq;
drop sequence AssetLog_seq;
drop sequence AssetApply_seq;
drop sequence AssetDepartment_seq;
drop sequence AssetRole_seq;
drop sequence AssetInfo_seq;
drop sequence AssetStatus_seq;
drop sequence AssetType_seq;
drop sequence AssetHouse_seq;


create sequence AssetBack_seq minvalue 0;
create sequence AssetBroorw_seq minvalue 0;
create sequence AssetRequire_seq minvalue 0;
create sequence AssetLog_seq minvalue 0;
create sequence AssetApply_seq minvalue 0;
create sequence AssetDepartment_seq minvalue 0;
create sequence AssetRole_seq minvalue 0;
create sequence AssetInfo_seq minvalue 0;
create sequence AssetStatus_seq minvalue 0;
create sequence AssetType_seq minvalue 0;
create sequence AssetHouse_seq minvalue 0;


-----仓库表
create table AssetHouse(
       ahid number(10) primary key,
       ahname varchar2(20), --仓库名称(位置)
       auid number(10),
       auname varchar2(20)
);

------设备类型表
create table AssetType(
       atid number(10) primary key,
       atname varchar2(20) --类型名称
);
------设备状态表
create table AssetStatus(
       asid number(10) primary key,
       asname varchar2(20) --设备状态名称
);
-----设备信息表
create table AssetInfo(
       aiid number(10) primary key,
       aimodel varchar2(30), --设备型号
       ainame varchar2(50),  --设备名称
       atname varchar2(20), --类型名称
       ahname varchar2(20), --仓库名称
       atid number(10),  --类型id
       ahid number(10),  --仓库id
       aidate date,  --进库时间
       aiMeasuer date, --生产日期
       aiSupply varchar2(50), --生产单位
       aiMoney number(10), --设备价值
       aiLife date , --保质期
       aiRemark varchar2(255) --设备备注 
);
-----角色表
create table AssetRole(
       arid number(10) primary key,
       ainame varchar2(20)
);
-----部门表
create table AssetDepartment(
       adid number(10) primary key,
       adname varchar2(20)
);
-----用户表
create table AssetUser(
       auid number(10) primary key,
       urname varchar2(20),  --角色名称
       urid number(10), --角色id
       udname varchar2(50),  --部门名称
       adid number(10), --部门id
       auname varchar2(20),
       aupass varchar2(20),
       auphone varchar2(20)  --联系电话
);
-----资产购置申请
create table AssetApply(
       aaid number(10) primary key,
       adname varchar2(50),  --部门名称
       adid number(10),  --部门id
       auname varchar2(20),  --用户名称
       auid number(10),  --用户id
       audate date,
       ainame varchar2(20), --设备名称
       aiid number(10),  --设备id
       auSupply varchar2(50), --生产单位
       auNumber number(10), --购置数量
       auMoney number(20), --所需资金
       auReason varchar2(100), --购买理由
       auRemark varchar2(255), --购置备注
       auResult varchar2(20) default '待审批', --审批意见
       auResultRemark varchar2(255) --审批备注
);
-----用户日志表
create table AssetLog(
       alid number(10) primary key,
       auname varchar2(20),  --用户名称
       auid number(10),  --用户id
       ainame varchar2(20),  --设备名称
       aiid number(10),  --设备id
       audate date
);

-----设备维修表
create table AssetRequire(
       arid number(10) primary key,
       ainame varchar2(20), --设备名称
       aiid number(10),  --设备id
       artime date, --维修起始时间
       arday number(10), --维修天数
       arperson varchar2(10), --维修人员
       arphone varchar2(20), --联系电话
       arstatus varchar2(10) --维修状态
);
-----借出申请表
create table AssetBroorw(
       abid number(10) primary key,
       ainame varchar2(20),  --设备名称
       aiid number(10),  --设备id
       auname varchar2(20),  --用户名称
       auid number(10),   --用户id
       abbackDate date, --归还日期
       abdate date, --借出日期
       abstatus varchar2(10), --借出状态
       abreson varchar2(100), --借用缘由
       abnumebr number(10),
       abResult varchar2(20) default '待审批', --审批意见
       abResultRemark varchar2(255) --审批备注
);
-----归还表
create table AssetBack(
        abid number(10) primary key,
        auname varchar2(20), --用户名称
        auid number(10),  --用户id
        ainame varchar2(20),  --设备名称
        aiid number(10),  --设备id
        abdate date,  --归还日期
        abdeluser varchar2(10), --处理人
        abcontent varchar2(255) --问题反馈
);

