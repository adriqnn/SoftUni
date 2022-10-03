CREATE PROCEDURE usp_get_towns_starting_with(town_name_start TEXT)
BEGIN
	SELECT `t`.`name` FROM `towns` AS `t`
    WHERE `t`.`name` LIKE concat(town_name_start,'%')
    ORDER BY `t`.`name`;
END