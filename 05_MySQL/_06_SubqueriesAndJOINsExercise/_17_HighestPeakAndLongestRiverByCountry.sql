SELECT `c`.`country_name`,max(`p`.`elevation`) AS 'highest_peak',max(`r`.`length`) AS 'longest_river' FROM `countries` AS `c`
LEFT JOIN `mountains_countries` AS `mc` USING (`country_code`)
LEFT JOIN `peaks` AS `p` USING (`mountain_id`)
LEFT JOIN `countries_rivers` AS `cr` USING (`country_code`)
LEFT JOIN `rivers` AS `r` ON `r`.`id` = `cr`.`river_id`
GROUP BY `c`.`country_code`
ORDER BY `highest_peak`DESC,`longest_river`DESC,`c`.`country_name` LIMIT 5;