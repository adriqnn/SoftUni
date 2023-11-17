CREATE FUNCTION ufn_Count_employees_by_town(cityname VARCHAR(100))
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE x INT;

    -- Use LIMIT 1 to handle cases where more than one row is returned
    SET x := (
        SELECT COUNT(*) FROM towns AS t
        LEFT JOIN addresses AS a ON t.town_id = a.town_id
        LEFT JOIN employees AS e ON e.address_id = a.address_id
        WHERE t.name = cityname
        LIMIT 1
    );

    RETURN x;
END
