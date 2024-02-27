import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class A extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("u1");
		String s2=request.getParameter("u2");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///ajava556","root","Saloni@123");
			Statement st=con.createStatement();
			String s11="insert into regis111 values ('"+s1+"','"+s2+"')";
			st.executeUpdate(s11);
			out.println("data inserted");
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}
}