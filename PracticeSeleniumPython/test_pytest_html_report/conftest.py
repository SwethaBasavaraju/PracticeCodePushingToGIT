import pytest


@pytest.fixture(params=[("username1", "pwd1"), ("username2", "pwd2"), ("username3", "pwd3"), ("username4", "pwd4")])
def dataparameters(request):
    return request.param

