#Odd Even List

#num1 = [2, 5, 3, 4, 5, 6, 7, 8]
#num2 = [11, 12, 13, 14, 15, 16, 17, 18]
num3 = []
num1 = list(input("Enter a sequence of comma separated values: ").split(", "))
print("List 1 is", num1)
num2 = list(input("Enter a sequence of comma separated values: ").split(", "))
print("List 2 is", num2)

for num in num1:
    if (int(num) % 2) != 0:
        num3.append(num)

for num in num2:
    if (int(num) % 2) == 0:
        num3.append(num)

print("List 3 is", num3)