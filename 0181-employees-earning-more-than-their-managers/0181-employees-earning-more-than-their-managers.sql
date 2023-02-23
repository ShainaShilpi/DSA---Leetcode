# Write your MySQL query statement below
SELECT t1.Name as Employee
FROM Employee as t1
LEFT JOIN Employee as t2
ON t1.ManagerId = t2.Id
WHERE t1.Salary > t2.Salary ;