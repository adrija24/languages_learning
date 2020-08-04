#Exercise 3: Find the hidden number

n=23
print("You have total 9 chances\nNumber of chances left: 9\nYou have to guess a number between 1 to 50")
for i in range(1,10):
    x=int(input("Enter a number: "))
    if x>n:
        print("You have entered a larger number")
    elif x<n:
        print("You have entered a smaller number")
    else:
        print("You won\nNumber of attempt: ",i)
        break
    print("Number of chances left: ",9-i)
    i+=1
if i==10:
    print("Game over!!!")