def decode(message):
    message = int(message.replace("meow", "0").replace("MEOW", "1"), 2)
    return message.to_bytes((message.bit_length() + 7) // 8, "big").decode()


def encode(message):
    return (
        bin(int.from_bytes(message.encode(), "big"))
        .replace("b", "")
        .replace("0", "meow")
        .replace("1", "MEOW")
    )


i = input("Enter 'd' to decode or 'e' to encode a message to/from cat binary: ")
if i[0].lower() == "d":
    decodeMessage = input("Enter the message to decode: ")
    print("Decoded message: " + decode(decodeMessage))
elif i[0].lower() == "e":
    encodeMessage = input("Enter the message to convert to cat binary: ")
    print("Cat binary: " + decode(encodeMessage))

print("Thanks for using the cat binary translator!")
print("Remember to praise Schrodinger's Cat and have a great day.")
