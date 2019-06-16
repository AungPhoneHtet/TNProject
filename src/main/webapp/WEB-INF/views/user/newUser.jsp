<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

    <a class="navbar-brand mr-1" href="index.html">TN Project</a>

    <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">
      <i class="fas fa-bars"></i>
    </button>

	<h3>User Form</h3>
	<form:form  modelAttribute="tnUser" method ="POST" action="/saveUser">
	<label>User Name : </label>
	<form:input name = "userId" path="userId"/>
	<form:errors path ="userId" class= "error"></form:errors>
	<br>
	<br>
	<label>password : </label>
	<form:input name = "password" path="password"/>
	<form:errors path ="password" class="error"></form:errors>
	<br>
	<br>
	<label>User Type : </label>
	<select name="userType">
		  <option value="student">Student</option>
			<option value="coach">Coach</option>
			<option value="admin">Admin</option>
			<option value="guest">Guest</option>
	</select>
	<form:errors path="userType" class="error"></form:errors>
	<br>
	<br>
	<label>Name : </label>
	<form:input name = "name" path="name"/>
	<form:errors path ="name" class="error"></form:errors>
	<br>
	<br>
	<label>NRC : </label>
	<form:input name = "NRC" path="NRC"/>
	<form:errors path ="NRC" class="error"></form:errors>
	<br>
	<br>
	<label>Date of Birth : </label>
	<form:input name = "dateOfBirth" path="dateOfBirth"/>
	<form:errors path ="dateOfBirth" class="error"></form:errors>
	<br>
	<br>
	<label>Gender : </label>
	<form:input name = "gender" path="gender"/>
	<form:errors path="gender" class="error"></form:errors>
	<br>
	<br>
	<label>Phone No : </label>
	<form:input name = "phoneNo" path="phoneNo"/>
	<form:errors path ="phoneNo" class="error"></form:errors>
	<br>
	<br>
	
	<label>Email : </label>
	<form:input name = "email" path="email"/>
	<form:errors path="email" class="error"></form:errors>
	<br>
	<br>
	<label>Address : </label>
	<form:input name = "address" path="address"/>
	<form:errors path="address" class="error"></form:errors>
	<br>
	<br>
	<!-- <label>Join Date: </label>
	<input name = "join_date" path="join_date"> -->
	<button type="submit" value ="Save">Save</button>
	<button type="submit" value="Cancel">Cancel</button>
	</form:form>