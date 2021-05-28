# Exercise 9 - News Reading

import requests
import json
from decouple import config

news_api = config('News_API')

def speak(str):
    from win32com.client import Dispatch
    speak = Dispatch("SAPI.SpVoice")
    speak.Speak(str)

if __name__ == '__main__':
    speak("News for today..Lets begin")
    url = f"http://newsapi.org/v2/top-headlines?country=in&apiKey={news_api}"
    news = requests.get(url).text
    news_dict = json.loads(news)
    arts = news_dict['articles']
    for article in arts[:-1]:
        speak(article['title'])
        print(f"{article['title']}\n")
        speak("Moving on to the next news....")
    for article in arts[-1:]:
            speak(article['title'])
            print(article['title'])
            speak("Thanks for listening...")
    speak("Stay tuned for more updated news")