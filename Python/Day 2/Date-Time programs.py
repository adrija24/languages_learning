import time

"""To show a particular date in structure format"""
d1 = '24/4/1998'
d2 = time.strptime(d1, '%d/%m/%Y')
print("The date in structure format:\n",d2)


"""To print GMT"""
print("\nGMT time-date in structure format:\n",time.gmtime())


"""To show year, month, yearday, weekday seperately"""
print("\nLocal time-date in structure format:\n",time.localtime())


"""To print a tuple containing local time-zone & time-zone when DST(Daylight Standard Time) is in effect"""
print(time.tzname)


"""To print current date and time using asctime() (local time)"""
print("\nLocal time and date (using asctime()):\n",time.asctime(time.localtime()))


"""To print current date and time using asctime() (GMT)"""
print("\nGMT time and date (using asctime()):\n",time.asctime(time.gmtime()))


"""To convert into date format"""
import datetime
print("\nAfter converting into date format:\n",datetime.date(2020,7,10))


"""To convert into date format"""
print("\nAfter converting into date-time format:\n",datetime.datetime(2020,7,10,18,20,56))