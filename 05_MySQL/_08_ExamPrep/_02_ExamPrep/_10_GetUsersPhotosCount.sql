CREATE FUNCTION `udf_users_photos_count` (`username` VARCHAR(30))
RETURNS INT
DETERMINISTIC
BEGIN
    RETURN (SELECT COUNT(*) AS `photosCount` FROM `users` AS `u`
    JOIN `users_photos` AS `up` ON `up`.`user_id` = `u`.`id`
    WHERE `u`.`username` = `username`);
END;
