import random


def drawCard():
    win = False  
    count = 0
    while win != True:
        count+=1 
        Cards = random.randint(1, 13)
        Suites = random.randint(1, 4)

        if Cards == 13 and Suites == 1:
            win = True

    return count 
print (drawCard())

    
    
        
    