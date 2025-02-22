<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>

<meta charset="UTF-8">
    <title>Login module</title>
    <head>
        <link rel="stylesheet" href="style.css">
    </head>
    <body style="background-image: url('macos.jpg'); background-size: cover;">

    <h1><center>LOGIN</center></h1>
        <div class="back">
        <form method="post" action="l">
            <label>User name</label><br><br>
        <input type="text" name="luser" placeholder="Enter user name"><br><br>
            <label>Password</label><br><br>
            <input type="text" name="lpass" placeholder="Enter Password"><br><br>
           
            <br><br><br>
            <input type="submit" value="Login" id="uio"><br><br>
           <a href="for.jsp">Forgett password?</a><br>
            <a href="register.jsp">Don't have account,Register here</a>
        </form>
    </div>
    
    </body>
</html>