import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ConfigurationDetails extends HttpServlet
{
    String configname;
    int confignum;
    public void init(ServletConfig sc)
    {
        configname=sc.getInitParameter("cname");
        confignum=Integer.parseInt(sc.getInitParameter("cnum"));
    }
    public void service(HttpServletRequest rreq,HttpServletResponse res)
    throws IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("Configurations Details : "+"<br>");
        out.print("Configuration name : "+configname+"<br>");
        out.print("Configuration number : "+confignum);

    }
}