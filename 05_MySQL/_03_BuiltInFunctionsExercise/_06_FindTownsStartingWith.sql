SELECT * from `towns`
WHERE `name` REGEXP '^[MmKkBbEe]'
ORDER BY `name` ASC;