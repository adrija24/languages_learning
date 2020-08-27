"""Exact 'n' characters from 'm'th position"""

s = input("Enter the string: ")
m = int(input("Enter position: "))
n = int(input("Enter number of characters: "))
s1 = s[(m-1):]
s2 = s1[:n]
print(s2)