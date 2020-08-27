"""Combining two array"""
import array
a=array.array('i')
b=array.array('i')
c=array.array('i')
for i in range (0,5):
    n=int(input("Enter a number for array 'a': "))
    a.insert(i,n)
for i in range (0,5):
    n=int(input("Enter a number for array 'b': "))
    b.insert(i,n)
c=a+b
print("\nAfter combining:")
for i in range (0,10):
    print(c[i], end=" ")