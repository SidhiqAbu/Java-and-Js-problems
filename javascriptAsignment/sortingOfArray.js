



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


function main(){

    // Taking input from user.........
    // let arr = readLine().replace(/\s+$/g,'').split(' '); 

    let arr = [5,8,9,2,3,0,1,4]; // example input....
    console.log("Input Array : ",arr);
    arr.sort().reverse();
    console.log("Descending order Array : ",arr);
}





