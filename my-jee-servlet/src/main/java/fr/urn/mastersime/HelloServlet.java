package fr.urn.mastersime;

	
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
	 
public class HelloServlet extends HttpServlet {
	  
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	        
        res.setContentType("text/html");
	        
        PrintWriter out = res.getWriter();
	    out.println("<html>");
	    out.println("<head><title> Titre </title></head>");
	    out.println("<body>");
	    out.println("Hello World");
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}
}
