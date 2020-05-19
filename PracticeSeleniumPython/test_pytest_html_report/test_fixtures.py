import pytest


class TestDataParameters:
    @pytest.mark.usefixtures('dataparameters')
    def test_dataParameters_fixtures(self, dataparameters):
        print(dataparameters[0])
        print(dataparameters[1])