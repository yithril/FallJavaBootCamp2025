"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
//number string boolean null undefined bigint symbol
var firstName = "Jonathan";
var age = 40;
var isInYearUp = true;
//You don't have to indicate the type
var fullName = "Bob Jones";
//union types
//It sets what possible types there are for a variable
var newCustomer = "Davie Jones";
newCustomer = null;
var employeeId = "ABC123";
//What if I have NO idea what the variable should be?
var newVariable = "This can be anything";
//What about functions?
//They have types too!
function add(a, b) {
    return a + b;
}
//What if it doesn't return anything?
function print(msg) {
    console.log("Look mom no return statement.");
}
var student = {
    name: "Bob",
    age: 21,
    isInYearUp: true
};
