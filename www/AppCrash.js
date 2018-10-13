var exec = require('cordova/exec');

exports.crash = function (arg0, success, error) {
    exec(success, error, 'AppCrash', 'crash', [arg0]);
};
