"""No of uppercase and lowercase in a string"""
s=input("Enter string: ")
m=0
n=0
for i in range(0,len(s)):
    if(s[i]>=chr(65)and s[i]<=chr(90)):
        m+=1
    if(s[i]>=chr(97)and s[i]<=chr(122)):
        n+=1
print("Total no of uppercase: ",m,"\nTotal no of lowwercase: ",n)