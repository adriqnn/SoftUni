SELECT count(p.id) AS items_count,c.name,sum(quantity_in_stock) AS total_quantity FROM products AS p
JOIN categories AS c ON c.id = p.category_id
GROUP BY c.name
ORDER BY items_count DESC,total_quantity ASC LIMIT 5;