-- TODO: Given a Weather table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.
 -- +---------+------------------+------------------+
 -- | Id(INT) | RecordDate(DATE) | Temperature(INT) |
 -- +---------+------------------+------------------+
 -- |       1 |       2015-01-01 |               10 |
 -- |       2 |       2015-01-02 |               25 |
 -- |       3 |       2015-01-03 |               20 |
 -- |       4 |       2015-01-04 |               30 |
 -- +---------+------------------+------------------+
 -- For example, return the following Ids for the above Weather table:
 -- +----+
 -- | Id |
 -- +----+
 -- |  2 |
 -- |  4 |
 -- +----+

-- Runtime: 1508 ms, faster than 5.06%
SELECT Id FROM leet_code.Weather AS W WHERE Temperature > (SELECT Temperature FROM leet_code.Weather WHERE RecordDate = DATE_SUB(W.RecordDate, INTERVAL 1 DAY));

-- with JOIN
SELECT weather.Id AS 'Id' FROM weather
JOIN weather w ON DATEDIFF(weather.RecordDate, w.RecordDate) = 1 AND weather.Temperature > w.Temperature;
