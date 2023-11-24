CREATE PROCEDURE udp_reduce_price(`category_name` VARCHAR(50))
BEGIN
    UPDATE `products` AS `p`
        JOIN `categories` AS `c` ON `p`.`category_id` = `c`.`id`
        JOIN `reviews` AS `r` ON `p`.`review_id` = `r`.`id` 
    SET `price` = `price` * 0.7
    WHERE `category_name` = `c`.`name` AND `rating` < 4;
END;
