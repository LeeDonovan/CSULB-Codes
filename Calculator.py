import math
Be = 2.4*(10**-8)
r =[50,60,70,80,90,100,110,120,130,140] #(mm)
theta =[115,110,100,90,80,70,60,50,45,35] #(0)
for i in range(r):
    print(Be*(math.tan(theta[i])))
