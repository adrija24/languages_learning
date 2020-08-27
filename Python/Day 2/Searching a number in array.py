"""Searching a number in array"""
import array
a=array.array('i')
for i in range (0,5):
    n=int(input("Enter a number: "))
    a.insert(i,n)
a.tolist()
n1=int(input("Enter the number to search: "))
flag=0
for i in range (0,5):
    if i==n1:
        flag=1
if flag==0:
    print("Number not found")
else:
    print("Number found")