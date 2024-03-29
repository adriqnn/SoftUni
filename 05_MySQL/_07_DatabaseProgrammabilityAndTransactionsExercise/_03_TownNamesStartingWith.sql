CREATE PROCEDURE usp_get_towns_starting_with(IN town_name_start TEXT)
BEGIN
    SELECT `t`.`name` FROM `towns` AS `t`
    WHERE `t`.`name` LIKE CONCAT(town_name_start, '%')
    ORDER BY `t`.`name`;
END;
