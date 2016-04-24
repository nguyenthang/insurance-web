/**
 * Created by thangnguyen-imac on 4/24/16.
 */
'use strict';

app.controller('UserController', ['$scope', 'UserService', function($scope, UserService){
    var self = this;
    self.users = [];

    self.fetchAllUsers = function(){
        UserService.fetchAllUsers()
            .then(
                function(d){
                    self.users =d;
                },
                function (errResponse) {
                    console.error("Error when fetching users");
                }
            );
    };
    
}]);