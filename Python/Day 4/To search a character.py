"""To search a character"""
s=input("Enter a string: ")
x=input("Enter a character to search: ")
'a' in s
for ele in s : 
    if x == ele : 
        res = True
        break
    else:
        res = False
print("Does tuple contain required value ? : " + str(res))