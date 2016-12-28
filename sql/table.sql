drop table AssetAccept;
drop table AssetChange;
drop table AssetBack;
drop table AssetBroorw;
drop table AssetRequire;
drop table AssetLog;
drop table AssetApply;
drop table AssetDictionary;
drop table AssetUser;
drop table AssetDepartment;
drop table AssetInfo;
drop table AssetType;
drop table AssetHouse;

drop sequence AssetBack_seq;
drop sequence AssetBroorw_seq;
drop sequence AssetRequire_seq;
drop sequence AssetLog_seq;
drop sequence AssetApply_seq;
drop sequence AssetDepartment_seq;
drop sequence AssetDictionary_seq;
drop sequence AssetInfo_seq;
drop sequence AssetType_seq;
drop sequence AssetHouse_seq;
drop sequence AssetChange_seq;
drop sequence AssetAccept_seq;

create sequence AssetBack_seq minvalue 0;
create sequence AssetBroorw_seq minvalue 0;
create sequence AssetRequire_seq minvalue 0;
create sequence AssetLog_seq minvalue 0;
create sequence AssetApply_seq minvalue 0;
create sequence AssetDepartment_seq minvalue 0;
create sequence AssetInfo_seq minvalue 0;
create sequence AssetDictionary_seq minvalue 0;
create sequence AssetType_seq minvalue 0;
create sequence AssetHouse_seq minvalue 0;
create sequence AssetChange_seq minvalue 0;
create sequence AssetAccept_seq minvalue 0;

-----仓库表
create table AssetHouse(
       ahid number(10) primary key,
       ahname varchar2(20), --仓库名称(位置)
       auid number(10),
       auname varchar2(20),
       ahlevel number(10)
);

------设备类型表
create table AssetType(
       atid number(10) primary key,
       atname varchar2(20), --类型名称
       atlevel number(10)
);
-----字典表
create table AssetDictionary(
       adtype number(10),  --用来区分区别 (0是状态,1是角色)
       asname varchar2(20), --设备状态名称
       arname varchar2(20)  --角色名称
);
-----设备信息表
create table AssetInfo(
       aiid number(10) primary key,
       aimodel varchar2(30), --设备型号
       ainame varchar2(50),  --设备名称
       atname varchar2(20), --类型名称
       ahname varchar2(20), --仓库名称
       adname varchar2(20),  --部门名称
       asname varchar2(20),  --设备状态
       aidate date,  --进库时间
       aiMeasuer date, --生产日期
       aiSupply varchar2(50), --生产单位
       aiMoney number(10), --设备价值
	   abid number(10),  --设备借出表id
       aiLife date , --保质期
       acid number(10),  --出库编号
       aaid number(10),  --入库编号
       aiRemark varchar2(255), --设备备注 
       aidepreciation varchar2(10),  --折旧方法
       airemainratio number(10)  --残值率
);
-----部门表
create table AssetDepartment(
       adid number(10) primary key,
       adname varchar2(20),
       adlevel number(10)
);
-----用户表
create table AssetUser(
       auid number(10) primary key,
       urname varchar2(20),  --角色名称
       udname varchar2(50),  --部门名称
       auname varchar2(20),
       aupass varchar2(20),
       auphone varchar2(20)  
);
-----资产购置申请
create table AssetApply(
       aaid number(10) primary key,
       adname varchar2(50),  --部门名称
       auname varchar2(20),  --用户名称
       audate date,
       ainame varchar2(20), --设备名称
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
       ainame varchar2(20),  --设备名称
       aiid number(10),  --设备id
       alop varchar2(50), --操作行为
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
        ainame varchar2(20),  --设备名称
        aiid number(10),  --设备id
        abdate date,  --归还日期
        abdeluser varchar2(10), --处理人
        abcontent varchar2(255) --问题反馈
);
------移交表
create table AssetChange(
       acid number(10) primary key,
       auname varchar2(20), --用户名称
       ainame varchar2(20),  --设备名称
       acnumber number(10),  --设备数量
       acdate date,  --调拨时间
       adname varchar2(20), --部门名称
       acresult varchar2(255)
);
-----入库表
create table AssetAccept(
       aaid number(10) primary key,
       aaname varchar2(20),  --入库人
       aatype varchar2(20), --入库方式
       aanumer number(10),  --本次入库件数
       aadate date,
       ahname varchar2(20),  --库房名称
       aaprice number(20)
);