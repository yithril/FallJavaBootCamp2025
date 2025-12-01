package org.example;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//This class is responsible for talking
//to the database
public class CategoryDao {
    //properties for the info we need to connect
    //to the database
    private final String dbUrl;
    private final String dbUser;
    private final String dbPass;

    public CategoryDao(String dbUrl, String dbUser, String dbPass) {
        this.dbUrl = dbUrl;
        this.dbUser = dbUser;
        this.dbPass = dbPass;
    }

    //CRUD Functions
    //READ -> Get All Categories
    //The names of the functions follow a pattern for CRUD
    //the convention is getAllX OR getX
    public List<Category> getAllCategories(){
        List<Category> categories = new ArrayList<>();
        String sqlQuery = "SELECT * FROM categories";

        //connect to the database
        //We're going to use a special kind of try/catch
        //try-with has parenthesis after the try
        try(Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass)){
            //Prepared statement is the SAFE way to run SQL Queries
            PreparedStatement ps = conn.prepareStatement(sqlQuery);
            //Actually run the query
            ResultSet rs = ps.executeQuery();

            //Take the result set, get the data out of it
            //Put it into a Java object
            while(rs.next()){
                int categoryId = rs.getInt("CategoryID");
                String categoryName = rs.getString("CategoryName");
                String description = rs.getString("Description");

                Category category = new Category(categoryId, categoryName, description);

                categories.add(category);
            }
        }
        catch(SQLException ex){
            System.out.println("There was a problem with the database");
            ex.printStackTrace();
        }

        return categories;
    }
}
