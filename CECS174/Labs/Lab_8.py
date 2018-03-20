def main():
    interstate_number = (get_interstate_number())
    interstate = abs(int(interstate_number))
         
    if 0 <= interstate < 100: #checks for 1 or two digit
        highway_size = ("") 
        orientation = interstate % 2
        if orientation == 0:
                direction = ("East-West")
        else:
                direction = ("North-South")
        if interstate % 5 == 0:
            highway_size = ("and the size is Long distance")
        print("The highway's orientation is",direction,highway_size)

    else:
        first_digit = interstate // 100 #checks for even or odd number
        even = first_digit % 2
        if even == 0:
                highway_size = ("Circumferential")  #type of branch
        else:
                highway_size = ("Spur") 
        
        interstate1 = interstate % 100    
        print("The highway is",interstate,"and the size is",highway_size, "of the", interstate1)

def get_interstate_number():
    user_input = input("What highway do you want to learn about?\n")
    if user_input.isdigit():
        return (user_input)
    if (user_input.split()[0]) == "Interstate":
        return (user_input[11:])
    else:     
        first_index = user_input.index("I")
        if first_index == 0:
            return user_input[1:]

        if user_input[0:2] == "I-":
            return user_input [3:]






    
main()