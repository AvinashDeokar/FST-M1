#function sum() such that it can accept a list of elements and print the sum of all elements


# user defined Function
def calculate_sum(nums):
    sum = 0
    for number in nums:
        sum += int(number)
    return sum

# Define the list of numbers
numList = list(input("Enter a sequence of comma separated values: ").split(", "))

# Call the sum() function with numList as argument
result = calculate_sum(numList)

# Print result with message
print("The sum of all the elements is: " + str(result))