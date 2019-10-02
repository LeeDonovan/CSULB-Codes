from cryptography.fernet import Fernet

def ceasars_cipher(key, message):#ceasar's cipher 
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

def loadDictionary():
    dictionaryFile = open('C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS378\\dictionary.txt')
    english = {}
    for word in dictionaryFile.read().split('\n'):
        english[word] = None
    dictionaryFile.close()
    return english

englishWords = loadDictionary()




def main():
    q1 = "fqjcbrwjwjvnjaxbnkhjwhxcqnawjvnfxdumbvnuujbbfnnc"#key 9
    q2 = "oczmzvmzorjocdibnojvdhvodigdazadmnoojbzorcvotjprvioviyvaozmocvoojziejtdojigtoczrdnznojahvifdiyvxcdzqzocznzxjiy"#21
    q3 = "ejitpspawaqlejitaiulrtwllrflrllaoatwsqqjatgackthlsiraoatwlplqjatwjufrhlhutsqataqitatsaittkstqfjcae"
    q4 = "iyhqz ewqin azqej shayz niqbe aheum hnmnj jaqii yuexq ayqkn jbeuqiihed yzhni ifnun sayiz yudhe sqshu qesqa iluym qkque aqaqm oejjshqzyu jdzqa diesh niznj jayzy uiqhq vayzq shsnj jejjz nshna hnmytisnae sqfun dqzew qiead zevqi zhnjq shqze udqai jrmtq uishq ifnunsiiqa suoij qqfni syyle iszhn bhmei squih nimnx hsead shqmr udququaqeu iisqe jshnj oihyy snaxs hqihe lsilu ymhni tyz"
    message = """He who fights with monsters should look to it that he himself does not become a monster . And if you gaze long into an abyss , the abyss also gazes into you .""".encode()
    c = ceasars_cipher(9,q1)
    print(c)






main()

