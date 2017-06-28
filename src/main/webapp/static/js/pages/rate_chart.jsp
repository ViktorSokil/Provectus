<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div ng-controller="chartController">
    <div class="jumbotron text-center">
        <h1>Rate Chart Page</h1>
        <p>{{ message }}</p>
    </div>
         <div style="width: 1600px; height: 500px"
             data-ac-chart="'line'"
             data-ac-data="data"
             data-ac-config="config"
             class="chart">
           </div>
</div>