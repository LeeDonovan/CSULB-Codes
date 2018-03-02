import turtle

def drawBar(t, height):
    """ Get turtle t to draw one bar, of height. """
    t.begin_fill()          # start filling this shape
    t.left(90)              # turn left 90 degree
    t.forward(height)       # move forward for a distance = height
    t.write(str(height))    # write height
    t.right(90)             # turn right 90 degree
    t.forward(40)           # move forward for a distance = 40
    t.right(90)             # turn right 90 degree
    t.forward(height)       # move forward for a distance = height
    t.left(90)
    t.end_fill()            # stop filling this shape

xs = [48, 117, 200, 240, 160, 260, 220]     # data to be graphed
maxheight = max(xs)         # maximum height of bars in data
numbars = len(xs)           # determine number of bars to be drawn
border = 10                  # for border

wn = turtle.Screen()
wn.setworldcoordinates(0-border, 0-border, 40*numbars+border, maxheight+border)
wn.bgcolor("lightgreen")

tess = turtle.Turtle()      # create tess and set some attributes
tess.color("blue")
tess.fillcolor("red")
tess.pensize(3)

for i in xs:
    drawBar(tess, i)

wn.exitonclick()


