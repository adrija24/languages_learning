"""Make string by alternate even character"""
s=input("Enter a string: ")
s1=""
for i in range (1, len(s), 2):
    s1=s1+s[i]
print(s1)