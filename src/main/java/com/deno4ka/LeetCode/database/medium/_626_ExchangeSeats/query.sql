-- TODO: Mary is a teacher in a middle school and she has a table seat storing students' names and their corresponding seat ids.
 -- The column id is continuous increment.
 -- Mary wants to change seats for the adjacent students.
 -- Can you write a SQL query to output the result for Mary?
 -- +---------+---------+
 -- |    id   | student |
 -- +---------+---------+
 -- |    1    | Abbot   |
 -- |    2    | Doris   |
 -- |    3    | Emerson |
 -- |    4    | Green   |
 -- |    5    | Jeames  |
 -- +---------+---------+
 -- For the sample input, the output is:
 -- +---------+---------+
 -- |    id   | student |
 -- +---------+---------+
 -- |    1    | Doris   |
 -- |    2    | Abbot   |
 -- |    3    | Green   |
 -- |    4    | Emerson |
 -- |    5    | Jeames  |
 -- +---------+---------+
 -- Note: If the number of students is odd, there is no need to change the last one's seat.

-- Runtime: 220 ms, faster than 5.58%
SELECT IF(id % 2 = 1 AND id = cnt, id, IF(id % 2 = 1, id + 1, id - 1)) as id, student FROM leet_code.Seat, (SELECT count(*) as cnt FROM leet_code.Seat) as c ORDER BY id;

-- variant 2
SELECT IF(id < (SELECT count(1) FROM leet_code.Seat), IF(id MOD 2 = 0, id - 1, id + 1), IF(id MOD 2 = 0, id - 1, id)) AS id, student
FROM leet_code.Seat ORDER BY id;
