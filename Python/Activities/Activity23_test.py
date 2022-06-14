import pytest

#Fixture nbr_list() set at Conftest.ini file

@pytest.mark.activity23
def test_Addition23(nbr_list):
    num = 0
    for n in nbr_list:
        num = num + n

    assert num ==55
