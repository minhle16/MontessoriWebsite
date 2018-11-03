<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<h1>Product List</h1> 

<a href="${pageContext.request.contextPath}/admin/product/create">+Create New Product</a>
<table>
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Active</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="product" items="${allProduct}">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>${product.active}</td>
				<td>
					 <span>
						 <a href="${pageContext.request.contextPath}/admin/product/edit/${product.id}">Edit</a>
						 <a href="${pageContext.request.contextPath}/admin/product/delete/${product.id}">Delete</a> 
					 </span>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>