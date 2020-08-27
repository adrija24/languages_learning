"""Max and min number in array"""
import array
a=array.array('i')
for i in range (0,5):
    n=int(input("Enter a number: "))
    a.insert(i,n)
print("\nThe maximum number in the array will be: ")
print(max (a))
print("\nThe minimum number in the array will be: ")
print(min(a))