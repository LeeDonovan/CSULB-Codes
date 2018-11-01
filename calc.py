import random
bww = 0
sake= 0
for i in range(69):
    food = random.choice(["Sake2Me","BWW"])
    if food == "BWW":
        bww = bww + 1
    else:
        sake = sake + 1

print("BWW: ", bww)
print("Sake2Me: ", sake)

