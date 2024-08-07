SELECT `e`.`employee_id`, `e`.`first_name`, `p`.`name` FROM `employees` AS `e`
JOIN `employees_projects` AS `ep` USING (`employee_id`)
JOIN `projects` AS `p` USING (`project_id`)
WHERE `p`.`start_date` > '2002-08-13 23:59:59' AND `p`.`end_date` IS NULL
ORDER BY `e`.`first_name`, `p`.`name`
LIMIT 5;
