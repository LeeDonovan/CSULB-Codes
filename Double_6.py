# File name: Double_6.py
# Author: Shui Lam

# This program simulates the rolling of two dice for a double-6
# Shows a function that returns value

import random

# Constants for the minimum and maximum random numbers
MIN = 1
MAX = 6

def roll():
    # Start a counter for the number of rolls
    count = 0
    # Create a variable to control the loop
    win = False
    # Simulate rolling of the dice
    while win != True:
        count = count + 1
        outcome1 = random.randint(MIN, MAX)
        outcome2 = random.randint(MIN, MAX)
#        print(outcome1, outcome2)

        # Do another roll of the dice?
        if outcome1 == 6 and outcome2 == 6:
            win = True

    return count

# Call the main function
def main():
    max_games = 100
    count = 0
    for i in range(max_games):
        count = count + roll()
    average = count/max_games
    print("Average number of rolls to get a double-6 is ", average)
    print (range(max_games))
# Call the main function
main()
        
              
