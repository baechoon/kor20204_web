drop database if exists mydbsubject0106;
create database mydbsubject0106;
use mydbsubject0106;

create table todoList(
code int unsigned auto_increment,
content varchar(100) not null,
state boolean ,
primary key(code)
);

#샘플코드
insert into todolist(code,content,state) values('1','춘배랑놀기',true);
insert into todolist(code,content,state) values('2','과제하기',false);
select*from todoList;