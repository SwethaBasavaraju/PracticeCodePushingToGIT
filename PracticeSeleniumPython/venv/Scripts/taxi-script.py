#!C:\Users\Softvision.BCP\PycharmProjects\PracticeSeleniumPython\venv\Scripts\python.exe
# EASY-INSTALL-ENTRY-SCRIPT: 'taxi==5.0','console_scripts','taxi'
__requires__ = 'taxi==5.0'
import re
import sys
from pkg_resources import load_entry_point

if __name__ == '__main__':
    sys.argv[0] = re.sub(r'(-script\.pyw?|\.exe)?$', '', sys.argv[0])
    sys.exit(
        load_entry_point('taxi==5.0', 'console_scripts', 'taxi')()
    )
