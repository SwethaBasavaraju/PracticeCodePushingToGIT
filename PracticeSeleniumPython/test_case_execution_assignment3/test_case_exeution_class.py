import pytest


@pytest.mark.regression
def test_cognizant_demo1():
    print('cognizant pytest test case1 ')


def test_cognizant_demo2():
    print('cognizant pytest test case2')


@pytest.mark.xfail
def test_cognizant_demo3():
    print('cognizant pytest test case3')


@pytest.mark.skip
def test_soft_vision_demo1():
    print('soft vision pytest test case1')


def test_soft_vision_demo2():
    print('soft vision pytest test case2')


def test_soft_vision_demo3():
    print('soft vision pytest test case3')


@pytest.mark.regression
def test_spi_demo1():
    print('spi pytest test case1')


def test_spi_demo2():
    print('spi pytest test case2')


def test_spi_demo3():
    print('spi pytest test case3')


def test_home_demo1():
    print('home pytest test case1')
