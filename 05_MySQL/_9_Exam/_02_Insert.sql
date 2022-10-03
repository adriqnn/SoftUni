INSERT INTO reviews (content,rating,picture_url,published_at)
(SELECT left(p.description,15),p.price/8,reverse(p.name),'2010-10-10' FROM products AS p
WHERE p.id >= 5);