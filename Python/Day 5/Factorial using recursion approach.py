def fact(n):
    if n==1:
        return 1
    else:
        return n*fact(n-1)
number=int(input("Enter the number: "))
print(fact(number))