"""Extract 'n' characters from 'm'th position in reverse order"""
s = input("Enter string: ")
m = int(input("Enter position: "))
n = int(input("Enter no of characters left aside from back: "))
s1 = s[(m+n+1):(m-2):-1]
print(s1)