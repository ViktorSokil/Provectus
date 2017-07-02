'use strict';


angular.module('scotchApp').controller('mainController',['$scope', 'homeService', function ($scope, homeService) {
    // create a message to display in our view
    $scope.message = 'Everyone come and see how good I look!';

    $scope.gridOptions1 = {
        paginationPageSizes: [5, 10, 15],
        paginationPageSize: 10,
        columnDefs: [
            { name: 'bookId' , displayName: 'Id'},
            { name: 'bookName' , displayName: 'Name'},
            { name: 'authors' , displayName: 'Authors'},
            { name: 'genres' , displayName: 'Genres'},
            { name: 'bookDescription', displayName: 'Description'},
            { name: 'bookPrice', displayName: 'Price'}
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