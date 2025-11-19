package welcome;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PlayerLoginServlet extends HttpServlet {
	Connection con;

	public void init() {
		ServletContext context = getServletContext();
		String driver = context.getInitParameter("driver");
		String url = context.getInitParameter("url");
		String username = context.getInitParameter("username");
		String password = context.getInitParameter("password");
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String password = request.getParameter("pswd");
		try {
			PreparedStatement pst = con.prepareStatement(
					"select * from psgclub where username='" + username + "' and password='" + password + "'");
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				String name = rs.getString(1);
				out.println("<h1>Welcome " + name + "!</h1>");
				out.println("<a href=\"/PSG/playerlogin.html\">login back</a>");
				request.setAttribute("name", name);
				request.getRequestDispatcher("/hiplayer.jsp").forward(request, response);
				
			} else {
				out.println("<h1>Player not Found</h1>");
				out.println("<a href=\"/PSG/playerlogin.html\">login back</a>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
