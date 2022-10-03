CREATE PROCEDURE udp_modify_user(address VARCHAR(30),town VARCHAR(30))
BEGIN
	UPDATE `users` SET age = age +10
    WHERE
		EXISTS(SELECT * FROM addresses AS a
		WHERE a.address = address AND town = a.town);
END