SELECT `e`.`employee_id`, `e`.`first_name` FROM `employees` AS `e`
LEFT JOIN `employees_projects` AS `ep` USING (`employee_id`)
WHERE `ep`.`project_id` IS NULL
ORDER BY `e`.`employee_id` DESC
LIMIT 3;
