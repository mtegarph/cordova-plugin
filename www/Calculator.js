var exec = require('cordova/exec');

/*exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'Calculator', 'coolMethod', [arg0]);
};*/

//for multiple function use module 
module.exports.add = function(arg0, success , error)
{
exec(success, error, 'Calculator', "add", [arg0]);
}

module.exports.substract = function(arg0, success, error)
{
    exec(success, error, 'Calculator', "substract", [arg0]);
}
