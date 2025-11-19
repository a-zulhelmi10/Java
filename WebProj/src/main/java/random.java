import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class random extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Welcome to Servlet");
	}
}
