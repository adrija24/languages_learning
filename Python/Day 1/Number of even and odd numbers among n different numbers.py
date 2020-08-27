"""Number of even and odd numbers among n different numbers"""
n=int(input("Enter the value of n: "))
e=0
o=0
for i in range (1,n+1):
    a=int(input("Enter a number: "))
    if (a%2==0):
        e=e+1
    else:
        o=o+1
print("Number of even numbers: ",e)
print("Number of odd numbers: ",o)
