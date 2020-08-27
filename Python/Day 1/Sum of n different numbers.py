"""Sum of n different number"""
n=int(input("Enter the value of n: "))
s=0
for i in range (1,n+1):
    a=int(input("Enter the number: "))
    s=s+a
print("Summation of the numbers: ",s)