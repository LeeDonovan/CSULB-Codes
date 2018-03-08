def print_menu():
    print("Main Menu")
    print("1. Check a palindrome?")
    print("2. Make a palindrome!")
    print("3. Quit")

def get_menu_choice():
    keep_going = True
    while keep_going:                           #User needs to type a 1, 2, or 3 
        user_input = input("Choose a menu: ")
        if user_input == "1" or user_input == "2" or user_input == "3":
            return user_input
        else:
            print("Wrong Menu Choice\n")

def get_phrase():
    keep_going = True
    while keep_going:
        english_input = input("Type a Phrase: ")
        letter = 0                  #if there is at least one letter it will go through the validation
        for i in english_input:
            if i.isalpha():
                letter = 1
        if letter == 1:
            return english_input
                        
                
                

def is_palindrome(st):
    j = len(st)                     #Checks if the phrase forward and backward are the same letters
    k = -1
    for i in range(len(st)):
        k += 1
        j -= 1
        while st[k].isalpha() == False:
            k += 1
        while st[j].isalpha() == False:
            j -= 1
        if k < j :
            if st[k].lower() != st[j].lower():
                return False
        else:
            break
    return True

def menu_check_palindrome():
    OG = get_phrase()           #Makes the get_phrase() as a variable so it doesn't repeat the same steps
    if  is_palindrome(OG):
        print('"',OG,'"',"is a palindrome")
    else:
        print(OG, "is not a palindrome")

def make_palindrome(st, yes_no_input):
    for j in range(len(st) -1,-1,-1):           #Starts at the end of the phrase then repeats backward to forward
        if yes_no_input == True:
            if j > 0 :
                st = st + st[j-1]       #Doesn't include the second to last letter if user returns True
        else:
            st = st + st[j]             #Includes second to last letter if user returns False
    return st

def get_repeat_last():
    keep_going = True
    while keep_going:
        yes_no_input = input("Enter y or n if you want to add the last letter of your phrase: ")
        if yes_no_input == "y":
            return True                         #Ask if user wants second to last letter
        elif yes_no_input == "n":
            return False
        else:
            print("Invalid Answer")

def menu_make_palindrome():
    phrase_that_pays = get_phrase()                     #Turns the def functions into variables to save the process so user doesn't repeat
    re_peat_peat = get_repeat_last()   
    new_and_improved = make_palindrome(phrase_that_pays, re_peat_peat)
    print("Before: ",phrase_that_pays," After: ",new_and_improved )


def main():                            #The main function where all the magic happens
    keep_going = True
    while keep_going:
        print_menu()
        menu_choice = get_menu_choice()
        if menu_choice == "1":
            menu_check_palindrome()
        elif menu_choice == "2":
            menu_make_palindrome()
        elif menu_choice == "3":
            print("Code Exited...")
            keep_going = False

main()


        
    


                
            


