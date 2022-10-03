SELECT concat(left(p.description,30),'...') AS summary,date FROM photos AS p
WHERE DAY(p.date) =10
ORDER BY date DESC;