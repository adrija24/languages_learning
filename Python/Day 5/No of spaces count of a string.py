"""No of spaces count of a string"""

print("For closing the program type: Null")
def Space(string):
    i=string.count(' ',1,len(string)+1)
    print("Number of spaces",i)
while(True):
    string = input("Please Enter any string: ")
    if string == "Null":
        print("Program closed")
        break
    else:
        Space(string)