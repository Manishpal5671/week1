import java.sql.*;

public class TweetDBEg {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		Connection ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/tweets","root","orcl");
		
		
		PreparedStatement ipt = ct.prepareStatement("Insert into Twitter values (?,?,?,?)");
		ipt.setInt(1, 3);
		ipt.setString(2, "Selvi");
		ipt.setString(3, "Home Maker");
		ipt.setInt(4, 200);
		
		int rst = ipt.executeUpdate();
		
		if(rst>0)
		{
			System.out.println("Insertion success");
		}