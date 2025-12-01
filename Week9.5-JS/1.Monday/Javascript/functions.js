//functions in JS

function add(a, b){
    return a + b;
}

let sum = add(1, 2);

//lambdas exist in JS
(a, b) => a + b;

//JS also has a thing called function expressions
//They don't exist really in Java
//You can set a variable = to a function
let subtract = (a, b) => a - b;

//BIG difference with Java
//You can call a function with the wrong number of parameters
//Any parameters after the ones you defined, are undefined
let newSum = add(1, 2, 3, 4, 5, 6);

let notNumbers = add("bob", true);
