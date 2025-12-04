package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private final String dbUrl;
    private final String dbUser;
    private final String dbPass;

    public ProductDao(String dbUrl, String dbUser, String dbPass) {
        this.dbUrl = dbUrl;
        this.dbUser = dbUser;
        this.dbPass = dbPass;
    }

    public List<Product> searchProducts(String searchTerm){
        String sqlQuery = "SELECT * FROM products WHERE ProductName LIKE ?";
        List<Product> products = new ArrayList<>();

        try(Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass)){
            PreparedStatement ps = conn.prepareStatement(sqlQuery);

            ps.setString(1, "%" + searchTerm + "%");

            ResultSet rs = ps.executeQuery();

            //Take the result set, get the data out of it
            //Put it into a Java object
            while(rs.next()){
                Product product = new Product();

                product.setProductId(rs.getInt("ProductID"));
                product.setProductName(rs.getString("ProductName"));
                product.setSupplierId(rs.getInt("SupplierID"));
                product.setCategoryId(rs.getInt("CategoryID"));
                product.setQuantityPerUnit(rs.getString("QuantityPerUnit"));
                product.setUnitPrice(rs.getBigDecimal("UnitPrice"));
                product.setUnitsInStock(rs.getInt("UnitsInStock"));
                product.setUnitsOnOrder(rs.getInt("UnitsOnOrder"));
                product.setReorderLevel(rs.getInt("ReorderLevel"));
                product.setDiscontinued(rs.getBoolean("Discontinued"));

                products.add(product);
            }
        }
        catch(SQLException ex){
            System.out.println("Something went wrong with the db");
        }

        return products;
    }
}
