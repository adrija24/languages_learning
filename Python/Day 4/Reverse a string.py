"""Reverse a string"""
s=input("Enter a string: ")
s1=""
for i in range(len(s)-1,-1,-1):
    s1=s1+s[i]
print("After reverse: ",s1)