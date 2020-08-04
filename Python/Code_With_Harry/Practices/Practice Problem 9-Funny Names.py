# Practice Problem 9-Funny Names

import random
from itertools import groupby, zip_longest
def nameCollector(n):
    lst = []
    for i in range(0, n):
        s = input("Enter name: ")
        lst.append(s)
    return lst

def unorder(a_list):
    groups = [list(g) for _, g in groupby(sorted(a_list))]
    groups.sort(key=len)
    flattened = [elem for group in zip_longest(*groups)
                 for elem in group if elem is not None]
    idx = -1
    end = -len(flattened)
    while idx > end:
        if flattened[idx] == flattened[idx-1]:
            reference = flattened.pop(idx)
            for j, element in enumerate(flattened):
                if not j and reference != element:
                    flattened.insert(0, reference)
                    break
                elif reference != element and reference != flattened[j+1]:
                    flattened.insert(j+1, reference)
                    break
        else:
            idx -= 1
    return flattened

if __name__ == "__main__":
        try:
            n = int(input("Enter number of friends: "))
            name_list = nameCollector(n)
            ls1 = []
            ls2 = []
            for item in name_list:
                ls = item.split()
                ls1.append(ls[0])
                test_list = [' '.join(ls[1:])] 
                for items in test_list:
                    s = items
                    ls2.append(s)
            new_ls1 = []
            new_ls2 = []
            i = 0
            for item in ls1:
                while True:
                    a = random.randint(0, n-1)
                    if i == a:
                        pass
                    else:
                        new_ls1.append(item)
                        new_ls2.append(ls2[a])
                        break
                i += 1
            print("\n\nThe funny reorganised names are following:\n")
            a_list = []
            for i in range(0, n):
                s_final = new_ls1[i] + " " + new_ls2[i]
                a_list.append(s_final)
            final_lst = unorder(a_list)
            for i in range(0, n):
                print(f"{i+1}. {final_lst[i]}")
        except ValueError:
            print("ValueError: Number of friends should be integer")