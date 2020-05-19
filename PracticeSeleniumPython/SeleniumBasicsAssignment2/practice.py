from datetime import time
from tkinter.tix import Select

import self as self
from selenium import webdriver

# open the below url and do the following automation.
from selenium.webdriver import ActionChains
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome("C:/Users/Softvision.BCP/Downloads/chromedriver_win32/chromedriver.exe")
driver.get('https://www.rahulshettyacademy.com/AutomationPractice/')
driver.implicitly_wait(10)

driver.switch_to.frame(0)
urls_list = list()
eles = driver.find_elements_by_xpath("//*[@href]")
for elem in eles:
    url = elem.get_attribute('href')
    urls_list.append(url)
print(urls_list)
count : urls_list
print(count)