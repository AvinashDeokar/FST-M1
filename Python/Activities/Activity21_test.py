import pytest

def test_Addition():
    num1 = 10
    num2 = 15

    num3 = num1+num2
    assert num3 == 25

def test_Subtraction():
    num1 = 10
    num2 = 15

    num3 = num1-num2
    assert num3 == 5

def test_Multiplication():
    num1 = 10
    num2 = 5

    num3 = num1*num2
    assert num3 == 50


def test_Division():
    num1 = 15
    num2 = 15

    num3 = num1/num2
    assert num3 == 1