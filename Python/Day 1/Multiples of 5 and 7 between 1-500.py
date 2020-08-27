"""Multiples of 5 and 7 between 1-500"""
print("The numbers are:")
for i in range (1,500):
    if (i%5==0 and i%7==0):
        print(i)