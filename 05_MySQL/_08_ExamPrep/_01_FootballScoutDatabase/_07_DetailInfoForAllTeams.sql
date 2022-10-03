SELECT `t`.`name` AS 'team_name',`t`.`established`,`t`.`fan_base`,(SELECT count(*) FROM `players` WHERE `team_id` = `t`.`id`) AS `player_count`
FROM `teams` AS `t`
ORDER BY `player_count` DESC,`fan_base` DESC;