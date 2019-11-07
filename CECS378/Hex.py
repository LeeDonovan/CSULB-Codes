filename = 'E:\\Junior\\CECS378\\Ultima_5\\Ultima_5\\SAVED.GAM' #file directory

f = open(filename,"r+b")#allows to read and write in file
####################### Offsets ############################################################################
strength_pos = 14               #offset of strength in the hex editor
intelligent_pos = 15            #offset of intelligence in teh hex editor
dexerity_pos = 16               #offset of dexerity in the hex editor
hp_pos = 18                     #offset of hit points in hex editor
maxhp_pos = 20                  #offset of max hit points in hex editor

###############################################     Functions   #########################################################################################
def menu():
    print("1. Choose a Character to Change")
    print("2. Quit\n")

def character_selection(x):
    x = (x-1)*32#Gets the position of the whatever character user chose 
    #length of one character is 32 so this cycles through every 32
    strength = int(input("Set Strength(99 CAP): "))
    while(strength > 99):
        strength = int(input("Can not go over 99 please reenter STRENGTH: "))
    f.seek(x + strength_pos)#goes to position of character then goes to where position of strenght for that character is
    f.write(strength.to_bytes(1,byteorder='little'))#converts the int to a hex in a length of 1 meaning x00
    
    intelligence = int(input("Set Intelligence(99 CAP): "))
    while(intelligence > 99):
        intelligence = int(input("Can not go over 99 please reenter DEXERITY: "))
    f.seek(x+intelligent_pos)#goes to position of character then goes to where position of strenght for that character is
    f.write(intelligence.to_bytes(1,byteorder='little'))#converts the int to a hex in a length of 1 meaning x00
    
    dexerity = int(input("Set Dexerity(99 CAP): "))
    while(dexerity > 99):
        intelligence = int(input("Can not go over 99 please reenter DEXERITY: "))
    f.seek(x+dexerity_pos)#goes to position of character then goes to where position of strenght for that character is
    f.write(dexerity.to_bytes(1,byteorder='little'))#converts the int to a hex in a length of 1 meaning x00
    
    hp = int(input("Set HitPoints(999 CAP): "))
    while(hp > 999):
        hp = int(input("Can not go over 99 please reenter DEXERITY: "))
    f.seek(x+hp_pos)#goes to position of character then goes to where position of strenght for that character is
    f.write(hp.to_bytes(2,byteorder='little'))#converts the int to a hex in a length of 2 meaning x00\00

    maxhp = int(input("Set Max HitPoints(999 CAP): "))
    while(maxhp > 999):
        maxhp = int(input("Can not go over 99 please reenter DEXERITY: "))
    f.seek(x+maxhp_pos)#goes to position of character then goes to where position of strenght for that character is
    f.write(maxhp.to_bytes(2,byteorder='little'))#converts the int to a hex in a length of 2 meaning x00\00


#####################   MAIN    ################################################################################
loop = True
while(loop):
    menu()#function prints menu
    menu_num = int(input("Select a menu 1-2: "))#ask user for menu number

    if menu_num == 1:
        character_choice = int(input("Select a Character[1-16]: \n"))
        character_selection(character_choice)#goes to function to pick character

    if menu_num == 2:
        print("Breaking the code completed...")#leaves program
        loop = False
