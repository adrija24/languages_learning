# Practice Problem 8-Friend is Fraud

import random
def fraud_friend(num):
    wrong = random.randint(0, 9)
    table = []
    for i in range(1,11):
        table.append(i*num)
    table[wrong] = table[wrong] + random.randint(0, 10)
    return table
def checking_fn(table, num):
    for i in range(1, 11):
        if table[i-1] != i*num:
            return i 
def correct_table(num):
    table = [i*num for i in range(1,11)]
    return table
if __name__ == "__main__":
    num = int(input("Enter a number: "))
    myTable = fraud_friend(num)
    print(f"\nThe wrong table made by friend is: {myTable}")
    wrongIndex = checking_fn(myTable, num)
    print(f"\nThe table is wrong at index {wrongIndex}(counted from 1). The correct answer for index {wrongIndex} is {wrongIndex*num}")
    print(f"\nThe origianl table will be: {correct_table(num)}")