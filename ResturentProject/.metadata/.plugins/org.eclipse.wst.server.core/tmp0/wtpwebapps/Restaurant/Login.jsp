<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h:form>
	<h:outputLabel value="User Name" />
 <h:inputText id="CUS_USERNAME" value="#{customer.CUS_USERNAME}"/><br>	<br/>
 <h:outputLabel value="PassWord " />
<h:inputSecret  id="CUS_PASSWORD" value="#{customer.CUS_PASSWORD}"/><br><br/>	
	<h:commandButton action="#{customerDao.validateMe(customer)}" value="Login" />
	
	
        </h:form>
    </body>
</html>
</f:view>