"""Try-Exception example: a/(b-c)"""

print("For closing the program type(for each numbers): Null")
def calc(a,b,c):
    return (a/(b-c))
while(True):
    a = input("Please Enter any Number: ")
    b = input("Please Enter any Number: ")
    c = input("Please Enter any Number: ")
    if a=="Null" and b=="Null" and c=="Null":
        print("Program closed")
        break
    else:
        try:
            print(calc(int(a), int(b), int(c)))
        except:
            print("Division by zero is not possible")