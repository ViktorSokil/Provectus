'use strict';

angular.module('scotchApp').factory('homeService', ['$http', '$q', function($http, $q){
    var factory = {
        fetchAllBooks: fetchAllBooks,
    };
    return factory;

    function fetchAllBooks() {
        var deferred = $q.defer();
        $http.get('/books/').then(
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
