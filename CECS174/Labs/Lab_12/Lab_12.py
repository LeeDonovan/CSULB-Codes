def read_countries(file_name):
    result = []

    first_line = True
    
    for line in open(file_name):
        if first_line:
            first_line = False
            continue
        
        # read: Name=0, Team=1, AB=3, HR=9
        split_line = line.split(",")
        # strip('"')
        
        country = (split_line[0].strip(), split_line[1].strip())
        result.append(country)

    return result

def main():
    all_countries = read_countries("C:\\Users\\Donald\\Desktop\\MasterCoder\\EXCEL-Mentee-Repository\\CECS174\\Labs\\Lab_12\\country-capitals.csv")
    
    keep_going = True
    while keep_going:
        country_name = input("Please enter a country's name or type 'quit': ")
        if country_name =="quit":
            keep_going = False
        else:
            for i in all_countries:
                (country, capital) = i
                if country == country_name:
                    print_country(i)
def print_country(country):
    (country, capital) = country
    print("The capital of {0} is {1}.".format(country, capital))
        
            
        
main()
