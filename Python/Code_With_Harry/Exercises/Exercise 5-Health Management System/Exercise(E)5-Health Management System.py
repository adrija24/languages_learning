#Exercise 5: Health Management System

import datetime
def getdate():
    return datetime.datetime.now()
def insert(x):
    if x==1:
        c=int(input("Enter 1 for 'Exercise' or 2 for 'Food': "))
        if c==1:
            value=input("Type here:\n")
            with open("Harry_Exercise.txt","a") as f:
                f.write(str([str(getdate())]) + ": " + value + "\n")
            print("Successfully written")
        elif c==2:
            value=input("Type here:\n")
            with open("Harry_Food.txt","a") as f:
                f.write(str([str(getdate())]) + ": " + value + "\n")
            print("Successfully written")
        else:
            print("You have entered wrong choice")
    elif x==2:
        c=int(input("Enter 1 for 'Exercise' or 2 for 'Food': "))
        if c==1:
            value=input("Type here:\n")
            with open("Rohan_Exercise.txt","a") as f:
                f.write(str([str(getdate())]) + ": " + value + "\n")
            print("Successfully written")
        elif c==2:
            value=input("Type here:\n")
            with open("Rohan_Food.txt","a") as f:
                f.write(str([str(getdate())]) + ": " + value + "\n")
            print("Successfully written")
        else:
            print("You have entered wrong choice")
    elif x==3:
        c=int(input("Enter 1 for 'Exercise' or 2 for 'Food': "))
        if c==1:
            value=input("Type here:\n")
            with open("Hammad_Exercise.txt","a") as f:
                f.write(str([str(getdate())]) + ": " + value + "\n")
            print("Successfully written")
        elif c==2:
            value=input("Type here:\n")
            with open("Hammad_Food.txt","a") as f:
                f.write(str([str(getdate())]) + ": " + value + "\n")
            print("Successfully written")
        else:
            print("You have entered wrong choice")
    else:
        print("You have entered wrong choice")
def retrieve(x):
    if x==1:
        c=int(input("Enter 1 for 'Exercise' or 2 for 'Food': "))
        try:
            if c==1:
                with open("Harry_Exercise.txt") as f:
                    for i in f:
                        print(i, end="")
            elif c==2:
                with open("Harry_Food.txt") as f:
                    for i in f:
                        print(i, end="")
            else:
                print("You have entered wrong choice")
        except FileNotFoundError:
            print("Wrong file or file path")
    elif x==2:
        c=int(input("Enter 1 for 'Exercise' or 2 for 'Food': "))
        try:
            if c==1:
                with open("Rohan_Exercise.txt") as f:
                    for i in f:
                        print(i, end="")
            elif c==2:
                with open("Rohan_Food.txt") as f:
                    for i in f:
                        print(i, end="")
            else:
                print("You have entered wrong choice")
        except FileNotFoundError:
            print("Wrong file or file path")
    elif x==3:
        c=int(input("enter 1 for 'Exercise' or 2 for 'Food': "))
        try:
            if c==1:
                with open("Hammad_Exercise.txt") as f:
                    for i in f:
                        print(i, end="")
            elif c==2:
                with open("Hammad_Food.txt") as f:
                    for i in f:
                        print(i, end="")
            else:
                print("You have entered wrong choice")
        except FileNotFoundError:
            print("Wrong file or file path")
    else:
        print("You have entered wrong choice")
print(":::Health Management System:::")
a=int(input("Press 1 for 'Lock the value' or 2 for 'Retrieve': "))
if a==1:
    b = int(input("Press 1 for 'Harry' or 2 for 'Rohan' or 3 for 'Hammad': "))
    insert(b)
elif a==2:
    b = int(input("Press 1 for 'Harry' or 2 for 'Rohan' or 3 for 'Hammad': "))
    retrieve(b)
else:
    print("You have entered wrong choice")