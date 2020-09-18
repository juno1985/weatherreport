drop table if exists City;
drop table if exists ForcastFiveDaysData;

create table City
(id int primary key auto_increment,
city_name varchar not null,
city_country varchar not null,
city_timezone varchar not null
);


create table ForcastFiveDaysData
(id int primary key auto_increment,
temp real,
description varchar default null,
feels_like real ,
temp_min real,
temp_max real,
dt_txt timestamp,
cid int,
foreign key(cid) references CITY(id)
);