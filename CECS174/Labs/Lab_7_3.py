def function1(x):
    x = x*2
    return x
def function2(x):
    x = 5
    y = function1(x)
    return x*y
def main():
    x = 10
    x = function2(x)
    print(x)

main()