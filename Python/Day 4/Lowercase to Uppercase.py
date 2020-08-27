"""Lowercase to Uppercase"""

s=input("Enter a string: ")
s1=""
for i in range (0, len(s)):
    if(s[i]>=chr(97) and s[i]<=chr(122)):
        s1=s1+chr(ord(s[i])-32)
    else:
        s1=s1+s[i]
print("After changing: ",s1)