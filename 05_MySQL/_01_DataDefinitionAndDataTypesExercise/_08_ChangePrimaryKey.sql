ALTER TABLE `users`
DROP PRIMARY KEY,
ADD CONSTRAINT `pk_users_2` PRIMARY KEY (`id`, `username`);
