n=int(input("Enter the range: "))
x=int(input("Enter the value of x: "))
f=1
s=0
for i in range (1,n+1):
    for j in range (1,i):
        f=f*j
    s=s+((-1)**(i+1))*(x**n)/f
    f=1
print("The summation of the series will be: ",s)