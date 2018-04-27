import math
rock1_m = 5
rock1_x_i=3200
rock1_y_i=-2700
rock1_z_i=1800
rock1_x_f=2800
rock1_y_f=-2200
rock1_z_f=2300
rock1_i_v = math.sqrt((rock1_x_i**2)+(rock1_y_i**2)+(rock1_z_i**2))
rock1_f_v = math.sqrt((rock1_x_f**2)+(rock1_y_f**2)+(rock1_z_f**2))
P2_x = rock1_m*(rock1_x_i-rock1_x_f)
P2_y = rock1_m*(rock1_y_i-rock1_y_f)
P2_z = rock1_m*(rock1_z_i-rock1_z_f)
print(P2_x, P2_y, P2_z)
KEi_x = rock1_m*(rock1_x_i**2)
KEi_y = rock1_m*(rock1_y_i**2)
KEi_z = rock1_m*(rock1_z_i**2)
KEi = .5*(KEi_x+KEi_y+KEi_z)
print(KEi)
KEf_x = rock1_m*(rock1_x_f**2)
KEf_y = rock1_m*(rock1_y_f**2)
KEf_z = rock1_m*(rock1_z_f**2)
KEf = .5*(KEf_x+KEf_y+KEf_z)
print(KEf)
KE_total = KEi - KEf
print(KE_total)
TE = 4.90*(10**2)
K2f = KE_total - TE
print(K2f)
