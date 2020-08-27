"""Swapping of two numbers"""

"""Process 1"""
a=int(input("Enter number 'a': "))
b=int(input("Enter number 'b': "))
c=a
a=b
b=c
print("After swapping - \na = ",a,"\nb = ",b)

"""Process 2"""
x=int(input("Enter number 'x': "))
y=int(input("Enter number 'y': "))
x=x+y
y=x-y
x=x-y
print("After swapping - \nx = ",x,"\ny = ",y)
