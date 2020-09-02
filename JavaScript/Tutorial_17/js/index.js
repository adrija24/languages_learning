document.getElementById("heading").addEventListener("click", function(e){
    let variable;
    console.log("You have clicked the heading");
    // location.href = "https://www.facebook.com/"
    variable = e.target.className;
    variable = e.target.id;
    variable = Array.from(e.target.className);
    variable = e.offsetX;
    variable = e.offsetY;
    variable = e.clientX;
    variable = e.clientY;
    console.log(variable);
})