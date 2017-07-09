'use strict';


angular.module('scotchApp').controller('mainController',['$scope', 'homeService','uiGridConstants', function ($scope, homeService, uiGridConstants) {
    // create a message to display in our view
    $scope.message = 'Everyone come and see how good I look!';

    $scope.gridOptions1 = {
        showColumnFooter: true,
        paginationPageSizes: [4, 8, 12],
        paginationPageSize: 4,
        rowHeight: 70,
        columnDefs: [
            {
                field: 'bookId' ,
                displayName: 'Id',
                maxWidth: 70
            },
            {
                field: 'bookName' ,
                displayName: 'Name',
                cellTemplate:'<div class="ui-grid-cell-contents"' +
                'style="white-space:normal">{{row.entity.bookName}}</div>',
                defaultSort: {
                    direction: uiGridConstants.ASC,
                    priority: 0
                }
            },
            {
                field: 'authors' ,
                displayName: 'Authors',
                maxWidth: 150,
                cellTemplate: '<div class="ui-grid-cell-contents" style="display: inline-grid">' +
                '<a ng-repeat="author in row.entity.authors" ' +
                'style="cursor: pointer" ng-click="grid.appScope.authorClicked(author.authorId)">{{author.authorName}}</a>' +
                '</div>'
            },
            {
                field: 'genres' ,
                displayName: 'Genres',
                maxWidth: 150,
                cellTemplate: '<div class="ui-grid-cell-contents" style="display: inline-grid">' +
                '<a ng-repeat="genre in row.entity.genres" ' +
                'style="cursor: pointer" ng-click="grid.appScope.genreClicked(genre.genreId)">{{genre.genreName}}</a>' +
                '</div>'
            },
            {
                field: 'bookDescription',
                displayName: 'Description',
                enableSorting: false,
                cellTemplate:'<div class="ui-grid-cell-contents"' +
                'style="white-space:normal">{{row.entity.bookDescription}}</div>'
            },
            {
                field: 'bookPrice',
                displayName: 'Price',
                maxWidth: 60
            },
            {
                name: 'Buy',
                displayName: 'Action',
                maxWidth: 80,
                cellTemplate:'<div class="ui-grid-cell-contents">' +
                '<button type="button" class="btn btn-default">Buy</button></div>'
            }
        ]
    };

    fetchAllBooks();

    $scope.authorClicked = function (id){
        fetchBooksByAuthor(id);
    };

    $scope.genreClicked = function (id){
        fetchBooksByGenre(id);
    };

    function fetchAllBooks(){
        homeService.fetchAllBooks().then(
            function(d) {
                $scope.gridOptions1.data = d;
            },
            function(errResponse){
                console.error('Error while fetching books');
            }
        );
    }

    function fetchBooksByAuthor(id){
        homeService.fetchBooksByAuthor(id).then(
            function(d) {
                $scope.gridOptions1.data = d;
            },
            function(errResponse){
                console.error('Error while fetching books by author');
            }
        );
    }

    function fetchBooksByGenre(id){
        homeService.fetchBooksByGenre(id).then(
            function(d) {
                $scope.gridOptions1.data = d;
            },
            function(errResponse){
                console.error('Error while fetching books by genre');
            }
        );
    }
}]);