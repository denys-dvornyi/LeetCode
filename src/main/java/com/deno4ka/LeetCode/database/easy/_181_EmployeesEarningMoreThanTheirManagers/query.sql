-- TODO: The Employee table holds all employees including their managers.
 --      Every employee has an Id, and there is also a column for the manager Id.
 -- +----+-------+--------+-----------+
 -- | Id | Name  | Salary | ManagerId |
 -- +----+-------+--------+-----------+
 -- | 1  | Joe   | 70000  | 3         |
 -- | 2  | Henry | 80000  | 4         |
 -- | 3  | Sam   | 60000  | NULL      |
 -- | 4  | Max   | 90000  | NULL      |
 -- Given the Employee table, write a SQL query that finds out employees who earn more than their managers.
 -- For the above table, Joe is the only employee who earns more than his manager.
 -- +----------+
 -- | Employee |
 -- +----------+
 -- | Joe      |
 -- +----------+

# SELECT E.Id, E.Name, E.Salary, (SELECT M.Salary FROM leet_code.Employee M WHERE E.ManagerId = M.Id) AS ManagerSalary
# FROM leet_code.Employee E WHERE ManagerId IS NOT NULL AND E.Salary > (SELECT M.Salary FROM leet_code.Employee M WHERE E.ManagerId = M.Id);

-- not so fast... Runtime: 613 ms, faster than 19.42%
# SELECT E.Name AS Employee FROM leet_code.Employee E WHERE ManagerId IS NOT NULL AND E.Salary > (SELECT M.Salary FROM leet_code.Employee M WHERE E.ManagerId = M.Id);

-- Runtime: 348 ms
# SELECT e.Name AS Employee FROM leet_code.Employee e, leet_code.Employee m
# WHERE e.ManagerId=m.Id AND e.Salary > m.Salary;

-- Runtime: 298 ms
SELECT Employee.Name AS Employee FROM leet_code.Employee
    JOIN leet_code.Employee AS Manager ON Manager.Id = Employee.ManagerId
WHERE Employee.Salary > Manager.Salary;