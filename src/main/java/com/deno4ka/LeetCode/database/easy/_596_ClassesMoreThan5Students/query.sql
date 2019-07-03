-- TODO: There is a table courses with columns: student and class
 -- Please list out all classes which have more than or equal to 5 students.
 -- For example, the table:
 -- +---------+------------+
 -- | student | class      |
 -- +---------+------------+
 -- | A       | Math       |
 -- | B       | English    |
 -- | C       | Math       |
 -- | D       | Biology    |
 -- | E       | Math       |
 -- | F       | Computer   |
 -- | G       | Math       |
 -- | H       | Math       |
 -- | I       | Math       |
 -- +---------+------------+
 -- Should output:
 -- +---------+
 -- | class   |
 -- +---------+
 -- | Math    |
 -- +---------+

-- Runtime: 273 ms, faster than 5.47%
# SELECT class FROM (SELECT class FROM leet_code.Courses GROUP BY class, student) AS C GROUP BY class HAVING count(*) >=5;

-- Runtime: 254 ms, faster than 19.44%
SELECT class FROM leet_code.Courses GROUP BY class HAVING count(DISTINCT student) >=5;