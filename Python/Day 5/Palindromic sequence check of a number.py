"""Palindromic sequence check of a number"""

print("For closing the program type: Null")
def Palindrome(Number):
    s = 0
    n=Number
    while(Number != 0):
        Reminder = Number %10
        s = (s *10) + Reminder
        Number = Number //10
    if n==s:
        print("It is a palindromic sequence")
    else:
        print("It is not a palindromic sequence")
while(True):
    Number = input("Please Enter any Number: ")
    if Number == "Null":
        print("Program closed")
        break
    else:
        Palindrome(int(Number))