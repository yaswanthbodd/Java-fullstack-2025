import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/ServletContextDemo")
public class ServletContextDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletContext context= getServletContext();
		String collegeName = context.getInitParameter("collegeName");
		out.println("College Name "+collegeName);
				
	}
}

/* 
 web.xml
 <web-app>
 	<context-param>
 		<param-name>collegeName</param-name>
 		<param-value>LBRCE</param-value>
 	</context-param>
  </web-app>
 * */
