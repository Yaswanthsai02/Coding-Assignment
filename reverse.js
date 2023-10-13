function wordReverser(str){
    return str.split("")
            .reverse()
            .join("")
            .split(" ")
            .reverse()
            .join(" ")

}
console.log(wordReverser("This is a sunny day"));