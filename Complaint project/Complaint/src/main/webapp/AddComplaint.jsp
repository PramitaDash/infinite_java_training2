
<%@ page import="com.java.com.Complaint" %>
<%@ page import="com.java.com.ComplaintDAOImpl" %>
<%@ page import="com.java.com.ComplaintDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Complaint</title>
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

<form method="post" action="AddComplaint.jsp">
    <table>
        <tr>
            <th>Complaint Type:</th>
            <td>
                <input type="text" name="complaintType" required /><br/>
            </td>
        </tr>
        <tr>
            <th>Complaint Description:</th>
            <td>
                <input type="text" name="cdescription" required /><br/>
            </td>
        </tr>
        
        <tr>
            <th>Severity:</th>
            <td>
                <input type="text" name="serverity" required /><br/>
            </td>
        </tr>
       
        
        <tr>
            <td colspan="2">
                <input type="submit" value="Add Complaint" />
            </td>
        </tr>
    </table>
</form>

<%
	if(request.getParameter("complaintType")!=null){
		ComplaintDAO dao = new ComplaintDAOImpl();
		Complaint complaint = new Complaint();
		complaint.setComplaintType(request.getParameter("complaintType"));
		complaint.setCDescription(request.getParameter("cdescription"));
		complaint.setSeverity(request.getParameter("severity"));
		dao.addComplaintDao(complaint);
		
	}
%>
     <table   align="center">
        <tr>
        <th><a href="showComplaint.jsp">Show All Complaint</a></th>
        </tr>
        </table>
       

        

       
</body>
</html>