import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class WelcomeServletHTML extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter kurkur = response.getWriter();
		response.setContentType("text/html");
		kurkur.println("Welcome to Servlet");
		kurkur.println("<p>This is from HTML</p>");
	}
}
