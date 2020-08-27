"""Pattern-2 using while loop"""
n=int(input("Enter the range: "))
k=1
i=1
while i<=n:
    j=1
    while j<=i:
        print(format(k,"<4"),end="")
        k+=1
        j+=1
    i+=1
    print()