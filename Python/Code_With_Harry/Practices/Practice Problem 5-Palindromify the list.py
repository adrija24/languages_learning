# Practice Problem 5-Palindromify the List

try:
    lst = []
    total_num = int(input("Enter how many numbers you want to add: "))
    for i in range (0, total_num):
        main_num = int(input("Enter the number: "))
        lst.append(main_num)
    print(f"\nThe list given by you is: {lst}")
    new_list = []
    for num in lst:
        
# =============================================================================
#         # It gives us '10' but 10 is not a palindromic number. That's why I've changed it to give all palindromic numbers only
#         if num<=10:
#             new_list.append(num)
#         else:
#             while True:
#                 temp=num
#                 n=num
#                 s=0
#                 while n!=0:
#                     m = n%10
#                     n=n//10
#                     s=s*10+m
#                 if s==temp:
#                     new_list.append(num)
#                     break
#                 num+=1
# =============================================================================
           
        # This will give only the next palindromic numbers' list     
        while True:
            temp=num
            n=num
            s=0
            while n!=0:
                m = n%10
                n=n//10
                s=s*10+m
            if s==temp:
                new_list.append(num)
                break
            num+=1
    print(f"\nThe new next palindromic numbers' list is: {new_list}")     
except ValueError:
    pass