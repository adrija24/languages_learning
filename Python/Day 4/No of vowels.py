"""No of vowels"""
s=input("Enter a string: ")
j=0
for i in range (0,len(s)):
    if(s[i]=='a' or s[i]=='e' or s[i]=='i' or s[i]=='o' or s[i]=='u' or s[i]=='A' or s[i]=='E' or s[i]=='I' or s[i]=='O' or s[i]=='U'):
        j=j+1
print("Total no of vowels: ",j)