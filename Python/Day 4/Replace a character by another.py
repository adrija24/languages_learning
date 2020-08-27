"""Replace a character by another"""
s=input("Enter a string: ")
s1=""
c1=input("Enter char to replace: ")
c2=input("Enter char to replace with: ")
for i in range (0,len(s)):
    if(s[i]==c1):
        s1=s.replace(c1,c2)
print("\nAfter replacing: ",s1)