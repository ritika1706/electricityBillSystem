package electricitybillingsystem;



import java.sql.*;

public class database {
    Connection connection;
    Statement statement;
    database(){
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill_system","root","MYsqlpass123@");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


