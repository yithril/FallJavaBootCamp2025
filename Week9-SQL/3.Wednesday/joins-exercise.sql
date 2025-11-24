#1. List the product id, product name, unit price and category name of all products.  
#Order by category name and within that, by product name. 
#Looking at the select statement we'll need products and we'll need categories

SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
FROM products
JOIN Categories ON Products.CategoryID = Categories.CategoryID
ORDER BY Categories.CategoryName, Products.ProductName;

/*
2. List the product id, product name, unit price and supplier name of all products that 
cost more than $75.  Order by product name. 
*/
SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Suppliers.CompanyName
FROM products
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
WHERE Products.UnitPrice > 75
ORDER BY Products.ProductName;

/*
3. List the product id, product name, unit price, category name, and supplier 
name of every product.  Order by product name. 
*/

SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName, Suppliers.CompanyName
FROM Products 
JOIN Categories ON Products.CategoryId = Categories.CategoryId
JOIN Suppliers ON Products.SupplierId = Suppliers.SupplierId
ORDER BY Products.ProductName;

/*
4. What is the product name(s) and categories of the most expensive 
products?  HINT:  Find the max price in a subquery and then use that in 
your more complex query that joins products with categories. 
*/

SELECT Products.ProductName, Categories.CategoryName, Products.UnitPrice
FROM products
JOIN Categories ON Products.CategoryID = Categories.CategoryID
WHERE Products.UnitPrice = (SELECT MAX(UnitPrice) FROM Products);

/*
5. List the order id, ship name, ship address, and shipping company name of 
every order that shipped to Germany. 
*/
SELECT Orders.OrderId, ShipName, ShipAddress, CompanyName
FROM orders
JOIN Shippers ON Orders.ShipVia = Shippers.ShipperId
WHERE ShipCountry = 'Germany';

/*
6. List the order id, order date, ship name, ship address of all orders that 
ordered "Sasquatch Ale"? 
*/

SELECT Orders.OrderId, OrderDate, ShipName, ShipAddress
FROM orders
JOIN `order details` ON Orders.OrderID = `order details`.OrderId
JOIN Products ON `order details`.ProductID = Products.ProductID
WHERE Products.ProductName = 'Sasquatch Ale';