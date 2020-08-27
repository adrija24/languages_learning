f = open("numbers_even_odd.txt", "w")
f.write('42,43,44\n')
f.close()
f = open("numbers_even_odd.txt")
line = f.readline()
parts = line.split(',')
numbers = [int(p) for p in parts]
e = 0
d = 0
for x in numbers:
    if((x)%2==0):
        e+=1
d = len(numbers)-e
print(f"Even = {e} and Odd = {d}")