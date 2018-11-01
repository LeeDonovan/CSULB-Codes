prompt = 'Input a non integer number ';
x = input(prompt);
if x <= 0
    while x <= 0
        x = input(prompt);
    end
    
end

y = input('Input a value greater than 2: ');

if y < 2
    while y <2    
        y = input('Invalid value please try again: ');
    end
    
end 
n = input('Input a respective number: ');

disp(RecFunc(x,y,n))
function [a]=RecFunc(x,y,n)
while n >0
    n = RecFunc((x-1)*(y-2));
    fprintf(n);
end

end

