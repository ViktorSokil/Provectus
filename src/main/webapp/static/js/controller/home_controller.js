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
            { name: 'region'},
            { name: 'address'},
            { name: 'phone'},
            {
                name: 'link',
                cellTemplate: '<div class="ui-grid-cell-contents"><a ng-href="{{row.entity.link}}" >{{row.entity.link}}</a></div>'
            },
            { name: 'date' }
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