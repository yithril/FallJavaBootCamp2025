/*multi line comments*/
//variables

//String boolean Number Null Undefined Symbol BigInt
//Number is for any number, doubles, floats, int doesn't matter

//declare a variable
let name = "Jonathan";

name = 50;

name = false;

//variables are weakly typed

//semicolons are optional
let price = 50.5
let isPremiumMember = false
let kyloRenFans = null;
let singleQuote = 'This is also a string';

//the var keyword DOES exist but never use it
var someVariable = "hi there";

//for loops
for(let i = 0; i < 10; i++){

}

let count = 0;
while(count < 10){
    console.log('Count is: ' + count);
}

//string interpolation
let userName = "Bob";
console.log(`Hi my name is ${userName}`);

//if statements
let number = 50;

if(number === 50){
    console.log('Number is 50');
}
else if(number < 50){
   console.log('Number is less than 50');
}
else{
    'Number is greater than 50';
}

