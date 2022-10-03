SELECT `department_id`, min(`salary`) AS 'minimum_salary' FROM `employees`
WHERE `hire_date` > '2000-01-01'
GROUP BY `department_id`
HAVING `department_id` = 2 OR `department_id` = 5 OR `department_id` = 7
ORDER BY `department_id`;