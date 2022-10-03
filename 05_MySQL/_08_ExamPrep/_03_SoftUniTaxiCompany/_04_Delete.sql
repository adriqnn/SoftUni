DELETE FROM clients
WHERE id NOT IN (SELECT client_id FROM courses) AND char_length(full_name) > 1;