#Write the data into a CSV file





# Import pandas
import pandas

# Create a Dictionary that will hold our data
data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"],
    "Password": ["pa$$word", "Carl13", "AMight"],
    "Passwor": ["pass$$0rd", "Chal13", "Might"]
}

# Create a DataFrame using that data
dataframe = pandas.DataFrame(data)

# Print the DataFrame
print(dataframe)

"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well the index property is set to false
"""
dataframe.to_csv("sample.csv", index=False)

#---------------------- Example---------------
# Structure our data as a dictionary
data = {
    "Vehicle Type": ["Car", "Car", "Bike"],
    "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
    "Model": ["Swift", "Corolla", "Thunderbird"]
}

# Create a new DataFrame using the data
dataframe = pandas.DataFrame(data)

# Write the data to a csv file
dataframe.to_csv("vehicles.csv")