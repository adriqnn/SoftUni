create table employees(
id INT primary key auto_increment,
first_name varchar(50) not null,
last_name varchar(50) not null);

create table categories(
id int primary key auto_increment,
name varchar(50) not null);

create table products(
id int primary key auto_increment,
name varchar(50) not null,
category_id int not null);