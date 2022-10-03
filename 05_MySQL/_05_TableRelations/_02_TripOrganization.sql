SELECT `v`.`driver_id`,`v`.`vehicle_type`,concat_ws(' ',`c`.`first_name`,`c`.`last_name`) AS 'full_name' FROM `campers` AS `c`
JOIN `vehicles` AS `v` ON v.`driver_id` = c.`id`;