"""To insert a string in the middle of another string"""
s=input("Enter a string: ")
s1=input("Enter a string to be inserted in the middle: ")
s2=""
n=int(input("Enter position number: "))
for i in range(0,n-1):
    s2=s2+s[i]
for j in  range(0, len(s1)):
    s2=s2+s1[j]
for k in range(i+j-1,len(s)-n+2):
    s2=s2+s[k]
print(s2)