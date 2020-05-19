import sys, os
import pathlib
import logging
from datetime import datetime

logging.basicConfig(format='%(asctime)s - %(message)s', level=logging.INFO)
logging.info('User logged in')

from datetime import datetime

start_time = datetime.now()
# do your work here

logging.info('Opening the Input file and reading the data from it')
my_new_list = list()
domainname : str = '@pydemo.com'


def name():
    lines = list()
    with open('input.txt') as inputfile:
        for line in inputfile:
            lines.append(line.strip())
            return lines


logging.info('Function that append @pydemo.com to the returned names')

def myMap(n,a):
 namesList= name()
 print(namesList)
 string = '@pydemo.com'
 my_new_list = [x + string for x in namesList]
 return my_new_list



logging.info('calling the myap Function and implemented map functinality')

# 'calling the myap Function and implemented map functinality'
appendedNmaes = myMap(myMap,my_new_list)

print(type(appendedNmaes))
#'converting appened list to the lowe case'
l = [item.lower() for item in appendedNmaes]

# 'removing the duplicates present using set datastructure'
new_list = list(set(l))
print(new_list)


with open("output.txt", "w") as outfile:
    outfile.write("\n".join(new_list))

    end_time = datetime.now()
    logging.info('Time taken to execute in console Duration: {}'.format(end_time - start_time))
