#tell them if the number is an even or odd number.
print("Enter y to continue N to exit")
while(input() == "y"):
    nbr = int(input("Enter the Number"))
    if (nbr%2 > 0):
        print("Number is Odd " + str(nbr))
    else:
        print("Number is even"+ str(nbr))
    print("Enter y to continue N to exit")