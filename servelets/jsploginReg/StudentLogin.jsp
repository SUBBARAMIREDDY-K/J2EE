<!DOCTYPE html>
<html lang="en">
<head>
    <title>StudentLogin</title>
</head>
<body bgcolor="yellow">
    <%@ page import = "java.util.regex.*" %>
    <%  String regex="[0-9]{2}091[aA][0-9]{2}[0-9a-zA-Z]{2}";
        String id=request.getParameter("id");
        String pwd=request.getParameter("pwd");
        if(Pattern.matches(regex,id) && Pattern.matches(regex,pwd))
        {
            out.print("<h1 align='center'>Valid User</h1>");
        }
        else
        {
            out.print("<h1 align='center'>Invalid User</h1>");
        }
    %>
    
</body>
</html>