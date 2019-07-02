-- TODO: Write a SQL query to find all duplicate emails in a table named Person.
 -- +----+---------+
 -- | Id | Email   |
 -- +----+---------+
 -- | 1  | a@b.com |
 -- | 2  | c@d.com |
 -- | 3  | a@b.com |
 -- +----+---------+
 -- For example, your query should return the following for the above table:
 -- +---------+
 -- | Email   |
 -- +---------+
 -- | a@b.com |
 -- +---------+
 -- Note: All emails are in lowercase.

-- Runtime: 241 ms, faster than 15.07%
SELECT Email FROM (SELECT COUNT(1) AS count, Email FROM leet_code.person GROUP BY Email) AS P WHERE count > 1;

-- using HAVING
# SELECT Email FROM leet_code.person GROUP BY Email HAVING count(*) > 1;
