#Recursive function to calculate the sum of numbers from 0 to 10

# Define function to calculate sum
def calSum(num):
    if num:
        # Recursive function call
        return num + calSum(num-1)
    else:
        return 0

# Call calSum() function and static parameter sent
res = calSum(10)

print("calculated sum of 10 is", res)

