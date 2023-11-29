<%@page import="com.java.Complaint.ComplainDAOImpl"%>
<%@page import="com.java.Complaint.ComplaintDAO"%>
<%@page import="com.java.Complaint.Complaint"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        h1 {
            text-align: center;
            padding: 20px;
            background-color: #333;
             box-shadow: 0px 0px 10px blue;
            color: white;
        }

        form {
            max-width: 600px;
            margin: 20px auto;
            background-color: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0px 0px 10px blue;
        }

        table {
            width: 100%;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
            
        }

        input[type="text"], input[type="date"], select {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="submit"] {
            background-color: #333;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 3px;
            cursor: pointer;
        }
</style>
</head>
<body>
     <h1>Add Complaint</h1>
       <form>
       <table >
       <tr>
       <th>Enter  Complaint Type </th>
       <td><input type="text" name="ctype" ></td>
       </tr>
       <tr>
       <th>Enter  Complaint Description</th>
       <td><input type="text" name="cdesc"></td>
       </tr>
       <tr>
       <th>Enter  Severity</th>
       <td><input type="text" name="sev"></td>
       </tr>
       <tr><th colspan="2">
       <input type="submit" action="Add"/>
       </th></tr>
       </table>
       </form>
       <%
       Complaint complaint= new Complaint();
       complaint.setComplaintType(request.getParameter("ctype"));
       complaint.setcDescription(request.getParameter("cdesc"));
       complaint.setSeverity(request.getParameter("sev"));
       ComplaintDAO dao=new ComplainDAOImpl();
       dao.addComplaint(complaint);
       %>
       <table   align="center">
        <tr>
        <th><a href="ShowComplaint.jsp">Show All Complaint</a></th>
        </tr>
        </table>
 
   </body>
</html>