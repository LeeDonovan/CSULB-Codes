import math
car = 1900
truck = 5100
car_v = 45
truck_v_x = -22
truck_v_z = 18
total_v_x = ((car*car_v)+(truck*truck_v_x))/(car+truck)
total_v_y = 0
total_v_z = ((car*0)+(truck*truck_v_z))/(car+truck)
print("v =",total_v_x, total_v_y, total_v_z)
magnitude_car = math.sqrt(car_v**2)
magnitude_truck = math.sqrt((truck_v_x**2)+(truck_v_z**2))
magnitude_total = math.sqrt((total_v_x**2)+(total_v_y**2)+(total_v_z**2))
KE_car = .5*car*(magnitude_car**2)
KE_truck = .5*truck*(magnitude_truck**2)
KE_initial = KE_car + KE_truck
KE_final = .5*(car+truck)*(magnitude_total**2)
KE_total = KE_initial - KE_final
print(KE_total)

