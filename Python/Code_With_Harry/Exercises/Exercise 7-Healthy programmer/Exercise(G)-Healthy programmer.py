#Exercise 7 - Healthy Programmer

from pygame import mixer
from datetime import datetime
from time import time

def musiconloop(file, stopper):
    mixer.init()
    mixer.music.load(file)
    mixer.music.play()
    while True:
        a = input()
        if a == stopper:
            mixer.music.stop()
            break
        
def log_now(msg):
    with open("mylog.txt", "a") as f:
        f.write(f"{msg} {datetime.now()}\n")
    
if __name__=='__main__':
    init_water = time()
    init_eyes = time()
    init_exercise = time()
    water_secs = 40*60
    eyes_secs = 30*60
    exercise_secs = 45*60
    
    while True:
        if time()-init_water > water_secs:
            print("It is time for drinking water. Enter 'Drank' to stop the alarm.")
            musiconloop("water.mp3", "Drank")
            init_water=time()
            log_now("Drank water at")
        if time()-init_eyes > eyes_secs:
            print("It is time for eye relaxation. Enter 'EyDone' to stop the alarm.")
            musiconloop("eyes.mp3", "EyDone")
            init_eyes=time()
            log_now("Eyes relaxation done at")
        if time()-init_exercise > exercise_secs:
            print("It is time for physical exercise. Enter 'ExDone' to stop the alarm.")
            musiconloop("physical.mp3", "ExDone")
            init_exercise=time()
            log_now("Physical exercise done at")