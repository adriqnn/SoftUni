CREATE FUNCTION ufn_get_salary_level(salary DOUBLE(10, 4))
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
	DECLARE salary_level VARCHAR(20);

	CASE
		WHEN salary < 30000 THEN SET salary_level = 'Low';
		WHEN salary <= 50000 THEN SET salary_level = 'Average';
		WHEN salary > 50000 THEN SET salary_level = 'High';
	END CASE;

    RETURN salary_level;
END;
