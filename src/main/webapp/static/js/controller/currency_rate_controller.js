'use strict';

angular.module('scotchApp').controller('currencyRateController',['$scope', 'currencyRateService', function ($scope, currencyRateService) {
    // create a message to display in our view
    $scope.message = 'Everyone come and see how good I look!';

     $scope.gridOptions1 = {
            paginationPageSizes: [25, 50, 75],
            paginationPageSize: 25,
          columnDefs:  [
            { name: 'currencyId',
             cellTemplate: '<div class="ui-grid-cell-contents"><a ng-href="http://localhost:8081/#/currency_rate_chart/{{row.entity.currencyId}}" >{{row.entity.currencyId}}</a></div>'
             },
            { name: 'buyRate' },
            { name: 'ascRate' },
            { name: 'date' },
        ]
    };

    fetchAllCurrencyRate();

    function fetchAllCurrencyRate(){
        currencyRateService.fetchAllCurrencyRate().then(
            function(d) {
                $scope.gridOptions1.data = d;
            },
            function(errResponse){
                console.error('Error while fetching Organizations');
            }
        );
    }
}]);
