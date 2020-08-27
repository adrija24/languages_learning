"""HCF of two numbers"""

print("For closing the program type(for both numbers): Null")
def hcf(a, b):
    while(a%b!=0):
        h=a%b
        a=b
        b=h
    print("\nHCF of the two numbers:",h)
while(True):
    a = input("Please Enter any Number: ")
    b = input("Please Enter any Number: ")
    if a=="Null" and b=="Null":
        print("Program closed")
        break
    else:
        hcf(int(a), int(b))