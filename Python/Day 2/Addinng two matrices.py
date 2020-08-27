"""Addinng two matrices"""

import numpy as np
R = 3
C = 2
print("\nEnter the entries for matrix 'a' in a single line (separated by space): ") 
entries = list(map(int, input().split()))
matrix1 = np.array(entries).reshape(R, C)
print("\nMatrix 'a' will be: \n",matrix1)

print("\nEnter the entries for matrix 'b' in a single line (separated by space): ") 
entries = list(map(int, input().split())) 
matrix2 = np.array(entries).reshape(R, C) 
print("\nMatrix 'b' will be: \n",matrix2)

sum = [[0, 0],
       [0, 0],
       [0, 0]]

for i in range(len(matrix1)):
    for j in range(len(matrix1[0])):
        sum[i][j] = matrix1[i][j] + matrix2[i][j]
print("\nSummation will be: ")
for num in sum:
    print(num)