"""Pattern-3"""
n=int(input("Enter the range: "))
for i in range (1,n+1):
    for j in range (n, i-1, -1):
        print(format(j,"<4"),end="")
    print()