SELECT `e`.`first_name`, `e`.`last_name`, `t`.`name`, `a`.`address_text` FROM `employees` AS `e`
JOIN `addresses` AS `a` USING (`address_id`)
JOIN `towns` AS `t` ON `t`.`town_id` = `a`.`town_id`
ORDER BY `e`.`first_name`, `e`.`last_name`
LIMIT 5;
