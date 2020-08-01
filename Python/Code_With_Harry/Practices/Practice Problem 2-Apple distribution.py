# Practice Problem 2 - Apple Distribution

try:    
    n = int(input("Number of apples given to Harry: "))
    mn = int(input("Minimum range: "))
    mx = int(input("Maximum range: "))
    if mn < mx:
        for i in range (mn, mx+1):
            try:
                if n%i == 0:
                    print(f"\n{i} is a divisor of {n}")
                    print(f"Each student will get {n//i} number of apples")
                else:
                    print(f"\n{i} is not a divisor of {n}")
                    if n%i > i/2:
                        print(f"Harry needs {i-(n%i)} apples for equal distribution")
                        print(f"After taking {i-(n%i)} apples, each student will get {(n+(i-(n%i)))/i} number of apples")
                    elif n%i < i/2:
                        print(f"Harry needs to return {n%i} apples for equal distribution")
                        print(f"After returning {n%i} apples, each student will get {(n-(n%i))//i} number of apples")
                    else:
                        print(f"Harry can take or return {n%i} number of apples")
                        print(f"After taking {n%i} number of apples, each student will get {(n+(n%i))//i} number of apples\nor, After returning {n%i} apples, each student will get {(n-(n%i))//i} number of apples")
            except ZeroDivisionError:
                print("Minimum range can not be zero. Minimum one student is required for distribution")
    elif mn == mx:
        print("\nMinimum range and Maximum are set to be equal")
        try:
            if n%mn == 0:
                print(f"\n{mn} is a divisor of {n}")
                print(f"Each student will get {n//mn} number of apples")
            else:
                print(f"\n{mn} is not a divisor of {n}")
                if n%mn > mn/2:
                    print(f"Harry needs {mn-(n%mn)} apples for equal distribution")
                    print(f"After taking {mn-(n%mn)} apples, each student will get {(n+(mn-(n%mn)))//mn} number of apples")
                elif n%mn < mn/2:
                    print(f"Harry needs to return {n%mn} apples for equal distribution")
                    print(f"After returning {n%mn} apples, each student will get {(n-(n%mn))//mn} number of apples")
                else:
                    print(f"Harry can take or return {n%mn} number of apples")
                    print(f"After taking {n%mn} number of apples, each student will get {(n+(n%mn))//mn} number of apples\nor, After returning {n%i} apples, each student will get {(n-(n%i))//i} number of apples")
        except ZeroDivisionError:
            print("Minimum range can not be zero. Minimum one student is required for distribution")
    else:
        print("Maximum range should be greater than Minimum range")
            

except ValueError:
    print("\nNumber of apples, Maximum range or Minimum range should be integer")