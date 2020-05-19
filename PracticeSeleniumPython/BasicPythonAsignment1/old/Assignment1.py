# Get a list of names from given file name.txt

# opens test.text file of the current directory
with open("../names.txt", "r") as file:
    for line in file:
        # reading each line from the file and removing extra space ans extra line and converted the word to lowercase
        namelist = (line.strip()).replace(" ", "_").lower()
        # print the eaach value in the console
        print(list(set(namelist)))
    f = open("namesupdate.txt", "w+")
    f.write(line)
    print(f)
    f.close()






