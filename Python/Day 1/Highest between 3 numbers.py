"""Highest between three numbers"""



"""process 1 : nested if-else"""
a=int(input("Enter number a: "))
b=int(input("Enter number b: "))
c=int(input("Enter number c: "))
if a>b:
    if a>c:
        print("Highest number: ",a)
    else:
        print("Highest number: ",c)
else:
    if b>a:
        if b>c:
            print("Highest number: ",b)
        else:
            print("Highest number: ",c)
            

"""process 2 : logical operator"""
x=int(input("Enter number x: "))
y=int(input("Enter number y: "))
z=int(input("Enter number z: "))
if x>y and x>z:
    print("Highest number: ",x)
else:
    if y>x and y>z:
        print("Highest number: ",y)
    else:
        print("Highest number: ",z)
        
        
"""process 3 : conditional or ternary operator"""
m=int(input("Enter number m: "))
n=int(input("Enter number n: "))
o=int(input("Enter number o: "))
ans=m if (m>n and m>o) else (n if (n>m and n>o) else o)
print("Highest number: ",ans)