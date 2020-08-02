# Practice Problem 6-Guess the Number(Multiplayer)

try:
    player_number = int(input("Enter number of players: "))
    minimum_range = int(input("Enter the minimum value of the range: "))
    maximum_range = int(input("Enter the maximum value of the range: "))
    lst = []
    for i in range(0, player_number):
        import random
        print(f"\nChance for Player {i+1}...\nYou've to guess a number between {minimum_range} to {maximum_range}")
        n = random.randint(minimum_range, maximum_range)
        for j in range(minimum_range, maximum_range+1):
            x=int(input("Enter a number: "))
            if x>n:
                print("\nYou've entered a larger number. Please try again...")
            elif x<n:
                print("\nYou've entered a smaller number. Please try again...")
            else:
                print(f"\nYou won!!!\nNumber of attempt: {j-minimum_range+1}")
                lst.append(j-minimum_range+1)
                break
            j+=1
    min_attempt = min(lst)
    winner = 0
    for k in range(0, player_number):
        if lst[k] == min_attempt:
            winner = k+1
    print(f"\nThe winner is player {winner} !!!")
except ValueError:
    print("ValueError: Number of players, Minimum value of the range and Maximum value of the range should be integer")