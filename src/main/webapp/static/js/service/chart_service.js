'use strict';

angular.module('scotchApp').factory('chartService', ['$http', '$q', function($http, $q){
    var factory = {
        fetchAllChartRate: fetchAllChartRate,
    };
    return factory;

    function fetchAllChartRate() {
        var deferred = $q.defer();
        $http.get('/actualCurrencyRates1/' + currencyId).then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching actualCurrencyRates');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
}]);