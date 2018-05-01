import random

number = random.randint(1,100)
tries = 1

uname = input("Hello what is your user name?\n")
print("Hello",uname,".",)
question = input("Would you like to play a game? [Y?N]: ")
if question == 'N':
    print("Oh...okay then")
if question == 'Y':
    print("I'm thinking of a number between 1 & 100.")
    guess = int(input("Take a stab at it: "))
    if guess > number:
        print("Guess a bit lower than that :o")
if guess < number:
    print("Guess higher...")
while guess != number:
    tries += 1
    guess = int(input("Try again: "))
    if guess < number:
        print("Guess Higher bro")
    if guess > number:
        print("A bit to low my dude...")
if guess == number:
    print("Wow {0} are a god at this game xd, took you {1} tries to find {2}. WOW!!".format(uname,tries,number))
    