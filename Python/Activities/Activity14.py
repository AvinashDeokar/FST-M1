# program that asks the user how many Fibonnaci numbers to generate and then generates them

def fibo(number):
    if number <= 1:
        return number
    else:
        return(fibo(number-1) + fibo(number-2))

nterms = int(input("Enter a number: "))

if nterms <= 0:
    print("Enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(nterms):
        print(fibo(i))