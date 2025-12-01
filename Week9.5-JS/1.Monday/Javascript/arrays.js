let fruits = ["strawberry", "lime", "lemons", "grapes"];

console.log(fruits[1]);

//How do I add things or remove things from the array?
//Do you want to work with the beginning or end of the array?

//add something to the end
fruits.push("plums");

console.log(fruits);

fruits.pop();

console.log(fruits);

//shift and unshift are for the beginning

fruits.shift();
console.log(fruits);

fruits.unshift("bananas");
console.log(fruits);

console.log(fruits.length);

fruits.sort();