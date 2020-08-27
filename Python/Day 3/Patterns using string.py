"""Patterns using string"""

s = input("Enter the string: ")

print("\nPattern 1:")
for i in range (1, len(s)+1):
    print (s[:i])

print("\nPattern 2:")
for i in range (0, len(s)+1):
    print (s[:(len(s)-i)])  
    
print("\nPattern 3:")
for i in range (0, len(s)+1):
    print (s[i:])  
    
print("\nPattern 4:")
for i in range (1, len(s)+1):
    print (s[(len(s)-i):]) 