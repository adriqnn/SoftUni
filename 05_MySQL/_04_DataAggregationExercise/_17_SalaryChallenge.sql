SELECT `first_name`,`last_name`,e1.`department_id` FROM `employees` AS e1
JOIN(
SELECT e2.`department_id`,avg(e2.`salary`) AS 'average_salary' FROM `employees` as e2
GROUP BY e2.`department_id`
) AS `dep_average` ON e1.department_id = dep_average.department_id
WHERE `salary` > dep_average.average_salary
ORDER BY e1.`department_id`,`employee_id` LIMIT 10;