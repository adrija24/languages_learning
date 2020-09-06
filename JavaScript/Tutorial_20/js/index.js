// Adding a key-value pair inside local storage
localStorage.setItem("Name", "Aritra");
localStorage.setItem("Name2", "Harry");

// For clearing the entire local sorage
// localStorage.clear()

//For clearing a particular key-value pair
localStorage.removeItem("Name2");

// Retrieving key-value pair
let name = localStorage.getItem("Name");
let name2 = localStorage.getItem("Name2");
console.log(name);
console.log(name2);


let impArray = ["Mango", "Apple", "Orange", "Banana"];
// localStorage.setItem("Fruit", impArray);  (Converts array into string)
localStorage.setItem("Fruit", JSON.stringify(impArray));
name = JSON.parse(localStorage.getItem("Fruit"));
console.log(name)


localStorage.setItem("sessionName", "sessionAritra");
localStorage.setItem("sessionName2", "sessionHarry");
localStorage.setItem("sessionFruit", JSON.stringify(impArray));