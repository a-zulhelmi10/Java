import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {
	Connection con;
	
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaLoginPage", "root", "root");
		} catch (Exception e) {
			System.out.println(e);;
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			PreparedStatement pst = con.prepareStatement("select * from users where username='"+username+"' and password='"+password+"'");
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				String name = rs.getString("name");
				out.println("Welcome" +name);
				out.println("Click <a href=\"/WebProj/Login2.html\">here</a> to login");
			}
			else {
				out.println("Wrong username or password");
				out.println("Click <a href=\"/WebProj1/login.jsp\">here</a> to login");
			}
	
		}catch (Exception e) {
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
