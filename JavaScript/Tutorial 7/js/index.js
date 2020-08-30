let marks = [34, 25, 39, 48, 20, 30];
const fruits = ["Apple", "Mango", "Orange", "Lichi", "Banana"];
const mixed = ["String", 86, [2, 5]];
const arr = new Array(23, 123, 565, "Orange");
console.log(`Marks are ${marks}, fruits are ${fruits}, mixed items are ${mixed} and the array made using array constructor is ${arr}`)

console.log(marks.length);
console.log(Array.isArray(arr));
console.log(Array.isArray("whdgwjhe"));
arr[0] = "Aritra";
let arrElement = arr[0];
console.log(arrElement);
console.log(arr);

let value = marks.indexOf(39);
console.log(value);

// Mutating or modifying arrays
marks.push(500); // Adding one element at the end
console.log(marks);
marks.unshift(2000); // Adding one element in the front
console.log(marks);
marks.pop(); //Removing one element from the end
console.log(marks);
marks.shift(); //Removing one element from the front
console.log(marks);
marks.splice(1, 3); //Removing elements from 1 to 3
console.log(marks);
marks.reverse(); //Reversing array
console.log(marks);
let marks2 = [1, 2, 3, 5];
marks = marks.concat(marks2);
console.log(marks);

let myObj = {
    name: "Aritra",
    "my sub": "Chemistry",
    isActive: true,
    marks: [1, 2 , 5, 10]
}
console.log(myObj)
console.log(myObj["my sub"])
console.log(myObj.marks)