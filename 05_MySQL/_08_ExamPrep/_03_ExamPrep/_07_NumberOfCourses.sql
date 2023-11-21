SELECT `c`.`id`, `c`.`make`, `c`.`mileage`, COUNT(`cs`.`id`) AS `count_of_courses`, ROUND(AVG(`cs`.`bill`), 2) AS `avg_bill` FROM `cars` AS `c`
LEFT JOIN `courses` AS `cs` ON `c`.`id` = `cs`.`car_id`
GROUP BY `c`.`id`
HAVING `count_of_courses` != 2
ORDER BY `count_of_courses` DESC, `c`.`id`;