import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	Connection con;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java11","root","root");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try {
			PreparedStatement st=con.prepareStatement("select * from users where username='"+username+"' and password='"+password+"'");
			ResultSet rs=st.executeQuery();
			if(rs.next()) {
				String name=rs.getString("name");
				out.println("Welcome "+name);
				out.println("</br>Click <a href=\"/LoginApplication/login.html\">here</a> to login");
				
			}else {
				out.println("Login Failure");
				out.println("</br>Click <a href=\"/LoginApplication/login.html\">here</a> to login");
			}
		}catch(Exception e) {
			out.println(e);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	public void destory() {
		try {
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
