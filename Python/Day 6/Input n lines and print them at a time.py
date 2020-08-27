n = int(input("Enter no of lines: "))
f = open ("lines_input_print.txt", "w")
for i in range(0,n):
    s=input("Enter: ")
    f.write(s)
f.close()
f = open("lines_input_print.txt")
f.read()
f.close()