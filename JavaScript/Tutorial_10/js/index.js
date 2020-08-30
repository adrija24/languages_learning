// function
function greet(name, thanks = "Thanks!!") {
    let msg = `Happy Birthday, ${name}!!! Wishing you a day filled with happiness and a year filled with joy. ${thanks}`;
    return msg;
}

let name1 = "Aritra";
let name2 = "Tarak";

let val1 = greet(name1, "Thanks a lot!!!");
console.log(val1);
// function using variable
const myGreet = function (name, thanks = "Thanks!!") {
    let msg = `Happy Birthday, ${name}!!! Wishing you a day filled with happiness and a year filled with joy. ${thanks}`;
    return msg;
}
let val2 = myGreet(name2, "Thanks a lot!!!");
console.log(val2);

// function in a object
const myObj = {
    name: "SkillF",
    game: function () {
        return "GTA";
    }
}
console.log(myObj.game());

// array
arr = ["Fruit", "Vegetable", "Furniture"];
arr.forEach(function (element, index, array) {
    console.log(element, index);
});



// scope (let/const block level scope and var function level scope)
var i = 235;
console.log(i);
function ui(name) {
    var i = 20;
    console.log(i)
    return `This is a ${name} ui`;
}
console.log(ui("Ari"), i);
