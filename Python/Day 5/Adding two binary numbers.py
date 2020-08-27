"""Adding two binary numbers"""

print("For closing the program type(for both numbers): Null")
def Binary(a, b):
    i1=int(a,2)
    i2=int(b,2)
    s=bin(i1+i2)
    print("\nAfter adding",s)
while(True):
    a = input("Please Enter any Number: ")
    b = input("Please Enter any Number: ")
    if a=="Null" and b=="Null":
        print("Program closed")
        break
    else:
        Binary(a, b)