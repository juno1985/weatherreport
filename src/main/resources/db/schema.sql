DROP TABLE IF EXISTS user;


create table user 
(id int primary key auto_increment, 
user_name varchar not null, 
passWord varchar not null,
realName varchar default null);