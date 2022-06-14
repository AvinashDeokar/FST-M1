import pytest

@pytest.fixture
# Fixture for Activity 23 send the List of integer
def nbr_list():
    num = [1, 2, 3, 4, 5, 6, 7,8, 9, 10]
    return num

#Fixture for Activity 24 set Wallet amt to Zero
@pytest.fixture
def wallet():
    amt =0
    return amt
