def main():
    keep_going = True
    while keep_going:
        placing = ["United States","Sweden","Switzerland","Canada","Great Britain","Norway","South Korea","Japan","Italy","Denmark"]
        user_input = input("Input a Country Name: ")
        rank = 0
        if user_input == "Quit":
            keep_going = False
        else:
            for i in placing:
                rank += 1
                #print(i[0:], rank)
                if user_input == i[0:]:
                    print (user_input,"placed", rank)
                    break
                if user_input :
                    print(user_input, "did not compete.")


            
        
main()