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
                <h2><h:outputText value="Agent Records"/></h2>
            </center>
        <h:dataTable value="#{ejbImpl.showAgentEjb()}" var="e" border="3">
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="AgentID" />
                    </f:facet>
                    <h:outputText value="#{e.agentID}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Employ Name" />
                    </f:facet>
                    <h:outputText value="#{e.name}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="City" />
                    </f:facet>
                    <h:outputText value="#{e.city}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="MaritalStatus" />
                    </f:facet>
                    <h:outputText value="#{e.maritalStatus}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Premium" />
                    </f:facet>
                    <h:outputText value="#{e.premium}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Search" />
                    </f:facet>
        <h:commandButton action="#{ejbImpl.searchAgentEjb(e.agentID)}" value="Search" />
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Delete" />
                    </f:facet>
        <h:commandButton action="#{ejbImpl.deleteAgentEjb(e.agentID)}" value="Delete" />
                </h:column>

        </h:dataTable>
        
        </h:form>
    </body>
</html>
</f:view>
