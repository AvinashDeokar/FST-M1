#program to create the multiplication table (from 1 to 10) of a number

number = int(input("Input a number: "))

# use for loop to iterate 10 times
for i in range(1,11):
    print(number, ' x ', i, ' = ', number*i)