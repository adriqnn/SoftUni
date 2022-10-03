SELECT `e`.`employee_id`,
concat(`e`.`first_name`,' ',`e`.`last_name`) AS `employee_name`, 
concat(`m`.`first_name`,' ',`m`.`last_name`) AS `manager_name`,
`d`.`name` FROM `employees` AS `e`
JOIN `employees` AS `m` ON `m`.`employee_id` = `e`.`manager_id`
JOIN  `departments` AS `d` ON `e`.`department_id` = `d`.`department_id`
ORDER BY `e`.`employee_id` LIMIT 5;