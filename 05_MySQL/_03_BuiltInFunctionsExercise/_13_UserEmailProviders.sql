SELECT `user_name`, REGEXP_REPLACE(`email`,'.*@','') AS 'email provider' from `users`
ORDER BY `email provider` ASC, `user_name` ASC;

SELECT `user_name`, SUBSTRING_INDEX(`email`, '@', -1) AS 'email provider' FROM `users`
ORDER BY `email provider` ASC, `user_name` ASC;
