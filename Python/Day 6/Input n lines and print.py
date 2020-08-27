n = int(input("Enter no of lines: "))
f = open ("lines_input.txt", "w")
for i in range(0,n):
    s=input("Enter: ")
    f.write(s)
f.close()
f = open("lines_input.txt")
for i in range (0,n):
    f.readline()
f.close()