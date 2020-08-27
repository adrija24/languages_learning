import math
n=int(input("Enter the range: "))
s=0
for i in range(1, n+1):
    s=s+(math.sqrt(i))
print("Summation of the sqrt series: ",s)
    