SELECT `c`.`continent_code`, `c`.`currency_code`, COUNT(*) AS 'currency_usage' FROM `countries` AS `c`
GROUP BY `c`.`continent_code`, `c`.`currency_code`
HAVING `currency_usage` > 1 AND `currency_usage` = (
    SELECT COUNT(*) AS 'muc' FROM `countries` AS `c2`
    WHERE `c2`.`continent_code` = `c`.`continent_code`
    GROUP BY `c2`.`currency_code`
    ORDER BY `muc` DESC
    LIMIT 1 )
ORDER BY `c`.`continent_code`, `c`.`currency_code`;
