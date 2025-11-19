

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	Connection con;
	
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //connect to mysql using jdbc
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaLoginPage", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			PreparedStatement pst = con.prepareStatement("select * from users where username='"+username+"' and password='"+password+"'");
			ResultSet rs = pst.executeQuery();  //.executeQuery sends the query to DB then store it to rs
			if (rs.next()) {
				String name = rs.getString("name");
				out.println("Welcome " +name);
				out.println("<br>Go to <a href=\"/WebProj3/login.html\">homepage</a>");
			}
			else {
				out.println("Wrong username or password");
				out.println("<br>Click <a href=\"/WebProj3/login.html\">here</a> to login");
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
