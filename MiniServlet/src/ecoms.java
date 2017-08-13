

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


@WebServlet("/Servlet")
public class ecoms extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		
		String fnm=request.getParameter("fname");
		String lnm=request.getParameter("lname");
		String unm=fnm.concat(lnm);
		if (unm.equals("admin123"))
		{
			out.println("Success");
		}
		else
		{	
			out.println("UnSuccess");
			
	      //response.sendRedirect("NewHomePage.html");
		}
		
	}

}
