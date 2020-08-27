"""Division calculation"""
a=int(input("Enter marks in Physics: "))
b=int(input("Enter marks in Chemistry: "))
c=int(input("Enter marks in Mathematics: "))
av=(a+b+c)/3
if av>=60:
    print("First Division")
else:
    if av>=50:
        print("Second Division")
    else:
        if av>=40:
            print("Third Division")
        else:
            print("Failed")