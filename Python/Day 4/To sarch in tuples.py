"""To sarch in tuples"""
days=('Mon','Tue','Thu','Fri','Sat', 'Sun')
x=input("Enter a character to search: ")
for ele in days : 
    if x == ele : 
        res = True
        break
    else:
        res = False
print("Does tuple contain required value ? : " + str(res))                                                                                                                                                                                                                                            