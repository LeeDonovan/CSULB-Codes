keep_going = True
while (keep_going):
    door_opens = True
    #Choose a Main Menu to go to
    print("Main Menu:")
    print("1. Cost of Gas")
    print("2. Used Value")
    print("3. Stopping Distance")
    print("4. Quit")
    user_input = input("Choose a menu to go to: ")
    if user_input == "" or user_input == 0: #If user returns a space it will be invalid
        door_opens = False
        print("\n")
        print("Invalid Value!\n")
    else:
 
    # Validating user input
        for i in user_input:
            if i.isdigit()== False: #Checks if user input has only numbers
                print("\n")
                print("Invalid Input\n")
                door_opens = False
                break

   #^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Body~Guard^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^#
    
    if door_opens:
        user_input = int(user_input)
        Car_test = True
        while (Car_test):
            if 0 < user_input <= 4: #Looks for only user input values of 1-4
                if user_input == 1:
                    print("Cost of Gas\n")
                    car1_mileage = input("Enter Car 1's mileage: ")
                    car1_gas = input("Enter an average fuel cost per gallon for Car 1: ")
                    car1_distance = input("Enter a distance travelled for Car 1: ")
                    car2_mileage = input("Enter Car 2's mileage: ")
                    car2_gas = input("Enter an average fuel cost per gallon for Car 2: ")
                    car2_distance = input("Enter a distance travelled for Car 2: ")


     ######################################################################################################


                    if  car1_gas == "" or car1_mileage== "" or car2_gas== "" or car2_mileage == "" or car1_distance == "" or car2_distance == "": #Checks for spaces
                        print("Invalid")
                        door_opens = False
                    else:
                        door_opens = True
                        for i in (car1_gas + car1_mileage + car2_gas + car2_mileage + car1_distance + car2_distance):
                            if i.isdigit() == False:#Checks if there are anything besides digits
                                print("Invalid")
                                door_opens = False
                                break
                            
                            

#^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Body~Guard^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^#
                        
                    if door_opens:  
                        print("\n")      
                        #Converts to integers from strings
                        car1_gas = int(car1_gas)
                        car1_mileage = int(car1_mileage)
                        car1_distance = int(car1_distance)
                        car2_gas = int(car2_gas)
                        car2_mileage = int(car2_mileage)
                        car2_distance = int(car2_distance)
                        car1_cost = (car1_gas/car1_mileage)*(car1_distance*12)
                        car2_cost = (car2_gas/car2_mileage)*(car2_distance*12)
                        print("Car 1 will cost $","{0:.2f}".format(car1_cost),"per year.")
                        print("Car 2 will cost $","{0:.2f}".format(car2_cost),"per year.")
                        print("\n")
                        if car1_cost > car2_cost:
                            print("Car 2 is cheaper by $", "{0:.2f}".format(car1_cost - car2_cost)) #Checks if car1 is > car2
                            #Checks if car 1 = car2 price
                        elif car1_cost == car2_cost:
                            print("Both cars cost the same! WOW!")
                            #Checks if car1 is < car2
                        else:
                            print("Car 1 is cheaper by $", "{0:.2f}".format(car2_cost - car1_cost))
                        Car_test = False

    ######################################Menu1#########################################################
                elif user_input == 2: 
                    print("Used Value\n")
                    door_opens = True
                    if door_opens:
                        car_price = input("Enter a car price without a $: ")
                        car_years = input("Enter many years to track cars value: ")
                        if  car_price == "" or car_years == "":
                            print("Invalid")
                            door_opens = False
                        else:
                            door_opens = True
                            for i in (car_price + car_years):
                                if i.isdigit() == False and i !=".":#Checks for numbers AND decimals (.)
                                    print("Invalid")
                                    door_opens = False
                                    break
                                    
                        if door_opens:            
                            car_price = float(car_price)
                            car_years = float(car_years)
                            years = 0
                            depreciation = .18
                            if car_years >= years:
                                for i in range(int(car_years)):  #Iterates how many times car years is inputted 
                                    years = years + 1                          
                                    car_downgrade = car_price * depreciation
                                    car_price = car_price - car_downgrade
                                    print ("Year",years,"value: ${0:.2f}".format(car_price))
                                Car_test = False
                                            

                                        
                elif user_input == 3:
                    print("Stopping Distance\n")
                    door_opens = False
                    while door_opens == False: #Wants to see if any values being checked will trigger the if statements to be False still
                        door_opens = True
                        car_speed = input("What is the car's initial speed: ")
                        car_tires = input("What is the condition of your tire:\n\t1 meaning new\n\t2 meaning good\n\t3 meaning poor \n")  
                        if car_speed == "" or car_tires == "":
                            door_opens = False
                            print("Invalid")
                        else:
                            for i in car_speed:
                                if i.isdigit() == False and i !=".":
                                    door_opens = False
                                    print("Invalid")    
                                    break
                            if door_opens:#Checks if statement above is true if not then while loop will continue
                                if car_tires == "1" or car_tires == "2" or car_tires == "3":
                                    door_opens = True
                                else:
                                    print("Wrong Value")
                                    door_opens = False

                    print("\n")
                    if door_opens:#Checks for tires of 1, 2, or 3 of user input
                        car_speed = int(car_speed)
                        if car_tires == "1": #Checks for new tires
                            feet_per_second = (car_speed*5280)/3600 #MPH to FPS conversion
                            new_tire = 0.8
                            gravity = 32.174
                            denominator = 2*new_tire*gravity
                            numerator = feet_per_second**2
                            distance = numerator/denominator
                            print ("At",car_speed,"miles per hour with new tires, the car will stop at {0:.2f}".format(distance),"feet.")
                            Car_test = False
                        elif car_tires =="2":
                            feet_per_second = (car_speed*5280)/3600
                            good_tire = 0.6
                            gravity = 32.174
                            denominator = 2*good_tire*gravity
                            numerator = feet_per_second**2
                            distance = numerator/denominator
                            print ("At",car_speed,"miles per hour with new tires, the car will stop at {0:.2f}".format(distance),"feet.")
                            Car_test = False
                        
                        elif car_tires == "3":
                            feet_per_second = (car_speed*5280)/3600
                            poor_tire = 0.5
                            gravity = 32.174
                            denominator = 2*poor_tire*gravity
                            numerator = feet_per_second**2
                            distance = numerator/denominator
                            print ("At",car_speed,"miles per hour with new tires, the car will stop at {0:.2f}".format(distance),"feet.")
                            Car_test = False


                elif user_input == 4:#Quits the program
                    print("Goodbye!")
                    keep_going = False 
                    Car_test = False                      
                    

                else:
                    print("Invalid Number Input\n")
                print("\n")

                
            else:
                print("Wrong Menu!\n")
                
                break

            
            
            

        