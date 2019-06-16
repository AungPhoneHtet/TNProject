 <%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

	<!-- Page level plugin CSS-->
  <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
  
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
</head>
<title>Talent Nest Project</title>
<body>

	<tiles:insertAttribute name="header"></tiles:insertAttribute>
	<div id = "wrapper" >
		<tiles:insertAttribute name="left-menu"></tiles:insertAttribute>
	
	<div id = "content-wrapper">
		<div class = "container-fluid" >
			<tiles:insertAttribute name="body"></tiles:insertAttribute>
		</div>
		
	</div>
	</div>
	
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
 <!-- Bootstrap core JavaScript-->
  <script src="/vendor/jquery/jquery.min.js"></script>
  <script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="/vendor/jquery-easing/jquery.easing.min.js"></script>
  
  <!-- Page level plugin JavaScript-->
  <script src="vendor/chart.js/Chart.min.js"></script>
  <script src="vendor/datatables/jquery.dataTables.js"></script>
  <script src="vendor/datatables/dataTables.bootstrap4.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="js/sb-admin.min.js"></script>

</body>
</html>