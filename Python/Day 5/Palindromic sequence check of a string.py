"""Palindromic sequence check of a string"""

print("For closing the program type: Null")
def Palindrome(string):
    s=string
    if s==string[::-1]:
        print("It is a palindromic sequence")
    else:
        print("It is not a palindromic sequence")
while(True):
    string = input("Please Enter any string: ")
    if string == "Null":
        print("Program closed")
        break
    else:
        Palindrome(string)