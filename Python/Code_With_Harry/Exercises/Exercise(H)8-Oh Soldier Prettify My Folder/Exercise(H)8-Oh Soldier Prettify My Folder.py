import os
def soldier(path, format_change):
    os.chdir(path)
    i = 1
    files = os.listdir(path)
    
    for file in files:
        if os.path.splitext(file)[1] != format_change:
            os.rename(file, file.capitalize())
        
        elif os.path.splitext(file)[1] == format_change:
            os.rename(file, f"{i}{format_change}")
            i +=1

if __name__=='__main__':
    path = input("Please Enter Any Path: ")
#    format_unchange = input("Please enter the extension which you want to keep as such(with dot): ")
    format_change = input("Please enter the extension which you want to change(with dot): ")
    soldier(path, format_change)