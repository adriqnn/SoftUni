SELECT `name` AS 'game',
CASE 
WHEN hour(`g`.`start`) BETWEEN 0 and 11 THEN 'Morning' 
WHEN hour(`g`.`start`) BETWEEN 12 and 17 THEN 'Afternoon' 
ELSE 'Evening'
END AS 'Part of the Day',
CASE
WHEN `g`.`duration` <= 3 THEN 'Extra Short'
WHEN `g`.`duration` BETWEEN 4 and 6 THEN 'Short'
WHEN `g`.`duration` BETWEEN 7 and 10 THEN 'Long'
ELSE 'Extra Long'
END AS 'Duration'
 FROM `games` AS `g`;