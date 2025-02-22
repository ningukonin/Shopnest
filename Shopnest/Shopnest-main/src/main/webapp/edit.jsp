<%@page import="com.shopNest.dbHandler.dataFetcher"%>
<%@page import="com.shopNest.dbHandler.dataInjector"%>
<%@page import="javax.servlet.annotation.WebServlet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int id=Integer.parseInt(request.getParameter("Id"));
String sql="SELECT * FROM PRODUCT WHERE ID=?";
String url=("jdbc:oracle:thin:@localhost:1521:xe");
String user="system";
String pass="system";
String str="";

try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection(url,user,pass);
PreparedStatement ps=con.prepareStatement(sql);
   ps.setInt(1, id);

	ResultSet rs=ps.executeQuery();
	while(rs.next()){
	%>
		
        <h1>Edit Panel</h1>
		
        

<form action="ep1" method="post">
            <link rel="stylesheet" href="addp.css">
                  <div class="panel1">
                  
               
                  
        <div class="pid">
        <label>Product id</label><br>
        <input type="number" name="idf" value=<%=rs.getInt(1) %>><br>
    </div><br><br>
    <div class="pname">
     
        <label>Product name</label><br>
        <input type="text" name="pnf" value=<%=rs.getString(2)%>><br>
    </div><br><br>

       <div class="pdcp">
        <label >Product description</label><br>

        <input type="text"  id="des" name="pdesf" value="<%=rs.getString(3)%>"><br>
    </div><br><br>
    <div class="pprc">
         <label>Product price</label><br>
        <input type="number" name="pprc" value="<%=rs.getInt(4)%>"><br>
    </div><br><br>
    <div class="pimg">
        <label>Product image</label><br>
        <input type="text" name="imgf" value="<%=rs.getString(5)%>" ><br>
    </div><br><br>

<input type="submit" value="submit"> 
 </form>

  <%
	}
}catch(Exception e){
	System.out.print("not");
}
  %>


</body>
</html>