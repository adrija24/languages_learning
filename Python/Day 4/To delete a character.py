"""To delete a character"""
s=input("Enter a string: ")
s1=""
c=input("Enter char to delete: ")
for i in range (0,len(s)):
    if(s[i]!=c):
        s1=s1+s[i]
print("After deleting: ",s1)