allLinks = document.links;
console.log("The links are following-");
i = 1;
Array.from(allLinks).forEach(function (link){
    if (link.href.includes("javascript")){
        console.log(`${i}. ${link}`);
        i++;
    };
});