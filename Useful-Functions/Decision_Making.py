def keepGoingDecision():
    """
    Gets user's decision to repeat the current program and return a boolean.
    """
    while 1:
        decision = input("\nGo again? Y or N\n\tYour Choice: ")
        if decision=='y' or decision=='Y':
            return True
        elif decision=='n' or decision=='N':
            return False
        else:
            print("Sorry invalid input!!")

def pickOption(array, picked):
    """
    Function to return a valid user picked value option if it is within *array*. Else return False.
    """
    if picked in array:
        return picked
    else:
        return False