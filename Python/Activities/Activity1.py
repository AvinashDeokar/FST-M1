#program that asks the user to enter their name and their age.
name = input("Enter your name:-")
age = input("Enter your age:-")

cent = str((2022- int(age))+100)
print("your name is " + name)
print("Your age is " + age)
print("you will be 100 yrs old at " + cent)