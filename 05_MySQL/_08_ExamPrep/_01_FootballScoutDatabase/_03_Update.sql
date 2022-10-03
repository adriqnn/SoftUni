UPDATE `coaches` AS `c`
SET `coach_level` = `coach_level` + 1
WHERE `c`.`first_name` LIKE 'A%' AND (SELECT count(*) FROM `players_coaches` WHERE `coach_id` = `id`)>0;