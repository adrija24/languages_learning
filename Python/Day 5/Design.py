"""Design"""

print("For closing the program type: Null")
def Design(string):
    for i in range (1, len(string)+1):
        print (string[:i])
while(True):
    string = input("Please Enter any string: ")
    if string == "Null":
        print("Program closed")
        break
    else:
        Design(string)