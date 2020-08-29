const age = 23;
if (age==23)
{
    console.log("Age is 23");
}
else if (age==50){
    console.log("Age is 50");
}
else{
    console.log("Age is not 23");
}

// Checking existance of any variable
if (typeof vari !== 'undefined'){
    console.log("vari is defined");
}
else {
    console.log("vari is not defined");
}

// Using boolean
const doesDrive = true;
if (doesDrive && age>18){
    console.log("You can drive");
}
else{
    console.log("You can not drive");
}

// Conditional operator
console.log(age==45? "Age is 45": "Age is not 45");

// Switch
switch (age) {
    case 18:
        console.log("You are 18");
        break;
    case 28:
        console.log("You are 28");
        break;
    case 38:
        console.log("You are 38");
        break;

    default:
        console.log("Your age is other than 18, 28 and 38")
        break;
}