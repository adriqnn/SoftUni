CREATE VIEW `view1` AS
SELECT * FROM `employees`
ORDER BY `salary` DESC
LIMIT 1;
SELECT * FROM `view1`;