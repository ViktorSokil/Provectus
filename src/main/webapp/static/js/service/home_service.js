'use strict';

angular.module('scotchApp').factory('homeService', ['$http', '$q', function($http, $q){
    var factory = {
        fetchAllBooks: fetchAllBooks,
        fetchBooksByAuthor : fetchBooksByAuthor,
        fetchBooksByGenre : fetchBooksByGenre
    };
    return factory;

    function fetchAllBooks() {
        var deferred = $q.defer();
        $http.get('/books/').then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching books');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    function fetchBooksByAuthor(id) {
        var deferred = $q.defer();
        $http.get('authors/'+id+'/books/').then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching books by author');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    function fetchBooksByGenre(id) {
        var deferred = $q.defer();
        $http.get('genres/'+id+'/books/').then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching books by genre');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
}]);

