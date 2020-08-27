""" * Pattern using while loop"""
n=int(input("Enter the range: "))
i=1
while i<=n:
    j=1
    while j<=i:
        print("*",end="")
        j+=1
    i+=1
    print()
    
