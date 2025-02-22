<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Register module</title>
    <head>
        <link rel="stylesheet" href="style.css">
    </head>
    <body >
        <div class="back">
        <form method="post" action="x">
            <label>User name</label><br><br>
        <input type="text" name="username" placeholder="Enter user name"><br><br>
            <label>Password</label><br><br>
            <input type="password" name="passw" placeholder="Enter Password"><br><br>
            <label>Email</label><br><br>
            <input type="email" name="Email" placeholder="Enter email id"><br><br>
            <label>Gender</label><br><br>
            <input type="radio" name="Gender" id="ee2" value="Male">Male
            <input type="radio" name="Gender" id="ee2" value="Female">Female
            <input type="radio" name="Gender" id="ee2" value="others">Others
            <br><br><br>
            <input type="submit" value="Register" id="uio"><br><br>
          <a href="login.jsp">already have account?.click here for sign in</a>
        </form>
    </div>
    
    </body>
    
</html>