
    // create the module and name it scotchApp
	var scotchApp = angular.module('scotchApp',
	    [
	        'ngRoute',
	        'ui.grid',
            'ui.grid.edit',
            'ui.grid.pagination'
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

			// route for the about page
			.when('/about', {
				templateUrl : 'static/js/pages/about.jsp',
				controller  : 'aboutController'
			})

			// route for the contact page
			.when('/contact', {
				templateUrl : 'static/js/pages/contact.jsp',
				controller  : 'contactController'
			});
	});

