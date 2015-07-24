
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegistrationServlet
 */
@WebServlet({ "/UserRegistrationServlet", "/registration" })
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserRegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> inputs = new ArrayList<String>();
		List<String> errors = new ArrayList<String>();
		String value;
		inputs.add("first_name");
		inputs.add("last_name");
		inputs.add("email");
		inputs.add("password");
		inputs.add("password_confirmation");

		for (String inp : inputs){
			value = request.getParameter(inp);
			if((value == null) || "".equals(value)){
				errors.add("You forgot to enter " + inp.replace('_',' '));
			}
		}

		String p1 = request.getParameter("password");
		String p2 = request.getParameter("password_confirmation");
		
		if(p1.equals(p2) == false){
			errors.add("Passwords do not match");
		}
		
		response.setContentType("text/html");										// write to outgoing
		PrintWriter pw = response.getWriter();										// HTTP response so we 										// see something in browser

		if(errors.isEmpty()){
			Connection c = null;
			PreparedStatement ps = null;
			try{
				Class.forName("com.mysql.jdbc.Driver");

				String dburl = "jdbc:mysql://localhost:3306/sitename";
				String username = "student";
				String password = "ITS8028";
				c = DriverManager.getConnection(dburl, username, password);
				String insert = 
						"INSERT INTO users(first_name, last_name, email, pass, registration_date)" +
						"VALUES(?,?,?,SHA1(?),NOW())";
				ps = c.prepareStatement(insert);
				ps.setString(1, request.getParameter("first_name"));
				ps.setString(2, request.getParameter("last_name"));
				ps.setString(3, request.getParameter("email"));
				ps.setString(4, request.getParameter("password"));
				ps.executeUpdate();
				pw.println("<p>You are now registered</p>");				
			}catch (SQLException sqlex){
				sqlex.printStackTrace();
				pw.println("<p>There was an error</p>");
			} catch (Exception e){
				
			}
			finally {
				
			}
			
		} else {
			for (String e: errors){
				pw.println("<p>" + e + "</p>");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}



