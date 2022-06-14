#Python dictionary that contains a bunch of fruits and their prices

fruit_shop = {"mango": 100, "grapes": 150, "guava": 200, "coco": 1964}
print(fruit_shop)

key_to_check = input("What are you looking for? ").lower()
if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")