<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h3>Category Form</h3>

<form:form modelAttribute="category" method="POST"
	action="/saveCategory">
	<label>Category Code : </label>
	<form:input name="code" path="code" />
	<form:errors path="code" class="error"></form:errors>
	<br>
	<label>Description : </label>
	<form:input name = "description" path="description"/>
	<form:errors path ="description" class= "error"></form:errors>
	<br>
	
	<input type="submit" class="btn btn-primary" value ="Save">
</form:form>