<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Grupy</title>
</head>
<body>

<a href="/Workshop3_School/AddGroup">Dodaj nowa grupe</a>

<h1>Lista grup szkoły CodeFreaks</h1>
<table>
<tr>
    <th>Id</th>
    <th>Nazwa</th>
    <th>Liczba osob</th>
    <th>Akcja</th>


</tr>


<c:out value="${entry.value}"></c:out>

<c:forEach var="item" items="${myAttribute}" >
	<tr>
		<td><c:out value="${item.groupId}"/></td>
		<td><c:out value="${item.groupName}"/></td>	
		<td>Liczba osob - metoda do uzupelnienia</td>	
		<td><a href="/Workshop3_School/DeleteGroup?groupMap=${myAttrMap}&groupId=${item.groupId}">Usun  </a> 
		<a href="/Workshop3_School/GroupEdit?groupMap=${myAttrMap}groupId=${item.groupId}">Edytuj  </a> 
		<a href="/Workshop3_School/ShowGroup?groupMap=${myAttrMap}groupId=${item.groupId}">Pokaz grupe  </a>
		</td>	
	</tr>
	<br>
</c:forEach>
</table>




</body>
</html>