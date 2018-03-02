import math

def get_target_distance():
    distance = -100
    while distance < 0 or distance > 1000:
        distance = float(input("Please enter valid distance: "))
    return distance

def get_gunpowder():
    gunpowder = -100
    while gunpowder < 0:
        gunpowder = float(input("Please enter amount of gunpowder: "))
    kg_gunpowder = gunpowder * 10
    return kg_gunpowder

def get_angle():
    angle = 90 
    while angle <= 0 or angle >= 90:
        angle = float(input("Please enter angle: "))  
    angle_in_radians = angle * math.pi/180   #Converts degrees to radians
    return angle_in_radians

def calculate_distance(kg_gunpowder, angle_in_radians):
    gravity = 9.8 
    velocity_y = kg_gunpowder * math.sin(angle_in_radians)
    velocity_x = kg_gunpowder * math.cos(angle_in_radians)
    time_apex = velocity_y / gravity    #Finds half the distance then multiply by 2 for both sides
    final_time = time_apex * 2
    final_distance = velocity_x * final_time
    return final_distance

def is_hit(final_distance, distance):
    if abs(final_distance - distance) <= 1: #Checks if distance is within 1 meter when subtracted
        return True
    else:
        return False

def main():
    keep_going = True
    while keep_going:
        kg_gunpowder = get_gunpowder()
        angle_in_radians = get_angle()
        final_distance = calculate_distance(kg_gunpowder, angle_in_radians)
        distance = get_target_distance()
        hit_up = is_hit(final_distance, distance)
        if hit_up == True:
            print("It's a hit")
            print("You win!!!")
            keep_going = False
        else:
            
            if (final_distance > distance):
                print("Your shot landed", "{0:.2f}".format(abs(final_distance - distance)),"m in ahead of the target.")#If ahead of target
            else:
                print("Your shot landed", "{0:.2f}".format(abs(final_distance - distance)),"m behind of the target.")#If behind target

main()
