SELECT `e`.`employee_id`, `e`.`first_name`, `e`.`salary`, `d`.`name` FROM `employees` AS `e`
JOIN `departments` AS `d` USING (`department_id`)
WHERE `e`.`salary` > 15000
ORDER BY `d`.`department_id` DESC
LIMIT 5;
