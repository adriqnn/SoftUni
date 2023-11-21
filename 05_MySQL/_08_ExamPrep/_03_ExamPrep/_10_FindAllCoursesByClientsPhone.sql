CREATE FUNCTION udf_courses_by_client(phone_num VARCHAR(20))
RETURNS INT 
DETERMINISTIC
BEGIN
    RETURN (
        SELECT COUNT(*) FROM courses AS c
        JOIN clients AS cl ON cl.id = c.client_id
        WHERE cl.phone_number = phone_num
    );
END
