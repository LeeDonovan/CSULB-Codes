divisor =input ('Input a positive number: ');
dividen = input('Input another positive number: ');
while divisor < 0
    divisor = ('Invalid Input! Enter a new number: ');
end
while dividen < 0 
    dividen = ('Invalid Input! Enter a new number: ');
end
[x,y] = Divider(divisor,dividen);

function [quotient,remainder]= Divider(divisor,dividen)
quotient = floor(divisor/dividen);
remainder = mod(divisor,dividen);
end 







    

    
    
    
