SELECT `p`.`id`, `p`.`date`, `p`.`description`, COUNT(`c`.`id`) AS `commentsCount` FROM `photos` AS `p`
JOIN `comments` AS `c` ON `p`.`id` = `c`.`photo_id`
GROUP BY `p`.`id`
ORDER BY `commentsCount` DESC, `p`.`id` ASC
LIMIT 5;