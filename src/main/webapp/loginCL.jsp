<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<html>
<head>

    <title>loginCL.jsp页面</title>
</head>
<body>
<%
    String username = new String(request.getParameter("username").getBytes("ISO8859_1"),"GBK");
    String password = new String(request.getParameter("password").getBytes("ISO8859_1"),"GBK");
    String RL="jdbc:sqlserver://localhost:1433;DatabaseName=yagnsen";
    String sqlStr="select * from users where usernames = \'"+username+"\' and password = \'"+password +"\'";
    try {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	//驱动程序类
    Connection con=DriverManager.getConnection(RL,"sa","123456");	//创建于数据库的连接
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(sqlStr);
    if(rs.next())
        response.sendRedirect("welcome.jsp");       //跳转到欢迎页面
    else
        response.sendRedirect("error.jsp");          //跳转到出错页面

    rs.close();
    con.close();

}
catch(Exception err) {

    err.printStackTrace(System.out);
}
%>
</body>
</html>