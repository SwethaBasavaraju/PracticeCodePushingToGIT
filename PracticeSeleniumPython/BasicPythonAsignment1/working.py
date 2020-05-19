import logging
from datetime import datetime

start_time = datetime.now()

logging.basicConfig(
    filename="test.log",
    level=logging.INFO,
    format="%(asctime)s:%(levelname)s:%(message)s"
)
logging.info('User logged in')

names_list = list()

def name():
    lines = list()
    logging.info("opening the input file to read the file")
    with open('names.txt') as inputfile:
        for line in inputfile:
            logging.info("removing extra lines ,converting to lowercase and replacing space with string")
            lines.append(line.strip().replace(' ', '_').lower())
            logging.info("retrieving the names from names.txt file")
        return lines


logging.info('Function that append @pydemo.com to the returned names')


def myMap(n, a):
    namesList = name()
    print(namesList)
    domainname = '@pydemo.com'
    my_new_list = [x + domainname for x in namesList]
    return my_new_list


logging.info('calling the myMap Function and implemented map functionality')
appendedNames = myMap(myMap, names_list)
print(type(appendedNames))

logging.info('removing the duplicates present using set ')
duplicate_rem_list = (set(appendedNames))
print(duplicate_rem_list)

logging.info("opening the input file to write into the file")
with open("namesupdated.txt", "w") as outfile:
    outfile.write("\n".join(duplicate_rem_list))
    end_time = datetime.now()
logging.info('Time taken to execute in console Duration: {}'.format(end_time - start_time))
