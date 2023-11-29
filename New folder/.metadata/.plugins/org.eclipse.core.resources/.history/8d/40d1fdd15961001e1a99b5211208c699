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
</head>
<body>
     
       <form>
       <table border="3px" bgcolor="#f0c059" align="center">
       <tr>
       <th>Enter the Complaint Type </th>
       <td><input type="text" name="ctype" ></td>
       </tr>
       <tr>
       <th>Enter the Complaint Description</th>
       <td><input type="text" name="cdesc"></td>
       </tr>
       <tr>
       <th>Enter the Severity</th>
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
       <table border="3px" bgcolor="#f0c059" align="center">
        <tr>
        <th><a href="ShowComplaint.jsp">Show All Complaint</a></th>
        </tr>
        </table>
 
   </body>
</html>