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
	<center>
		<h2><h:outputText value="Restaurant List"/></h2>
	</center>
	<h:dataTable value="#{restaurantDao.showRestaurantDao()}" var="e" border="3">
	<h:column>
	<f:facet name="header">
		<h:outputLabel value="Restaurant_ID"/>
	</f:facet>
	<h:outputText value="#{e.restaurant_ID}"/>
	</h:column>
	<h:column>
	<f:facet name="header">
		<h:outputLabel value="restaurant_Name"/>
	</f:facet>
	<h:outputText value="#{e.restaurant_Name}"/>
	</h:column>
	<h:column>
	<f:facet name="header">
		<h:outputLabel value="branch"/>
	</f:facet>
	<h:outputText value="#{e.branch}"/>
	</h:column>
	
	<h:column>
	<f:facet name="header">
		<h:outputLabel value="city"/>
	</f:facet>
	<h:outputText value="#{e.city}"/>
	</h:column>
	
	<h:column>
	<f:facet name="header">
		<h:outputLabel value="mobileNo"/>
	</f:facet>
	<h:outputText value="#{e.mobileNo}"/>
	</h:column>
	
	<h:column>
	<f:facet name="header">
		<h:outputLabel value="email"/>
	</f:facet>
	<h:outputText value="#{e.email}"/>
	</h:column>
	
	<h:column>
	<f:facet name="header">
		<h:outputLabel value="rating"/>
	</f:facet>
	<h:outputText value="#{e.rating}"/>
	</h:column>
	<h:column>
	<f:facet name="header">
		<h:outputLabel value="Submit"/>
	</f:facet>
	<h:commandButton action="#{menuDao.showMenu(e.restaurant_ID)}" value="Show" ></h:commandButton>
	</h:column>
	
	</h:dataTable>
	
	</h:form>

</body>
</html>
</f:view>