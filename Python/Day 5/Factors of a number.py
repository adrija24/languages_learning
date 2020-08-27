"""Factors of a number"""
def factor(n):
    for i in range (1,n+1):
        if(n%i==0):
            print(i)
print("Factor of 8: ")
factor(8)
print("Factor of 28: ")
factor(28)