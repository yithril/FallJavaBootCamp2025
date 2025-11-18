#1. How many suppliers are there?  Use a query! 
SELECT COUNT(*)
FROM suppliers;

#2. What is the sum of all the employee's salaries? 
SELECT SUM(Salary)
FROM employees;

#3. What is the price of the cheapest item that Northwind sells?  
SELECT FORMAT(MIN(UnitPrice), 2)
FROM products;

#4. What is the average price of items that Northwind sells? 
SELECT FORMAT(AVG(UnitPrice), 2)
FROM products;

#5. What is the price of the most expensive item that Northwind sells? 
SELECT MAX(UnitPrice)
FROM products;

/*
6. What is the supplier ID of each supplier and the number of items they 
supply?  You can answer this query by only looking at the Products table. 
*/
SELECT supplierId, COUNT(*)
FROM products
GROUP BY supplierId;

/*
7. What is the category ID of each category and the average price of each item 
in the category?  You can answer this query by only looking at the Products 
table. 
*/

SELECT AVG(unitprice), categoryId
FROM products
GROUP BY categoryId
ORDER BY categoryId;

/*
8. For suppliers that provide at least 5 items to Northwind, what is the 
supplier ID of each supplier and the number of items they supply?  You 
can answer this query by only looking at the Products table. 
*/
SELECT supplierId, COUNT(*)
FROM products
GROUP BY supplierId
HAVING COUNT(*) >= 5;

/*
9. List the product id, product name, and inventory value (calculated by 
multiplying unit price by the number of units on hand).  Sort the results in 
descending order b
*/

SELECT productId, productName, unitprice * unitsinstock AS `inventory value`
FROM products
ORDER BY `inventory value` DESC, productName;

