import math
mA = 10
mB = 13
PA_i = math.sqrt((19**2)+(8**2)+(0**2))
print(PA_i)
KA_i = (.5*(PA_i**2))/mA
print(KA_i)
PB_i = math.sqrt((6**2)+(5**2)+(0**2))
print(PB_i)
KB_i = .5*(PB_i**2)/mB
print(KB_i)
PA_f = math.sqrt((16**2)+(3**2)+(0**2))
print(PA_f)
KA_f = .5*(PA_f**2)/mA
print(KA_f)
PB_f = math.sqrt((9**2)+(6**2)+(0**2))
print(PB_f)
KB_f = .5*(PB_f**2)/mB
print(KB_f)
Ksys_i = KA_i + KB_i
print(Ksys_i)
Ksys_f = KA_f+KB_f
print(Ksys_f)


