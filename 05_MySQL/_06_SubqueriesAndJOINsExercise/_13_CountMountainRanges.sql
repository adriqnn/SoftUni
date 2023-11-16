SELECT `c`.`country_code`, COUNT(`mc`.`mountain_id`) AS 'count' FROM `countries` AS `c`
JOIN `mountains_countries` AS `mc` USING(`country_code`)
WHERE `c`.`country_code` IN ('BG', 'US', 'RU')
GROUP BY `c`.`country_code`
ORDER BY `count` DESC;
