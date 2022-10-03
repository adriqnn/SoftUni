SELECT c.full_name,count(cr.id) AS counts,sum(cs.bill) FROM clients AS c
JOIN courses AS cs ON cs.client_id = c.id
JOIN cars AS cr ON cs.car_id = cr.id
GROUP BY c.id 
HAVING full_name LIKE '_a%' AND counts > 1
ORDER BY c.full_name