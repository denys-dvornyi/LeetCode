-- TODO: Write a SQL query to find all numbers that appear at least three times consecutively.
 -- +----+-----+
 -- | Id | Num |
 -- +----+-----+
 -- | 1  |  1  |
 -- | 2  |  1  |
 -- | 3  |  1  |
 -- | 4  |  2  |
 -- | 5  |  1  |
 -- | 6  |  2  |
 -- | 7  |  2  |
 -- +----+-----+
 -- For example, given the above Logs table, 1 is the only number that appears consecutively for at least three times.
 -- +-----------------+
 -- | ConsecutiveNums |
 -- +-----------------+
 -- | 1               |
 -- +-----------------+

-- join table with itself
# SELECT DISTINCT DL.Num AS ConsecutiveNums FROM leet_code.Logs AS DL, leet_code.Logs AS L1, leet_code.Logs AS L2
# WHERE DL.Id = L1.Id - 1 AND L1.Id - 1 = L2.Id - 2 AND DL.Num = L1.Num AND L2.Num;

-- with inner join Runtime: 754 ms, faster than 9.64%
# SELECT DISTINCT DL.Num AS ConsecutiveNums FROM leet_code.Logs AS DL
#     INNER JOIN leet_code.Logs AS L1 ON (DL.Id = L1.Id - 1 AND DL.Num = L1.Num)
#     INNER JOIN leet_code.Logs AS L2 ON (L1.Id - 1 = L2.Id - 2 AND L1.Num = L2.Num);

-- with local variables
SELECT DISTINCT Summary.num as ConsecutiveNums
FROM (SELECT num, (CASE WHEN @record = num THEN @count := @count + 1 WHEN @record := num THEN @count := 1 END ) AS count_result FROM leet_code.Logs,
        (SELECT @record := NULL, @count := 0) AS InitValues
     ) AS Summary
WHERE Summary.count_result >= 3;