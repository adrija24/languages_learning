"""To insert a character at first"""
s=input("Enter a string: ")
s1=""
c=input("Enter character: ")
s1=s1+c
for i in range(0,len(s)):
    s1=s1+s[i]
print("After inserting a character at first: ",s1)