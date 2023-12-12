# Write your MySQL query statement below
SELECT 
    COUNT(DISTINCT lead_id) AS unique_leads, 
    COUNT(DISTINCT partner_id) AS unique_partners, 
    date_id, 
    make_name
FROM
    DailySales
GROUP BY
    date_id, make_name
