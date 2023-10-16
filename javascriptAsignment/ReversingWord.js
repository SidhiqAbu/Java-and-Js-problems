

process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

//  reversing of each and every word in the sentense.....
function reversWord(str){
    let str1='';
    for( let ch of str){
        str1 = ch+str1;
    }
    return str1;
}


function main(){
    // let str = readLine(); Taking input from user...line........
    
    let str = "This is a sunny day";  // example......
    let arr = str.split(' ');
    let result='';
    for(let ch of arr){
        let word = reversWord(ch);
        result = result+word+' ';
    }
    console.log("Input Line : ",str);
    console.log("output Line : ",result);
}








































