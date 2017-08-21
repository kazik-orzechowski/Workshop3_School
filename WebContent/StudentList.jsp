<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Studenci</title>
</head>
<body>

<a href="/Workshop3_School/AddStudent">Dodaj nowego studenta </a>

<h1>Lista studentow szkoly CodeFreaks</h1>
<table>
<tr>
    <th>Id</th>
    <th>Imie</th>
    <th>Nazwisko</th>
    <th>Adres e-mail:</th>
    <th>Wiek</th>
    <th>Id Grupy</th>
    <th>Akcje</th>
</tr>


<c:out value="${entry.value}"></c:out>

<c:forEach var="item" items="${myAttribute}" >
	<tr>
		<td><c:out value="${item.studentId}"/></td>
		<td><c:out value="${item.name}"/></td>	
		<td><c:out value="${item.surname}"/></td>	
		<td><c:out value="${item.mail}"/></td>	
		<td><c:out value="${item.age}"/></td>	
		<td><c:out value="${item.groupId}"/></td>	
		<td><a href="/Workshop3_School/DeleteStudent?studentMap=${myAttrMap}&studentId=${item.studentId}">Usun</a><p>  </p> 
		<a href="/Workshop3_School/ShowStudent?studentMapMap=${myAttrMap}&studentId=${item.studentId}">Pokaz</a><p>  </p>
		<a href="/Workshop3_School/EditStudent?studentMap=${myAttrMap}&studentId=${item.studentId}">Edytuj</a><p>  </p>
		</td>	
	</tr>
	<br>
</c:forEach>
<c:set var= "condition" value="${listAction}"/>
<c:if test="${condition=='add'}">
		<form action="/Workshop3_School/AddStudent2" method="GET">
		<td><input type="text" name="studentId" placeholder="Id" disabled/> </td>
		<td><input type="text" name="name" placeholder="Imie"/> </td>
		<td><input type="text" name="surname" placeholder="Nazwisko"/></td>	
		<td><input type="text" name="mail" placeholder="E-mail"/></td>	
		<td><input type="text" name="age" placeholder="Wiek"/></td>	
		<td><input type="text" name="groupId" placeholder="Id grupy"/></td>	
		<td><input type="Submit" value="Zaakceptuj"/></td>		
		</form>	
</c:if> 
<c:set var= "condition" value="${listAction}"/>
<c:if test="${condition=='edit'}">
		<form action="/Workshop3_School/EditStudent2" method="GET">
		<td><input type="text" name="studentId" value="${curStudent.studentId}" disabled/> </td>
		<td><input type="text" name="name" value="${curStudent.name}"/> </td>
		<td><input type="text" name="surname" value="${curStudent.surname}"/></td>	
		<td><input type="text" name="mail" value="${curStudent.mail}"/></td>	
		<td><input type="text" name="age" value="${curStudent.age}"/></td>	
		<td><input type="text" name="groupId" value="${curStudent.groupId}"/></td>	
		<td><input type="Submit" value="Zaakceptuj"/></td>		
		</form>	
</c:if> 
</table>
