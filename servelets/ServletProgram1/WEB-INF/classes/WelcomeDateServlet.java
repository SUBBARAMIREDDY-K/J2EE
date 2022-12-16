import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class WelcomeDateServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        Date currentdate = new Date();
        out.println("WELCOME TO SERVLET PROGRAMMING");
        out.println("<br><br>");
        out.print("Current date is : "+currentdate);
    }
}