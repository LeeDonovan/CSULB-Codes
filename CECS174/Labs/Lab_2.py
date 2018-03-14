import math 

user_input_kilograms = float(input("How much kilograms of gunpowder would you like to use for the cannon: "))#Get how much kilos you want to shoot
user_input_degree = float(input("What degree would you like that isn't greater than 90 degrees: "))#Find a degree to use
gravity = 9.8
kilograms_of_gunpowder = user_input_kilograms * 10 #Finds initial velocity

degrees_to_radians = user_input_degree * math.pi/180 #Convert degrees to radian using user degree


velocity_y = kilograms_of_gunpowder * math.sin(degrees_to_radians)#Find y and x component velocity

velocity_x = kilograms_of_gunpowder * math.cos(degrees_to_radians)

time_apex = velocity_y/gravity #Find time it took
time_gravity = time_apex * 2
distance = velocity_x * time_gravity #Find how far it went
print("Your shot landed", "{0:.2f}".format(distance), "away.")