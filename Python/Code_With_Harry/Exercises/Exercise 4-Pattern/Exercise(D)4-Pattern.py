#Exercise 4: Draw the pattern

n=int(input("Enter the required row number: "))
x=int(input("Enter the boolean number(1[True] or 0[False]): "))
if bool(x)==True:
    for i  in range (1,n+1):
        for j in range (i):
            print("*", end="")
        print()
else:
    for i  in range (1,n+1):
        for j in range (n-i+1):
            print("*", end="")
        print()