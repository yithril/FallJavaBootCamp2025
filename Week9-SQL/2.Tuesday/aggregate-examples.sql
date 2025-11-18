#Aggregates! SUM COUNT MIN MAX AVG
#Rule 1 They belong in the select statement

#Count
#How many of our customers are in Germany?
SELECT COUNT(*)
FROM customers
WHERE Country = 'Germany';

#How many Distinct countries are our customers from?
SELECT COUNT(DISTINCT(Country))
FROM customers;

#What is the price of our most expensive product
SELECT MAX(UnitPrice)
FROM products;

#What is the price of the least expensive product
SELECT MIN(UnitPrice)
FROM products;

#What is the avg freight of orders shipped to France?
#AS is for aliases
SELECT AVG(freight) AS 'Average Freight'
FROM orders
WHERE ShipCountry = 'France';

#What is the total salary of all employees?
SELECT SUM(salary)
FROM employees;

#Breakdown freight by country
#In the select statement, you can have aggregates
#you can also have a column that is in group by
#you CANNOT select a column that is not an aggregate and not in group by
SELECT AVG(freight), ShipCountry
FROM orders
GROUP BY ShipCountry
ORDER BY ShipCountry;

#I want to get the avg freight broken down by country
#I only want to see avg freight greater then 50
#Group By -> Having not WHERE
SELECT FORMAT(AVG(freight), 2), ShipCountry
FROM orders
GROUP BY ShipCountry
HAVING AVG(freight) > 50
ORDER BY ShipCountry;