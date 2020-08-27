"""Tribonacci series"""

print("For closing the program type(for each numbers): Null")
def Tribonacci(a, b, c, n):
    print(a)
    print(b)
    print(c)
    for i in range (4, n+1):
        d=a+b+c
        print(d)
        a=b
        b=c
        c=d
while(True):
    a = input("Please Enter any Number: ")
    b = input("Please Enter any Number: ")
    c = input("Please Enter any Number: ")
    n = input("Please Enter the range: ")
    if a=="Null" and b=="Null" and c=="Null" and n=="Null":
        print("Program closed")
        break
    else:
        Tribonacci(int(a), int(b), int(c), int(n))