# Practice Problem 3-Foods and Calories

food_list = list()
number_list = list()
new_list = list()
print("The foods will be ")
try:
    n = int(input("Enter the number of items you want to add in the list: "))
    try:
        for i in range(0, n):
            cal = int(input("Enter the calorie of the food: "))
            food = input("Enter the name of the food: ")
            number_list.append(cal)
            num=sorted(number_list)
            food_list.append(food)
        for i in num:
            # For taking each element from number_list and food_list according to their index number
            new_list.append(f"{food_list[number_list.index(i)]}-{number_list[number_list.index(i)]}")
        print(f"\nSorted list(from lower calorie to higher):\n{new_list}\n")
        #Reverse Process 1
        rev1_new_list = new_list[:]
        rev1_new_list.reverse()
        print(rev1_new_list)
        #Reverse Process 2
        rev2_new_list=new_list[::-1]
        print(rev2_new_list)
        #Reverse Process 3
        rev3_new_list = new_list[:]
        for i in range(len(rev3_new_list)//2):
            rev3_new_list[i], rev3_new_list[len(rev3_new_list)-i-1] = rev3_new_list[len(rev3_new_list)-i-1],rev3_new_list[i]
        print(rev3_new_list)
        ans = (rev1_new_list==rev2_new_list and rev1_new_list==rev3_new_list)
        if ans==True:
            print("\nAll the three methods give same results")
        else:
            print("\nYou haven't implemented the three methods correctly") 
    except ValueError:
        print("\nValueError: Calorie should be an integer and Food should be a string")
except ValueError:
    print("\nValueError: Number of food should be an integer")