/*
Element Selector:
1. Single element selector
2. Multi element selector
*/


// 1. Single element selector
let element = document.getElementById('myFirst');
// element = element.className;
// element = element.childNodes;
// element = element.parentNode;
element.style.color = "blue";
element.innerText = "Ari is a good boy";
element.innerHTML = "<b>Ari is a good boy</b>";
console.log(element.innerHTML);
console.log(element.innerText);


let sel1 = document.querySelector("#myFirst");
console.log(sel1);
let sel2 = document.querySelector(".container");
console.log(sel2);
let sel3 = document.querySelector("h1");
console.log(sel3);
let sel4 = document.querySelector('div'); //only selects 1st div
sel4.style.color = "green";
console.log(sel4);



// 2.. Multi element selector
let elems = document.getElementsByClassName("child");
elems = document.getElementsByClassName("container");
console.log(elems[0].getElementsByClassName("child"));
elems = document.getElementsByTagName("div");
console.log(elems);

Array.from(elems).forEach(element => {
    console.log(element);
    element.style.color = "green";
});