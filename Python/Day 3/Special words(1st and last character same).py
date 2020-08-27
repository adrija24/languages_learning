"""Special words(1st and last character same)"""
s=input("Enter a string: ")
if s[0]==s[len(s)-1]:
    print("It is a special word")
else:
    print("It is not a special word")
