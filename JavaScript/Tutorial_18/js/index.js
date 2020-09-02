// let btn = document.getElementById("btn");
// btn.addEventListener("click", func1);
// btn.addEventListener("dblclick", func2);
// btn.addEventListener("mousedown", func3); // Considers left click, right click and also  mouse wheel

// function func1(e) {
//     console.log("Thanks!!!",e);
//     e.preventDefault();
// }
// function func2(e) {
//     console.log("Thanks!!! It's a double",e);
//     e.preventDefault();
// }
// function func3(e) {
//     console.log("Thanks!!! It's a mouse down",e);
//     e.preventDefault();
// }

// document.querySelector(".no").addEventListener("mouseenter", function(){
//     console.log("You entered class 'No'")
// });
// document.querySelector(".no").addEventListener("mouseleave", function(){
//     console.log("You exited class 'No'")
// });
document.querySelector(".container").addEventListener("mousemove", function(e){
    console.log(e.offsetX, e.offsetY);
    document.body.style.backgroundColor = `rgb(${e.offsetX}, ${e.offsetY}, 154)`
    console.log("You triggered mmouse move event");
});