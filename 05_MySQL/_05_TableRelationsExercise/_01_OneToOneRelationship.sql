CREATE TABLE `people` (
    `person_id` INT AUTO_INCREMENT UNIQUE NOT NULL,
    `first_name` VARCHAR(20) NOT NULL,
    `salary` DECIMAL(20,2) NOT NULL DEFAULT 0,
    `passport_id` INT NOT NULL UNIQUE
);

CREATE TABLE `passports` (
    `passport_id` INT AUTO_INCREMENT NOT NULL UNIQUE,
    `passport_number` VARCHAR(8) UNIQUE NOT NULL
) AUTO_INCREMENT = 101;

INSERT INTO `people` (`first_name`, `salary`, `passport_id`)
VALUES
    ('Roberto', 43300, 102),
    ('Tom', 56100, 103),
    ('Yana', 60200, 101);

INSERT INTO `passports` (`passport_number`)
VALUES
    ('N34FG21B'),
    ('K65LO4R7'),
    ('ZE657QP2');

ALTER TABLE `people`
ADD CONSTRAINT `pk_people` PRIMARY KEY (`person_id`),
ADD CONSTRAINT `fk_people_passports` FOREIGN KEY (`passport_id`) REFERENCES `passports` (`passport_id`);
