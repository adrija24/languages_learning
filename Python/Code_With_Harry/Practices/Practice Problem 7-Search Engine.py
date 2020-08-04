# Practice Problem 7-Search Engine (From any URL)

def input_lower(s):
    s1 = s.lower()
    return s1

def text_lower(original_text):
    text_low = original_text.lower()
    return text_low

def sentence_making(text_final):
    raw = text_final.translate({ord(c):None for c in '\n\t\r'})
    sentence = raw.split('.')
    return sentence

def word_count(sentence_final, input_final):
    lst = []
    for item in sentence_final:
        words = item.split()
        score = 0
        for word in words:
            input_words = input_final.split()
            for item in input_words:
                if word == item:
                    score+=1
        lst.append(score)
    return lst

if __name__ == '__main__':
    import requests
    from bs4 import BeautifulSoup
    url = input("Enter the corresponding URL here from where you want to search words: ")
    print("*** Please note that you have to restart the program if you want to search words from a different URL ***")
    res = requests.get(url)
    html_page = res.content
    soup = BeautifulSoup(html_page, 'html.parser')
    text = soup.find_all(text=True)
    
    original_text = ''
    blacklist = [
    	'[document]',
    	'noscript',
    	'header',
    	'html',
    	'meta',
    	'head', 
    	'input',
    	'script',
        'style'
    	# there may be more elements you don't want, such as "style", etc.
    ]
    
    for t in text:
    	if t.parent.name not in blacklist:
    		original_text += '{} '.format(t)
    if original_text!="":
        while True:
            from sys import exit
            print("Press q to quit and c to continue")
            user_choice = ""
            while(user_choice!='q' and user_choice!='c'):
                user_choice = input()
    
                if user_choice == 'c':
                    s = input("Enter the word to search: ")
                    input_final = input_lower(s)
                    text_final = text_lower(original_text)
                    sentence_final = sentence_making(text_final)
                    sentence_copy = sentence_final[:]
                    num_lst = word_count(sentence_final, input_final)
                    sortedList = [SentScore for SentScore in sorted(zip(num_lst, sentence_copy), reverse=True) if SentScore[0] != 0]
                    print(f"\n{len(sortedList)} results found!")
                    no = 1
                    for score, item in sortedList:
                        print(f"\n{no}. \"{item}\": with the occurance of {score}")
                        no += 1
                elif user_choice == 'q':
                    exit()
            
                else:
                    print("Invalid input")
    else:
        import urllib
        url1 = url
        file = urllib.request.urlopen(url1)
        original_text = ""
        for line in file:
            decoded_line = line.decode("utf-8")
            original_text = original_text + decoded_line
        while True:
            from sys import exit
            print("Press q to quit and c to continue")
            user_choice = ""
            while(user_choice!='q' and user_choice!='c'):
                user_choice = input()
    
                if user_choice == 'c':
                    s = input("Enter the word to search: ")
                    input_final = input_lower(s)
                    text_final = text_lower(original_text)
                    sentence_final = sentence_making(text_final)
                    sentence_copy = sentence_final[:]
                    num_lst = word_count(sentence_final, input_final)
                    sortedList = [SentScore for SentScore in sorted(zip(num_lst, sentence_copy), reverse=True) if SentScore[0] != 0]
                    print(f"\n{len(sortedList)} results found!")
                    no = 1
                    for score, item in sortedList:
                        print(f"\n{no}. \"{item}\": with the occurance of {score}")
                        no += 1
                elif user_choice == 'q':
                    exit()
                else:
                    print("Invalid input")