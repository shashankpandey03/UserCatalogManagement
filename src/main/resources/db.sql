#Create database

create database usercatalog;
use usercatalog;

#Create tables

create table User(USER_ID BIGINT AUTO_INCREMENT primary key, FIRST_NAME varchar(50), LAST_NAME varchar(50));

create table Product(product_id bigint AUTO_INCREMENT primary key,PRODUCT_NAME varchar(50),PRODUCT_DESC varchar(50),PRODUCT_UNIT_PRICE double);

create table UserProducts(user_product_id BIGINT AUTO_INCREMENT primary key, user_id bigint , product_id bigint, purchased_quantity double, created_dttm timestamp , 
foreign key(user_id) references User(user_id), foreign key(product_id) references Product(product_id));