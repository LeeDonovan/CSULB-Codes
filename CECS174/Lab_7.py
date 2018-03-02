year = int(input("Choose a year using 4 digits: "))
if (year % 4) == 0:
    if (year % 100) == 0:
        if (year % 400) == 0:
           print(year, "is a leap year.")
        else:
           print(year, " is not a leap year.")
    else:
       print(year, " is not a leap year.")
else:
   print(year, " is not a leap year.")