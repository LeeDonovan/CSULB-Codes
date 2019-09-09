def q1():
    s2m = 60
    m2h = 60
    h2d = 24
    d2y = 365
    y2c = 100
    return (s2m * m2h * h2d * d2y * y2c)

def q2():
    num = 5789248
    den = 6
    return (num%den)

def q3():
    num = 5789248
    den = 6
    q = num//den
    p = q*den
    return (num - p)

def main():
    sIc = q1()
    print("Seconds to Centuries is: ", sIc)
    remainWmod = q2()
    print("Remainder with mod is : " , remainWmod)
    remainWOmod = q3()
    print("Remainder w/o mod: ", remainWOmod)

main()