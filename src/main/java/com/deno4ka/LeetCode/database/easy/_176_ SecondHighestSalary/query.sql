-- TODO: Write a SQL query to get the second highest salary from the Employee table.
 -- +----+--------+
 -- | Id | Salary |
 -- +----+--------+
 -- | 1  | 100    |
 -- | 2  | 200    |
 -- | 3  | 300    |
 -- +----+--------+
 -- For example, given the above Employee table, the query should return 200 as the second highest salary.
 -- If there is no second highest salary, then the query should return null.

-- not so fast...
# SELECT IFNULL(
#    (SELECT DISTINCT Employee.Salary
#    FROM leet_code.Employee ORDER BY Employee.Salary DESC LIMIT 1, 1), null
# ) AS SecondHighestSalary;

-- Runtime: 123 ms, faster than 94.72% of MySQL online submissions for Second Highest Salary.
SELECT (
   (SELECT DISTINCT Employee.Salary
    FROM leet_code.Employee ORDER BY Employee.Salary DESC LIMIT 1, 1)
) AS SecondHighestSalary;
