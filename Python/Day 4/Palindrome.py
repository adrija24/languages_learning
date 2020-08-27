"""Palindrome"""
s=input("Enter a string: ")
s1=""
for i in range (len(s)-1,-1,-1):
    s1=s1+s[i]
if s==s1:
    print("It is a palindromic sequence")
else:
    print("It is not a palindromic sequence")