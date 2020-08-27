"""Calculator"""
def Calculator(a,b,i):
    if i==1:
        print("Sum =",a+b)
    elif i==2:
        print("Difference =",a-b)
    elif i==3:
        print("Product =",a*b)
    elif i==4:
        print("Quotient =",a/b)
    else:
        print("Invalid choice")
Calculator(3, 5, 1)
Calculator(10, 20, 2)
Calculator(7, 3, 3)
Calculator(5, 4, 4)
Calculator(2, 3, 10)