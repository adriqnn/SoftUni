CREATE PROCEDURE usp_get_employees_by_salary_level(IN level_of_salary VARCHAR(20))
BEGIN
    SELECT `e`.`first_name`, `e`.`last_name` FROM `employees` AS `e`
    WHERE (CASE
            WHEN LOWER(level_of_salary) = 'low' THEN `e`.`salary` < 30000
            WHEN LOWER(level_of_salary) = 'average' THEN `e`.`salary` >= 30000 AND `e`.`salary` <= 50000
            WHEN LOWER(level_of_salary) = 'high' THEN `e`.`salary` > 50000
        END)
    ORDER BY `e`.`first_name` DESC, `e`.`last_name` DESC;
END;
