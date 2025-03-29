package JDBC;

import java.sql.*;

public class PreparedStatementofjdbc {
    public static void main(String[] args) {

        try{
            String url ="jdbc:mysql://localhost:3306/aliens";
            String username ="root";
            String Password="221120107025";
            String Query = "insert into student values(?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url , username , Password); 
        PreparedStatement st = con.prepareStatement(Query);
        st.setInt(1, 7);
        st.setString(2, "abhinaban");
      
        int count = st.executeUpdate();


        System.out.println("row effected "+ count);
           
        st.close();
          con.close();
       
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
        
    }
    

