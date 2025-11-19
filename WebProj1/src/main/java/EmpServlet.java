//from emp.html
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class EmpServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter(); //connect to the browser where we get the request
		response.setContentType("text/html");
		String eNo = request.getParameter("eNo"); //then read the form
		String eName = request.getParameter("eName");
		String eSalary= request.getParameter("eSalary");
		out.println("<table border>");//Create table (display the data in table)
		out.println("<tr><th>Emp No<th><td>"+eNo+"</td></tr>");//first row
		out.println("<tr><th>Emp Name<th><td>"+eName+"</td></tr>");
		out.println("<tr><th>Emp Salary<th><td>"+eSalary+"</td></tr>");
		out.println("</table>");
		out.println("Click <a href=\"/WebProj1/emp.html\">here</a> to login");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
