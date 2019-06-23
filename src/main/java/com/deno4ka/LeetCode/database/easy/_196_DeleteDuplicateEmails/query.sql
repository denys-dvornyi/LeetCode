-- TODO: delete all duplicate email entries in a table named Person, keeping only unique emails based on its smallest Id.
 -- +----+------------------+
 -- | Id | Email            |
 -- +----+------------------+
 -- | 1  | john@example.com |
 -- | 2  | bob@example.com  |
 -- | 3  | john@example.com |
 -- +----+------------------+
 -- Id is the primary key column for this table.
 -- For example, after running your query, the above Person table should have the following rows:
 -- +----+------------------+
 -- | Id | Email            |
 -- +----+------------------+
 -- | 1  | john@example.com |
 -- | 2  | bob@example.com  |
 -- +----+------------------+

# SELECT Id, Email FROM leet_code.person GROUP BY Email HAVING MIN(Id);
# SELECT Id, Email FROM leet_code.person GROUP BY Email HAVING MAX(Id);
# SELECT Email, MAX(Id) FROM leet_code.person GROUP BY Email;
# SELECT Email, MIN(Id) FROM leet_code.person GROUP BY Email;
# SELECT MAX(Id) FROM leet_code.person GROUP BY Email;
# SELECT MIN(Id) FROM leet_code.person GROUP BY Email;
# SELECT Id, Email FROM leet_code.person GROUP BY Email;

# DELETE FROM leet_code.person WHERE Id NOT IN (SELECT P.Id FROM (SELECT Id FROM leet_code.person GROUP BY Email HAVING MIN(Id) ORDER BY Id ASC) as P);

-- Runtime: 540 ms, faster than 94.75%
DELETE FROM leet_code.person WHERE Id NOT IN (SELECT P.Id FROM (SELECT MIN(Id) AS Id FROM leet_code.person GROUP BY Email) as P);
