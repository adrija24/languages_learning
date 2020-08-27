"""Fibonacci series"""

print("For closing the program type(for each numbers): Null")
def Fibonacci(a, b, n):
    print(a)
    print(b)
    for i in range (3, n+1):
        c=a+b
        print(c)
        a=b
        b=c
while(True):
    a = input("Please Enter any Number: ")
    b = input("Please Enter any Number: ")
    n = input("Please Enter the range: ")
    if a=="Null" and b=="Null" and n=="Null":
        print("Program closed")
        break
    else:
        Fibonacci(int(a), int(b), int(n))