package org.example;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    //Get a category by a specific id
    //getXById
    public Optional<Category> getCategoryById(int id){
        String sqlQuery = "SELECT * FROM categories WHERE CategoryID = ?";

        try(Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass)){
            PreparedStatement ps = conn.prepareStatement(sqlQuery);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                int categoryId = rs.getInt("CategoryID");
                String categoryName = rs.getString("CategoryName");
                String description = rs.getString("Description");

                //Take your category and put it inside the optional box
                return Optional.of(new Category(categoryId, categoryName, description));
            }
        }
        catch(SQLException ex){
            System.out.println("There was a problem with the database");
            ex.printStackTrace();
        }

        return Optional.empty();
    }

    //C in CRUD
    //createX
    /*
    INSERT INTO categories(CategoryName, Description)
    VALUES('Electronics', 'Electronics and cool devices');
    */
    public Category createCategory(Category category){
        String sqlQuery = "INSERT INTO categories(CategoryName, Description) VALUES(?, ?)";

        try(Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass)){
            PreparedStatement ps = conn.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, category.getCategoryName());
            ps.setString(2, category.getDescription());

            //Execute Update is when you do Inserts or Updates
            int affectedRows = ps.executeUpdate();

            //If the number we get back is 0, it means our insert failed
            if(affectedRows > 0){
                try(ResultSet generatedKeys = ps.getGeneratedKeys()){
                    if(generatedKeys.next()){
                        category.setId(generatedKeys.getInt(1));
                    }
                }
            }

        }
        catch(SQLException ex){
            System.out.println("There was a problem with the database");
            ex.printStackTrace();
        }

        return category;
    }

    //UPDATE U in CRUD
    //EXAMPLE:
    /*
    UPDATE categories
    SET Description = 'Electronics are really cool'
    WHERE CategoryID = 15;
     */
    public Category updateCategory(Category category){
        String sqlQuery = "UPDATE categories SET Description = ? WHERE CategoryID = ?";

        try(Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass)){
            PreparedStatement ps = conn.prepareStatement(sqlQuery);

            ps.setString(1, category.getDescription());
            ps.setInt(2, category.getId());

            ps.executeUpdate();
        }
        catch(SQLException ex){
            System.out.println("There was a problem with the database");
            ex.printStackTrace();
        }

        return category;
    }

    /*
    Example:
    DELETE FROM categories
    WHERE CategoryID = 15;
     */
    public void deleteCategory(int id){
        String sqlQuery = "DELETE FROM categories WHERE CategoryID = ?";

        try(Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass)){
            PreparedStatement ps = conn.prepareStatement(sqlQuery);

            ps.setInt(1, id);

            ps.executeUpdate();
        }
        catch(SQLException ex){
            System.out.println("There was a problem with the database");
            ex.printStackTrace();
        }
    }
}
