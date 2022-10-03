CREATE PROCEDURE usp_raise_salary_by_id(userid INT)
BEGIN 
START TRANSACTION;
IF( (SELECT count(*) FROM employees WHERE employee_id = userid) > 0)
THEN
UPDATE employees SET salary = salary*1.05 WHERE employee_id = userid;
COMMIT;
ELSE ROLLBACK;
END IF;
END