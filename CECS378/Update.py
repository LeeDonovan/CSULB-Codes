#CECS 378 Lab 1 Symmetric Cryptography
#Donovan Lee
#016741645
 
from string import ascii_letters
import string
alpha = "abcdefghijklmnopqrstuvwxyz"#regular alphabet key
q1 = "fqjcbrwjwjvnjaxbnkhjwhxcqnawjvnfxdumbvnuujbbfnnc"#q1 -> q4 are Part 1 of decrypting
q2 = "oczmzvmzorjocdibnojvdhvodigdazadmnoojbzorcvotjprvioviyvaozmocvoojziejtdojigtoczrdnznojahvifdiyvxcdzqzocznzxjiy"
q3 = "ejitpspawaqlejitaiulrtwllrflrllaoatwsqqjatgackthlsiraoatwlplqjatwjufrhlhutsqataqitatsaittkstqfjcae"
q4 = "iyhqz ewqin azqej shayz niqbe aheum hnmnj jaqii yuexq ayqkn jbeuqiihed yzhni ifnun sayiz yudhe sqshu qesqa iluym qkque aqaqm oejjshqzyu jdzqa diesh niznj jayzy uiqhq vayzq shsnj jejjz nshna hnmytisnae sqfun dqzew qiead zevqi zhnjq shqze udqai jrmtq uishq ifnunsiiqa suoij qqfni syyle iszhn bhmei squih nimnx hsead shqmr udququaqeu iisqe jshnj oihyy snaxs hqihe lsilu ymhni tyz"
    
def main_menu():
    print("1. Part 1")#Will take you to the first Four questions that need to be decrypted
    print("2. Part 2/Encrypt Messages")#Will take you to the next 4 that need to be encrypted then decrypted
    print("3. Quit\n")#ends program

def ask():
    print("What would you like to decrypt?")
    print("1. ", q1)#print statements
    print("2. ",q2)
    print("3. ",q3)
    print("4. ",q4)
    print("5. Quit\n")#Leaves second loop



def ceasars_cipher(key, message):#ceasar's cipher 
    message = message
    alpha = "abcdefghijklmnopqrstuvwxyz"
    result = ""#empty string to add in new letters

    for letter in message:
        if letter in alpha: #checks if message contains letters
                            #find the corresponding ciphertext letter in the alphabet
            index_of_letter = (alpha.find(letter) - key) % len(alpha)#uses ascii values to subtract

            result = result + alpha[index_of_letter]#finds the index then locates in alphabet string to add to result string
        else:
            result = result + letter

    return result

def encrypter(key, message):#function that encrypts the message
    convert = str.maketrans(ascii_letters, key)#replaces character with a mapped character using unicode
    return message.translate(convert)#returns a translated copy of the message

def decrypter(key, message):#function that decrypts the encrypted message
    convert = str.maketrans(key, ascii_letters)#replaces character with a mapped character using unicode
    return message.translate(convert)#returns a decrypted message

def main():
    loop = True
    while(loop):
        main_menu();
        choice_1 = input("Enter a number 1,2,3: \n")
        if choice_1 == '1':
            part1 = True
            while(part1):
                ask()
                choice_2 = input("Enter a number 1,2,3,4,5: \n")
                if(choice_2 == '1'):
                    for i in range(26):#runs through all 
                        decrypt = ceasars_cipher(i,q1)
                        print("Decrypting ",i,": ", decrypt)
                    input("Press Enter to continue....")
                if(choice_2 == '2'):
                    for i in range(26):
                        decrypt = ceasars_cipher(i,q2)
                        print("Decrypting ",i,": ", decrypt)
                    input("Press Enter to continue....")
                if (choice_2 == '3'):
                    for i in range(26):
                        decrypt = ceasars_cipher(i,q3)
                        print("Decrypting ",i,": ", decrypt)
                    print("Can not Decrypt...")#unable to decrypt
                    input("Press Enter to continue....")
                if (choice_2 == '4'):
                    for i in range(26):
                        decrypt = ceasars_cipher(i,q4)
                        print("Decrypting ",i,": ", decrypt)
                    print("Can not Decrypt...")#unable to decrypt
                    input("Press Enter to continue....")
                if(choice_2 == '5'):
                    part1 = False#breaks out of while loop
        if(choice_1 == '2'):
            keep_moving = True
            while (keep_moving):
                alphabet = set(string.ascii_lowercase)#creates a string with lowercase ascii values
                user_picking = input("Enter a message to encrypt| Enter message line by line if it is a paragraph: \n")
                user_key = input("Enter a 26 letter key: \n")
                if(len(user_key) == 26 and set(user_key.lower()) >= alphabet):#checks to see if user has correct input
                    total_key = user_key + user_key.upper()#adds upperletters to run encryption/decryption
                    encrypt = encrypter(total_key,user_picking)#goes to encrypter function to encrypt
                    print("Encrypted Message: ",encrypt)#prints encoded message
                    input("\nPress Enter to Decrypt...")#waits for user to see encoded message
                    decrypt = decrypter(total_key,encrypt)#goes to decrypter function to decrypt encrypted message
                    print("\nMessage has been Decrypted: ", decrypt)
                    input("\nPress Enter to continue...\n")#waits for user to see decoded message
                    keep_moving = False

                else:
                    print("Not enough letters or letters were repeated\n")#tells user wrong input
        if(choice_1 == '3'):
            print("Goodbye...")#breaks out for while loop and leaves program
            loop = False



                    





main()#calls main function to run




