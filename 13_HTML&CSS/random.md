@"
            SELECT 
                UserId,
                SUM(CASE WHEN Year = @Year1 AND Month = @Month1 THEN Amount ELSE 0 END) AS PaidIn1,
                SUM(CASE WHEN Year = @Year2 AND Month = @Month2 THEN Amount ELSE 0 END) AS PaidIn2,
                SUM(CASE WHEN Year = @Year3 AND Month = @Month3 THEN Amount ELSE 0 END) AS PaidIn3,
                SUM(CASE WHEN Year = @Year4 AND Month = @Month4 THEN Amount ELSE 0 END) AS PaidIn4,
                SUM(CASE WHEN Year = @Year5 AND Month = @Month5 THEN Amount ELSE 0 END) AS PaidIn5
            FROM Payments
            WHERE 
                (Year = @Year1 AND Month = @Month1) OR
                (Year = @Year2 AND Month = @Month2) OR
                (Year = @Year3 AND Month = @Month3) OR
                (Year = @Year4 AND Month = @Month4) OR
                (Year = @Year5 AND Month = @Month5)
            GROUP BY UserId";
