<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container" ng-controller="mainController">
    <div class="jumbotron text-center">
        <h1>Home Page</h1>
        <p>{{ message }}</p>
    </div>
    <div class="tableWrapper">
        <p><strong>BOOK-SHOP</strong></p>
        <div ui-grid="gridOptions1" ui-grid-pagination class="grid"></div>
    </div>
</div>