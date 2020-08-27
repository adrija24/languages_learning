"""Pattern-2"""
n=int(input("Enter the range: "))
k=1
for i in range (1,n+1):
    for j in range (1,i+1):
        print(format(k,"<4"),end="")
        k=k+1
    print()