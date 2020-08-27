"""Print ASCII value of each character"""
s = input("Enter a string: ")
print("ASCII values are:")
for i in range (0,len(s)):
    print (s[i],"-",ord(s[i]))