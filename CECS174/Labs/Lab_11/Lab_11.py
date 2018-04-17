def main():
    placings = {"Team Liquid" : (1, 100000), "100 Thieves" : (2, 50000), "Echo Fox" : (3, 30000), "Clutch Gaming" : (4, 20000), "Cloud 9" : (5, 0), "Team SoloMid": (5, 0)}
    keep_going = True
    while keep_going:
        team_name = input("Please enter a team name or type 'quit': ")
        if team_name == "quit":
            keep_going = False
        else:
            if team_name in placings:
                if placings[team_name][1] == 0:
                    print(team_name, "placed", placings[team_name][0])
                else:
                    print(team_name, "placed", placings[team_name][0], "($", placings[team_name][1], ")") 



main()
