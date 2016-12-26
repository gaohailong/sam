insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'仓库','1','老王',0);
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'教室','1','老王',0);
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'办公室','1','老王',0);
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'监狱','1','老高',0);           
       
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'东区仓库','1','老王',1);
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'西区仓库','1','老王',1);
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'南区仓库','1','老王',1);      
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'北区仓库','1','老王',1);
insert into assethouse(ahid,ahname,auid,auname,ahlevel) 
       values(assethouse_seq.nextval,'南楼教室','1','老王',1);
-------------------------------------------------------------------------
insert into assettype(atid,atname,atlevel) values(assettype_seq.nextval,'电子产品','0');
insert into assettype(atid,atname,atlevel) values(assettype_seq.nextval,'电脑','1');
insert into assettype(atid,atname,atlevel) values(assettype_seq.nextval,'投影仪','1');
insert into assettype(atid,atname,atlevel) values(assettype_seq.nextval,'激光笔','1');
            
commit;

select * from assethouse;
select * from assettype;
select * from assetinfo;
