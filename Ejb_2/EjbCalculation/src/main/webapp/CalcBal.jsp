<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
<body>
	        <h:form>
            Please Enter Numbers: <br/>
            First Number 
            <h:inputText id="num1" value="#{calculation2.firstNo}"/><br>
            Second Number
            <h:inputText id="num2" value="#{calculation2.secondNo}"/><br>
        	Result is : 
        	<h:outputText value="#{calculation2.result}"/>
        	<h:commandButton actionListener="#{calculation2.addition}" 
        		value="Sum" />
        </h:form>
</body>
</f:view>
</html>