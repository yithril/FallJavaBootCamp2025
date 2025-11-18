SELECT *
FROM employees
WHERE Country = 'UK';

#Comments use hashtag
/* Multi line comments */

#All the employees who live in London
SELECT *
FROM employees
WHERE City = 'London';

#What products are over $20?
# > < >= <= =
SELECT *
FROM products
WHERE UnitPrice > 20;

#Which employees do NOT live in London
#!= in Java is <> in SQL
SELECT *
FROM employees
WHERE City <> 'London';

#You can use AND/OR in WHERE clauses
#All orders that were shipped to France or Switzerland
SELECT *
FROM orders
WHERE ShipCountry = 'France' OR ShipCountry = 'Switzerland';

#What orders went to mexico that cost more than 50 to ship
SELECT *
FROM orders
WHERE ShipCountry = 'Mexico' AND Freight > 50;

#What customers come from Germany, Sweden, or Spain
 SELECT *
 FROM customers
 WHERE Country IN ('Germany', 'Sweden', 'Spain');
 
 SELECT *
 FROM orders
 WHERE OrderDate BETWEEN '1996-07-15' AND '1996-07-21';
 
 #How do we alphabetize things?
 #I want a list of employee names in order of last name
 SELECT LastName, FirstName
 FROM employees
 ORDER BY LastName;
 
 #I want a list of employees in reverse order
 SELECT LastName, FirstName
 FROM employees
 ORDER BY LastName DESC;
 
#What countries do we ship to?
SELECT DISTINCT(ShipCountry)
FROM orders
ORDER BY ShipCountry;
