keep_going = True
while (keep_going == True):
    
    num = int(input("Please enter number a number between 10-20 \n\t"))
    if num >= 10 and num <=20:
         for i in range(num):
             print(i+1)
         keep_going = False
#keep_going = False goes back to while loop making not equal to True stopping loop.
    else:
        print("Wrong Number!")
#Goes back to while loop
    

