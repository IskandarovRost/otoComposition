-- begin COMP_CUSTOMER
alter table COMP_CUSTOMER add constraint FK_COMP_CUSTOMER_DETAIL foreign key (DETAIL_ID) references COMP_CUSTOMER_DETAIL(ID)^
-- end COMP_CUSTOMER
