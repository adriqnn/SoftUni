UPDATE `addresses`
SET `country` = CASE
    WHEN `country` LIKE 'b%' THEN 'Blocked'
    WHEN `country` LIKE 't%' THEN 'TEST'
    WHEN `country` LIKE 'p%' THEN 'In Progress'
    ELSE `country`
END;