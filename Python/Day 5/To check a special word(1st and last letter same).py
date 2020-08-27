"""To check a special word(1st and last letter same)"""

print("For closing the program type: Null")
def Special(string):
    if string[0]==string[len(string)-1]:
        print ("It is a special word(1st and last letter same)")
    else:
        print ("It is not a special word(1st and last letter not same)")
while(True):
    string = input("Please Enter any string: ")
    if string == "Null":
        print("Program closed")
        break
    else:
        Special(string)