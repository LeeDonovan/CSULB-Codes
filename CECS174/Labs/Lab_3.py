interstate = int(input("Please enter the number of a US Interstate Route: "))
         


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






















    
