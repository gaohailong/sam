insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'�ֿ�','1','����',0);
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'����','1','����',0);
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'�칫��','1','����',0);
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'����','1','�ϸ�',0);           
       
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'�����ֿ�','1','����',1);
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'�����ֿ�','1','����',1);
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'�����ֿ�','1','����',1);      
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'�����ֿ�','1','����',1);
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'��¥����','1','����',1);
-------------------------------------------------------------------------
insert into assettype(atid,atname,atlevel) values(assettype_seq.nextval,'���Ӳ�Ʒ','0');
insert into assettype(atid,atname,atlevel) values(assettype_seq.nextval,'����','1');
insert into assettype(atid,atname,atlevel) values(assettype_seq.nextval,'ͶӰ��','1');
insert into assettype(atid,atname,atlevel) values(assettype_seq.nextval,'�����','1');
            
commit;

select * from assethouse;
select * from assettype;
select * from assetinfo;
