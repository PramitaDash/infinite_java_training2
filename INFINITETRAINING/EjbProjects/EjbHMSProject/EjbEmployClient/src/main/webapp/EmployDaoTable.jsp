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
                <h2><h:outputText value="Employ Records"/></h2>
            </center>
        <h:dataTable value="#{ejbImpl.showEmployEjb()}" var="e" border="3">
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Employ No" />
                    </f:facet>
                    <h:outputText value="#{e.empno}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Employ Name" />
                    </f:facet>
                    <h:outputText value="#{e.name}"/>
                </h:column>
                 <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Gender " />
                    </f:facet>
                    <h:outputText value="#{e.gender}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Dept " />
                    </f:facet>
                    <h:outputText value="#{e.dept}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Desig " />
                    </f:facet>
                    <h:outputText value="#{e.desig}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Basic " />
                    </f:facet>
                    <h:outputText value="#{e.basic}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Search " />
                    </f:facet>
                    <h:commandButton action="#{ejbImpl.searchEmploy(e.empno)}" value="Search"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Delete " />
                    </f:facet>
                    <h:commandButton action="#{ejbImpl.deleteEmployEjb(e.empno)}" value="Delete"/>
                </h:column>
                

        </h:dataTable>
                <center>
        <h:commandButton action="CreateEmploy.jsp?faces-redirect=true"
        	 value="Add Employ" /> 
       </center>
        
        </h:form>
    </body>
</html>
</f:view>