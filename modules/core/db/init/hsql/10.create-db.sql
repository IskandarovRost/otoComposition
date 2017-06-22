-- begin COMP_CUSTOMER_DETAIL
create table COMP_CUSTOMER_DETAIL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MAIN_ADDRESS_POSTCODE varchar(50),
    MAIN_ADDRESS_LINE_ONE varchar(50),
    MAIN_ADDRESS_LINE_TWO varchar(255),
    DELIVERY_ADDRESS_POSTCODE varchar(50),
    DELIVERY_ADDRESS_LINE_ONE varchar(50),
    DELIVERY_ADDRESS_LINE_TWO varchar(255),
    --
    CUSTOMER_DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end COMP_CUSTOMER_DETAIL
-- begin COMP_CUSTOMER
create table COMP_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    SCORE integer,
    DETAIL_ID varchar(36),
    --
    primary key (ID)
)^
-- end COMP_CUSTOMER
