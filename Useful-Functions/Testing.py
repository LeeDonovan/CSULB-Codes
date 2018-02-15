# Add Useful-Functions path for Window Machines below
sys.path.append('C:/Users/Aingty/Documents/GitHub Repositories/CECS-328-Data-Algorithms/Useful-Functions')
# Add Useful-Functions path for Mac Machines below
sys.path.append('/Users/Aingty/Applications/GitHub Repositories/CECS-328-Data-Algorithms/Useful-Functions')

from Decision_Making import *
keepGoing = True

array = ['1', '2', '3']
while(keepGoing):
    userInput = input("Please choose one of the following option:\n\t1. Test\n\t2. Test\n\t3. Test\nYour Input: ")
    keepGoing1 = pickOption(array, userInput)
    if keepGoing1 != False:
        print("success")
        keepGoing = False
    else:
        print("Invalid Option!")