"""Prime number between a range"""
n=int(input("Enter the range: "))
flag=0
for i in range (2,n+1):
    for j in range (2,i):
        if (i%j==0):
            flag=1
    if(flag==0):
        print(i)
    flag=0
