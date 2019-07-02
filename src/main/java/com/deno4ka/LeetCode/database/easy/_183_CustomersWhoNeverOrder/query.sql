-- TODO: Suppose that a website contains two tables, the Customers table and the Orders table.
 -- Write a SQL query to find all customers who never order anything.
 -- Table: Customers.
 -- +----+-------+
 -- | Id | Name  |
 -- +----+-------+
 -- | 1  | Joe   |
 -- | 2  | Henry |
 -- | 3  | Sam   |
 -- | 4  | Max   |
 -- +----+-------+
 -- Table: Orders.
 -- +----+------------+
 -- | Id | CustomerId |
 -- +----+------------+
 -- | 1  | 3          |
 -- | 2  | 1          |
 -- +----+------------+
 -- Using the above tables as example, return the following:
 -- +-----------+
 -- | Customers |
 -- +-----------+
 -- | Henry     |
 -- | Max       |
 -- +-----------+

-- Runtime: 311 ms, faster than 15.22%
SELECT Name AS Customers FROM leet_code.Customers WHERE Id NOT IN (SELECT DISTINCT CustomerId FROM leet_code.orders);

-- Runtime: 354 ms, faster than 5.16%
SELECT Name AS Customers FROM leet_code.Customers
    LEFT JOIN leet_code.Orders ON leet_code.Customers.Id = leet_code.Orders.CustomerId
WHERE leet_code.Orders.CustomerId IS NULL;
