"""Armstrong number checking"""

print("For closing the program type: Null")
def Armstrong(Number):
    s = 0
    n=Number
    while(Number != 0):
        Reminder = Number %10
        s = s+ (Reminder**3)
        Number = Number //10
    if n==s:
        print("It is an Armstrong Number")
    else:
        print("It is not an Armstrong Number")
while(True):
    Number = input("Please Enter any Number: ")
    if Number == "Null":
        print("Program closed")
        break
    else:
        Armstrong(int(Number))