print("Main Menu:")
print("1. Cost of Gas")
print("2. Used Value")
print("3. Stopping Distance")
print("4. Quit")
user_input = input("Choose a menu to go to: ")
while 0 < user_input <= 4:
    if user_input == 1:
        keep_going = True
        while (keep_going == True):
             car1_mileage = input("Enter Car 1's mileage: ")
             car1_gas = input("Enter an average fuel cost per gallon for Car 2: ")
             car2_mileage = input("Enter Car 2's mileage: ")
             car2_gas = input("Enter an average fuel cost per gallon for Car 2: ")
             days_in_months = 30
             car1_mpg = car1_mileage/car1_gas
             car1_monthly_distance = car1_mpg * days_in_months
             print("{0:.2f}".format(car1_monthly_distance))
             
             
            
    elif user_input == 2:
        print("I got 2")

    elif user_input == 3:
        print("I got 3")
    
    elif user_input == 4:
        print("I got 4")
    
    else:
        if user_input != range(0,5):
            print("Invalid Menu Option!")
            user_input = int(input("Choose a correct Menu: "))
        