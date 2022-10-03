CREATE FUNCTION ufn_calculate_future_value(initial_sum DECIMAL(20,4),interest_rate DECIMAL(20,4),years INT)
RETURNS DECIMAL(20,4)
BEGIN
RETURN initial_sum * pow((1 + interest_rate),years);
END;

CREATE PROCEDURE usp_calculate_future_value_for_account(account_id INT,interest_rate DECIMAL(20,4))
BEGIN
	SELECT a.id AS 'account_id',ah.first_name,ah.last_name,
    a.balance AS 'current_balance',
    ufn_calculate_future_value(a.balance,interest_rate,5) AS 'balance_in_5_years' 
    FROM account_holders AS ah
    JOIN accounts as a ON ah.id = a.account_holder_id
    WHERE a.id = account_id;
END