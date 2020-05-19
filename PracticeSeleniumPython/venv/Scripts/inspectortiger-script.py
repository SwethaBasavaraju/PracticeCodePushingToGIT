#!C:\Users\Softvision.BCP\PycharmProjects\PracticeSeleniumPython\venv\Scripts\python.exe
# EASY-INSTALL-ENTRY-SCRIPT: 'it==1.0.0','console_scripts','inspectortiger'
__requires__ = 'it==1.0.0'
import re
import sys
from pkg_resources import load_entry_point

if __name__ == '__main__':
    sys.argv[0] = re.sub(r'(-script\.pyw?|\.exe)?$', '', sys.argv[0])
    sys.exit(
        load_entry_point('it==1.0.0', 'console_scripts', 'inspectortiger')()
    )
