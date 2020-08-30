const name = "Aritra";
const greeting = "Good Morning!!!";
console.log(greeting + ' ' + name);

let html = "<h1>This is a heading</h1> "+
            "<p>This is my paragraph</p>";
html = html.concat(" ", "<div>This is a division</div>", " Thank You");
console.log(html);
console.log(html.length);
console.log(html.toLowerCase());
console.log(html.toUpperCase());

console.log(html[1]);

console.log(html.indexOf('h'));
console.log(html.indexOf('man'));
console.log(html.indexOf('<'));
console.log(html.lastIndexOf('<'));

console.log(html.charAt(11));

console.log(html.endsWith("You"));
console.log(html.endsWith("Me"));

console.log(html.includes("my"));
console.log(html.includes("man"));

console.log(html.substring(-10)); //Whole string
console.log(html.substring(1,10)); //Upto (n-1)

console.log(html.slice(-4));
console.log(html.slice(0,4));

console.log(html.split(" "));

console.log(html.replace("is", "it")); //Replace only first occurance

let fruit1 = "Orange";
let fruit2 = "Apple";
let myHtml = `Hello ${name}
            <h1> This is a heading </h1>
            <p> You like ${fruit1} and ${fruit2}`;
document.body.innerHTML = myHtml;