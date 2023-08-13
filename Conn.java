
package hotel.management.system1;
import java.sql.*;


public class Conn {
    Connection c;
    Statement s;
    Conn()  {
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
     c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ loginpage1","root","Shailesh123");
     s=c.createStatement(); 
      
      }
      catch (Exception e){
          e.printStackTrace();
      }
    }
}
