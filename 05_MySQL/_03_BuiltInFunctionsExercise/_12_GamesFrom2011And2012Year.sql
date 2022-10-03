SELECT `name`,date_format(`start`,'%Y-%m-%d') as 'start' FROM `games`
WHERE YEAR(`start`) = '2011' OR YEAR(`start`) = 2012
ORDER BY `start`,`name` LIMIT 50;