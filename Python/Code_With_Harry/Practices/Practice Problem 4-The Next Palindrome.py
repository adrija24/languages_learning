# Practice Problem 4-The Next Palindrome

try:
    total_num = int(input("Please enter, for how many numbers you want to find the 'Next Palindromic Number': "))
    for j in range (0, total_num):
        try:
            num=int(input("Enter the number: "))
            main_num = num
            while True:
                temp=num
                n=num
                s=0
                while n!=0:
                    m = n%10
                    n=n//10
                    s=s*10+m
                if s==temp:
                    print(f"The next palindromic number of {main_num} is {num}")
                    break
                num+=1
        except:
            print("ValueError: Number should be an integer")
except ValueError:
    print("ValueError: Number of finding should be an integer")