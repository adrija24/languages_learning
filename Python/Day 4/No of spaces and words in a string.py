"""No of spaces and words in a string"""

s=input("Enter a string: ")
j=0
for i in range (0,len(s)):
    if(s[i]==' '):
        j=j+1
print("No of spaces: ",j)
print("No of words: ",j+1)