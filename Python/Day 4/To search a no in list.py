"""To search a no in list"""

a=[2,3,-5,0,6]
flag=0
n = input("Enter no to search: ")
if(any(i for i in a)):
        flag =1
if flag==0:
    print("no")
else:
    print("yes")