"""Swapping o two numbers using function"""
def swap (a,b):
    a=a+b
    b=a-b
    a=a-b
    print("After swapping:\na =",a,"\nb =",b)
swap(5, -9)