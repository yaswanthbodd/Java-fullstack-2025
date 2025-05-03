import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String pid=request.getParameter("pid");
		String pname = request.getParameter("pname");
		String price =  request.getParameter("price");
		out.println("<table border>");
		out.println("<tr> <th>Product ID </th><td>"+pid+"</td></tr>");
		out.println("<tr><th>Product Name </th><td>"+pname+"</td></tr>");
		out.println("<tr><th>Product Price </th><td>"+price+"</td></tr>");
		out.println("</table>");	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
