<%@ page import="com.java.com.Complaint" %>
<%@ page import="java.util.List" %>
<%@ page import="com.java.com.ComplaintDAOImpl" %>
<%@ page import="com.java.com.ComplaintDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Complaints</title>
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
            box-shadow: 1px 1px 10px blue;
            color: white;
        }

        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
            background-color: burlywood;
            box-shadow: 1px 1px 10px blue;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: center;
        }

        th {
            background-color: #333;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<h1>Complaints</h1>
<%
    ComplaintDAO dao = new ComplaintDAOImpl();
    List<Complaint> complaintList = dao.showComplaintDao();
%>
<table border="1" align="center">
    <tr>
        <th>Complaint Id</th>
        <th>Complaint Type</th>
        <th>Complaint Description</th>
        <th>Complaint Date</th>
        <th>Severity</th>
        
    </tr>
    <%
        for(Complaint complaint : complaintList) {
    %>
    <tr>
        <td><%= complaint.getComplaintID() %></td>
        <td><%= complaint.getComplaintType() %></td>
        <td><%= complaint.getCDescription() %></td>
        <td><%= complaint.getComplaintDate() %></td>
        <td><%= complaint.getSeverity() %></td>
       
    </tr>
    <%
        }
    %>
</table>
</body>
</html>