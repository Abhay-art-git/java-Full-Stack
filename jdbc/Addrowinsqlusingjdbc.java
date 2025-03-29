package JDBC;

import java.sql.*;
public class Addrowinsqlusingjdbc{
    public static void main(String[] args) {
        try{
            String url ="jdbc:mysql://localhost:3306/aliens";
            String username ="root";
            String Password="221120107025";
            String Query = "insert into student values(6,'maninav')";
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url , username , Password); 
        Statement st = con.createStatement();
        int count = st.executeUpdate(Query);

        System.out.println("row effected "+ count);
           
        st.close();
          con.close();
       
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}