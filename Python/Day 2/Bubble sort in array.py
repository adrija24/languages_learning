"""Bubble sort in array"""
import array
a=array.array('i')
for i in range (0,5):
    n=int(input("Enter a number: "))
    a.insert(i,n)
for i in range (0,5):
    for j in range(0,5):
        if a[i]<a[j]:
            temp=a[i]
            a[i]=a[j]
            a[j]=temp
print("After sorting: ")
for i in range (0,5):
    print(a[i], end=" ")