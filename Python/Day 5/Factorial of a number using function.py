"""factorial of a number using function"""
def factorial (n):
    f=1
    for i in range (1,n+1):
        f=f*i
    print("The factorial of the number will be: ",f)
factorial(6)
factorial(20)