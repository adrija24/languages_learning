"""Maximum between two numbers using function"""
def max(a,b):
    if a>b:
        print("Maximum number among two numbers: ",a)
    else:
        print("Maximum number among two numbers: ",b)
max(2,-6)
max(5,-5)


"""Maximum between three numbers using function"""
def MAX(x,y,z):
    if x>y and x>z:
        print("Maximum number among three numbers: ",x)
    elif y>x and y>z:
        print("Maximum number among three numbers: ",y)
    else:
        print("Maximum number among three numbers: ",z)
MAX(5, -20, 253)
MAX(-100, 20, -30)