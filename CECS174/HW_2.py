def print_menu():
    print("Main Menu")
    print("1. Check a palindrome?")
    print("2. Make a palindrome!")
    print("3. Quit")

def get_menu_choice():
    keep_going = True
    while keep_going:
        user_input = input("Choose a menu: ")
        if user_input == "1" or user_input == "2" or user_input == "3":
            return user_input
        else:
            print("Wrong Menu Choice\n")

def get_phrase():
    keep_going = True
    while keep_going:
        english_input = input("Type a Phrase: ")
        letter = 0
        for i in english_input:
            if i.isalpha():
                letter = 1
        if letter == 1:
            return english_input
                        
                
                

def is_palindrome(st):
    j = len(st)
    for i in range(len(st)):
        j -= 1
        while st[i].isalpha() == False:
            i += 1
        while st[j].isalpha() == False:
            j -= 1
        if i < j :
            if st[i].lower() != st[j].lower():
                return False
        else:
            break
    return True

def menu_check_palindrome():
    OG = get_phrase() 
    if  is_palindrome(OG):
        print(OG, "is a palindrome")
    else:
        print(OG, "is not a palindrome")

def make_palindrome(st, yes_no_input):
    for j in range(len(st) -1,-1,-1):
        if yes_no_input == True:
            if j > 0 :
                st = st + st[j-1]
        else:
            st = st + st[j]
    return st

def get_repeat_last():
    keep_going = True
    while keep_going:
        yes_no_input = input("Enter y or n if you want to add the last letter of your phrase: ")
        if yes_no_input == "y":
            return True
        elif yes_no_input == "n":
            return False
        else:
            print("Invalid Answer")

def menu_make_palindrome():
    phrase_that_pays = get_phrase()
    re_peat_peat = get_repeat_last()   
    new_and_improved = make_palindrome(phrase_that_pays, re_peat_peat)
    print("Before: ",phrase_that_pays," After: ",new_and_improved )


def main():
    keep_going = True
    while keep_going:
        print_menu()
        menu_choice = get_menu_choice()
        if menu_choice == "1":
            menu_check_palindrome()
        elif menu_choice == "2":
            menu_make_palindrome()
        elif menu_choice == "3":
            keep_going = False

main()


        
    


                
            


