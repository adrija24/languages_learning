#Exercise 3: Find the hidden number

import random
i=0
level=int(input("Choose your level:\n1 for level 1\n2 for level 2\n3 for level 3\n4 for level 4\n5 for level 5\nPlease enter your choosen level number: "))
if level==1:
    n=random.randint(1, 20)
    print("\nYou have total 10 chances\nNumber of chances left: 10")
    print("\nYou have chosen level 1\nYou have to guess a number between 1 to 20")
    for i in range(1,11):
        x=int(input("Enter a number: "))
        if x>n:
            print("You have entered a larger number")
        elif x<n:
            print("You have entered a smaller number")
        else:
            print("You won\nNumber of attempt: ",i)
            break
        print("Number of chances left: ",10-i)
        i+=1
elif level==2:
    n=random.randint(1, 50)
    print("\nYou have total 10 chances\nNumber of chances left: 10")
    print("\nYou have chosen level 2\nYou have to guess a number between 1 to 50")
    for i in range(1,11):
        x=int(input("Enter a number: "))
        if x>n:
            print("You have entered a larger number")
        elif x<n:
            print("You have entered a smaller number")
        else:
            print("You won!!!\nNumber of attempt: ",i)
            break
        print("Number of chances left: ",10-i)
        i+=1
elif level==3:
    n=random.randint(1, 100)
    print("\nYou have total 10 chances\nNumber of chances left: 10")
    print("\nYou have chosen level 3\nYou have to guess a number between 1 to 100")
    for i in range(1,11):
        x=int(input("Enter a number: "))
        if x>n:
            print("You have entered a larger number")
        elif x<n:
            print("You have entered a smaller number")
        else:
            print("You won!!!\nNumber of attempt: ",i)
            break
        print("Number of chances left: ",10-i)
        i+=1
elif level==4:
    n=random.randint(1, 200)
    print("\nYou have total 10 chances\nNumber of chances left: 10")
    print("\nYou have chosen level 2\nYou have to guess a number between 1 to 200")
    for i in range(1,11):
        x=int(input("Enter a number: "))
        if x>n:
            print("You have entered a larger number")
        elif x<n:
            print("You have entered a smaller number")
        else:
            print("You won!!!\nNumber of attempt: ",i)
            break
        print("Number of chances left: ",10-i)
        i+=1
elif level==5:
    n=random.randint(1, 500)
    print("\nYou have total 10 chances\nNumber of chances left: 10")
    print("\nYou have chosen level 5\nYou have to guess a number between 1 to 500")
    for i in range(1,11):
        x=int(input("Enter a number: "))
        if x>n:
            print("You have entered a larger number")
        elif x<n:
            print("You have entered a smaller number")
        else:
            print("You won!!!\nNumber of attempt: ",i)
            break
        print("Number of chances left: ",10-i)
        i+=1
else:
    print("\nYou have selected wrong choice!!!")
if i==11:
    print("\nGame over!!!")
    print("The number was: ",n)