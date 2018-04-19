def read_countries(file_name):
    result = []

    first_line = True
    
    for line in open(file_name):
        if first_line:
            first_line = False
            continue
        
        # read: CountryName=0, Capital=1, Latitude=2, Longitude=3, Code=4, Continent=5
        split_line = line.split(",")

        
        country = (split_line[0].strip(), split_line[1].strip(), split_line[2].strip()\
        , split_line[3].strip(), split_line[4].strip(), split_line[5].strip())
        result.append(country)

    return result

def main():
    all_countries = read_countries("C:\\Users\\Donald\\Desktop\\MasterCoder\\EXCEL-Mentee-Repository\\CECS174\\Labs\\Lab_12\\country-capitals.csv")
    choice = 0
    while choice !=5:
        print("Menu")
        print("1. Country and Captial")
        print("2. Coordinates of Country")
        print("3. Location of Country")
        print("4. Code of Country")
        print("5. Quit")
        choice = int(input("Enter a choice: "))
        if choice == 1:
            country_capital(all_countries)
        elif choice == 2:
            country_cords(all_countries)
        elif choice == 3:
            country_continent(all_countries)
        elif choice == 4:
            country_code(all_countries)
def country_code(all_countries):
    search_country = input("Enter a Country's Name: ")
    for i in all_countries:
        (country, capital, latitude, longitude, code, continet) = i
        if country == search_country:
            print_code(i)
def print_code(code):
    (country, capital, latitude, longitude, code, continet) = code
    print("{0} : {1}".format(country, code))

def country_capital(all_countries):
    search_country = input("Enter a Country's Name: ")
    for i in all_countries:
        (country, capital, latitude, longitude, code, continet) = i
        if country == search_country:
            print_country(i)
def country_continent(all_countries):
    search_country = input("Enter a Country's Name: ")
    for i in all_countries:
        (country, capital, latitude, longitude, code, continet) = i
        if country == search_country:
            print_continet(i) 
def print_continet(location):
    (country, capital, latitude, longitude, code, continet)= location
    print("{0} is located in {1}".format(country, continet))

def print_country(country):
    (country, capital, latitude, longitude, code, continet)= country
    print("The capital of {0} is {1}.".format(country, capital))

def country_cords(all_countries):
    search_country = input("Enter a Country's Name: ")
    for i in all_countries:
        (country, capital, latitude, longitude, code, continet) = i
        if country == search_country:
            print_cords(i)

def print_cords(cords):
    (country, capital, latitude, longitude, code, continet)= cords
    print("The coordinates of {0} are {1},{2}".format(country, latitude, longitude))
    

        
        
main()
