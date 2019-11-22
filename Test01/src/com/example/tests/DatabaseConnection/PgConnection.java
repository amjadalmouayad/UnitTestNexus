package com.example.tests.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PgConnection {
	
    private final String url = "jdbc:postgresql://10.3.0.208:5432/ncall";
    private final String user = "sa_ncall";
    private final String password = "@%NcalL%@";
 
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	PgConnection pgcon = new PgConnection();
        pgcon.connect();
        
               
    }
    


    


    
    /////
    
    /**
     * Display actor
     *
     * @param rs
     * @throws SQLException
     */
    public void displayActor(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println(rs.getString("id") + "\t"
                    + rs.getString("name") + "\t"
                    + rs.getString("descricao"));
 
        }
    }

    
    /////
    
    public void getActors() {
    	 
        String SQL = "SELECT id,name, descricao FROM fila";
 
        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            // display actor information
            displayActor(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

	
}
