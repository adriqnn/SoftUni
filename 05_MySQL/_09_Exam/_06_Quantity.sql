SELECT `p`.`id`, `p`.`brand_id`, `name`, `quantity_in_stock` FROM `products` AS `p`
WHERE `p`.`price` > 1000 AND `p`.`quantity_in_stock` < 30
ORDER BY `quantity_in_stock` ASC, `id` ASC;