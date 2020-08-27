"""To check an Armstrong Number"""
n=int(input("Enter the number: "))
temp=n
s=0
while n!=0:
    m = n%10
    n=int(n/10)
    s=s+m*m*m
if s==temp:
    print("It is an Armstrong Number")
else:
    print("It is not an Armstrong Number")