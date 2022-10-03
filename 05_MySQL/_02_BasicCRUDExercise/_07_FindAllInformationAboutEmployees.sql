SELECT `employee_id`,`first_name` AS 'First Name',`last_name` AS 'Last Name', `middle_name` AS 'Middle Name', `job_title` AS 'Job Title', 
`department_id` as 'Dept ID',`manager_id` as 'Mngr ID',`hire_date` as 'Hire Date',`salary`,`address_id` FROM `employees`
WHERE `job_title` = 'Sales Representative'
ORDER BY `employee_id`;