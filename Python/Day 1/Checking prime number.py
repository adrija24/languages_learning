n=int(input("Enter the number: "))
flag=0
for i in range (2,n):
    if(n%i==0):
        flag=1
if flag==0:
    print("It is a prime number")
else:
    print("It is not a prime number")
    