<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 
<f:view>
<body>
		<h:form>
		Pleace Enter Number: <br/>
		First Number
		<h:inputText id="num1" value="#{calculation.firstNo}"/><br/>
		Second Number
		<h:inputText id="num2" value="#{calculation.secondNo}"/><br/>
		Result is :
		<h:commandButton actionListener="#{calculation.addition }" value="Sum"/><br/><br/>
		Result is :
		
		<h:commandButton actionListener="#{calculation.sub }" value="Sub"/><br/><br/>
			
		Result is :
		
		<h:commandButton actionListener="#{calculation.mult}" value="Mult"/><br/><br/>
		
			<h:outputText value= "#{calculation.result}"/>
		</h:form>

</body>
</f:view>
</html>
























































































































































































































































