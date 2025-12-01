import { Person } from "./person";

//number string boolean null undefined bigint symbol
let firstName:string = "Jonathan";
let age:number = 40;
let isInYearUp:boolean = true;

//You don't have to indicate the type
let fullName = "Bob Jones";

//union types
//It sets what possible types there are for a variable
let newCustomer:string|null = "Davie Jones";
newCustomer = null;

let employeeId:string|number|null = "ABC123";

//What if I have NO idea what the variable should be?
let newVariable:any = "This can be anything";

//What about functions?
//They have types too!

function add(a:number, b:number) : number {
    return a+b;
}

//What if it doesn't return anything?
function print(msg:string) : void {
    console.log("Look mom no return statement.")
}

let student:Person = {
    name: "Bob",
    age: 21,
    isInYearUp: true
}
