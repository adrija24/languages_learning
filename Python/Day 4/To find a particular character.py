"""To find a particular character"""
s=input("Enter string: ")
c=input("Enter char to find: ")
j=0
for i in range(0,len(s)):
    if(s[i]==c):
        j+=1
if j==0:
    print("Not found")
else:
    print(j," times found")