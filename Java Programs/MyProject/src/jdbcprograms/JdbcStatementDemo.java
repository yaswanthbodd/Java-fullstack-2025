package jdbcprograms;
import java.sql.*;
public class JdbcStatementDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java11","root","root");
			System.out.println("Connected...");
			//Statement
			Statement st1=con.createStatement();
			//st1.execute("create table product (pid int(3), pname varchar(10), price float(4))");
			//System.out.println("Table created");
			
			//Inserting the values into the table
//			st1.executeUpdate("insert into product values (111,'monitor',5000)");
//			st1.executeUpdate("insert into product values (222,'keyboard',500)");
//			st1.executeUpdate("insert into product values (333,'mouse',300)");
//			System.out.println("Inserted");
			
			//Updating the records
//			int n=st1.executeUpdate("update product set price=600");
//			System.out.println(n+" Updated records");
			
			//Delete the records
//			int n=st1.executeUpdate("delete from product");
//			System.out.println(n+" records deleted");
			
			//Results or to see records in the table using SELECT command
			ResultSet rs=st1.executeQuery("select * from product");
			while(rs.next()) {
				System.out.println(rs.getInt("pid")+" "+rs.getString("pname")+" "+rs.getFloat("price"));
			}
			st1.close();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
