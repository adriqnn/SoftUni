CREATE PROCEDURE usp_get_holders_with_balance_higher_than(IN money DOUBLE(19, 4))
BEGIN
    SELECT ah.first_name, ah.last_name FROM account_holders AS ah
    LEFT JOIN accounts AS a ON ah.id = a.account_holder_id
    GROUP BY ah.id
    HAVING SUM(balance) > money
    ORDER BY ah.id;
END;
