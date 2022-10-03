SELECT `department_id`,
IF(`department_id` = 1,avg(`salary`) + 5000,avg(`salary`)) AS `avg_salary` FROM `employees`
WHERE `salary` > 30000 AND `manager_id` != 42
GROUP BY `department_id`
ORDER BY `department_id`;