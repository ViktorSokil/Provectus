'use strict';

angular.module('scotchApp').factory('currencyRateService', ['$http', '$q', function($http, $q){
    var factory = {
        fetchAllCurrencyRate: fetchAllCurrencyRate,
    };
    return factory;

    function fetchAllCurrencyRate() {
        var deferred = $q.defer();
        $http.get('/actualCurrencyRates/').then(
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
