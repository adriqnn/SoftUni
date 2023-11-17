CREATE FUNCTION ufn_calculate_future_value(IN initial_sum DECIMAL(20, 4), IN interest_rate DECIMAL(20, 4), IN years INT)
RETURNS DECIMAL(20, 4)
BEGIN
    RETURN initial_sum * POW((1 + interest_rate), years);
END;
