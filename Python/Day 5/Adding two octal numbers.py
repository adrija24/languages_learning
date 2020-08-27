"""Adding two octal numbers"""

print("For closing the program type(for both numbers): Null")
def Octal(a, b):
    i1=int(a,8)
    i2=int(b,8)
    s=bin(i1+i2)
    print("\nAfter adding",s)
while(True):
    a = input("Please Enter any Number: ")
    b = input("Please Enter any Number: ")
    if a=="Null" and b=="Null":
        print("Program closed")
        break
    else:
        Octal(a, b)