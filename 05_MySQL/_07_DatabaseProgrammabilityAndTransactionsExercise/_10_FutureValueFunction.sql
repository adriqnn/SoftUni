CREATE FUNCTION ufn_calculate_future_value(initial_sum DECIMAL(20, 4), interest_rate DECIMAL(20, 4), years INT)
RETURNS DECIMAL(20, 4)
BEGIN
    RETURN initial_sum * pow((1 + interest_rate), years);
END
