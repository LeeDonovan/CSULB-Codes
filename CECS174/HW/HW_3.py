import musicbox

my_music = musicbox.MusicBox()
note_letters = ['C', 'D', 'E', 'F', 'G', 'A', 'B']
note_numbers = [60, 62, 64, 65, 67, 69, 71]
major_scale_intervals = [2, 2, 1, 2, 2, 2, 1]
minor_scale_intervals = [2, 1, 2, 2, 1, 2, 2]


def note_to_int(note):
    for i in range(len(note_letters)): # Goes through the list for note_letters to check if string user inputted has one of those letters.
        if note[0] == note_letters[i]:
            if len(note) > 1:
                if (note[1] == '#' and note[0] != 'E' and note[0] != 'B'): # It needs a '#' and can not have an E or B b/c they don't exist
                    return note_numbers[i] + 1 #If a valid note then will pass and add one to the number
                if (note[1] == 'b' and note[0] != 'C' and note[0] != 'F'): # needs a 'b' and can not have a a C and F b/c they don't exist
                    return note_numbers[i] - 1#If valid then will pass and subtract one to the number
                return -1
            return note_numbers[i]
    return -1 # if the note the user inputted does not exist then it will return a -1

def get_notes():
    note = [] #Empty list for user inputs
    user_sequence = input('Input a sequence of notes: ')
    sequencer = user_sequence.split() # Splits notes with white spaces if not will return invalid or -1
    for i in sequencer:
        error = note_to_int(i) #Goes to other function to check if valid
        if error != -1:
            note.append(error)
    return note


def play_notes(notes):
    for i in notes: #Will go through a returned value and play it
        my_music.play_note(i, 500)


def menu_play_notes():
    new_notes = get_notes()
    if not new_notes: #Needs to be valid note or will not pass
        print("I don't know any of these notes.")
    else:
        play_notes(new_notes)


def note_to_scale(note, type):
    scalar = [] #New list to be appened
    scalar.append(note)
    if type == "major": #Checks for a major when split
        for i in major_scale_intervals:
            note -= i #Tells how to increment
            scalar.append(note)
    if type == "minor": # checks for a minor when split
        for j in minor_scale_intervals:
            note += j# Tells how to increment
            scalar.append(note)
    return scalar


def get_scale():
    choose_one = True
    while choose_one:
        user_input = input("Enter a note then a scale with a space. '(ie. C# major)': ")
        splitpusher = user_input.split()
        if len(splitpusher) == 2: #Checks if when split len is 2 for a note and a type.
            if note_to_int(splitpusher[0]) < 0:
                print("Invalid Note!")
                continue #Will continue process of user inut if not valid
            if splitpusher[1] != "major" and splitpusher[1] != "minor":
                print("Invalid Scale!")
                continue #Will continue the process of user input if not valid
            return user_input
        else:
            print("Invalid Format!\n")


def play_scale(scale):
    for i in scale: #gets string and plays through
        my_music.play_note(i, 500)


def menu_play_scale():
    big_scale = get_scale()#Set as a variable to be used later
    big_scale = big_scale.split()#Splits the user input
    scale_interger = note_to_scale(note_to_int(big_scale[0]), big_scale[1])#Takes in two parameters from functions and the variable
    play_scale(scale_interger)#Uses the variable above to play


def print_menu():
    print("Main Menu")
    print("1. Play notes")
    print("2. Play Scale")
    print("3. Quit")


def get_menu_choice():
    right_choice = True
    while right_choice:
        user_input = input("Choose a Menu: ")#Ask user to choose a menu
        if user_input == '1' or user_input == '2' or user_input == '3':
            return user_input
        else:#If not 1 2 or 3 then will not pass
            print('Invalid Menu Option!')


def main():
    keep_going = True
    while keep_going:
        print_menu()
        menu_choice = get_menu_choice()
        if menu_choice == '1':
            menu_play_notes()
        if menu_choice == '2':
            menu_play_scale()
        if menu_choice == '3':
            print("Goodbye....")
            keep_going = False


main()
my_music.close() #Closes music box when done with main


