

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

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	Connection con;
	public void init(ServletConfig config) { //ServletConfig used to read init parameter from web.xml
		String driver  = config.getInitParameter("driver");
		String url  = config.getInitParameter("url");
		String username  = config.getInitParameter("username");
		String password  = config.getInitParameter("password");
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,username,password);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			PreparedStatement pst = con.prepareStatement("insert into users values ('"+name+"', '"+username+"', '"+password+"')");
			pst.executeUpdate();
			out.println("Registered Successfully<br>");
			out.println("Click <a href=\"/WebProj3/login.html\">here</a> to login");
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
