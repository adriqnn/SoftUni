SELECT max(sd.`speed`) AS max_speed, t.`name` AS town_name FROM `skills_data` AS `sd`
RIGHT JOIN players AS p ON p.skills_data_id = sd.id
RIGHT JOIN teams AS tm ON p.team_id = tm.id
RIGHT JOIN stadiums AS s ON tm.stadium_id = s.id
RIGHT JOIN towns AS t ON s.town_id = t.id
WHERE  tm.`name` != 'Devify'
GROUP BY `t`.`id`
ORDER BY `max_speed` DESC,`t`.`name`;