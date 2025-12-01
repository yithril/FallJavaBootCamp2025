//Step #1 Target the stuff on the page you care about
//Save them as variables (If this seems like OOP, its because it is)

let firstParagraph = document.getElementById("paragraph");
let secondParagraph = document.getElementById("userInput");
let button = document.getElementById("userButton");

//let's make the web page interactive!
//Let's do something when the user clicks the button

//We're going to have code on standby for if the user clicks the button
//This is called an event listener

//Event listeners take TWO arguments
//The first is the name of the event, the second is the function you run when the event happens

button.addEventListener('click', function() {
    alert("You clicked the button!");
    let userAnswer = prompt("What's your favorite color?");

    secondParagraph.innerHTML = userAnswer;
    firstParagraph.style.display = 'none';
    secondParagraph.classList.add('blueBackground');
} );