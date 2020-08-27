"""Palindrome of a string"""

s = input("Enter the string: ")
s1 = s[::-1]
if s==s1:
    print("The string is a palindromic sequence")
else:
    print("The string is not a palindromic sequence")