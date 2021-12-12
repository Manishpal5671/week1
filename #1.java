 
import java.sql.*;
 
public class AccountsEg {
    public static void main(String[] args) throws Exception {
        // 1 - load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
 
        // 2 - create connection
        Connection ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/tweet", "root", "orcl");
 
        // 3- create Statement
        Statement st = ct.createStatement();
 
        // 4- perform querying/insert/update based on req.
        ResultSet rs = st.executeQuery("select * from tweets");
 
        while (rs.next()) {
            int account_id = rs.getInt(1);
            String name = rs.getString(2);
            int balance = rs.getInt(3);
 
            System.out.println(account_id + "\t" + name + "\t" + balance);
        }
 
        // 5 - clsoe connection
        rs.close();
        st.close();
        ct.close();
 
    }
}	