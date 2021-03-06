SELECT 
    w.deposit_group, SUM(w.deposit_amount) AS 'total_sum'
FROM
    wizzard_deposits AS w
WHERE
    w.magic_wand_creator LIKE ('Ollivander family')
GROUP BY deposit_group
ORDER BY deposit_group;
