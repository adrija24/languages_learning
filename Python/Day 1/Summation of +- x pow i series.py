"""Summation of 'x-x^2+x^3-....' """
n=int(input("Enter the range: "))
x=int(input("Enter the value of x: "))
s=0
for i in range (1,n+1):
    s = s+((-1)**(i+1))*(x**i)
print("Summation of this +- series: ",s)