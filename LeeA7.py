
import turtle
import random
def NewFile():
    loop = True
    while (loop == True):
        user_file = input("Choose a file name that ends in .txt: ")
        if user_file == "Infile1" or user_file == "Infile2":
            loop = False
        else:
            print("Wrong file")




    # If user_file does not have .txt add one
    ## if it does then it opens
    if user_file[-4:] != ".txt":     # Adds .txt if user does not add .txt
        user_file = user_file + ".txt"  

    text_file = open(user_file, "r")
    alphabet_check = [0]*26                        # List size equals 26 0's
    text_from_paragraph = text_file.read().split() # Splits file by every space in the text file. 
    for i in text_from_paragraph:
        for j in i:                                # Go through every letter aand increment by 1 into the list
            j = j.lower()
            if j == "a":
                alphabet_check[0] = alphabet_check[0]+1  # If letter is showed up then add one into the strings spot
            if j == "b":
                alphabet_check[1] = alphabet_check[1]+1
            if j == "c":
                alphabet_check[2] = alphabet_check[2]+1
            if j == "d":
                alphabet_check[3] = alphabet_check[3]+1
            if j == "e":
                alphabet_check[4] = alphabet_check[4]+1
            if j == "f":
                alphabet_check[5] = alphabet_check[5]+1
            if j == "g":
                alphabet_check[6] = alphabet_check[6]+1
            if j == "h":
                alphabet_check[7] = alphabet_check[7]+1
            if j == "i":
                alphabet_check[8] = alphabet_check[8]+1
            if j == "j":
                alphabet_check[9] = alphabet_check[9]+1
            if j == "k":
                alphabet_check[10] = alphabet_check[10]+1
            if j == "l":
                alphabet_check[11] = alphabet_check[11]+1
            if j == "m":
                alphabet_check[12] = alphabet_check[12]+1
            if j == "n":
                alphabet_check[13] = alphabet_check[13]+1
            if j == "o":
                alphabet_check[14] = alphabet_check[14]+1
            if j == "p":
                alphabet_check[15] = alphabet_check[15]+1
            if j == "q":
                alphabet_check[16] = alphabet_check[16]+1
            if j == "r":
                alphabet_check[17] = alphabet_check[17]+1
            if j == "s":
                alphabet_check[18] = alphabet_check[18]+1
            if j == "t":
                alphabet_check[19] = alphabet_check[19]+1
            if j == "u":
                alphabet_check[20] = alphabet_check[20]+1
            if j == "v":
                alphabet_check[21] = alphabet_check[21]+1
            if j == "w":
                alphabet_check[22] = alphabet_check[22]+1
            if j == "x":
                alphabet_check[23] = alphabet_check[23]+1
            if j == "y":
                alphabet_check[24] = alphabet_check[24]+1
            if j == "z":
                alphabet_check[25] = alphabet_check[25]+1
    print ("\n") 
    print ("How many numbers for each letter showed up for string")
    print (alphabet_check)                                 # Shows numbers in string
    print ("\n")
    print ("String to Letters")
    for i in range(26): 
        print (chr(ord('a') + i)," = " ,alphabet_check[i]) # Converts letter into number then incrementing by 1 due to range(26) to get the next letter

    colors  = ["red","green","blue","orange","purple","pink","yellow","lightyellow"]
    def drawBar(t, height, n):  # add another parameter for alphabets
        """ Get turtle t to draw one bar, of height. """
        t.begin_fill()          # start filling this shape
        t.left(90)              # turn left 90 degree
        t.forward(height)       # move forward for a distance = height
        t.write(" " +n+ "= "+str(height))    # write height
        t.right(90)             # turn right 90 degree
        t.forward(40)           # move forward for a distance = 40
        t.right(90)             # turn right 90 degree
        t.forward(height)       # move forward for a distance = height
        t.left(90)
        t.end_fill()            # stop filling this shape

    xs = alphabet_check         # data to be graphed
    maxheight = max(xs)         # maximum height of bars in data
    numbars = len(xs)           # determine number of bars to be drawn
    border = 10                 # for border

    wn = turtle.Screen()
    wn.setworldcoordinates(0-border, 0-border, 40*numbars+border, maxheight+border)
    wn.bgcolor("white")

    skrt = turtle.Turtle()      # create turtle name and set some attributes
    skrt.color("black")
    skrt.pensize(2)

    n = -1
    for i in xs: # n is a number that will be converted into a letter
        n+=1
        skrt.fillcolor(random.choice(colors)) # Each bar will become a random color
        drawBar(skrt, i, (chr(ord('a') + n)))
    

    wn.exitonclick() 

            
                


    text_file.close()



NewFile()
Continue = True
while (Continue == True):
    checking = input("Do you want to open a file?  Type Yes or No = ")
    if checking == "Yes":
        NewFile()
        Continue = True  
    else:
        print("Goodbye!")
        Continue = False
    


 
