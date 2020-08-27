"""Proper from a string"""

s=input("Enter a string: ")
s1=""
i=0
s1=s1+s[0]
while s[i]!=" ":
    i+=1
s1=s1+"."+s[i+1]+"."
i+=1
while s[i]!=" ":
    i+=1
while i<=len(s)-1:
    s1=s1+s[i]
    i+=1
print(s1)