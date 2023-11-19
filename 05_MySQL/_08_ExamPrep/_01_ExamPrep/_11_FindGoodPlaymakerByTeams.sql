CREATE PROCEDURE `udp_find_playmaker` (`min_dribble_points` INT, `team_name` VARCHAR(45))
BEGIN
    SELECT CONCAT(`p`.`first_name`, ' ', `p`.`last_name`) AS `full_name`, `p`.`age`, `p`.`salary`, `sd`.`dribbling`, `sd`.`speed`, `t`.`name` FROM `skills_data` AS `sd`
    JOIN `players` AS `p` ON `p`.`skills_data_id` = `sd`.`id`
    RIGHT JOIN `teams` AS `t` ON `t`.`id` = `p`.`team_id`
    WHERE `t`.`name` = `team_name` AND `sd`.`speed` > (SELECT AVG(`speed`) FROM `skills_data`) AND `sd`.`dribbling` > `min_dribble_points`
    ORDER BY `sd`.`speed` DESC LIMIT 1;
END;
