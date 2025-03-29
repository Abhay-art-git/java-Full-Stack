package JDBC;

/*
 * Steps for Loading JDBC
 * import 
 * load and register
 * Create Connection
 * Create Statement
 * execute the Query
 * Process the results
 * close
 */

import java.sql.*;
public class jdbcConnection{
    public static void main(String[] args) {
        try{
            String url ="jdbc:mysql://localhost:3306/aliens";
            String username ="root";
            String Password="221120107025";
            String query="select * from student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url ,username , Password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
        String name = rs.getInt(1) + ":" + rs.getString(2) ;
        
       
        System.out.println(name);



         
        }
        st.close();
        con.close();


        }
        catch (Exception e) {
            e.printStackTrace();
          
        }

        
    }
}
