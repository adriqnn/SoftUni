SELECT `user_name`, REGEXP_REPLACE(`email`,'.*@','') AS 'email provider' from `users`
ORDER BY `email provider` ASC, `user_name` ASC;