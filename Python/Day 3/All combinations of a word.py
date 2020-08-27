"""All combinations of a word"""
s = input("Enter string: ")
print("All combinations of a word:")
for i in range(len(s)):
    x = s[i:]+s[:i]
    print(x)