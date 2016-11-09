'use strict';

angular.module('scotchApp').controller('mainController',['$scope', 'homeService', function ($scope, homeService) {
    // create a message to display in our view
    $scope.message = 'Everyone come and see how good I look!';

    $scope.gridOptions1 = {
        paginationPageSizes: [25, 50, 75],
        paginationPageSize: 25,
        columnDefs: [
            { name: 'organizationId' },
            { name: 'oldOrgId' },
            { name: 'title' },
            { name: 'city' },
            { name: 'region'}
        ]
    };

    fetchAllOrganizations();

    function fetchAllOrganizations(){
        homeService.fetchAllOrganizations().then(
            function(d) {
                $scope.gridOptions1.data = d;
            },
            function(errResponse){
                console.error('Error while fetching Organizations');
            }
        );
    }
}]);