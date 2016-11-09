'use strict';

angular.module('scotchApp').factory('homeService', ['$http', '$q', function($http, $q){
    var factory = {
        fetchAllOrganizations: fetchAllOrganizations,
    };
    return factory;

    function fetchAllOrganizations() {
        var deferred = $q.defer();
        $http.get('/organizations/').then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching Organizations');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
}]);
