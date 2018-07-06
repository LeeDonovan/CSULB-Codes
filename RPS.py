import random
import time
rps = {"rock":1, "paper":2,"scissor":3}
rps_list = list(rps)

def intro():
    print("WELCOME TO")
    print("ROCK")
    print("PAPER")
    print("SCISSORS")
def leggo():
    user_input = input("Wanna play a game? Y/N: ")
    nah = user_input.upper()
    return nah

def let_the_games_begin():
    print("Ok lets play a little game of rock paper scissors")
    time.sleep(1)
    print("On shoot we go ok!\n")
    time.sleep(1)
    print("ROCK")
    time.sleep(1)
    print("PAPER")
    time.sleep(1)
    print("SCISSORS")
    time.sleep(1)
    print("SHOOT")
def choose_your_weapon():
    infinite = True
    while infinite:
        what = input("What do you choose rock paper or scissor?: ")
        small = what.lower()
        if small == "rock" or small == "paper" or small == "scissor":
            infinite = False
    return what



def bots_hack():
    hacks = random.choice(["rock","paper","scissor"])
    return hacks

def the_big_fight(x):
    gg = rps_list.index(x)
    return gg

def main_menu():
    win_counter = 0
    bot_wins = 0
    ties = 0
    intro()
    keep_going = True
    while keep_going:
        a = leggo()
        if a == "Y":
            let_the_games_begin()
            dude = choose_your_weapon()
            xd = bots_hack()
            b = the_big_fight(dude)
            c = the_big_fight(xd)
            if b == 0 and c == 2:
                print("Wow you won!!!", dude,"beat ",xd)
                win_counter = win_counter+ 1
                print("Score is now ")
                time.sleep(1)
                print("-------------------")
                print("|   Wins   |   ", win_counter, "|")
                print("|   Ties   |   ", ties, "|")
                print("|   Bots   |   ", bot_wins, "|")
                print("-------------------")

            elif b == c:
                ties = ties + 1
                print("Amazing you guys matched",dude,"tied with",xd)
                print("Score is now ")
                time.sleep(1)
                print("-------------------")
                print("|   Wins   |   ", win_counter, "|")
                print("|   Ties   |   ", ties, "|")
                print("|   Bots   |   ", bot_wins, "|")
                print("-------------------")
            elif b == 0 and c == 1:
                print("LOL you lost!!!", xd, "beats ", dude)
                bot_wins = bot_wins + 1
                print("Score is now ")
                time.sleep(1)
                print("-------------------")
                print("|   Wins   |   ", win_counter, "|")
                print("|   Ties   |   ", ties, "|")
                print("|   Bots   |   ", bot_wins, "|")
                print("-------------------")
            elif b == 1 and c == 0:
                print("Wow you won!!!", dude, "beat ", xd)
                win_counter = win_counter + 1
                print("Score is now ")
                time.sleep(1)
                print("-------------------")
                print("|   Wins   |   ", win_counter, "|")
                print("|   Ties   |   ", ties, "|")
                print("|   Bots   |   ", bot_wins, "|")
                print("-------------------")
            elif b == 1 and c == 2:
                print("LOL you lost!!!", xd, "beats ", dude)
                bot_wins = bot_wins + 1
                print("Score is now ")
                time.sleep(1)
                print("-------------------")
                print("|   Wins   |   ", win_counter, "|")
                print("|   Ties   |   ", ties, "|")
                print("|   Bots   |   ", bot_wins, "|")
                print("-------------------")
            elif b == 2 and c == 1:
                print("Wow you won!!!", dude, "beat ", xd)
                win_counter = win_counter + 1
                print("Score is now ")
                time.sleep(1)
                print("-------------------")
                print("|   Wins   |   ", win_counter, "|")
                print("|   Ties   |   ", ties, "|")
                print("|   Bots   |   ", bot_wins, "|")
                print("-------------------")
            elif b == 2 and c == 0:
                print("LOL you lost!!!", xd, "beats ", dude)
                bot_wins = bot_wins + 1
                print("Score is now ")
                time.sleep(1)
                print("-------------------")
                print("|   Wins   |   ", win_counter, "|")
                print("|   Ties   |   ", ties, "|")
                print("|   Bots   |   ", bot_wins, "|")
                print("-------------------")

        elif a == "N":
            print("wow ok")
            keep_going = False
        else:
            print("Didn't catch that sorry!")



main_menu()


