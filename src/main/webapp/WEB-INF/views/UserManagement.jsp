<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html ng-app="app">
<head>
    <title>AngularJS $http Example</title>
    <style>
        .username.ng-valid {
            background-color: lightgreen;
        }
        .username.ng-dirty.ng-invalid-required {
            background-color: red;
        }
        .username.ng-dirty.ng-invalid-minlength {
            background-color: yellow;
        }

        .email.ng-valid {
            background-color: lightgreen;
        }
        .email.ng-dirty.ng-invalid-required {
            background-color: red;
        }
        .email.ng-dirty.ng-invalid-email {
            background-color: yellow;
        }

    </style>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
<body>
<!--<div class="container" ng-controller="UserController as ctrl">
    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        User Lists
                    </h3>
                </div>
                <div class="panel-body">
                    Test
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        User Lists
                    </h3>
                </div>
                <div class="panel-body">
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <th>ID.</th>
                            <th>Name</th>
                            <th>Address</th>
                            <th>Email</th>
                            <th width="20%"></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr ng-repeat="u in ctrl.users">
                            <td><span ng-bind="u.id"></span></td>
                            <td><span ng-bind="u.firstName"></span></td>
                            <td><span ng-bind="u.address"></span></td>
                            <td><span ng-bind="u.email"></span></td>
                            <td>
                                <button type="button" ng-click="ctrl.edit(u.id)" class="btn btn-success custom-width">Edit</button>  <button type="button" ng-click="ctrl.remove(u.id)" class="btn btn-danger custom-width">Remove</button>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>-->
<label>Name :</label><input type="text" ng-model="name" placeholder="Enter your name"/>
<h1>Hello <span ng-bind="name"></span></h1>

<h1>Hey {{name}}</h1>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.min.js"></script>
<script src="<c:url value='/static/js/app.js' />"></script>
<!--<script src="<c:url value='/static/js/service/user_service.js' />"></script>
<script src="<c:url value='/static/js/controller/user_controller.js' />"></script>-->
</body>
</html>
