"""Reverse of a number"""
print("For closing the program type: Null")
def Reverse(Number):
    Reverse = 0
    while(Number != 0):
        Reminder = Number %10
        Reverse = (Reverse *10) + Reminder
        Number = Number //10
    return Reverse

while(True):
    Number = input("Please Enter any Number: ")
    if Number == "Null":
        print("Program closed")
        break
    else:
        print("\nReverse of entered number is =",Reverse(int(Number)))