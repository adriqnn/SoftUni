CREATE PROCEDURE usp_raise_salary_by_id(IN userid INT)
BEGIN
    START TRANSACTION;

    IF EXISTS (SELECT 1 FROM employees WHERE employee_id = userid)
    THEN
        UPDATE employees SET salary = salary * 1.05 WHERE employee_id = userid;
        COMMIT;
    ELSE
        ROLLBACK;
    END IF;
END
