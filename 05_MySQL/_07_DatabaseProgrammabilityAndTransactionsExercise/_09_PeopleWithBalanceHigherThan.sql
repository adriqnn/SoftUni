CREATE PROCEDURE usp_get_holders_with_balance_higher_than(money double(19,4))
BEGIN
	SELECT ah.first_name,ah.last_name FROM account_holders AS ah
    RIGHT JOIN accounts AS a ON ah.id = a.account_holder_id
    GROUP BY ah.id
    HAVING sum(balance) > money
    ORDER by ah.id;
END