import turtle
import os

wn = turtle.Screen()
wn.bgcolor("black")
wn.title("Space Invaders")
border_pen = turtle.Turtle()
border_pen.speed(0)
border_pen.color("white")
border_pen.penup()
border_pen.setposition(-300,-300)
border_pen.pendown()
border_pen.pensize(3)
for side in range(4):
    border_pen.fd(600)
    border_pen.lt(90)
border_pen.hideturtle()

player = turtle.Turtle()
player.color("blue")
player.shape("triangle")
player.penup()
player.speed(0)
player.setposition(0,-250)
player.setheading(90)

playerspeed = 15
def move_left():
    x = player.xcor()
    x -= playerspeed
    player.setx(x)
    








delay = input("Press enter to finish")