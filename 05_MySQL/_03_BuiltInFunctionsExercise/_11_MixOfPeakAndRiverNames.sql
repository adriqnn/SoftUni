SELECT p.peak_name, r.river_name, lower(concat(LEFT(p.peak_name, char_length(p.peak_name)-1),r.river_name)) AS mix 
FROM `peaks` AS p, `rivers` AS r
WHERE lower(RIGHT(p.peak_name,1)) = lower(LEFT(r.river_name,1))
ORDER BY mix;