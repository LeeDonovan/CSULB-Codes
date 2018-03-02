user_name = input("What is your name? ") #Ask the user what their name is
print("Now please type in some values for the following.")
 # Ask user for integer values instead of floats
Batting = int(input("Add a Batting value: "))
Singles = int(input("Add how many Singles they got: "))
Doubles = int(input("Add how many Doubles they got: "))
Triples = int(input("Add how many Triples  they got: "))
Home_Runs = int(input("Add how many Home Runs they got: "))
#Shows the user what numbers they put in for the values. 
print("They hit",Singles, "singles.")
print("They hit",Doubles, "doubles.")
print("They hit", Triples, "triples.")
print("They hit", Home_Runs, "Home runs.")
#Finds how many hits the player had
Hits = Singles + Doubles + Triples + Home_Runs
#Find the batting average for the player
bat_avg = hits/Batting
#Rounds of to 3 decimal places for Bat Avg
print("{0:.3f}".format(bat_avg))

#Finds the total bases for a player
Total_Bases = Singles + 2*Doubles + 3*Triples + 4*Home_Runs
slg_avg = Total_Bases/Batting
#Rounds up to 3 decimal places for SLG Avg
print("{0:.3f}".format(slg_avg))
on_hit = Singles + Doubles + Triples + Home_Runs

#Prints player stats
print(user_name, "has hit", Hits, "with an average batting of","{0:.3f}".format(bat_avg),"and a", "{0:.3f}".format(slg_avg), "SLG.")
