# Practice Problem 1 - Age calculator

try:
    data = input("Enter your Age or your Birth Year: ")
    if len(data)>0 and len(data)<=3:
        age = int(data)
        try:
            if age>0 and age<100:
                print(f"You'll be 100 years old after {100-age} years")
            elif age<=0:
                print("Your age cannot be negative or eqaual to zero")
            elif age==100:
                print("You are 100 years old")
            elif age>100 and age<=150:
                print(f"Your age is {age-100} years more than 100")
            else:
                print("You seem to be the oldest person alive!!!")
        except:
            print("Age can't be negative")  
    elif len(data)>3:
        yob = int(data)
        try:
            if yob<2020:
                if (2020-yob)>150:
                    print("You seem to be the oldest person alive!!!")
                else:
                    print(f"Your age is {2020-data}")
            elif yob==2020:
                print("You have taken birth this year")
            else:
                print("You are not yet born!!!")
        except:
            print("Birth Year can't be negative")
except ValueError:
    print("ValueError: Your age or DOB both should be in integer")
while True:
    from sys import exit
    opt = ""
    while(opt!='q' and opt!='c'):
        opt = input("Enter q to quit and c to continue: ")
        if opt=='q':
            print("Quiting...")
            exit()
        elif opt=='c':
            opt_age = int(input("Enter an optional year: "))
            if opt_age>2020:
                print(f"Your age will be {opt_age-2020} in {opt_age}")
            elif opt_age==2020:
                print("You have taken birth this year")
            else:
                print("Birth Year can't be negative")
        else:
            print("Invalid input")