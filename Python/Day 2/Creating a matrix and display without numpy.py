"""Creating a matrix and display without numpy"""

R1 = int(input("Enter the number of rows for 'a' matrix: ")) 
C1 = int(input("Enter the number of columns for 'a' matrix: ")) 
matrix1 = [] 
print("\nEnter the entries row-wise:") 
for i in range(R1):
	a =[] 
	for j in range(C1):
		a.append(int(input())) 
	matrix1.append(a) 
print("\nThe 'a' matrix will be like: ")
for i in range(R1): 
	for j in range(C1): 
		print(matrix1[i][j], end = " ") 
	print() 

R2 = int(input("Enter the number of rows for 'b' matrix: ")) 
C2 = int(input("Enter the number of columns for 'b' matrix: ")) 
matrix2 = [] 
print("\nEnter the entries row-wise:") 
for i in range(R2):
	b =[] 
	for j in range(C2):
		b.append(int(input())) 
	matrix2.append(b) 
print("\nThe 'b' matrix will be like: ")
for i in range(R2): 
	for j in range(C2): 
		print(matrix2[i][j], end = " ") 
	print()

R=0
C=0
matrix = []
for i in range(R):
    for j in range(C):
        matrix[i][j]=matrix1[i][j]+matrix2[i][j]
print("\nThe 'c' matrix will be like: ")
for i in range(R): 
	for j in range(C): 
		print(matrix[i][j], end = " ") 
	print()