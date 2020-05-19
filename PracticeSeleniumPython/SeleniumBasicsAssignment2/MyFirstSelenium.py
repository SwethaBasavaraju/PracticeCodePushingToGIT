from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.select import Select

# open the below url and do the following automation.
driver = webdriver.Chrome("C:/Users/Softvision.BCP/Downloads/chromedriver_win32/chromedriver.exe")
driver.get('https://www.rahulshettyacademy.com/AutomationPractice/')
driver.implicitly_wait(10)

# select radio button 2 and assert
radio2_button = driver.find_element_by_xpath("//div[@id='radio-btn-example']//label[2]//input[1]")
radio2_button.click()
assert radio2_button.is_enabled()

# Select option 2 from static option drop down and assert
select = Select(driver.find_element_by_id("dropdown-class-example"))
select.select_by_index(2)
selected_option = select.first_selected_option
selectedOp = selected_option.text
print(selected_option.text)
assert "Option2" == selectedOp, "Option2 not selected"

# Select Indonesia from suggestion drop down and assert
suggestive_dropdown = driver.find_element_by_id("autocomplete")
suggestive_dropdown.send_keys("Ind")
value_got_from_dropdown = suggestive_dropdown.get_attribute('value')
typed_value = "Indonesia"
assert typed_value == value_got_from_dropdown

# Select check box 1,3 and assert
checkBoxOption1 = driver.find_element_by_id("checkBoxOption1")
checkBoxOption1.click()
assert checkBoxOption1.is_selected()
checkBoxOption3 = driver.find_element_by_id("checkBoxOption3")
checkBoxOption3.click()
assert checkBoxOption3.is_selected()

# Enter your name in text box(under Switch To Alert Example)
driver.find_element_by_id("name").send_keys("Swetha")

# Click alert button and assert alert message should have your name in alert message.Then accept alert box.
alert_button = driver.find_element_by_id("alertbtn")
alert_button.click()
obj = driver.switch_to.alert
message = obj.text
print("Alert shows following message: " + message)
message.find("Swetha")
obj.accept()

# Enter your name in text box(under Switch To Alert Example)
driver.find_element_by_id("name").send_keys("Swetha")

# Click confirm button and assert alert message should have your name in alert message.Then cancel alert box.
alert_button = driver.find_element_by_id("alertbtn")
alert_button.click()
obj = driver.switch_to.alert
message = obj.text
print("Alert shows following message: " + message)
message.find("Swetha")
obj.dismiss()

# Click on open window button, and switch to new window (child window) and assert title. Then switch back to original
# window.
current_window = driver.window_handles[0]
current_window_title = driver.title
print(current_window_title)
parent_window = driver.find_element_by_id("openwindow")
parent_window.click()
child_window = driver.window_handles[1]
driver.switch_to.window(child_window)
child_window_title = driver.title
print(child_window_title)
assert current_window_title != child_window_title
driver.switch_to.window(current_window)

# Click on open tab button, and switch to new tab(child window) and assert title. Then switch back to original window.
present_tab = driver.window_handles[0]
present_tab_title = driver.title
actions = ActionChains(driver)
tab = driver.find_element_by_id('opentab').click()
tab_title = driver.title
child_tab = actions.key_down(Keys.CONTROL).key_down(Keys.TAB).key_up(Keys.TAB).key_up(Keys.CONTROL).perform()
child_tab_title = driver.title
driver.switch_to.window(present_tab)

# Interrogate the web table and get the rows which has 'selenium' in it. Get the count of courses having ‘selenium’
# as substring.
table_rows_xpath = driver.find_elements_by_xpath("//table[@id='product']/tbody/tr")
print(type(table_rows_xpath))
selenium_rows = []
for i in table_rows_xpath:
    textRow = i.text
    if "Selenium" in textRow:
        selenium_rows.append(textRow)
print(selenium_rows)
print("count of selenium substring ----->")
print(sum('Selenium' in s for s in selenium_rows))

# Enter your name in text box under 'Element Displayed Example'.
element_display_text = driver.find_element_by_id("displayed-text")
element_display_text.send_keys("Swetha")

# Click Show button and assert the text box is shown and assert text value with value that we entered
driver.find_element_by_id("show-textbox").click()
assert driver.find_element_by_id("show-textbox").is_displayed()
value_got_from_textbox = element_display_text.get_attribute('value')
typed_value = "Swetha"
assert typed_value == value_got_from_textbox

# Click Hide button and assert the text box is not shown
element_display_text = driver.find_element_by_id("displayed-text")
element_display_text.send_keys("Swetha")
driver.find_element_by_id("hide-textbox").click()
assert not element_display_text.is_displayed()

# Mouse hover the 'Mouse hover' button get the all the options and log in console
action = ActionChains(driver)
mouse_over_menu = driver.find_element_by_id("mousehover")
action.move_to_element(mouse_over_menu).perform()
mouse_over_option_values = driver.find_elements_by_xpath("//div[@class='mouse-hover-content']/a")
for i in mouse_over_option_values:
    print(i.text)

# Get the total count of iframe/frame/frameset present in current page.
print(len(driver.find_elements_by_xpath("//iframe" or "//frames" or "//frameset")))

# Switch to first iframe and get all list of urls in iframe and switch back to main window.
driver.switch_to.frame(0)
urls_list = list()
eles = driver.find_elements_by_xpath("//*[@href]")
for elem in eles:
    url = elem.get_attribute('href')
    urls_list.append(url)
print(urls_list)

# Close the main windows and all child windows.
driver.close()
driver.quit()
