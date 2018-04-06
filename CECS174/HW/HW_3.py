import musicbox

my_music = musicbox.MusicBox()
note_letters = ['C', 'D', 'E', 'F', 'G', 'A','B']
note_numbers = [60, 62, 64,65,67,69,71]
major_scale_intervals = [2,2,1,2,2,2,1]
minor_scale_intervals = [2,1,2,2,1,2,2]

def print_menu():
    print("Main Menu")
    print("1. Play notes")
    print("2. Play Scale")
    print("3. Quit")


def get_menu_choice():
    right_choice = True
    while right_choice:
        user_input = input("Choose a Menu: ")
        if user_input == '1' or user_input == '2' or user_input == '3':
            return user_input
        else:
            print('Invalid Menu Option!')

def note_to_int(note):
    starting_int = -1
    for i in range(len(note_letters)):
        while note_letters[i] ==

def note_to_scale(note, type):

def get_notes():
    notes = []
    user_sequence = input('Input a sequence of notes: ')
    notes = user_sequence.split()

def play_notes(notes):


def menu_play_notes():
    keep_going = True
    while keep_going:
        user_notes = get_notes()
        if user_notes == '':
            print("I don't know any of those notes")
        else:



def main():
    keep_going = True
    while keep_going:
        print_menu()
        menu_choice = get_menu_choice()
        if menu_choice == '1':

        elif menu_choice == '2':

        elif menu_choice == '3':
            keep_going = False



