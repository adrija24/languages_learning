"""Add two strings"""

print("For closing the program type for each: Null")
def Add(s1,s2):
    s=s1+" "+s2
    print(s)
while(True):
    s1 = input("Please Enter any string: ")
    s2 = input("Please Enter any string: ")
    if s1=="Null" and s2=="Null":
        print("Program closed")
        break
    else:
        Add(s1,s2)