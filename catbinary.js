function decode(message) {
    message = message.replace(/meow/g, '0').replace(/MEOW/g, '1')
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
    return result.replace(/0/g, 'meow').replace(/1/g, 'MEOW');
}

let i = prompt("Enter 'd' to decode or 'e' to encode a message to/from cat binary: ")
if (i[0].toLowerCase() === "d") {
    let decodeMessage = prompt("Enter the message to decode: ")
    console.log("Decoded message: " + decode(decodeMessage))
}
else if (i[0].toLowerCase() === "e") {
    let encodeMessage = prompt("Enter the message to convert to cat binary: ")
    console.log("Cat binary: " + encode(encodeMessage))
}

console.log("Thanks for using the cat binary translator!")
console.log("Remember to praise Schrodinger's Cat and have a great day.")
