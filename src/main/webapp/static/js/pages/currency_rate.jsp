<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div ng-controller="currencyRateController">
    <div class="jumbotron text-center">
        <h1>Currency Rate Page</h1>
        <p>{{ message }}</p>
    </div>
    <div class="tableWrapper">
        <p><strong>Every day currency rate records from Ukrainian banks</strong></p>
        <div ui-grid="gridOptions1" ui-grid-pagination class="grid"></div>
    </div>
</div>