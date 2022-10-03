SELECT `category_id`, round(AVG(`price`),2) AS 'Average Price', round(min(`price`),2) AS 'Cheapest Product', round(max(`price`),2) AS 'Most Expensive Product'
FROM `products`
GROUP BY `category_id`;