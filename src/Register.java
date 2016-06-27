

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:mysql://localhost:3306/RForWeb","username","password");

        PreparedStatement ps=con.prepareStatement
                  ("insert into user values(?,?,?)");

        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, pass);
        int i=ps.executeUpdate();
        
          if(i>0){
        	  RequestDispatcher rs = request.getRequestDispatcher("welcome.html");
        	  rs.include(request, response);
          }
        
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }
	
      }
  }