"""Maximum and minimum in array using loop"""
import array
a=array.array('i')
for i in range (0,5):
    n=int(input("Enter a number: "))
    a.insert(i,n)
max=a[0]
min=a[0]
for i in range (0,5):
    if a[i]>max:
        max=a[i]
    if a[i]<min:
        min=a[i]
print("The max number in the array is: ",max)
print("The min number in the array is: ",min)