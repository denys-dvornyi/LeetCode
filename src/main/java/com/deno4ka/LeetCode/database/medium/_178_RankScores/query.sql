-- TODO: Write a SQL query to rank scores. If there is a tie between two scores, both should have the same ranking.
 -- Note that after a tie, the next ranking number should be the next consecutive integer value.
 -- In other words, there should be no "holes" between ranks.
 -- +----+-------+
 -- | Id | Score |
 -- +----+-------+
 -- | 1  | 3.50  |
 -- | 2  | 3.65  |
 -- | 3  | 4.00  |
 -- | 4  | 3.85  |
 -- | 5  | 4.00  |
 -- | 6  | 3.65  |
 -- +----+-------+
 -- For example, given the above Scores table, your query should generate the following report (order by highest score):
 -- +-------+------+
 -- | Score | Rank |
 -- +-------+------+
 -- | 4.00  | 1    |
 -- | 4.00  | 1    |
 -- | 3.85  | 2    |
 -- | 3.65  | 3    |
 -- | 3.65  | 3    |
 -- | 3.50  | 4    |
 -- +-------+------+

# SET @index = 1, @lastScore = (SELECT Score FROM leet_code.Scores ORDER BY Score DESC LIMIT 1);

# SELECT O.Score, cast(O.`Rank` AS UNSIGNED) `Rank` FROM (SELECT Score, IF(@lastScore = Score, @index, @index := @index + 1) AS `Rank`, @lastScore := Score FROM (SELECT @index := 0) AS I, (SELECT @lastScore = (SELECT Score FROM leet_code.Scores ORDER BY Score DESC LIMIT 1)) AS L, leet_code.Scores ORDER BY Score DESC) AS O;

# SELECT Score, @index := @index + 1 AS `Rank` FROM (SELECT @index := 0) AS I, leet_code.Scores ORDER BY Score DESC;

# SELECT Score FROM (SELECT @index := 0) AS I, leet_code.Scores ORDER BY Score DESC;

SELECT s.Score, t.Score distinctScore FROM (SELECT DISTINCT Score FROM leet_code.Scores) AS t, leet_code.Scores AS s WHERE s.Score <= t.Score;

SELECT s.Score, COUNT(t.Score) AS `Rank` FROM
    (SELECT DISTINCT Score FROM leet_code.Scores) AS t, leet_code.Scores AS s
WHERE s.Score <= t.Score
GROUP BY s.Id, s.Score;

-- solved with the help of Google ;(
-- Runtime: 541 ms, faster than 59.87%
SELECT s.Score, COUNT(t.Score) AS `Rank` FROM
    (SELECT DISTINCT Score FROM leet_code.Scores) AS t, leet_code.Scores AS s
WHERE s.Score <= t.Score
GROUP BY s.Id, s.Score
ORDER BY s.Score DESC;

-- from leet.code with variables
SELECT Score, cast(`rank` as unsigned) `Rank` FROM (SELECT Score, @rank:=@rank+(Score<>@prev) `rank`, @prev:=Score FROM leet_code.Scores, (SELECT @prev := -1, @rank := 0) dummy ORDER BY Score DESC) a;
