SELECT `p`.`id`, CONCAT(`first_name`, ' ', `last_name`) AS `full_name`, `p`.`age`, `p`.`position`, `p`.`hire_date` FROM `players` AS `p`
JOIN `skills_data` AS `sd` ON `p`.`skills_data_id` = `sd`.`id`
WHERE (`sd`.`strength` > 50 AND `position` = 'A' AND `hire_date` IS NULL AND `age` < 23)
ORDER BY `salary`, `age`;