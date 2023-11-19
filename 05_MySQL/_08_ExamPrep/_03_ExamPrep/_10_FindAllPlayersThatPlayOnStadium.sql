CREATE FUNCTION `udf_stadium_players_count` (stadium_name VARCHAR(30))
RETURNS INTEGER
DETERMINISTIC
BEGIN
	RETURN (SELECT COUNT(p.id) AS cnt FROM `players` AS p 
	RIGHT JOIN `teams` AS tm ON p.team_id = tm.id
	RIGHT JOIN `stadiums` AS s ON tm.stadium_id = s.id
	WHERE s.name = stadium_name);
END