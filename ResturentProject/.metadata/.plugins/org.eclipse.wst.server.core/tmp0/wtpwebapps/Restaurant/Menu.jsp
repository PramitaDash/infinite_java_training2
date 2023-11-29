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
        	<h2><h:outputText value="Menu"/></h2>
        </center>
        <h:dataTable value="#{mList}" var="e" border="3">
        <h:column>
        <f:facet name="header">
        	<h:outputLabel value="MEN_ID "/>
        </f:facet>
        <h:outputText value="#{e.MEN_ID  }"/>
        </h:column>
        <h:column>
        <f:facet name="header">
        	<h:outputLabel value="MEN_ITEM"/>
        </f:facet>
        <h:outputText value="#{e. MEN_ITEM}"/>
        </h:column>
        <h:column>
        <f:facet name="header">
        	<h:outputLabel value="MEN_PRICE"/>
        </f:facet>
        <h:outputText value="#{e.MEN_PRICE }"/>
        </h:column>
        <h:column>
        <f:facet name="header">
        	<h:outputLabel value="restaurant_ID"/>
        </f:facet>
        <h:outputText value="#{e.restaurant_ID }"/>
        </h:column>
        <h:column>
        <f:facet name="header">
        	<h:outputLabel value=" MEN_CALORIES"/>
        </f:facet>
        <h:outputText value="#{e. MEN_CALORIES }"/>
        </h:column>
        <h:column>
        <f:facet name="header">
        	<h:outputLabel value="MEN_SPECIALITY"/>
        </f:facet>
        <h:outputText value="#{e.MEN_SPECIALITY }"/>
        </h:column>
        </h:dataTable>
        </h:form>
 </body>
 </html>
 </f:view>