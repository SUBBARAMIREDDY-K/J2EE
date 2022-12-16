import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class EmployeeDetails extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res)
    throws IOException,ServletException
    {
        res.setContentType("text/html");
        String ename=req.getParameter("ename");
        String eid=req.getParameter("eidno");
        String ebranch=req.getParameter("branch");
        PrintWriter out = res.getWriter();
        out.print("EMPLOYEE DETAILS <br>");
        out.print("Employee Name : "+ename+"<br>");
        out.print("Employee Id : "+eid+"<br>");
        out.print("Employee Branch : "+ebranch+"<br>");
    }
}