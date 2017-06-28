'use strict';

angular.module('scotchApp').controller('chartController',['$scope', 'chartService', function ($scope, chartService) {
    // create a message to display in our view

    $scope.message = 'Hello Vasil1!';

    $scope.config = {
        title: 'Currency rate USD/UAH',
        tooltips: true,
        labels: false,
        mouseover: function() {},
        mouseout: function() {},
        click: function() {},
        legend: {
          display: true,
          //could be 'left, right'
          position: 'right'
        },
        lineCurveType: 'linear',
      };

      fetchAllChartRate();




    function fetchAllChartRate(){
        chartService.fetchAllChartRate().then(
            function(d) {
                var length=d.length;
                var tempArr=new Array(length);
                for(var i = 0; i < length; i++){
                    tempArr[i]={
                         x: d[i].date,
                         y: [d[i].ascRate, d[i].buyRate],
                    }
                }

                $scope.data = {
                        series: ['Asc Rate', 'Buy Rate'],
                        data: tempArr
                      };
            },
            function(errResponse){
                console.error('Error while fetching Organizations');
            }
        );
    }
}]);
