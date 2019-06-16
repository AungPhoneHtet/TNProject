<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h3>Category List</h3>

<table id="categoryTable" class="table table-bordered dataTable">
	<thead>
		<tr>
			<th>Id</th>
			<th>Code</th>
			<th>Description</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${categoryList}" var="category">
		<tr>
			<td>${category.id}</td>
			<td>${category.code}</td>
			<td>${category.description}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>

<a href="/newCategory" class="btn btn-primary">Add New Category</a>
<script>
	$(document).ready(function() {
		$('#categoryTable').DataTable();
	});
</script>