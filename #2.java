public class Tweet {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tweetdb", "root", "orcl");
            //using preparedstatement
            PreparedStatement ps = con.prepareStatement("select * from tweet where tweet_text LIKE 'a%'");
            System.out.println("print the tweet data");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){  
                System.out.println(rs.getInt(1)+" "+rs.getString(2));  
                }  
            rs.close();
            ps.close();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}