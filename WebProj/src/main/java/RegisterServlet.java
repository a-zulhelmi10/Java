import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {
	Connection con;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaLoginPage", "root", "root");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			PreparedStatement pst = con.prepareStatement("insert into users values ('"+name+"', '"+username+"', '"+password+"')");
			pst.executeUpdate();
			out.println("Registered Successfully");
			out.println("Click <a href=\"/WebProj/login.jsp\">here</a> to login");
		} catch (Exception e) {
			out.println(e);
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public void destroy() {
		try {
			con.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	

}
