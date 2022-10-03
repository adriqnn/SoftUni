CREATE PROCEDURE usp_get_employees_from_town(town_name TEXT)
BEGIN
	SELECT `e`.`first_name`,`e`.`last_name` FROM `employees` as `e`
    JOIN `addresses` AS `a` ON `a`.`address_id` = `e`.`address_id`
    JOIN `towns` AS `t` ON `t`.`town_id` = `a`.`town_id`
    WHERE `t`.`name` = `town_name`
    ORDER BY `e`.`first_name`,`e`.`last_name`,`e`.`employee_id`;
END