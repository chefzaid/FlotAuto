<%@page import="java.util.List"%>
<%@page import="net.sas.model.bo.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="net.sas.model.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table
		class="table table-nomargin table-striped dataTable dataTable-colvis">
		<thead>
			<tr>
				<th>Matricule</th>
				<th>Prénom</th>
				<th>Nom</th>
				<th>Occupation</th>
				<th class='hidden-350'>Date emabauche</th>
				<th class='hidden-1024'>Phone</th>
				<th class='hidden-480'>Email</th>
			</tr>
		</thead>
		<tbody>
		<%
			EmployeeDao dao = new EmployeeDao();
			List<Employee> list = dao.read();
			Employee e = new Employee();
			e.setFirstName("fghjkl");
			list.add(e);
			out.print(list.size());
		%>
			<c:forEach items="${list}" var="x">
				<tr>
					<td>${x.firstName}</td>
				</tr>
			</c:forEach>
			<s:iterator value="list">
				<tr>
					<td><s:property value="number" /></td>
					<td><s:property value="firstName" /></td>
					<td><s:property value="lastName" /></td>
					<td><s:property value="occupation" /></td>
					<td class='hidden-350'><s:property value="hireDate" /></td>
					<td class='hidden-1024'><s:property value="phone" /></td>
					<td class='hidden-480'><s:property value="email" /></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>