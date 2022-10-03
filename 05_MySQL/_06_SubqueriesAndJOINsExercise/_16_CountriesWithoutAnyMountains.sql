SELECT count(*) FROM `countries` AS `c`
LEFT JOIN `mountains_countries` AS `mc` USING(`country_code`)
LEFT JOIN `mountains` AS `m` ON `m`.`id` = `mc`.`mountain_id`
WHERE `mountain_id` IS NULL;