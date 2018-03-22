# x= "Bippitty Boppity Boo"
# y = x.index('i')

# print (y)
# print("\n")


# #Count how many words are in a string using spaces as an indicator of seperating words
# ##For example, "Hello 123 !!!" has 3 words.
# #~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#
# def countWords(x):
#     x = x.split(" ")
#     return len(x)
#     # count = 0
#     # count_space = 0
#     # for i in x:
#     #     if i == " ":
#     #         count_space += 1
#     #     else:
#     #         count += 1
#     #     y = count // count_space
#     # return y

# user_input = input("Enter: ")
# z = countWords(user_input)
# if z > 1:
#     print(z)
# else:
#     print("one")
        

#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#

def magic2(x,y):
    x = x * 2
    y = x + y
    return y

def magic(y):
    print(y)
    z = magic2(y, y)
    return z

def main():
    y = 5
    z = magic(y)
    print(z-y)

main()

#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#

#One if statement
## x needs to be a multiple of 3 or
## y needs to be less than or equal to x or
## x needs to be between the z range of 1, 10

x = 12
y = 12
z = (0,11)
if (x // 3) == 0 or x >= y or x in range(z):
    print ("True")
else: 
    print("False")

