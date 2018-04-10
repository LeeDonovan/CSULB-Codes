print("(0) ([1]): (2) AB, (3) HR")


for player in all_players:
    search_name = input("Enter a Player's name: ")
    (name, team, ab, hr) = player
    if name == search_name:
        print(player)