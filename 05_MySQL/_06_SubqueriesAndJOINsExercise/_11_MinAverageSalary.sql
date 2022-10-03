SELECT avg(`salary`) AS `e` FROM `employees`
GROUP BY `department_id`
ORDER BY `e` LIMIT 1;