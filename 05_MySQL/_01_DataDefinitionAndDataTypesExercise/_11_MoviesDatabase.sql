CREATE TABLE `directors`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`director_name` VARCHAR(50) NOT NULL,
`notes` TEXT
);
INSERT INTO `directors`(`director_name`,`notes`)
VALUES
('t1','notes'),
('t2','notes'),
('t3','notes'),
('t4','notes'),
('t5','notes');
CREATE TABLE `genres`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`genre_name` VARCHAR(50) NOT NULL,
`notes` TEXT
);
INSERT INTO `genres`(`genre_name`,`notes`)
VALUES
('t1','notes'),
('t2','notes'),
('t3','notes'),
('t4','notes'),
('t5','notes');
CREATE TABLE `categories`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`category_name` VARCHAR(50) NOT NULL,
`notes` TEXT
);
INSERT INTO `categories`(`category_name`,`notes`)
VALUES
('t1','notes'),
('t2','notes'),
('t3','notes'),
('t4','notes'),
('t5','notes');
CREATE TABLE `movies`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`title` VARCHAR(50) NOT NULL,
`director_id` INT,
`copyright_year` INT,
`length` INT,
`genre_id` INT,
`category_id` INT,
`rating` DOUBLE,
`notes` TEXT
);
INSERT INTO `movies`(`title`)
VALUES
('t1'),
('t2'),
('t3'),
('t4'),
('t5');