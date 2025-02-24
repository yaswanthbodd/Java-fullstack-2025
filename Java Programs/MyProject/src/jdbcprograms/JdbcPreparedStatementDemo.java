package jdbcprograms;
import java.util.*;
import java.sql.*;
public class JdbcPreparedStatementDemo {
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Product Id : ");
		int pid=s.nextInt();
		System.out.println("Enter Product Name : ");
		String pname=s.next();
		System.out.println("Enter Product Price : ");
		float price=s.nextFloat();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java11","root","root");
//			ps=con.prepareStatement("insert into product values(?,?,?)");
//			ps.setInt(1, pid);
//			ps.setString(2, pname);
//			ps.setFloat(3,price);
//			ps.executeUpdate();
			
			ps=con.prepareStatement("insert into product values ("+pid+",'"+pname+"',"+price+")");
			ps.executeUpdate();
			System.out.println("Inserted....");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			ps.close();
			con.close();
		}
	}

}
