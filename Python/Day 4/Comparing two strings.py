"""Comparing two strings"""

s1=input("Enter 1st string: ")
s2=input("Enter 2nd string: ")
flag=0
for i in range (0,len(s1)):
    if(s1[i]!=s2[i]):
        flag=1
if flag==0:
    print("Yes")
else:
    print("No")