# Exercise 11-Email Collector

import re
text = input("Enter any string: ")
emails = re.findall(r"[a-z0-9\.\-+_]+@[a-z0-9\.\-+_]+\.[a-z]+", text)

with open ("email_collector.txt", "a") as f:
    i=0
    f.write("The emails are listed below:\n\n")
    for ele in emails:
        i+=1
        f.write(f"email {i}:  {ele}\n")