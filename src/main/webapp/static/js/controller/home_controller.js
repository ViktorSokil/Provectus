'use strict';


angular.module('scotchApp').controller('mainController',['$scope', 'homeService', function ($scope, homeService) {
    // create a message to display in our view
    $scope.message = 'Everyone come and see how good I look!';

    $scope.gridOptions1 = {
        paginationPageSizes: [25, 50, 75],
        paginationPageSize: 3,
        columnDefs: [
            { name: 'bookId' },
            { name: 'bookName' },
            { name: 'authors' },
            { name: 'genres' },
            { name: 'bookDescription'},
            { name: 'bookPrice'}
        ]
    };

    fetchAllBooks();

    function fetchAllBooks(){
        homeService.fetchAllBooks().then(
            function(d) {
                $scope.gridOptions1.data = d;
            },
            function(errResponse){
                console.error('Error while fetching Organizations');
            }
        );
    }
}]);