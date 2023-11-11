SELECT `id`, CONCAT(`first_name`, ' ', `last_name`) AS 'Full name', `job_title` AS 'Job Title', `salary` AS 'Salary' FROM employees
WHERE `salary` > 1000
ORDER BY `id`;
