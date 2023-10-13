const arr = [1, 5, 78, 90, 69];
console.log("without sorting", arr);
arr.sort((a,b) => {
    return b - a;
});
console.log("after sorting", arr)