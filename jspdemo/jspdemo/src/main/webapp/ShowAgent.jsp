<%@page import="com.java.agent.Agent" %>
<%@page import="java.util.List"%>
<%@page import="com.java.agent.AgentDAOImpl"%>
<%@page import="com.java.agent.AgentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	AgentDAO dao = new AgentDAOImpl();
  List<Agent> agentList = dao.showAgentDao();
%>
<table border="3" align="center">
<tr>
<th>AgentID</th>
<th> Name</th>
<th> City</th> 
<th> gender</th>
<th> MaritalStatus</th>
<th>Premium</th>
</tr>
<%
	for(Agent agent : agentList){
%>
	<tr>
		<td><%=agent.getAgentID() %></td>
		<td><%=agent.getName()  %></td>
		<td><%=agent.getCity() %></td>
		<td><%=agent.getGender() %></td>
		<td><%=agent.getMaritalStatus() %></td>
		<td><%=agent.getPremium() %></td>
	</tr>
<% 
	}
%>
</table><hr/>
<a href="AddAgent.jsp"> Add Employ</a>

</body>
</html>