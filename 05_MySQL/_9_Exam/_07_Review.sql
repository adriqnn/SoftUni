SELECT id,content,rating,picture_url,published_at FROM reviews AS r
WHERE content LIKE 'My%' AND char_length(content) > 61
ORDER BY rating DESC;