let element = document.createElement("li");
let text = document.createTextNode("I'm a text node");
element.appendChild(text);

// Adding a class name to the 'li' element
element.className = "childul";
// Giving an id to the 'li' element
element.id = "createdLi";
// Giving an attribute to the 'li' element
element.setAttribute("title", "mytitle");
// Writing text
element.innerText = "Hello, this is created by Aritra";
// Writing text using innerHTML
element.innerHTML = "<b>Hello, this is created by Aritra</b>";

let ul = document.querySelector("ul.this");
ul.appendChild(element);
console.log(element);



let elem2 = document.createElement("h3");
elem2.id = "elem2";
elem2.className = "elem2";
let tNode = document.createTextNode("This is a created text node for elem2");
elem2.appendChild(tNode);
element.replaceWith(elem2);


let myul = document.getElementById("myul");
myul.replaceChild(element, document.getElementById("fui"));
myul.removeChild(document.getElementById("lui"));
let pr = elem2.hasAttribute("id");
elem2.removeAttribute("id");
console.log(pr);