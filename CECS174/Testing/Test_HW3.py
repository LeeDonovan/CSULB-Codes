import musicbox

my_music = musicbox.MusicBox()
note_letters = ['C', 'D', 'E', 'F', 'G', 'A','B']
note_numbers = [60, 62, 64,65,67,69,71]
major_scale_intervals = [2,2,1,2,2,2,1]
minor_scale_intervals = [2,1,2,2,1,2,2]


def note_to_int(note):
    
    for i in range(len(note_letters)):
        if note[0] == note_letters[i]:
            if len(note) > 1:
                if (note[1] == '#' and note[0] != 'E' and note[0] != 'B'):
                    return note_numbers[i]+1
                if (note[1] == 'b' and note[0] != 'C' and note[0] != 'F'):
                    return note_numbers[i]-1
                return -1
            return note_numbers[i]
            
def get_notes():
    note = []
    user_sequence = input('Input a sequence of notes: ')
    sequencer = user_sequence.split()
    for i in sequencer:
        error = note_to_int(i)
        if error != -1:
            note.append(note_to_int(i))
    return note

def play_notes(notes):
    for i in notes:
        my_music.play_note(i, 500)


def menu_play_notes():
    new_notes = get_notes()
    if not new_notes:
        print("I don't know any of these notes.")
    else:
        play_notes(new_notes)

    

def note_to_scale(note, type):
    scalar = []
    scalar.append(note)
    if type == "major":
        for i in major_scale_intervals:
            note += i
            scalar.append(note)
    if type == "minor":
        for j in minor_scale_intervals:
            note-=j
            scalar.append(note)
    return scalar

def get_scale():
    choose_one = True
    while choose_one:
        user_input = input("Enter a note then a scale with a space. '(ie. C# major)': ")
        splitpusher = user_input.split()
        if len(splitpusher) == 2:
            if note_to_int(splitpusher[0]) < 0:
                print ("Invalid Note!")
                continue
            if splitpusher[1] != "major" or splitpusher[1] != "minor":
                print("Invalid Scale!")
                continue
            return user_input
        else:
            print("Invalid Format!\n")

def play_scale(scale):
    for i in scale:
        my_music.play_note(i,500)

def menu_play_scale():
    big_scale = get_scale()
    big_scale = big_scale.split()
    scale_interger = note_to_scale(note_to_int(big_scale[0]),big_scale[1])
    my_music.play_scale(scale_interger)

        

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
my_music.close()