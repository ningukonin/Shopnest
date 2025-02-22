<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>

<meta charset="UTF-8">
    <title>Login module</title>
    <head>
        <link rel="stylesheet" href="style.css">
    </head>
    <body style="background-image: url('macos.jpg'); background-size: cover;">

    <h1><center>Reset Password</center></h1>
        <div class="back">
        <form action="forget">
            <label>Enter your email</label><br><br>
        <input type="text" name="formail" placeholder="Enter Email"><br><br>
            <label>New Password</label><br><br>
            <input type="text" name="newpass" placeholder="Enter Password"><br><br>
           
            <br><br><br>
            <input type="submit" value="Confirm" id="uio"><br><br>
        
        </form>
    </div>
    
    </body>
</html>