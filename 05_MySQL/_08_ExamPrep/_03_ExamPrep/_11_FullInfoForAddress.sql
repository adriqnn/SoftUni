CREATE PROCEDURE `udp_courses_by_address` (`address_name` VARCHAR(100))
BEGIN
    SELECT `a`.`name`, `cl`.`full_name`, CASE WHEN `c`.`bill` <= 20 THEN 'Low' WHEN `c`.`bill` <= 30 THEN 'Medium' WHEN `c`.`bill` > 30 THEN 'High' END AS `bill_category`, `cr`.`make`, `cr`.`condition`, `ct`.`name`FROM `courses` AS `c`
    JOIN `addresses` AS `a` ON `c`.`from_address_id` = `a`.`id`
    JOIN `clients` AS `cl` ON `cl`.`id` = `c`.`client_id`
    JOIN `cars` AS `cr` ON `cr`.`id` = `c`.`car_id`
    JOIN `categories` AS `ct` ON `ct`.`id` = `cr`.`category_id`
    WHERE `a`.`name` = `address_name`
    ORDER BY `cr`.`make`, `cl`.`full_name`;
END;