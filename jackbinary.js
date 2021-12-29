function decode(message) {
    message = message.replace(/jack/g, '0').replace(/JACK/g, '1')
    var result = "";
    var arr = message.match(/.{1,8}/g);
    for (var i = 0; i < arr.length; i++) {
        result += String.fromCharCode(parseInt(arr[i], 2).toString(10));
    }
    return result;
}

function encode(message) {
    var result = "";
    for (var i = 0; i < message.length; i++) {
        var bin = message[i].charCodeAt().toString(2);
        result += Array(8 - bin.length + 1).join("0") + bin;
    }
    return result.replace(/0/g, 'jack').replace(/1/g, 'JACK');
}

let i = prompt("Enter 'd' to decode or 'e' to encode a message to/from jack binary: ")
if (i[0].toLowerCase() === "d") {
    let decodeMessage = prompt("Enter the message to decode: ")
    console.log("Decoded message: " + decode(decodeMessage))
}
else if (i[0].toLowerCase() === "e") {
    let encodeMessage = prompt("Enter the message to convert to jack binary: ")
    console.log("Jack binary: " + encode(encodeMessage))
}

console.log("Thanks for using the jack binary translator!")
console.log("Remember to praise Schrodinger's jack and have a great day.")
