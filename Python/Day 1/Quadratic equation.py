"""Quadratic equation"""
import math
a=int(input("Enter value of a: "))
b=int(input("Enter value of b: "))
c=int(input("Enter value of c: "))
d=b*b-4*a*c
if d<0:
    print("Roots are imaginary")
elif d==0:
    x=-b/(2*a)
    print("The equation has only one real root, x: ",x)
else:
    x1 = (-b + math.sqrt(d)) / (2*a)
    x2 = (-b - math.sqrt(d)) / (2*a)
    print("The equation has two real roots, x1: ",x1,"and x2: ",x2)