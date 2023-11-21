UPDATE `cars`
SET `condition` = 'C'
WHERE ((`mileage` >= 800000 OR `mileage` IS NULL) AND (`make` NOT LIKE 'Mercedez-Benz') AND `year` <= 2010);