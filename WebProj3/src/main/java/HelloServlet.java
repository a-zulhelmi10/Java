import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloServlet") //HelloServlet is the url pattern. If you dont write this the browser wil display error http://localhost:8080/WebProj3/HelloServlet
public class HelloServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello world <br>"); 
		response.setContentType("text/html"); //to include html text
		out.println("<font face=\"arial\" size=\"5\" color=\"green\">Good Morning</font>");
		out.println("Click <a href=\"/WebProj3/login.html\">here</a>");
	}
}
