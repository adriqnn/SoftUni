CREATE FUNCTION ufn_is_word_comprised(set_of_letters varchar(50), word VARCHAR(50))
RETURNS BIT
DETERMINISTIC
BEGIN
RETURN word REGEXP(concat('^[',set_of_letters, ']+$'));
END