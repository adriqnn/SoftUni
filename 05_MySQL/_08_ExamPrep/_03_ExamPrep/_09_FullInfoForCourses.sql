SELECT `a`.`name`, CASE WHEN HOUR(`c`.`start`) BETWEEN 6 AND 20 THEN 'Day' ELSE 'Night' END AS `day_time`, `c`.`bill`, `cl`.`full_name`, `cr`.`make`, `cr`.`model`, `ct`.`name` FROM `courses` AS `c` 
JOIN `addresses` AS `a` ON `c`.`from_address_id` = `a`.`id` 
JOIN `clients` AS `cl` ON `cl`.`id` = `c`.`client_id` 
JOIN `cars` AS `cr` ON `cr`.`id` = `c`.`car_id` 
JOIN `categories` AS `ct` ON `ct`.`id` = `cr`.`category_id` 
ORDER BY `c`.`id`;