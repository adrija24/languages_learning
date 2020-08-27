"""Add character at a particular position"""
s=input("Enter string: ")
c=input("Enter char: ")
n=int(input("Enter position: "))
s1=""
for i in range (0,n-1):
    s1=s1+s[i]
s1=s1+c
for i in range(n-1,len(s)):
    s1=s1+s[i]
print("After adding: ",s1)