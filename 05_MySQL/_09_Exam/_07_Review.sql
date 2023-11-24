SELECT `id`, `content`, `rating`, `picture_url`, `published_at` FROM `reviews` AS `r`
WHERE `content` LIKE 'My%' AND CHAR_LENGTH(`content`) > 61
ORDER BY `rating` DESC;