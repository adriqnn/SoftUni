CREATE PROCEDURE usp_get_employees_salary_above_35000()
BEGIN
    SELECT `e`.`first_name`, `e`.`last_name` FROM `employees` AS `e`
    WHERE `e`.`salary` > 35000
    ORDER BY `e`.`first_name`, `e`.`last_name`, `e`.`employee_id`;
END;
