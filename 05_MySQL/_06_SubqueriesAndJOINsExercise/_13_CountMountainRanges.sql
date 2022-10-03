SELECT `c`.`country_code`, count(`mc`.`mountain_id`) AS 'count' FROM `countries` AS `c`
JOIN `mountains_countries` AS `mc` USING(`country_code`)
GROUP BY `c`.`country_code`
HAVING `c`.`country_code` IN ('BG','US','RU')
ORDER BY `count` DESC;