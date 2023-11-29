<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AddAgent.jsp">
<center>
	Agent ID:
	<input type="number" name="agentid" /> <br/><br/>
	Agent Name : 
	<input type="text" name="name" /> <br/><br/>
	City:
	<input type="text" name="city"/><br/><br/>
	Gender :
			<select name="gender">
				<option value="MALE">Male</option>
				<option value="FEMALE">Female</option>
			</select> <br/><br/> 
	 Marital Status:
	 <input type="number" name="mstatus"/><br/><br/>
	 Premium:
	 <input type="number" name="Premium"/><br/><br/>
	 <input type="submit" value="Add Agent"/>
</center>
</form>
<c:if test="${param.agentid!=null && param.Premium!=null }">
	<sql:setDataSource var="connection"
	driver=com.mysql.cj.jdbc.Driver
	url=jdbc:mysql://localhost:3306/exam
	user=root
	password=root />
		<sql:update var="empUpdate" dataSource="${connection}">
	Insert into Agent(agentid,name,city,gender,mstatus,Premium) values(?,?,?,?,?,?)
	<sql:param value="${param.agentid }"/>
	<sql:param value="${param.name }"/>
	<sql:param value="${param.city }"/>
	<sql:param value="${param.gender }"/>
	<sql:param value="${param.mstatus }"/>
	<sql:param value="${param.Premium }"/>
	</sql:update>
	<c:out value="Record Inserted..."/>
	</c:if>

</body>
</html>