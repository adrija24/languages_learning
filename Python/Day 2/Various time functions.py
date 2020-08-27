import time

"""Local time and date"""
print("Time and Date:")
print (time.strftime('%c',time.localtime()))


"""Local date only"""
print("\nDate:")
print (time.strftime('%d-%m-%y',time.localtime()))


"""Local day"""
print("\nDay:")
print (time.strftime('%A',time.localtime()))


"""Local month"""
print("\nMonth:")
print (time.strftime('%B',time.localtime()))


"""Local hour count"""
print("\nHour of the day:")
print (time.strftime('%H',time.localtime()))


"""Local weekday (Sunday as the first day of the week)"""
print("\nWeekday no.:")
print (time.strftime('%w',time.localtime()))


"""Local appropriate date representation"""
print("\nAppropriate date representation:")
print (time.strftime('%x',time.localtime()))


"""Local appropriate time representation"""
print("\nAppropriate time representation:")
print (time.strftime('%X',time.localtime()))