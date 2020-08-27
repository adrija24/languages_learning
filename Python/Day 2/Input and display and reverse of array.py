"""Input and display and reverse of array"""
import array
a=array.array('i')
for i in range (0,5):
    n=int(input("Enter a number: "))
    a.insert(i,n)
a.reverse()
print("\nThe display of array will be like:")
for i in range (0,5): 
    print (a[i], end =" ") 