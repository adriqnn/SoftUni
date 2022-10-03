create table `minions` (
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` varchar(30),
`age` int
);
create table towns (
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` varchar(30)
);
drop table towns;
create table towns (
`town_id` INT PRIMARY KEY AUTO_INCREMENT,
`name` varchar(30)
);