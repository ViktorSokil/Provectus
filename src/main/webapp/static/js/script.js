


    // create the module and name it scotchApp
       	var scotchApp = angular.module('scotchApp',
       	    [
       	        'ngRoute',
       	        'ui.grid',
                   'ui.grid.edit',
                   'ui.grid.pagination',
                   'angularCharts'
       	    ]
       	);

       	// configure our routes
       	scotchApp.config(function($routeProvider) {
       		$routeProvider

       		    // route for the home page
       			.when('/', {
       				templateUrl : 'static/js/pages/home.jsp',
       				controller  : 'mainController'
       			})

       			// route for the currency rate page
                   .when('/currency_rate', {
                   	templateUrl : 'static/js/pages/currency_rate.jsp',
                   	controller  : 'currencyRateController'
                   });
       	});

