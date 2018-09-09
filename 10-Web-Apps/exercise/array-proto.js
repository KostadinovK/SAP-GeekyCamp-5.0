var arr = ['a','b','c'];

var newArr = arr.map(function(element,index){
    return index + ' --> ' + element;
});

console.log(arr);
console.log(newArr);
