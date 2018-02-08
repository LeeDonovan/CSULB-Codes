import random
import turtle

def drawLineGraph(t, x, y):
    """ Get turtle t to move to coordinate (x, y). """
    if x == 0:              # for the first point, 
        t.up()              # pick up turtle pen
        t.goto(x, y)        # before moving to that point
        t.write(" "+str(y))
        t.down()            # keep turtle pen down for all other points
    t.goto(x,y)              
    t.write(" "+str(y))     # write height of point


def drawCard():
    win = False  
    count = 0
    while (win != True):                                              
        count+=1 
        Cards = random.randint(1, 13)
        Suites = random.randint(1, 4)       # 13 is King and 1 is Heart
        if Cards == 13 and Suites == 1:
            win = True
    return count 


max_games = int(input("Please enter a number of games you want to play? \n\t"))
numpoints = max_games              # specify number of points to plot from user input
maxheight = 400           # maximum height of points
border = 1                # space for border
wn = turtle.Screen()
wn.setworldcoordinates(0-border, 0, 20.5*numpoints+border, maxheight+border)
wn.bgcolor("white")
t = turtle.Turtle()
t.color("red")
t.pensize(2)
for i in range(max_games):
    drawLineGraph(t,(i)*20,drawCard())
wn.exitonclick()
