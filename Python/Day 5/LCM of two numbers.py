"""LCM of two numbers"""

print("For closing the program type(for both numbers): Null")
def lcm(a, b):
    a1=a
    b1=b
    while(a%b!=0):
        h=a%b
        a=b
        b=h
    l=(a1*b1)//h
    print("\nLCM of the two numbers:",l)
while(True):
    a = input("Please Enter any Number: ")
    b = input("Please Enter any Number: ")
    if a=="Null" and b=="Null":
        print("Program closed")
        break
    else:
        lcm(int(a), int(b))