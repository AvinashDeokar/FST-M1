#tuple of numbers, iterate through it and print only those numbers which are divisible by 5

# Given tuple
#num_tuple = (10, 20, 33, 46, 55)
numtuple = list(input("Enter a sequence of comma separated values: ").split(", "))
print("Given list is ", numtuple)

print("Elements that are divisible by 5:")
for num in numtuple:
    if (int(num) % 5 == 0):
        print(num)