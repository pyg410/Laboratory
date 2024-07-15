var app = angular.module('app', []);

app.controller('neon', function($scope, $element){
    var _name = 'WEBS';
    $scope.user = {
        name: function(newName) {
            return arguments.length ? (_name = newName) : _name;
        }
    };
    $scope.getColor = function(color){
        $scope.color = color;
    };
    var _color = ['pink', 'yellow', 'green', 'blue'];
    $scope.getColor(_color[Math.floor((Math.random() * 3) + 1)]);
});
