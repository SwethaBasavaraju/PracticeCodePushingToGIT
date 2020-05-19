
import logging

logging.basicConfig(
    filename="../test.log",
    level=logging.INFO,
    format="%(asctime)s:%(levelname)s:%(message)s"
    )
domainname: str = "@pydemo.com"
logging.info("opening the input file to read the file")
with open("../names.txt", "r") as file:
    logging.info("removing extra line and replacing space with underscore and converting letter to lowercase")
    namelist = [line.strip().replace(" ", "_").lower()for line in file.readlines()]
    print(namelist)
    set(namelist)
    print(namelist)
    update_name = namelist
    f = open("namesupdate.txt", "w+")
    print(update_name)
    print(f)
    f.write(namelist.line)
    f.close()
    print(f)

