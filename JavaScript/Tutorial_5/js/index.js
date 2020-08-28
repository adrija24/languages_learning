// type conversion

let myVar;
myVar = String(50);
console.log(myVar, (typeof myVar));

let booleanVar = String(true);
console.log(booleanVar, (typeof booleanVar));

let date = String(new Date());
console.log(date, (typeof date));

let arr1 = [1, 2, 3, 4];
console.log(arr1.length, (typeof arr1));
let arr2 = String([1, 2, 3, 4]);
console.log(arr2.length, (typeof arr2));

let i = new Date();
console.log(i.toString());

let str = Number("26566");
console.log(str, (typeof str));
str = Number("464fe545")
console.log(str, (typeof str));
str = Number(true);
console.log(str, (typeof str));
str = Number(false);
console.log(str, (typeof str));
str = Number([1, 2, 3, 4]);
console.log(str, (typeof str));

let num1 = parseInt('65')
console.log(num1, (typeof num1));
let num2 = parseInt('6445.23555')
// console.log(num2, (typeof num2));
console.log(num2.toFixed(2), (typeof num2));



// type coercion
let myStr = "564";
let myNum = 25;
console.log(myStr + myNum);