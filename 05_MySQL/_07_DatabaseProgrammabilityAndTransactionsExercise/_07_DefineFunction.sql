CREATE FUNCTION ufn_is_word_comprised(IN set_of_letters VARCHAR(50), IN word VARCHAR(50))
RETURNS BIT
DETERMINISTIC
BEGIN
    RETURN BINARY word REGEXP CONCAT('^[', set_of_letters, ']+$');
END;
