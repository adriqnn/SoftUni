SELECT `department_id`, (SELECT DISTINCT e2.`salary` FROM `employees` as e2 WHERE e1.department_id = e2.department_id ORDER BY e2.`salary` DESC LIMIT 2,1) AS 'third_highest_salary' 
FROM `employees` as e1
GROUP BY e1.`department_id`
HAVING `third_highest_salary` IS NOT NULL
ORDER BY `department_id`;