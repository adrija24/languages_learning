age=int(input("Enter your age: "))
if age<0:
    print("Please enter valid age")
elif age>0 and age<7:
    print("You are underaged for computer handling")
elif age>=7 and age<18:
    print("You are underaged for driving")
elif age==18:
    print("We will decide after physical checkup")
elif age>18 and age<=75:
    print("You can drive")
elif age>75 and age<=110:
    print("Driving can be risk at your age")
elif age>110:
    print("Please enter valid age")