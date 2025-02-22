<%@page import="com.shopNest.dbHandler.dataFetcher"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>admin hsme</title>
        <link rel="stylesheet" href="admin.css">
    </head>
   

  <body>
  <% 
  List userlist=dataFetcher.getInfo();
  System.out.print(userlist);
  %>
      
        <div class="panel">
      
            <div class="button-tab">
      <button id="b1" onclick="open1()">User Info</button>
      <button id="b2" onclick="open2()">View Products</button>
      <button id="b3" onclick="open3()">Add Products</button>
      </div>
      <div class="line">

      </div>
       </div>

       <div class="content" id="ct1">
            <table border>
                            <thead>
                                <tr>
                                    <th>Username</th>
                                    <th>Email</th>
                                    <th>Gender</th>
                             

                                </tr>
                            </thead>
                            <tbody>
                                <% 
                               
                                for(int i=0;i<userlist.size();i++){
                                    String cusArr[]=((String)userlist.get(i)).split(":");
                                
                                %>
                                <tr>
                                    <td><%= cusArr[0] %></td>
                                    <td><%= cusArr[1]%></td>
                                    <td><%= cusArr[2] %></td>
                                   
                                </tr>
                                <%
                                }
                                     %>
                               
                            </tbody>
                        </table>
               </div>
               <div class="content" id="ct2">
               <%
               List flist=dataFetcher.viewProd();
               %>
               
                 <table border id="tb2">
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Name</th>
                                    <th>Descrp</th>
                                    <th>price</th>
                                    <th>Image</th>
                             

                                </tr>
                            </thead>
                            <tbody>
                                <% 
                               
                                for(int i=0;i<flist.size();i++){
                                    String pod[]=((String)flist.get(i)).split(":");
                                
                                %>
                                <tr>
                                    <td><%= pod[0] %></td>
                                    <td><%= pod[1]%></td>
                                    <td><%= pod[2] %></td>
                                    <td><%= pod[3] %></td>
                                    <td><img id="imgp" src="prodImg/<%= pod[4] %>" height="50px" width="50px"  alter="product1"></td>
                                    <td><a href="delete.jsp?Id=<%=pod[0]%>">delete</a>
                                   <td><a href="edit.jsp?Id=<%=pod[0]%>">Edit</a></td>
                                </tr>
                                <%
                                }
                                     %>
                               
                            </tbody>
                        </table>
            </div>
            <div class="content" id="ct3">
            <form action="addp" method="post">
            <link rel="stylesheet" href="addp.css">
                  <div class="panel1">
                  
        <div class="pid">
        <label>Product id</label><br>
        <input type="number" name="idf"><br>
    </div><br><br>
    <div class="pname">
     
        <label>Product name</label><br>
        <input type="text" name="pnf"><br>
    </div><br><br>

       <div class="pdcp">
        <label >Product description</label><br>

        <input type="text"  id="des" name="pdesf"><br>
    </div><br><br>
    <div class="pprc">
         <label>Product price</label><br>
        <input type="number" name="pprc"><br>
    </div><br><br>
    <div class="pimg">
        <label>Product image</label><br>
        <input type="text" name="imgf" ><br>
    </div><br><br>

<input type="submit" value="submit" id="subo"> 
 </form>
     </div>
    
            </div>
       <script>
        var ct1=document.getElementById("ct1");
        var ct2=document.getElementById("ct2");
        var ct3=document.getElementById("ct3");

        var b1=document.getElementById("b1");
        var b2=document.getElementById("b2");
        var b3=document.getElementById("b3");
        function open1(){
            ct1.style.transform="translateX(0)";
            ct2.style.transform="translateX(100%)";
            ct3.style.transform="translateX(100%)";
        }
        function open2(){
            ct1.style.transform="translateX(100%)";
            ct2.style.transform="translateX(0)";
            ct3.style.transform="translateX(100%)";
        }
        function open3(){
            ct1.style.transform="translateX(100%)";
            ct2.style.transform="translateX(100%)";
            ct3.style.transform="translateX(0)";
        }



    </script>
   

    </body>

</html>