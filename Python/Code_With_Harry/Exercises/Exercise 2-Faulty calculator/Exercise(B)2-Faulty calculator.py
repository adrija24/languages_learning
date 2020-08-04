#Exercise 2: Faulty calculator
a=int(input("Enter 1st number: "))
b=int(input("Enter 2nd number: "))
print("\ntype + for addition\n"
      "type - for subtraction\n"
      "type / for division\n"
      "type * for multiplication\n"
      "type ** to get raised to the power"
      )
s=input("Enter operation sign: ")
print("\nAns will be:")
if a==45 and b==3 and s=="*":
    print("45*3 = 555 (Faulty)")
elif a==56 and b==9 and s=="+":
    print("56+9 = 77 (Faulty)")
elif a==56 and b==6 and s=="/":
    print("56/6 = 4 (Faulty)")
elif s=="+":
    print(a,"+",b,"=",a+b)
elif s=="-":
    print(a,"-",b,"=",a-b)
elif s=="*":
    print(a,"*",b,"=",a*b)
elif s=="/":
    print(a,"/",b,"=",a/b)
elif s=="**":
    print(a,"**",b,"=",a**b)
elif s!="+" or s!="-" or s!="*" or s!="/" or s!="**":
    print("You have given wrong operation")