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

-----�ֿ��
create table AssetHouse(
       ahid number(10) primary key,
       ahname varchar2(20), --�ֿ�����(λ��)
       auid number(10),
       auname varchar2(20),
       ahlevel number(10)
);

------�豸���ͱ�
create table AssetType(
       atid number(10) primary key,
       atname varchar2(20), --��������
       atlevel number(10)
);
-----�ֵ��
create table AssetDictionary(
       adtype number(10),  --������������ (0��״̬,1�ǽ�ɫ)
       asname varchar2(20), --�豸״̬����
       arname varchar2(20)  --��ɫ����
);
-----�豸��Ϣ��
create table AssetInfo(
       aiid number(10) primary key,
       aimodel varchar2(30), --�豸�ͺ�
       ainame varchar2(50),  --�豸����
       atname varchar2(20), --��������
       ahname varchar2(20), --�ֿ�����
       adname varchar2(20),  --��������
       asname varchar2(20),  --�豸״̬
       aidate date,  --����ʱ��
       aiMeasuer date, --��������
       aiSupply varchar2(50), --������λ
       aiMoney number(10), --�豸��ֵ
	   abid number(10),  --�豸�����id
       aiLife date , --������
       acid number(10),  --������
       aaid number(10),  --�����
       aiRemark varchar2(255), --�豸��ע 
       aidepreciation varchar2(10),  --�۾ɷ���
       airemainratio number(10)  --��ֵ��
);
-----���ű�
create table AssetDepartment(
       adid number(10) primary key,
       adname varchar2(20),
       adlevel number(10)
);
-----�û���
create table AssetUser(
       auid number(10) primary key,
       urname varchar2(20),  --��ɫ����
       udname varchar2(50),  --��������
       auname varchar2(20),
       aupass varchar2(20),
       auphone varchar2(20)  
);
-----�ʲ���������
create table AssetApply(
       aaid number(10) primary key,
       adname varchar2(50),  --��������
       auname varchar2(20),  --�û�����
       audate date,
       ainame varchar2(20), --�豸����
       auSupply varchar2(50), --������λ
       auNumber number(10), --��������
       auMoney number(20), --�����ʽ�
       auReason varchar2(100), --��������
       auRemark varchar2(255), --���ñ�ע
       auResult varchar2(20) default '������', --�������
       auResultRemark varchar2(255) --������ע
);
-----�û���־��
create table AssetLog(
       alid number(10) primary key,
       auname varchar2(20),  --�û�����
       ainame varchar2(20),  --�豸����
       aiid number(10),  --�豸id
       alop varchar2(50), --������Ϊ
       audate date
);

-----�豸ά�ޱ�
create table AssetRequire(
       arid number(10) primary key,
       ainame varchar2(20), --�豸����
       aiid number(10),  --�豸id
       artime date, --ά����ʼʱ��
       arday number(10), --ά������
       arperson varchar2(10), --ά����Ա
       arphone varchar2(20), --��ϵ�绰
       arstatus varchar2(10) --ά��״̬
);
-----��������
create table AssetBroorw(
       abid number(10) primary key,
       ainame varchar2(20),  --�豸����
       aiid number(10),  --�豸id
       auname varchar2(20),  --�û�����
       abbackDate date, --�黹����
       abdate date, --�������
       abstatus varchar2(10), --���״̬
       abreson varchar2(100), --����Ե��
       abnumebr number(10),
       abResult varchar2(20) default '������', --�������
       abResultRemark varchar2(255) --������ע
);
-----�黹��
create table AssetBack(
        abid number(10) primary key,
        auname varchar2(20), --�û�����
        ainame varchar2(20),  --�豸����
        aiid number(10),  --�豸id
        abdate date,  --�黹����
        abdeluser varchar2(10), --������
        abcontent varchar2(255) --���ⷴ��
);
------�ƽ���
create table AssetChange(
       acid number(10) primary key,
       auname varchar2(20), --�û�����
       ainame varchar2(20),  --�豸����
       acnumber number(10),  --�豸����
       acdate date,  --����ʱ��
       adname varchar2(20), --��������
       acresult varchar2(255)
);
-----����
create table AssetAccept(
       aaid number(10) primary key,
       aaname varchar2(20),  --�����
       aatype varchar2(20), --��ⷽʽ
       aanumer number(10),  --����������
       aadate date,
       ahname varchar2(20),  --�ⷿ����
       aaprice number(20)
);