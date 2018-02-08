# File name: Draw_LineGraph.py
# Author: Shui Lam

# Draw a line graph of data randomly generated in a given range

import turtle
import random

def drawLineGraph(t, x, y):
    """ Get turtle t to move to coordinate (x, y). """
    if x == 0:              # for the first point, 
        t.up()              # pick up turtle pen
        t.goto(x, y)        # before moving to that point
        t.write(" "+str(y))
        t.down()            # keep turtle pen down for all other points
    t.goto(x,y)              
    t.write(" "+str(y))     # write height of point

# numpoints = 20              # specify number of points to plot
# maxheight = 100             # maximum height of points
# border = 10                 # space for border

# wn = turtle.Screen()
# wn.setworldcoordinates(0-border, 0, 20*numpoints+border, maxheight+border)
# wn.bgcolor("lightgreen")

# tess = turtle.Turtle()      # create tess and set some attributes
# tess.color("blue")
# tess.pensize(2)

# for i in range(numpoints):
#     h = random.randint(1, maxheight)
#     drawLineGraph(tess, i*20, h)

# wn.exitonclick()


