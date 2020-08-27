"""To reverse a number"""
n=int(input("Enter the number: "))
s=0
while n!=0:
    m = n%10
    n=n//10
    s=s*10+m
print("The reversed number: ",s)