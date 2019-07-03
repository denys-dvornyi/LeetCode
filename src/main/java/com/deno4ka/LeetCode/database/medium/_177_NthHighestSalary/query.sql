-- TODO: Write a SQL query to get the nth highest salary from the Employee table.
 -- +----+--------+
 -- | Id | Salary |
 -- +----+--------+
 -- | 1  | 100    |
 -- | 2  | 200    |
 -- | 3  | 300    |
 -- +----+--------+
 -- For example, given the above Employee table, the nth highest salary where n = 2 is 200.
 -- If there is no nth highest salary, then the query should return null.
 -- +------------------------+
 -- | getNthHighestSalary(2) |
 -- +------------------------+
 -- | 200                    |
 -- +------------------------+

DROP FUNCTION IF EXISTS leet_code.getNthHighestSalary;

-- v1 Runtime: 238 ms, faster than 13.13%
# CREATE FUNCTION leet_code.getNthHighestSalary(N INT) RETURNS INT
# BEGIN
#     DECLARE offset INT;
#     SET offset := N - 1;
#     RETURN (
#         SELECT DISTINCT Salary FROM leet_code.Employee ORDER BY Salary DESC LIMIT offset, 1
#         );
# END;
# SELECT leet_code.getNthHighestSalary(11);

-- v2 without additional variable
CREATE FUNCTION leet_code.getNthHighestSalary(N INT) RETURNS INT
BEGIN
    SET N = N - 1;
    RETURN (
        SELECT DISTINCT Salary FROM leet_code.Employee ORDER BY Salary DESC LIMIT 1 OFFSET N
    );
END;
SELECT leet_code.getNthHighestSalary(10);
