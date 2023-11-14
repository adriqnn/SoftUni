SELECT `department_id`, MAX(`salary`) AS 'max' FROM `employees`
GROUP BY `department_id`
HAVING `max` < 30000 OR `max` > 70000
ORDER BY `department_id` ASC;
