def decrypt(key, message):#ceasar's cipher 
    message = message
    alpha = "abcdefghijklmnopqrstuvwxyz"
    result = ""

    for letter in message:
        if letter in alpha: #checks if message contains letters
                            #find the corresponding ciphertext letter in the alphabet
            index_of_letter = (alpha.find(letter) - key) % len(alpha)

            result = result + alpha[index_of_letter]
        else:
            result = result + letter

    return result

def main():
    word = "ejitpspawaqlejitaiulrtwllrflrllaoatwsqqjatgackthlsiraoatwlplqjatwjufrhlhutsqataqitatsaittkstqfjcae"
    i = 1
    for i in range(26):
        print("Key ",i,": ",decrypt(i,word),"\n")

main()

