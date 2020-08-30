// General Loops: for, while and do-while


// for
for (let i = 1; i <= 10; i++) {
    console.log(i);
}

// while
let j = 1;
while (j <= 10) {
    console.log(j);
    j++;
}

// do-while
let k = 1;
do {
    console.log(k);
    k++;
} while (k <= 10);


// break and continue

// break
let l = 1;
do {
    console.log(l);
    if (l === 5) {
        break;
    }
    l++;
} while (l <= 10);
console.log("Done");

// continue
let m = 1;
do {
    if (m === 5) {
        console.log("Skipped");
        m++;
    }
    console.log(m);
    m++;
} while (m <= 10);

let arr = [2, 5, 8, 10, 15];
arr.forEach(function(element, index, array){
    console.log(element, index, array);
});

let obj = {
    name: "Aritra Roy",
    age: 23,
    type: "Web Developer",
    os: "Windows 10"
}
for(let key in obj)
{
    console.log(`The ${key} of object is ${obj[key]}`)
}