import pytest

# Fixture wallet() Set at Conftest.ini file

@pytest.mark.activity24
@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18), ])
def test_trans(wallet, earned, spent, expected):
    wallet = wallet + earned
    wallet = wallet - spent
    assert wallet == expected

