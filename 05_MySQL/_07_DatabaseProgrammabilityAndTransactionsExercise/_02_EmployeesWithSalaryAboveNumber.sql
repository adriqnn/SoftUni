CREATE PROCEDURE usp_get_employees_salary_above(salary_limit DECIMAL(19,4))
BEGIN
	SELECT `e`.`first_name`,`e`.`last_name` FROM `employees` AS `e`
    WHERE `e`.`salary` >= salary_limit
    ORDER BY `e`.`first_name`,`e`.`last_name`,`salary_limit`;
END