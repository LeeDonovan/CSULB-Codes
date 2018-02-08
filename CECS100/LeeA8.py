import turtle
import random
candFile = open("Candidates.txt", 'r')
numCandidates = int(candFile.readline()) #get number of candidates
print("Number of candidates = ", numCandidates)

candidates = [[], []] # a list of lists of candidates in the two districts
for aLine in candFile: # get names of candidates in the two districts
    nameLine = aLine.split()
    if int(nameLine[0]) == 1: # candidate of district 1
        candidates[0]= candidates[0] + [nameLine[1]] #add name to district 1
    else:                       # candidate is in district 1
        candidates[1] = candidates[1] + [nameLine[1]] #add name to district 2
# list of votes for candidates in the 2 districts, in votes as a list of lists
votes = [ [0]*len(candidates[0]), [0]*len(candidates[1])]
print ("Number of candidates in District 1: ", len(candidates[0]))
print(candidates[0])
print ("Number of candidates in District 2: ", len(candidates[1]))        
print(candidates[1])


D1 = -1

ThePeople = open("Ballots.txt", 'r')  # read ballot
PeopleText = ThePeople.read()
for i in candidates:                  
    D1 += 1
    D2 = -1
    Sum_of_a_District = 0           # 
    for j in i: 
        D2 += 1
        votes[D1][D2] = PeopleText.count(j)               # go through candidate list and count how many times a candidates name appears and add it into votes list
        Sum_of_a_District = Sum_of_a_District + PeopleText.count(j)
    for x in range(D2+1):
        votes[D1][x] = votes[D1][x]/Sum_of_a_District*100
        print ((candidates[D1][x]), "=", "%.1f"%votes[D1][x])


def drawBar(t, height, n):
    """ Get turtle t to draw one bar, of height. """
    t.begin_fill()          # start filling this shape
    t.left(90)              # turn left 90 degree
    t.forward(height)       # move forward for a distance = height
    t.write( "%s = %.1f%s"%(n,height,"%"),font = ("Arial", 13, "normal"))    # write name and percentage of candidate and change font size     
    t.right(90)             # turn right 90 degree
    t.forward(40)           # move forward for a distance = 40
    t.right(90)             # turn right 90 degree
    t.forward(height)       # move forward for a distance = height
    t.left(90)
    t.end_fill()            # stop filling this shape

xs = votes  # data to be graphed
maxheight = 100         # maximum height of bars in data
numbars = len(aLine)-2           # determine number of bars to be drawn
border = 10                  # for border

wn = turtle.Screen()
wn.setworldcoordinates(0-border, 0-border, 40*numbars+border, maxheight+border)
wn.bgcolor("lightgreen")
differ = ["red","green"]
tess = turtle.Turtle()      # create tess and set some attributes
tess.color("blue")
tess.fillcolor("red")
tess.pensize(3)
D1 = -1
print ("------------------------------------------")             #Create a table 
print ("|District \t| Candidate \t| Votes  |")
print ("------------------------------------------")
for i in candidates:
    D1 += 1
    D2 = -1
    tess.color(differ[D1])
    tess.fillcolor(differ[D1])
    Sum_of_a_District = 0
    for j in i:                                 #repeats steps for creating a table 
        D2 += 1
        drawBar(tess, votes[D1][D2], candidates[D1][D2])
        print ("|\t%s \t| %s \t| %.1f\t%s|" %(D1+1,candidates[D1][D2], votes[D1][D2],"%"))            # Adds District then name of candidate and then vote
        print ("------------------------------------------")
wn.exitonclick()


