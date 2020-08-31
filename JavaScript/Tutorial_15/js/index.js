let cont = document.querySelector(".no");
cont = document.querySelector(".container");
console.log(cont.childNodes);
console.log(cont.children);
let nodeName = cont.childNodes[3].nodeName;
console.log(nodeName);
let nodeType = cont.childNodes[1].nodeType;
console.log(nodeType);
// 1. Element
// 2. Attribute
// 3. Text Node
// 8. Comment
// 9. document
// 10. docType

let container = document.querySelector("div.container");
console.log(container.children[1].children[0].children);
console.log(container.firstChild);
console.log(container.firstElementChild); // Gives first child element
console.log(container.lastChild);
console.log(container.lastElementChild); // Gives last child element
console.log(container.childElementCount); // Total no of elements
console.log(container.firstElementChild.parentNode); // parent node
console.log(container.firstElementChild.nextSibling); // next sibling of first element
console.log(container.firstElementChild.nextElementSibling); // next element of first element
console.log(container.firstElementChild.nextElementSibling.nextElementSibling); // next element of next element of first element