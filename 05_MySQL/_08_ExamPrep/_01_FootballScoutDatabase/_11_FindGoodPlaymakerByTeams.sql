CREATE PROCEDURE udp_find_playmaker(min_dribble_points INT, team_name VARCHAR(45))
BEGIN
	SELECT concat(first_name,' ',last_name) AS full_name,age,salary,dribbling,speed,t.name FROM skills_data AS sd
	JOIN players AS p ON p.skills_data_id = sd.id
	RIGHT JOIN teams AS t ON t.id = p.team_id
	WHERE t.`name` = team_name AND speed > (SELECT avg(speed) FROM `skills_data`) AND sd.`dribbling` > min_dribble_points
	ORDER BY sd.speed DESC LIMIT 1;
END