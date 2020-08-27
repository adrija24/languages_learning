"""To append a character"""
s=input("Enter a string: ")
s1=""
c=input("Enter the character to append: ")
for i in range(0,len(s)):
    s1=s1+s[i]
s1=s1+c
print("After append: ",s1)